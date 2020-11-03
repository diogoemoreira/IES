# Web applications in Java can be deployed to stand-alone applications servers or embedded servers
## Embedded Servers
    An embedded server is embedded as part of the deployable application. 
    If we talk about Java applications, that would be a JAR.
    The advantage with this is you don’t need the server pre-installed in the deployment environment.

    Embedded servers are quite scalable, and can host applications that support millions of users. These are no less scalable than the conventional fat servers.

    For example we have Spring Boot which uses Tomcat as it's default embedded server.

## Stand-alone application Servers
    A standalone server is a server that runs alone and is not a part of a group.

    Most of the time this kind of server uses a local user database and is available either in user mode or in share mode.

    A standalone server does not require complex actions other than creating user accounts because it does not provide network logon services, which means that machines that log on to such a server do not need to perform a domain logon. The user or machine simply has to be associated with a known user to the server. 


## When should you use one over the other
    When you have hundreds of microservices deployed at the same time it
    might be a good ideia to use an embedded server because it helps to automate development and deployment of these microservices making things simpler.

    Stand-alone servers make more sense in a local setting where complex security and authentication may not be required.

# The “dynamics” of Model-View-Controller approach used in Spring Boot to serve web content.
    The Model is the bridge between View and Controller it manages the flow of data. The model waits for the call that permits it to collect data, save it or send it.

    View is where the data from the Model is shown. It can have data that the user can interact with through Controllers.

    Controllers provide access to the application behaviour which is typically defined by a service interface. Controllers interpret user input and transform such input into a sensible model which will be represented to the user by the view.

    In Spring boot we use controllers to change what the user is gonna get by interacting with the View changing the view when the user does certain actions like providing a "name" field in the url.

# Inspect the POM.xml for the previous SpringBoot projects. What is the role of the “starters”dependencies?
    The role of the starter dependencies is to provide the necessary dependencies to build our project in Spring helping us make the development of our project simpler.

    .spring-boot-starter-thymeleaf:	It is used to build MVC web applications using Thymeleaf views.

    .spring-boot-starter-web: It is used for building the web application, including RESTful applications using Spring MVC. It uses Tomcat as the default embedded container.

    .spring-boot-starter-test: It is used to test Spring Boot applications with libraries, including JUnit, Hamcrest, and Mockito.

# Which annotations are transitively included in the @SpringBootApplication?
    The @SpringBootApplication annotation is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan with their default attributes

    @Configuration: allow to register extra beans in the context or import additional configuration classes

    @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism

    @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)

    
