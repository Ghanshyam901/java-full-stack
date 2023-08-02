import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'agecal'
})
export class AgecalPipe implements PipeTransform {

  dateofbirth:any;
  curryear:any;
  age:any;

  transform(dob:any):any {
    this.dateofbirth = new Date(dob).getFullYear();
    this.curryear = new Date().getFullYear();
    this.age = this.curryear-this.dateofbirth;
    return this.age;
  }

}
