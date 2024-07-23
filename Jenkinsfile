pipeline{
    agent any
    parameters {
      gitParameter  name: 'TAG', type: 'PT_TAG', defaultValue: 'main'
    }
    stages{
        stage('BUILD'){
            steps{
                checkout([$class: 'GitSCM',
                         branches: [[name: "${params.TAG}"]],
                         doGenerateSubmoduleConfigurations: false,
                         extensions: [],
                         gitTool: 'Default',
                         submoduleCfg: [],
                         userRemoteConfigs: [[url: 'https://github.com/ajay1js/jenkins_check.git']]
                         echo "Checking Linux commands intentionally"])
            }
        }
        stage('RUN AUTOMATION'){
            steps{
                echo "Hello, "
                echo "hello from bash"
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

AzureAD+AjayLakshminarayana@LAPTOP-J1SGE23M MINGW64 ~/Desktop/DataEngineering_Projects/jenkins_check (main)
$ cat Jenkinsfile
pipeline{
    agent any
    parameters {
      gitParameter  name: 'TAG', type: 'PT_TAG', defaultValue: 'main'
    }
    stages{
        stage('BUILD'){
            steps{
                checkout([$class: 'GitSCM',
                         branches: [[name: "${params.TAG}"]],
                         doGenerateSubmoduleConfigurations: false,
                         extensions: []
                         gitTool: 'Default',
                         submoduleCfg: [],
                         userRemoteConfigs: [[url: 'https://github.com/ajay1js/jenkins_check.git']]
                echo "Checking Linux commands"])
            }
        }
        stage('RUN AUTOMATION'){
            steps{
                echo "Hello, "
                echo "hello from bash"
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
