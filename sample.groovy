pipeline {
    agent any
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
    stages {
        stage('Deploy') {
            steps {
                echo "${params.Greeting} World!"
            }
        }
    }
}
