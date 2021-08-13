import { Component, OnInit } from '@angular/core';
import { FormArray, FormControl, FormGroup, Validators } from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { AdvertisementServiceService } from '../advertisement-service.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  public categories = ["Furniture","Hardware","Mobile"]

  public adForm!: FormGroup;
  public submitted = false;
  public confirmed = false;

  //creating an instance of FormBuilder and AdvertisementServiceService
  constructor(private _fb:FormBuilder, private formservice:AdvertisementServiceService) { }

  ngOnInit(): void {
    //creating form group and assigning form control
    this.adForm = this._fb.group({
      title:["",[Validators.required]],
      name:["Default Name",[Validators.required]],
      category:["",[Validators.required]],
      description:["",[Validators.required]]
    });

  }

  //making submit to enable confirmation page
  onsubmit(){
    //console.log(this.adForm.value);
    //console.log(typeof(this.adForm.value));
    //this.formservice.putList(this.adForm.value);
    this.submitted = true;
  }

  //pushing data to array in advertisement Service
  confirm(){
    this.confirmed = true;
    this.formservice.putList(this.adForm.value);
  }

  //canceling on confirmation page
  cancel(){
    this.submitted = false;
  }

}
