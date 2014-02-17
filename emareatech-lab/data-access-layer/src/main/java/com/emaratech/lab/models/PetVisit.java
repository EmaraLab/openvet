package com.emaratech.lab.models;

import org.joda.time.DateTime;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: ABC
 * Date: 2/1/14
 * Time: 3:03 AM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "PET_VISIT")
public class PetVisit extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VISIT_ID")
    private long visitId;
    @Column(name = "VISIT_TIME", nullable = false)
    private DateTime visitTime;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PET_ID")
    private long petId;
    @Column(name = "VET_ID")
    private long vetId;

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PET_ID", nullable = false, insertable = false, updatable = false)
    private Pet pet;

    public long getVetId() {
        return vetId;
    }

    public void setVetId(long vetId) {
        this.vetId = vetId;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "VET_ID", nullable = false, insertable = false, updatable = false)
    private Vet vet;
}
