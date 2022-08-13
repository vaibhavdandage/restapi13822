FROM openjdk:8
EXPOSE 10100
ADD target/speedydev-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]