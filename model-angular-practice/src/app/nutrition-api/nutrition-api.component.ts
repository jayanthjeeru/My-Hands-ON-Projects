import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-nutrition-api',
  templateUrl: './nutrition-api.component.html',
  styleUrls: ['./nutrition-api.component.css']
})
export class NutritionApiComponent implements OnInit {

  constructor(private http:HttpClient) { }


  output:any


  search(data:any){

    let headers=new HttpHeaders().set('x-api-key','FQwId6AjWEHMr/VYYrU2JA==vhHgp7K5QRa92amu');
    this.http.get(`https://api.calorieninjas.com/v1/nutrition?query=${data}`,{headers}).subscribe((x)=>{
    let i=JSON.parse(JSON.stringify(x))  
    this.output=i.items
    console.log(this.output);
    
    })

  }

  ngOnInit(): void {
  }

}
