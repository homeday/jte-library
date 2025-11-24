def call() {
    stage('Turnover') {
        echo 'Turn over application...'
        // Add your deployment logic here
        sh "echo train turnover -m ${config.chg}"
    }
}