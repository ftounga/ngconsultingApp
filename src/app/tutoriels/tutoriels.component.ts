import { Component, OnInit } from '@angular/core';
import {TutorielService} from '../services/tutoriel.service';
import {Tutoriel} from '../model/tutoriel.model';

@Component({
  selector: 'app-tutoriels',
  templateUrl: './tutoriels.component.html',
  styleUrls: ['./tutoriels.component.scss']
})
export class TutorielsComponent implements OnInit {

  tutoriels: Tutoriel [];

  constructor(private tutorielService: TutorielService) {

    this.tutoriels = tutorielService.getAllTutoriels();
  }

  ngOnInit() {
  }

  getAvailableTutoriels(): Tutoriel[] {
    return this.tutoriels.filter( tutoriel => tutoriel.location != null);
  }

  getNotAvailableTutoriels(): Tutoriel[] {
    return this.tutoriels.filter( tutoriel => tutoriel.location == null);
  }

}
