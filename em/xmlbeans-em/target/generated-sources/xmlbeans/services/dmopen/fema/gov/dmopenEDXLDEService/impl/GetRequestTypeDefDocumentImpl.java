/*
 * An XML document type.
 * Localname: getRequestTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/
 * Java type: services.dmopen.fema.gov.dmopenEDXLDEService.GetRequestTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenEDXLDEService.impl;
/**
 * A document containing one getRequestTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/) element.
 *
 * This is a complex type.
 */
public class GetRequestTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenEDXLDEService.GetRequestTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRequestTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREQUESTTYPEDEF$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/", "getRequestTypeDef");
    
    
    /**
     * Gets the "getRequestTypeDef" element
     */
    public services.dmopen.fema.gov.edxlrequest.RequestParameterList getGetRequestTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlrequest.RequestParameterList target = null;
            target = (services.dmopen.fema.gov.edxlrequest.RequestParameterList)get_store().find_element_user(GETREQUESTTYPEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getRequestTypeDef" element
     */
    public void setGetRequestTypeDef(services.dmopen.fema.gov.edxlrequest.RequestParameterList getRequestTypeDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlrequest.RequestParameterList target = null;
            target = (services.dmopen.fema.gov.edxlrequest.RequestParameterList)get_store().find_element_user(GETREQUESTTYPEDEF$0, 0);
            if (target == null)
            {
                target = (services.dmopen.fema.gov.edxlrequest.RequestParameterList)get_store().add_element_user(GETREQUESTTYPEDEF$0);
            }
            target.set(getRequestTypeDef);
        }
    }
    
    /**
     * Appends and returns a new empty "getRequestTypeDef" element
     */
    public services.dmopen.fema.gov.edxlrequest.RequestParameterList addNewGetRequestTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlrequest.RequestParameterList target = null;
            target = (services.dmopen.fema.gov.edxlrequest.RequestParameterList)get_store().add_element_user(GETREQUESTTYPEDEF$0);
            return target;
        }
    }
}
