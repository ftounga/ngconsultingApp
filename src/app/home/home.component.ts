import { Component, OnInit } from '@angular/core';
import {Article} from '../model/article.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  articles: Article[] = [
    new Article('Installation d\'un cluster Elasticsearch en production', '/assets/img/elastic-blog-2.png', 'Elasticsearch est un serveur de recherche open source populaire utilisé pour la recherche distribuée en temps réel et l’analyse de données. Lorsqu’il est utilisé pour autre chose que le développement, Elasticsearch doit être déployé sur plusieurs serveurs en tant que cluster, pour des performances, une stabilité et une évolutivité optimales', new Date(2019, 6, 18)),
    new Article('Dockeriser vos applications Spring boot', '/assets/img/docker-springboot.png', 'J\'ai decouvert Docker récemment durant ma mission à Bruxelles au sein de l\'acteur Buyway, leader sur le marché en solution de crédit. L\'idée d\'écrire une brève introduction sur le sujet m\'est arrivée durant ma collaboration avec l\'analyste Redouane. Dans cet article, vous apprendrez à créer une image Docker pour exécuter une application Spring Boot', new Date(2019, 5, 21)),
    new Article('Programmation reactive avec Spring 5', '/assets/img/reactive-springboot.png', 'Ces derniers temps, la programmation réactive a gagné en popularité auprès de la communauté des développeurs et des clients en raison de sa capacité à concevoir des applications de manière déclarative, et non impérative, ce qui a entraîné des applications plus réactives et résilientes.', new Date(2019, 6, 4)),
    new Article('L\'API Stripe', '/assets/img/stripe-springboot.png', 'L’air est au business sur internet. Qui dit business dit paiement. C’est à ce niveau que les choses se corsent pour les développeurs. De nombreuses plateformes existent sur le marché et choisir la bonne implémentation n\'est pas souvent chose aisée du fait du manque de documentation', new Date(2019, 5, 22)),
    new Article('JWT – JSON WEB TOKEN', '/assets/img/JWT-1.png', 'Introduction L\'utilisation d\'API tièrces au sein d\'applications est devenue monnaie courante. Ceci est dû au fait que les applications ne peuvent plus compter sur leurs propres données. Pour qu’un projet puisse voir son potentiel décuplé, il doit pouvoir avoir des applications tierces, s\'interopérer avec ces dernières et avoir facilement accès à ses données', new Date(2019, 3, 19)),
    new Article('Introduction au data binding ANGULAR 1 VS ANGULAR 2', '/assets/img/data-binding.png', 'En prévision de la formation sur angular 5, prévue en fin avril 2018, dans la NG-ACADEMY, j\'ai décidé de me pencher sur un des concepts de base d’angular: le data binding. Il existe plusieurs façons de lier des données dans Angular: interpolation, liaison unidirectionnelle (one way binding), liaison bidirectionnelle(two way binding) et liaison d\'événement(event binding)', new Date(2019, 3, 6))

  ];
  constructor() { }

  ngOnInit() {
  }

}
