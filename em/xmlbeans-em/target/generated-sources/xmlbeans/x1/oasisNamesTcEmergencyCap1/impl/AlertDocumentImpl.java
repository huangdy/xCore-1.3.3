/*
 * An XML document type.
 * Localname: alert
 * Namespace: urn:oasis:names:tc:emergency:cap:1.1
 * Java type: x1.oasisNamesTcEmergencyCap1.AlertDocument
 *
 * Automatically generated - do not modify.
 */
package x1.oasisNamesTcEmergencyCap1.impl;
/**
 * A document containing one alert(@urn:oasis:names:tc:emergency:cap:1.1) element.
 *
 * This is a complex type.
 */
public class AlertDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x1.oasisNamesTcEmergencyCap1.AlertDocument
{
    private static final long serialVersionUID = 1L;
    
    public AlertDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
    /**
     * An XML alert(@urn:oasis:names:tc:emergency:cap:1.1).
     *
     * This is a complex type.
     */
    public static class AlertImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert
    {
        private static final long serialVersionUID = 1L;
        
        public AlertImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "identifier");
        private static final javax.xml.namespace.QName SENDER$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "sender");
        private static final javax.xml.namespace.QName SENT$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "sent");
        private static final javax.xml.namespace.QName STATUS$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "status");
        private static final javax.xml.namespace.QName MSGTYPE$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "msgType");
        private static final javax.xml.namespace.QName SOURCE$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "source");
        private static final javax.xml.namespace.QName SCOPE$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "scope");
        private static final javax.xml.namespace.QName RESTRICTION$14 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "restriction");
        private static final javax.xml.namespace.QName ADDRESSES$16 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "addresses");
        private static final javax.xml.namespace.QName CODE$18 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "code");
        private static final javax.xml.namespace.QName NOTE$20 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "note");
        private static final javax.xml.namespace.QName REFERENCES$22 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "references");
        private static final javax.xml.namespace.QName INCIDENTS$24 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "incidents");
        private static final javax.xml.namespace.QName INFO$26 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "info");
        
        
        /**
         * Gets the "identifier" element
         */
        public java.lang.String getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "identifier" element
         */
        public org.apache.xmlbeans.XmlString xgetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "identifier" element
         */
        public void setIdentifier(java.lang.String identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIER$0);
                }
                target.setStringValue(identifier);
            }
        }
        
        /**
         * Sets (as xml) the "identifier" element
         */
        public void xsetIdentifier(org.apache.xmlbeans.XmlString identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFIER$0);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Gets the "sender" element
         */
        public java.lang.String getSender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sender" element
         */
        public org.apache.xmlbeans.XmlString xgetSender()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDER$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sender" element
         */
        public void setSender(java.lang.String sender)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDER$2);
                }
                target.setStringValue(sender);
            }
        }
        
        /**
         * Sets (as xml) the "sender" element
         */
        public void xsetSender(org.apache.xmlbeans.XmlString sender)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDER$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDER$2);
                }
                target.set(sender);
            }
        }
        
        /**
         * Gets the "sent" element
         */
        public java.util.Calendar getSent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "sent" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetSent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sent" element
         */
        public void setSent(java.util.Calendar sent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENT$4);
                }
                target.setCalendarValue(sent);
            }
        }
        
        /**
         * Sets (as xml) the "sent" element
         */
        public void xsetSent(org.apache.xmlbeans.XmlDateTime sent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SENT$4);
                }
                target.set(sent);
            }
        }
        
        /**
         * Gets the "status" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status.Enum getStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "status" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status xgetStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status)get_store().find_element_user(STATUS$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "status" element
         */
        public void setStatus(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status.Enum status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$6);
                }
                target.setEnumValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "status" element
         */
        public void xsetStatus(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status)get_store().find_element_user(STATUS$6, 0);
                if (target == null)
                {
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status)get_store().add_element_user(STATUS$6);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets the "msgType" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType.Enum getMsgType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "msgType" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType xgetMsgType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType)get_store().find_element_user(MSGTYPE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "msgType" element
         */
        public void setMsgType(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType.Enum msgType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MSGTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MSGTYPE$8);
                }
                target.setEnumValue(msgType);
            }
        }
        
        /**
         * Sets (as xml) the "msgType" element
         */
        public void xsetMsgType(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType msgType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType)get_store().find_element_user(MSGTYPE$8, 0);
                if (target == null)
                {
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType)get_store().add_element_user(MSGTYPE$8);
                }
                target.set(msgType);
            }
        }
        
        /**
         * Gets the "source" element
         */
        public java.lang.String getSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "source" element
         */
        public org.apache.xmlbeans.XmlString xgetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "source" element
         */
        public boolean isSetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCE$10) != 0;
            }
        }
        
        /**
         * Sets the "source" element
         */
        public void setSource(java.lang.String source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$10);
                }
                target.setStringValue(source);
            }
        }
        
        /**
         * Sets (as xml) the "source" element
         */
        public void xsetSource(org.apache.xmlbeans.XmlString source)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$10);
                }
                target.set(source);
            }
        }
        
        /**
         * Unsets the "source" element
         */
        public void unsetSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCE$10, 0);
            }
        }
        
        /**
         * Gets the "scope" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope.Enum getScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "scope" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope xgetScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope)get_store().find_element_user(SCOPE$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "scope" element
         */
        public void setScope(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope.Enum scope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$12);
                }
                target.setEnumValue(scope);
            }
        }
        
        /**
         * Sets (as xml) the "scope" element
         */
        public void xsetScope(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope scope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope)get_store().find_element_user(SCOPE$12, 0);
                if (target == null)
                {
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope)get_store().add_element_user(SCOPE$12);
                }
                target.set(scope);
            }
        }
        
        /**
         * Gets the "restriction" element
         */
        public java.lang.String getRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICTION$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "restriction" element
         */
        public org.apache.xmlbeans.XmlString xgetRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESTRICTION$14, 0);
                return target;
            }
        }
        
        /**
         * True if has "restriction" element
         */
        public boolean isSetRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESTRICTION$14) != 0;
            }
        }
        
        /**
         * Sets the "restriction" element
         */
        public void setRestriction(java.lang.String restriction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICTION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTRICTION$14);
                }
                target.setStringValue(restriction);
            }
        }
        
        /**
         * Sets (as xml) the "restriction" element
         */
        public void xsetRestriction(org.apache.xmlbeans.XmlString restriction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESTRICTION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESTRICTION$14);
                }
                target.set(restriction);
            }
        }
        
        /**
         * Unsets the "restriction" element
         */
        public void unsetRestriction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESTRICTION$14, 0);
            }
        }
        
        /**
         * Gets the "addresses" element
         */
        public java.lang.String getAddresses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSES$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "addresses" element
         */
        public org.apache.xmlbeans.XmlString xgetAddresses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSES$16, 0);
                return target;
            }
        }
        
        /**
         * True if has "addresses" element
         */
        public boolean isSetAddresses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADDRESSES$16) != 0;
            }
        }
        
        /**
         * Sets the "addresses" element
         */
        public void setAddresses(java.lang.String addresses)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSES$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSES$16);
                }
                target.setStringValue(addresses);
            }
        }
        
        /**
         * Sets (as xml) the "addresses" element
         */
        public void xsetAddresses(org.apache.xmlbeans.XmlString addresses)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSES$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSES$16);
                }
                target.set(addresses);
            }
        }
        
        /**
         * Unsets the "addresses" element
         */
        public void unsetAddresses()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADDRESSES$16, 0);
            }
        }
        
        /**
         * Gets array of all "code" elements
         */
        public java.lang.String[] getCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODE$18, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "code" element
         */
        public java.lang.String getCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "code" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CODE$18, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "code" element
         */
        public org.apache.xmlbeans.XmlString xgetCodeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "code" element
         */
        public int sizeOfCodeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CODE$18);
            }
        }
        
        /**
         * Sets array of all "code" element
         */
        public void setCodeArray(java.lang.String[] codeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(codeArray, CODE$18);
            }
        }
        
        /**
         * Sets ith "code" element
         */
        public void setCodeArray(int i, java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) array of all "code" element
         */
        public void xsetCodeArray(org.apache.xmlbeans.XmlString[]codeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(codeArray, CODE$18);
            }
        }
        
        /**
         * Sets (as xml) ith "code" element
         */
        public void xsetCodeArray(int i, org.apache.xmlbeans.XmlString code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(code);
            }
        }
        
        /**
         * Inserts the value as the ith "code" element
         */
        public void insertCode(int i, java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CODE$18, i);
                target.setStringValue(code);
            }
        }
        
        /**
         * Appends the value as the last "code" element
         */
        public void addCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$18);
                target.setStringValue(code);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "code" element
         */
        public org.apache.xmlbeans.XmlString insertNewCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CODE$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "code" element
         */
        public org.apache.xmlbeans.XmlString addNewCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "code" element
         */
        public void removeCode(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CODE$18, i);
            }
        }
        
        /**
         * Gets the "note" element
         */
        public java.lang.String getNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "note" element
         */
        public org.apache.xmlbeans.XmlString xgetNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$20, 0);
                return target;
            }
        }
        
        /**
         * True if has "note" element
         */
        public boolean isSetNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTE$20) != 0;
            }
        }
        
        /**
         * Sets the "note" element
         */
        public void setNote(java.lang.String note)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$20);
                }
                target.setStringValue(note);
            }
        }
        
        /**
         * Sets (as xml) the "note" element
         */
        public void xsetNote(org.apache.xmlbeans.XmlString note)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTE$20);
                }
                target.set(note);
            }
        }
        
        /**
         * Unsets the "note" element
         */
        public void unsetNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTE$20, 0);
            }
        }
        
        /**
         * Gets the "references" element
         */
        public java.lang.String getReferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCES$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "references" element
         */
        public org.apache.xmlbeans.XmlString xgetReferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCES$22, 0);
                return target;
            }
        }
        
        /**
         * True if has "references" element
         */
        public boolean isSetReferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REFERENCES$22) != 0;
            }
        }
        
        /**
         * Sets the "references" element
         */
        public void setReferences(java.lang.String references)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCES$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCES$22);
                }
                target.setStringValue(references);
            }
        }
        
        /**
         * Sets (as xml) the "references" element
         */
        public void xsetReferences(org.apache.xmlbeans.XmlString references)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCES$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCES$22);
                }
                target.set(references);
            }
        }
        
        /**
         * Unsets the "references" element
         */
        public void unsetReferences()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REFERENCES$22, 0);
            }
        }
        
        /**
         * Gets the "incidents" element
         */
        public java.lang.String getIncidents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTS$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "incidents" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTS$24, 0);
                return target;
            }
        }
        
        /**
         * True if has "incidents" element
         */
        public boolean isSetIncidents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTS$24) != 0;
            }
        }
        
        /**
         * Sets the "incidents" element
         */
        public void setIncidents(java.lang.String incidents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTS$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTS$24);
                }
                target.setStringValue(incidents);
            }
        }
        
        /**
         * Sets (as xml) the "incidents" element
         */
        public void xsetIncidents(org.apache.xmlbeans.XmlString incidents)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTS$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTS$24);
                }
                target.set(incidents);
            }
        }
        
        /**
         * Unsets the "incidents" element
         */
        public void unsetIncidents()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTS$24, 0);
            }
        }
        
        /**
         * Gets array of all "info" elements
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info[] getInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INFO$26, targetList);
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "info" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info getInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info)get_store().find_element_user(INFO$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "info" element
         */
        public int sizeOfInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INFO$26);
            }
        }
        
        /**
         * Sets array of all "info" element
         */
        public void setInfoArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info[] infoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(infoArray, INFO$26);
            }
        }
        
        /**
         * Sets ith "info" element
         */
        public void setInfoArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info info)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info)get_store().find_element_user(INFO$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(info);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "info" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info insertNewInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info)get_store().insert_element_user(INFO$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "info" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info addNewInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info)get_store().add_element_user(INFO$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "info" element
         */
        public void removeInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INFO$26, i);
            }
        }
        /**
         * An XML status(@urn:oasis:names:tc:emergency:cap:1.1).
         *
         * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Status.
         */
        public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Status
        {
            private static final long serialVersionUID = 1L;
            
            public StatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected StatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML msgType(@urn:oasis:names:tc:emergency:cap:1.1).
         *
         * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$MsgType.
         */
        public static class MsgTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.MsgType
        {
            private static final long serialVersionUID = 1L;
            
            public MsgTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MsgTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML scope(@urn:oasis:names:tc:emergency:cap:1.1).
         *
         * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Scope.
         */
        public static class ScopeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Scope
        {
            private static final long serialVersionUID = 1L;
            
            public ScopeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ScopeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML info(@urn:oasis:names:tc:emergency:cap:1.1).
         *
         * This is a complex type.
         */
        public static class InfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info
        {
            private static final long serialVersionUID = 1L;
            
            public InfoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName LANGUAGE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "language");
            private static final javax.xml.namespace.QName CATEGORY$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "category");
            private static final javax.xml.namespace.QName EVENT$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "event");
            private static final javax.xml.namespace.QName RESPONSETYPE$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "responseType");
            private static final javax.xml.namespace.QName URGENCY$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "urgency");
            private static final javax.xml.namespace.QName SEVERITY$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "severity");
            private static final javax.xml.namespace.QName CERTAINTY$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "certainty");
            private static final javax.xml.namespace.QName AUDIENCE$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "audience");
            private static final javax.xml.namespace.QName EVENTCODE$16 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "eventCode");
            private static final javax.xml.namespace.QName EFFECTIVE$18 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "effective");
            private static final javax.xml.namespace.QName ONSET$20 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "onset");
            private static final javax.xml.namespace.QName EXPIRES$22 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "expires");
            private static final javax.xml.namespace.QName SENDERNAME$24 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "senderName");
            private static final javax.xml.namespace.QName HEADLINE$26 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "headline");
            private static final javax.xml.namespace.QName DESCRIPTION$28 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "description");
            private static final javax.xml.namespace.QName INSTRUCTION$30 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "instruction");
            private static final javax.xml.namespace.QName WEB$32 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "web");
            private static final javax.xml.namespace.QName CONTACT$34 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "contact");
            private static final javax.xml.namespace.QName PARAMETER$36 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "parameter");
            private static final javax.xml.namespace.QName RESOURCE$38 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "resource");
            private static final javax.xml.namespace.QName AREA$40 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "area");
            
            
            /**
             * Gets the "language" element
             */
            public java.lang.String getLanguage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "language" element
             */
            public org.apache.xmlbeans.XmlLanguage xgetLanguage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLanguage target = null;
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().find_element_user(LANGUAGE$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "language" element
             */
            public boolean isSetLanguage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(LANGUAGE$0) != 0;
                }
            }
            
            /**
             * Sets the "language" element
             */
            public void setLanguage(java.lang.String language)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$0);
                    }
                    target.setStringValue(language);
                }
            }
            
            /**
             * Sets (as xml) the "language" element
             */
            public void xsetLanguage(org.apache.xmlbeans.XmlLanguage language)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlLanguage target = null;
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().find_element_user(LANGUAGE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlLanguage)get_store().add_element_user(LANGUAGE$0);
                    }
                    target.set(language);
                }
            }
            
            /**
             * Unsets the "language" element
             */
            public void unsetLanguage()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(LANGUAGE$0, 0);
                }
            }
            
            /**
             * Gets array of all "category" elements
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum[] getCategoryArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CATEGORY$2, targetList);
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "category" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum getCategoryArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "category" elements
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category[] xgetCategoryArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(CATEGORY$2, targetList);
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "category" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category xgetCategoryArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category)get_store().find_element_user(CATEGORY$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category)target;
                }
            }
            
            /**
             * Returns number of "category" element
             */
            public int sizeOfCategoryArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CATEGORY$2);
                }
            }
            
            /**
             * Sets array of all "category" element
             */
            public void setCategoryArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum[] categoryArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(categoryArray, CATEGORY$2);
                }
            }
            
            /**
             * Sets ith "category" element
             */
            public void setCategoryArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum category)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setEnumValue(category);
                }
            }
            
            /**
             * Sets (as xml) array of all "category" element
             */
            public void xsetCategoryArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category[]categoryArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(categoryArray, CATEGORY$2);
                }
            }
            
            /**
             * Sets (as xml) ith "category" element
             */
            public void xsetCategoryArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category category)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category)get_store().find_element_user(CATEGORY$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(category);
                }
            }
            
            /**
             * Inserts the value as the ith "category" element
             */
            public void insertCategory(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum category)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CATEGORY$2, i);
                    target.setEnumValue(category);
                }
            }
            
            /**
             * Appends the value as the last "category" element
             */
            public void addCategory(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category.Enum category)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$2);
                    target.setEnumValue(category);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "category" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category insertNewCategory(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category)get_store().insert_element_user(CATEGORY$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "category" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category addNewCategory()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category)get_store().add_element_user(CATEGORY$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "category" element
             */
            public void removeCategory(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CATEGORY$2, i);
                }
            }
            
            /**
             * Gets the "event" element
             */
            public java.lang.String getEvent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENT$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "event" element
             */
            public org.apache.xmlbeans.XmlString xgetEvent()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENT$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "event" element
             */
            public void setEvent(java.lang.String event)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENT$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENT$4);
                    }
                    target.setStringValue(event);
                }
            }
            
            /**
             * Sets (as xml) the "event" element
             */
            public void xsetEvent(org.apache.xmlbeans.XmlString event)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EVENT$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EVENT$4);
                    }
                    target.set(event);
                }
            }
            
            /**
             * Gets array of all "responseType" elements
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum[] getResponseTypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RESPONSETYPE$6, targetList);
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "responseType" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum getResponseTypeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSETYPE$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "responseType" elements
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType[] xgetResponseTypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RESPONSETYPE$6, targetList);
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "responseType" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType xgetResponseTypeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType)get_store().find_element_user(RESPONSETYPE$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType)target;
                }
            }
            
            /**
             * Returns number of "responseType" element
             */
            public int sizeOfResponseTypeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESPONSETYPE$6);
                }
            }
            
            /**
             * Sets array of all "responseType" element
             */
            public void setResponseTypeArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum[] responseTypeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(responseTypeArray, RESPONSETYPE$6);
                }
            }
            
            /**
             * Sets ith "responseType" element
             */
            public void setResponseTypeArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum responseType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSETYPE$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setEnumValue(responseType);
                }
            }
            
            /**
             * Sets (as xml) array of all "responseType" element
             */
            public void xsetResponseTypeArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType[]responseTypeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(responseTypeArray, RESPONSETYPE$6);
                }
            }
            
            /**
             * Sets (as xml) ith "responseType" element
             */
            public void xsetResponseTypeArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType responseType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType)get_store().find_element_user(RESPONSETYPE$6, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(responseType);
                }
            }
            
            /**
             * Inserts the value as the ith "responseType" element
             */
            public void insertResponseType(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum responseType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RESPONSETYPE$6, i);
                    target.setEnumValue(responseType);
                }
            }
            
            /**
             * Appends the value as the last "responseType" element
             */
            public void addResponseType(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType.Enum responseType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSETYPE$6);
                    target.setEnumValue(responseType);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "responseType" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType insertNewResponseType(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType)get_store().insert_element_user(RESPONSETYPE$6, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "responseType" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType addNewResponseType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType)get_store().add_element_user(RESPONSETYPE$6);
                    return target;
                }
            }
            
            /**
             * Removes the ith "responseType" element
             */
            public void removeResponseType(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESPONSETYPE$6, i);
                }
            }
            
            /**
             * Gets the "urgency" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency.Enum getUrgency()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URGENCY$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "urgency" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency xgetUrgency()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency)get_store().find_element_user(URGENCY$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "urgency" element
             */
            public void setUrgency(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency.Enum urgency)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URGENCY$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URGENCY$8);
                    }
                    target.setEnumValue(urgency);
                }
            }
            
            /**
             * Sets (as xml) the "urgency" element
             */
            public void xsetUrgency(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency urgency)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency)get_store().find_element_user(URGENCY$8, 0);
                    if (target == null)
                    {
                      target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency)get_store().add_element_user(URGENCY$8);
                    }
                    target.set(urgency);
                }
            }
            
            /**
             * Gets the "severity" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity.Enum getSeverity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "severity" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity xgetSeverity()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity)get_store().find_element_user(SEVERITY$10, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "severity" element
             */
            public void setSeverity(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity.Enum severity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEVERITY$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEVERITY$10);
                    }
                    target.setEnumValue(severity);
                }
            }
            
            /**
             * Sets (as xml) the "severity" element
             */
            public void xsetSeverity(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity severity)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity)get_store().find_element_user(SEVERITY$10, 0);
                    if (target == null)
                    {
                      target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity)get_store().add_element_user(SEVERITY$10);
                    }
                    target.set(severity);
                }
            }
            
            /**
             * Gets the "certainty" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty.Enum getCertainty()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CERTAINTY$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "certainty" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty xgetCertainty()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty)get_store().find_element_user(CERTAINTY$12, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "certainty" element
             */
            public void setCertainty(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty.Enum certainty)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CERTAINTY$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CERTAINTY$12);
                    }
                    target.setEnumValue(certainty);
                }
            }
            
            /**
             * Sets (as xml) the "certainty" element
             */
            public void xsetCertainty(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty certainty)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty)get_store().find_element_user(CERTAINTY$12, 0);
                    if (target == null)
                    {
                      target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty)get_store().add_element_user(CERTAINTY$12);
                    }
                    target.set(certainty);
                }
            }
            
            /**
             * Gets the "audience" element
             */
            public java.lang.String getAudience()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUDIENCE$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "audience" element
             */
            public org.apache.xmlbeans.XmlString xgetAudience()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUDIENCE$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "audience" element
             */
            public boolean isSetAudience()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AUDIENCE$14) != 0;
                }
            }
            
            /**
             * Sets the "audience" element
             */
            public void setAudience(java.lang.String audience)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUDIENCE$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUDIENCE$14);
                    }
                    target.setStringValue(audience);
                }
            }
            
            /**
             * Sets (as xml) the "audience" element
             */
            public void xsetAudience(org.apache.xmlbeans.XmlString audience)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUDIENCE$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUDIENCE$14);
                    }
                    target.set(audience);
                }
            }
            
            /**
             * Unsets the "audience" element
             */
            public void unsetAudience()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AUDIENCE$14, 0);
                }
            }
            
            /**
             * Gets array of all "eventCode" elements
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode[] getEventCodeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(EVENTCODE$16, targetList);
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "eventCode" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode getEventCodeArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode)get_store().find_element_user(EVENTCODE$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "eventCode" element
             */
            public int sizeOfEventCodeArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EVENTCODE$16);
                }
            }
            
            /**
             * Sets array of all "eventCode" element
             */
            public void setEventCodeArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode[] eventCodeArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(eventCodeArray, EVENTCODE$16);
                }
            }
            
            /**
             * Sets ith "eventCode" element
             */
            public void setEventCodeArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode eventCode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode)get_store().find_element_user(EVENTCODE$16, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(eventCode);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "eventCode" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode insertNewEventCode(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode)get_store().insert_element_user(EVENTCODE$16, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "eventCode" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode addNewEventCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode)get_store().add_element_user(EVENTCODE$16);
                    return target;
                }
            }
            
            /**
             * Removes the ith "eventCode" element
             */
            public void removeEventCode(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EVENTCODE$16, i);
                }
            }
            
            /**
             * Gets the "effective" element
             */
            public java.util.Calendar getEffective()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVE$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "effective" element
             */
            public org.apache.xmlbeans.XmlDateTime xgetEffective()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EFFECTIVE$18, 0);
                    return target;
                }
            }
            
            /**
             * True if has "effective" element
             */
            public boolean isSetEffective()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EFFECTIVE$18) != 0;
                }
            }
            
            /**
             * Sets the "effective" element
             */
            public void setEffective(java.util.Calendar effective)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EFFECTIVE$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EFFECTIVE$18);
                    }
                    target.setCalendarValue(effective);
                }
            }
            
            /**
             * Sets (as xml) the "effective" element
             */
            public void xsetEffective(org.apache.xmlbeans.XmlDateTime effective)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EFFECTIVE$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EFFECTIVE$18);
                    }
                    target.set(effective);
                }
            }
            
            /**
             * Unsets the "effective" element
             */
            public void unsetEffective()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EFFECTIVE$18, 0);
                }
            }
            
            /**
             * Gets the "onset" element
             */
            public java.util.Calendar getOnset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONSET$20, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "onset" element
             */
            public org.apache.xmlbeans.XmlDateTime xgetOnset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ONSET$20, 0);
                    return target;
                }
            }
            
            /**
             * True if has "onset" element
             */
            public boolean isSetOnset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ONSET$20) != 0;
                }
            }
            
            /**
             * Sets the "onset" element
             */
            public void setOnset(java.util.Calendar onset)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONSET$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ONSET$20);
                    }
                    target.setCalendarValue(onset);
                }
            }
            
            /**
             * Sets (as xml) the "onset" element
             */
            public void xsetOnset(org.apache.xmlbeans.XmlDateTime onset)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ONSET$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ONSET$20);
                    }
                    target.set(onset);
                }
            }
            
            /**
             * Unsets the "onset" element
             */
            public void unsetOnset()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ONSET$20, 0);
                }
            }
            
            /**
             * Gets the "expires" element
             */
            public java.util.Calendar getExpires()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRES$22, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "expires" element
             */
            public org.apache.xmlbeans.XmlDateTime xgetExpires()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRES$22, 0);
                    return target;
                }
            }
            
            /**
             * True if has "expires" element
             */
            public boolean isSetExpires()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EXPIRES$22) != 0;
                }
            }
            
            /**
             * Sets the "expires" element
             */
            public void setExpires(java.util.Calendar expires)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPIRES$22, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPIRES$22);
                    }
                    target.setCalendarValue(expires);
                }
            }
            
            /**
             * Sets (as xml) the "expires" element
             */
            public void xsetExpires(org.apache.xmlbeans.XmlDateTime expires)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPIRES$22, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXPIRES$22);
                    }
                    target.set(expires);
                }
            }
            
            /**
             * Unsets the "expires" element
             */
            public void unsetExpires()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EXPIRES$22, 0);
                }
            }
            
            /**
             * Gets the "senderName" element
             */
            public java.lang.String getSenderName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERNAME$24, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "senderName" element
             */
            public org.apache.xmlbeans.XmlString xgetSenderName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERNAME$24, 0);
                    return target;
                }
            }
            
            /**
             * True if has "senderName" element
             */
            public boolean isSetSenderName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SENDERNAME$24) != 0;
                }
            }
            
            /**
             * Sets the "senderName" element
             */
            public void setSenderName(java.lang.String senderName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERNAME$24, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDERNAME$24);
                    }
                    target.setStringValue(senderName);
                }
            }
            
            /**
             * Sets (as xml) the "senderName" element
             */
            public void xsetSenderName(org.apache.xmlbeans.XmlString senderName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERNAME$24, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDERNAME$24);
                    }
                    target.set(senderName);
                }
            }
            
            /**
             * Unsets the "senderName" element
             */
            public void unsetSenderName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SENDERNAME$24, 0);
                }
            }
            
            /**
             * Gets the "headline" element
             */
            public java.lang.String getHeadline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADLINE$26, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "headline" element
             */
            public org.apache.xmlbeans.XmlString xgetHeadline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADLINE$26, 0);
                    return target;
                }
            }
            
            /**
             * True if has "headline" element
             */
            public boolean isSetHeadline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(HEADLINE$26) != 0;
                }
            }
            
            /**
             * Sets the "headline" element
             */
            public void setHeadline(java.lang.String headline)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADLINE$26, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADLINE$26);
                    }
                    target.setStringValue(headline);
                }
            }
            
            /**
             * Sets (as xml) the "headline" element
             */
            public void xsetHeadline(org.apache.xmlbeans.XmlString headline)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HEADLINE$26, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HEADLINE$26);
                    }
                    target.set(headline);
                }
            }
            
            /**
             * Unsets the "headline" element
             */
            public void unsetHeadline()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(HEADLINE$26, 0);
                }
            }
            
            /**
             * Gets the "description" element
             */
            public java.lang.String getDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$28, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "description" element
             */
            public org.apache.xmlbeans.XmlString xgetDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$28, 0);
                    return target;
                }
            }
            
            /**
             * True if has "description" element
             */
            public boolean isSetDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DESCRIPTION$28) != 0;
                }
            }
            
            /**
             * Sets the "description" element
             */
            public void setDescription(java.lang.String description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$28, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$28);
                    }
                    target.setStringValue(description);
                }
            }
            
            /**
             * Sets (as xml) the "description" element
             */
            public void xsetDescription(org.apache.xmlbeans.XmlString description)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$28, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$28);
                    }
                    target.set(description);
                }
            }
            
            /**
             * Unsets the "description" element
             */
            public void unsetDescription()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DESCRIPTION$28, 0);
                }
            }
            
            /**
             * Gets the "instruction" element
             */
            public java.lang.String getInstruction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTRUCTION$30, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "instruction" element
             */
            public org.apache.xmlbeans.XmlString xgetInstruction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTRUCTION$30, 0);
                    return target;
                }
            }
            
            /**
             * True if has "instruction" element
             */
            public boolean isSetInstruction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(INSTRUCTION$30) != 0;
                }
            }
            
            /**
             * Sets the "instruction" element
             */
            public void setInstruction(java.lang.String instruction)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTRUCTION$30, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTRUCTION$30);
                    }
                    target.setStringValue(instruction);
                }
            }
            
            /**
             * Sets (as xml) the "instruction" element
             */
            public void xsetInstruction(org.apache.xmlbeans.XmlString instruction)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTRUCTION$30, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTRUCTION$30);
                    }
                    target.set(instruction);
                }
            }
            
            /**
             * Unsets the "instruction" element
             */
            public void unsetInstruction()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(INSTRUCTION$30, 0);
                }
            }
            
            /**
             * Gets the "web" element
             */
            public java.lang.String getWeb()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEB$32, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "web" element
             */
            public org.apache.xmlbeans.XmlAnyURI xgetWeb()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WEB$32, 0);
                    return target;
                }
            }
            
            /**
             * True if has "web" element
             */
            public boolean isSetWeb()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WEB$32) != 0;
                }
            }
            
            /**
             * Sets the "web" element
             */
            public void setWeb(java.lang.String web)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEB$32, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEB$32);
                    }
                    target.setStringValue(web);
                }
            }
            
            /**
             * Sets (as xml) the "web" element
             */
            public void xsetWeb(org.apache.xmlbeans.XmlAnyURI web)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WEB$32, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WEB$32);
                    }
                    target.set(web);
                }
            }
            
            /**
             * Unsets the "web" element
             */
            public void unsetWeb()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WEB$32, 0);
                }
            }
            
            /**
             * Gets the "contact" element
             */
            public java.lang.String getContact()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$34, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "contact" element
             */
            public org.apache.xmlbeans.XmlString xgetContact()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT$34, 0);
                    return target;
                }
            }
            
            /**
             * True if has "contact" element
             */
            public boolean isSetContact()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CONTACT$34) != 0;
                }
            }
            
            /**
             * Sets the "contact" element
             */
            public void setContact(java.lang.String contact)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$34, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT$34);
                    }
                    target.setStringValue(contact);
                }
            }
            
            /**
             * Sets (as xml) the "contact" element
             */
            public void xsetContact(org.apache.xmlbeans.XmlString contact)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT$34, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT$34);
                    }
                    target.set(contact);
                }
            }
            
            /**
             * Unsets the "contact" element
             */
            public void unsetContact()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CONTACT$34, 0);
                }
            }
            
            /**
             * Gets array of all "parameter" elements
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter[] getParameterArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(PARAMETER$36, targetList);
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "parameter" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter getParameterArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter)get_store().find_element_user(PARAMETER$36, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "parameter" element
             */
            public int sizeOfParameterArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PARAMETER$36);
                }
            }
            
            /**
             * Sets array of all "parameter" element
             */
            public void setParameterArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter[] parameterArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(parameterArray, PARAMETER$36);
                }
            }
            
            /**
             * Sets ith "parameter" element
             */
            public void setParameterArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter parameter)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter)get_store().find_element_user(PARAMETER$36, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(parameter);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "parameter" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter insertNewParameter(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter)get_store().insert_element_user(PARAMETER$36, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "parameter" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter addNewParameter()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter)get_store().add_element_user(PARAMETER$36);
                    return target;
                }
            }
            
            /**
             * Removes the ith "parameter" element
             */
            public void removeParameter(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PARAMETER$36, i);
                }
            }
            
            /**
             * Gets array of all "resource" elements
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource[] getResourceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RESOURCE$38, targetList);
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "resource" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource getResourceArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource)get_store().find_element_user(RESOURCE$38, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "resource" element
             */
            public int sizeOfResourceArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESOURCE$38);
                }
            }
            
            /**
             * Sets array of all "resource" element
             */
            public void setResourceArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource[] resourceArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(resourceArray, RESOURCE$38);
                }
            }
            
            /**
             * Sets ith "resource" element
             */
            public void setResourceArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource resource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource)get_store().find_element_user(RESOURCE$38, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(resource);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "resource" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource insertNewResource(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource)get_store().insert_element_user(RESOURCE$38, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "resource" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource addNewResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource)get_store().add_element_user(RESOURCE$38);
                    return target;
                }
            }
            
            /**
             * Removes the ith "resource" element
             */
            public void removeResource(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESOURCE$38, i);
                }
            }
            
            /**
             * Gets array of all "area" elements
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area[] getAreaArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(AREA$40, targetList);
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "area" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area getAreaArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area)get_store().find_element_user(AREA$40, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "area" element
             */
            public int sizeOfAreaArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AREA$40);
                }
            }
            
            /**
             * Sets array of all "area" element
             */
            public void setAreaArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area[] areaArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(areaArray, AREA$40);
                }
            }
            
            /**
             * Sets ith "area" element
             */
            public void setAreaArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area area)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area)get_store().find_element_user(AREA$40, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(area);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "area" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area insertNewArea(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area)get_store().insert_element_user(AREA$40, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "area" element
             */
            public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area addNewArea()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area target = null;
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area)get_store().add_element_user(AREA$40);
                    return target;
                }
            }
            
            /**
             * Removes the ith "area" element
             */
            public void removeArea(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AREA$40, i);
                }
            }
            /**
             * An XML category(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Category.
             */
            public static class CategoryImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Category
            {
                private static final long serialVersionUID = 1L;
                
                public CategoryImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected CategoryImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML responseType(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$ResponseType.
             */
            public static class ResponseTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.ResponseType
            {
                private static final long serialVersionUID = 1L;
                
                public ResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ResponseTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML urgency(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Urgency.
             */
            public static class UrgencyImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Urgency
            {
                private static final long serialVersionUID = 1L;
                
                public UrgencyImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected UrgencyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML severity(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Severity.
             */
            public static class SeverityImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Severity
            {
                private static final long serialVersionUID = 1L;
                
                public SeverityImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected SeverityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML certainty(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is an atomic type that is a restriction of x1.oasisNamesTcEmergencyCap1.AlertDocument$Alert$Info$Certainty.
             */
            public static class CertaintyImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Certainty
            {
                private static final long serialVersionUID = 1L;
                
                public CertaintyImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected CertaintyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML eventCode(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is a complex type.
             */
            public static class EventCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode
            {
                private static final long serialVersionUID = 1L;
                
                public EventCodeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName VALUENAME$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "valueName");
                private static final javax.xml.namespace.QName VALUE$2 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "value");
                
                
                /**
                 * Gets the "valueName" element
                 */
                public java.lang.String getValueName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "valueName" element
                 */
                public org.apache.xmlbeans.XmlString xgetValueName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "valueName" element
                 */
                public void setValueName(java.lang.String valueName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUENAME$0);
                      }
                      target.setStringValue(valueName);
                    }
                }
                
                /**
                 * Sets (as xml) the "valueName" element
                 */
                public void xsetValueName(org.apache.xmlbeans.XmlString valueName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUENAME$0);
                      }
                      target.set(valueName);
                    }
                }
                
                /**
                 * Gets the "value" element
                 */
                public java.lang.String getValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "value" element
                 */
                public org.apache.xmlbeans.XmlString xgetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "value" element
                 */
                public void setValue(java.lang.String value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
                      }
                      target.setStringValue(value);
                    }
                }
                
                /**
                 * Sets (as xml) the "value" element
                 */
                public void xsetValue(org.apache.xmlbeans.XmlString value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                      }
                      target.set(value);
                    }
                }
            }
            /**
             * An XML parameter(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is a complex type.
             */
            public static class ParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Parameter
            {
                private static final long serialVersionUID = 1L;
                
                public ParameterImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName VALUENAME$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "valueName");
                private static final javax.xml.namespace.QName VALUE$2 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "value");
                
                
                /**
                 * Gets the "valueName" element
                 */
                public java.lang.String getValueName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "valueName" element
                 */
                public org.apache.xmlbeans.XmlString xgetValueName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "valueName" element
                 */
                public void setValueName(java.lang.String valueName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUENAME$0);
                      }
                      target.setStringValue(valueName);
                    }
                }
                
                /**
                 * Sets (as xml) the "valueName" element
                 */
                public void xsetValueName(org.apache.xmlbeans.XmlString valueName)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUENAME$0);
                      }
                      target.set(valueName);
                    }
                }
                
                /**
                 * Gets the "value" element
                 */
                public java.lang.String getValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "value" element
                 */
                public org.apache.xmlbeans.XmlString xgetValue()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "value" element
                 */
                public void setValue(java.lang.String value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
                      }
                      target.setStringValue(value);
                    }
                }
                
                /**
                 * Sets (as xml) the "value" element
                 */
                public void xsetValue(org.apache.xmlbeans.XmlString value)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                      }
                      target.set(value);
                    }
                }
            }
            /**
             * An XML resource(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is a complex type.
             */
            public static class ResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Resource
            {
                private static final long serialVersionUID = 1L;
                
                public ResourceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RESOURCEDESC$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "resourceDesc");
                private static final javax.xml.namespace.QName MIMETYPE$2 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "mimeType");
                private static final javax.xml.namespace.QName SIZE$4 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "size");
                private static final javax.xml.namespace.QName URI$6 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "uri");
                private static final javax.xml.namespace.QName DEREFURI$8 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "derefUri");
                private static final javax.xml.namespace.QName DIGEST$10 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "digest");
                
                
                /**
                 * Gets the "resourceDesc" element
                 */
                public java.lang.String getResourceDesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEDESC$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "resourceDesc" element
                 */
                public org.apache.xmlbeans.XmlString xgetResourceDesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEDESC$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "resourceDesc" element
                 */
                public void setResourceDesc(java.lang.String resourceDesc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEDESC$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEDESC$0);
                      }
                      target.setStringValue(resourceDesc);
                    }
                }
                
                /**
                 * Sets (as xml) the "resourceDesc" element
                 */
                public void xsetResourceDesc(org.apache.xmlbeans.XmlString resourceDesc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEDESC$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOURCEDESC$0);
                      }
                      target.set(resourceDesc);
                    }
                }
                
                /**
                 * Gets the "mimeType" element
                 */
                public java.lang.String getMimeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "mimeType" element
                 */
                public org.apache.xmlbeans.XmlString xgetMimeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMETYPE$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "mimeType" element
                 */
                public boolean isSetMimeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MIMETYPE$2) != 0;
                    }
                }
                
                /**
                 * Sets the "mimeType" element
                 */
                public void setMimeType(java.lang.String mimeType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMETYPE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMETYPE$2);
                      }
                      target.setStringValue(mimeType);
                    }
                }
                
                /**
                 * Sets (as xml) the "mimeType" element
                 */
                public void xsetMimeType(org.apache.xmlbeans.XmlString mimeType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMETYPE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIMETYPE$2);
                      }
                      target.set(mimeType);
                    }
                }
                
                /**
                 * Unsets the "mimeType" element
                 */
                public void unsetMimeType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MIMETYPE$2, 0);
                    }
                }
                
                /**
                 * Gets the "size" element
                 */
                public java.math.BigInteger getSize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "size" element
                 */
                public org.apache.xmlbeans.XmlInteger xgetSize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZE$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "size" element
                 */
                public boolean isSetSize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SIZE$4) != 0;
                    }
                }
                
                /**
                 * Sets the "size" element
                 */
                public void setSize(java.math.BigInteger size)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIZE$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIZE$4);
                      }
                      target.setBigIntegerValue(size);
                    }
                }
                
                /**
                 * Sets (as xml) the "size" element
                 */
                public void xsetSize(org.apache.xmlbeans.XmlInteger size)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlInteger target = null;
                      target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(SIZE$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(SIZE$4);
                      }
                      target.set(size);
                    }
                }
                
                /**
                 * Unsets the "size" element
                 */
                public void unsetSize()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SIZE$4, 0);
                    }
                }
                
                /**
                 * Gets the "uri" element
                 */
                public java.lang.String getUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URI$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "uri" element
                 */
                public org.apache.xmlbeans.XmlAnyURI xgetUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlAnyURI target = null;
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URI$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "uri" element
                 */
                public boolean isSetUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(URI$6) != 0;
                    }
                }
                
                /**
                 * Sets the "uri" element
                 */
                public void setUri(java.lang.String uri)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URI$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URI$6);
                      }
                      target.setStringValue(uri);
                    }
                }
                
                /**
                 * Sets (as xml) the "uri" element
                 */
                public void xsetUri(org.apache.xmlbeans.XmlAnyURI uri)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlAnyURI target = null;
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URI$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(URI$6);
                      }
                      target.set(uri);
                    }
                }
                
                /**
                 * Unsets the "uri" element
                 */
                public void unsetUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(URI$6, 0);
                    }
                }
                
                /**
                 * Gets the "derefUri" element
                 */
                public java.lang.String getDerefUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEREFURI$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "derefUri" element
                 */
                public org.apache.xmlbeans.XmlString xgetDerefUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEREFURI$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "derefUri" element
                 */
                public boolean isSetDerefUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DEREFURI$8) != 0;
                    }
                }
                
                /**
                 * Sets the "derefUri" element
                 */
                public void setDerefUri(java.lang.String derefUri)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEREFURI$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEREFURI$8);
                      }
                      target.setStringValue(derefUri);
                    }
                }
                
                /**
                 * Sets (as xml) the "derefUri" element
                 */
                public void xsetDerefUri(org.apache.xmlbeans.XmlString derefUri)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEREFURI$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEREFURI$8);
                      }
                      target.set(derefUri);
                    }
                }
                
                /**
                 * Unsets the "derefUri" element
                 */
                public void unsetDerefUri()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DEREFURI$8, 0);
                    }
                }
                
                /**
                 * Gets the "digest" element
                 */
                public java.lang.String getDigest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGEST$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "digest" element
                 */
                public org.apache.xmlbeans.XmlString xgetDigest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIGEST$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "digest" element
                 */
                public boolean isSetDigest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DIGEST$10) != 0;
                    }
                }
                
                /**
                 * Sets the "digest" element
                 */
                public void setDigest(java.lang.String digest)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGEST$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIGEST$10);
                      }
                      target.setStringValue(digest);
                    }
                }
                
                /**
                 * Sets (as xml) the "digest" element
                 */
                public void xsetDigest(org.apache.xmlbeans.XmlString digest)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIGEST$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIGEST$10);
                      }
                      target.set(digest);
                    }
                }
                
                /**
                 * Unsets the "digest" element
                 */
                public void unsetDigest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DIGEST$10, 0);
                    }
                }
            }
            /**
             * An XML area(@urn:oasis:names:tc:emergency:cap:1.1).
             *
             * This is a complex type.
             */
            public static class AreaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area
            {
                private static final long serialVersionUID = 1L;
                
                public AreaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName AREADESC$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "areaDesc");
                private static final javax.xml.namespace.QName POLYGON$2 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "polygon");
                private static final javax.xml.namespace.QName CIRCLE$4 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "circle");
                private static final javax.xml.namespace.QName GEOCODE$6 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "geocode");
                private static final javax.xml.namespace.QName ALTITUDE$8 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "altitude");
                private static final javax.xml.namespace.QName CEILING$10 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "ceiling");
                
                
                /**
                 * Gets the "areaDesc" element
                 */
                public java.lang.String getAreaDesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREADESC$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "areaDesc" element
                 */
                public org.apache.xmlbeans.XmlString xgetAreaDesc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREADESC$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "areaDesc" element
                 */
                public void setAreaDesc(java.lang.String areaDesc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREADESC$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREADESC$0);
                      }
                      target.setStringValue(areaDesc);
                    }
                }
                
                /**
                 * Sets (as xml) the "areaDesc" element
                 */
                public void xsetAreaDesc(org.apache.xmlbeans.XmlString areaDesc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREADESC$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREADESC$0);
                      }
                      target.set(areaDesc);
                    }
                }
                
                /**
                 * Gets array of all "polygon" elements
                 */
                public java.lang.String[] getPolygonArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(POLYGON$2, targetList);
                      java.lang.String[] result = new java.lang.String[targetList.size()];
                      for (int i = 0, len = targetList.size() ; i < len ; i++)
                          result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                      return result;
                    }
                }
                
                /**
                 * Gets ith "polygon" element
                 */
                public java.lang.String getPolygonArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYGON$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) array of all "polygon" elements
                 */
                public org.apache.xmlbeans.XmlString[] xgetPolygonArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(POLYGON$2, targetList);
                      org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets (as xml) ith "polygon" element
                 */
                public org.apache.xmlbeans.XmlString xgetPolygonArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLYGON$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return (org.apache.xmlbeans.XmlString)target;
                    }
                }
                
                /**
                 * Returns number of "polygon" element
                 */
                public int sizeOfPolygonArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(POLYGON$2);
                    }
                }
                
                /**
                 * Sets array of all "polygon" element
                 */
                public void setPolygonArray(java.lang.String[] polygonArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(polygonArray, POLYGON$2);
                    }
                }
                
                /**
                 * Sets ith "polygon" element
                 */
                public void setPolygonArray(int i, java.lang.String polygon)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYGON$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setStringValue(polygon);
                    }
                }
                
                /**
                 * Sets (as xml) array of all "polygon" element
                 */
                public void xsetPolygonArray(org.apache.xmlbeans.XmlString[]polygonArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(polygonArray, POLYGON$2);
                    }
                }
                
                /**
                 * Sets (as xml) ith "polygon" element
                 */
                public void xsetPolygonArray(int i, org.apache.xmlbeans.XmlString polygon)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLYGON$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(polygon);
                    }
                }
                
                /**
                 * Inserts the value as the ith "polygon" element
                 */
                public void insertPolygon(int i, java.lang.String polygon)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = 
                        (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(POLYGON$2, i);
                      target.setStringValue(polygon);
                    }
                }
                
                /**
                 * Appends the value as the last "polygon" element
                 */
                public void addPolygon(java.lang.String polygon)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLYGON$2);
                      target.setStringValue(polygon);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "polygon" element
                 */
                public org.apache.xmlbeans.XmlString insertNewPolygon(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(POLYGON$2, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "polygon" element
                 */
                public org.apache.xmlbeans.XmlString addNewPolygon()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POLYGON$2);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "polygon" element
                 */
                public void removePolygon(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(POLYGON$2, i);
                    }
                }
                
                /**
                 * Gets array of all "circle" elements
                 */
                public java.lang.String[] getCircleArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(CIRCLE$4, targetList);
                      java.lang.String[] result = new java.lang.String[targetList.size()];
                      for (int i = 0, len = targetList.size() ; i < len ; i++)
                          result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                      return result;
                    }
                }
                
                /**
                 * Gets ith "circle" element
                 */
                public java.lang.String getCircleArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIRCLE$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) array of all "circle" elements
                 */
                public org.apache.xmlbeans.XmlString[] xgetCircleArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(CIRCLE$4, targetList);
                      org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets (as xml) ith "circle" element
                 */
                public org.apache.xmlbeans.XmlString xgetCircleArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIRCLE$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return (org.apache.xmlbeans.XmlString)target;
                    }
                }
                
                /**
                 * Returns number of "circle" element
                 */
                public int sizeOfCircleArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CIRCLE$4);
                    }
                }
                
                /**
                 * Sets array of all "circle" element
                 */
                public void setCircleArray(java.lang.String[] circleArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(circleArray, CIRCLE$4);
                    }
                }
                
                /**
                 * Sets ith "circle" element
                 */
                public void setCircleArray(int i, java.lang.String circle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIRCLE$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setStringValue(circle);
                    }
                }
                
                /**
                 * Sets (as xml) array of all "circle" element
                 */
                public void xsetCircleArray(org.apache.xmlbeans.XmlString[]circleArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(circleArray, CIRCLE$4);
                    }
                }
                
                /**
                 * Sets (as xml) ith "circle" element
                 */
                public void xsetCircleArray(int i, org.apache.xmlbeans.XmlString circle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIRCLE$4, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(circle);
                    }
                }
                
                /**
                 * Inserts the value as the ith "circle" element
                 */
                public void insertCircle(int i, java.lang.String circle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = 
                        (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CIRCLE$4, i);
                      target.setStringValue(circle);
                    }
                }
                
                /**
                 * Appends the value as the last "circle" element
                 */
                public void addCircle(java.lang.String circle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIRCLE$4);
                      target.setStringValue(circle);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "circle" element
                 */
                public org.apache.xmlbeans.XmlString insertNewCircle(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CIRCLE$4, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "circle" element
                 */
                public org.apache.xmlbeans.XmlString addNewCircle()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CIRCLE$4);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "circle" element
                 */
                public void removeCircle(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CIRCLE$4, i);
                    }
                }
                
                /**
                 * Gets array of all "geocode" elements
                 */
                public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode[] getGeocodeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(GEOCODE$6, targetList);
                      x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "geocode" element
                 */
                public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode getGeocodeArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode target = null;
                      target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode)get_store().find_element_user(GEOCODE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "geocode" element
                 */
                public int sizeOfGeocodeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(GEOCODE$6);
                    }
                }
                
                /**
                 * Sets array of all "geocode" element
                 */
                public void setGeocodeArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode[] geocodeArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(geocodeArray, GEOCODE$6);
                    }
                }
                
                /**
                 * Sets ith "geocode" element
                 */
                public void setGeocodeArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode geocode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode target = null;
                      target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode)get_store().find_element_user(GEOCODE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(geocode);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "geocode" element
                 */
                public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode insertNewGeocode(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode target = null;
                      target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode)get_store().insert_element_user(GEOCODE$6, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "geocode" element
                 */
                public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode addNewGeocode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode target = null;
                      target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode)get_store().add_element_user(GEOCODE$6);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "geocode" element
                 */
                public void removeGeocode(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(GEOCODE$6, i);
                    }
                }
                
                /**
                 * Gets the "altitude" element
                 */
                public java.lang.String getAltitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDE$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "altitude" element
                 */
                public org.apache.xmlbeans.XmlString xgetAltitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTITUDE$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "altitude" element
                 */
                public boolean isSetAltitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(ALTITUDE$8) != 0;
                    }
                }
                
                /**
                 * Sets the "altitude" element
                 */
                public void setAltitude(java.lang.String altitude)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTITUDE$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTITUDE$8);
                      }
                      target.setStringValue(altitude);
                    }
                }
                
                /**
                 * Sets (as xml) the "altitude" element
                 */
                public void xsetAltitude(org.apache.xmlbeans.XmlString altitude)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTITUDE$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTITUDE$8);
                      }
                      target.set(altitude);
                    }
                }
                
                /**
                 * Unsets the "altitude" element
                 */
                public void unsetAltitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(ALTITUDE$8, 0);
                    }
                }
                
                /**
                 * Gets the "ceiling" element
                 */
                public java.lang.String getCeiling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEILING$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ceiling" element
                 */
                public org.apache.xmlbeans.XmlString xgetCeiling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEILING$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "ceiling" element
                 */
                public boolean isSetCeiling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CEILING$10) != 0;
                    }
                }
                
                /**
                 * Sets the "ceiling" element
                 */
                public void setCeiling(java.lang.String ceiling)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CEILING$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CEILING$10);
                      }
                      target.setStringValue(ceiling);
                    }
                }
                
                /**
                 * Sets (as xml) the "ceiling" element
                 */
                public void xsetCeiling(org.apache.xmlbeans.XmlString ceiling)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CEILING$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CEILING$10);
                      }
                      target.set(ceiling);
                    }
                }
                
                /**
                 * Unsets the "ceiling" element
                 */
                public void unsetCeiling()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CEILING$10, 0);
                    }
                }
                /**
                 * An XML geocode(@urn:oasis:names:tc:emergency:cap:1.1).
                 *
                 * This is a complex type.
                 */
                public static class GeocodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.Area.Geocode
                {
                    private static final long serialVersionUID = 1L;
                    
                    public GeocodeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName VALUENAME$0 = 
                      new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "valueName");
                    private static final javax.xml.namespace.QName VALUE$2 = 
                      new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "value");
                    
                    
                    /**
                     * Gets the "valueName" element
                     */
                    public java.lang.String getValueName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "valueName" element
                     */
                    public org.apache.xmlbeans.XmlString xgetValueName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "valueName" element
                     */
                    public void setValueName(java.lang.String valueName)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUENAME$0);
                        }
                        target.setStringValue(valueName);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "valueName" element
                     */
                    public void xsetValueName(org.apache.xmlbeans.XmlString valueName)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUENAME$0);
                        }
                        target.set(valueName);
                      }
                    }
                    
                    /**
                     * Gets the "value" element
                     */
                    public java.lang.String getValue()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "value" element
                     */
                    public org.apache.xmlbeans.XmlString xgetValue()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "value" element
                     */
                    public void setValue(java.lang.String value)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$2);
                        }
                        target.setStringValue(value);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "value" element
                     */
                    public void xsetValue(org.apache.xmlbeans.XmlString value)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$2);
                        }
                        target.set(value);
                      }
                    }
                }
            }
        }
    }
}
