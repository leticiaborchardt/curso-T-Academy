import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Observable} from 'rxjs'
import { Post } from '../models/post.model';

@Injectable({
  providedIn: 'root'
})

export class PostService {
  private url = 'https://jsonplaceholder.typicode.com/posts/'
  
  constructor(private http:HttpClient) { }
  
  getPost():Observable<Post[]>{
    return this.http.get<Post[]>(this.url)
  }

  getPostById(id:number): Observable<Post>{
    return this.http.get<Post>(this.url+id)
  }

  addPost(post:Post):Observable<any>{
    return this.http.post<any>(this.url, post)
  }

  deletePost(id:number):Observable<any>{
    return this.http.delete<any>(this.url+id)
  }

  updatePost(id:number, post:Post):Observable<any>{
    return this.http.put<any>(this.url+id, post)
  }
}
