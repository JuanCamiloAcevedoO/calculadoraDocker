FROM tomcat:8.0.20-jre8
COPY /target/CalculadoraDocker-1.0.war /usr/local/tomcat/webapps/api.war
EXPOSE 7593