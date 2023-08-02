import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { GetagePipe } from './getage.pipe';
import { GenccodePipe } from './genccode.pipe';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    GetagePipe,
    GenccodePipe
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
