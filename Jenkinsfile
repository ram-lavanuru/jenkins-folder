pipeline {
    agent any
    parameters {
        string(name: 'PERSON', defaultValue: 'ram', description: 'Who should I say hello to?')
    }
    stages {
        stage ('parametresFile') {
            steps {
                echo "Hello, ${params.PERSON}"
            }
        }
    }
}
