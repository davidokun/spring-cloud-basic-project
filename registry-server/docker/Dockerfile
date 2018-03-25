FROM develar/java

MAINTAINER David Cuellar, davidokun99@gmail.com

RUN mkdir /usr/local/registry-server/

ADD registry-server.jar /usr/local/registry-server/registry-server.jar

WORKDIR /usr/local/registry-server/

EXPOSE 9002

ENTRYPOINT ["java", "-jar", "registry-server.jar", "--acceptLicense", "/usr/local/registry-server"]