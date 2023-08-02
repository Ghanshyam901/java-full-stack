
import { Component, OnInit } from '@angular/core';
@Component({
 selector: 'app-cart',
 templateUrl: './cart.component.html',
 styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
 retrievedData: any;
 cartItems: any;
 ngOnInit() {
 }
 showCartItems() {
this.retrievedData = localStorage.getItem('cartItems');
this.cartItems = JSON.parse(this.retrievedData);
 }
}
