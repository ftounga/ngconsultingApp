#!/usr/bin/env bash

sudo wget –O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat-stable/jenkins.repo
sudo mv jenkins.repo /etc/yum.repos.d/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key
sudo yum install jenkins
sudo systemctl start jenkins
sudo systemctl enable jenkins
sudo cat /var/lib/jenkins/secrets/initialAdminPassword

sudo mkfs -t ext4 /dev/xvdf
sudo mkdir /jenkins-volume
sudo mount /dev/xvdf /jenkins-volume/
