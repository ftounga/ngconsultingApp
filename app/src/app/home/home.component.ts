import { Component, OnInit } from '@angular/core';
import {Article} from '../model/article.model';
import {BlogService} from '../services/blog.service';
import {ActivatedRoute} from '@angular/router';
import {ToastrService} from 'ngx-toastr';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  articles: Article[] ;
  constructor(private blogService: BlogService, private route: ActivatedRoute, private toastrService: ToastrService) {}

  ngOnInit() {
    this.blogService.getAllArticles().subscribe( response => {
      console.log(response);
      this.articles = response;
    });
    this.route.queryParams.subscribe(queryParam => {
      if (queryParam.isLogged === 'false') {
        this.toastrService.warning('Vous devez vous connecter', 'Authentification');
      }
    });
  }

}
