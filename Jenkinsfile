pipeline {
  agent {
    node {
      label 'ubuntu'
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
