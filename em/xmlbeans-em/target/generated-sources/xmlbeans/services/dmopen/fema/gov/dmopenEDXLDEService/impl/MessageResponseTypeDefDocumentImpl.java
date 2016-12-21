/*
 * An XML document type.
 * Localname: messageResponseTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/
 * Java type: services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenEDXLDEService.impl;
/**
 * A document containing one messageResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/) element.
 *
 * This is a complex type.
 */
public class MessageResponseTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageResponseTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGERESPONSETYPEDEF$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/", "messageResponseTypeDef");
    
    
    /**
     * Gets the "messageResponseTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef getMessageResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef)get_store().find_element_user(MESSAGERESPONSETYPEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messageResponseTypeDef" element
     */
    public void setMessageResponseTypeDef(services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef messageResponseTypeDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef)get_store().find_element_user(MESSAGERESPONSETYPEDEF$0, 0);
            if (target == null)
            {
                target = (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef)get_store().add_element_user(MESSAGERESPONSETYPEDEF$0);
            }
            target.set(messageResponseTypeDef);
        }
    }
    
    /**
     * Appends and returns a new empty "messageResponseTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef addNewMessageResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef)get_store().add_element_user(MESSAGERESPONSETYPEDEF$0);
            return target;
        }
    }
    /**
     * An XML messageResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/).
     *
     * This is a complex type.
     */
    public static class MessageResponseTypeDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef
    {
        private static final long serialVersionUID = 1L;
        
        public MessageResponseTypeDefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EDXLDISTRIBUTION$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "EDXLDistribution");
        
        
        /**
         * Gets array of all "EDXLDistribution" elements
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[] getEDXLDistributionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EDXLDISTRIBUTION$0, targetList);
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[] result = new x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "EDXLDistribution" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution getEDXLDistributionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "EDXLDistribution" element
         */
        public int sizeOfEDXLDistributionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EDXLDISTRIBUTION$0);
            }
        }
        
        /**
         * Sets array of all "EDXLDistribution" element
         */
        public void setEDXLDistributionArray(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[] edxlDistributionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(edxlDistributionArray, EDXLDISTRIBUTION$0);
            }
        }
        
        /**
         * Sets ith "EDXLDistribution" element
         */
        public void setEDXLDistributionArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution edxlDistribution)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(edxlDistribution);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EDXLDistribution" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution insertNewEDXLDistribution(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().insert_element_user(EDXLDISTRIBUTION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EDXLDistribution" element
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
        
        /**
         * Removes the ith "EDXLDistribution" element
         */
        public void removeEDXLDistribution(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EDXLDISTRIBUTION$0, i);
            }
        }
    }
}
