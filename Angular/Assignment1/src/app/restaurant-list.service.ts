import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RestaurantListService {
  
  //default added list
  public restaurantList:any = [
    {"name": "Banana Leaf", "menu": ["Briyani","Chapathi","Panner Butter Masala"]},
    {"name": "Akshaya Restaurant", "menu": ["Fried Rice","Parotta","Gobi Manjurian"]}];

  constructor() {}

  // get method to get restaurantList
  getRestaurantList(){
    return this.restaurantList;
  }

  // put method to add to restaurantList
  putRestaurantList(name:String, item:string){
    let sitem = item.split(',');  // spilt the input string at , add create a list slist

    this.restaurantList.push({"name": name ,"menu": sitem});
      //console.log(this.restaurantList);  /// push the name of the restaurent and menu into restaurent list
  }

  // remove method to remove from restaurantList
  removeRestaurant(i:number){
    this.restaurantList.splice(i,1); //splicing to delete the selected item
  }
}
