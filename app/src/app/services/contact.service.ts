import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Message} from '../model/message.model';

@Injectable({providedIn: 'root'})
export class ContactService {

  constructor(private http: HttpClient){}

  getAllMessages(){
    return this.http.get<Message[]>('http://localhost:8080/api/message/all');
  }

  sendMessage(message: Message){
    return this.http.post<Message[]>('http://localhost:8080/api/message', message);
  }
}
