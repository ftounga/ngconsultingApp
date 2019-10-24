import { Component, OnInit } from '@angular/core';
import {Competence} from '../model/competence.model';
import {Experience} from '../model/experience.model';

@Component({
  selector: 'app-experiences',
  templateUrl: './experiences.component.html',
  styleUrls: ['./experiences.component.scss']
})
export class ExperiencesComponent implements OnInit {

  experiences: Experience[] = [
    // tslint:disable-next-line:max-line-length
    new Experience('Consultant sénior Fullstack', 'Renault', 'Implémentation de l\'authentification via Oauth2 et OpenId Connect. Mise en place d\'un identity Provider sous Docker - Keycloack.', new Date(2019,9, 2), 'Sept-2019') ,
    new Experience('Consultant sénior Fullstack', 'Buyway', 'Mise en place d\'un cluster ELK sous docker. Administration du cluster Elasticsearch et monitoring des performances. Creation de dashbord sous Kibana', new Date(2018,6, 1), 'Juin-2018'),
    // tslint:disable-next-line:max-line-length
    new Experience('Consultant Fullstack', 'Axa', 'Mise en place de la chaine d\'intégration continue (Apache - Jenkins - Git). Implémentation des pipelines de déploiement Jenkins. Design du middleware MarkLogic', new Date(2017, 3, 6), 'Mars-2017'),
    new Experience('Developpeur Fullstack', 'ING Direct', 'Conception de tests foncionnels via Cumcumber JS. Mise en place de la couche applicative. Conception des templates fournis par les UX design', new Date(2016,9,10), 'Sept-2016')
  ];
  constructor() { }

  ngOnInit() {
  }

}
