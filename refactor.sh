#!/usr/bin/env bash

#删除为none的对象
docker images | grep '<none>' | awk -F ' ' '{print$3}' | xargs docker rmi 2>/dev/null 1>&2

#删除原有镜像
docker rmi 192.168.99.115/chth/springboot-springcloud-docker-kebernetes-eureka:1.0.0 2>/dev/null 1>&2
docker rmi 192.168.99.115/chth/springboot-springcloud-docker-kebernetes-front:1.0.0  2>/dev/null 1>&2
docker rmi 192.168.99.115/chth/springboot-springcloud-docker-kebernetes-service:1.0.0 2>/dev/null 1>&2

docker rmi 192.168.99.115/chth/springboot-springcloud-docker-kebernetes-eureka:latest 2>/dev/null 1>&2
docker rmi 192.168.99.115/chth/springboot-springcloud-docker-kebernetes-front:latest  2>/dev/null 1>&2
docker rmi 192.168.99.115/chth/springboot-springcloud-docker-kebernetes-service:latest 2>/dev/null 1>&2

docker push 192.168.99.115/chth/springboot-springcloud-docker-kebernetes-eureka:latest
docker push 192.168.99.115/chth/springboot-springcloud-docker-kebernetes-front:latest
docker push 192.168.99.115/chth/springboot-springcloud-docker-kebernetes-service:latest

#用pom文件打包项目，构建docker镜像
mvn -f ./springboot-springcloud-docker-kebernetes-eureka/pom.xml clean package docker:build
mvn -f ./springboot-springcloud-docker-kebernetes-front/pom.xml clean package docker:build
mvn -f ./springboot-springcloud-docker-kebernetes-service/pom.xml clean package docker:build