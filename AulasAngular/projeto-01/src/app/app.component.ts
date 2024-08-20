import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { PrimeiroComponenteComponent } from './components/primeiro-componente/primeiro-componente.component';
import { CommonModule } from '@angular/common';
import { CardProdutoComponent } from './components/card-produto/card-produto.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, PrimeiroComponenteComponent, CardProdutoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'projeto-01';
  frutas = ['Banana', 'Morango', 'Uva', 'Melancia', 'Kiwi', 'Limão'];

  user = {
    name: "Letícia",
    age: 19,
    hasCarteira: false
  };

  produtos = [
    {nome: 'Camiseta Nike Sb', preco: 289.95, avaliacao: 4.5, imagemUrl: 'https://imgnike-a.akamaihd.net/1920x1920/028987IDA12.jpg'},
    {nome: 'Tênis Nike Air Max 95 EWT', preco: 1329.99, avaliacao: 5.0, imagemUrl: 'https://imgnike-a.akamaihd.net/768x768/02409651A12.jpg'},
    {nome: 'Boné Nike Club', preco: 189.99, avaliacao: 5.0, imagemUrl: 'https://imgnike-a.akamaihd.net/768x768/02978851A6.jpg'}
  ]

  tirarCarteira(): void {
    this.user.hasCarteira = true;
  }

  mudarTitle():void {
    this.title = "A B C"
  }
}
