import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ClothingListComponent } from './components/clothing-list/clothing-list.component';
import { ClothingProductService } from './services/clothing-product.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ClothingListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ClothingProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
