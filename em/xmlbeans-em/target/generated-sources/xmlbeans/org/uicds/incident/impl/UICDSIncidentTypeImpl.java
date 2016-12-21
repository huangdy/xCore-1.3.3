/*
 * XML Type:  UICDSIncidentType
 * Namespace: http://uicds.org/incident
 * Java type: org.uicds.incident.UICDSIncidentType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incident.impl;
/**
 * An XML UICDSIncidentType(@http://uicds.org/incident).
 *
 * This is a complex type.
 */
public class UICDSIncidentTypeImpl extends gov.niem.niem.niemCore.x20.impl.IncidentTypeImpl implements org.uicds.incident.UICDSIncidentType
{
    private static final long serialVersionUID = 1L;
    
    public UICDSIncidentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAREDCORENAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/incident", "SharedCoreName");
    private static final javax.xml.namespace.QName OWNINGCORE$2 = 
        new javax.xml.namespace.QName("http://uicds.org/incident", "OwningCore");
    private static final javax.xml.namespace.QName EXTENDEDMETADATA$4 = 
        new javax.xml.namespace.QName("http://uicds.org/incident", "ExtendedMetadata");
    
    
    /**
     * Gets array of all "SharedCoreName" elements
     */
    public java.lang.String[] getSharedCoreNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SHAREDCORENAME$0, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCORENAME$0, i);
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
            get_store().find_all_element_users(SHAREDCORENAME$0, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCORENAME$0, i);
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
            return get_store().count_elements(SHAREDCORENAME$0);
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
            arraySetterHelper(sharedCoreNameArray, SHAREDCORENAME$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCORENAME$0, i);
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
            arraySetterHelper(sharedCoreNameArray, SHAREDCORENAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCORENAME$0, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SHAREDCORENAME$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDCORENAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SHAREDCORENAME$0, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDCORENAME$0);
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
            get_store().remove_element(SHAREDCORENAME$0, i);
        }
    }
    
    /**
     * Gets the "OwningCore" element
     */
    public java.lang.String getOwningCore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNINGCORE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OwningCore" element
     */
    public org.apache.xmlbeans.XmlString xgetOwningCore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNINGCORE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OwningCore" element
     */
    public boolean isSetOwningCore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGCORE$2) != 0;
        }
    }
    
    /**
     * Sets the "OwningCore" element
     */
    public void setOwningCore(java.lang.String owningCore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNINGCORE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNINGCORE$2);
            }
            target.setStringValue(owningCore);
        }
    }
    
    /**
     * Sets (as xml) the "OwningCore" element
     */
    public void xsetOwningCore(org.apache.xmlbeans.XmlString owningCore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OWNINGCORE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OWNINGCORE$2);
            }
            target.set(owningCore);
        }
    }
    
    /**
     * Unsets the "OwningCore" element
     */
    public void unsetOwningCore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGCORE$2, 0);
        }
    }
    
    /**
     * Gets array of all "ExtendedMetadata" elements
     */
    public org.uicds.incident.ExtendedMetadataType[] getExtendedMetadataArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTENDEDMETADATA$4, targetList);
            org.uicds.incident.ExtendedMetadataType[] result = new org.uicds.incident.ExtendedMetadataType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExtendedMetadata" element
     */
    public org.uicds.incident.ExtendedMetadataType getExtendedMetadataArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incident.ExtendedMetadataType target = null;
            target = (org.uicds.incident.ExtendedMetadataType)get_store().find_element_user(EXTENDEDMETADATA$4, i);
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
    public void setExtendedMetadataArray(org.uicds.incident.ExtendedMetadataType[] extendedMetadataArray)
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
    public void setExtendedMetadataArray(int i, org.uicds.incident.ExtendedMetadataType extendedMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incident.ExtendedMetadataType target = null;
            target = (org.uicds.incident.ExtendedMetadataType)get_store().find_element_user(EXTENDEDMETADATA$4, i);
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
    public org.uicds.incident.ExtendedMetadataType insertNewExtendedMetadata(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incident.ExtendedMetadataType target = null;
            target = (org.uicds.incident.ExtendedMetadataType)get_store().insert_element_user(EXTENDEDMETADATA$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExtendedMetadata" element
     */
    public org.uicds.incident.ExtendedMetadataType addNewExtendedMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incident.ExtendedMetadataType target = null;
            target = (org.uicds.incident.ExtendedMetadataType)get_store().add_element_user(EXTENDEDMETADATA$4);
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
}
