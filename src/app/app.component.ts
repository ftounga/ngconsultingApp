import { Component } from '@angular/core';
import {BlogService} from './services/blog.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  providers: [BlogService]
})
export class AppComponent {
  title = 'your-angular-project';
}
