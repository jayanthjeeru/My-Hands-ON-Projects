import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { DeleteuserComponent } from './deleteuser/deleteuser.component';
import { UpdateuserComponent } from './updateuser/updateuser.component';
import { SearchuserComponent } from './searchuser/searchuser.component';
import { AdduserComponent } from './adduser/adduser.component';
import { NewsApiComponent } from './news-api/news-api.component';
import { NewsApiHeadlinesComponent } from './news-api-headlines/news-api-headlines.component';
import { NewsApiSearchComponent } from './news-api-search/news-api-search.component';
import { NutritionApiComponent } from './nutrition-api/nutrition-api.component';
import { ReactiveFormsComponent } from './reactive-forms/reactive-forms.component';
import { StudentApiComponent } from './student-api/student-api.component';


@NgModule({
  declarations: [
    AppComponent,
    DeleteuserComponent,
    UpdateuserComponent,
    SearchuserComponent,
    AdduserComponent,
    NewsApiComponent,
    NewsApiHeadlinesComponent,
    NewsApiSearchComponent,
    NutritionApiComponent,
    ReactiveFormsComponent,
    StudentApiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
