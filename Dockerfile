# FROM openjdk:17
# dec 27 commented the above line 

FROM eclipse-temurin:17-jdk
COPY target/demo-app.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "demo-app.jar"]
