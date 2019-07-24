# PetClinic Phase 2

#### Overview
In this phase of the project, we convert our code from phase 1 (standard Java) to use Spring and Spring Boot.

[PetClinic Reference Application](http://petclinic.cognizantacademy.com)

#### What You Are Given

* Completed code from Phase 1.
* Completed code for Owner sequence.

#### What You Need To Complete
###### Spring Boot
* Add the proper annotations to each of the controllers, services and repository classes to convert the application to a Spring Boot application.
* Add the proper annotation to the driver to turn it into a Spring Boot application.

###### Model Associations
* Determine the proper relationships/associations between models classes.  (One-to-One, One-to-Many, Many-to-Many)
* Add the appropriate fields to each of the models to represent those relationships/associations.
* Add supporting methods to add/remove associations between model objects.  See the Owner.addPet and Owner.removePet methods for an example.

#### List of Spring Annotations Used
* @Controller
* @Service
* @Repository
* @SpringBootApplication

#### Bonus Activities
###### Bonus Activity 1 (easy)
* Add custom banner text to the Spring Boot startup sequence.
* Complete the following tutorial for more information.
* [Spring Boot Custom Banners](https://www.baeldung.com/spring-boot-custom-banners)
* [ASCII Generator](http://www.network-science.de/ascii/)

###### Bonus Activity 2 (hard)
* Implement a custom exit code in your Spring Boot application.
* This is done by adding certain Spring Beans to a custom configuration class.
* Complete the following tutorial for more information.
* [Spring Boot Exit Codes](https://www.baeldung.com/spring-boot-exit-codes)
* *Hint:* The Spring Beans in the example code need to be implemented inside a custom configuration class you create.

###### Bonus Activity 3 (medium)
* Once you have the exit codes working, change the System.out.println from the example code to use an SLF4J logger instead.
* Have the output print at the warning level.

#### Notes
* Dependencies have already been added for you in the pom.xml file for this phase.  You shouldn't have to modify or add anything to your build file (pom.xml), but feel free to as needed.
* We are NOT creating a front end for this application.  The `PetClinicDriver` acts as the front end (or view) for this application. Feel free to add to the driver as needed.
* In this phase, don't worry about handling errors.