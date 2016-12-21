/*
 * An XML document type.
 * Localname: DigestAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DigestAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DigestAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DigestAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DigestAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public DigestAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIGESTABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DigestAbstract");
    private static final org.apache.xmlbeans.QNameSet DIGESTABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Digest"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DigestAbstract"),
    });
    
    
    /**
     * Gets the "DigestAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDigestAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DIGESTABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DigestAbstract" element
     */
    public void setDigestAbstract(org.apache.xmlbeans.XmlObject digestAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DIGESTABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DIGESTABSTRACT$0);
            }
            target.set(digestAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DigestAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDigestAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DIGESTABSTRACT$0);
            return target;
        }
    }
}
