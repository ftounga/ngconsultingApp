import {Tutoriel} from '../model/tutoriel.model';
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {environment} from '../../environments/environment';

@Injectable({providedIn: 'root'})
export class TutorielService {

constructor(private http: HttpClient){}

  getAllTutoriels(){
    return this.http.get<Tutoriel[]>(environment.api_url + 'tutoriels');
  }
}
