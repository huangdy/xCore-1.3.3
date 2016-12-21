/*
 * XML Type:  ConditionType
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.ConditionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * An XML ConditionType(@http://uicds.org/AgreementService).
 *
 * This is a complex type.
 */
public class ConditionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.ConditionType
{
    private static final long serialVersionUID = 1L;
    
    public ConditionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERESTGROUP$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "InterestGroup");
    private static final javax.xml.namespace.QName REMOTECOREPROXIMITY$2 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "RemoteCoreProximity");
    private static final javax.xml.namespace.QName EXTENDEDMETADATA$4 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "ExtendedMetadata");
    
    
    /**
     * Gets the "InterestGroup" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType getInterestGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(INTERESTGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InterestGroup" element
     */
    public void setInterestGroup(com.saic.precis.x2009.x06.base.CodespaceValueType interestGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(INTERESTGROUP$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(INTERESTGROUP$0);
            }
            target.set(interestGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "InterestGroup" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType addNewInterestGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(INTERESTGROUP$0);
            return target;
        }
    }
    
    /**
     * Gets the "RemoteCoreProximity" element
     */
    public org.uicds.agreementService.ConditionType.RemoteCoreProximity getRemoteCoreProximity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.ConditionType.RemoteCoreProximity target = null;
            target = (org.uicds.agreementService.ConditionType.RemoteCoreProximity)get_store().find_element_user(REMOTECOREPROXIMITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RemoteCoreProximity" element
     */
    public boolean isSetRemoteCoreProximity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMOTECOREPROXIMITY$2) != 0;
        }
    }
    
    /**
     * Sets the "RemoteCoreProximity" element
     */
    public void setRemoteCoreProximity(org.uicds.agreementService.ConditionType.RemoteCoreProximity remoteCoreProximity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.ConditionType.RemoteCoreProximity target = null;
            target = (org.uicds.agreementService.ConditionType.RemoteCoreProximity)get_store().find_element_user(REMOTECOREPROXIMITY$2, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.ConditionType.RemoteCoreProximity)get_store().add_element_user(REMOTECOREPROXIMITY$2);
            }
            target.set(remoteCoreProximity);
        }
    }
    
    /**
     * Appends and returns a new empty "RemoteCoreProximity" element
     */
    public org.uicds.agreementService.ConditionType.RemoteCoreProximity addNewRemoteCoreProximity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.ConditionType.RemoteCoreProximity target = null;
            target = (org.uicds.agreementService.ConditionType.RemoteCoreProximity)get_store().add_element_user(REMOTECOREPROXIMITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "RemoteCoreProximity" element
     */
    public void unsetRemoteCoreProximity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMOTECOREPROXIMITY$2, 0);
        }
    }
    
    /**
     * Gets array of all "ExtendedMetadata" elements
     */
    public com.saic.precis.x2009.x06.base.ExtendedMetadataType[] getExtendedMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTENDEDMETADATA$4, targetList);
            com.saic.precis.x2009.x06.base.ExtendedMetadataType[] result = new com.saic.precis.x2009.x06.base.ExtendedMetadataType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExtendedMetadata" element
     */
    public com.saic.precis.x2009.x06.base.ExtendedMetadataType getExtendedMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ExtendedMetadataType target = null;
            target = (com.saic.precis.x2009.x06.base.ExtendedMetadataType)get_store().find_element_user(EXTENDEDMETADATA$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ExtendedMetadata" element
     */
    public int sizeOfExtendedMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENDEDMETADATA$4);
        }
    }
    
    /**
     * Sets array of all "ExtendedMetadata" element
     */
    public void setExtendedMetadataArray(com.saic.precis.x2009.x06.base.ExtendedMetadataType[] extendedMetadataArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extendedMetadataArray, EXTENDEDMETADATA$4);
        }
    }
    
    /**
     * Sets ith "ExtendedMetadata" element
     */
    public void setExtendedMetadataArray(int i, com.saic.precis.x2009.x06.base.ExtendedMetadataType extendedMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ExtendedMetadataType target = null;
            target = (com.saic.precis.x2009.x06.base.ExtendedMetadataType)get_store().find_element_user(EXTENDEDMETADATA$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extendedMetadata);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExtendedMetadata" element
     */
    public com.saic.precis.x2009.x06.base.ExtendedMetadataType insertNewExtendedMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ExtendedMetadataType target = null;
            target = (com.saic.precis.x2009.x06.base.ExtendedMetadataType)get_store().insert_element_user(EXTENDEDMETADATA$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExtendedMetadata" element
     */
    public com.saic.precis.x2009.x06.base.ExtendedMetadataType addNewExtendedMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ExtendedMetadataType target = null;
            target = (com.saic.precis.x2009.x06.base.ExtendedMetadataType)get_store().add_element_user(EXTENDEDMETADATA$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ExtendedMetadata" element
     */
    public void removeExtendedMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENDEDMETADATA$4, i);
        }
    }
    /**
     * An XML RemoteCoreProximity(@http://uicds.org/AgreementService).
     *
     * This is an atomic type that is a restriction of org.uicds.agreementService.ConditionType$RemoteCoreProximity.
     */
    public static class RemoteCoreProximityImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements org.uicds.agreementService.ConditionType.RemoteCoreProximity
    {
        private static final long serialVersionUID = 1L;
        
        public RemoteCoreProximityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RemoteCoreProximityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName SHAREONNOLOC$0 = 
            new javax.xml.namespace.QName("", "shareOnNoLoc");
        
        
        /**
         * Gets the "shareOnNoLoc" attribute
         */
        public boolean getShareOnNoLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREONNOLOC$0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "shareOnNoLoc" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetShareOnNoLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHAREONNOLOC$0);
                return target;
            }
        }
        
        /**
         * Sets the "shareOnNoLoc" attribute
         */
        public void setShareOnNoLoc(boolean shareOnNoLoc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SHAREONNOLOC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SHAREONNOLOC$0);
                }
                target.setBooleanValue(shareOnNoLoc);
            }
        }
        
        /**
         * Sets (as xml) the "shareOnNoLoc" attribute
         */
        public void xsetShareOnNoLoc(org.apache.xmlbeans.XmlBoolean shareOnNoLoc)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SHAREONNOLOC$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SHAREONNOLOC$0);
                }
                target.set(shareOnNoLoc);
            }
        }
    }
}
