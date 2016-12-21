/*
 * An XML document type.
 * Localname: CrossStreetDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CrossStreetDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one CrossStreetDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class CrossStreetDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.CrossStreetDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public CrossStreetDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CROSSSTREETDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CrossStreetDescriptionText");
    
    
    /**
     * Gets the "CrossStreetDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getCrossStreetDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CROSSSTREETDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CrossStreetDescriptionText" element
     */
    public boolean isNilCrossStreetDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CROSSSTREETDESCRIPTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CrossStreetDescriptionText" element
     */
    public void setCrossStreetDescriptionText(gov.niem.niem.niemCore.x20.TextType crossStreetDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CROSSSTREETDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CROSSSTREETDESCRIPTIONTEXT$0);
            }
            target.set(crossStreetDescriptionText);
        }
    }
    
    /**
     * Appends and returns a new empty "CrossStreetDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewCrossStreetDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CROSSSTREETDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "CrossStreetDescriptionText" element
     */
    public void setNilCrossStreetDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CROSSSTREETDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CROSSSTREETDESCRIPTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
