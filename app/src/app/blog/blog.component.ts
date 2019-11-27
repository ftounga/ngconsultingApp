import {Component, OnInit} from '@angular/core';
import {Article} from '../model/article.model';
import {BlogService} from '../services/blog.service';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.scss']
})
export class BlogComponent implements OnInit {

  articles: Article[];

  constructor(private blogService: BlogService) {}

  ngOnInit() {
    this.blogService.getAllArticles().subscribe((response: Article[]) => {
      this.articles = response;
    });
  }

}
