import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.scss']
})
export class ContactComponent implements OnInit {

  messageForm: FormGroup;
  showErrorMessage: Boolean;

  constructor() { }

  ngOnInit() {
    this.showErrorMessage = false;
    this.messageForm = new FormGroup({
      name: new FormControl(null, Validators.required),
      email: new FormControl(null, [Validators.required, Validators.email]),
      phone: new FormControl(null, Validators.required),
      object: new FormControl(null, Validators.required),
      message: new FormControl(null, Validators.required)
    });
  }

  onSubmit() {
    if (!this.messageForm.valid) {
      this.showErrorMessage = true;
    } else {
      this.showErrorMessage = false;
    }
  }
}
