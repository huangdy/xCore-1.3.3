/*
 * An XML document type.
 * Localname: valueName
 * Namespace: urn:oasis:names:tc:emergency:cap:1.1
 * Java type: x1.oasisNamesTcEmergencyCap1.ValueNameDocument
 *
 * Automatically generated - do not modify.
 */
package x1.oasisNamesTcEmergencyCap1.impl;
/**
 * A document containing one valueName(@urn:oasis:names:tc:emergency:cap:1.1) element.
 *
 * This is a complex type.
 */
public class ValueNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x1.oasisNamesTcEmergencyCap1.ValueNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValueNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUENAME$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "valueName");
    
    
    /**
     * Gets the "valueName" element
     */
    public java.lang.String getValueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "valueName" element
     */
    public org.apache.xmlbeans.XmlString xgetValueName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "valueName" element
     */
    public void setValueName(java.lang.String valueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUENAME$0);
            }
            target.setStringValue(valueName);
        }
    }
    
    /**
     * Sets (as xml) the "valueName" element
     */
    public void xsetValueName(org.apache.xmlbeans.XmlString valueName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUENAME$0);
            }
            target.set(valueName);
        }
    }
}
