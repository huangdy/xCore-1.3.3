/*
 * An XML document type.
 * Localname: IdentificationJurisdiction
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IdentificationJurisdictionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one IdentificationJurisdiction(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IdentificationJurisdictionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.IdentificationJurisdictionDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentificationJurisdictionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONJURISDICTION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationJurisdiction");
    private static final org.apache.xmlbeans.QNameSet IDENTIFICATIONJURISDICTION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationJurisdictionText"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationJurisdiction"),
    });
    
    
    /**
     * Gets the "IdentificationJurisdiction" element
     */
    public org.apache.xmlbeans.XmlObject getIdentificationJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFICATIONJURISDICTION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentificationJurisdiction" element
     */
    public void setIdentificationJurisdiction(org.apache.xmlbeans.XmlObject identificationJurisdiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFICATIONJURISDICTION$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFICATIONJURISDICTION$0);
            }
            target.set(identificationJurisdiction);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentificationJurisdiction" element
     */
    public org.apache.xmlbeans.XmlObject addNewIdentificationJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFICATIONJURISDICTION$0);
            return target;
        }
    }
}
