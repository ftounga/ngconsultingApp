import { Component, OnInit } from '@angular/core';
import {TutorielService} from '../services/tutoriel.service';
import {Tutoriel} from '../model/tutoriel.model';
import {ActivatedRoute, Data} from '@angular/router';

@Component({
  selector: 'app-tutoriels',
  templateUrl: './tutoriels.component.html',
  styleUrls: ['./tutoriels.component.scss']
})
export class TutorielsComponent implements OnInit {

  tutoriels: Tutoriel [];

  constructor(private tutorielService: TutorielService, private route: ActivatedRoute) {}

  ngOnInit() {
    this.route.data.subscribe((data: Data) =>{
      console.log(data);
      this.tutoriels = data.tutoriels;
    });
  }

  getAvailableTutoriels(): Tutoriel[] {
    return this.tutoriels.filter( tutoriel => tutoriel.location != null);
  }

  getNotAvailableTutoriels(): Tutoriel[] {
    return this.tutoriels.filter( tutoriel => tutoriel.location == null);
  }

}
