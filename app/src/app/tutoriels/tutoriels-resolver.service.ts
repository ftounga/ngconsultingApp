import {Resolve} from '@angular/router';
import {Formation} from '../model/formation.model';
import {FormationService} from '../services/formation.service';
import {Injectable} from '@angular/core';
import {Tutoriel} from '../model/tutoriel.model';
import {TutorielService} from '../services/tutoriel.service';

@Injectable({providedIn: 'root'})
export class TutorielResolver implements Resolve<Tutoriel[]> {

  constructor(private tutorielService: TutorielService) {
  }

  resolve() {
    return this.tutorielService.getAllTutoriels();
  }
}
