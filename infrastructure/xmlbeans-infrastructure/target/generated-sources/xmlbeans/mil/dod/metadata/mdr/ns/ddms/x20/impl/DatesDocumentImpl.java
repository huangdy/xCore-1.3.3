/*
 * An XML document type.
 * Localname: dates
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.DatesDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one dates(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class DatesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.DatesDocument
{
    private static final long serialVersionUID = 1L;
    
    public DatesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATES$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "dates");
    
    
    /**
     * Gets the "dates" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.DatesType getDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.DatesType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.DatesType)get_store().find_element_user(DATES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "dates" element
     */
    public void setDates(mil.dod.metadata.mdr.ns.ddms.x20.DatesType dates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.DatesType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.DatesType)get_store().find_element_user(DATES$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.DatesType)get_store().add_element_user(DATES$0);
            }
            target.set(dates);
        }
    }
    
    /**
     * Appends and returns a new empty "dates" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.DatesType addNewDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.DatesType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.DatesType)get_store().add_element_user(DATES$0);
            return target;
        }
    }
}
