import { Component, OnInit } from '@angular/core';
import {ChapterVideo} from '../model/chapterVideo.model';
import {FormationService} from '../services/formation.service';
import {ActivatedRoute, Data, Params} from '@angular/router';
import {Formation} from '../model/formation.model';

@Component({
  selector: 'app-formation-details',
  templateUrl: './formation-details.component.html',
  styleUrls: ['./formation-details.component.scss']
})
export class FormationDetailsComponent implements OnInit {

  chapters: ChapterVideo[];
  selectedFormation: Formation;
  private formationService: FormationService;
  constructor(private formation: FormationService, private route: ActivatedRoute) {
    this.formationService = formation;
  }

  ngOnInit() {
    console.log(history.state.selectedFormation);
    this.formationService.selectedFormation.subscribe(
      (formation) => this.chapters = formation['chapters']
    );
  }

}
