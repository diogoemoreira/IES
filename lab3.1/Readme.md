 # URL used for exercise 3.1 b)
http://localhost:8080/employees - to see all the employees

http://localhost:8080/employees/1 - with GET to see employee with id 1
```json
{
    "id": 1,
    "name": "Bilbo Baggins",
    "role": "burglar",
    "_links": {
        "self": {
            "href": "http://localhost:8080/employees/1"
        },
        "employees": {
            "href": "http://localhost:8080/employees"
        }
    }
}
```

http://localhost:8080/employees - with POST to add a new employee with {"name":"diogo","role":"student"}
```json
{
    "id": 3,
    "name": "diogo",
    "role": "student"
}
```

http://localhost:8080/employees/5 - with PUT to replace an employee in that id or 
add a new one with {"name":"diogo","role":"student"} if none is found
```json
{
"id": 3,
"name": "diogo",
"role": "student"
}
```

http://localhost:8080/employees/3 - with DELETE employee with id 3

# When the application is stopped
- When the application is stopped and restarted all the data changed through our requests, such as **POST** and **PUT**,
is reset because the data is stored locally. To change this we would need to save the data in a database as we alter it so no changes are lost

# What would be the proper HTTP Status code to get when searching an API for non-existent http://localhost:8080/employees/987987?
- The proper HTTP Status code would be **404 Not Found** since the server can not find the requested resource (in this case id=987987).
    
# Role of the elements in the UML
- **Employee:** it's what we can call the "main" entity 
- **LoadDatabase:** Used to load employees(right now creates employees) into the database
- **EmployeeController:** It is a Rest Controller used to "control" the requests(GET, POST, PUT,...).
The controller handles all the requests changing the data to what we want and preventing certain
errors from happening.
- **EmployeeRepository/JpaRepository:** It is a repository where all the data is stored.
- **EmployeeNotFoundException:** An exception when no employee is found in the search.
This way the error shown can be easily interpreted.
- **EmployeeNotFoundAdvice:** It is a Rest Controller which has the job to call EmployeeNotFoundException
when no employee is found in the search.
