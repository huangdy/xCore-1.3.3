/*
 * An XML document type.
 * Localname: IncidentObservationText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IncidentObservationTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one IncidentObservationText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IncidentObservationTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.IncidentObservationTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentObservationTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTOBSERVATIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IncidentObservationText");
    
    
    /**
     * Gets the "IncidentObservationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getIncidentObservationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INCIDENTOBSERVATIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "IncidentObservationText" element
     */
    public boolean isNilIncidentObservationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INCIDENTOBSERVATIONTEXT$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "IncidentObservationText" element
     */
    public void setIncidentObservationText(gov.niem.niem.niemCore.x20.TextType incidentObservationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INCIDENTOBSERVATIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(INCIDENTOBSERVATIONTEXT$0);
            }
            target.set(incidentObservationText);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentObservationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewIncidentObservationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(INCIDENTOBSERVATIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Nils the "IncidentObservationText" element
     */
    public void setNilIncidentObservationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INCIDENTOBSERVATIONTEXT$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(INCIDENTOBSERVATIONTEXT$0);
            }
            target.setNil();
        }
    }
}
