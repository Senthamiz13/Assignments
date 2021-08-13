import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AdvertisementServiceService } from '../advertisement-service.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {

  public list:any = [];

  constructor(private formservice:AdvertisementServiceService,
    private router:Router,private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.list = this.formservice.getList();
    console.log(this.list);
  }
  
  //removing element at index i
  removead(i:number){
    this.formservice.removeList(i);
  }

  //routing to editing component
  editad(i:number){
    console.log(i);
    this.router.navigate([i],{relativeTo:this.route});
  }

}
