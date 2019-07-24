# PetClinic Phase 2

#### Overview
In this phase of the project, we convert our code from phase 1 (standard Java) to use Spring and Spring Boot.  

[PetClinic Reference Application](http://petclinic.cognizantacademy.com)

#### Objectives

###### Primary Objectives
* Learn how to setup a Spring Boot application by completing the `Spring Boot` instructions below.
* Learn about entity relationships by completing the `Model Associations` instructions below.

###### Bonus Objectives
* Implement a custom banner for the PetClinic application by completing bonus activity 1.
* Implement custom exit codes by completing bonus activity 2.
* Implement logging by completing bonus activity 3.

#### What You Are Given

* Completed code from Phase 1.
* Completed Phase 2 code for the Owner sequence.

#### What You Need To Complete
###### Spring Boot
* Add the proper annotation to the driver to turn it into a Spring Boot application.  Modify the main method as needed.
* Add the proper annotations to each of the controllers, services and repository classes so Spring can maintain these classes as Spring Beans in it's IoC container.


###### TODOs
* Make a note of the TODOs in the Owner class and how to handle them.  Once coding is complete in the Pet class, these TODOs can be cleared.

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

###### Bonus Activity 2 (medium)
* Implement a custom exit code in your Spring Boot application.
* This is done by adding specific Spring Beans to a custom configuration class.
* Complete the following tutorial for more information.
* [Spring Boot Exit Codes](https://www.baeldung.com/spring-boot-exit-codes)

###### Bonus Activity 3 (medium)
* Once you have the exit codes working, change the System.out.println from the example code to use an SLF4J logger instead.
* Have the output print at the `warning` level.

#### Notes
* Dependencies have already been added for you in the pom.xml file for this phase.  You shouldn't have to modify or add anything to your build file (pom.xml), but feel free to as needed.
* We are NOT creating a front end for this application.  The `PetClinicDriver` acts as the front end (or view) for this application. Feel free to add to the driver as needed.
* In this phase, don't worry about handling errors.