import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdduserComponent } from './adduser/adduser.component';
import { DeleteuserComponent } from './deleteuser/deleteuser.component';
import { NewsApiHeadlinesComponent } from './news-api-headlines/news-api-headlines.component';
import { NewsApiSearchComponent } from './news-api-search/news-api-search.component';
import { NewsApiComponent } from './news-api/news-api.component';
import { NutritionApiComponent } from './nutrition-api/nutrition-api.component';
import { ReactiveFormsComponent } from './reactive-forms/reactive-forms.component';
import { SearchuserComponent } from './searchuser/searchuser.component';
import { StudentApiComponent } from './student-api/student-api.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';

const routes: Routes = [
  {path:'',redirectTo: '/adduser', pathMatch:'full'},
  {path:'adduser',component:AdduserComponent},
  {path:'newsapi',component:NewsApiComponent,children:[{path:'',redirectTo:'headlines',pathMatch:'full'},{path:'headlines',component:NewsApiHeadlinesComponent},{path:'search',component:NewsApiSearchComponent}]},
  {path:'deleteuser',component:DeleteuserComponent},
  {path:'updateuser',component:UpdateuserComponent},
  {path:'searchuser',component:SearchuserComponent},
  {path:'nutritionapi',component:NutritionApiComponent},
  {path:'reactiveforms',component:ReactiveFormsComponent},
  {path:'studentapi',component:StudentApiComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
