#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

#Add the application's jar to the image
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar
COPY opentelemetry-javaagent-2.11.0.jar /app/libs/opentelemetry-javaagent-2.11.0.jar

#execute the application
ENTRYPOINT ["java", "-jar", "configserver-0.0.1-SNAPSHOT.jar"]