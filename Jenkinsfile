pipeline{
    agent any
    parameters {
      gitParameter branchFilter: 'origin/(.*)', defaultValue: 'main', name: 'BRANCH', type: 'PT_BRANCH'
    }
    stages{
        stage('BUILD'){
            steps{
                echo "Creating build for ${params.BRANCH} platform"
            }
        }
        stage('RUN AUTOMATION'){
            steps{
                echo "Running Automation on ${params.BRANCH} browser"
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
