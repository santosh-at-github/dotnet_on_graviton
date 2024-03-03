FROM amazoncorretto:8u402-al2023-jre as build
RUN yum install git -y
WORKDIR /app
RUN git clone https://github.com/santosh-at-github/dotnet_on_graviton.git
RUN cd dotnet_on_graviton && git checkout Java_App && cd Java_App && ./gradlew build

FROM amazoncorretto:8
VOLUME /tmp
COPY --from=build /app/dotnet_on_graviton/Java_App/build/libs/gs-spring-boot-docker-0.1.0.jar ./app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
