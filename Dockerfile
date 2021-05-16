FROM openjdk:11
EXPOSE 8080
ADD target/energybotnoaa2017docker.jar energybotnoaa2017docker.jar
ENTRYPOINT ["java","-jar","energybotnoaa2017docker.jar"]