/*
 * XML Type:  DataOwnerMetadataType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataOwnerMetadataType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML DataOwnerMetadataType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class DataOwnerMetadataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataOwnerMetadataType
{
    private static final long serialVersionUID = 1L;
    
    public DataOwnerMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERIDENTIFIERABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerIdentifierAbstract");
    private static final org.apache.xmlbeans.QNameSet DATAOWNERIDENTIFIERABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerIdentifierAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DataOwnerIdentifier"),
    });
    private static final javax.xml.namespace.QName DATAOWNERCONTACTABSTRACT$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerContactAbstract");
    private static final org.apache.xmlbeans.QNameSet DATAOWNERCONTACTABSTRACT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DataOwnerContact"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerContactAbstract"),
    });
    private static final javax.xml.namespace.QName DATAOWNERMETADATAEXTENSIONABSTRACT$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet DATAOWNERMETADATAEXTENSIONABSTRACT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataDomainAttribute"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadataExtensionAbstract"),
    });
    
    
    /**
     * Gets the "DataOwnerIdentifierAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataOwnerIdentifierAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERIDENTIFIERABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerIdentifierAbstract" element
     */
    public void setDataOwnerIdentifierAbstract(org.apache.xmlbeans.XmlObject dataOwnerIdentifierAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERIDENTIFIERABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERIDENTIFIERABSTRACT$0);
            }
            target.set(dataOwnerIdentifierAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerIdentifierAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataOwnerIdentifierAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERIDENTIFIERABSTRACT$0);
            return target;
        }
    }
    
    /**
     * Gets the "DataOwnerContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataOwnerContactAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERCONTACTABSTRACT$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerContactAbstract" element
     */
    public void setDataOwnerContactAbstract(org.apache.xmlbeans.XmlObject dataOwnerContactAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERCONTACTABSTRACT$3, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERCONTACTABSTRACT$2);
            }
            target.set(dataOwnerContactAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataOwnerContactAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERCONTACTABSTRACT$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "DataOwnerMetadataExtensionAbstract" elements
     */
    public org.apache.xmlbeans.XmlObject[] getDataOwnerMetadataExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAOWNERMETADATAEXTENSIONABSTRACT$5, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataOwnerMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataOwnerMetadataExtensionAbstractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERMETADATAEXTENSIONABSTRACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataOwnerMetadataExtensionAbstract" element
     */
    public int sizeOfDataOwnerMetadataExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAOWNERMETADATAEXTENSIONABSTRACT$5);
        }
    }
    
    /**
     * Sets array of all "DataOwnerMetadataExtensionAbstract" element
     */
    public void setDataOwnerMetadataExtensionAbstractArray(org.apache.xmlbeans.XmlObject[] dataOwnerMetadataExtensionAbstractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataOwnerMetadataExtensionAbstractArray, DATAOWNERMETADATAEXTENSIONABSTRACT$4, DATAOWNERMETADATAEXTENSIONABSTRACT$5);
        }
    }
    
    /**
     * Sets ith "DataOwnerMetadataExtensionAbstract" element
     */
    public void setDataOwnerMetadataExtensionAbstractArray(int i, org.apache.xmlbeans.XmlObject dataOwnerMetadataExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERMETADATAEXTENSIONABSTRACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataOwnerMetadataExtensionAbstract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataOwnerMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject insertNewDataOwnerMetadataExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(DATAOWNERMETADATAEXTENSIONABSTRACT$5, DATAOWNERMETADATAEXTENSIONABSTRACT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataOwnerMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataOwnerMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERMETADATAEXTENSIONABSTRACT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataOwnerMetadataExtensionAbstract" element
     */
    public void removeDataOwnerMetadataExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAOWNERMETADATAEXTENSIONABSTRACT$5, i);
        }
    }
}
