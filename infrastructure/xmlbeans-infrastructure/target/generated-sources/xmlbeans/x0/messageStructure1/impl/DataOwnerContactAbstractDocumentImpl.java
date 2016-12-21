/*
 * An XML document type.
 * Localname: DataOwnerContactAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataOwnerContactAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataOwnerContactAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerContactAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataOwnerContactAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOwnerContactAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERCONTACTABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerContactAbstract");
    private static final org.apache.xmlbeans.QNameSet DATAOWNERCONTACTABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DataOwnerContact"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerContactAbstract"),
    });
    
    
    /**
     * Gets the "DataOwnerContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataOwnerContactAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERCONTACTABSTRACT$1, 0);
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
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAOWNERCONTACTABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERCONTACTABSTRACT$0);
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
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAOWNERCONTACTABSTRACT$0);
            return target;
        }
    }
}
