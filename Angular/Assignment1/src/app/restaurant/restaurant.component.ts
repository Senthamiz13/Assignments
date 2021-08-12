import { Component, EventEmitter, OnInit, Output, ViewChild } from '@angular/core';
import { RestaurantListService } from '../restaurant-list.service';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {

  /*public restaurentList:any = [
    {"name": "Banana Leaf", "menu": ["parotta","idly","vada"]},
    {"name": "Minto mint", "menu": ["dosa","vadacurry","cc"]}
  ];*/
  
  //empty array for declaration
  public restaurentList:any = [];

  //creating a instance of RestaurantListService
  constructor(private _restaurantService:RestaurantListService) { }

  //initializing restaurentList with elements 
  ngOnInit(): void {
    this.restaurentList = this._restaurantService.getRestaurantList();
    //console.log(this.restaurentList);
  }

  //add elements to restaurentList
  addRestaurantList(name:String, item:string){
    this._restaurantService.putRestaurantList(name,item);
  }

  //remove elements from restaurentList
  removeRestaurant(i:number){
    this._restaurantService.removeRestaurant(i);
  }
  
/*
  onAddList(name:String, item:string){

    let sitem = item.split(',');

    this.restaurentList.push({
      "name": name ,
      "menu": sitem});
      console.log(this.restaurentList);
    }
  
  removeRestaurent(i:number){
    this.restaurentList.splice(i,1);
  }
*/
}
