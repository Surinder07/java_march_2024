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


======


pipeline {
agent any

    stages {
        stage('Clone the github repo') {
            steps {
                git 'https://github.com/Surinder07/SpringTest.git'
            }
        }
        stage('Check version') {
            steps {
                sh 'mvn --version'
               
            }
        }
        stage('Clean') {
            steps {
                sh 'mvn clean'
               
            }
        }
      
      stage('Compile') {
            steps {
                sh 'mvn compile'
               
            }
        }
         stage('Install ') {
            steps {
                sh 'mvn install'
               
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                echo 'Running test cases...'
               
            }
        }
        
        stage('Deploy to dev environement ') {
            steps {
                echo 'Deplopying to development env'
                sleep 10 
               
            }
        }
        
         stage('Deploy to Staging environement ') {
            steps {
                echo 'Deplopying to staing env'
                sleep 10
               
            }
        }
        
        stage('Deploy to Production  environement ') {
            steps {
                echo 'Deplopying to Production  env'
                sleep 10
               
            }
        }
      
    }
}




