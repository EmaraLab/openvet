package com.emaratech.lab.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/3/14
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="VET")
public class Vet extends  EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "VET_ID")
    private long vetId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "VET_SPEC_LINK", joinColumns = @JoinColumn(name = "VET_ID"),
            inverseJoinColumns = @JoinColumn(name = "LK_ID"))
    private Set<Speciality> specialities = new HashSet<Speciality>();

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

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
