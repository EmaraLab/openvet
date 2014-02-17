package com.emaratech.lab.data.access;

import com.core.emaratech.brokers.DataBroker;
import com.emaratech.lab.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PetClinicDataAccessJpaImpl implements PetClinicDataAccessBase {
    @Autowired private DataBroker broker;
    @Override
    public <T extends EntityBase> T save(T add) {
        broker.save(add);
        return add;
    }

    @Override
    public <T extends  EntityBase> T update(T update) {
        broker.update(update);
        return update;
    }

    @Override
    public <T extends  EntityBase> T remove(T remove) {
        broker.delete(remove);
        return remove;
    }

    @Override
    public <T extends EntityBase, U> T findById(Class<T> clss, U id) {
        return broker.findById(clss, id);
    }

    @Override
    public <T extends EntityBase> List<T> findAll(Class<T> clss) {
        return broker.findAll(clss);
    }


    @Override
    public List<Owner> findOwnerByLastName(String lastName) {
        Owner owner = new Owner();
        owner.setLastName(lastName);
        return broker.findByExample(owner);
    }

    @Override
    public List<PetVisit> findPetVisitByPetId(long petId) {
        PetVisit petVisit = new PetVisit();
        petVisit.setPetId(petId);
        return broker.findByExample(petVisit);
    }


}
