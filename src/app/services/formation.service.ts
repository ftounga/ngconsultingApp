import {Formation} from '../model/formation.model';

export class FormationService {

  formations: Formation [] = [
    new Formation('Mise en place serveur', '/assets/img/apache.png', 'https://toungafranck.com/mise-en-place-serveur/', 13, 163, null),
    new Formation('Jenkins', '/assets/img/jenkins.png', 'https://toungafranck.com/jenkins-3/', 15, 170, null),
    new Formation('Elasticsearch', '/assets/img/elasticsearch.png', 'https://toungafranck.com/elastic/', 22, 240, null),
    new Formation('Docker', '/assets/img/docker-1.png', '', 0, 0, null),
  ];

  getAllFormation(): Formation [] {
    return this.formations;
  }
}
