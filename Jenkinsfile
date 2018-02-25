pipeline  {
   
    agent any
    tools {
        
        maven 'maven'
        jdk 'jdk8'
    }
    stages{
        stage ('Init') {
                  
                  steps {
                      
                      sh '''
                         echo "PATH = ${PATH}"
                         echo "M2_HOME = ${M2_HOME}"
                    '''
                  }

              }
        stage ('Build'){
            
            steps {
            if (env.BRANCH_NAME == "develop") {
                
                sh 'mvn install'
            }
			post {
                success {
                if (env.BRANCH_NAME == "develop") {
                    junit allowEmptyResults: true, testResults: '**/target/surefire-reports/*.xml'
                }
            }
        }
}

    }
}
}


