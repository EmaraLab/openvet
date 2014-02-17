package com.emaratech.service.sib;

import com.emaratech.lab.business.core.PetClinicManagerBase;
import com.emaratech.lab.business.core.PetClinicManagerImpl;
import com.emaratech.lab.business.core.Result;
import com.emaratech.lab.models.*;
import com.emaratech.service.petclinic.models.*;
import com.emaratech.service.sei.PetClinicServiceBase;
import com.emaratech.services.models.ServiceRequest;
import com.emaratech.services.models.ServiceResponse;
import com.emaratech.services.utils.ResponseTranslator;
import org.apache.commons.beanutils.BeanUtils;
import org.eclipse.persistence.annotations.QueryRedirectors;
import org.glassfish.jersey.process.internal.RequestScoped;
import org.hibernate.transform.ResultTransformer;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/3/14
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("petclicnic")
@RequestScoped
public  class PetClinicServiceImpl implements PetClinicServiceBase, Comparable{
    @Autowired
    private PetClinicManagerBase petClinicMgr;

    //TODO: proper search API implementation
    @Override
    @GET
    @Path("/owner/search")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findOwnerByLastName(@QueryParam("lastName") String lastName) {
        try {
            Result<List<Owner>> response = petClinicMgr.findOwnerByLastName(lastName);
            ServiceResponse<OwnerSrvMdlList> responseMessage =  ResponseTranslator.toServiceResponse(response);
            if(response.isSuccess()) {
                List<Owner> owners = response.getResult();
                if(!CollectionUtils.isEmpty(owners)) {
                    List<OwnerSrvMdl> ownerSrvMdlList = new ArrayList<OwnerSrvMdl>(owners.size());
                    for(Owner owner : owners) {
                        ownerSrvMdlList.add(ResponseTranslator.transform(owner));
                    }
                    responseMessage.setResult(new OwnerSrvMdlList(ownerSrvMdlList));
                }
            }
            return Response.ok(responseMessage).build();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return Response.ok(ServiceResponse.failure()).build();
    }

    @Override
    @GET
    @Path("/petTypes")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findPetTypes() {
        try {
            Result<List<PetType>> response = petClinicMgr.findAllPetTypes();
            ServiceResponse<PetTypeSrvMdlList> responseMessage =ResponseTranslator.toServiceResponse(response);
            if(response.isSuccess()) {
                List<PetType> petTypeList = response.getResult();
                if(!CollectionUtils.isEmpty(petTypeList)) {
                    List<PetTypeSrvMdl> petTypeSrvMdlList = new ArrayList<PetTypeSrvMdl>(petTypeList.size());
                    for(PetType petType : petTypeList) {
                        petTypeSrvMdlList.add(ResponseTranslator.transform(petType));
                    }
                    responseMessage.setResult(new PetTypeSrvMdlList(petTypeSrvMdlList)) ;
                }
            }
            return Response.ok(responseMessage).build();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return Response.ok(ServiceResponse.failure()).build();
    }




    @Override
    @GET
    @Path("/owners/{ownerId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findOwnerById(@PathParam("ownerId")long ownerId) {
        try {
            Result<Owner> bussniesResponse =  petClinicMgr.findOwnerById(ownerId);
            ServiceResponse<OwnerSrvMdl> responseMessage = ResponseTranslator.toServiceResponse(bussniesResponse);

            if(bussniesResponse.isSuccess()) {
                OwnerSrvMdl ownerSrvMdl = ResponseTranslator.transform(bussniesResponse.getResult());
                responseMessage.setResult(ownerSrvMdl);
            }
            return Response.ok(responseMessage).build();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return Response.ok(ServiceResponse.failure()).build();
    }


    @Override
    @GET
    @Path("/pets/{petId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response findPetById(@PathParam("petId")long petId) {
        try {
            Result<Pet> response = petClinicMgr.findPetById(petId);
            ServiceResponse<PetSrvMdl> responseMessage = ResponseTranslator.toServiceResponse(response);
            if(response.isSuccess()) {
                PetSrvMdl petSrvMdl = ResponseTranslator.transform(response.getResult());
                responseMessage.setResult(petSrvMdl);
            }
            return Response.ok(responseMessage).build();
        } catch(Exception ex) {

        }
        return Response.ok(ServiceResponse.failure()).build();
    }

    @Override
    @GET
    @Path("/vets")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response findAllVets() {
        try {
            Result<List<Vet>> response = petClinicMgr.findAllVets();
            ServiceResponse<VetSrvMdlList> responseMessage = ResponseTranslator.toServiceResponse(response);
            if(response.isSuccess()) {
                List<Vet> vets   = response.getResult();
                if(!CollectionUtils.isEmpty(vets)) {
                    List<VetSrvMdl> vetSrvMdls = new ArrayList<VetSrvMdl>(vets.size());
                    for(Vet vet : vets) {
                        vetSrvMdls.add(ResponseTranslator.transform(vet));
                    }
                    VetSrvMdlList vetSrvMdlList = new VetSrvMdlList(vetSrvMdls);
                    responseMessage.setResult(vetSrvMdlList);
                }
            }
            return Response.ok(responseMessage).build();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return Response.ok(ServiceResponse.failure()).build();

    }

    @Override
    public Response saveOwner(Owner owner) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Response saveVisit(PetVisit petVisit) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Response savePet(Pet pet) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    public static void main(String args[]) throws JAXBException {
        ServiceRequest<Vet> serviceRequest = new ServiceRequest<Vet>();
        serviceRequest.setChannelId("001");
        serviceRequest.setRequestTime(new DateTime());
        serviceRequest.addRequestParam("afdas", "asdfasd");
        serviceRequest.addRequestParam("asdfasd", "afsd");
        serviceRequest.addRequestParam("dasf", "safd");

        Vet vets = new Vet();
        vets.setFirstName("Farhan");
        serviceRequest.setPayLoad(vets);




//
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        PetClinicManagerBase service =  context.getBean(PetClinicManagerImpl.class);
//        Result<List<PetType>> owner = service.findAllPetTypes();
        //main(). response.setResult(owner);
        JAXBContext jaxbContext = JAXBContext.newInstance(ServiceRequest.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(serviceRequest, System.out);

    }
}
