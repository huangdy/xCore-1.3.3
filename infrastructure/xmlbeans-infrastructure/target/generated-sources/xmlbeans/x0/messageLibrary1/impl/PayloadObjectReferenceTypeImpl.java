/*
 * XML Type:  PayloadObjectReferenceType
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.PayloadObjectReferenceType
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * An XML PayloadObjectReferenceType(@ulex:message:library:1.0).
 *
 * This is a complex type.
 */
public class PayloadObjectReferenceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.PayloadObjectReferenceType
{
    private static final long serialVersionUID = 1L;
    
    public PayloadObjectReferenceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVREF$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "nvref");
    private static final javax.xml.namespace.QName PNVREF$2 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "pnvref");
    
    
    /**
     * Gets the "nvref" attribute
     */
    public java.lang.String getNvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NVREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nvref" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetNvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NVREF$0);
            return target;
        }
    }
    
    /**
     * Sets the "nvref" attribute
     */
    public void setNvref(java.lang.String nvref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NVREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NVREF$0);
            }
            target.setStringValue(nvref);
        }
    }
    
    /**
     * Sets (as xml) the "nvref" attribute
     */
    public void xsetNvref(org.apache.xmlbeans.XmlNCName nvref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NVREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NVREF$0);
            }
            target.set(nvref);
        }
    }
    
    /**
     * Gets the "pnvref" attribute
     */
    public java.lang.String getPnvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNVREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pnvref" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetPnvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PNVREF$2);
            return target;
        }
    }
    
    /**
     * Sets the "pnvref" attribute
     */
    public void setPnvref(java.lang.String pnvref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNVREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PNVREF$2);
            }
            target.setStringValue(pnvref);
        }
    }
    
    /**
     * Sets (as xml) the "pnvref" attribute
     */
    public void xsetPnvref(org.apache.xmlbeans.XmlNCName pnvref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PNVREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PNVREF$2);
            }
            target.set(pnvref);
        }
    }
}
