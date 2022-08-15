FROM openjdk:8
EXPOSE 10100
ADD target/java12feb2022-0.0.1-SNAPSHOT.jar restapp14822docker.jar
ENTRYPOINT ["java","-jar","/restapp14822docker.jar"]