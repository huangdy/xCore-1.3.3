/*
 * XML Type:  DomainAttributeType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DomainAttributeType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML DomainAttributeType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class DomainAttributeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DomainAttributeType
{
    private static final long serialVersionUID = 1L;
    
    public DomainAttributeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTENAME$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttributeName");
    private static final javax.xml.namespace.QName ATTRIBUTEVALUE$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttributeValue");
    private static final javax.xml.namespace.QName DOMAINNAME$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DomainName");
    
    
    /**
     * Gets the "AttributeName" element
     */
    public java.lang.String getAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeName" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AttributeName" element
     */
    public boolean isSetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTENAME$0) != 0;
        }
    }
    
    /**
     * Sets the "AttributeName" element
     */
    public void setAttributeName(java.lang.String attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTENAME$0);
            }
            target.setStringValue(attributeName);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeName" element
     */
    public void xsetAttributeName(org.apache.xmlbeans.XmlString attributeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTENAME$0);
            }
            target.set(attributeName);
        }
    }
    
    /**
     * Unsets the "AttributeName" element
     */
    public void unsetAttributeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTENAME$0, 0);
        }
    }
    
    /**
     * Gets the "AttributeValue" element
     */
    public java.lang.String getAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttributeValue" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AttributeValue" element
     */
    public boolean isSetAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ATTRIBUTEVALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "AttributeValue" element
     */
    public void setAttributeValue(java.lang.String attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTEVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTEVALUE$2);
            }
            target.setStringValue(attributeValue);
        }
    }
    
    /**
     * Sets (as xml) the "AttributeValue" element
     */
    public void xsetAttributeValue(org.apache.xmlbeans.XmlString attributeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTEVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTEVALUE$2);
            }
            target.set(attributeValue);
        }
    }
    
    /**
     * Unsets the "AttributeValue" element
     */
    public void unsetAttributeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ATTRIBUTEVALUE$2, 0);
        }
    }
    
    /**
     * Gets the "DomainName" element
     */
    public java.lang.String getDomainName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINNAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOMAINNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOMAINNAME$4);
            }
            target.set(domainName);
        }
    }
}
