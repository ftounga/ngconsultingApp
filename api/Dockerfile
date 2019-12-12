FROM openjdk:11-jre-slim
COPY ./target/api-0.0.1-SNAPSHOT.jar /usr/src/api/
WORKDIR /usr/src/api
EXPOSE 8080
ENV SPRING_PROFILES_ACTIVE=local
CMD ["java", "-jar", "api-0.0.1-SNAPSHOT.jar"]
