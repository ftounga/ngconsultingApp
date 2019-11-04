import { Component, OnInit } from '@angular/core';
import {ChapterVideo} from '../model/chapterVideo.model';
import {FormationService} from '../services/formation.service';

@Component({
  selector: 'app-formation-details',
  templateUrl: './formation-details.component.html',
  styleUrls: ['./formation-details.component.scss']
})
export class FormationDetailsComponent implements OnInit {

  chapters: ChapterVideo[];
  constructor(private formationService: FormationService) {
    this.chapters = formationService.getChaptersFormationById(1);
  }

  ngOnInit() {
  }

}
