pipeline {
  agent {
    node {
      label 'master'
    }

  }
  stages {
      stage('push til nexus') {
      steps {
        archiveArtifacts(allowEmptyArchive: true, artifacts: '*')
      }
    }

  }
}
