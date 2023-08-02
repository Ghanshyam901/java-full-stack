import { Component, OnInit } from '@angular/core';
import { EmpserviceService } from '../empservice.service';
import { Router } from '@angular/router';
import { __values } from 'tslib';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  id: any;
  password: any;
  formData: any;
  allEmp = [];
  email: any;
  nid: any;
  npas: any;

  
  isloggendin= false;
 

  constructor(private empser: EmpserviceService, private route: Router) {}

  ngOnInit(): void {} //page loading
  
  getallEmployee() {
    return this.empser.getEmpdata().subscribe((data: any) => {
      this.allEmp = data;
    });
  }

  loginDetails(formdata: any) {
    // console.log(formdata)

 
      for (let key in this.allEmp) {
        let value = this.allEmp[key];

        for (let key in value) {
          if (key == 'email') {
            this.nid = value[key];
          }

          if (key == 'id') {
            this.npas = value[key];
          }

          if (formdata.id == this.nid && formdata.password == this.npas) {
           
            this.empser.setIsUserLoggedIn(); ///2
            this.route.navigateByUrl('employee');
            this.isloggendin =true;
           
            
          }
        }
      }
     
      if(this.isloggendin == false){
        
          this.route.navigate(['login']);
          alert("worn credentails");
        
      }

    this.getallEmployee();
  }
  }


