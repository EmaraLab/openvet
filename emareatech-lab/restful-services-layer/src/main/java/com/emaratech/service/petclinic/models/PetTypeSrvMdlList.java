package com.emaratech.service.petclinic.models;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/4/14
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class PetTypeSrvMdlList {
    @XmlPath("pet_type")
    private List<PetTypeSrvMdl> petTypeSrvMdlList;

    public PetTypeSrvMdlList() {

    }

    public PetTypeSrvMdlList(List<PetTypeSrvMdl> list) {
        this.petTypeSrvMdlList = list;
    }

    public List<PetTypeSrvMdl> getPetTypeSrvMdlList() {
        return petTypeSrvMdlList;
    }

    public void setPetTypeSrvMdlList(List<PetTypeSrvMdl> petTypeSrvMdlList) {
        this.petTypeSrvMdlList = petTypeSrvMdlList;
    }
}
