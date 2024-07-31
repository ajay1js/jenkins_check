pipeline {
    agent any
    stages {
        stage('Deploy') {
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
