import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {Message} from '../model/message.model';
import {ContactService} from '../services/contact.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.scss']
})
export class ContactComponent implements OnInit {

  messageForm: FormGroup;
  showErrorMessage: Boolean;
  contact: Message;

  constructor(private contactService: ContactService) { }

  ngOnInit() {
    this.showErrorMessage = false;
    this.messageForm = new FormGroup({
      name: new FormControl(null, Validators.required),
      email: new FormControl(null, [Validators.required, Validators.email]),
      phoneNumber: new FormControl(null, Validators.required),
      object: new FormControl(null, Validators.required),
      message: new FormControl(null, Validators.required)
    });
  }

  onSubmit() {
    if (!this.messageForm.valid) {
      this.showErrorMessage = true;
    } else {
      this.contact = this.messageForm.value;
      this.contactService.sendMessage(this.contact).subscribe(contact => {
        console.log('Your message has been sent successfully');
      })
      this.showErrorMessage = false;
    }
  }
}
