/*
 * An XML document type.
 * Localname: PersonCapability
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonCapabilityDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one PersonCapability(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class PersonCapabilityDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonCapabilityDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonCapabilityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONCAPABILITY$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonCapability");
    
    
    /**
     * Gets the "PersonCapability" element
     */
    public gov.niem.niem.niemCore.x20.CapabilityType getPersonCapability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().find_element_user(PERSONCAPABILITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "PersonCapability" element
     */
    public boolean isNilPersonCapability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().find_element_user(PERSONCAPABILITY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "PersonCapability" element
     */
    public void setPersonCapability(gov.niem.niem.niemCore.x20.CapabilityType personCapability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().find_element_user(PERSONCAPABILITY$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().add_element_user(PERSONCAPABILITY$0);
            }
            target.set(personCapability);
        }
    }
    
    /**
     * Appends and returns a new empty "PersonCapability" element
     */
    public gov.niem.niem.niemCore.x20.CapabilityType addNewPersonCapability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().add_element_user(PERSONCAPABILITY$0);
            return target;
        }
    }
    
    /**
     * Nils the "PersonCapability" element
     */
    public void setNilPersonCapability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().find_element_user(PERSONCAPABILITY$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().add_element_user(PERSONCAPABILITY$0);
            }
            target.setNil();
        }
    }
}
