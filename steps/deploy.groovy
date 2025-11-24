def call() {
    stage('Deploy') {
        echo 'Deploying application...'
        // Add your deployment logic here
        sh "echo train deploy -m ${config.chg}"
    }
}