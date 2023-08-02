import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'genccode'
})
export class GenccodePipe implements PipeTransform {

  transform(mobile:any,country:any):any {
    
    if(country =="india"){
      return "+91 "+mobile;
    }else{
      return "+10 "+mobile;
    }
  }

}
