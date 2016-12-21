/*
 * XML Type:  PDMessageMetadataType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PDMessageMetadataType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML PDMessageMetadataType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class PDMessageMetadataTypeImpl extends x0.messageStructure1.impl.MessageMetadataAbstractTypeImpl implements x0.messageStructure1.PDMessageMetadataType
{
    private static final long serialVersionUID = 1L;
    
    public PDMessageMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDMESSAGEMETADATAEXTENSIONABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet PDMESSAGEMETADATAEXTENSIONABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataDomainAttribute"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataExtensionAbstract"),
    });
    
    
    /**
     * Gets array of all "PDMessageMetadataExtensionAbstract" elements
     */
    public org.apache.xmlbeans.XmlObject[] getPDMessageMetadataExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PDMESSAGEMETADATAEXTENSIONABSTRACT$1, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PDMessageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getPDMessageMetadataExtensionAbstractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PDMESSAGEMETADATAEXTENSIONABSTRACT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PDMessageMetadataExtensionAbstract" element
     */
    public int sizeOfPDMessageMetadataExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PDMESSAGEMETADATAEXTENSIONABSTRACT$1);
        }
    }
    
    /**
     * Sets array of all "PDMessageMetadataExtensionAbstract" element
     */
    public void setPDMessageMetadataExtensionAbstractArray(org.apache.xmlbeans.XmlObject[] pdMessageMetadataExtensionAbstractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pdMessageMetadataExtensionAbstractArray, PDMESSAGEMETADATAEXTENSIONABSTRACT$0, PDMESSAGEMETADATAEXTENSIONABSTRACT$1);
        }
    }
    
    /**
     * Sets ith "PDMessageMetadataExtensionAbstract" element
     */
    public void setPDMessageMetadataExtensionAbstractArray(int i, org.apache.xmlbeans.XmlObject pdMessageMetadataExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PDMESSAGEMETADATAEXTENSIONABSTRACT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(pdMessageMetadataExtensionAbstract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PDMessageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject insertNewPDMessageMetadataExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(PDMESSAGEMETADATAEXTENSIONABSTRACT$1, PDMESSAGEMETADATAEXTENSIONABSTRACT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PDMessageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewPDMessageMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PDMESSAGEMETADATAEXTENSIONABSTRACT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PDMessageMetadataExtensionAbstract" element
     */
    public void removePDMessageMetadataExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PDMESSAGEMETADATAEXTENSIONABSTRACT$1, i);
        }
    }
}
