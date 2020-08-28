#!/usr/bin/env bash

set fileformat=unix

docker stop springservice2

docker rm springservice2

docker rmi springservice2:1.0-SNAPSHOT

docker build -t springservice2:1.0-SNAPSHOT .

docker run -p 8082:8082 --name springservice2
-d springbootservice2:1.0-SNAPSHOT
echo '-----------'