/**
 * 
 */
package com.saic.uicds.core;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlObject;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.PropertiesType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;

/**
 * @author roger
 * 
 */
public class UicdsWorkProduct {
    public static final String WorkProductIdUrn = "urn:uicds:workproduct:id";
    public static final String WorkProductTypeUrn = "urn:uicds:workproduct:type";

    IdentificationType workProductIdentifier;
    WorkProduct workProduct;
    String type;
    String workProductID;

    private static final String PRECISS_NS = "http://www.saic.com/precis/2009/06/structures";
    private static final String PRECISB_NS = "http://www.saic.com/precis/2009/06/base";
    private static final String WORKPRODUCT_IDENTIFICATION = "WorkProductIdentification";
    private static final String WORKPRODUCT_PROPERTIES = "WorkProductProperties";

    public UicdsWorkProduct(IdentificationType id) {
        setIdentificationInformation(id);
    }
    
    public UicdsWorkProduct(WorkProduct wp) {
    	workProduct = wp;
    	setIdentificationInformation(getIdentificationElement(workProduct));
    }

	private void setIdentificationInformation(IdentificationType id) {
		if (id != null) {
			workProductIdentifier = id;
			workProduct = null;
			type = id.getType().getStringValue();
			workProductID = id.getIdentifier().getStringValue();
		}
	}

    public String getType() {
    	return type;
    }

    public String getId() {
        return workProductID;
    }

    XmlObject getContent() {
    	if (workProduct == null) return null;
    	
    	if (workProduct.sizeOfStructuredPayloadArray() > 0) {
    		return workProduct.getStructuredPayloadArray(0);
    	}
    	else {
    		return null;
    	}
    }
    
    public static final void substitute(XmlObject parentObject, String subNamespace,
            String subTypeName, SchemaType subSchemaType, XmlObject theObject) {

        XmlObject subObject = parentObject.substitute(new QName(subNamespace, subTypeName),
                subSchemaType);
        if (subObject == parentObject) {
            System.out.println("cannot change to " + subTypeName);
        } else {
            subObject.set(theObject);
        }
    }

	public static void setIdentifierElement(
			XmlObject packageMetadataExtensionAbstract,
			XmlObject workProductIdentification) {
		substitute(packageMetadataExtensionAbstract, PRECISS_NS, WORKPRODUCT_IDENTIFICATION, IdentificationType.type, workProductIdentification);
	}

	public static void setPropertiesElement(
			XmlObject packageMetadataExtensionAbstract,
			XmlObject workProductProperties) {
		substitute(packageMetadataExtensionAbstract, PRECISS_NS, WORKPRODUCT_PROPERTIES, PropertiesType.type, workProductProperties);
	}
	
	public static IdentificationType getIdentificationElement(WorkProduct workProduct) {
		IdentificationType id = null;
		XmlObject[] objects = workProduct.getPackageMetadata().selectChildren(new QName(PRECISS_NS, WORKPRODUCT_IDENTIFICATION));
		if (objects.length > 0) {
			id = (IdentificationType)objects[0];
		}
		return id;
	}

	public static PropertiesType getPropertiesElement(WorkProduct workProduct) {
		PropertiesType properties = null;
		XmlObject[] objects = workProduct.getPackageMetadata().selectChildren(new QName(PRECISS_NS, WORKPRODUCT_PROPERTIES));
		if (objects.length > 0) {
			properties = (PropertiesType)objects[0];
		}
		return properties;
	}

}
