import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  products: any;
  cartItems: any;
 
 constructor() {
 this.cartItems = [];
  }
 

  ngOnInit(): void 
  {
    this.products=[
   {id:101,name:"I phone 11",description:"No cost emi from 1,499/- per month",price:39999.44,imagePath:"assets/phone1.jpg"},
   {id:102,name:"I phone 12",description:"No cost emi from 1,499/- per month",price:50004.904,imagePath:"assets/phone2.jpg"},
   {id:103,name:"I phone 13",description:"No cost emi from 1,499/- per month",price:76999.24,imagePath:"assets/phone3.jpg"},
   {id:104,name:"I phone 10",description:"No cost emi from 1,499/- per month",price:32999.84,imagePath:"assets/phone1.jpg"},
   {id:105,name:"I phone 6",description:"No cost emi from 1,499/- per month",price:12999.84,imagePath:"assets/phone5.jpg"},
   {id:106,name:"I phone 13",description:"No cost emi from 1,499/- per month",price:76999.24,imagePath:"assets/phone1.jpg"},
  
    ]
  }
  addToCart(product: any) {
    this.cartItems.push(product);
    localStorage.setItem('cartItems', JSON.stringify(this.cartItems));
     }

}
