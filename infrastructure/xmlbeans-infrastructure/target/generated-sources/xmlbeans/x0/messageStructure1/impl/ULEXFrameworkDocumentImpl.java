/*
 * An XML document type.
 * Localname: ULEXFramework
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.ULEXFrameworkDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one ULEXFramework(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class ULEXFrameworkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.ULEXFrameworkDocument
{
    private static final long serialVersionUID = 1L;
    
    public ULEXFrameworkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULEXFRAMEWORK$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXFramework");
    
    
    /**
     * Gets the "ULEXFramework" element
     */
    public java.lang.String getULEXFramework()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXFRAMEWORK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ULEXFramework" element
     */
    public org.apache.xmlbeans.XmlString xgetULEXFramework()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXFRAMEWORK$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ULEXFramework" element
     */
    public void setULEXFramework(java.lang.String ulexFramework)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXFRAMEWORK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULEXFRAMEWORK$0);
            }
            target.setStringValue(ulexFramework);
        }
    }
    
    /**
     * Sets (as xml) the "ULEXFramework" element
     */
    public void xsetULEXFramework(org.apache.xmlbeans.XmlString ulexFramework)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXFRAMEWORK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULEXFRAMEWORK$0);
            }
            target.set(ulexFramework);
        }
    }
}
