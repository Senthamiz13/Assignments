import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { MenuComponent } from './menu/menu.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { RestaurantListService } from './restaurant-list.service';
import { SmenuComponent } from './smenu/smenu.component';
import { ConfirmationPageComponent } from './confirmation-page/confirmation-page.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    UserComponent,
    MenuComponent,
    RestaurantComponent,
    SmenuComponent,
    ConfirmationPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [RestaurantListService],
  bootstrap: [AppComponent]
})
export class AppModule { }
