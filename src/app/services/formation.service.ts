import {Formation} from '../model/formation.model';
import {ChapterVideo} from '../model/chapterVideo.model';

export class FormationService {

  formations: Formation [] = [
    new Formation(1, 'Mise en place serveur', '/assets/img/apache.png', 'https://toungafranck.com/mise-en-place-serveur/', 13, 163, null),
    new Formation(2,'Jenkins', '/assets/img/jenkins.png', 'https://toungafranck.com/jenkins-3/', 15, 170, null),
    new Formation(3,'Elasticsearch', '/assets/img/elasticsearch.png', 'https://toungafranck.com/elastic/', 22, 240, null),
    new Formation(4,'Docker', '/assets/img/docker-1.png', '', 0, 0, null),
  ];

  chapters: ChapterVideo[] = [
    new ChapterVideo(1, '1- Presentation de la formation', 'https://www.youtube.com/embed/9UYMwwXR8tQ', 7, 'Dans le cadre de la mise en place d’un environnement de développement, il est nécessaire de configurer un serveur Web. Il sera question ici de présenter les différents modules qui vous permettent d’y arriver.'),
    new ChapterVideo(1, '2- Installation Ubuntu', 'https://www.youtube.com/embed/x7ykUoFzClQ', 9, 'Afin de ne pas avoir à souscrire à un serveur dédié, on utilisera une machine virtuelle via VirtualBox. Cet outil nous permettra de faire tourner un OS embarqué (Linux) sur notre machine'),
    new ChapterVideo(1, '3- Les commandes Unix Part 1', 'https://www.youtube.com/embed/HV8v8ileO5w', 15, 'Découverte des commandes qui vous permettrons de naviguer aisément dans le terminal UNIX:cd, ls, mv, ln')
  ];

  getAllFormations(): Formation [] {
    return this.formations;
  }

  getChaptersFormationById(idFormation: number): ChapterVideo [] {
    return this.chapters.filter(chapter => chapter.idFormation === idFormation);
  }
}
