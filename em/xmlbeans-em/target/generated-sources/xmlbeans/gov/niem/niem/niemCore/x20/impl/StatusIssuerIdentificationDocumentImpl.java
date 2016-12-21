/*
 * An XML document type.
 * Localname: StatusIssuerIdentification
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StatusIssuerIdentificationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one StatusIssuerIdentification(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class StatusIssuerIdentificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.StatusIssuerIdentificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public StatusIssuerIdentificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSISSUERIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StatusIssuerIdentification");
    
    
    /**
     * Gets the "StatusIssuerIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType getStatusIssuerIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(STATUSISSUERIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "StatusIssuerIdentification" element
     */
    public boolean isNilStatusIssuerIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(STATUSISSUERIDENTIFICATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "StatusIssuerIdentification" element
     */
    public void setStatusIssuerIdentification(gov.niem.niem.niemCore.x20.IdentificationType statusIssuerIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(STATUSISSUERIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(STATUSISSUERIDENTIFICATION$0);
            }
            target.set(statusIssuerIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "StatusIssuerIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType addNewStatusIssuerIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(STATUSISSUERIDENTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "StatusIssuerIdentification" element
     */
    public void setNilStatusIssuerIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(STATUSISSUERIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(STATUSISSUERIDENTIFICATION$0);
            }
            target.setNil();
        }
    }
}
