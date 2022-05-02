pipeline {
   agent {
      docker {
         image 'maven:3.6.3-jdk-11-slim'
         args '-u root:root -v /home/${USER}/.m2:/root/.m2'
      }
   }
   stages{
      stage("build"){
         steps{
            echo 'building the application ....'
            dir("api") {
                sh "pwd"
                sh "mvn clean install -DskipTests"
            }
         }
      }
      stage("Test"){
         steps{
            echo 'test the application ....'
            dir("api") {
                sh "pwd"
                sh "mvn verify"
            }

         }
      }
      stage("nexus deploy"){
         steps{
            echo 'deploy the binary ....'
            dir("api") {
                sh "pwd"
                sh "docker build -t ftounga/ngapp-api:1.0"
                sh "docker push ftounga/ngapp-api:1.O"
            }
         }
      }
   }
}
