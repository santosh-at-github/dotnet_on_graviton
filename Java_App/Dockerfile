FROM amazoncorretto:8u402-al2023-jre as build
RUN yum install git -y
WORKDIR /app
RUN git clone https://github.com/cmanikandan/aws-ecs-a1-corretto.git
RUN cd aws-ecs-a1-corretto && ./gradlew build

FROM amazoncorretto:8
VOLUME /tmp
COPY --from=build /app/aws-ecs-a1-corretto/build/libs/gs-spring-boot-docker-0.1.0.jar ./app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

