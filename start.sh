#!/usr/bin/env bash
echo "docker-compose down"
docker-compose down --rmi all
echo "cd api"
cd api
echo "mvn clean install"
mvn clean install
echo "ng build"
cd ../app
ng build --aot --build-optimizer --prod
echo "docker-compose up"
cd ..
docker-compose up 
# force rebuild all image
# docker-compose up -d --force-recreate --build