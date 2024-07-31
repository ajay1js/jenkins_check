pipeline {
    agent any
    parameters {
        gitParameter(name: 'TAG', type: 'PT_TAG', defaultValue: 'main')
	string(name: 'NAME', description: 'Please tell me your name')
	choice(name: 'GENDER', choices: ['Male', 'Female'], description: 'Choose Gender')
    }
    stages {
        stage('Example') {
            steps {
                checkout([$class: 'GitSCM',
                          branches: [[name: "${params.TAG}"]],
                          doGenerateSubmoduleConfigurations: false,
                          extensions: [],
                          gitTool: 'Default',
                          submoduleCfg: [],
                          userRemoteConfigs: [[url: 'https://github.com/ajay1js/jenkins_check.git']]
                        ])
            }
        }
    }
}
