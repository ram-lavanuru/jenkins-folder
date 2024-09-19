pipeline {
    agents any
    environment {
        courses = "k8s"
        batch = "12"
        cloud = "aws"
        name = "siva"
    }
stages {
    stage ('firstStage') {
        environment {
            cloud = "gcp"
            name = "ram"
        }
        steps {
            echo "welcome ${name}"
            echo "you have enrolled to ${courses}"
            echo "you certified in ${cloud}"
        }

    }
    stage ('secondStage') {
        environment {
            name = "ram"
        }
        steps {
            echo "welcome ${name}"
            echo "you have enrolled to ${courses}"
            echo "you certified in ${cloud}"
        }

    }
}
}
