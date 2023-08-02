import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { AgePipe } from './age.pipe';
import { FormsModule } from '@angular/forms';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { GetemployeebyidComponent } from './getemployeebyid/getemployeebyid.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    AgePipe,
    HeaderComponent,
    LoginComponent,
    GetemployeebyidComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
