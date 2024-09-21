pipeline {
    agent any
    stages {
        stage ('build') {
            steps {
                echo "builiding the app"
            }
        }
        stage ('scan') {
            parallel {
                stage ('sonar') {
                    steps {
                        echo "doing sonar"
                    }
                }
                stage ('fortify') {
                    steps {
                        echo "doing fortify"
                    }
                }
                stage ('scantool') {
                    steps {
                        echo "scanning"
                    }
                }
            }
        }
    }
}
