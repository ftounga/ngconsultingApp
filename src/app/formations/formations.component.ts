import {Component, OnInit, ViewChild} from '@angular/core';

@Component({
  selector: 'app-formations',
  templateUrl: './formations.component.html',
  styleUrls: ['./formations.component.scss']
})
export class FormationsComponent implements OnInit {
  @ViewChild('videoPlayer') videoplayer: any;

  constructor() { }

  ngOnInit() {
    this.videoplayer.nativeElement.volume = 0.1;
  }

}
