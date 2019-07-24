package com.example.petclinic.controller;

import com.example.petclinic.model.Vet;
import com.example.petclinic.service.VetService;

import java.util.List;

public class VetController implements BasicController<Vet> {

    private VetService vetService;

    public VetController(VetService vetService) {

        this.vetService = vetService;
    }

    @Override
    public Vet add(Vet vet) {

        return this.vetService.add(vet);
    }

    @Override
    public Vet get(Long id) {

        return this.vetService.get(id);
    }

    @Override
    public Vet modify(Vet vet) {

        return this.vetService.modify(vet);
    }

    @Override
    public boolean delete(Vet vet) {

        return this.vetService.delete(vet);
    }

    @Override
    public List<Vet> getAll() {

        return this.vetService.getAll();
    }
}
