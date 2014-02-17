package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: farhan.amin
 * Date: 2/2/14
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("test")
public class Test {
    @XmlRootElement
    public static class HelloWorld {
        private String name;
        private String fatherName;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
    @GET
    @Produces( {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response get() {
//        ServiceResponse<HelloWorld> serviceResponse = new ServiceResponse<HelloWorld>();
//        serviceResponse.setServerTime(new DateTime());
//        serviceResponse.setErrorMessage("SUCCESS!");
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setFatherName("M Amin");
//        helloWorld.setName("Farhan");
//        helloWorld.setPhoneNumber("00912312312");
//        serviceResponse.setResult(helloWorld);
//        serviceResponse.setResultFlag(0);
//
//        Map<String,String> map = new HashMap<String, String>();
//        map.put("key1", "value1");
//        map.put("key2", "value2");
//        map.put("key3", "value3");
//
//        serviceResponse.setAdditionalParams(map);

        return Response.ok(null).build();
    }

    public static void main(String[] args) {

    }
}
