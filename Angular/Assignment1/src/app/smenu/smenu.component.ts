import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RestaurantListService } from '../restaurant-list.service';

@Component({
  selector: 'app-smenu',
  templateUrl: './smenu.component.html',
  styleUrls: ['./smenu.component.css']
})
export class SmenuComponent implements OnInit {

  //creating empty restaurentList
  public restaurentList:any = [];
  //creating restaurentName
  public restaurentName:any;
  //creating result
  public result:any;

  // creating empty cart array 
  public cart:any =[];

  // creating instances for RestaurantListService and ActivatedRoute and Router
  constructor(private _restaurantService:RestaurantListService, 
    private route: ActivatedRoute, private route1: Router) { }

  //on initialization get snapshot from url 
  ngOnInit(): void {
    this.restaurentName = this.route.snapshot.paramMap.get('name');
    this.restaurentList = this._restaurantService.getRestaurantList();
    
    //console.log(this.restaurentList);

    this.result = this.restaurentList.find((x: { name: any; }) => x.name == this.restaurentName).menu;

    console.log(this.result);
  }

  //public menu = this.restaurentList.find((x: { name: any; }) => x.name == this.restaurentName).menu;

  //myObj = this.restaurentList.find((obj: { prop: string; }) => obj.prop === this.restaurentName);

  // adding clicked items to cart 
  addtocart(item:any){
    this.cart.push(item);
    //console.log(this.cart);
  }


}
