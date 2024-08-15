import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ProductService } from './services/product.service';
import { Product } from './models/product.model';
import { ProductCardComponent } from "./components/product-card/product-card.component";
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, ProductCardComponent, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  products: Product[] = [];
  filteredProduct: Product | null = null;
  searchId: number | undefined;
  productNotFound: boolean = false;

  constructor(private productService: ProductService) { }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts(): void {
    this.productService.getProducts().subscribe(
      (response) => {
        this.products = response;
      },
      (error) => {
        console.error('Erro ao carregar os dados: ', error);
      }
    )
  }

  getProductById(): void {
    if (this.searchId) {
      this.productService.getProductById(this.searchId).subscribe(
        (response) => {
          this.filteredProduct = response;
          this.productNotFound = !response;
        },
        (error) => {
          console.error('Erro ao carregar os dados: ', error);
        }
      )
    } else {
      this.getProducts();
      this.productNotFound = false;
    }
  }

  deleteProduct(id: number): void {
    this.productService.deleteProduct(id).subscribe(
      () => {       
        this.products = this.products.filter(product => product.id !== id);
        if (this.filteredProduct?.id == id) {
          this.filteredProduct = null;
        }

        alert("Produto removido com sucesso!");
      },
      (error) => {
        console.error('Erro ao remover o produto: ', error);
      }
    )
  }
}
