import {Formation} from '../model/formation.model';
import {ChapterVideo} from '../model/chapterVideo.model';
import {Tutoriel} from '../model/tutoriel.model';
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject} from 'rxjs';

@Injectable({providedIn: 'root' })
export class FormationService {

  public selectedFormation = new BehaviorSubject<Formation>(null);

  constructor(private http: HttpClient) {}

  getAllFormations() {
    return this.http.get<Formation[]>('http://localhost:8080/api/formations');
  }

  getChaptersFormationById(idFormation: number) {
    return this.http.get<ChapterVideo[]>('http://localhost:8080/api/formations/' + idFormation + '/lessons');
  }

  getLoadedLessons(idSelectedFormation: number) {
    return [];
  }
}
