FROM eclipse-temurin:17.0.8.1_1-jre-alpine
ARG JAR_FILE=target/passwordgenrator-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE  8080