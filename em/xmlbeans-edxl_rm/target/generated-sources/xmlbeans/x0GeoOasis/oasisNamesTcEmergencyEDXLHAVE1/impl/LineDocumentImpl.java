/*
 * An XML document type.
 * Localname: line
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LineDocument
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * A document containing one line(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis) element.
 *
 * This is a complex type.
 */
public class LineDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LineDocument
{
    private static final long serialVersionUID = 1L;
    
    public LineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis", "line");
    
    
    /**
     * Gets the "line" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType getLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType)get_store().find_element_user(LINE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "line" element
     */
    public void setLine(x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType line)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType)get_store().find_element_user(LINE$0, 0);
            if (target == null)
            {
                target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType)get_store().add_element_user(LINE$0);
            }
            target.set(line);
        }
    }
    
    /**
     * Appends and returns a new empty "line" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType addNewLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType)get_store().add_element_user(LINE$0);
            return target;
        }
    }
}
