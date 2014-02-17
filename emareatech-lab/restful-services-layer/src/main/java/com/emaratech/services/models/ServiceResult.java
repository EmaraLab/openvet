package com.emaratech.services.models;

import org.eclipse.persistence.oxm.annotations.XmlPath;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/3/14
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */

public class ServiceResult {
    private static ServiceResult fail = new ServiceResult(1, "FAILURE");
    private static ServiceResult pass = new ServiceResult(0, "SUCCESS");


    private ServiceResult(int success, String message) {
        this.message = message;
        this.success = success;
    }

    private ServiceResult() {
        this.success = 0;
        this.message = "";

    }

    public boolean isSuccess() {
        return success == 0;
    }

    public boolean isFailure() {
        return success == 1;
    }

    public String getMessage() {
        return message;
    }

    public static ServiceResult success() {
        return pass;
    }

    public static ServiceResult fail() {
        return fail;
    }

    @XmlPath("error_code/text()")
    private int success;
    @XmlPath("error_message/text()")
    private String message;
}
