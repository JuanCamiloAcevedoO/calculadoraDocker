FROM airhacks/wildfly
COPY /target/CalculadoraDocker-1.0.war ${DEPLOYMENT_DIR}/api.war
