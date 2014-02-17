@XmlJavaTypeAdapters({
        @XmlJavaTypeAdapter(type=DateTime.class,
                value=JodaDateTimeAdapter.class),

})
        @XmlNameTransformer(DefaultNameGeneration.class)
package com.emaratech.service.petclinic.models;


import com.emaratech.services.utils.DefaultNameGeneration;
import com.emaratech.services.utils.JodaDateTimeAdapter;
import org.eclipse.persistence.oxm.annotations.XmlNameTransformer;
import org.joda.time.DateTime;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

