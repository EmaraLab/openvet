package com.emaratech.services.utils;

import org.eclipse.persistence.oxm.XMLNameTransformer;


public class DefaultNameGeneration implements XMLNameTransformer
{
    @Override
    public String transformTypeName(String targetName) {
        return targetName.substring(targetName.lastIndexOf('.') + 1);
    }

    @Override
    public String transformElementName(String targetName) {
        return doConversion(targetName);
    }

    @Override
    public String transformAttributeName(String attributeName) {
        return doConversion(attributeName);
    }

    @Override
    public String transformRootElementName(String targetName) {
        return doConversion(targetName);
    }

    public String doConversion(final String targetName) {
        StringBuilder strBldr = new StringBuilder();
        for(char character : targetName.toCharArray()) {
            if(Character.isUpperCase(character)) {
                strBldr.append('_');
                strBldr.append(Character.toLowerCase(character));
            } else {
                strBldr.append(character);
            }
        }
        return strBldr.toString();

    }
}
