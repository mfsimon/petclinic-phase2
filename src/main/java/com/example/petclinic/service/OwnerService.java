package com.example.petclinic.service;

import com.example.petclinic.model.Owner;
import com.example.petclinic.repository.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    private OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }


    public Owner saveOwner(Owner owner) {

        Owner result = this.ownerRepository.create(owner);
        return result;
    }

    public Owner getOwner(Owner owner) {

        Owner result = this.ownerRepository.read(owner);
        return result;
    }

    public Owner modifyOwner(Owner owner) {

        Owner result = this.ownerRepository.update(owner);
        return result;
    }

    public boolean deleteOwner(Owner owner) {

        boolean result = this.ownerRepository.delete(owner);
        return result;
    }

    public List<Owner> getAll() {

        List<Owner> result = ownerRepository.getAll();
        return result;
    }


}
