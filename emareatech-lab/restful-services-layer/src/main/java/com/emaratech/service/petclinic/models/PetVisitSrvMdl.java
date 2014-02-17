package com.emaratech.service.petclinic.models;

import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/4/14
 * Time: 10:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class PetVisitSrvMdl extends EntityBaseSrvMdl {
    private long visitId;
    private DateTime visitTime;
    private String description;
    private long petId;

    public long getVisitId() {
        return visitId;
    }

    public void setVisitId(long visitId) {
        this.visitId = visitId;
    }

    public DateTime getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(DateTime visitTime) {
        this.visitTime = visitTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPetId() {
        return petId;
    }

    public void setPetId(long petId) {
        this.petId = petId;
    }

    public long getVetId() {
        return vetId;
    }

    public void setVetId(long vetId) {
        this.vetId = vetId;
    }

    private long vetId;

}
