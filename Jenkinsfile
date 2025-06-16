pipeline {
    agent any

    tools {
        maven 'Maven3' // Make sure Maven3 is set up in Jenkins Global Tools
        jdk 'Java17'   // Replace with the JDK name you configured
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Karthik1668/ticketbuy.git'
            }
        }

        stage('Build') {
            steps {
                dir('ticketbuy') {
                    sh 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                dir('ticketbuy') {
                    sh 'mvn test'
                }
            }
        }
    }
}
