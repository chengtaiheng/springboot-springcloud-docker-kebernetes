##
# chth's playground
##

FROM yingzhuo/java:8
MAINTAINER chengtaiheng "chth668@163.com"
ADD springboot-springcloud-docker-kebernetes-front-1.0-SNAPSHOT.jar chth.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","chth.jar","--spring.profiles.active=docker"]