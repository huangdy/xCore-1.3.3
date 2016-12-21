/*
 * XML Type:  IncidentInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML IncidentInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class IncidentInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType
{
    private static final long serialVersionUID = 1L;
    
    public IncidentInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTID$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "IncidentID");
    private static final javax.xml.namespace.QName INCIDENTDESCRIPTION$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "IncidentDescription");
    
    
    /**
     * Gets the "IncidentID" element
     */
    public java.lang.String getIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentID" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.IncidentIDType xgetIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.IncidentIDType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentIDType)get_store().find_element_user(INCIDENTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "IncidentID" element
     */
    public boolean isSetIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "IncidentID" element
     */
    public void setIncidentID(java.lang.String incidentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$0);
            }
            target.setStringValue(incidentID);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentID" element
     */
    public void xsetIncidentID(x0.oasisNamesTcEmergencyEDXLRM1.IncidentIDType incidentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.IncidentIDType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentIDType)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentIDType)get_store().add_element_user(INCIDENTID$0);
            }
            target.set(incidentID);
        }
    }
    
    /**
     * Unsets the "IncidentID" element
     */
    public void unsetIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTID$0, 0);
        }
    }
    
    /**
     * Gets the "IncidentDescription" element
     */
    public java.lang.String getIncidentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTDESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentDescription" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.IncidentDescriptionType xgetIncidentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.IncidentDescriptionType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentDescriptionType)get_store().find_element_user(INCIDENTDESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "IncidentDescription" element
     */
    public boolean isSetIncidentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTDESCRIPTION$2) != 0;
        }
    }
    
    /**
     * Sets the "IncidentDescription" element
     */
    public void setIncidentDescription(java.lang.String incidentDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTDESCRIPTION$2);
            }
            target.setStringValue(incidentDescription);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentDescription" element
     */
    public void xsetIncidentDescription(x0.oasisNamesTcEmergencyEDXLRM1.IncidentDescriptionType incidentDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.IncidentDescriptionType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentDescriptionType)get_store().find_element_user(INCIDENTDESCRIPTION$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentDescriptionType)get_store().add_element_user(INCIDENTDESCRIPTION$2);
            }
            target.set(incidentDescription);
        }
    }
    
    /**
     * Unsets the "IncidentDescription" element
     */
    public void unsetIncidentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTDESCRIPTION$2, 0);
        }
    }
}
