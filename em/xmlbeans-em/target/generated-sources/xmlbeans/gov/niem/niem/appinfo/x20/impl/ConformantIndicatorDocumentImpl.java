/*
 * An XML document type.
 * Localname: ConformantIndicator
 * Namespace: http://niem.gov/niem/appinfo/2.0
 * Java type: gov.niem.niem.appinfo.x20.ConformantIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.appinfo.x20.impl;
/**
 * A document containing one ConformantIndicator(@http://niem.gov/niem/appinfo/2.0) element.
 *
 * This is a complex type.
 */
public class ConformantIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.appinfo.x20.ConformantIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConformantIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFORMANTINDICATOR$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/appinfo/2.0", "ConformantIndicator");
    
    
    /**
     * Gets the "ConformantIndicator" element
     */
    public boolean getConformantIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFORMANTINDICATOR$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ConformantIndicator" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetConformantIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CONFORMANTINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ConformantIndicator" element
     */
    public void setConformantIndicator(boolean conformantIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFORMANTINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFORMANTINDICATOR$0);
            }
            target.setBooleanValue(conformantIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "ConformantIndicator" element
     */
    public void xsetConformantIndicator(org.apache.xmlbeans.XmlBoolean conformantIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CONFORMANTINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CONFORMANTINDICATOR$0);
            }
            target.set(conformantIndicator);
        }
    }
}
