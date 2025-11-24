def call() {
    stage('Promote') {
        echo 'Promote application...'
        // Add your deployment logic here
        sh "echo train promote -m ${config.chg}"
    }
}