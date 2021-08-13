import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { AdvertisementServiceService } from '../advertisement-service.service';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  public list:any;
  public index = 0;
  //public name = this.list.
  public adForm!: FormGroup;
  public categories = ["Furniture","Hardware","Mobile"]

  public submitted =false;

  constructor(private _fb:FormBuilder,private formservice:AdvertisementServiceService,
    private router:Router,private route: ActivatedRoute) { }

  ngOnInit(): void {

      this.index = Number (this.route.snapshot.paramMap.get('index'));

      //on init getting array element from servivce and assigning to a local variable
      this.list = this.formservice.getspecificelement(this.index);
      //console.log(this.list);
      //console.log(this.list.title);

      //creating form group  with elements from list and applying validators
      this.adForm = this._fb.group({
      title:[this.list.title,[Validators.required]],
      name:[this.list.name,[Validators.required]],
      category:[this.list.category,[Validators.required]],
      description:[this.list.description,[Validators.required]]
  
    });
  }

  //replace 
  onsubmit(){
    this.formservice.replace(this.index,this.adForm.value);
    this.router.navigateByUrl("/table");
  }
}
