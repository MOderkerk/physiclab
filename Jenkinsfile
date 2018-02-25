pipeline  {
    
    agent any
    tools {
        
        maven 'maven'
        jdk 'jdk8'
    }
    stages{
        stage ('Init') {
                  validateDeclarativePipeline 'Jenkinsfile'
                  steps {
                      
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

