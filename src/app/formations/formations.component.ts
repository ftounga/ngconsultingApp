import {Component, OnInit, ViewChild} from '@angular/core';
import {FormationService} from '../services/formation.service';
import {Formation} from '../model/formation.model';

@Component({
  selector: 'app-formations',
  templateUrl: './formations.component.html',
  styleUrls: ['./formations.component.scss']
})
export class FormationsComponent implements OnInit {
  @ViewChild('videoPlayer') videoplayer: any;

  formations: Formation [];

  constructor(private formationService: FormationService) {
    this.formations = formationService.getAllFormation();
  }

  ngOnInit() {
    this.videoplayer.nativeElement.volume = 0.1;
  }

}
