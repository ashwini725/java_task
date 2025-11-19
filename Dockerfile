FROM eclipse-temurin:11-jdk
COPY target/java-task-1.0-SNAPSHOT.jar /app/myapp.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "myapp.jar"]
