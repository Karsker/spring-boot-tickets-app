pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Archive') {
            steps {
                sh 'ls target/'
            }
        }
    }
}