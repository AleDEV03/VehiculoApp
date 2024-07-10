//Utiliza una imagen base de Java
FROM openjdk:22.0.1-jdk-slim

//Establece el directorio de trabajo
WORKDIR /app

//Copia el archivo JAR en el contenedor
COPY src/VehiculoApp.jar .

//Comando para ejecutar tu aplicación
CMD ["java", "-jar", "VehiculoApp.jar"]