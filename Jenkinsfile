ipeline {
    agent any

    tools {
        maven 'Maven 3.9.6'
        jdk 'Java 17'
    }

    environment {
        PROJECT_DIR = 'ticketbuy'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'ticketbuy',
                    url: 'https://github.com/Karthik1668/ticketbuy.git'
            }
        }

        stage('Build') {
            steps {
                dir("${env.PROJECT_DIR}") {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                dir("${env.PROJECT_DIR}") {
                    sh 'mvn test'
                }
            }
        }
    }
}
