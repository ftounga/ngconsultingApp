import { Component, OnInit } from '@angular/core';
import {ChapterVideo} from '../model/chapterVideo.model';
import {FormationService} from '../services/formation.service';
import {ActivatedRoute, Params} from '@angular/router';

@Component({
  selector: 'app-formation-details',
  templateUrl: './formation-details.component.html',
  styleUrls: ['./formation-details.component.scss']
})
export class FormationDetailsComponent implements OnInit {

  chapters: ChapterVideo[];
  idSelectedFormation: number;
  private formationService: FormationService;
  constructor(private formation: FormationService, private route: ActivatedRoute) {
    this.formationService = formation;
  }

  ngOnInit() {
    this.route.parent.params.subscribe(
      (params: Params) => {
        this.idSelectedFormation = params.id;
        this.chapters = this.formationService.getChaptersFormationById(this.idSelectedFormation);
      }
    );
  }

}
