pipeline {
    agent any
    options {
        buildDiscarder(logRotator(numToKeepStr: '3'))
    }
    stages {
            stage ('build') {
        steps {
            echo "building the app"
        }
    }

    }
}
