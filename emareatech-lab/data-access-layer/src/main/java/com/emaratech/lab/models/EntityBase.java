package com.emaratech.lab.models;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ABC
 * Date: 1/30/14
 * Time: 11:46 PM
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public class EntityBase {
    @Column(name = "CREATED_ON", nullable = false)
    private DateTime createdOn;
    @Column(name = "CREATED_BY", nullable = false)
    private int createdBy;
    @Column(name = "UPDATED_ON", nullable = false)
    private DateTime updatedOn;
    @Column(name = "UPDATED_BY", nullable = false)
    private int updatedBy;

    protected EntityBase() {
    }

    public DateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(DateTime createdOn) {
        this.createdOn = createdOn;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public DateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(DateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public int getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(int updatedBy) {
        this.updatedBy = updatedBy;
    }

    public void init() {
        this.createdBy = 1;
        this.updatedBy = 1;
        this.updatedOn = new DateTime();
        this.createdOn = new DateTime();
    }
}
