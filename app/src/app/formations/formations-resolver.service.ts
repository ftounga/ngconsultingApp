import {Resolve} from '@angular/router';
import {Formation} from '../model/formation.model';
import {FormationService} from '../services/formation.service';
import {Injectable} from '@angular/core';

@Injectable({providedIn: 'root'})
export class FormationResolver implements Resolve<Formation[]> {

  constructor(private formationService: FormationService) {}

  resolve() {
   return this.formationService.getAllFormations();
  }
}
