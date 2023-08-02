import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { AgecalPipe } from './agecal.pipe';
import { ProductComponent } from './product/product.component';

@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    AgecalPipe,
    ProductComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
