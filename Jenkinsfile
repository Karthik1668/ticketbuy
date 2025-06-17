pipeline {
    agent any

    tools {
        maven 'Maven3'     // Must match Jenkins name exactly
        jdk 'Java17'       // Must match Jenkins name exactly
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t ticketbuy-app .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh '''
                docker stop ticketbuy-container || true
                docker rm ticketbuy-container || true
                docker run -d -p 8081:8080 --name ticketbuy-container ticketbuy-app
                '''
            }
        }
    }
}
