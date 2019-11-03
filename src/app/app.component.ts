import { Component } from '@angular/core';
import {BlogService} from './services/blog.service';
import {TutorielService} from './services/tutoriel.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  providers: [BlogService, TutorielService]
})
export class AppComponent {
  title = 'your-angular-project';
}
