/*
 * An XML document type.
 * Localname: postCAPRequestTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_CAPService/
 * Java type: services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenCAPService.impl;
/**
 * A document containing one postCAPRequestTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/) element.
 *
 * This is a complex type.
 */
public class PostCAPRequestTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostCAPRequestTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTCAPREQUESTTYPEDEF$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_CAPService/", "postCAPRequestTypeDef");
    
    
    /**
     * Gets the "postCAPRequestTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef getPostCAPRequestTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef)get_store().find_element_user(POSTCAPREQUESTTYPEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "postCAPRequestTypeDef" element
     */
    public void setPostCAPRequestTypeDef(services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef postCAPRequestTypeDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef)get_store().find_element_user(POSTCAPREQUESTTYPEDEF$0, 0);
            if (target == null)
            {
                target = (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef)get_store().add_element_user(POSTCAPREQUESTTYPEDEF$0);
            }
            target.set(postCAPRequestTypeDef);
        }
    }
    
    /**
     * Appends and returns a new empty "postCAPRequestTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef addNewPostCAPRequestTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef)get_store().add_element_user(POSTCAPREQUESTTYPEDEF$0);
            return target;
        }
    }
    /**
     * An XML postCAPRequestTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/).
     *
     * This is a complex type.
     */
    public static class PostCAPRequestTypeDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef
    {
        private static final long serialVersionUID = 1L;
        
        public PostCAPRequestTypeDefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALERT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "alert");
        
        
        /**
         * Gets the "alert" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert getAlert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "alert" element
         */
        public void setAlert(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert alert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$0, 0);
                if (target == null)
                {
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().add_element_user(ALERT$0);
                }
                target.set(alert);
            }
        }
        
        /**
         * Appends and returns a new empty "alert" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert addNewAlert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().add_element_user(ALERT$0);
                return target;
            }
        }
    }
}
