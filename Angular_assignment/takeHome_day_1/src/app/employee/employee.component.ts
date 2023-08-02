import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

emp1:any;
emp2:any;
emp3:any;
emp4:any;
employee: any;
constructor(){
  this.emp1={"EmpId":101,"empName":"Rahul yadav","salary":43000,"gender":"male","doj":"12-03-2023","emailId":"rahul@gmail.com","password":"123rahul"};
  this.emp2={"EmpId":102,"empName":"Simran singh","salary":53000,"gender":"female","doj":"01-03-2023","emailId":"simran@gmail.com","password":"simran54"};
  this.emp3={"EmpId":103,"empName":"Shyam kumar","salary":63000,"gender":"male","doj":"11-03-2023","emailId":"shyam@gmail.com","password":"shyam123"};
  this.emp4={"EmpId":104,"empName":"Dino james","salary":45000,"gender":"male","doj":"19-03-2022","emailId":"dino@gmail.com","password":"dino1@1"};

  this.employee=[this.emp1,this.emp2,this.emp3,this.emp4];

  }

  ngOnInit(): void {
      
  }

}
