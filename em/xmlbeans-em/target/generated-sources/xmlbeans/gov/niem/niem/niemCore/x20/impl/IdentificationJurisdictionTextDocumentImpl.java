/*
 * An XML document type.
 * Localname: IdentificationJurisdictionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IdentificationJurisdictionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one IdentificationJurisdictionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IdentificationJurisdictionTextDocumentImpl extends gov.niem.niem.niemCore.x20.impl.IdentificationJurisdictionDocumentImpl implements gov.niem.niem.niemCore.x20.IdentificationJurisdictionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentificationJurisdictionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONJURISDICTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationJurisdictionText");
    
    
    /**
     * Gets the "IdentificationJurisdictionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getIdentificationJurisdictionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(IDENTIFICATIONJURISDICTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IdentificationJurisdictionText" element
     */
    public boolean isNilIdentificationJurisdictionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(IDENTIFICATIONJURISDICTIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IdentificationJurisdictionText" element
     */
    public void setIdentificationJurisdictionText(gov.niem.niem.niemCore.x20.TextType identificationJurisdictionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(IDENTIFICATIONJURISDICTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(IDENTIFICATIONJURISDICTIONTEXT$0);
            }
            target.set(identificationJurisdictionText);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentificationJurisdictionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewIdentificationJurisdictionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(IDENTIFICATIONJURISDICTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "IdentificationJurisdictionText" element
     */
    public void setNilIdentificationJurisdictionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(IDENTIFICATIONJURISDICTIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(IDENTIFICATIONJURISDICTIONTEXT$0);
            }
            target.setNil();
        }
    }
}
