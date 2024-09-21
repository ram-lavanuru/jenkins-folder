pipeline {
    agent any
    environment {
        DEPLOY_TO = 'production'
    }
    stages {
        stage ('buid') {
            steps {
                echo 'building the app'
            }
        }
        stage ('anyOfstage') {
            when {                     //under when anyOf condition if anyone condtion satisfies it will execute the stage
                anyOf {
                    environment name: 'DEPLOY_TO', value: 'DEV'
                    expression { BRANCH_NAME ==~ /(production|staging)/}
                }
            }
            // when {          //under when allOf condition all conditions should  satisfy to execute the stage
            //     allOf {
            //         environment name: 'DEPLOY_TO', value: 'DEV'
            //         expression { BRANCH_NAME ==~ /(production|staging)/}
            //     }
            // }
            steps {
                echo "deploying to pro"
            }
        }
    }
}


// Tag with when condition

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
            steps {
                echo "deploying to prod"
            }
        }
    }
}
