FROM openjdk:17-alpine

# RUN apt-get update
# RUN apt-get install
# RUN mvn clean package

# COPY ./pom.xml ./pom.xml
COPY ./target/docker-cicd-test-0.0.1-*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]