FROM openjdk:17
WORKDIR /app

COPY ./target/user-service-0.0.1-SNAPSHOT.jar ./target/user-service-0.0.1-SNAPSHOT.jar

EXPOSE 8082

CMD ["java", "-jar", "./target/user-service-0.0.1-SNAPSHOT.jar"]
