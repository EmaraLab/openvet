package com.emaratech.lab.business.core;

import com.emaratech.lab.models.*;

import java.util.List;

public interface PetClinicManagerBase {
    public Result<Pet> savePet(Pet pet);
    public Result<Owner> saveOwner(Owner owner);
    public Result<PetVisit> savePetVisit(PetVisit petVisit);

    public Result<Owner> findOwnerById(long id);
    public Result<Pet> findPetById(long id);

    public Result<List<Owner>> findOwnerByLastName(String lastName);

    public Result<List<Vet>> findAllVets();
    public Result<List<PetType>> findAllPetTypes();

}
