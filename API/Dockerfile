FROM maven:3-openjdk-17-slim AS builder
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY . .
RUN mvn package -DskipTests

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

COPY --from=builder /app/target/API-0.0.1-SNAPSHOT.jar .
EXPOSE 8080

CMD ["java", "-jar", "API-0.0.1-SNAPSHOT.jar"]
