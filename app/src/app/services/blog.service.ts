import {Article} from '../model/article.model';
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({providedIn: 'root'})
export class BlogService {

  constructor(private http: HttpClient){}

  getAllArticles(){
   return this.http.get<Article[]>('http://localhost:8080/api/articles');
  }
}
