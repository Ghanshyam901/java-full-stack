import { Component, OnInit } from '@angular/core';
import { EmpserviceService } from '../empservice.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  id:any;

employee: any;
searchEmpid:any;
constructor(private emp :EmpserviceService ){


  }

  ngOnInit(): void {
      this.getallEmployee();
  }

  getallEmployee(){

    return this.emp.getEmpdata().subscribe((data:any)=>{
      this.employee=data;
    })

  }

  delEmp(id:any){
    return this.emp.deleteByID(id).subscribe((data:any)=>{
   
      this.ngOnInit();

    })
  }
  updateEmp(employeee:any){
    this.searchEmpid = employeee;
  }

  updateEmployee(){
    return this.emp.updateEmpById(this.searchEmpid).subscribe((data:any)=>{
      console.log(data);
      this.searchEmpid=null;
      this.ngOnInit();
    })
  }


  searchemp(formdata:any)
  {
     return this.emp.searchEmployee(formdata.id).subscribe((data:any)=>{
      console.log(data);
      this.ngOnInit();
     });
     
      
  }

}
