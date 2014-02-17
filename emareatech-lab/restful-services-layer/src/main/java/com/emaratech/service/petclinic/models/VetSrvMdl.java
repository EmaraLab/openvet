package com.emaratech.service.petclinic.models;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/4/14
 * Time: 10:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class VetSrvMdl extends EntityBaseSrvMdl {
    private long vetId;
    private String firstName;
    private String lastName;
    private Set<SpecialitySrvMdl> specialities = new HashSet<SpecialitySrvMdl>();

    public long getVetId() {
        return vetId;
    }

    public void setVetId(long vetId) {
        this.vetId = vetId;
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

    public Set<SpecialitySrvMdl> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<SpecialitySrvMdl> specialities) {
        this.specialities = specialities;
    }
}
