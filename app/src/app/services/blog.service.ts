import {Article} from '../model/article.model';
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';

@Injectable({providedIn: 'root'})
export class BlogService {

  constructor(private http: HttpClient){}

  getAllArticles(){
   return this.http.get<Article[]>(environment.api_url + '/articles');
  }
}
