#这是一个springboot、springcloud、docker、kebernetes整合的项目。
#准备一个linux服务器，需安装以程序
*jdk
*maven
*docker
*一个harbor Docker镜像仓库
*kebernetes（集群许多台服务器安装，本服务器作为主节点）
#运行流程
##第一步，运行refactor.sh,构建镜像，并将镜像上传到harbor镜像仓库：要推送的镜像格式如下：

**192.168.99.115/chth/springboot-springcloud-docker-kebernetes-eureka:latest**
