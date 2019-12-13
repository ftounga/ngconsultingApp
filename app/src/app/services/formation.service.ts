import {Formation} from '../model/formation.model';
import {ChapterVideo} from '../model/chapterVideo.model';
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject} from 'rxjs';
import {environment} from '../../environments/environment';

@Injectable({providedIn: 'root' })
export class FormationService {

  public selectedFormation = new BehaviorSubject<Formation>(null);

  constructor(private http: HttpClient) {}

  getAllFormations() {
    return this.http.get<Formation[]>(environment.api_url + 'formations');
  }

  getChaptersFormationById(idFormation: number) {
    return this.http.get<ChapterVideo[]>(environment.api_url + 'formations/' + idFormation + '/lessons');
  }

  getLoadedLessons(idSelectedFormation: number) {
    return [];
  }
}
