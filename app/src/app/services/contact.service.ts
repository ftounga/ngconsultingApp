import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Message} from '../model/message.model';
import {environment} from '../../environments/environment';
import {User} from '../model/user.model';

@Injectable({providedIn: 'root'})
export class ContactService {

  constructor(private http: HttpClient){}

  getAllMessages(){
    return this.http.get<Message[]>(environment.api_url + '/message/all');
  }

  sendMessage(message: Message){
    return this.http.post<Message[]>(environment.api_url + '/message', message);
  }

  getConnectedUser() {
    return this.http.get<User>(environment.api_url + '/me');
  }
}
