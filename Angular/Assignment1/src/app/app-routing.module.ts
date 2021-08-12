import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { ConfirmationPageComponent } from './confirmation-page/confirmation-page.component';
import { SmenuComponent } from './smenu/smenu.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
  {path: 'admin', component: AdminComponent},
  {path: 'user', component: UserComponent},
  {path: 'user/:name', component: SmenuComponent},
  {path: 'confirmation', component: ConfirmationPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
