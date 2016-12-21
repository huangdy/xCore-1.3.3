/*
 * An XML document type.
 * Localname: where
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * A document containing one where(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis) element.
 *
 * This is a complex type.
 */
public class WhereDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument
{
    private static final long serialVersionUID = 1L;
    
    public WhereDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHERE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis", "where");
    
    
    /**
     * Gets the "where" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType getWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType)get_store().find_element_user(WHERE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "where" element
     */
    public void setWhere(x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType where)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType)get_store().find_element_user(WHERE$0, 0);
            if (target == null)
            {
                target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType)get_store().add_element_user(WHERE$0);
            }
            target.set(where);
        }
    }
    
    /**
     * Appends and returns a new empty "where" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType addNewWhere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType)get_store().add_element_user(WHERE$0);
            return target;
        }
    }
}
