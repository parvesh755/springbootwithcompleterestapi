FROM openjdk:8
COPY target/bookmicroservice-0.0.1-SNAPSHOT.jar bookmicroservice.jar
ENTRYPOINT ["java","-jar","bookmicroservice.jar"]