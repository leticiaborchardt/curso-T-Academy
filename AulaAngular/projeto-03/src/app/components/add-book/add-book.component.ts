import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Book, Genre } from '../../models/book.model';
import { BookService } from '../../services/book.service';

@Component({
  selector: 'app-add-book',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './add-book.component.html',
  styleUrl: './add-book.component.css'
})
export class AddBookComponent implements OnInit {
  book:Book = {
    id:0,
    isbn:0,
    title: '',
    author: '',
    genre: '',
    pages: 0
  }
  message:string = ''
  genres:Genre[] = []

  constructor(private bookService:BookService){}
 
  ngOnInit(): void {
    this.bookService.getGenres().subscribe((data) => this.genres = data)
  }

  onSubmit(){
    this.bookService.addBookBy(this.book)
    .subscribe( response => {
      this.message= "Livro Adicionado com sucesso"
      this.book = {
        id:0,
        isbn:0,
        title: '',
        author: '',
        genre: '',
        pages: 0
      }
    })
  }
}
