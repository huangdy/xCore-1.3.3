/*
 * An XML document type.
 * Localname: ExternalAdapterTypeIndicator
 * Namespace: http://niem.gov/niem/appinfo/2.0
 * Java type: gov.niem.niem.appinfo.x20.ExternalAdapterTypeIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.appinfo.x20.impl;
/**
 * A document containing one ExternalAdapterTypeIndicator(@http://niem.gov/niem/appinfo/2.0) element.
 *
 * This is a complex type.
 */
public class ExternalAdapterTypeIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.appinfo.x20.ExternalAdapterTypeIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExternalAdapterTypeIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALADAPTERTYPEINDICATOR$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/appinfo/2.0", "ExternalAdapterTypeIndicator");
    
    
    /**
     * Gets the "ExternalAdapterTypeIndicator" element
     */
    public boolean getExternalAdapterTypeIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALADAPTERTYPEINDICATOR$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExternalAdapterTypeIndicator" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetExternalAdapterTypeIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXTERNALADAPTERTYPEINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ExternalAdapterTypeIndicator" element
     */
    public void setExternalAdapterTypeIndicator(boolean externalAdapterTypeIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTERNALADAPTERTYPEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTERNALADAPTERTYPEINDICATOR$0);
            }
            target.setBooleanValue(externalAdapterTypeIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "ExternalAdapterTypeIndicator" element
     */
    public void xsetExternalAdapterTypeIndicator(org.apache.xmlbeans.XmlBoolean externalAdapterTypeIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EXTERNALADAPTERTYPEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EXTERNALADAPTERTYPEINDICATOR$0);
            }
            target.set(externalAdapterTypeIndicator);
        }
    }
}
