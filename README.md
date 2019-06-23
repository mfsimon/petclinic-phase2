# PetClinic Phase 2

#### Overview
In this phase of the project, we convert our code from phase 1 (standard Java) to use Spring and Spring Boot.

[PetClinic Reference Application](http://petclinic.cognizantacademy.com)

#### What You Are Given

* Code for the controllers - `BasicController`, `OwnerController`,`PetController`, `VisitController`, `VetController`
* Code for the services - `BasicService`, `OwnerService`, `PetService`, `VisitService`, `VetService`
* Code for the repositories - `OwnerRepository`, `PetRepository`, `VisitRepository`, `VetRepository`
* Code for the models - `Owner`, `Pet`, `PetType`, `Visit`, `Vet` and `Speciality`
* A database class - `FakeDatabase`
* Supporting interfaces for the `FakeDatabase` (`Modifiable` and `CrudRepository`)
* A driver class - `PetClinicDriver`

#### What You Need To Complete
* Add the proper annotations to each of the controllers, services and repository classes.
* Add the proper annotation to the driver to turn it into a Spring Boot application.

###### List of Spring Annotations Used
* @Controller
* @Service
* @Repository
* @SpringBootApplication

###### Bonus Activity 1 (easy)
* Add custom banner text to the Spring Boot startup sequence.
* Complete the following tutorial for more information.
* [Spring Boot Custom Banners](https://www.baeldung.com/spring-boot-custom-banners)
* [ASCII Generator](http://www.network-science.de/ascii/)

###### Bonus Activity 2 (hard)
* Implement a custom exit code in your Spring Boot application.
* This is done by adding certain Spring Beans to your driver.
* Complete the following tutorial for more information.
* [Spring Boot Exit Codes](https://www.baeldung.com/spring-boot-exit-codes)
* *Hint:* The Spring Beans in the example code can either be implemented in the driver class OR inside a configuration class you create.

#### Notes
* Dependencies have already been added for you in the pom.xml file for this phase.  You shouldn't have to modify or add anything to your build file (pom.xml), but feel free to as needed.
* We are NOT creating a front end for this application.  The `PetClinicDriver` acts as the front end (or view) for this application. Feel free to add to the driver as needed.
* In this phase, don't worry about handling errors.