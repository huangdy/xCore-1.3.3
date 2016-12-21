/*
 * An XML document type.
 * Localname: AreaPolygonDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.AreaPolygonDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one AreaPolygonDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class AreaPolygonDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.AreaPolygonDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public AreaPolygonDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREAPOLYGONDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AreaPolygonDescriptionText");
    
    
    /**
     * Gets the "AreaPolygonDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getAreaPolygonDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREAPOLYGONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AreaPolygonDescriptionText" element
     */
    public boolean isNilAreaPolygonDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREAPOLYGONDESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AreaPolygonDescriptionText" element
     */
    public void setAreaPolygonDescriptionText(gov.niem.niem.niemCore.x20.TextType areaPolygonDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREAPOLYGONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(AREAPOLYGONDESCRIPTIONTEXT$0);
            }
            target.set(areaPolygonDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "AreaPolygonDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewAreaPolygonDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(AREAPOLYGONDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "AreaPolygonDescriptionText" element
     */
    public void setNilAreaPolygonDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREAPOLYGONDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(AREAPOLYGONDESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
