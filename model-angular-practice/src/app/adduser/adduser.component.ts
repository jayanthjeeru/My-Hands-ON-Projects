import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {
  constructor(private http:HttpClient) {}
 
  ngOnInit(){
    this.http.get<User[]>('http://localhost:3000/users').subscribe(x=>{
      this.users=x
    })
    }
  
  
    add(username:any,password:any,email:any){
  
     let user=new User()
  
     user.email=email
     user.password=password
     user.username=username
  
      this.http.post<User>('http://localhost:3000/users',user).subscribe(x=>{
        console.log(x);
        this.get()
        
      })
  
  
    }
  
    users:User[]=[]
  
    get(){
      this.http.get<User[]>('http://localhost:3000/users').subscribe(x=>{
        this.users=x
      })
    }

}
