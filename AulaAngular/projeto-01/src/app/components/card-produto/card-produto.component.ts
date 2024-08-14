import { Component, Input } from '@angular/core';

@Component({
  selector: 'card-produto',
  standalone: true,
  imports: [],
  templateUrl: './card-produto.component.html',
  styleUrl: './card-produto.component.css'
})
export class CardProdutoComponent {
  @Input() nome: string = "";
  @Input() preco: number = 0;
  @Input() avaliacao: number = 0;
  @Input() imagemUrl: string = "";
}
