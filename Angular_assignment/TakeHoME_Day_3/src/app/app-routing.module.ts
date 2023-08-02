import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentComponent } from './student/student.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { AuthGuard } from './auth.guard';
import { GetemployeebyidComponent } from './getemployeebyid/getemployeebyid.component';

const routes: Routes = [
  { path: "getemployeebyid", component: GetemployeebyidComponent },
  {path:"login", component:LoginComponent},
  {path:"student",canActivate:[AuthGuard], component:StudentComponent},
  {path: "", component:HeaderComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
