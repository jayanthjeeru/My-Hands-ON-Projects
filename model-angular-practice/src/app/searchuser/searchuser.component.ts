import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-searchuser',
  templateUrl: './searchuser.component.html',
  styleUrls: ['./searchuser.component.css']
})
export class SearchuserComponent implements OnInit {

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

  user=new User()
  isVisible=false;

  search(id:any){

    this.http.get<User>(`http://localhost:3000/users/${id}`).subscribe(x=>{this.user=x 
    console.log(x);
    this.isVisible=true;
    } 
    )


  }



}
