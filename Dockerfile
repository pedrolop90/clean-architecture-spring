FROM openjdk:11-jdk-alpine
LABEL Pedro Jose Lopez Suarez <pedrolop90@gmail.com>
RUN mkdir /app
COPY ./applicacion/app/target/controller-1.0-SNAPSHOT.jar /app/
WORKDIR /app
CMD ["java","-jar","controller-1.0-SNAPSHOT.jar"]