import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  id:any;
  password:any;
  
    constructor() { }
  
    ngOnInit(): void  //page loading
    {
  
    }
   loginDetails(formdata:any)
    {
      if(formdata.id == formdata.password){
        alert("Login Success");
      }else{
        alert("Login failure");
      }
    }



  }