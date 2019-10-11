import {Component, OnInit} from '@angular/core';
import {Competence} from '../model/competence.model';
import {ScrollEvent} from 'ngx-scroll-event';

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

  competences: Competence[] = [
    new Competence('JAVA', 'Language', 93),
    new Competence('SPRING', 'Language', 90),
    new Competence('JAVASCRIPT', 'Language', 65),
    new Competence('ANGULAR', 'Language', 70),

    new Competence('ELASTICSEARCH', 'Tool', 95),
    new Competence('UNIX', 'Tool', 82),
    new Competence('DOCKER', 'Tool', 78),
    new Competence('JENKINS', 'Tool', 85)
  ];

  constructor() {
  }

  ngOnInit(): void {
    this.type = 'success';
  }

  getLanguageSkill(): Competence[] {
    return this.competences.filter(competence => competence.type === 'Language');
  }

  getOutilSkill(): Competence[] {
    return this.competences.filter(competence => competence.type === 'Tool');
  }

  animateProgressBarSkill(competence: Competence): void {
    competence.progress = 0;

    const timerId = setInterval(() => {
      if (competence.progress < competence.value) {
        competence.progress = competence.progress + 1;
      }
    }, 30);
    setTimeout(() => {
      clearInterval(timerId);
    }, 10000);
  }

  triggerSkillProgressbar($event: ScrollEvent) {
    this.competences.forEach(competence => this.animateProgressBarSkill(competence));
  }
}
