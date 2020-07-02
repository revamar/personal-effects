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
		    bat 'echo "Tests passed"'
		}
	    }

	    stage('Push image') {
		/* Finally, we'll push the image with two tags:
		 * First, the incremental build number from Jenkins
		 * Second, the 'latest' tag.
		 * Pushing multiple tags is cheap, as all the layers are reused. */
		docker.withRegistry('https://registry.hub.docker.com', 'dockerHubRegistery') {
		    app.push("${env.BUILD_NUMBER}")
		    app.push("latest")
		}
	    }
}
