## Jenkins 

1. CI/CD
2. Installation 
3. Simple Jenkins Job 


Build - compiled code, jar , war... 
Triggers 


CRON job ? - Schedule a job 


Pre req - AWS linux
1. Git 



pipeline {
agent any

    stages {
        stage('Clone the github repo') {
            steps {
                git 'https://github.com/Surinder07/spring-crud.git'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn --version'
                echo 'Compiling the project'
                sleep 5
            }
        }
        stage('Build') {
            steps {
                echo 'Building....'
                sleep 10
            }
        }
        stage('Test') {
            steps {
                echo 'Testing....'
                sleep 10
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy...'
                sleep 10
            }
        }
    }
}
