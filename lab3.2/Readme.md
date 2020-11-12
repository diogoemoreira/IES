## Explain the annotations @Table, @Column, @Id found in the Employee entity 
- The **@Table** annotation specifies the name of the database table to be used for mapping (employees).

- The **@Id** annotation specifies the primary key of an entity (id).

- The **@Column** annotation specifies the column of an entity (first_name, last_name,...)

## Explain the use of the annotation @AutoWired(in the Rest Controller class).
- Marks a constructor, field, or setter method to be autowired by Spring dependency injection.

- You can use **@Autowired** on properties to get rid of the setter methods. 
When you pass values of **autowired properties** using <property\> Spring will 
automatically assign those properties with the passed values or references.

- You can apply **@Autowired** to constructors as well. A constructor **@Autowired**
indicates that the constructor should be autowired when creating the bean.

- The use of **@Autowired** in the Rest Controller class it's so there is no need
to assign properties to the EmployeeRepository making it easier to implement
