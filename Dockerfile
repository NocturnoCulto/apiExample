FROM openjdk:17-jdk-slim-buster
WORKDIR /build

COPY build/libs/* build/lib/

COPY build/libs/apiExample-0.0.1-SNAPSHOT.jar build/

WORKDIR /build
ENTRYPOINT java -jar apiExample-0.0.1-SNAPSHOT.jar
