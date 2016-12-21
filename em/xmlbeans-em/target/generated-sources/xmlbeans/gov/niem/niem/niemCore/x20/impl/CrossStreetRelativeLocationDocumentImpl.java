/*
 * An XML document type.
 * Localname: CrossStreetRelativeLocation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CrossStreetRelativeLocationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one CrossStreetRelativeLocation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class CrossStreetRelativeLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.CrossStreetRelativeLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CrossStreetRelativeLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CROSSSTREETRELATIVELOCATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CrossStreetRelativeLocation");
    
    
    /**
     * Gets the "CrossStreetRelativeLocation" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationType getCrossStreetRelativeLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().find_element_user(CROSSSTREETRELATIVELOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CrossStreetRelativeLocation" element
     */
    public boolean isNilCrossStreetRelativeLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().find_element_user(CROSSSTREETRELATIVELOCATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CrossStreetRelativeLocation" element
     */
    public void setCrossStreetRelativeLocation(gov.niem.niem.niemCore.x20.RelativeLocationType crossStreetRelativeLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().find_element_user(CROSSSTREETRELATIVELOCATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().add_element_user(CROSSSTREETRELATIVELOCATION$0);
            }
            target.set(crossStreetRelativeLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "CrossStreetRelativeLocation" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationType addNewCrossStreetRelativeLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().add_element_user(CROSSSTREETRELATIVELOCATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "CrossStreetRelativeLocation" element
     */
    public void setNilCrossStreetRelativeLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().find_element_user(CROSSSTREETRELATIVELOCATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().add_element_user(CROSSSTREETRELATIVELOCATION$0);
            }
            target.setNil();
        }
    }
}
