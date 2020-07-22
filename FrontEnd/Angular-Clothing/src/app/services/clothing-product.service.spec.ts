import { TestBed } from '@angular/core/testing';

import { ClothingProductService } from './clothing-product.service';

describe('ClothingProductService', () => {
  let service: ClothingProductService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ClothingProductService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
