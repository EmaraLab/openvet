package com.emaratech.services.utils;


import com.emaratech.lab.business.core.Result;
import com.emaratech.lab.models.*;
import com.emaratech.service.petclinic.models.*;
import com.emaratech.services.models.ServiceResponse;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.util.Collections;
import java.util.Set;

public class ResponseTranslator {
    private ResponseTranslator(){

    }

    public static <T,U> ServiceResponse<U> toServiceResponse(Result<T> managerResult) {
        ServiceResponse<U> srvResponseMessage = null;
        if(managerResult.isSuccess()) {
            srvResponseMessage = ServiceResponse.success();
        } else {
            srvResponseMessage = ServiceResponse.failure();
        }
        //srvResponseMessage.setAdditionalParams(managerResult.getErrorMessageDetails());
        return srvResponseMessage;
    }

    public static OwnerSrvMdl transform(Owner owner) {
        OwnerSrvMdl ownerSrvMdl = new OwnerSrvMdl();
        BeanUtils.copyProperties(owner, ownerSrvMdl);

        if(CollectionUtils.isEmpty(owner.getPets())) {
            return ownerSrvMdl;
        }

        for(Pet singlePet : owner.getPets()) {
            ownerSrvMdl.getPets().add(transform(singlePet));
        }
        return ownerSrvMdl;

    }

    public static PetSrvMdl transform(Pet pet) {
        PetSrvMdl petSvMdl = new PetSrvMdl();
        BeanUtils.copyProperties(pet, petSvMdl);
        petSvMdl.setPetType(transform(pet.getPetType()));
        return petSvMdl;
    }

    public static PetTypeSrvMdl transform(PetType petType) {
        PetTypeSrvMdl petTypeSrvMdl = new PetTypeSrvMdl();
        BeanUtils.copyProperties(petType, petTypeSrvMdl);
        return petTypeSrvMdl;
    }

    public static PetVisitSrvMdl transform(PetVisit petVisit) {
        return null;
    }

    public static <S,D> D transform(S source, Class<? extends D> clss, String...ignoreProps) {
        try {
            D destination = clss.newInstance();
            BeanUtils.copyProperties(source, destination, ignoreProps);
            return destination;
        } catch(Exception ex) {

        }
        return null;
    }

    public static VetSrvMdl transform(Vet vet) {
        VetSrvMdl vetSrvMdl = new VetSrvMdl();
        BeanUtils.copyProperties(vet, vetSrvMdl, "specialities");
        Set<Speciality> specialities  =  vet.getSpecialities();

        if(CollectionUtils.isEmpty(specialities)) {
            return vetSrvMdl;
        }

        for(Speciality speciality : specialities) {
            vetSrvMdl.getSpecialities().add(transform(speciality));
        }

        return vetSrvMdl;
    }

    public static SpecialitySrvMdl transform(final Speciality speciality) {
        SpecialitySrvMdl  specialitySrvMdl = new SpecialitySrvMdl();
        BeanUtils.copyProperties(speciality, specialitySrvMdl);
        return specialitySrvMdl;
    }

    public static void main(String[] args) {
        Vet vets = new Vet();
        vets.setFirstName("Farhan");
        Speciality speciality = new Speciality();
        vets.getSpecialities().add(speciality);
        VetSrvMdl vetSrMdl = ResponseTranslator.transform(vets, VetSrvMdl.class);

    }

}
