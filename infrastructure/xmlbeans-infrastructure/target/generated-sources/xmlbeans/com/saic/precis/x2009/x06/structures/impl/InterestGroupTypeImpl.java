/*
 * XML Type:  InterestGroupType
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.precis.x2009.x06.structures.InterestGroupType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.structures.impl;
/**
 * An XML InterestGroupType(@http://www.saic.com/precis/2009/06/structures).
 *
 * This is a complex type.
 */
public class InterestGroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.structures.InterestGroupType
{
    private static final long serialVersionUID = 1L;
    
    public InterestGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERESTGROUPTYPE$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "InterestGroupType");
    private static final javax.xml.namespace.QName INTERESTGROUPSUBTYPE$2 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "InterestGroupSubType");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "Description");
    private static final javax.xml.namespace.QName BOUNDINGBOX$8 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "BoundingBox");
    private static final javax.xml.namespace.QName SPECIALIZEDWORKPRODUCT$10 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "SpecializedWorkProduct");
    private static final javax.xml.namespace.QName SPECIALIZEDUICDSSERVICE$12 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "SpecializedUICDSService");
    private static final javax.xml.namespace.QName SHAREDCORENAME$14 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "SharedCoreName");
    
    
    /**
     * Gets the "InterestGroupType" element
     */
    public java.lang.String getInterestGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InterestGroupType" element
     */
    public org.apache.xmlbeans.XmlString xgetInterestGroupType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTGROUPTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InterestGroupType" element
     */
    public void setInterestGroupType(java.lang.String interestGroupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESTGROUPTYPE$0);
            }
            target.setStringValue(interestGroupType);
        }
    }
    
    /**
     * Sets (as xml) the "InterestGroupType" element
     */
    public void xsetInterestGroupType(org.apache.xmlbeans.XmlString interestGroupType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTGROUPTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERESTGROUPTYPE$0);
            }
            target.set(interestGroupType);
        }
    }
    
    /**
     * Gets array of all "InterestGroupSubType" elements
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType[] getInterestGroupSubTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERESTGROUPSUBTYPE$2, targetList);
            com.saic.precis.x2009.x06.base.CodespaceValueType[] result = new com.saic.precis.x2009.x06.base.CodespaceValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InterestGroupSubType" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType getInterestGroupSubTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(INTERESTGROUPSUBTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "InterestGroupSubType" element
     */
    public int sizeOfInterestGroupSubTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERESTGROUPSUBTYPE$2);
        }
    }
    
    /**
     * Sets array of all "InterestGroupSubType" element
     */
    public void setInterestGroupSubTypeArray(com.saic.precis.x2009.x06.base.CodespaceValueType[] interestGroupSubTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(interestGroupSubTypeArray, INTERESTGROUPSUBTYPE$2);
        }
    }
    
    /**
     * Sets ith "InterestGroupSubType" element
     */
    public void setInterestGroupSubTypeArray(int i, com.saic.precis.x2009.x06.base.CodespaceValueType interestGroupSubType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(INTERESTGROUPSUBTYPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interestGroupSubType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InterestGroupSubType" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType insertNewInterestGroupSubType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().insert_element_user(INTERESTGROUPSUBTYPE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InterestGroupSubType" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType addNewInterestGroupSubType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(INTERESTGROUPSUBTYPE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "InterestGroupSubType" element
     */
    public void removeInterestGroupSubType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERESTGROUPSUBTYPE$2, i);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public com.saic.precis.x2009.x06.structures.InterestGroupType.Name xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.InterestGroupType.Name target = null;
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType.Name)get_store().find_element_user(NAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(com.saic.precis.x2009.x06.structures.InterestGroupType.Name name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.InterestGroupType.Name target = null;
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType.Name)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.structures.InterestGroupType.Name)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "BoundingBox" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType getBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().find_element_user(BOUNDINGBOX$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "BoundingBox" element
     */
    public boolean isSetBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDINGBOX$8) != 0;
        }
    }
    
    /**
     * Sets the "BoundingBox" element
     */
    public void setBoundingBox(mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType boundingBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().find_element_user(BOUNDINGBOX$8, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().add_element_user(BOUNDINGBOX$8);
            }
            target.set(boundingBox);
        }
    }
    
    /**
     * Appends and returns a new empty "BoundingBox" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType addNewBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().add_element_user(BOUNDINGBOX$8);
            return target;
        }
    }
    
    /**
     * Unsets the "BoundingBox" element
     */
    public void unsetBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDINGBOX$8, 0);
        }
    }
    
    /**
     * Gets the "SpecializedWorkProduct" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType getSpecializedWorkProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(SPECIALIZEDWORKPRODUCT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SpecializedWorkProduct" element
     */
    public void setSpecializedWorkProduct(com.saic.precis.x2009.x06.base.IdentifierType specializedWorkProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(SPECIALIZEDWORKPRODUCT$10, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(SPECIALIZEDWORKPRODUCT$10);
            }
            target.set(specializedWorkProduct);
        }
    }
    
    /**
     * Appends and returns a new empty "SpecializedWorkProduct" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType addNewSpecializedWorkProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(SPECIALIZEDWORKPRODUCT$10);
            return target;
        }
    }
    
    /**
     * Gets the "SpecializedUICDSService" element
     */
    public java.lang.String getSpecializedUICDSService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALIZEDUICDSSERVICE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SpecializedUICDSService" element
     */
    public org.apache.xmlbeans.XmlString xgetSpecializedUICDSService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIALIZEDUICDSSERVICE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SpecializedUICDSService" element
     */
    public void setSpecializedUICDSService(java.lang.String specializedUICDSService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALIZEDUICDSSERVICE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPECIALIZEDUICDSSERVICE$12);
            }
            target.setStringValue(specializedUICDSService);
        }
    }
    
    /**
     * Sets (as xml) the "SpecializedUICDSService" element
     */
    public void xsetSpecializedUICDSService(org.apache.xmlbeans.XmlString specializedUICDSService)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIALIZEDUICDSSERVICE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPECIALIZEDUICDSSERVICE$12);
            }
            target.set(specializedUICDSService);
        }
    }
    
    /**
     * Gets array of all "SharedCoreName" elements
     */
    public java.lang.String[] getSharedCoreNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHAREDCORENAME$14, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SharedCoreName" element
     */
    public java.lang.String getSharedCoreNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCORENAME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SharedCoreName" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetSharedCoreNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHAREDCORENAME$14, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SharedCoreName" element
     */
    public org.apache.xmlbeans.XmlString xgetSharedCoreNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCORENAME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "SharedCoreName" element
     */
    public int sizeOfSharedCoreNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SHAREDCORENAME$14);
        }
    }
    
    /**
     * Sets array of all "SharedCoreName" element
     */
    public void setSharedCoreNameArray(java.lang.String[] sharedCoreNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sharedCoreNameArray, SHAREDCORENAME$14);
        }
    }
    
    /**
     * Sets ith "SharedCoreName" element
     */
    public void setSharedCoreNameArray(int i, java.lang.String sharedCoreName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCORENAME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(sharedCoreName);
        }
    }
    
    /**
     * Sets (as xml) array of all "SharedCoreName" element
     */
    public void xsetSharedCoreNameArray(org.apache.xmlbeans.XmlString[]sharedCoreNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sharedCoreNameArray, SHAREDCORENAME$14);
        }
    }
    
    /**
     * Sets (as xml) ith "SharedCoreName" element
     */
    public void xsetSharedCoreNameArray(int i, org.apache.xmlbeans.XmlString sharedCoreName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCORENAME$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sharedCoreName);
        }
    }
    
    /**
     * Inserts the value as the ith "SharedCoreName" element
     */
    public void insertSharedCoreName(int i, java.lang.String sharedCoreName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SHAREDCORENAME$14, i);
            target.setStringValue(sharedCoreName);
        }
    }
    
    /**
     * Appends the value as the last "SharedCoreName" element
     */
    public void addSharedCoreName(java.lang.String sharedCoreName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDCORENAME$14);
            target.setStringValue(sharedCoreName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SharedCoreName" element
     */
    public org.apache.xmlbeans.XmlString insertNewSharedCoreName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SHAREDCORENAME$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SharedCoreName" element
     */
    public org.apache.xmlbeans.XmlString addNewSharedCoreName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDCORENAME$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "SharedCoreName" element
     */
    public void removeSharedCoreName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SHAREDCORENAME$14, i);
        }
    }
    /**
     * An XML Name(@http://www.saic.com/precis/2009/06/structures).
     *
     * This is an atomic type that is a restriction of com.saic.precis.x2009.x06.structures.InterestGroupType$Name.
     */
    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.saic.precis.x2009.x06.structures.InterestGroupType.Name
    {
        private static final long serialVersionUID = 1L;
        
        public NameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
