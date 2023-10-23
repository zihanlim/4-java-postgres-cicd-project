FROM maven:3.8.2-openjdk AS maven
# FROM eclipse-temurin:17-jdk-jammy
# FROM openjdk:17

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]


# EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "/app/app.jar"]
