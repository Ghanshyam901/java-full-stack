import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit  {

std1:any;
std2:any;
std3:any;
std4:any;
std5:any;

student: any;

constructor(){
  this.std1={"id":101,"name":"rahul","dob":"11-11-1999","gender":"M","mobile":99881122,"country":"india","email":"rahul@gmail.com"};
  this.std2={"id":102,"name":"Rohit","dob":"04-11-1998","gender":"M","mobile":99881122,"country":"india","email":"rohit@gmail.com"};
  this.std3={"id":103,"name":"Ramesh","dob":"02-11-2001","gender":"M","mobile":99881122,"country":"usa","email":"ramesh@gmail.com"};
  this.std4={"id":104,"name":"Ghanshyam","dob":"09-11-2002","gender":"M","mobile":99881122,"country":"india","email":"Ghanshyam@gmail.com"};
  this.std5={"id":105,"name":"Shya,","dob":"11-11-2004","gender":"M","mobile":99881121,"country":"Usa","email":"Shyam@gmail.com"};

  this.student=[this.std1,this.std2,this.std3,this.std4,this.std5];

}

ngOnInit(): void {
      
}

}
