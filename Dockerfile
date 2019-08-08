#依赖基础镜像
FROM java:8
#镜像作者
MAINTAINER RyzeZhao
#执行脚本/命令
#RUN localedef -c -f UTF-8 -i zh_CN zh_CN.utf8
#卷
VOLUME /tmp
ARG JAR_FILE
#复制文件 jar包  镜像名
ADD ${JAR_FILE} /jenkins_project.jar
#参数
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/jenkins_project.jar"]