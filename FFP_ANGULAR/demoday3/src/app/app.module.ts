import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { HeaderComponent } from './header/header.component';
import { EmployeeComponent } from './employee/employee.component';
import { AppRoutingModule } from './app-routing.module';

import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    HeaderComponent,
    EmployeeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]

  
})
export class AppModule { 


}
