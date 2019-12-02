import { Component } from '@angular/core';
import {BlogService} from './services/blog.service';
import {TutorielService} from './services/tutoriel.service';
import {FormationService} from './services/formation.service';
import {ContactService} from './services/contact.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  providers: [BlogService, TutorielService, FormationService, ContactService]
})
export class AppComponent {
  title = 'your-angular-project';
}
