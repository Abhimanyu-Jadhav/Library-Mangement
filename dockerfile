# Use OpenJDK 17 runtime image
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy JAR file from target directory
COPY target/library-management-1.0.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]