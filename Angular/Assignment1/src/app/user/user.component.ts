import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RestaurantListService } from '../restaurant-list.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  //creating a empty array to get elements
  public restaurentList:any = [];

  //creating instances of RestaurantListService and Router and ActivatedRoute
  constructor(private _restaurantService:RestaurantListService, 
    private router:Router,private route: ActivatedRoute) { }

  //getting getRestaurantList from employee service
  ngOnInit(): void {
    this.restaurentList = this._restaurantService.getRestaurantList();
    //console.log(this.restaurentList);
  }

  //onclicking restaurants list in the page
  onClick(restaurant:any){
    this.router.navigate([restaurant.name],{relativeTo:this.route});
  }
}
