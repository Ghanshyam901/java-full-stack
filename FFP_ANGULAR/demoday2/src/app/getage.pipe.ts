import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'getage'
})
export class GetagePipe implements PipeTransform {

  birthdate:any;
  curryear:any;
  year:any;


  transform(dob :any):any {
    
    this.birthdate = new Date(dob).getFullYear();
    this.curryear = new Date().getFullYear();
    this.year =this.curryear-this.birthdate;
    return this.year;


  }

}
