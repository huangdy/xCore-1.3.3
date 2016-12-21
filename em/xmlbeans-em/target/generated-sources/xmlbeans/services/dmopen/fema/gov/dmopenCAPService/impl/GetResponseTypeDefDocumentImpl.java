/*
 * An XML document type.
 * Localname: getResponseTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_CAPService/
 * Java type: services.dmopen.fema.gov.dmopenCAPService.GetResponseTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenCAPService.impl;
/**
 * A document containing one getResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/) element.
 *
 * This is a complex type.
 */
public class GetResponseTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenCAPService.GetResponseTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetResponseTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRESPONSETYPEDEF$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_CAPService/", "getResponseTypeDef");
    
    
    /**
     * Gets the "getResponseTypeDef" element
     */
    public services.dmopen.fema.gov.capresponse.ResponseParameterList getGetResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.capresponse.ResponseParameterList target = null;
            target = (services.dmopen.fema.gov.capresponse.ResponseParameterList)get_store().find_element_user(GETRESPONSETYPEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getResponseTypeDef" element
     */
    public void setGetResponseTypeDef(services.dmopen.fema.gov.capresponse.ResponseParameterList getResponseTypeDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.capresponse.ResponseParameterList target = null;
            target = (services.dmopen.fema.gov.capresponse.ResponseParameterList)get_store().find_element_user(GETRESPONSETYPEDEF$0, 0);
            if (target == null)
            {
                target = (services.dmopen.fema.gov.capresponse.ResponseParameterList)get_store().add_element_user(GETRESPONSETYPEDEF$0);
            }
            target.set(getResponseTypeDef);
        }
    }
    
    /**
     * Appends and returns a new empty "getResponseTypeDef" element
     */
    public services.dmopen.fema.gov.capresponse.ResponseParameterList addNewGetResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.capresponse.ResponseParameterList target = null;
            target = (services.dmopen.fema.gov.capresponse.ResponseParameterList)get_store().add_element_user(GETRESPONSETYPEDEF$0);
            return target;
        }
    }
}
