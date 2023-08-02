import { Component, OnInit } from '@angular/core';
@Component({
 selector: 'app-products',
 templateUrl: './products.component.html',
 styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

 products: any;
 cartItems: any;

constructor() {
this.cartItems = [];
 }

 ngOnInit() {

this.products = [
 {id: 1001, name: 'Vivo', description: 'No cost EMI from ₹1,000/month.',
 price: 20200.99, imagePath: 'assets/Images/10001.jpg'},
{id: 1002, name: 'Nokia A6', description: 'No cost EMI from ₹500/month.', price:15000.99,imagePath: 'assets/Images/10002.jpg'},
{id: 1003, name: 'Iphone', description: 'No cost EMI from ₹2500/month.', price: 99999.99,imagePath: 'assets/Images/10003.jpg'},
{id: 1004, name: 'Vivo Y100', description: 'No cost EMI from ₹399/month.',price: 10000.99, imagePath: 'assets/Images/10004.jpg'},
{id: 1005, name: 'Ikail', description: 'No cost EMI from ₹99/month.',price: 49999.99,imagePath: 'assets/Images/10005.jpg'},
{id: 1006, name: 'MI', description: 'No cost EMI from ₹2,499/month.',price: 8999.99,imagePath: 'assets/Images/10006.jpg'},
 ];
 }
 addToCart(product: any) {
this.cartItems.push(product);
localStorage.setItem('cartItems', JSON.stringify(this.cartItems));
 }
}