package com.emaratech.services.models;

import com.emaratech.lab.models.Vet;
import com.emaratech.service.petclinic.models.OwnerSrvMdl;
import org.eclipse.persistence.oxm.annotations.XmlParameter;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ABC
 * Date: 2/4/14
 * Time: 7:48 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlSeeAlso(Vet.class)
@XmlRootElement
public class ServiceRequest<T> {
    @XmlPath("request_header/channel_id/text()")
    private String channelId;
    @XmlPath("request_header/request_time/text()")
    private DateTime requestTime;
    @XmlPath("request_header/request_params")
    private Map<String,String> requestParams = new HashMap<String, String>();
    @XmlPath("request_body/payload")
    private T payLoad;

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public DateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(DateTime requestTime) {
        this.requestTime = requestTime;
    }

    public Map<String, String> getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(Map<String, String> requestParams) {
        this.requestParams = requestParams;
    }

    public T getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(T payLoad) {
        this.payLoad = payLoad;
    }

    public void addRequestParam(String key, String value) {
        requestParams.put(key, value);
    }
}
