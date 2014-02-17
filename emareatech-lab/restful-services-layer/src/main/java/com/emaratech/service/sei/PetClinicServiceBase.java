package com.emaratech.service.sei;

import com.emaratech.lab.models.Owner;
import com.emaratech.lab.models.Pet;
import com.emaratech.lab.models.PetVisit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/3/14
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 */

public interface PetClinicServiceBase {
    public Response findOwnerByLastName(@QueryParam("lastName")String lastName);
    public Response findPetTypes();

    public Response findOwnerById(@QueryParam("ownerId")long ownerId);
    public Response findPetById(@QueryParam("petId")long petId);

    public Response findAllVets();

    public Response saveOwner(Owner owner);
    public Response saveVisit(PetVisit petVisit);
    public Response savePet(Pet pet);

}
