import { Component, Input } from '@angular/core';
import { Post } from '../../models/post.model';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'post',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './post.component.html',
  styleUrl: './post.component.css'
})
export class PostComponent {
  @Input() post: Post = {
    id: 0,
    userId: 0,
    title: '',
    body: ''
  };
}
