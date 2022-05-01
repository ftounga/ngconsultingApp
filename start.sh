#!/usr/bin/env bash
echo "docker-compose down"
echo "Every email will be sent to tounga.franck@ng-itconsulting.com"
#docker-compose down --rmi all
docker-compose down
echo "docker-compose up"
export MAIL_RECEIVER=tounga.franck@ng-itconsulting.com
source ~/.bashrc
docker-compose up -d
# tounga.franck@ng-itconsulting.com
# force rebuild all image
#docker-compose up --force-recreate --build
