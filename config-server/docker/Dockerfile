FROM develar/java

MAINTAINER David Cuellar, davidokun99@gmail.com

RUN mkdir /usr/local/config-server/

ADD config-server.jar /usr/local/config-server/config-server.jar

WORKDIR /usr/local/config-server/

EXPOSE 9001

ENTRYPOINT ["java", "-jar", "config-server.jar", "--acceptLicense", "/usr/local/config-server"]