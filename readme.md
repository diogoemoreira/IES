## Maven commands:
    .mvn --version
    Checks Maven version

    .mvn clean package
    goes through clean and then package (both explained below)

    .mvn exec:java -Dexec.mainClass="weather.WeatherStarter"
    Executes the program in java (exec:java) with weather.WeatherStarter as main
    
#
archetype - It's like a template for your project which will tell all other users what type of project you're going to work with

groupID - It's what identifies your project across all the other projects and it should start with a reversed domain name that you control.
 Some examples given are: org.apache.maven, org.apache.commons

artifactID - It's the name of the jar without version. Whatever name we want with only lowercase letters and no strange symbols.
 If it's a third party jar you have to take the name of the jar
#

# Maven
The maven build has three phases:
.default: it's the main phase as it is responsible for the project deployment
.site: used to create the project's site documentation
.clean: used to clean the project and remove all files that are generated during the previous build

These are the most common default lifecycle phases executed.

.validate: validate the project is correct and all necessary information is available
.compile: compile the source code of the project
.test: test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
.package: take the compiled code and package it in its distributable format, such as a JAR.
.integration-test: process and deploy the package if necessary into an environment where integration tests can be run
.verify: run any checks to verify the package is valid and meets quality criteria
.install: install the package into the local repository, for use as a dependency in other projects locally
.deploy: done in an integration or release environment, copies the final package to the remote repository for sharing with other developers and projects.

A maven phase represents a stage in the Maven project life cycle and every phase has a different job.

.Each phase is made by a sequence of maven goals.
.A maven goal is what's responsible for a specific task.


For example, to list all goals bound to the compile phase, we can run:
    mvn help:describe -Dcmd=compile

#

# Docker:

-Docker is a platform for developers and sysadmins to build, run, and share applications with containers. The use of containers to deploy applications is called containerization.

Containerization is increasingly popular because containers are:

    .Flexible: Even the most complex applications can be containerized.
    .Lightweight: Containers leverage and share the host kernel, making them much more efficient in terms of system resources than virtual machines.
    .Portable: You can build locally, deploy to the cloud, and run anywhere.
    .Loosely coupled: Containers are highly self sufficient and encapsulated, allowing you to replace or upgrade one without disrupting others.
    .Scalable: You can increase and automatically distribute container replicas across a datacenter.
    .Secure: Containers apply aggressive constraints and isolations to processes without any configuration required on the part of the user.

A container runs natively on Linux and shares the kernel of the host machine with other containers. It runs a discrete process, taking no more memory than any other executable, making it lightweight.

# Docker commands:
    .docker run -d -p 80:80 docker/getting-started
    Run a container and ask docker to send incoming traffic from host port 80 to container port 80 with image "docker/getting-started" and random name because it was not specified

    .docker ps
    To see all the containers running

    .docker container stop "container name"
    Stops the container with the specified name

    .docker container rm "container name"
    Removes the container with the specified name

    .docker container ls -all
    Shows all containers created even if they are deactivated (doesn't show removed ones)

## From tutorial part 2

    .docker build --tag bulletinboard:1.0 .

    This runs each instruction in the Dockerfile, building up an image as it goes.  If successful, the build process should end with a message Successfully tagged bulletinboard:1.0


    .docker run --publish 8000:8080 --detach --name bb bulletinboard:1.0

    There are a couple of common flags here:

        --publish asks Docker to forward traffic incoming on the host’s port 8000 to the container’s port 8080. Containers have their own private set of ports, so if you want to reach one from the network, you have to forward traffic to it in this way. Otherwise, firewall rules will prevent all network traffic from reaching your container, as a default security posture.
        --detach asks Docker to run this container in the background.
        --name specifies a name with which you can refer to your container in subsequent commands, in this case bb
    
    After using docker run we can now see our application in a browser with "localhost:8000" which is the port in which the application is currently running. It is a good time to test the application and see if it is running as intended


    .docker rm --force bb

    The --force option stops a running container, so it can be removed. If you stop the container running with docker stop bb first, then you do not need to use --force to remove it.


## Qual a relevância de configurar “volumes” quando se pretende preparar um container para servir uma base de dados?

  É relevante configurar volumes pois a informação armazenada da base de dados persiste mesmo após um reboot, ou seja, a base de dados não é volátil

