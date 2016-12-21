package com.saic.uicds.core;

import org.apache.xmlbeans.XmlObject;
import org.springframework.ws.client.core.WebServiceTemplate;

public interface CoreServiceTemplate {
    public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate);

    public XmlObject marshalSendAndReceive(XmlObject request);
}
