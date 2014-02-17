package com.emaratech.service.petclinic.models;

import com.emaratech.lab.models.PetType;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: ABC
 * Date: 2/3/14
 * Time: 10:34 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class PetSrvMdl extends EntityBaseSrvMdl {
    private long petId;
    private String name;
    private DateTime birthDate;
    private long ownerId;
    private PetTypeSrvMdl petType;

    public PetTypeSrvMdl getPetType() {
        return petType;
    }

    public void setPetType(PetTypeSrvMdl petType) {
        this.petType = petType;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateTime birthDate) {
        this.birthDate = birthDate;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

}
