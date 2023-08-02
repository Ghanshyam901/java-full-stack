import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpserviceService {

  isUserLoggedIn:boolean;
  // emp:any;

  selectedEmployee:any;

  constructor(private httpclient:HttpClient) {
    this.isUserLoggedIn=false;
   }
   setIsUserLoggedIn(){
    this.isUserLoggedIn = true;
   }
   getIsUserLoggedIn(){
    return this.isUserLoggedIn;

   }

   getcountrydetails(){
    return this.httpclient.get("https://restcountries.com/v2/all");
   }

   getEmpdata(){
    return this.httpclient.get("/employees/list");
   }
   deleteByID(id:any){
    return this.httpclient.delete("/employees/delete/"+id);
   }

   updateEmpById(emp:any){

       return this.httpclient.put("/employees/update",emp,{responseType:'text' as 'json'});

   }


  searchEmployee(deptId:any){
    return this.httpclient.get("/employees/list/"+deptId,{responseType:'text' as 'json'});
  }



  addEmployee(data:any){
   return this.httpclient.post("employees/list",data,{responseType:'text' as 'json'});
  }

  
}
