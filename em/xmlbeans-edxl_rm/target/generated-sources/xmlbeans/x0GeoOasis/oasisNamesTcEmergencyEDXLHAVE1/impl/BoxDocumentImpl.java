/*
 * An XML document type.
 * Localname: box
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.BoxDocument
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * A document containing one box(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis) element.
 *
 * This is a complex type.
 */
public class BoxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.BoxDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOX$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis", "box");
    
    
    /**
     * Gets the "box" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType getBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType)get_store().find_element_user(BOX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "box" element
     */
    public void setBox(x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType box)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType)get_store().find_element_user(BOX$0, 0);
            if (target == null)
            {
                target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType)get_store().add_element_user(BOX$0);
            }
            target.set(box);
        }
    }
    
    /**
     * Appends and returns a new empty "box" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType addNewBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.EnvelopePropertyType)get_store().add_element_user(BOX$0);
            return target;
        }
    }
}
