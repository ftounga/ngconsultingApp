import {Tutoriel} from '../model/tutoriel.model';
import {TutorielType} from '../model/type.enum';

export class TutorielService {

  tutoriels: Tutoriel [] = [
    new Tutoriel('Nouveautés Java 8', '/assets/img/java-8.png', 'https://toungafranck.com/les-nouveautes-de-java-8-preview/', TutorielType.BOOK),
    new Tutoriel('Protocole TLS/SSL', 'assets/img/ssl.png', 'https://toungafranck.com/le-protocole-tls-ssl/', TutorielType.GUIDE),
    new Tutoriel('Elasticsearch', '/assets/img/elasticsearch.png', 'https://toungafranck.com/elasticsearch-3/', TutorielType.BOOK),
    new Tutoriel('Authentification JWT', '/assets/img/jwt.png', 'https://toungafranck.com/authentification-jwt-json-web-token/', TutorielType.GUIDE),
    new Tutoriel('Sring Data & Elastic', '/assets/img/spring-data-elastic.png', null, TutorielType.GUIDE),
    new Tutoriel('Sring Boot & Kafka', 'assets/img/Kafka.png', null, TutorielType.GUIDE),
    new Tutoriel('Sring & Reactor', 'assets/img/spring-reactor.jpeg', null, TutorielType.GUIDE)
  ];

  getAllTutoriels(): Tutoriel[] {
    return this.tutoriels;
  }
}
