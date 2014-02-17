package com.emaratech.services.utils;

import org.joda.time.DateTime;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/3/14
 * Time: 3:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class JodaDateTimeAdapter extends XmlAdapter<String, DateTime> {

    @Override
    public DateTime unmarshal(String v) throws Exception {
        return new DateTime(v);
    }

    @Override
    public String marshal(DateTime v) throws Exception {
        return v.toString();
    }
}
