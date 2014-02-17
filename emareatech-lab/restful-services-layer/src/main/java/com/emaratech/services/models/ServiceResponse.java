package com.emaratech.services.models;


import com.emaratech.lab.models.Owner;
import com.emaratech.lab.models.Pet;
import com.emaratech.lab.models.PetType;
import com.emaratech.lab.models.Speciality;
import com.emaratech.service.petclinic.models.*;
import org.eclipse.persistence.oxm.annotations.XmlPath;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.*;
import java.util.Map;

@XmlRootElement(name = "service_response")
@XmlSeeAlso({OwnerSrvMdl.class, ServiceResult.class, PetSrvMdl.class, PetTypeSrvMdl.class,
        PetTypeSrvMdlList.class, OwnerSrvMdlList.class, VetSrvMdlList.class, Speciality.class})
public class ServiceResponse<T> {
    private ServiceResponse(ServiceResult serviceResult) {
        this.serverTime = new DateTime();
        this.serviceResult = serviceResult;
    }

    public ServiceResponse() {

    }

    public static final int SUCCESS =0;
    public static final int FAILURE =1;

//
//    @XmlEnum

    @XmlPath("response_header/operatioin_result")
    private ServiceResult serviceResult;
    @XmlPath("response_header/server_time/text()")
    private DateTime serverTime;
    @XmlPath("response_header/error_details")
    private Map<String,String> additionalParams;
    @XmlPath("response_body/pay_load")
    private T result;

    public DateTime getServerTime() {
        return serverTime;
    }

    public void setServerTime(DateTime serverTime) {
        this.serverTime = serverTime;

    }

    public Map<String, String> getAdditionalParams() {
        return additionalParams;
    }

    public void setAdditionalParams(Map<String, String> additionalParams) {
        this.additionalParams = additionalParams;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public static <T> ServiceResponse<T> success() {
        return new ServiceResponse<T>(ServiceResult.success());
    }

    public static <T> ServiceResponse<T> failure() {
        return new ServiceResponse<T>(ServiceResult.fail());
    }
}
