pipeline {
    agent any
    environment {
        CC = 'clang'
    }
    stages {
        stage('Deploy') {
            environment {
                DEBUG_FLAGS = '-g'
            }
	    when {
	      expression {
	          currentBuild.result == null || currentBuild.result == 'SUCCESS'
		  }
		  }
            steps {
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            }
        }
    }
}
