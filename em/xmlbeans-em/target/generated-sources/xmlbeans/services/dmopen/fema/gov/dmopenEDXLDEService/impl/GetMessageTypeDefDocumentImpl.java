/*
 * An XML document type.
 * Localname: getMessageTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/
 * Java type: services.dmopen.fema.gov.dmopenEDXLDEService.GetMessageTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenEDXLDEService.impl;
/**
 * A document containing one getMessageTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/) element.
 *
 * This is a complex type.
 */
public class GetMessageTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenEDXLDEService.GetMessageTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMessageTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMESSAGETYPEDEF$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/", "getMessageTypeDef");
    
    
    /**
     * Gets the "getMessageTypeDef" element
     */
    public services.dmopen.fema.gov.edxlrequest.RequestParameterList getGetMessageTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlrequest.RequestParameterList target = null;
            target = (services.dmopen.fema.gov.edxlrequest.RequestParameterList)get_store().find_element_user(GETMESSAGETYPEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMessageTypeDef" element
     */
    public void setGetMessageTypeDef(services.dmopen.fema.gov.edxlrequest.RequestParameterList getMessageTypeDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlrequest.RequestParameterList target = null;
            target = (services.dmopen.fema.gov.edxlrequest.RequestParameterList)get_store().find_element_user(GETMESSAGETYPEDEF$0, 0);
            if (target == null)
            {
                target = (services.dmopen.fema.gov.edxlrequest.RequestParameterList)get_store().add_element_user(GETMESSAGETYPEDEF$0);
            }
            target.set(getMessageTypeDef);
        }
    }
    
    /**
     * Appends and returns a new empty "getMessageTypeDef" element
     */
    public services.dmopen.fema.gov.edxlrequest.RequestParameterList addNewGetMessageTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.edxlrequest.RequestParameterList target = null;
            target = (services.dmopen.fema.gov.edxlrequest.RequestParameterList)get_store().add_element_user(GETMESSAGETYPEDEF$0);
            return target;
        }
    }
}
