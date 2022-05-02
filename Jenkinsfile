pipeline {
   agent {
      docker {
         image 'maven:3.6.3-jdk-11-slim'
         args '-u root:root -v ${MAVEN_SETTINGS_FOLDER}:/root/.m2'
      }
   }
   stages{
      stage("build"){
         steps{
            echo 'building the application ....'
            sh "cd api"
            sh "mvn clean install -DskipTests"
         }
      }
      stage("Test"){
         steps{
            echo 'test the application ....'
            sh "mvn verify"
         }
      }
      stage("nexus deploy"){
         steps{
            echo 'deploy the binary ....'
            sh "docker build -t ftounga/ngapp-api:1.0"
            sh "docker push ftounga/ngapp-api:1.O"
         }
      }
   }
   post {
      cleanup{
         deleteDir()
      }
      failure {
         mail to: "ntounga@gmail.com",
         subject: "Build ${currentBuild.fullDisplayName} FAILED",
         body: "Le build du module ${currentBuild.fullDisplayName} est FAILED : ${env.BUILD_URL}"
      }
   }
}
