/*
 * An XML document type.
 * Localname: postEdxlRequestTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/
 * Java type: services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenEDXLDEService.impl;
/**
 * A document containing one postEdxlRequestTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/) element.
 *
 * This is a complex type.
 */
public class PostEdxlRequestTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostEdxlRequestTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTEDXLREQUESTTYPEDEF$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/", "postEdxlRequestTypeDef");
    
    
    /**
     * Gets the "postEdxlRequestTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef getPostEdxlRequestTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef)get_store().find_element_user(POSTEDXLREQUESTTYPEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "postEdxlRequestTypeDef" element
     */
    public void setPostEdxlRequestTypeDef(services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef postEdxlRequestTypeDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef)get_store().find_element_user(POSTEDXLREQUESTTYPEDEF$0, 0);
            if (target == null)
            {
                target = (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef)get_store().add_element_user(POSTEDXLREQUESTTYPEDEF$0);
            }
            target.set(postEdxlRequestTypeDef);
        }
    }
    
    /**
     * Appends and returns a new empty "postEdxlRequestTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef addNewPostEdxlRequestTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef)get_store().add_element_user(POSTEDXLREQUESTTYPEDEF$0);
            return target;
        }
    }
    /**
     * An XML postEdxlRequestTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/).
     *
     * This is a complex type.
     */
    public static class PostEdxlRequestTypeDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlRequestTypeDefDocument.PostEdxlRequestTypeDef
    {
        private static final long serialVersionUID = 1L;
        
        public PostEdxlRequestTypeDefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EDXLDISTRIBUTION$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "EDXLDistribution");
        
        
        /**
         * Gets the "EDXLDistribution" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution getEDXLDistribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "EDXLDistribution" element
         */
        public void setEDXLDistribution(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution edxlDistribution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().add_element_user(EDXLDISTRIBUTION$0);
                }
                target.set(edxlDistribution);
            }
        }
        
        /**
         * Appends and returns a new empty "EDXLDistribution" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution addNewEDXLDistribution()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().add_element_user(EDXLDISTRIBUTION$0);
                return target;
            }
        }
    }
}
