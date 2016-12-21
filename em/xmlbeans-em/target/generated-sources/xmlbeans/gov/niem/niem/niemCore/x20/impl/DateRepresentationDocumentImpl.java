/*
 * An XML document type.
 * Localname: DateRepresentation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.DateRepresentationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one DateRepresentation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class DateRepresentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.DateRepresentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateRepresentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATEREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "DateRepresentation");
    private static final org.apache.xmlbeans.QNameSet DATEREPRESENTATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "DateRepresentation"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "DateTime"),
    });
    
    
    /**
     * Gets the "DateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject getDateRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATEREPRESENTATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DateRepresentation" element
     */
    public void setDateRepresentation(org.apache.xmlbeans.XmlObject dateRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATEREPRESENTATION$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATEREPRESENTATION$0);
            }
            target.set(dateRepresentation);
        }
    }
    
    /**
     * Appends and returns a new empty "DateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject addNewDateRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATEREPRESENTATION$0);
            return target;
        }
    }
}
