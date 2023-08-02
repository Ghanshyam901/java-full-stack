import { Component, OnInit } from '@angular/core';
import { EmpserviceService } from '../empservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  id:any;
  password:any;
  
    constructor(private empser:EmpserviceService,private route:Router) { 

    }
  
    ngOnInit(): void  //page loading
    {
        
    }
   loginDetails(formdata:any)
    {
      console.log(formdata)

      if(formdata.id=="admin" && formdata.password =="admin"){
        this.empser.setIsUserLoggedIn(); ///2
        this.route.navigateByUrl("employee");
      }else{
        this.route.navigate(["login"]);
      }
    }



  }