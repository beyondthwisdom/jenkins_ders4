pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo "Checking out ${env.BRANCH_NAME} branch"
                // Checkout commands go here
            }
        }

        stage('Build') {
            steps {
                echo "Building on ${env.NODE_NAME} in workspace ${env.WORKSPACE}"
                // Build commands go here
            }
        }

        stage('Test') {
            steps {
                script {
                    if (env.BUILD_NUMBER.toInteger() % 2 == 0) {
                        echo "Running tests on even build number ${env.BUILD_NUMBER}"
                        // Commands to run tests
                    } else {
                        echo "Skipping tests on odd build number ${env.BUILD_NUMBER}"
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying to ${env.JENKINS_URL}"
                // Deployment commands go here
            }
        }
    }
}
