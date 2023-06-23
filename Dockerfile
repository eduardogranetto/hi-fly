FROM openjdk:20-slim-buster as builder
WORKDIR /app
COPY . /app
WORKDIR /app
RUN ./gradlew clean b

FROM openjdk:20-jdk as runner
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar /app/app.jar
WORKDIR /app
ENTRYPOINT java -jar app.jar