package com.emaratech.lab.models;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/3/14
 * Time: 2:05 PM
 * To change this template use File | Settings | File Templates.
 */

@MappedSuperclass
public class LookUpBase extends EntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "LK_ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
