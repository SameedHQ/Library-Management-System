# Use the official OpenJDK 21 image as a base
FROM openjdk:21-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR
COPY target/library-api.jar library-api.jar

# Expose the port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "library-api.jar"]
