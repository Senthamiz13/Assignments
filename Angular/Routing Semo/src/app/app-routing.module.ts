import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DepartmentDetailComponent } from './department-detail/department-detail.component';
import { DepartmentComponent } from './department/department.component';
import { EmployeeComponent } from './employee/employee.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
  //{path:'', redirectTo: '/departments', pathMatch: 'prefix'},
  {path: 'departments', component: DepartmentComponent},
  {path: 'departments/:id', component: DepartmentDetailComponent},
  {path: 'employees', component: EmployeeComponent},
  {path: '**', component: PageNotFoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

//export const routingComponents = [DepartmentComponent,EmployeeComponent]