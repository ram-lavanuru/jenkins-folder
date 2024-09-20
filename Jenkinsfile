pipeline {
    agent any
    stages {
        stage (build) {
            steps {
                echo "buildig the application"
            }
        }
        stage ('deployToProd') {
            when {
                //if branch is production or staging we need to deploy
                expression { BRANCH_NAME ==~ /(production|staging)/}
            }
                steps {
                    echo "deploying to production "
                }
        }
    }
}
