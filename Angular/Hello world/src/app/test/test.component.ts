import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';


@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  @Input() 
  public parentData: any;

  @Output()
  public childEvent = new EventEmitter();

  public newname = "mani amnii";

  public date = new Date;

  public person = {
    firstName: "bujiku",
    lastName: "bujik"
  }

  constructor() { }

  ngOnInit(): void {
  }

  fireevent(){
    this.childEvent.emit('hey senthamizhan');
  }

}
