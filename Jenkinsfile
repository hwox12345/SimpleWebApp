node {
   stage('Preparation') {
      git 'https://github.com/hw0x12345/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}