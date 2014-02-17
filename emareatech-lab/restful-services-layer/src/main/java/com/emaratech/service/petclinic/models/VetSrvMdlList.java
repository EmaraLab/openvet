package com.emaratech.service.petclinic.models;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/4/14
 * Time: 3:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class VetSrvMdlList {
    private List<VetSrvMdl> vetSrvMdlList;

    public VetSrvMdlList() {

    }

    public VetSrvMdlList(List<VetSrvMdl> vetSrvMdlList) {
        this.vetSrvMdlList = vetSrvMdlList;
    }

    public List<VetSrvMdl> getVetSrvMdlList() {
        return vetSrvMdlList;
    }

    public void setVetSrvMdlList(List<VetSrvMdl> vetSrvMdlList) {
        this.vetSrvMdlList = vetSrvMdlList;
    }
}
