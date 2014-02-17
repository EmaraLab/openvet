package com.emaratech.service.petclinic.models;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/4/14
 * Time: 12:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class OwnerSrvMdlList {
    @XmlPath("owner")
    private List<OwnerSrvMdl> ownerSrvMdlList;

    public OwnerSrvMdlList() {

    }

    public OwnerSrvMdlList(List<OwnerSrvMdl> ownerSrvMdlList) {
        this.ownerSrvMdlList = ownerSrvMdlList;
    }

    public List<OwnerSrvMdl> getOwnerSrvMdlList() {
        return ownerSrvMdlList;
    }

    public void setOwnerSrvMdlList(List<OwnerSrvMdl> ownerSrvMdlList) {
        this.ownerSrvMdlList = ownerSrvMdlList;
    }
}
