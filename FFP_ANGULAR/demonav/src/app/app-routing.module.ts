import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router'
import { EmployeeComponent } from './employee/employee.component';
import { StudentComponent } from './student/student.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { AuthGuard } from './auth.guard';

const routes:Routes=[

  {path:"employee", component:EmployeeComponent},   //canActivate:[AuthGuard]
  {path:"student",component:StudentComponent},
  {path:"login",component:LoginComponent},
  {path:"",component:HeaderComponent},
  {path:"app",component:AppComponent},
  {path:"register",component:RegisterComponent}
];

@NgModule({
  declarations: [],
  imports: [
   RouterModule.forRoot(routes)],
   exports:[RouterModule] 
  

})
export class AppRoutingModule { }
