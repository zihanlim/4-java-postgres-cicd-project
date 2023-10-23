FROM maven:3.6.3 AS maven
# FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]


# EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "/app/app.jar"]
