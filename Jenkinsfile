pipeline  {
    
	options {
	    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '10', artifactNumToKeepStr: '10', daysToKeepStr: '5', numToKeepStr: '5')), disableConcurrentBuilds(), pipelineTriggers([cron('@midnight'), [$class: 'PeriodicFolderTrigger', interval: '7d']])])	    
	    
	}

    agent any
    tools {
      
        maven 'maven'
        jdk 'jdk8'
    }
    
    stages{
        stage ('Init') {
                  
                  steps {
                      validateDeclarativePipeline 'Jenkinsfile'
                      sh '''
                         echo "PATH = ${PATH}"
                         echo "M2_HOME = ${M2_HOME}"
                    '''
                  }

              }
        stage ('Build'){
            
            steps {
                
                sh 'mvn install'
            }
			post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }


    }


}

