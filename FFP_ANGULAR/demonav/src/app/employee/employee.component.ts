import { Component, OnInit } from '@angular/core';
import { EmpserviceService } from '../empservice.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {


  id:any;

showForm: boolean = false;
employee: any;
searchEmpid:any;


constructor(private emps :EmpserviceService ){

  }

  ngOnInit(): void {
      this.getallEmployee();
  }

  getallEmployee(){

    return this.emps.getEmpdata().subscribe((data:any)=>{
      this.employee=data;
    })

  }

  delEmp(id:any){
    return this.emps.deleteByID(id).subscribe((data:any)=>{
   
      this.ngOnInit();

    })
  }
  updateEmp(emp:any){
    this.searchEmpid = emp;
    // this.updateEmployee();
  }

  updateEmployee(){

   return this.emps.searchEmployee(this.searchEmpid).subscribe((data:any)=>{
     console.log(data);
     this.searchEmpid = null;
     this.ngOnInit();
    })
    
  }



  // editStudent(student: any) {
  //   this.selectedStudent = student;
  // }
  
  // updateStudent() {
  //   return this.empser.updateStudent(this.selectedStudent).subscribe((data: any) => {
  //     console.log(data);
  //     this.selectedStudent = null;
  //     this.ngOnInit();
  //   });
  // }


//html-->update(id)-->.ts(based on id retive the employee data and pass it to form)---->new data-->update

  searchemp(formdata:any)
  {
     return this.emps.searchEmployee(formdata.id).subscribe((data:any)=>{

      this.ngOnInit();
     });
     
      
  }

}
