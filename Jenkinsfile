pipeline {
    agent any
    environment {
        DEPLOY_TO = 'production'
    }
    stages {
        stage ('buid') {
            steps {
                echo building the app
            }
        }
        stage ('anyOfstage') {
            when {
                anyOf {
                    environment name: 'DEPLOY_TO', value: 'DEV'
                    expression { BRANCH_NAME ==~ /(production|staging)/}
                }
            }
        }
    }
}
