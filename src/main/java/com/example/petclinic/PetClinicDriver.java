package com.example.petclinic;

import com.example.petclinic.controller.OwnerController;
import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Pet;
import com.example.petclinic.model.PetType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PetClinicDriver {

    private static ConfigurableApplicationContext context;

    private static OwnerController ownerController;

    public static void main(String[] args) {

        // We'll need a reference to the Spring IoC container (it's context).
        context = SpringApplication.run(PetClinicDriver.class, args);

        testApp();

    }

    private static void testApp() {

        // Need a reference to the OwnerController to run our tests.
        // We use the context to retrieve managed beans by name.
        // The name of the bean is the type of bean (it's name) in camelcase, with the first letter lowercase (by default).
        ownerController = (OwnerController) context.getBean("ownerController");

        // Owner testing
        Owner owner1 = new Owner(1, "Homer Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner2 = new Owner(2, "Marge Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner3 = new Owner(3, "Lisa Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");
        Owner owner4 = new Owner(4, "Bart Simpson", "742 Evergreen Terrace", "Springfield", "9395550113");

        ownerController.saveOwner(owner1);
        ownerController.saveOwner(owner2);
        ownerController.saveOwner(owner3);
        ownerController.saveOwner(owner4);

        List<Owner> owners = ownerController.getAllOwners();

        display(owners);

        Pet pet1 = new Pet(1, "Godzilla", new Date(), PetType.LIZARD);
        Pet pet2 = new Pet(2, "Santa's Little Helper", new Date(), PetType.DOG);
        owner4.addPet(pet1);
        owner4.addPet(pet2);

        display(owners);

        // TODO add other tests here

        while(true) {
            // this allows you to look at some of the Spring tools in IntelliJ with the application still running.
        }

    }

    private static void display(Object obj) {

        if (obj instanceof List) {

            List<?> list = (List) obj;
            for (Object o : list) {
                System.out.println("\t" + o);
            }

        } else {

            System.out.println(obj);

        }

        System.out.println();
    }
}
