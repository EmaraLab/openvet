package com.emaratech.lab.business.core;

import com.emaratech.lab.data.access.PetClinicDataAccessBase;
import com.emaratech.lab.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PetClinicManagerImpl implements PetClinicManagerBase {
    @Autowired
    private PetClinicDataAccessBase broker;

    @Override
    public Result<Pet> savePet(Pet pet) {
        return Result.success(broker.save(pet));
    }

    @Override
    public Result<Owner> saveOwner(Owner owner) {
        return Result.success(broker.save(owner));
    }

    @Override
    public Result<PetVisit> savePetVisit(PetVisit petVisit) {
        return Result.success(broker.save(petVisit));
    }

    @Override
    public Result<Owner> findOwnerById(long id) {
        return Result.success(broker.findById(Owner.class, id));
    }

    @Override
    public Result<Pet> findPetById(long id) {
        return Result.success(broker.findById(Pet.class, id));
    }

    @Override
    @Transactional
    public Result<List<Owner>> findOwnerByLastName(String lastName) {
        Owner owner = new Owner();
        owner.setLastName(lastName);
        return Result.success(broker.findOwnerByLastName(lastName));
    }

    @Override
    public Result<List<Vet>> findAllVets() {
        return Result.success(broker.findAll(Vet.class));
    }

    @Override
    public Result<List<PetType>> findAllPetTypes() {
        return  Result.success(broker.findAll(PetType.class));
    }
}
