##
#chth's playground
##
FROM yingzhuo/java:8
MAINTAINER chengtaiheng "chth668@163.com"
VOLUME /chth
ADD springboot-springcloud-docker-kebernetes-service-1.0-SNAPSHOT.jar chth.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","chth.jar","--spring.profiles.active=default,docker"]