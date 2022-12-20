# RUNNING THE RMI CODES:
* Move in the `JAVA` folder
* Run the command `bash init.sh`
* Create two terminal one for server & another for client.
* In the server terminal, enter the command `java Server` to start the server
* In the client terminal, enter the command `java Client` to start the client
* Run the command `bash terminate.sh` & `kill -9 PID` where PID will be the output of the previous command.

---
# RUNNING WITH DOCKER CONTAINER:
* Create the docker image using the command `docker build -t java .`
* To view the existing image use the command `docker images`
* Run the image `docker run java` or in interactive shell using the command `docker run -it java /bin/bash`
* To work in an existing docker container, use the command `docker exec -it container_id /bin/bash`