import { Component } from '@angular/core';
import { CdkDragDrop, DragDropModule, moveItemInArray } from '@angular/cdk/drag-drop';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-drag-drop-list',
  standalone: true,
  imports: [NgFor, DragDropModule],
  templateUrl: './drag-drop-list.component.html',
  styleUrl: './drag-drop-list.component.css'
})
export class DragDropListComponent {
  items = ["Banana", "Maçã", "Maracujá", "Morango", "Caqui", "Melancia", "Mamão", "Uva"];

  drop(event: CdkDragDrop<string[]>) {
    const previousIndex = event.previousIndex;
    const currentIndex = event.currentIndex;

    moveItemInArray(this.items, previousIndex, currentIndex);
  }
}
