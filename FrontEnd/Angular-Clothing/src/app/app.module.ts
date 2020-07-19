import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { ClothingListComponent } from './components/clothing-list/clothing-list.component';
import { ClothingProductService } from './services/clothing-product.service';

@NgModule({
  declarations: [
    AppComponent,
    ClothingListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ClothingProductService], // so we can inject
  bootstrap: [AppComponent]
})
export class AppModule { }
