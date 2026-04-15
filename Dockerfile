FROM openjdk:17
WORKDIR /app
COPY target/SocketApp-1.0-SNAPSHOT.jar app.jar
CMD ["java", "-cp", "app.jar", "com.socket.app.Server"]