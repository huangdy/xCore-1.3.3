/*
 * An XML document type.
 * Localname: messageResponseTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_CAPService/
 * Java type: services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenCAPService.impl;
/**
 * A document containing one messageResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/) element.
 *
 * This is a complex type.
 */
public class MessageResponseTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageResponseTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGERESPONSETYPEDEF$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_CAPService/", "messageResponseTypeDef");
    
    
    /**
     * Gets the "messageResponseTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef getMessageResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef)get_store().find_element_user(MESSAGERESPONSETYPEDEF$0, 0);
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
    public void setMessageResponseTypeDef(services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef messageResponseTypeDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef)get_store().find_element_user(MESSAGERESPONSETYPEDEF$0, 0);
            if (target == null)
            {
                target = (services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef)get_store().add_element_user(MESSAGERESPONSETYPEDEF$0);
            }
            target.set(messageResponseTypeDef);
        }
    }
    
    /**
     * Appends and returns a new empty "messageResponseTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef addNewMessageResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef)get_store().add_element_user(MESSAGERESPONSETYPEDEF$0);
            return target;
        }
    }
    /**
     * An XML messageResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/).
     *
     * This is a complex type.
     */
    public static class MessageResponseTypeDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenCAPService.MessageResponseTypeDefDocument.MessageResponseTypeDef
    {
        private static final long serialVersionUID = 1L;
        
        public MessageResponseTypeDefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALERT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "alert");
        
        
        /**
         * Gets array of all "alert" elements
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[] getAlertArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALERT$0, targetList);
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "alert" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert getAlertArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "alert" element
         */
        public int sizeOfAlertArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALERT$0);
            }
        }
        
        /**
         * Sets array of all "alert" element
         */
        public void setAlertArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[] alertArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(alertArray, ALERT$0);
            }
        }
        
        /**
         * Sets ith "alert" element
         */
        public void setAlertArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert alert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(alert);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "alert" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert insertNewAlert(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().insert_element_user(ALERT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "alert" element
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
        
        /**
         * Removes the ith "alert" element
         */
        public void removeAlert(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALERT$0, i);
            }
        }
    }
}
