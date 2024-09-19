pipeline {
    agent any
    environment {
    }
    stages {
        stage ('build') {
            environment {
                GITHUB_CREDENTIALS = credentials('id name in jenkins under tools for ex:ram_git_pass')
            }
            steps {
                echo "GITHUB_CREDENTIALS are : ${GITHUB_CREDENTIALS}"
                echo "User id : ${GITHUB_CREDENTIALS_USR}"
                echo "Password is : ${GITHUB_CREDENTIALS_PSW}"
            }
        }
    }
}
