import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent implements OnInit {


  departments = [
    {"id":1, "name": "crime"},
    {"id":2, "name": "civil"},
    {"id":3, "name": "norcotics"}
  ]

  constructor(private router:Router,private route: ActivatedRoute) { }

  ngOnInit(): void {
  }

  onselect(department:any)
  {
    //this.router.navigate(['/departments',department.id]);
    this.router.navigate([department.id],{relativeTo:this.route});
  }
}
