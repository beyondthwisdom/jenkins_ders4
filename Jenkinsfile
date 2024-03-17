pipeline {
    agent any
    tools {
        maven 'maven 3.9.6'
    }
    parameters {
        string(name: 'DOCKERHUB_REPO', defaultValue: 'btwdevops/jenkinsders4', description: 'Docker Hub repository for production')
        string(name: 'TEST_DOCKERHUB_REPO', defaultValue: 'btwdevops/jenkinsders4test', description: 'Docker Hub repository for test')
        string(name: 'VERSION', defaultValue: '1.0.0', description: 'Version of the project')
        booleanParam(name: 'DEPLOY_TO_PROD', defaultValue: false, description: 'Deploy to production?')
    }



    stages {
        stage('Build and Push Production Test Image') {
            steps {
              script {  
                withCredentials([usernamePassword(credentialsId: 'docker-credential', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                      echo  $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin
                }
                def script = load 'script.groovy'
                script.testBuildAndPushImage("", params.TEST_DOCKERHUB_REPO, params.VERSION, env.BUILD_NUMBER.toInteger())

              }
            }
        }
    }
}