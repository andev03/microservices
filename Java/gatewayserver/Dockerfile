#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

#Add the application's jar to the image
COPY target/gatewayserver-0.0.1-SNAPSHOT.jar gatewayserver-0.0.1-SNAPSHOT.jar
COPY opentelemetry-javaagent-2.11.0.jar /app/libs/opentelemetry-javaagent-2.11.0.jar

#execute the application
ENTRYPOINT ["java", "-jar", "gatewayserver-0.0.1-SNAPSHOT.jar"]