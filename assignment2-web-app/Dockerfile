FROM tomcat:8.0.20-jre8
MAINTAINER selenium.xpert@gmail.com
LABEL devops.qa.assignment.version="0.0.0-SNAPSHOT"
LABEL devops.qa.assignment.base.package="webapps"
ADD target/assignment2-web-app.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD chmod +x /usr/local/tomcat/bin/catalina.sh
CMD ["catalina.sh", "run"]

