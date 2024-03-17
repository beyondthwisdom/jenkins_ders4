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
                    sh "echo  $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin"
                    def script = load 'script.groovy'
                    script.testBuildAndPushImage("", params.TEST_DOCKERHUB_REPO, params.VERSION, env.BUILD_NUMBER.toInteger())    
                }


              }
            }
        }

        stage('Manual Approval for Production') {
            when {
                expression {
                    return params.DEPLOY_TO_PROD
                }
            }
            steps {
                input message: 'Bu deploymentı prod ortamına yapmak istediğinizden emin misiniz?', ok: 'Deploy'
            }
        }        

        stage('Build and Push Production Prod Image') {
            steps {
              script {  
                withCredentials([usernamePassword(credentialsId: 'docker-credential', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                    sh "echo  $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin"
                    def script = load 'script.groovy'
                    script.prodBuildAndPushImage("", params.TEST_DOCKERHUB_REPO, params.VERSION, env.BUILD_NUMBER.toInteger())    
                }
              }
            }
        }


    }
}