FROM openjdk:8-jre-alpine
ADD target/isht3ii-1.0-SNAPSHOT.jar H3_2.jar
ENTRYPOINT ["java","-jar", "H3_2.jar"]