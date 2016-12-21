/*
 * An XML document type.
 * Localname: ActivityDateRepresentation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityDateRepresentationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one ActivityDateRepresentation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class ActivityDateRepresentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.ActivityDateRepresentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ActivityDateRepresentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYDATEREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDateRepresentation");
    private static final org.apache.xmlbeans.QNameSet ACTIVITYDATEREPRESENTATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDateRepresentation"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDate"),
    });
    
    
    /**
     * Gets the "ActivityDateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject getActivityDateRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ACTIVITYDATEREPRESENTATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ActivityDateRepresentation" element
     */
    public void setActivityDateRepresentation(org.apache.xmlbeans.XmlObject activityDateRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ACTIVITYDATEREPRESENTATION$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ACTIVITYDATEREPRESENTATION$0);
            }
            target.set(activityDateRepresentation);
        }
    }
    
    /**
     * Appends and returns a new empty "ActivityDateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject addNewActivityDateRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ACTIVITYDATEREPRESENTATION$0);
            return target;
        }
    }
}
