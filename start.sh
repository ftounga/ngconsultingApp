#!/usr/bin/env bash
MAIL_RECEIVER=$1
if [ $# = 0 ]
then
    echo "No arguments recieved ! You should specify your email"
	exit 1 
fi
echo "docker-compose down"
echo "Every email will be sent to $MAIL_RECEIVER"
#docker-compose down --rmi all
docker-compose down
echo "docker-compose up"
export MAIL_RECEIVER=$MAIL_RECEIVER
docker-compose up
# tounga.franck@ng-itconsulting.com
# force rebuild all image
# docker-compose up --force-recreate --build
