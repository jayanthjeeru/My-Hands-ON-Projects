import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookingComponent } from './components/booking/booking.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [
  {path:'',redirectTo:'home',pathMatch:'full'},
  {path:'home',component:HomeComponent},
  {path:'booking',component:BookingComponent},
  {path:'**',redirectTo:'home'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
