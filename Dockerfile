# the base image
#FROM amazoncorretto:21

# the JAR file path
#ARG JAR_FILE=target/*.jar

# Copy the JAR file from the build context into the Docker image
#COPY ${JAR_FILE} application.jar

# Set the default command to run the Java application
#ENTRYPOINT ["java", "-jar", "/application.jar"]

# The base image on which we would build our image
FROM amazoncorretto:21-alpine-jdk

# Install curl and maven
RUN apk --no-cache add curl maven

# Set environment variables
ENV DB_HOST=${DB_HOST}
ENV DB_NAME=${DB_NAME}
ENV DB_USER=${DB_USER}
ENV DB_PASS=${DB_PASS}

# Expose port 8080
EXPOSE 8080

# Set the working directory
WORKDIR /app

# Copy the pom.xml file to the working directory
COPY pom.xml .

# Resolve the dependencies in the pom.xml file
RUN mvn dependency:resolve

# Copy the source code to the working directory
COPY src src

# Build the project
RUN mvn package -DskipTests

# Run the application
ENTRYPOINT ["java", "-jar", "target/application.jar"]