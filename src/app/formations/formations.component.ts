import {Component, OnInit, ViewChild} from '@angular/core';
import {FormationService} from '../services/formation.service';
import {Formation} from '../model/formation.model';
import {ActivatedRoute, Params} from '@angular/router';

@Component({
  selector: 'app-formations',
  templateUrl: './formations.component.html',
  styleUrls: ['./formations.component.scss']
})
export class FormationsComponent implements OnInit {
  @ViewChild('videoPlayer', {static: true}) videoplayer: any;

  formations: Formation [];
  idSelectedFormation: number;

  constructor(private formationService: FormationService, private route: ActivatedRoute) {
    this.formations = formationService.getAllFormations();
  }

  ngOnInit() {
    this.videoplayer.nativeElement.volume = 0.1;

    this.route.params.subscribe(
      (params: Params) => {
        this.idSelectedFormation = params.id;
      }
    );
    console.log('id formation selected: ' + this.idSelectedFormation);
  }

}
