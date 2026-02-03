FROM openjdk:17-slim AS runtime
WORKDIR /app
COPY target/demo-service-1.jar /app/demo-service-1.jar
ENTRYPOINT ["java","-jar","demo-service-1.jar"]
