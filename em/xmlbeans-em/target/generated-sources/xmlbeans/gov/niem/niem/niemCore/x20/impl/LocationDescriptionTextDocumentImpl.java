/*
 * An XML document type.
 * Localname: LocationDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationDescriptionText");
    
    
    /**
     * Gets the "LocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationDescriptionText" element
     */
    public boolean isNilLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONDESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationDescriptionText" element
     */
    public void setLocationDescriptionText(gov.niem.niem.niemCore.x20.TextType locationDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(LOCATIONDESCRIPTIONTEXT$0);
            }
            target.set(locationDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(LOCATIONDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationDescriptionText" element
     */
    public void setNilLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(LOCATIONDESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
