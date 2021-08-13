import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';

@Component({
  selector: 'app-department-detail',
  templateUrl: './department-detail.component.html',
  styleUrls: ['./department-detail.component.css']
})
export class DepartmentDetailComponent implements OnInit {

  public departmentid: any;

  constructor(private route: ActivatedRoute, private route1: Router) {}

  ngOnInit(): void {
    let id = this.route.snapshot.paramMap.get('id');
    this.departmentid = id;

    //this.route.paramMap.subscribe((param: ParamMap) => {let id = parseInt(param.get)});
}

goprevious(){
  let previousid = this.departmentid--;
  this.route1.navigate(['/departments',previousid]);
}

gonext(){
  let nextid = this.departmentid++;
  this.route1.navigate(['/departments',nextid]);
}

}
