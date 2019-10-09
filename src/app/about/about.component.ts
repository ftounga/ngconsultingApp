import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.scss']
})
export class AboutComponent implements OnInit {

  max = 100;
  showWarning: boolean;
  dynamic = 0;
  type: string;

  constructor() {
  }

  ngOnInit(): void {
    this.type = 'success';
    const timerId = setInterval(() => {
      if (this.dynamic < 90) {
        this.dynamic = this.dynamic + 1;
      }
    }, 50);
    setTimeout(() => {
      clearInterval(timerId);
    }, 10000);
  }

}
