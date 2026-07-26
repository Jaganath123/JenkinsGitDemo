FROM openjdk:22-jdk
ADD target/jenkinsdemo.jar jenkinsdemo.jar
ENTRYPOINT ["java", "-jar", "jenkinsdemo.jar"]
