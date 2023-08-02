import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-getemployeebyid',
  templateUrl: './getemployeebyid.component.html',
  styleUrls: ['./getemployeebyid.component.css']
})
export class GetemployeebyidComponent {

  employeeId: any;
  employee: any;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  getEmployeeById() {
    this.employee = {
      id: 1,
      name: 'PASHA',
      gender: 'Male',
      salary: 9999.99,
      dateofjoining: '01-02-2012',
      loginid: 'PASHA123'
    };
  }


}
