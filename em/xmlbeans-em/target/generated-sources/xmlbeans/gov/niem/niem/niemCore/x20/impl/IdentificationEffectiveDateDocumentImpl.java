/*
 * An XML document type.
 * Localname: IdentificationEffectiveDate
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IdentificationEffectiveDateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one IdentificationEffectiveDate(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IdentificationEffectiveDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.IdentificationEffectiveDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentificationEffectiveDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONEFFECTIVEDATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationEffectiveDate");
    
    
    /**
     * Gets the "IdentificationEffectiveDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType getIdentificationEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEFFECTIVEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IdentificationEffectiveDate" element
     */
    public boolean isNilIdentificationEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEFFECTIVEDATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IdentificationEffectiveDate" element
     */
    public void setIdentificationEffectiveDate(gov.niem.niem.niemCore.x20.DateType identificationEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEFFECTIVEDATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(IDENTIFICATIONEFFECTIVEDATE$0);
            }
            target.set(identificationEffectiveDate);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentificationEffectiveDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType addNewIdentificationEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(IDENTIFICATIONEFFECTIVEDATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "IdentificationEffectiveDate" element
     */
    public void setNilIdentificationEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEFFECTIVEDATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(IDENTIFICATIONEFFECTIVEDATE$0);
            }
            target.setNil();
        }
    }
}
