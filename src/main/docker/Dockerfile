# FROM 定制的镜像都是基于XXX的镜像，例如基于jdk 1.8
FROM java:8
#定义匿名数据卷。在启动容器时忘记挂载数据卷，会自动挂载到匿名卷。
#作用：
#避免重要的数据，因容器重启而丢失，这是非常致命的。
#避免容器不断变大。
VOLUME /tmp
#端口申明 方便使用者映射
EXPOSE 8091
#复制文件或者目录到容器里指定路径
COPY tz-docker-demo.jar tz-docker-demo.jar
#用于运行指令
ENTRYPOINT ["java","-jar","tz-docker-demo.jar"]

# 其它指令 如CMD RUN  ENV(设置环境变量给后续指令使用)