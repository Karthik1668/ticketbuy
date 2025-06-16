pipeline {

    agent any



    tools {

        maven 'Maven3'   // matches the Maven tool you installed

        jdk    'Java17'  // matches the JDK tool you installed

    }



    stages {

        stage('Checkout') {

            steps {

                git branch: 'ticketbuy', url: 'https://github.com/Karthik1668/ticketbuy.git'

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
