/*
 * An XML document type.
 * Localname: DomainName
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DomainNameDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DomainName(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DomainNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DomainNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public DomainNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOMAINNAME$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DomainName");
    
    
    /**
     * Gets the "DomainName" element
     */
    public java.lang.String getDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DomainName" element
     */
    public org.apache.xmlbeans.XmlString xgetDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DomainName" element
     */
    public void setDomainName(java.lang.String domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINNAME$0);
            }
            target.setStringValue(domainName);
        }
    }
    
    /**
     * Sets (as xml) the "DomainName" element
     */
    public void xsetDomainName(org.apache.xmlbeans.XmlString domainName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAINNAME$0);
            }
            target.set(domainName);
        }
    }
}
