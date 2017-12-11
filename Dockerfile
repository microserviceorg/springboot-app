FROM ppc64le/ubuntu:xenial
RUN apt-get update && apt-get install -y openjdk-8-jdk && mkdir -p /var/www/java  
COPY target/springboot-app-0.0.1-SNAPSHOT.jar /var/www/java  
WORKDIR /var/www/java  
CMD java -jar springboot-app-0.0.1-SNAPSHOT.jar
