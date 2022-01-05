pipeline {
  agent {
    node {
      label 'ubuntu'
    }

  }
  stages {
    stage('allocate node') {
      steps {
        node(label: 'ubuntu')
      }
    }

    stage('push til nexus') {
      steps {
        archiveArtifacts(allowEmptyArchive: true, artifacts: '*')
      }
    }

  }
}