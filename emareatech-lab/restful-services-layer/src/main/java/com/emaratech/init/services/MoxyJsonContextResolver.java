package com.emaratech.init.services;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.Marshaller;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;

@Provider
public class MoxyJsonContextResolver implements ContextResolver<MoxyJsonConfig> {
    private final MoxyJsonConfig config;

    public MoxyJsonContextResolver() {
        config = new MoxyJsonConfig()
                .setAttributePrefix("")
                .setValueWrapper("value")
                .setMarshalEmptyCollections(true)
                .setIncludeRoot(true)
                .property(JAXBContextProperties.JSON_WRAPPER_AS_ARRAY_NAME, true)
                  .property(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//            .property(MarshallerProperties.JSON_INCLUDE_ROOT, Boolean.TRUE);
    }

    public MoxyJsonConfig getContext(Class<?> objectType) {
        return config;
    }

}