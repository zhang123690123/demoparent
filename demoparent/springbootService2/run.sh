#!/bin/bash
set fileformat=unix
# ����Ӧ������
group_name='springbootservice2'
# ����Ӧ������
app_name='springbootservice2'
# ����Ӧ�ð汾
app_version='1.0-SNAPSHOT'
# ����Ӧ�û���
profile_active='qa'
echo '----copy jar----'
docker stop ${app_name}
echo '----stop container----'
docker rm ${app_name}
echo '----rm container----'
docker rmi springbootservice2:1.0-SNAPSHOT
echo '----rm image----      ${group_name}/${app_name}:${app_version}    '
# �������docker����
docker build -t springbootservice2:1.0-SNAPSHOT .
echo '----build image----'
docker run -p 8082:8082 --name springbootservice2
-d springbootservice2:1.0-SNAPSHOT
echo '----start container-----'