/*
 * An XML document type.
 * Localname: LocationSurroundingAreaDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationSurroundingAreaDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationSurroundingAreaDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationSurroundingAreaDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationSurroundingAreaDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationSurroundingAreaDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationSurroundingAreaDescriptionText");
    
    
    /**
     * Gets the "LocationSurroundingAreaDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getLocationSurroundingAreaDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationSurroundingAreaDescriptionText" element
     */
    public boolean isNilLocationSurroundingAreaDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationSurroundingAreaDescriptionText" element
     */
    public void setLocationSurroundingAreaDescriptionText(gov.niem.niem.niemCore.x20.TextType locationSurroundingAreaDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$0);
            }
            target.set(locationSurroundingAreaDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationSurroundingAreaDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewLocationSurroundingAreaDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationSurroundingAreaDescriptionText" element
     */
    public void setNilLocationSurroundingAreaDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
