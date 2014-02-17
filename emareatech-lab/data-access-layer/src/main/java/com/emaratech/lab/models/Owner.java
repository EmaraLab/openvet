package com.emaratech.lab.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: ABC
 * Date: 1/31/14
 * Time: 6:24 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "OWNER")
public class Owner extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OWNER_ID")
    private long ownerId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "TELEPHONE")
    private String telephone;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "OWNER_ID")
    @Fetch(value = FetchMode.SELECT)
    private Set<Pet> pets = new HashSet<Pet>();

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

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
