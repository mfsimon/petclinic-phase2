package com.example.petclinic.repository;

import com.example.petclinic.model.Owner;
import org.springframework.stereotype.Component;

import java.io.InvalidObjectException;
import java.util.List;

@Component
public class OwnerRepository implements CrudRepository<Owner> {

    private FakeDatabase fakeDatabase;

    public OwnerRepository() {
        this.fakeDatabase = FakeDatabase.getInstance();
    }

    @Override
    public Owner create(Owner owner) {

        Owner result = this.fakeDatabase.save(owner);
        return result;
    }

    @Override
    public Owner read(Owner owner) {

        Owner result = this.fakeDatabase.get(owner);
        return result;
    }

    @Override
    public Owner update(Owner owner) {

        Owner result = null;
        try {
            result = this.fakeDatabase.modify(owner);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public boolean delete(Owner owner) {

        boolean result = this.fakeDatabase.delete(owner);
        return result;
    }

    @Override
    public List<Owner> getAll() {

        List<Owner> result = this.fakeDatabase.getAll("owner");
        return result;
    }

}
