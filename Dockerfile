
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY src/VehiculoApp.jar .

CMD ["java", "-jar", "VehiculoApp.jar"]