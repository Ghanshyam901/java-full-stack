import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  Sid:any;
  Sname:any;
  dob:any;
  fees:any;
  course:any;


  std1:any;
  std2:any;
  std3:any;
  std4:any;
  std5:any;
  student:any;

  constructor(){

    this.std1={"Sid":101,"Sname":"Rahul kumar","dob":"12-10-2002","course":"Htmll,ReactJs,javaScript","fees":15999};
    this.std2={"Sid":102,"Sname":"Rohit Sharma","dob":"11-11-2000","course":"Htmll,css,javaScript","fees":13999};
    this.std3={"Sid":103,"Sname":"Ghanshyam kumar","dob":"07-09-1998","course":"SpringBoot,DSA,Angular","fees":22999};
    this.std4={"Sid":104,"Sname":"Shyam kumar","dob":"10-10-2001","course":"Angular,TypeScript","fees":17999};
    this.std5={"Sid":"xxx","Sname":"xxxx","dob":"xx-xx-xxxx","course":"xxxx","fees":"xxxx"};

    this.student=[this.std1,this.std2,this.std3,this.std4];

  }
  ngOnInit(): void {
    
    this.student.push(this.std5);

  }registerDetails(regdetails:any){
    
   console.log(this.student);

  }
}
