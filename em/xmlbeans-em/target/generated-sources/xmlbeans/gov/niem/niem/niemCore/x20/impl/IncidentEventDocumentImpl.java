/*
 * An XML document type.
 * Localname: IncidentEvent
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IncidentEventDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one IncidentEvent(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IncidentEventDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.IncidentEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTEVENT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IncidentEvent");
    
    
    /**
     * Gets the "IncidentEvent" element
     */
    public gov.niem.niem.niemCore.x20.ActivityType getIncidentEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().find_element_user(INCIDENTEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IncidentEvent" element
     */
    public boolean isNilIncidentEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().find_element_user(INCIDENTEVENT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IncidentEvent" element
     */
    public void setIncidentEvent(gov.niem.niem.niemCore.x20.ActivityType incidentEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().find_element_user(INCIDENTEVENT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().add_element_user(INCIDENTEVENT$0);
            }
            target.set(incidentEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentEvent" element
     */
    public gov.niem.niem.niemCore.x20.ActivityType addNewIncidentEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().add_element_user(INCIDENTEVENT$0);
            return target;
        }
    }
    
    /**
     * Nils the "IncidentEvent" element
     */
    public void setNilIncidentEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().find_element_user(INCIDENTEVENT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().add_element_user(INCIDENTEVENT$0);
            }
            target.setNil();
        }
    }
}
