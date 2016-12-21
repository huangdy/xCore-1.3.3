/*
 * XML Type:  ULEXImplementationType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.ULEXImplementationType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML ULEXImplementationType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class ULEXImplementationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.ULEXImplementationType
{
    private static final long serialVersionUID = 1L;
    
    public ULEXImplementationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULEXIMPLEMENTATIONVERSION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementationVersion");
    private static final javax.xml.namespace.QName ULEXIMPLEMENTATIONNAME$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementationName");
    
    
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
    
    /**
     * Gets the "ULEXImplementationName" element
     */
    public java.lang.String getULEXImplementationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXIMPLEMENTATIONNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ULEXImplementationName" element
     */
    public org.apache.xmlbeans.XmlString xgetULEXImplementationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXIMPLEMENTATIONNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ULEXImplementationName" element
     */
    public void setULEXImplementationName(java.lang.String ulexImplementationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXIMPLEMENTATIONNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULEXIMPLEMENTATIONNAME$2);
            }
            target.setStringValue(ulexImplementationName);
        }
    }
    
    /**
     * Sets (as xml) the "ULEXImplementationName" element
     */
    public void xsetULEXImplementationName(org.apache.xmlbeans.XmlString ulexImplementationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXIMPLEMENTATIONNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULEXIMPLEMENTATIONNAME$2);
            }
            target.set(ulexImplementationName);
        }
    }
}
