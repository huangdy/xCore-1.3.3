package com.saic.uicds.core.em.testing.util;

import gov.niem.niem.niemCore.x20.TextType;

import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.uicds.incident.impl.IncidentDocumentImpl;
import org.uicds.incidentManagementService.CreateIncidentRequestDocument;
import org.uicds.incidentManagementService.UpdateIncidentRequestDocument;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

public class IncidentManagementTestUtils {

    static public CreateIncidentRequestDocument getCreateIncidentRequest(String fileName)
        throws XmlException, IOException {

        CreateIncidentRequestDocument request = null;
        request = CreateIncidentRequestDocument.Factory.parse(new File(fileName));
        TextType description = TextType.Factory.newInstance();
        description.setStringValue("testing &, <, >, ', characters in description field");
        request.getCreateIncidentRequest().getIncident().setActivityDescriptionTextArray(0,
            description);
        TextType name = TextType.Factory.newInstance();
        name.setStringValue("testing &, <, >, ', characters in name field");
        request.getCreateIncidentRequest().getIncident().setActivityNameArray(0, name);
        return request;
    }

    static public UpdateIncidentRequestDocument getUpdateIncidentRequest(IdentificationType wpid,
        WorkProduct incidentWorkProduct) {

        XmlObject payload = WorkProductHelper.getPayload(incidentWorkProduct.getStructuredPayloadArray(0));
        if (payload instanceof IncidentDocumentImpl) {
            UpdateIncidentRequestDocument request = UpdateIncidentRequestDocument.Factory.newInstance();
            request.addNewUpdateIncidentRequest().addNewIncident();
            request.getUpdateIncidentRequest().getIncident().set(payload);
            request.getUpdateIncidentRequest().setWorkProductIdentification(wpid);
            return request;
        }

        return null;
    }
}
