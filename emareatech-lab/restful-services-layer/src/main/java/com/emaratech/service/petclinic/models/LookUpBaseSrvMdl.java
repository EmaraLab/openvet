package com.emaratech.service.petclinic.models;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/4/14
 * Time: 10:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class LookUpBaseSrvMdl extends  EntityBaseSrvMdl {
    private long id;
    private String name;
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
