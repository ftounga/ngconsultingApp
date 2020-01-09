FROM maven:3.6.3-jdk-11-slim
RUN mkdir /usr/src/api
COPY pom.xml /usr/src/api
WORKDIR /usr/src/api
RUN mvn verify --fail-never
COPY . /usr/src/api
RUN mvn clean install
WORKDIR /usr/src/api/target
EXPOSE 8080
CMD ["java", "-jar", "api-0.0.1-SNAPSHOT.jar"]
