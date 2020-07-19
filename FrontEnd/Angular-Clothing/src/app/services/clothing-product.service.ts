import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subscription } from 'rxjs';
import { map } from 'rxjs/operators';
import { ClothingProduct } from '../common/clothing-product';
@Injectable({
  providedIn: 'root'
})
export class ClothingProductService {
  private baseURL = 'http://localhost:8080/clothing';
  constructor(private http: HttpClient) { }
  clothing_products: ClothingProduct[];
  
  getClothingProductList(): Observable<ClothingProduct[]>
  {
    return this.http.get<ClothingProduct[]>(this.baseURL);
  }
}
