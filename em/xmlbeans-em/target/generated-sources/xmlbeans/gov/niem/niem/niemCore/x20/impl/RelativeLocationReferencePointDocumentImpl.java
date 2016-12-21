/*
 * An XML document type.
 * Localname: RelativeLocationReferencePoint
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.RelativeLocationReferencePointDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one RelativeLocationReferencePoint(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class RelativeLocationReferencePointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.RelativeLocationReferencePointDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelativeLocationReferencePointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIVELOCATIONREFERENCEPOINT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationReferencePoint");
    
    
    /**
     * Gets the "RelativeLocationReferencePoint" element
     */
    public gov.niem.niem.niemCore.x20.LocationType getRelativeLocationReferencePoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(RELATIVELOCATIONREFERENCEPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "RelativeLocationReferencePoint" element
     */
    public boolean isNilRelativeLocationReferencePoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(RELATIVELOCATIONREFERENCEPOINT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "RelativeLocationReferencePoint" element
     */
    public void setRelativeLocationReferencePoint(gov.niem.niem.niemCore.x20.LocationType relativeLocationReferencePoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(RELATIVELOCATIONREFERENCEPOINT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LocationType)get_store().add_element_user(RELATIVELOCATIONREFERENCEPOINT$0);
            }
            target.set(relativeLocationReferencePoint);
        }
    }
    
    /**
     * Appends and returns a new empty "RelativeLocationReferencePoint" element
     */
    public gov.niem.niem.niemCore.x20.LocationType addNewRelativeLocationReferencePoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().add_element_user(RELATIVELOCATIONREFERENCEPOINT$0);
            return target;
        }
    }
    
    /**
     * Nils the "RelativeLocationReferencePoint" element
     */
    public void setNilRelativeLocationReferencePoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(RELATIVELOCATIONREFERENCEPOINT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LocationType)get_store().add_element_user(RELATIVELOCATIONREFERENCEPOINT$0);
            }
            target.setNil();
        }
    }
}
