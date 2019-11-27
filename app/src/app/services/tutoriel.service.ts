import {Tutoriel} from '../model/tutoriel.model';
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({providedIn: 'root'})
export class TutorielService {

constructor(private http: HttpClient){}

  getAllTutoriels(){
    return this.http.get<Tutoriel[]>('http://localhost:8080/api/tutoriels');
  }
}
