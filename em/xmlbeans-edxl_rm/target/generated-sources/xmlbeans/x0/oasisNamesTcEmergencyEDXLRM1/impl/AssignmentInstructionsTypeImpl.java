/*
 * XML Type:  AssignmentInstructionsType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML AssignmentInstructionsType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class AssignmentInstructionsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType
{
    private static final long serialVersionUID = 1L;
    
    public AssignmentInstructionsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODEOFTRANSPORTATION$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "ModeOfTransportation");
    private static final javax.xml.namespace.QName NAVIGATIONINSTRUCTIONS$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "NavigationInstructions");
    private static final javax.xml.namespace.QName REPORTINGINSTRUCTIONS$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "ReportingInstructions");
    
    
    /**
     * Gets the "ModeOfTransportation" element
     */
    public java.lang.String getModeOfTransportation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODEOFTRANSPORTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ModeOfTransportation" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ModeOfTransportationType xgetModeOfTransportation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ModeOfTransportationType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ModeOfTransportationType)get_store().find_element_user(MODEOFTRANSPORTATION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ModeOfTransportation" element
     */
    public boolean isSetModeOfTransportation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODEOFTRANSPORTATION$0) != 0;
        }
    }
    
    /**
     * Sets the "ModeOfTransportation" element
     */
    public void setModeOfTransportation(java.lang.String modeOfTransportation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODEOFTRANSPORTATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODEOFTRANSPORTATION$0);
            }
            target.setStringValue(modeOfTransportation);
        }
    }
    
    /**
     * Sets (as xml) the "ModeOfTransportation" element
     */
    public void xsetModeOfTransportation(x0.oasisNamesTcEmergencyEDXLRM1.ModeOfTransportationType modeOfTransportation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ModeOfTransportationType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ModeOfTransportationType)get_store().find_element_user(MODEOFTRANSPORTATION$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ModeOfTransportationType)get_store().add_element_user(MODEOFTRANSPORTATION$0);
            }
            target.set(modeOfTransportation);
        }
    }
    
    /**
     * Unsets the "ModeOfTransportation" element
     */
    public void unsetModeOfTransportation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODEOFTRANSPORTATION$0, 0);
        }
    }
    
    /**
     * Gets the "NavigationInstructions" element
     */
    public java.lang.String getNavigationInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAVIGATIONINSTRUCTIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NavigationInstructions" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.NavigationInstructionsType xgetNavigationInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.NavigationInstructionsType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.NavigationInstructionsType)get_store().find_element_user(NAVIGATIONINSTRUCTIONS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "NavigationInstructions" element
     */
    public boolean isSetNavigationInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAVIGATIONINSTRUCTIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "NavigationInstructions" element
     */
    public void setNavigationInstructions(java.lang.String navigationInstructions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAVIGATIONINSTRUCTIONS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAVIGATIONINSTRUCTIONS$2);
            }
            target.setStringValue(navigationInstructions);
        }
    }
    
    /**
     * Sets (as xml) the "NavigationInstructions" element
     */
    public void xsetNavigationInstructions(x0.oasisNamesTcEmergencyEDXLRM1.NavigationInstructionsType navigationInstructions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.NavigationInstructionsType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.NavigationInstructionsType)get_store().find_element_user(NAVIGATIONINSTRUCTIONS$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.NavigationInstructionsType)get_store().add_element_user(NAVIGATIONINSTRUCTIONS$2);
            }
            target.set(navigationInstructions);
        }
    }
    
    /**
     * Unsets the "NavigationInstructions" element
     */
    public void unsetNavigationInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAVIGATIONINSTRUCTIONS$2, 0);
        }
    }
    
    /**
     * Gets the "ReportingInstructions" element
     */
    public java.lang.String getReportingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGINSTRUCTIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReportingInstructions" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ReportingInstructionsType xgetReportingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ReportingInstructionsType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ReportingInstructionsType)get_store().find_element_user(REPORTINGINSTRUCTIONS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReportingInstructions" element
     */
    public boolean isSetReportingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPORTINGINSTRUCTIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "ReportingInstructions" element
     */
    public void setReportingInstructions(java.lang.String reportingInstructions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPORTINGINSTRUCTIONS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPORTINGINSTRUCTIONS$4);
            }
            target.setStringValue(reportingInstructions);
        }
    }
    
    /**
     * Sets (as xml) the "ReportingInstructions" element
     */
    public void xsetReportingInstructions(x0.oasisNamesTcEmergencyEDXLRM1.ReportingInstructionsType reportingInstructions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ReportingInstructionsType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ReportingInstructionsType)get_store().find_element_user(REPORTINGINSTRUCTIONS$4, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ReportingInstructionsType)get_store().add_element_user(REPORTINGINSTRUCTIONS$4);
            }
            target.set(reportingInstructions);
        }
    }
    
    /**
     * Unsets the "ReportingInstructions" element
     */
    public void unsetReportingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPORTINGINSTRUCTIONS$4, 0);
        }
    }
}
