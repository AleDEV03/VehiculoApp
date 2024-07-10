
FROM openjdk:22.0.1-jdk-slim


WORKDIR /app


COPY src/VehiculoApp.jar .


CMD ["java", "-jar", "VehiculoApp.jar"]