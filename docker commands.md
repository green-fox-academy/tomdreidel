# list all running docker containers
docker ps

# list all available docker images

docker images

# stop all running containers

docker stop $(docker ps -q)

# ssh into virtual machine

ssh docker@192.168.99.100
pw: tcuser

# ssh into docker container

docker exec -it <docker image> sh

# start docker container on specific port

docker run -p host port:inner port (e.g. 8080) -t <image_name>

# build docker image from gradle project

./gradlew build docker

# push docker image to dockerhub

docker tag <docker image name> <dockerhub team name / new tag>
docker push epidote/foo
(you may need to login first)

# if you have permission denied error on building docker image with gradlew

chmod +x ./gradlew

# delete docker image and all tags and layers

docker rmi 8568d1ce9c4c



