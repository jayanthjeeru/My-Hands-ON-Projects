import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  constructor(private router:Router) { }

 public id1:any;
  ngOnInit(): void {
   // this.id1 = this.router.snapshot.paramMap.get('id')
   // let x=this.router.snapshot.paramMap.get('id');
   // this.id=x;
    this.id1=this.router.getCurrentNavigation();
console.log(this.id1);

  }

}
