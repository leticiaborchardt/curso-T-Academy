import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Observable} from 'rxjs'
import { Book, Genre } from '../models/book.model';


@Injectable({
  providedIn: 'root'
})
export class BookService {
  private url = 'http://localhost:3000/books'
  
  constructor(private http:HttpClient) { }

  getBooks():Observable<Book[]>{
    return this.http.get<Book[]>(this.url)
  }
  getBookById(id:number):Observable<Book>{
    return this.http.get<Book>(this.url+'/'+id)
  }
  getBooksByGenre(genre:string):Observable<Book[]>{
    return this.http.get<Book[]>(this.url+'?genre='+genre)
  }
  addBookBy(book:Book):Observable<any>{
    return this.http.post<any>(this.url, book)
  }
  deleteBook(id:number):Observable<any>{
    return this.http.delete<any>(this.url+'/'+id)
  }
  getGenres():Observable<Genre[]>{
    return this.http.get<Genre[]>('http://localhost:3000/genres');
  }
}
