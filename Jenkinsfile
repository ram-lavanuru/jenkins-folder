pipeline {
    agent any
    stages {
        stage ('build'){
            steps {
                echo "building the app"
            }
        }
        stage ('sonar') {
            steps {
                echo "doing sonar"
            }
        }
        stage ('docker build') {
            steps {
                echo "creating image"
            }
        }
        stage ('docker push') {
            steps {
                echo "pushing to jfrog"
            }
        }
        stage ("deploy to dev") {
            steps {
                echo "deploying to dev"
            }
        }
        stage ("deploy to test") {
            when {
                branch 'release/*'
            }
            steps {
                echo "deploying to test"
            }
        }
        stage ("deploy to prod") {
            when {
                tag pattern: "v\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}", comparator: "REGEXP"
            }
            steps {
                echo "deploying to prod"
            }
        }
    }
}
