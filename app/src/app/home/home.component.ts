import { Component, OnInit } from '@angular/core';
import {Article} from '../model/article.model';
import {BlogService} from '../services/blog.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  articles: Article[] ;
  constructor(private blogService: BlogService) {}

  ngOnInit() {
    this.blogService.getAllArticles().subscribe( response => {
      console.log(response);
      this.articles = response;
    });
  }

}
