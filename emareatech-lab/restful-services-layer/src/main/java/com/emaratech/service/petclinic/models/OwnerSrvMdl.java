package com.emaratech.service.petclinic.models;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;

@XmlRootElement
public class OwnerSrvMdl extends EntityBaseSrvMdl {
    private long ownerId;

    private String firstName;

    private String lastName;

    private String city;

    private String address;

    private String telephone;

    @XmlPath("pet_list/pet")
    private HashSet<PetSrvMdl> pets = new HashSet<PetSrvMdl>();


    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public HashSet<PetSrvMdl> getPets() {
        return pets;
    }

    public void setPets(HashSet<PetSrvMdl> pets) {
        this.pets = pets;
    }
}
