pipeline {

    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {

        stage('Build') {

            steps {
                echo 'Building Maven Project'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {

            steps {
                echo 'Running Test Cases'
                sh 'mvn test'
            }
        }

        stage('Package') {

            steps {
                echo 'Packaging Application'
                sh 'mvn package'
            }
        }

        stage('Deploy') {

            steps {
                echo 'Deployment Stage Completed'
            }
        }
    }
}
