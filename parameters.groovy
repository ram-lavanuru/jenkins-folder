/*pipeline {
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

*/

// complex 

pipeline {
    agent any
    parameters {
        string(name: 'CHANGE_NUM', defaultValue: 'CHG12345', description: 'Enter the change number')
        booleanParam(name: 'is SRE approved', defaultValue: "true", description: 'is approval taken')
        choice(name: 'RELEASE', choices: 'Regular\nHotfix', description: 'what release is this?')
        password(name: 'password', defaultValue: 'admin123', description: 'enter the password')
        credentials(name: 'mycreds', description: 'mydockercreds', required: 'true')
    }
    stages {
    stage ('DeployToDev') {
        steps{
            echo "deployed to dev"
        }
    }
    stage ('DeployToProd') {
        steps {
        echo "your change ticket number is ${params.CHANGE_NUM}"
        echo "deploy to prod"
        echo "this release is ${params.RELEASE}"
        echo "your passowrd is ${params.password}"
        echo "selected credentials are ${mycreds}"
        }
    }
    }
}
