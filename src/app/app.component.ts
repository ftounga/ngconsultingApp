import { Component } from '@angular/core';
import {BlogService} from './services/blog.service';
import {TutorielService} from './services/tutoriel.service';
import {FormationService} from './services/formation.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  providers: [BlogService, TutorielService, FormationService]
})
export class AppComponent {
  title = 'your-angular-project';
}
