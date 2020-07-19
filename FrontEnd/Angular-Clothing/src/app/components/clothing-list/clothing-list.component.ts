import { Component, OnInit } from '@angular/core';
import { ClothingProductService } from 'src/app/services/clothing-product.service';
import { ClothingProduct } from 'src/app/common/clothing-product';
import { Observable, Subscription } from 'rxjs';

@Component({
  selector: 'app-clothing-list',
  templateUrl: './clothing-list.component.html',
  styleUrls: ['./clothing-list.component.css']
})
export class ClothingListComponent implements OnInit {

  constructor(private clothingService: ClothingProductService) { }
  clothing_products: ClothingProduct[];
  testv:Subscription;
  ngOnInit(): void 
  {
    this.listClothingProducts();
   
  }
  // subscribe to GET request
  listClothingProducts()
  {
    this.clothingService.getClothingProductList().subscribe(
      data => { 
      this.clothing_products = data;
              }
    )
  }

}
