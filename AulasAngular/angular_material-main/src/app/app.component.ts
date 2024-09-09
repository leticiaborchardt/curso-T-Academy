import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { DragDropListComponent } from "./components/drag-drop-list/drag-drop-list.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, DragDropListComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'drag_drop';
}
