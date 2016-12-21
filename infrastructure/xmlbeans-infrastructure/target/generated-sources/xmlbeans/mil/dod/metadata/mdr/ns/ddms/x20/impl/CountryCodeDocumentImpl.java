/*
 * An XML document type.
 * Localname: countryCode
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.CountryCodeDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one countryCode(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class CountryCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.CountryCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CountryCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTRYCODE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "countryCode");
    
    
    /**
     * Gets the "countryCode" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType getCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().find_element_user(COUNTRYCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "countryCode" element
     */
    public void setCountryCode(mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType countryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().find_element_user(COUNTRYCODE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().add_element_user(COUNTRYCODE$0);
            }
            target.set(countryCode);
        }
    }
    
    /**
     * Appends and returns a new empty "countryCode" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType addNewCountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType)get_store().add_element_user(COUNTRYCODE$0);
            return target;
        }
    }
}
