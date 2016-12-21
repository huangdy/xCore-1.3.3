/*
 * XML Type:  StructuredPayloadMetadataType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.StructuredPayloadMetadataType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML StructuredPayloadMetadataType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class StructuredPayloadMetadataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.StructuredPayloadMetadataType
{
    private static final long serialVersionUID = 1L;
    
    public StructuredPayloadMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMUNITYURI$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityURI");
    private static final javax.xml.namespace.QName COMMUNITYDESCRIPTION$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityDescription");
    private static final javax.xml.namespace.QName COMMUNITYVERSION$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityVersion");
    private static final javax.xml.namespace.QName COMMUNITYPEDIGREEURI$6 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "CommunityPedigreeURI");
    
    
    /**
     * Gets the "CommunityURI" element
     */
    public java.lang.String getCommunityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CommunityURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetCommunityURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMMUNITYURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CommunityURI" element
     */
    public void setCommunityURI(java.lang.String communityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNITYURI$0);
            }
            target.setStringValue(communityURI);
        }
    }
    
    /**
     * Sets (as xml) the "CommunityURI" element
     */
    public void xsetCommunityURI(org.apache.xmlbeans.XmlAnyURI communityURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COMMUNITYURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(COMMUNITYURI$0);
            }
            target.set(communityURI);
        }
    }
    
    /**
     * Gets the "CommunityDescription" element
     */
    public java.lang.String getCommunityDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CommunityDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetCommunityDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYDESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CommunityDescription" element
     */
    public boolean isSetCommunityDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMUNITYDESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "CommunityDescription" element
     */
    public void setCommunityDescription(java.lang.String communityDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNITYDESCRIPTION$2);
            }
            target.setStringValue(communityDescription);
        }
    }
    
    /**
     * Sets (as xml) the "CommunityDescription" element
     */
    public void xsetCommunityDescription(org.apache.xmlbeans.XmlString communityDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMUNITYDESCRIPTION$2);
            }
            target.set(communityDescription);
        }
    }
    
    /**
     * Unsets the "CommunityDescription" element
     */
    public void unsetCommunityDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMUNITYDESCRIPTION$2, 0);
        }
    }
    
    /**
     * Gets the "CommunityVersion" element
     */
    public java.lang.String getCommunityVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYVERSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CommunityVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetCommunityVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYVERSION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CommunityVersion" element
     */
    public void setCommunityVersion(java.lang.String communityVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNITYVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNITYVERSION$4);
            }
            target.setStringValue(communityVersion);
        }
    }
    
    /**
     * Sets (as xml) the "CommunityVersion" element
     */
    public void xsetCommunityVersion(org.apache.xmlbeans.XmlString communityVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNITYVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMUNITYVERSION$4);
            }
            target.set(communityVersion);
        }
    }
    
    /**
     * Gets array of all "CommunityPedigreeURI" elements
     */
    public x0.messageStructure1.CommunityPedigreeURIType[] getCommunityPedigreeURIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMUNITYPEDIGREEURI$6, targetList);
            x0.messageStructure1.CommunityPedigreeURIType[] result = new x0.messageStructure1.CommunityPedigreeURIType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CommunityPedigreeURI" element
     */
    public x0.messageStructure1.CommunityPedigreeURIType getCommunityPedigreeURIArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.CommunityPedigreeURIType target = null;
            target = (x0.messageStructure1.CommunityPedigreeURIType)get_store().find_element_user(COMMUNITYPEDIGREEURI$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CommunityPedigreeURI" element
     */
    public int sizeOfCommunityPedigreeURIArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMUNITYPEDIGREEURI$6);
        }
    }
    
    /**
     * Sets array of all "CommunityPedigreeURI" element
     */
    public void setCommunityPedigreeURIArray(x0.messageStructure1.CommunityPedigreeURIType[] communityPedigreeURIArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(communityPedigreeURIArray, COMMUNITYPEDIGREEURI$6);
        }
    }
    
    /**
     * Sets ith "CommunityPedigreeURI" element
     */
    public void setCommunityPedigreeURIArray(int i, x0.messageStructure1.CommunityPedigreeURIType communityPedigreeURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.CommunityPedigreeURIType target = null;
            target = (x0.messageStructure1.CommunityPedigreeURIType)get_store().find_element_user(COMMUNITYPEDIGREEURI$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(communityPedigreeURI);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CommunityPedigreeURI" element
     */
    public x0.messageStructure1.CommunityPedigreeURIType insertNewCommunityPedigreeURI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.CommunityPedigreeURIType target = null;
            target = (x0.messageStructure1.CommunityPedigreeURIType)get_store().insert_element_user(COMMUNITYPEDIGREEURI$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CommunityPedigreeURI" element
     */
    public x0.messageStructure1.CommunityPedigreeURIType addNewCommunityPedigreeURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.CommunityPedigreeURIType target = null;
            target = (x0.messageStructure1.CommunityPedigreeURIType)get_store().add_element_user(COMMUNITYPEDIGREEURI$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "CommunityPedigreeURI" element
     */
    public void removeCommunityPedigreeURI(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMUNITYPEDIGREEURI$6, i);
        }
    }
}
