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

    // Global script variable
    def script

    stages {
        stage('Init') {
            steps {
                script {
                    script = load 'script.groovy'
                }
            }
        }
        stage('Build and Push Test Image') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker-credential', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                    sh "docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD"
                }    
                script.testBuildAndPushImage("", params.TEST_DOCKERHUB_REPO, params.VERSION, env.BUILD_NUMBER.toInteger())

            }
        }
        stage('Manual Approval for Production') {
            when {
                expression {
                    return params.DEPLOY_TO_PROD
                }
            }
            steps {
                input message: 'Approve deployment to production?', ok: 'Deploy'
            }
        }
        stage('Build and Push Production Image') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: 'docker-credential', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                        sh "docker login -u $DOCKER_USERNAME -p $DOCKER_PASSWORD"
                    }
                    script.prodBuildAndPushImage("prod", params.DOCKERHUB_REPO, params.VERSION, env.BUILD_NUMBER.toInteger())

                }
            }
        }
    }
}
