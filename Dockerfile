#FROM openjdk:8
#EXPOSE 8081
#ADD target/java12feb2022-0.0.1-SNAPSHOT.jar java12feb2022-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/java12feb2022-0.0.1-SNAPSHOT.jar"]

# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN mvnw dependency:resolve

COPY src ./src

CMD ["mvnw", "spring-boot:run"]