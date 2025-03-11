FROM openjdk:20
ADD ./News-Application-0.0.1-SNAPSHOT.jar News-Application-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java",".jar","News-Application-0.0.1-SNAPSHOT.jar"]