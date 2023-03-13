FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY build/libs/apiExample-0.0.1-SNAPSHOT.jar app/

WORKDIR /app
ENTRYPOINT java -jar apiExample-0.0.1-SNAPSHOT.jar
