import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class AdvertisementServiceService {

  //array that stores all advertisements
  public AdList:any = [
    {"title":"Mobile for sale",
    "name":"Senthamiz",
    "category":"Mobile",
    "description":"Nokia Lumia 540"},

    {"title":"Furniture for sale",
    "name":"Senthamiz",
    "category":"Furniture",
    "description":"Living room sofa"}
  ] 

  constructor() { }

  //get entire AdList array from any component
  getList(){
    return this.AdList;
  }

  //insert element into AdList array from any component
  putList(list:Object){
    this.AdList.push(list);
    console.log(this.AdList);
  }

  //deleting element from the AdList array
  removeList(i:number){
    this.AdList.splice(i,1); 
  }

  //get specific element with index from AdList array 
  getspecificelement(index:number){
    return this.AdList[index];
  }

  //replace a specific element in AdList array at index
  replace(index:number,element:Object){
    this.AdList.splice(index,1,element);
  }
}
