#!/usr/bin/env bash
# 定义应用组名
group_name='springbootservice2'
# 定义应用名称
app_name='springbootservice2'
# 定义应用版本
app_version='1.0-SNAPSHOT'
# 定义应用环境
profile_active='qa'
echo '----copy jar----'
docker stop ${app_name}
echo '----stop container----'
docker rm ${app_name}
echo '----rm container----'
docker rmi ${app_name}:${app_version}
echo '----rm image----      ${group_name}/${app_name}:${app_version}    '
# 打包编译docker镜像
docker build -t springbootservice2:1.0-SNAPSHOT .
echo '----build image----'
docker run -p 8082:8082 --name springbootservice2 \
-e 'spring.profiles.active'=${profile_active} \
-e TZ="Asia/Shanghai" \
-v /etc/localtime:/etc/localtime \
-v /mydata/app/springbootservice2/logs:/var/logs \
-d springbootservice2:1.0-SNAPSHOT
echo '----start container-----'