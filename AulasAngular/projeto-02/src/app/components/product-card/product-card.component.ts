import { Component, EventEmitter, Input, Output } from '@angular/core';
import { Product } from '../../models/product.model';

@Component({
  selector: 'product-card',
  standalone: true,
  imports: [],
  templateUrl: './product-card.component.html',
  styleUrl: './product-card.component.css'
})
export class ProductCardComponent {
  @Input() product: Product = {
    id: 0,
    title: '',
    price: 0,
    description: '',
    image: ''
  };

  @Output() deleteProduct: EventEmitter<number> = new EventEmitter<number>();

  onDeleteProduct() {
    this.deleteProduct.emit(this.product.id);
  }
}
