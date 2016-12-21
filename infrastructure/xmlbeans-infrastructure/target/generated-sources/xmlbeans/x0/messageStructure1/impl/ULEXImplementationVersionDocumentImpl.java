/*
 * An XML document type.
 * Localname: ULEXImplementationVersion
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.ULEXImplementationVersionDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one ULEXImplementationVersion(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class ULEXImplementationVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.ULEXImplementationVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ULEXImplementationVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULEXIMPLEMENTATIONVERSION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementationVersion");
    
    
    /**
     * Gets the "ULEXImplementationVersion" element
     */
    public java.lang.String getULEXImplementationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXIMPLEMENTATIONVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ULEXImplementationVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetULEXImplementationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXIMPLEMENTATIONVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ULEXImplementationVersion" element
     */
    public void setULEXImplementationVersion(java.lang.String ulexImplementationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXIMPLEMENTATIONVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULEXIMPLEMENTATIONVERSION$0);
            }
            target.setStringValue(ulexImplementationVersion);
        }
    }
    
    /**
     * Sets (as xml) the "ULEXImplementationVersion" element
     */
    public void xsetULEXImplementationVersion(org.apache.xmlbeans.XmlString ulexImplementationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXIMPLEMENTATIONVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULEXIMPLEMENTATIONVERSION$0);
            }
            target.set(ulexImplementationVersion);
        }
    }
}
