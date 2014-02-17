package com.emaratech.service.petclinic.models;

import org.joda.time.DateTime;

/**
 * Created with IntelliJ IDEA.
 * User: ABC
 * Date: 2/3/14
 * Time: 11:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class EntityBaseSrvMdl {
    private int createdBy;
    private DateTime createdOn;
    private int updatedBy;
    private DateTime updatedOn;

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public DateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(DateTime createdOn) {
        this.createdOn = createdOn;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public DateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(DateTime updatedOn) {
        this.updatedOn = updatedOn;
    }
}
