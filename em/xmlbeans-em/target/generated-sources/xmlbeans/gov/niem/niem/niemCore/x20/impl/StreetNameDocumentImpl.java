/*
 * An XML document type.
 * Localname: StreetName
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StreetNameDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one StreetName(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class StreetNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.StreetNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public StreetNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StreetName");
    
    
    /**
     * Gets the "StreetName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType getStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(STREETNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StreetName" element
     */
    public boolean isNilStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(STREETNAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StreetName" element
     */
    public void setStreetName(gov.niem.niem.niemCore.x20.ProperNameTextType streetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(STREETNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(STREETNAME$0);
            }
            target.set(streetName);
        }
    }
    
    /**
     * Appends and returns a new empty "StreetName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType addNewStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(STREETNAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "StreetName" element
     */
    public void setNilStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(STREETNAME$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(STREETNAME$0);
            }
            target.setNil();
        }
    }
}
