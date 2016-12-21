/*
 * An XML document type.
 * Localname: Subject
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.SubjectDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one Subject(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class SubjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.SubjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Subject");
    
    
    /**
     * Gets the "Subject" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.SubjectType getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.SubjectType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.SubjectType)get_store().find_element_user(SUBJECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subject" element
     */
    public void setSubject(mil.dod.metadata.mdr.ns.ddms.x20.SubjectType subject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.SubjectType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.SubjectType)get_store().find_element_user(SUBJECT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.SubjectType)get_store().add_element_user(SUBJECT$0);
            }
            target.set(subject);
        }
    }
    
    /**
     * Appends and returns a new empty "Subject" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.SubjectType addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.SubjectType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.SubjectType)get_store().add_element_user(SUBJECT$0);
            return target;
        }
    }
}
