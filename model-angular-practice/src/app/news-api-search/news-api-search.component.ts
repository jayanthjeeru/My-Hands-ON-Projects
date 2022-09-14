import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NewsModel } from '../news-model';

@Component({
  selector: 'app-news-api-search',
  templateUrl: './news-api-search.component.html',
  styleUrls: ['./news-api-search.component.css']
})
export class NewsApiSearchComponent implements OnInit {

  
  constructor(private http:HttpClient) { }

  articles:NewsModel[]=[];

 

  search(category:any){
    this.http.get(`https://newsapi.org/v2/top-headlines?q=${category}&apiKey=650d4134f225403a8d87033ed10eb1eb`).subscribe((i)=>{
      
     let x=JSON.parse(JSON.stringify(i))//to convert string to json
    this.articles=x.articles})
  }
 
  ngOnInit(): void {
  }

}
