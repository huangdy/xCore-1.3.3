/*
 * XML Type:  SystemMetadataType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.SystemMetadataType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML SystemMetadataType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class SystemMetadataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.SystemMetadataType
{
    private static final long serialVersionUID = 1L;
    
    public SystemMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMIDENTIFIERABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemIdentifierAbstract");
    private static final org.apache.xmlbeans.QNameSet SYSTEMIDENTIFIERABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemIdentifierAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SystemIdentifier"),
    });
    private static final javax.xml.namespace.QName SYSTEMCONTACTABSTRACT$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemContactAbstract");
    private static final org.apache.xmlbeans.QNameSet SYSTEMCONTACTABSTRACT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemContactAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SystemContact"),
    });
    private static final javax.xml.namespace.QName SYSTEMMETADATAEXTENSIONABSTRACT$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet SYSTEMMETADATAEXTENSIONABSTRACT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataExtensionAbstract"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataDomainAttribute"),
    });
    
    
    /**
     * Gets the "SystemIdentifierAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getSystemIdentifierAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMIDENTIFIERABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemIdentifierAbstract" element
     */
    public void setSystemIdentifierAbstract(org.apache.xmlbeans.XmlObject systemIdentifierAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMIDENTIFIERABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMIDENTIFIERABSTRACT$0);
            }
            target.set(systemIdentifierAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemIdentifierAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewSystemIdentifierAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMIDENTIFIERABSTRACT$0);
            return target;
        }
    }
    
    /**
     * Gets the "SystemContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getSystemContactAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMCONTACTABSTRACT$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemContactAbstract" element
     */
    public void setSystemContactAbstract(org.apache.xmlbeans.XmlObject systemContactAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMCONTACTABSTRACT$3, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMCONTACTABSTRACT$2);
            }
            target.set(systemContactAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewSystemContactAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMCONTACTABSTRACT$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "SystemMetadataExtensionAbstract" elements
     */
    public org.apache.xmlbeans.XmlObject[] getSystemMetadataExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SYSTEMMETADATAEXTENSIONABSTRACT$5, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SystemMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getSystemMetadataExtensionAbstractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMMETADATAEXTENSIONABSTRACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SystemMetadataExtensionAbstract" element
     */
    public int sizeOfSystemMetadataExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SYSTEMMETADATAEXTENSIONABSTRACT$5);
        }
    }
    
    /**
     * Sets array of all "SystemMetadataExtensionAbstract" element
     */
    public void setSystemMetadataExtensionAbstractArray(org.apache.xmlbeans.XmlObject[] systemMetadataExtensionAbstractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(systemMetadataExtensionAbstractArray, SYSTEMMETADATAEXTENSIONABSTRACT$4, SYSTEMMETADATAEXTENSIONABSTRACT$5);
        }
    }
    
    /**
     * Sets ith "SystemMetadataExtensionAbstract" element
     */
    public void setSystemMetadataExtensionAbstractArray(int i, org.apache.xmlbeans.XmlObject systemMetadataExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMMETADATAEXTENSIONABSTRACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(systemMetadataExtensionAbstract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SystemMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject insertNewSystemMetadataExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(SYSTEMMETADATAEXTENSIONABSTRACT$5, SYSTEMMETADATAEXTENSIONABSTRACT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SystemMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewSystemMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMMETADATAEXTENSIONABSTRACT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "SystemMetadataExtensionAbstract" element
     */
    public void removeSystemMetadataExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SYSTEMMETADATAEXTENSIONABSTRACT$5, i);
        }
    }
}
