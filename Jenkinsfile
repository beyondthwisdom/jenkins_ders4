pipeline {
    agent any

    environment {
        // Kimlik bilgilerini ortam değişkenlerine atayarak kullanın
        MY_SECRET = credentials('github-credential')
        
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code...'
                // Checkout commands go here
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'
                // Build commands go here
            }
        }

        stage('Deploy') {
            steps {
                
                echo 'Deploying...'
                sh '''
                def (username, password) = env.MY_SECRET.split(':', 2)
                # Use the credentials securely
                echo "Deploying using ${username} user"
                # Insert deployment commands here
                # For example, using credentials to authenticate against a server
                '''
            }
        }
    }
}
