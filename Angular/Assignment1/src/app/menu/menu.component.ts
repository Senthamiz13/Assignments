import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  //
  public menulist:any = [];

  constructor() { }

  ngOnInit(): void {
  }
  
  addToList(item: string){
    if(item != ''){
      this.menulist.push(item);
    }
  }
  removeItem(index : number){
    this.menulist.splice(index,1);
  }

}
