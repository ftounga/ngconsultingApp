#!/usr/bin/env bash
MAIL_RECEIVER=$1
if [ $# = 0 ]
then
    echo "No arguments recieved ! You should specify your email"
	exit 1 
fi
echo "docker-compose down"
echo "Every email will be sent to $MAIL_RECEIVER"
docker-compose down --rmi all
#echo "cd api"
#cd api
#echo "mvn clean install"
#mvn clean install
echo "ng build"
cd app
ng build --aot --build-optimizer --prod
echo "docker-compose up"
cd ..
export MAIL_RECEIVER=$MAIL_RECEIVER
docker-compose up
# tounga.franck@ng-itconsulting.com
# force rebuild all image
# docker-compose up --force-recreate --build
