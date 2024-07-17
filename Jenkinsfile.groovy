pipeline{
    agent any
    stages{
        stage('BUILD'){
            steps{
                echo "Creating build for ${params.ENVIRONMENT} on ${params.PLATFORM} platform"
            }
        }
        stage('RUN AUTOMATION'){
            steps{
                echo "Running Automation on ${params.BROWSER} browser"
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