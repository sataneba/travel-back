FROM openjdk:11-jdk-slim

COPY worker/src /usr/src/trvlback/worker/src
COPY worker/build /usr/src/trvlback/worker/build

WORKDIR /usr/src/trvlback/worker

CMD java -jar build/libs/*SNAPSHOT.jar
