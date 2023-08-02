import { Component, OnInit } from '@angular/core';
import { EmpserviceService } from '../empservice.service';
import { employeer } from '../employeer';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  empl : employeer = new employeer(0,"","","","");

  countries:any;
  userdata:any;

  constructor(private emp:EmpserviceService){
    this.getCountrydetailss()
    this.registerData();
    

  }

  submitForm(reg:any){

    this.empl=reg;
    this.emp.addEmployee(this.empl).subscribe(this.empl);
      this.ngOnInit();
  }

  getCountrydetailss(){
    return this.emp.getcountrydetails().subscribe((data:any)=>{
      this.countries=data;
    })
  }

  registerData(){
      
     
  }

  ngOnInit(): void {
      
  }
}
