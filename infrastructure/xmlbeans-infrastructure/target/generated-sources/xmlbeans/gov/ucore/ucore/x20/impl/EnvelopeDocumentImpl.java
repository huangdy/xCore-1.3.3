/*
 * An XML document type.
 * Localname: Envelope
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.EnvelopeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one Envelope(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class EnvelopeDocumentImpl extends gov.ucore.ucore.x20.impl.GeoLocationAbstractDocumentImpl implements gov.ucore.ucore.x20.EnvelopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENVELOPE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Envelope");
    
    
    /**
     * Gets the "Envelope" element
     */
    public gov.ucore.ucore.x20.EnvelopeType getEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EnvelopeType target = null;
            target = (gov.ucore.ucore.x20.EnvelopeType)get_store().find_element_user(ENVELOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Envelope" element
     */
    public void setEnvelope(gov.ucore.ucore.x20.EnvelopeType envelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EnvelopeType target = null;
            target = (gov.ucore.ucore.x20.EnvelopeType)get_store().find_element_user(ENVELOPE$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.EnvelopeType)get_store().add_element_user(ENVELOPE$0);
            }
            target.set(envelope);
        }
    }
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    public gov.ucore.ucore.x20.EnvelopeType addNewEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.EnvelopeType target = null;
            target = (gov.ucore.ucore.x20.EnvelopeType)get_store().add_element_user(ENVELOPE$0);
            return target;
        }
    }
}
