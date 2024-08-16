import { Component, OnInit } from '@angular/core';
import { Book } from '../../models/book.model';
import { CommonModule } from '@angular/common';
import { BookService } from '../../services/book.service';

@Component({
  selector: 'app-books',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './books.component.html',
  styleUrl: './books.component.css'
})
export class BooksComponent implements OnInit{
 
  books:Book[] = []

  constructor(private bookService:BookService){}

  ngOnInit(): void {
      
      this.getBooks()
  }

  deleteBook(id:number){
    this.bookService.deleteBook(id).subscribe(r =>{
      alert("Livro Excluido com sucesso")
      this.getBooks()
    })
  }

  getBooks(){
    this.bookService.getBooks().subscribe((data)=>{
      console.log(data)
      this.books = data
    })
  }
}
