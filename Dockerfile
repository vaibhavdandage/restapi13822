FROM openjdk:8
EXPOSE 8081
ADD target/java12feb2022-0.0.1-SNAPSHOT.jar java12feb2022-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/java12feb2022-0.0.1-SNAPSHOT.jar"]
