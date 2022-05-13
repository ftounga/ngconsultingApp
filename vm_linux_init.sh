#!/usr/bin/env bash

#install NodeJs
echo '*********************************** NodeJs installation *******************************************'
curl -sL https://rpm.nodesource.com/setup_16.x | sudo bash -
sudo yum install nodejs

# Install Git and clone project
echo '************************************** Install git and clone ngconsultingApp **********************************'
sudo yum install git
mkdir /home/${USER}/dev
mkdir /home/${USER}/dev/tools/jenkins -p
cd /home/${USER}/dev
git clone https://github.com/ftounga/ngconsultingApp.git

# Download angular library in node modules
echo '************************************* Download angular library in node modules ********************************'
cd /home/${USER}/dev/ngconsultingApp/app
npm install

# Install docker and docker-compose
echo '**************************** Install docker, docker-compose and enable service at bootup *******************************'
sudo yum install docker
wget https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)
sudo mv docker-compose-$(uname -s)-$(uname -m) /usr/local/bin/docker-compose
sudo chmod -v +x /usr/local/bin/docker-compose
sudo usermod -aG docker ec2-user
sudo systemctl enable docker.service
sudo systemctl start docker.service

# Install Maven
echo '********************* Install Maven ***********************'
sudo yum install maven
echo 'export MAVEN_SETTINGS_FOLDER=/home/${USER}/.m2' >> /home/ec2-user/.bashrc


# Install java and download maven libraries
echo '**************** Install java and download maven libraries **************************'
sudo amazon-linux-extras install java-openjdk11
sudo alternatives --config java
echo 'export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-11.0.13.0.8-1.amzn2.0.3.x86_64' >> /home/ec2-user/.bashrc
echo 'export JENKINS_HOME=/home/ec2-user/dev/tools/jenkins' >> /home/ec2-user/.bashrc
source ~/.bashrc

cd /home/${USER}/dev/ngconsultingApp/api
mvn verify

# Install jenkins and enable it at boot up
echo 'Install jenkins and enable it at boot up'

cd /home/${USER}
sudo wget –O /etc/yum.repos.d/jenkins.repo http://pkg.jenkins-ci.org/redhat-stable/jenkins.repo
sudo mv jenkins.repo /etc/yum.repos.d/jenkins.repo
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key
sudo yum install jenkins
sudo chown jenkins:jenkins /home/${USER}/dev/tools/jenkins/
sudo usermod -aG docker jenkins
sudo systemctl enable jenkins
sudo systemctl start jenkins


echo  '************************************* Cron job jenkins backup ***********************************************'
mkdir -p /home/${USER}/dev/tools/cron/
cd /home/${USER}/dev/tools/cron/
touch backup-jenkins.sh
echo 'sudo cp -R /var/lib/jenkins/* /home/ec2-user/dev/tools/jenkins/' > backup-jenkins.sh
sudo -i
echo '0 8 * * * sh /home/ec2-user/dev/tools/cron/backup-jenkins.sh' > /var/spool/cron/ec2-user

echo  '************************************* Retrieve jenkins password ***********************************************'
sudo cat /var/lib/jenkins/secrets/initialAdminPassword
