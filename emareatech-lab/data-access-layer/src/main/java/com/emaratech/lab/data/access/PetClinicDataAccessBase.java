package com.emaratech.lab.data.access;

import com.emaratech.lab.models.*;

import javax.persistence.EntityTransaction;
import java.beans.Visibility;
import java.util.List;

public interface PetClinicDataAccessBase {
    <T extends  EntityBase> T save(T add);
    <T extends  EntityBase> T update(T update);
    <T extends  EntityBase> T remove(T remove);
    <T extends  EntityBase,U> T findById(Class<T> clss, U id);
    <T extends  EntityBase> List<T> findAll(Class<T> clss);

    List<Owner> findOwnerByLastName(String lastName);
    List<PetVisit> findPetVisitByPetId(long petId);
}
