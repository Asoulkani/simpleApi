FROM eclipse-temurin:17-jdk AS BUILD
LABEL authors="ASOULKANI"
WORKDIR /app
COPY pom.xml mvnw  ./
COPY .mvn .mvn
COPY src src
RUN chmod +x mvnw && ./mvnw -q -DskipTests package

FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=BUILD /app/target/SimpleApi-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]



