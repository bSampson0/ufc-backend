FROM openjdk:18
EXPOSE 80
ADD target/ufc-backend.jar ufc-backend.jar
ENTRYPOINT ["java", "-jar", "/ufc-backend.jar"]