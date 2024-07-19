pipeline{
    agent any
    parameters {
      gitParameter branchFilter: 'origin/(.*)', defaultValue: 'main', name: 'BRANCH', type: 'PT_BRANCH'
    }
    stages{
        stage('BUILD'){
            steps{
                echo "Checking Linux commands"
            }
        }
        stage('RUN AUTOMATION'){
            steps{
                echo "Hello, "
		echo "hello from bash"
		echo "Who I'm $SHELL"
            }
        }
        stage('Deploy'){
            steps{
                echo "Deploying on ${params.ENVIRONMENT} server"
            }
        }
    }
    post{
        success{
            echo "Pipeline compeleted successfully"
        }
        failure{
            echo "Pipeline failed"
        }
    }
}
