 ## Explain the differences between the RestController and Controller components used in this sample.
 - The **Controller** is more web oriented which means it generally works with the view (HTML + CSS + JavaScript) 
 while the **RestController** returns data in form of JSON.
 
 - A **Controller** is a class that is responsible for preparing a model Map with data to be 
displayed by the view as well as choosing the right view itself. It can also directly 
write into the response stream by using @ResponseBody annotation and complete the request.

- The **@Controller** is a common annotation that is used to mark a class as Spring MVC Controller
while **@RestController** is a special controller used in **RESTFul** web services 
and the equivalent of @Controller + @ResponseBody.

## Both the RestController and the Controller need to access the database, using a Repository. How do they get a valid instance of the Repository to work with?
- Repository extends to JpaRepository this will enable Spring Data to find this interface and automatically create an implementation for it.
- The Controller will request data from or send data to the Repository, and then pass it to any service classes that need to do processing.
