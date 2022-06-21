FROM openjdk:17-slim-buster

WORKDIR /app

COPY infrastructure/src/main/java/com/nogueira/catalog/admin/infrastructure .

CMD java Main.java