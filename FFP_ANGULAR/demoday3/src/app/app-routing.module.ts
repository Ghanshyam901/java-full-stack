import { NgModule } from '@angular/core';

import { EmployeeComponent } from './employee/employee.component';
import { StudentComponent } from './student/student.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule, Routes } from '@angular/router';


const routes:Routes = [
  {path:"employee",component:EmployeeComponent},
  {path:"student",component:StudentComponent},
  {path:"",component:HeaderComponent},
];

 

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
  
})

export class AppRoutingModule { }
