FROM eclipse-temurin:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} springbootCURD.jar
ENTRYPOINT ["java","-jar","/springbootCURD.jar"]