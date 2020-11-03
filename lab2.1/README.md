webapp-javaee7 is for exercise 2.1

# Servlet
     Servlet is a Java class that runs at the server, handles (client) requests, processes them,and reply with a response.
    Although servlets can respond to any type of request, they are most commonly written to respond to web-based requests.

    There are three essential methods for the life cycle of a servlet – init(), service(), and destroy(). 

        .the init() method is invoked during initialization stage of the servlet life cycle. it is passed an object implementing the javax.servlet.servletconfig interface, which allows the servlet to access initialization parameters from the web application.

        .the service() method is invoked upon each request after its initialization. each request is serviced in its own separate thread. the web container calls the service() method of the servlet for every request. the service() method determines the kind of request being made and dispatches it to an appropriate method to handle the request.

        .the destroy() method is invoked when the servlet object should be destroyed. it releases the resources being held. 

    A servlet must be deployed to a Java servlet container in order to become usable.

# Servlet container
    The basic idea of servlet container is using java to dynamically generate the web page on the server side. So servlet container is essentially a part of a web server that interacts with the servlets

## Servlet container responsabilities/services (3-5):

    1.web server receives http request
    
    2.web server forwards the request to servlet container
    
    3.the servlet is dynamically retrieved and loaded into the address space of the container, if it is not in the container.
    
    4.the container invokes the init() method of the servlet for initialization(invoked once when the servlet is loaded first time)
    
    5.the container invokes the service() method of the servlet to process the http request, i.e., read data in the request and formulate a response. the servlet remains in the container’s address space and can process other http requests.
    
    6.web server return the dynamically generated results to the correct location

# Apache Tomcat
    Apache Tomcat is an open source application server that we can find for java used to run a servlet container allowing to run java in a server.

    To run the application server just use the startup script inside <path to Tomcat>/bin folder.

    Confirm that Tomcat server is running. Here are 3 alternativesto do it:
        i)$ curl -I 127.0.0.1:8080 
        ii)Try in the browser: http://localhost:8080
        iii)Observe the server log: $ tail logs/catalina.out

# Sucessfull deployment:

INFO: Deployment of web application directory [/home/diogo/.config/Code/User/workspaceStorage/3009274745d3fc829a89d0cfd3e7b70c/adashen.vscode-tomcat/tomcat/apache-tomcat-9.0.39/webapps/webapp-javaee7-1.1] has finished in [102] ms
[apache-tomcat-9.0.39]: out. 27, 2020 4:58:45 DA TARDE org.apache.coyote.AbstractProtocol start
INFO: Starting ProtocolHandler ["http-nio-8080"]
[apache-tomcat-9.0.39]: out. 27, 2020 4:58:45 DA TARDE org.apache.catalina.startup.Catalina start
INFO: Server startup in [1383] milliseconds

# CalendarServlet
    to see a customized message with the named passed as a parameter to the html add "?username=something" to the end of the url

## WAR file

    The war file is the application packaged as a Web ARchive

# Spring boot
    spring initializr permits to initialize a spring boot server
    
    On dependencies;
        .if we are trying to run it on the web we need spring web.
        .Spring dev tools permits live updates of the app instead of needing to stop and run it every time a change occurs.
    
    the class identified with @SpringBootApplication is the one that gets called when the server is run. It's a java application that receives requests from the web

    @GetMapping is called when someone a get request is made and soomething is mapped @{"something"} in the html

# Spring boot commands
    mvn -spring-boot:run 
        .to run the app
    
