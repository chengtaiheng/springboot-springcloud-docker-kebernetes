# 这是一个springboot、springcloud、docker、kebernetes整合的项目。
## 准备一个linux服务器，需安装以程序
* **jdk**
* **maven**
* **docker**
* **一个harbor Docker镜像仓库（可安装到其他服务器）**
* **kebernetes（集群许多台服务器安装，本服务器作为主节点）**
## 运行流程
### 第一步，运行refactor.sh,构建镜像，并将镜像上传到harbor镜像仓库：要推送的镜像格式如下：

**192.168.99.115/chth/springboot-springcloud-docker-kebernetes-eureka:latest**
192.168.99.115 ：远程镜像仓库的ip地址
chth ：镜像所属的项目名称
springboot-springcloud-docker-kebernetes-eureka ：镜像的名称
latest ：镜像的tag
### 第二步，将kebernetes的配置文件上传到服务器上，即本项目的.k8s文件
### 第三步，运行kenbernetes命令，启动docker容器，
>ku apply -f **.yaml>
**注意：其中  	00-init.yaml 为必须要运行的yaml文件（为项目的命名空间），再依次运行其它yaml文件**
### 第三步 停止运行的容器







