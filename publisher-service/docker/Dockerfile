FROM develar/java

MAINTAINER David Cuellar, davidokun99@gmail.com

RUN mkdir /usr/local/publisher-service

ADD publisher-service.jar /usr/local/publisher-service/publisher-service.jar

WORKDIR /usr/local/publisher-service

EXPOSE 9004

ENTRYPOINT ["java", "-jar", "publisher-service.jar", "--acceptLicense", "/usr/local/publisher-service"]