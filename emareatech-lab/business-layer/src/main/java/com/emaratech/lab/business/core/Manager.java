package com.emaratech.lab.business.core;


import com.emaratech.lab.models.Owner;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: ABC
 * Date: 2/1/14
 * Time: 1:04 AM
 * To change this template use File | Settings | File Templates.
 */
@Component
public class Manager {
    @Autowired
    private PetClinicManagerBase service;

    @Transactional
    public void test() {


    }
}
