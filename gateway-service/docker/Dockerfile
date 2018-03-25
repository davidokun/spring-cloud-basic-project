FROM develar/java

MAINTAINER David Cuellar, davidokun99@gmail.com

RUN mkdir /usr/local/gateway-server/

ADD gateway-server.jar /usr/local/gateway-server/gateway-server.jar

WORKDIR /usr/local/gateway-server/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "gateway-server.jar", "--acceptLicense", "/usr/local/gateway-server"]