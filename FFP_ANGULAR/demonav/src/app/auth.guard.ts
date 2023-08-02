import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { EmpserviceService } from './empservice.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate 
{

  constructor(private empser:EmpserviceService){

  }

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree{
   
      return this.empser.getIsUserLoggedIn(); //false

 }
};