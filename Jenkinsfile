pipeline  {
    if (branch == 'development'){
                  
              

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
                
                sh 'mvn install'
            }
			post {
                success {
                    junit allowEmptyResults: true, testResults: '**/target/surefire-reports/*.xml'
                }
            }
        }


    }

}
}

