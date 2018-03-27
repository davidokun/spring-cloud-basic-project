FROM develar/java

MAINTAINER David Cuellar, davidokun99@gmail.com

RUN mkdir /usr/local/game-service

ADD game-service.jar /usr/local/game-service/game-service.jar

WORKDIR /usr/local/game-service

EXPOSE 9003

ENTRYPOINT ["java", "-jar", "game-service.jar", "--acceptLicense", "/usr/local/game-service"]