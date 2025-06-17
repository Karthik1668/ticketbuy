pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6'  // Use the name of Maven tool configured in Jenkins
        jdk 'Java 17'        // Use the name of JDK configured in Jenkins
    }

    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/Karthik1668/ticketbuy.git'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t ticketbuy-app .'
            }
        }

        stage('Stop Previous Container') {
            steps {
                sh 'docker stop ticketbuy-container || true'
                sh 'docker rm ticketbuy-container || true'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker run -d -p 8081:8080 --name ticketbuy-container ticketbuy-app'
            }
        }
    }
}
