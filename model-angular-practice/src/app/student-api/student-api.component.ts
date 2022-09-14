import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Student } from '../student';

@Component({
  selector: 'app-student-api',
  templateUrl: './student-api.component.html',
  styleUrls: ['./student-api.component.css']
})
export class StudentApiComponent implements OnInit {

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
this.getAllStudents();
  }

  Students:Student[]=[];
  student=new Student();
  getAllStudents(){

this.http.get<Student[]>('http://localhost:8080/getallstudents').subscribe(x=>{this.Students=x 
console.log(x);
},error=>{console.log(error);
})

  }

  deleteStudent(name:string){
    this.http.delete<Student>(`http://localhost:8080/byname/${name}`).subscribe(x=>{
      console.log(x);
      this.getAllStudents();
      
    },
    error=>{
      console.log(error);
      
    })
  }
  
  addStudent(){
    console.log(this.student);

    this.http.post<Student>('http://localhost:8080',this.student).subscribe(
      x=>{
          console.log(x)
          this.getAllStudents();
      },
      error=>{
        console.log(error);
      }
    )
  }

}
