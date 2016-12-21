/*
 * An XML document type.
 * Localname: CapabilityIsLimitationIndicator
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CapabilityIsLimitationIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one CapabilityIsLimitationIndicator(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class CapabilityIsLimitationIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.CapabilityIsLimitationIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public CapabilityIsLimitationIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPABILITYISLIMITATIONINDICATOR$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CapabilityIsLimitationIndicator");
    
    
    /**
     * Gets the "CapabilityIsLimitationIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean getCapabilityIsLimitationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(CAPABILITYISLIMITATIONINDICATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CapabilityIsLimitationIndicator" element
     */
    public boolean isNilCapabilityIsLimitationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(CAPABILITYISLIMITATIONINDICATOR$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CapabilityIsLimitationIndicator" element
     */
    public void setCapabilityIsLimitationIndicator(gov.niem.niem.proxy.xsd.x20.Boolean capabilityIsLimitationIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(CAPABILITYISLIMITATIONINDICATOR$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().add_element_user(CAPABILITYISLIMITATIONINDICATOR$0);
            }
            target.set(capabilityIsLimitationIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "CapabilityIsLimitationIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean addNewCapabilityIsLimitationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().add_element_user(CAPABILITYISLIMITATIONINDICATOR$0);
            return target;
        }
    }
    
    /**
     * Nils the "CapabilityIsLimitationIndicator" element
     */
    public void setNilCapabilityIsLimitationIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(CAPABILITYISLIMITATIONINDICATOR$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().add_element_user(CAPABILITYISLIMITATIONINDICATOR$0);
            }
            target.setNil();
        }
    }
}
