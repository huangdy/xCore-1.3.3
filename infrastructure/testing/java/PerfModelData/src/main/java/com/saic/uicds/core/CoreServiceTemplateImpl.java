package com.saic.uicds.core;

import org.apache.xmlbeans.XmlObject;
import org.springframework.ws.client.WebServiceTransportException;
import org.springframework.ws.client.core.WebServiceTemplate;

public class CoreServiceTemplateImpl implements CoreServiceTemplate {

    private WebServiceTemplate webServiceTemplate;
    
	@Override
	public XmlObject marshalSendAndReceive(XmlObject request) {
		XmlObject response = null;
		try {
			response = (XmlObject) webServiceTemplate
			.marshalSendAndReceive(request);
		}
		catch (WebServiceTransportException e) {
			System.err.println("ERROR invoking service: " + e.getMessage());
		}
		return response;
	}

	@Override
	public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {
		this.webServiceTemplate = webServiceTemplate;
	}

}
