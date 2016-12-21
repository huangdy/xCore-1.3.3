/*
 * An XML document type.
 * Localname: SystemContactAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.SystemContactAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one SystemContactAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class SystemContactAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.SystemContactAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public SystemContactAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMCONTACTABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemContactAbstract");
    private static final org.apache.xmlbeans.QNameSet SYSTEMCONTACTABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemContactAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SystemContact"),
    });
    
    
    /**
     * Gets the "SystemContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getSystemContactAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMCONTACTABSTRACT$1, 0);
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
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMCONTACTABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMCONTACTABSTRACT$0);
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
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMCONTACTABSTRACT$0);
            return target;
        }
    }
}
