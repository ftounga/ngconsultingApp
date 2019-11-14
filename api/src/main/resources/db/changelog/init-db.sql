-- Init users table
INSERT INTO users (id_user, name, email, age) VALUES (1, 'Franck', 'ntounga@gmail.com', 30);

-- Init formation table
INSERT INTO formation (id, title, url_img, location, lesson_count, total_minutes) values (1, 'Mise en place serveur', '/assets/img/apache.png', 'https://toungafranck.com/mise-en-place-serveur/', 13, 163);
INSERT INTO formation (id, title, url_img, location, lesson_count, total_minutes) values (2,'Jenkins', '/assets/img/jenkins.png', 'https://toungafranck.com/jenkins-3/', 15, 170);
INSERT INTO formation (id, title, url_img, location, lesson_count, total_minutes) values (3,'Elasticsearch', '/assets/img/elasticsearch.png', 'https://toungafranck.com/elastic/', 22, 240);
INSERT INTO formation (id, title, url_img, location, lesson_count, total_minutes) values (4,'Docker', '/assets/img/docker-1.png', '', 0, 0);

-- Init formation table
insert into lesson (id_lesson, title, source_url, duration, preview, id_formation) values (1, '1- Presentation de la formation', 'https://www.youtube.com/embed/9UYMwwXR8tQ', 7, 'Dans le cadre de la mise en place d’un environnement de développement, il est nécessaire de configurer un serveur Web. Il sera question ici de présenter les différents modules qui vous permettent d’y arriver.', 1);
insert into lesson (id_lesson, title, source_url, duration, preview, id_formation) values (2, '2- Installation Ubuntu', 'https://www.youtube.com/embed/x7ykUoFzClQ', 9, 'Afin de ne pas avoir à souscrire à un serveur dédié, on utilisera une machine virtuelle via VirtualBox. Cet outil nous permettra de faire tourner un OS embarqué (Linux) sur notre machine', 1);
insert into lesson (id_lesson, title, source_url, duration, preview, id_formation) values (3, '3- Les commandes Unix Part 1', 'https://www.youtube.com/embed/HV8v8ileO5w', 15, 'Découverte des commandes qui vous permettrons de naviguer aisément dans le terminal UNIX:cd, ls, mv, ln', 1);
insert into lesson (id_lesson, title, source_url, duration, preview, id_formation) values (4, '4- Les commandes Unix Part 2', 'https://www.youtube.com/embed/NuOY10c0M30', 15, '2ème partie sur les commandes UNIX qui vous permettrons de gérer les permissions attribuées à vos fichiers, les propriétaires associés et celle qui vous permettrons de mettre à jour et d’installer de nouveaux paquets sur UNIX: chmod, chown, apt-get', 1);
