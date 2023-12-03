FROM gradle:8.4-jdk17 as builder
WORKDIR /build

COPY . .
RUN gradle clean build -x test --parallel

# app
FROM amazoncorretto:17-alpine
WORKDIR /app
COPY --from=builder /build/build/libs/*-SNAPSHOT.jar ./app.jar

EXPOSE 8080

USER nobody
ENTRYPOINT ["java", "-jar", "app.jar"]