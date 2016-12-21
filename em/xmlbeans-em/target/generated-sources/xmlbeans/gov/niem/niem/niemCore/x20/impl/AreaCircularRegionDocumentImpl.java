/*
 * An XML document type.
 * Localname: AreaCircularRegion
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.AreaCircularRegionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one AreaCircularRegion(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class AreaCircularRegionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.AreaCircularRegionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AreaCircularRegionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREACIRCULARREGION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AreaCircularRegion");
    
    
    /**
     * Gets the "AreaCircularRegion" element
     */
    public gov.niem.niem.niemCore.x20.CircularRegionType getAreaCircularRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AreaCircularRegion" element
     */
    public boolean isNilAreaCircularRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AreaCircularRegion" element
     */
    public void setAreaCircularRegion(gov.niem.niem.niemCore.x20.CircularRegionType areaCircularRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().add_element_user(AREACIRCULARREGION$0);
            }
            target.set(areaCircularRegion);
        }
    }
    
    /**
     * Appends and returns a new empty "AreaCircularRegion" element
     */
    public gov.niem.niem.niemCore.x20.CircularRegionType addNewAreaCircularRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().add_element_user(AREACIRCULARREGION$0);
            return target;
        }
    }
    
    /**
     * Nils the "AreaCircularRegion" element
     */
    public void setNilAreaCircularRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().add_element_user(AREACIRCULARREGION$0);
            }
            target.setNil();
        }
    }
}
