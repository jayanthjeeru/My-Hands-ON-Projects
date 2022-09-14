import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { User } from '../user';

@Component({
  selector: 'app-deleteuser',
  templateUrl: './deleteuser.component.html',
  styleUrls: ['./deleteuser.component.css']
})
export class DeleteuserComponent implements OnInit {
 
  users: User[]=[];

  constructor(private http:HttpClient) { }

  ngOnInit() {

    this.http.get<User[]>('http://localhost:3000/users').subscribe(x=>{
      this.users=x
    })
  }

  delete(id:any){

    this.http.delete(`http://localhost:3000/users/${id}`).subscribe(x=>{
      console.log(x);
      this.get()
    })

    

  }

  get(){
    this.http.get<User[]>('http://localhost:3000/users').subscribe(x=>{
      this.users=x
    })
  }

}
