//atleast one condition should be specified
//if more than one condition all must return true
/*pipeline {
    agent any
    environment {
        DEPLOY_TO = 'production' //just an environment variable
    }
    stage ('when stage') {
        when {
            environment name: 'DEPLOY_TO', value: 'production'
        }
        steps {
            echo "deploying to when stage"
        }
    }
}*/

/*pipeline {
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
                expression { BRANCH_NAME ==~ /(production|staging)/}  // branch name predefinded environment variable
            }
                steps {
                    echo "deploying to production "
                }
        }
    }
}*/




//anyOf condition 

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


