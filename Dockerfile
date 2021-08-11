FROM openjdk:11

COPY ./target/names-0.0.1.jar /usr/
WORKDIR /usr/

EXPOSE 8080

CMD ["java", "-jar", "names-0.0.1.jar"]