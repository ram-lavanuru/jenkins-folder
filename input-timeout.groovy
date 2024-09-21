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
            steps {
                echo "deploying to test"
            }
        }
        stage ("deploy to prod") {
            options {
                timeout(time: 10, unit: 'SECONDS')
            }
            input {
                message "is everything good to deploy to prod ?"
                ok "yes"
                submitter "admin"  //Active Directory or jenkins database user name
            }
            steps {
                echo "deploying to prod"
            }
        }
    }
}
