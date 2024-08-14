import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Post } from '../models/post.model';

@Injectable({
  providedIn: 'root'
})
export class PostService {
  private url = "https://jsonplaceholder.typicode.com/posts";

  constructor(private http:HttpClient) { }

  // Observable retrata o status da requisição ("promise" ou retorno do dado completo)
  getPosts(): Observable<Post[]> {
    return this.http.get<Post[]>(this.url);
  }

  getPostById(id: number): Observable<Post> {
    return this.http.get<Post>(`${this.url}/${id}`);
  }

  addPost(post: Post): Observable<any> {
    return this.http.post<Post>(this.url, post);
  }

  updatePost(id: number, post: Post): Observable<any> {
    return this.http.put(`${this.url}/${id}`, post);
  }

  deletePost(id: number): Observable<any> {
    return this.http.delete(`${this.url}/${id}`);
  }
}
