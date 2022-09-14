import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NewsModel } from '../news-model';

@Component({
  selector: 'app-news-api-headlines',
  templateUrl: './news-api-headlines.component.html',
  styleUrls: ['./news-api-headlines.component.css']
})
export class NewsApiHeadlinesComponent implements OnInit {

  constructor(private http:HttpClient) { }

  articles:NewsModel[]=[];

  category(data:any){
    this.http.get(`https://newsapi.org/v2/top-headlines?country=in&category=${data}&apiKey=650d4134f225403a8d87033ed10eb1eb`).subscribe((x:any)=>{this.articles=x.articles})

  }

  ngOnInit()  {
    this.http.get('https://newsapi.org/v2/top-headlines?country=in&apiKey=650d4134f225403a8d87033ed10eb1eb').subscribe((x:any)=>{this.articles=x.articles})
  }

}
