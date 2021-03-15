node {
   stage('Preparation') {
      git 'https://github.com/hwox12345/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}