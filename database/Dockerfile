#FROM ubuntu:latest
FROM eclipse-temurin:17-jdk
LABEL authors="santa"

WORKDIR /app

#Here meation two file source and distination and Copy the jar file
#ADD database-0.0.1-SNAPSHOT.jar
COPY target/database-0.0.1-SNAPSHOT.jar app.jar
#set working directory
ENTRYPOINT ["java", "-jar","app.jar"]

EXPOSE 8080