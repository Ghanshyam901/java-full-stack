import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpserviceService {

  isValidLogin: Boolean;

  constructor() { 

    this.isValidLogin = false;
  }

  setisValidLogin()
  {
     return this.isValidLogin;
  }

  getisValidLogin()
  {
    return this.isValidLogin;
  }


}
