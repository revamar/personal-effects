node {
    def app
 
	    stage('Clone repository') {
		/* Let's make sure we have the repository cloned to our workspace */
		checkout scm
	    }
	    stage('Unit Tests'){
			   bat "mvn -f assignment2-web-app/pom.xml install --settings assignment2-web-app/settings.xml"
			} 

	    stage('Build image') {

		app = docker.build("dockerdudeamar/webapp-alpine", "./assignment2-web-app/")
	    }

	    stage('Test image') {
		/* Ideally, we would run a test framework against our image.
		 * For this example, we're using a Volkswagen-type approach ;-) */

		app.inside {
			sh 'make test'
		}
	    }

	    stage('Push image') {
		docker.withRegistry('https://registry.hub.docker.com', 'dockerHubRegistery') {
		    app.push("${env.BUILD_NUMBER}")
		    app.push("latest")
		}
	    }
}
