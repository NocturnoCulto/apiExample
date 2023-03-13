FROM openjdk:17-jdk-slim-buster

COPY build/libs/apiExample-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT java -jar app.jar
