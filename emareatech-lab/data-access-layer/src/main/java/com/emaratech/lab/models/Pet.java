package com.emaratech.lab.models;

import org.hibernate.annotations.Cascade;
import org.joda.time.DateTime;

import javax.persistence.*;

/**
* Created with IntelliJ IDEA.
* User: ABC
* Date: 1/31/14
* Time: 6:30 PM
* To change this template use File | Settings | File Templates.
*/
@Entity
@Table(name="PET")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "PET_TYPE", discriminatorType = DiscriminatorType.INTEGER)
public class Pet extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PET_ID")
    private long petId;

    @Column(name="NAME")
    private String name;

    @Column(name="BIRTH_DATE")
    private DateTime birthDate;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="OWNER_ID", nullable = false)
    private Owner owner;

    @Column(name = "OWNER_ID", updatable = false, insertable = false)
    private long ownerId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PET_TYPE", referencedColumnName = "LK_ID")
    private PetType petType;

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

    public Owner getOwner() {
        return owner;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public void setOwner(Owner owner) {

        this.owner = owner;
    }

}
