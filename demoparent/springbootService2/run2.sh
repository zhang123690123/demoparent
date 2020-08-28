#!/usr/bin/bash

set fileformat=unix

docker stop springbootservice2

docker rm springbootservice2

docker rmi springbootservice2:1.0-SNAPSHOT

docker build -t springbootservice2:1.0-SNAPSHOT
docker run -p 8082:8082 --name springbootservice2 -d springbootservice2:1.0-SNAPSHOT
echo '-----------'