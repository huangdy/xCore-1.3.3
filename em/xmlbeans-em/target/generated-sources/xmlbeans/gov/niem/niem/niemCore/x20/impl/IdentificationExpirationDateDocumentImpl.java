/*
 * An XML document type.
 * Localname: IdentificationExpirationDate
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IdentificationExpirationDateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one IdentificationExpirationDate(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IdentificationExpirationDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.IdentificationExpirationDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentificationExpirationDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONEXPIRATIONDATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationExpirationDate");
    
    
    /**
     * Gets the "IdentificationExpirationDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType getIdentificationExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEXPIRATIONDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IdentificationExpirationDate" element
     */
    public boolean isNilIdentificationExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEXPIRATIONDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IdentificationExpirationDate" element
     */
    public void setIdentificationExpirationDate(gov.niem.niem.niemCore.x20.DateType identificationExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEXPIRATIONDATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(IDENTIFICATIONEXPIRATIONDATE$0);
            }
            target.set(identificationExpirationDate);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentificationExpirationDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType addNewIdentificationExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(IDENTIFICATIONEXPIRATIONDATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "IdentificationExpirationDate" element
     */
    public void setNilIdentificationExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEXPIRATIONDATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(IDENTIFICATIONEXPIRATIONDATE$0);
            }
            target.setNil();
        }
    }
}
