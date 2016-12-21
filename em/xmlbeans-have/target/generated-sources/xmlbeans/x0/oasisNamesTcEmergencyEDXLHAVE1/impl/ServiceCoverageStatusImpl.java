/*
 * XML Type:  ServiceCoverageStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML ServiceCoverageStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public class ServiceCoverageStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus
{
    private static final long serialVersionUID = 1L;
    
    public ServiceCoverageStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BURN$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Burn");
    private static final javax.xml.namespace.QName CARDIOLOGYINDICATOR$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CardiologyIndicator");
    private static final javax.xml.namespace.QName DIALYSIS$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Dialysis");
    private static final javax.xml.namespace.QName EMERGENCYDEPARTMENT$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EmergencyDepartment");
    private static final javax.xml.namespace.QName HYPERBARICCHAMBER$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "HyperbaricChamber");
    private static final javax.xml.namespace.QName INFECTIOUSDISEASE$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "InfectiousDisease");
    private static final javax.xml.namespace.QName NEONATOLOGY$12 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Neonatology");
    private static final javax.xml.namespace.QName NEUROLOGYINDICATOR$14 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "NeurologyIndicator");
    private static final javax.xml.namespace.QName OBGYNINDICATOR$16 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "OBGYNIndicator");
    private static final javax.xml.namespace.QName OPHTHALMOLOGY$18 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Ophthalmology");
    private static final javax.xml.namespace.QName ORTHOPEDIC$20 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Orthopedic");
    private static final javax.xml.namespace.QName PEDIATRICS$22 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Pediatrics");
    private static final javax.xml.namespace.QName PSYCHIATRICINDICATOR$24 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "PsychiatricIndicator");
    private static final javax.xml.namespace.QName SURGERYINDICATOR$26 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "SurgeryIndicator");
    private static final javax.xml.namespace.QName TRANSPORTSERVICESINDICATOR$28 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TransportServicesIndicator");
    private static final javax.xml.namespace.QName TRAUMACENTERSERVICESINDICATOR$30 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TraumaCenterServicesIndicator");
    private static final javax.xml.namespace.QName COMMENTTEXT$32 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CommentText");
    
    
    /**
     * Gets the "Burn" element
     */
    public boolean getBurn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BURN$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Burn" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBurn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BURN$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Burn" element
     */
    public boolean isSetBurn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BURN$0) != 0;
        }
    }
    
    /**
     * Sets the "Burn" element
     */
    public void setBurn(boolean burn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BURN$0);
            }
            target.setBooleanValue(burn);
        }
    }
    
    /**
     * Sets (as xml) the "Burn" element
     */
    public void xsetBurn(org.apache.xmlbeans.XmlBoolean burn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BURN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BURN$0);
            }
            target.set(burn);
        }
    }
    
    /**
     * Unsets the "Burn" element
     */
    public void unsetBurn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BURN$0, 0);
        }
    }
    
    /**
     * Gets the "CardiologyIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator getCardiologyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator)get_store().find_element_user(CARDIOLOGYINDICATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CardiologyIndicator" element
     */
    public boolean isSetCardiologyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CARDIOLOGYINDICATOR$2) != 0;
        }
    }
    
    /**
     * Sets the "CardiologyIndicator" element
     */
    public void setCardiologyIndicator(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator cardiologyIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator)get_store().find_element_user(CARDIOLOGYINDICATOR$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator)get_store().add_element_user(CARDIOLOGYINDICATOR$2);
            }
            target.set(cardiologyIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "CardiologyIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator addNewCardiologyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator)get_store().add_element_user(CARDIOLOGYINDICATOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CardiologyIndicator" element
     */
    public void unsetCardiologyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CARDIOLOGYINDICATOR$2, 0);
        }
    }
    
    /**
     * Gets the "Dialysis" element
     */
    public boolean getDialysis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIALYSIS$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Dialysis" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDialysis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIALYSIS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Dialysis" element
     */
    public boolean isSetDialysis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIALYSIS$4) != 0;
        }
    }
    
    /**
     * Sets the "Dialysis" element
     */
    public void setDialysis(boolean dialysis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIALYSIS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIALYSIS$4);
            }
            target.setBooleanValue(dialysis);
        }
    }
    
    /**
     * Sets (as xml) the "Dialysis" element
     */
    public void xsetDialysis(org.apache.xmlbeans.XmlBoolean dialysis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DIALYSIS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DIALYSIS$4);
            }
            target.set(dialysis);
        }
    }
    
    /**
     * Unsets the "Dialysis" element
     */
    public void unsetDialysis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIALYSIS$4, 0);
        }
    }
    
    /**
     * Gets the "EmergencyDepartment" element
     */
    public boolean getEmergencyDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYDEPARTMENT$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmergencyDepartment" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEmergencyDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EMERGENCYDEPARTMENT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmergencyDepartment" element
     */
    public boolean isSetEmergencyDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMERGENCYDEPARTMENT$6) != 0;
        }
    }
    
    /**
     * Sets the "EmergencyDepartment" element
     */
    public void setEmergencyDepartment(boolean emergencyDepartment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMERGENCYDEPARTMENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMERGENCYDEPARTMENT$6);
            }
            target.setBooleanValue(emergencyDepartment);
        }
    }
    
    /**
     * Sets (as xml) the "EmergencyDepartment" element
     */
    public void xsetEmergencyDepartment(org.apache.xmlbeans.XmlBoolean emergencyDepartment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(EMERGENCYDEPARTMENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(EMERGENCYDEPARTMENT$6);
            }
            target.set(emergencyDepartment);
        }
    }
    
    /**
     * Unsets the "EmergencyDepartment" element
     */
    public void unsetEmergencyDepartment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMERGENCYDEPARTMENT$6, 0);
        }
    }
    
    /**
     * Gets the "HyperbaricChamber" element
     */
    public boolean getHyperbaricChamber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HYPERBARICCHAMBER$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HyperbaricChamber" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHyperbaricChamber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HYPERBARICCHAMBER$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "HyperbaricChamber" element
     */
    public boolean isSetHyperbaricChamber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HYPERBARICCHAMBER$8) != 0;
        }
    }
    
    /**
     * Sets the "HyperbaricChamber" element
     */
    public void setHyperbaricChamber(boolean hyperbaricChamber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HYPERBARICCHAMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HYPERBARICCHAMBER$8);
            }
            target.setBooleanValue(hyperbaricChamber);
        }
    }
    
    /**
     * Sets (as xml) the "HyperbaricChamber" element
     */
    public void xsetHyperbaricChamber(org.apache.xmlbeans.XmlBoolean hyperbaricChamber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HYPERBARICCHAMBER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HYPERBARICCHAMBER$8);
            }
            target.set(hyperbaricChamber);
        }
    }
    
    /**
     * Unsets the "HyperbaricChamber" element
     */
    public void unsetHyperbaricChamber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HYPERBARICCHAMBER$8, 0);
        }
    }
    
    /**
     * Gets the "InfectiousDisease" element
     */
    public boolean getInfectiousDisease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFECTIOUSDISEASE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "InfectiousDisease" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetInfectiousDisease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INFECTIOUSDISEASE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "InfectiousDisease" element
     */
    public boolean isSetInfectiousDisease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFECTIOUSDISEASE$10) != 0;
        }
    }
    
    /**
     * Sets the "InfectiousDisease" element
     */
    public void setInfectiousDisease(boolean infectiousDisease)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFECTIOUSDISEASE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFECTIOUSDISEASE$10);
            }
            target.setBooleanValue(infectiousDisease);
        }
    }
    
    /**
     * Sets (as xml) the "InfectiousDisease" element
     */
    public void xsetInfectiousDisease(org.apache.xmlbeans.XmlBoolean infectiousDisease)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INFECTIOUSDISEASE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INFECTIOUSDISEASE$10);
            }
            target.set(infectiousDisease);
        }
    }
    
    /**
     * Unsets the "InfectiousDisease" element
     */
    public void unsetInfectiousDisease()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFECTIOUSDISEASE$10, 0);
        }
    }
    
    /**
     * Gets the "Neonatology" element
     */
    public boolean getNeonatology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEONATOLOGY$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Neonatology" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetNeonatology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NEONATOLOGY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Neonatology" element
     */
    public boolean isSetNeonatology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEONATOLOGY$12) != 0;
        }
    }
    
    /**
     * Sets the "Neonatology" element
     */
    public void setNeonatology(boolean neonatology)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEONATOLOGY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEONATOLOGY$12);
            }
            target.setBooleanValue(neonatology);
        }
    }
    
    /**
     * Sets (as xml) the "Neonatology" element
     */
    public void xsetNeonatology(org.apache.xmlbeans.XmlBoolean neonatology)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NEONATOLOGY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NEONATOLOGY$12);
            }
            target.set(neonatology);
        }
    }
    
    /**
     * Unsets the "Neonatology" element
     */
    public void unsetNeonatology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEONATOLOGY$12, 0);
        }
    }
    
    /**
     * Gets the "NeurologyIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator getNeurologyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator)get_store().find_element_user(NEUROLOGYINDICATOR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NeurologyIndicator" element
     */
    public boolean isSetNeurologyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEUROLOGYINDICATOR$14) != 0;
        }
    }
    
    /**
     * Sets the "NeurologyIndicator" element
     */
    public void setNeurologyIndicator(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator neurologyIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator)get_store().find_element_user(NEUROLOGYINDICATOR$14, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator)get_store().add_element_user(NEUROLOGYINDICATOR$14);
            }
            target.set(neurologyIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "NeurologyIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator addNewNeurologyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator)get_store().add_element_user(NEUROLOGYINDICATOR$14);
            return target;
        }
    }
    
    /**
     * Unsets the "NeurologyIndicator" element
     */
    public void unsetNeurologyIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEUROLOGYINDICATOR$14, 0);
        }
    }
    
    /**
     * Gets the "OBGYNIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator getOBGYNIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator)get_store().find_element_user(OBGYNINDICATOR$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "OBGYNIndicator" element
     */
    public boolean isSetOBGYNIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBGYNINDICATOR$16) != 0;
        }
    }
    
    /**
     * Sets the "OBGYNIndicator" element
     */
    public void setOBGYNIndicator(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator obgynIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator)get_store().find_element_user(OBGYNINDICATOR$16, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator)get_store().add_element_user(OBGYNINDICATOR$16);
            }
            target.set(obgynIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "OBGYNIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator addNewOBGYNIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator)get_store().add_element_user(OBGYNINDICATOR$16);
            return target;
        }
    }
    
    /**
     * Unsets the "OBGYNIndicator" element
     */
    public void unsetOBGYNIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBGYNINDICATOR$16, 0);
        }
    }
    
    /**
     * Gets the "Ophthalmology" element
     */
    public boolean getOphthalmology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPHTHALMOLOGY$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ophthalmology" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOphthalmology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OPHTHALMOLOGY$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "Ophthalmology" element
     */
    public boolean isSetOphthalmology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPHTHALMOLOGY$18) != 0;
        }
    }
    
    /**
     * Sets the "Ophthalmology" element
     */
    public void setOphthalmology(boolean ophthalmology)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPHTHALMOLOGY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPHTHALMOLOGY$18);
            }
            target.setBooleanValue(ophthalmology);
        }
    }
    
    /**
     * Sets (as xml) the "Ophthalmology" element
     */
    public void xsetOphthalmology(org.apache.xmlbeans.XmlBoolean ophthalmology)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OPHTHALMOLOGY$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OPHTHALMOLOGY$18);
            }
            target.set(ophthalmology);
        }
    }
    
    /**
     * Unsets the "Ophthalmology" element
     */
    public void unsetOphthalmology()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPHTHALMOLOGY$18, 0);
        }
    }
    
    /**
     * Gets the "Orthopedic" element
     */
    public boolean getOrthopedic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORTHOPEDIC$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Orthopedic" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOrthopedic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORTHOPEDIC$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "Orthopedic" element
     */
    public boolean isSetOrthopedic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORTHOPEDIC$20) != 0;
        }
    }
    
    /**
     * Sets the "Orthopedic" element
     */
    public void setOrthopedic(boolean orthopedic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORTHOPEDIC$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORTHOPEDIC$20);
            }
            target.setBooleanValue(orthopedic);
        }
    }
    
    /**
     * Sets (as xml) the "Orthopedic" element
     */
    public void xsetOrthopedic(org.apache.xmlbeans.XmlBoolean orthopedic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORTHOPEDIC$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORTHOPEDIC$20);
            }
            target.set(orthopedic);
        }
    }
    
    /**
     * Unsets the "Orthopedic" element
     */
    public void unsetOrthopedic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORTHOPEDIC$20, 0);
        }
    }
    
    /**
     * Gets the "Pediatrics" element
     */
    public org.apache.xmlbeans.XmlObject getPediatrics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PEDIATRICS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Pediatrics" element
     */
    public boolean isSetPediatrics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PEDIATRICS$22) != 0;
        }
    }
    
    /**
     * Sets the "Pediatrics" element
     */
    public void setPediatrics(org.apache.xmlbeans.XmlObject pediatrics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PEDIATRICS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PEDIATRICS$22);
            }
            target.set(pediatrics);
        }
    }
    
    /**
     * Appends and returns a new empty "Pediatrics" element
     */
    public org.apache.xmlbeans.XmlObject addNewPediatrics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PEDIATRICS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "Pediatrics" element
     */
    public void unsetPediatrics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PEDIATRICS$22, 0);
        }
    }
    
    /**
     * Gets the "PsychiatricIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator getPsychiatricIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator)get_store().find_element_user(PSYCHIATRICINDICATOR$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PsychiatricIndicator" element
     */
    public boolean isSetPsychiatricIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PSYCHIATRICINDICATOR$24) != 0;
        }
    }
    
    /**
     * Sets the "PsychiatricIndicator" element
     */
    public void setPsychiatricIndicator(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator psychiatricIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator)get_store().find_element_user(PSYCHIATRICINDICATOR$24, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator)get_store().add_element_user(PSYCHIATRICINDICATOR$24);
            }
            target.set(psychiatricIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "PsychiatricIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator addNewPsychiatricIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator)get_store().add_element_user(PSYCHIATRICINDICATOR$24);
            return target;
        }
    }
    
    /**
     * Unsets the "PsychiatricIndicator" element
     */
    public void unsetPsychiatricIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PSYCHIATRICINDICATOR$24, 0);
        }
    }
    
    /**
     * Gets the "SurgeryIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator getSurgeryIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator)get_store().find_element_user(SURGERYINDICATOR$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SurgeryIndicator" element
     */
    public boolean isSetSurgeryIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SURGERYINDICATOR$26) != 0;
        }
    }
    
    /**
     * Sets the "SurgeryIndicator" element
     */
    public void setSurgeryIndicator(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator surgeryIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator)get_store().find_element_user(SURGERYINDICATOR$26, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator)get_store().add_element_user(SURGERYINDICATOR$26);
            }
            target.set(surgeryIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "SurgeryIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator addNewSurgeryIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator)get_store().add_element_user(SURGERYINDICATOR$26);
            return target;
        }
    }
    
    /**
     * Unsets the "SurgeryIndicator" element
     */
    public void unsetSurgeryIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SURGERYINDICATOR$26, 0);
        }
    }
    
    /**
     * Gets the "TransportServicesIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator getTransportServicesIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator)get_store().find_element_user(TRANSPORTSERVICESINDICATOR$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TransportServicesIndicator" element
     */
    public boolean isSetTransportServicesIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSPORTSERVICESINDICATOR$28) != 0;
        }
    }
    
    /**
     * Sets the "TransportServicesIndicator" element
     */
    public void setTransportServicesIndicator(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator transportServicesIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator)get_store().find_element_user(TRANSPORTSERVICESINDICATOR$28, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator)get_store().add_element_user(TRANSPORTSERVICESINDICATOR$28);
            }
            target.set(transportServicesIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "TransportServicesIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator addNewTransportServicesIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator)get_store().add_element_user(TRANSPORTSERVICESINDICATOR$28);
            return target;
        }
    }
    
    /**
     * Unsets the "TransportServicesIndicator" element
     */
    public void unsetTransportServicesIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSPORTSERVICESINDICATOR$28, 0);
        }
    }
    
    /**
     * Gets the "TraumaCenterServicesIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator getTraumaCenterServicesIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator)get_store().find_element_user(TRAUMACENTERSERVICESINDICATOR$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TraumaCenterServicesIndicator" element
     */
    public boolean isSetTraumaCenterServicesIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRAUMACENTERSERVICESINDICATOR$30) != 0;
        }
    }
    
    /**
     * Sets the "TraumaCenterServicesIndicator" element
     */
    public void setTraumaCenterServicesIndicator(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator traumaCenterServicesIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator)get_store().find_element_user(TRAUMACENTERSERVICESINDICATOR$30, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator)get_store().add_element_user(TRAUMACENTERSERVICESINDICATOR$30);
            }
            target.set(traumaCenterServicesIndicator);
        }
    }
    
    /**
     * Appends and returns a new empty "TraumaCenterServicesIndicator" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator addNewTraumaCenterServicesIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator)get_store().add_element_user(TRAUMACENTERSERVICESINDICATOR$30);
            return target;
        }
    }
    
    /**
     * Unsets the "TraumaCenterServicesIndicator" element
     */
    public void unsetTraumaCenterServicesIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRAUMACENTERSERVICESINDICATOR$30, 0);
        }
    }
    
    /**
     * Gets array of all "CommentText" elements
     */
    public java.lang.String[] getCommentTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENTTEXT$32, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CommentText" element
     */
    public java.lang.String getCommentTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "CommentText" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCommentTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMMENTTEXT$32, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CommentText" element
     */
    public org.apache.xmlbeans.XmlString xgetCommentTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "CommentText" element
     */
    public int sizeOfCommentTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENTTEXT$32);
        }
    }
    
    /**
     * Sets array of all "CommentText" element
     */
    public void setCommentTextArray(java.lang.String[] commentTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentTextArray, COMMENTTEXT$32);
        }
    }
    
    /**
     * Sets ith "CommentText" element
     */
    public void setCommentTextArray(int i, java.lang.String commentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(commentText);
        }
    }
    
    /**
     * Sets (as xml) array of all "CommentText" element
     */
    public void xsetCommentTextArray(org.apache.xmlbeans.XmlString[]commentTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentTextArray, COMMENTTEXT$32);
        }
    }
    
    /**
     * Sets (as xml) ith "CommentText" element
     */
    public void xsetCommentTextArray(int i, org.apache.xmlbeans.XmlString commentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(commentText);
        }
    }
    
    /**
     * Inserts the value as the ith "CommentText" element
     */
    public void insertCommentText(int i, java.lang.String commentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMMENTTEXT$32, i);
            target.setStringValue(commentText);
        }
    }
    
    /**
     * Appends the value as the last "CommentText" element
     */
    public void addCommentText(java.lang.String commentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTTEXT$32);
            target.setStringValue(commentText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CommentText" element
     */
    public org.apache.xmlbeans.XmlString insertNewCommentText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COMMENTTEXT$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CommentText" element
     */
    public org.apache.xmlbeans.XmlString addNewCommentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTTEXT$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "CommentText" element
     */
    public void removeCommentText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENTTEXT$32, i);
        }
    }
    /**
     * An XML CardiologyIndicator(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class CardiologyIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public CardiologyIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CARDIOLOGY$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Cardiology");
        private static final javax.xml.namespace.QName CARDIOLOGYSUBTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CardiologySubType");
        
        
        /**
         * Gets the "Cardiology" element
         */
        public boolean getCardiology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDIOLOGY$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Cardiology" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetCardiology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CARDIOLOGY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Cardiology" element
         */
        public boolean isSetCardiology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CARDIOLOGY$0) != 0;
            }
        }
        
        /**
         * Sets the "Cardiology" element
         */
        public void setCardiology(boolean cardiology)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDIOLOGY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDIOLOGY$0);
                }
                target.setBooleanValue(cardiology);
            }
        }
        
        /**
         * Sets (as xml) the "Cardiology" element
         */
        public void xsetCardiology(org.apache.xmlbeans.XmlBoolean cardiology)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CARDIOLOGY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CARDIOLOGY$0);
                }
                target.set(cardiology);
            }
        }
        
        /**
         * Unsets the "Cardiology" element
         */
        public void unsetCardiology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CARDIOLOGY$0, 0);
            }
        }
        
        /**
         * Gets the "CardiologySubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType getCardiologySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType)get_store().find_element_user(CARDIOLOGYSUBTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "CardiologySubType" element
         */
        public boolean isSetCardiologySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CARDIOLOGYSUBTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "CardiologySubType" element
         */
        public void setCardiologySubType(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType cardiologySubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType)get_store().find_element_user(CARDIOLOGYSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType)get_store().add_element_user(CARDIOLOGYSUBTYPE$2);
                }
                target.set(cardiologySubType);
            }
        }
        
        /**
         * Appends and returns a new empty "CardiologySubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType addNewCardiologySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType)get_store().add_element_user(CARDIOLOGYSUBTYPE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "CardiologySubType" element
         */
        public void unsetCardiologySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CARDIOLOGYSUBTYPE$2, 0);
            }
        }
        /**
         * An XML CardiologySubType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is a complex type.
         */
        public static class CardiologySubTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.CardiologyIndicator.CardiologySubType
        {
            private static final long serialVersionUID = 1L;
            
            public CardiologySubTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CARDIOLOGYINVASIVE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CardiologyInvasive");
            private static final javax.xml.namespace.QName CARDIOLOGYNONINVASIVE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CardiologyNonInvasive");
            
            
            /**
             * Gets the "CardiologyInvasive" element
             */
            public boolean getCardiologyInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDIOLOGYINVASIVE$0, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "CardiologyInvasive" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetCardiologyInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CARDIOLOGYINVASIVE$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "CardiologyInvasive" element
             */
            public boolean isSetCardiologyInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CARDIOLOGYINVASIVE$0) != 0;
                }
            }
            
            /**
             * Sets the "CardiologyInvasive" element
             */
            public void setCardiologyInvasive(boolean cardiologyInvasive)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDIOLOGYINVASIVE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDIOLOGYINVASIVE$0);
                    }
                    target.setBooleanValue(cardiologyInvasive);
                }
            }
            
            /**
             * Sets (as xml) the "CardiologyInvasive" element
             */
            public void xsetCardiologyInvasive(org.apache.xmlbeans.XmlBoolean cardiologyInvasive)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CARDIOLOGYINVASIVE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CARDIOLOGYINVASIVE$0);
                    }
                    target.set(cardiologyInvasive);
                }
            }
            
            /**
             * Unsets the "CardiologyInvasive" element
             */
            public void unsetCardiologyInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CARDIOLOGYINVASIVE$0, 0);
                }
            }
            
            /**
             * Gets the "CardiologyNonInvasive" element
             */
            public boolean getCardiologyNonInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDIOLOGYNONINVASIVE$2, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "CardiologyNonInvasive" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetCardiologyNonInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CARDIOLOGYNONINVASIVE$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "CardiologyNonInvasive" element
             */
            public boolean isSetCardiologyNonInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CARDIOLOGYNONINVASIVE$2) != 0;
                }
            }
            
            /**
             * Sets the "CardiologyNonInvasive" element
             */
            public void setCardiologyNonInvasive(boolean cardiologyNonInvasive)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDIOLOGYNONINVASIVE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDIOLOGYNONINVASIVE$2);
                    }
                    target.setBooleanValue(cardiologyNonInvasive);
                }
            }
            
            /**
             * Sets (as xml) the "CardiologyNonInvasive" element
             */
            public void xsetCardiologyNonInvasive(org.apache.xmlbeans.XmlBoolean cardiologyNonInvasive)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CARDIOLOGYNONINVASIVE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CARDIOLOGYNONINVASIVE$2);
                    }
                    target.set(cardiologyNonInvasive);
                }
            }
            
            /**
             * Unsets the "CardiologyNonInvasive" element
             */
            public void unsetCardiologyNonInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CARDIOLOGYNONINVASIVE$2, 0);
                }
            }
        }
    }
    /**
     * An XML NeurologyIndicator(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class NeurologyIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public NeurologyIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NEUROLOGY$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Neurology");
        private static final javax.xml.namespace.QName NEUROLOGYSUBTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "NeurologySubType");
        
        
        /**
         * Gets the "Neurology" element
         */
        public boolean getNeurology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUROLOGY$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Neurology" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetNeurology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NEUROLOGY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Neurology" element
         */
        public boolean isSetNeurology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NEUROLOGY$0) != 0;
            }
        }
        
        /**
         * Sets the "Neurology" element
         */
        public void setNeurology(boolean neurology)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUROLOGY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEUROLOGY$0);
                }
                target.setBooleanValue(neurology);
            }
        }
        
        /**
         * Sets (as xml) the "Neurology" element
         */
        public void xsetNeurology(org.apache.xmlbeans.XmlBoolean neurology)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NEUROLOGY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NEUROLOGY$0);
                }
                target.set(neurology);
            }
        }
        
        /**
         * Unsets the "Neurology" element
         */
        public void unsetNeurology()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NEUROLOGY$0, 0);
            }
        }
        
        /**
         * Gets the "NeurologySubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType getNeurologySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType)get_store().find_element_user(NEUROLOGYSUBTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "NeurologySubType" element
         */
        public boolean isSetNeurologySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NEUROLOGYSUBTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "NeurologySubType" element
         */
        public void setNeurologySubType(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType neurologySubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType)get_store().find_element_user(NEUROLOGYSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType)get_store().add_element_user(NEUROLOGYSUBTYPE$2);
                }
                target.set(neurologySubType);
            }
        }
        
        /**
         * Appends and returns a new empty "NeurologySubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType addNewNeurologySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType)get_store().add_element_user(NEUROLOGYSUBTYPE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "NeurologySubType" element
         */
        public void unsetNeurologySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NEUROLOGYSUBTYPE$2, 0);
            }
        }
        /**
         * An XML NeurologySubType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is a complex type.
         */
        public static class NeurologySubTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.NeurologyIndicator.NeurologySubType
        {
            private static final long serialVersionUID = 1L;
            
            public NeurologySubTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NEUROLOGYINVASIVE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "NeurologyInvasive");
            private static final javax.xml.namespace.QName NEUROLOGYNONINVASIVE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "NeurologyNonInvasive");
            
            
            /**
             * Gets the "NeurologyInvasive" element
             */
            public org.apache.xmlbeans.XmlObject getNeurologyInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlObject target = null;
                    target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NEUROLOGYINVASIVE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "NeurologyInvasive" element
             */
            public boolean isSetNeurologyInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NEUROLOGYINVASIVE$0) != 0;
                }
            }
            
            /**
             * Sets the "NeurologyInvasive" element
             */
            public void setNeurologyInvasive(org.apache.xmlbeans.XmlObject neurologyInvasive)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlObject target = null;
                    target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NEUROLOGYINVASIVE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NEUROLOGYINVASIVE$0);
                    }
                    target.set(neurologyInvasive);
                }
            }
            
            /**
             * Appends and returns a new empty "NeurologyInvasive" element
             */
            public org.apache.xmlbeans.XmlObject addNewNeurologyInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlObject target = null;
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NEUROLOGYINVASIVE$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "NeurologyInvasive" element
             */
            public void unsetNeurologyInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NEUROLOGYINVASIVE$0, 0);
                }
            }
            
            /**
             * Gets the "NeurologyNonInvasive" element
             */
            public org.apache.xmlbeans.XmlObject getNeurologyNonInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlObject target = null;
                    target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NEUROLOGYNONINVASIVE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "NeurologyNonInvasive" element
             */
            public boolean isSetNeurologyNonInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NEUROLOGYNONINVASIVE$2) != 0;
                }
            }
            
            /**
             * Sets the "NeurologyNonInvasive" element
             */
            public void setNeurologyNonInvasive(org.apache.xmlbeans.XmlObject neurologyNonInvasive)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlObject target = null;
                    target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NEUROLOGYNONINVASIVE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NEUROLOGYNONINVASIVE$2);
                    }
                    target.set(neurologyNonInvasive);
                }
            }
            
            /**
             * Appends and returns a new empty "NeurologyNonInvasive" element
             */
            public org.apache.xmlbeans.XmlObject addNewNeurologyNonInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlObject target = null;
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NEUROLOGYNONINVASIVE$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "NeurologyNonInvasive" element
             */
            public void unsetNeurologyNonInvasive()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NEUROLOGYNONINVASIVE$2, 0);
                }
            }
        }
    }
    /**
     * An XML OBGYNIndicator(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class OBGYNIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public OBGYNIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBGYN$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "OBGYN");
        private static final javax.xml.namespace.QName OBGYNSUBTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "OBGYNSubType");
        
        
        /**
         * Gets the "OBGYN" element
         */
        public boolean getOBGYN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBGYN$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "OBGYN" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetOBGYN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OBGYN$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "OBGYN" element
         */
        public boolean isSetOBGYN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBGYN$0) != 0;
            }
        }
        
        /**
         * Sets the "OBGYN" element
         */
        public void setOBGYN(boolean obgyn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBGYN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBGYN$0);
                }
                target.setBooleanValue(obgyn);
            }
        }
        
        /**
         * Sets (as xml) the "OBGYN" element
         */
        public void xsetOBGYN(org.apache.xmlbeans.XmlBoolean obgyn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OBGYN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OBGYN$0);
                }
                target.set(obgyn);
            }
        }
        
        /**
         * Unsets the "OBGYN" element
         */
        public void unsetOBGYN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBGYN$0, 0);
            }
        }
        
        /**
         * Gets the "OBGYNSubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType getOBGYNSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType)get_store().find_element_user(OBGYNSUBTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "OBGYNSubType" element
         */
        public boolean isSetOBGYNSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBGYNSUBTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "OBGYNSubType" element
         */
        public void setOBGYNSubType(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType obgynSubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType)get_store().find_element_user(OBGYNSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType)get_store().add_element_user(OBGYNSUBTYPE$2);
                }
                target.set(obgynSubType);
            }
        }
        
        /**
         * Appends and returns a new empty "OBGYNSubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType addNewOBGYNSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType)get_store().add_element_user(OBGYNSUBTYPE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "OBGYNSubType" element
         */
        public void unsetOBGYNSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBGYNSUBTYPE$2, 0);
            }
        }
        /**
         * An XML OBGYNSubType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is a complex type.
         */
        public static class OBGYNSubTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.OBGYNIndicator.OBGYNSubType
        {
            private static final long serialVersionUID = 1L;
            
            public OBGYNSubTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OBGYNWITHLABORDELIVERY$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "OBGYNWithLaborDelivery");
            private static final javax.xml.namespace.QName OBGYNWITHOUTLABORDELIVERY$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "OBGYNWithoutLaborDelivery");
            
            
            /**
             * Gets the "OBGYNWithLaborDelivery" element
             */
            public boolean getOBGYNWithLaborDelivery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBGYNWITHLABORDELIVERY$0, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "OBGYNWithLaborDelivery" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetOBGYNWithLaborDelivery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OBGYNWITHLABORDELIVERY$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "OBGYNWithLaborDelivery" element
             */
            public boolean isSetOBGYNWithLaborDelivery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OBGYNWITHLABORDELIVERY$0) != 0;
                }
            }
            
            /**
             * Sets the "OBGYNWithLaborDelivery" element
             */
            public void setOBGYNWithLaborDelivery(boolean obgynWithLaborDelivery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBGYNWITHLABORDELIVERY$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBGYNWITHLABORDELIVERY$0);
                    }
                    target.setBooleanValue(obgynWithLaborDelivery);
                }
            }
            
            /**
             * Sets (as xml) the "OBGYNWithLaborDelivery" element
             */
            public void xsetOBGYNWithLaborDelivery(org.apache.xmlbeans.XmlBoolean obgynWithLaborDelivery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OBGYNWITHLABORDELIVERY$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OBGYNWITHLABORDELIVERY$0);
                    }
                    target.set(obgynWithLaborDelivery);
                }
            }
            
            /**
             * Unsets the "OBGYNWithLaborDelivery" element
             */
            public void unsetOBGYNWithLaborDelivery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OBGYNWITHLABORDELIVERY$0, 0);
                }
            }
            
            /**
             * Gets the "OBGYNWithoutLaborDelivery" element
             */
            public boolean getOBGYNWithoutLaborDelivery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBGYNWITHOUTLABORDELIVERY$2, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "OBGYNWithoutLaborDelivery" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetOBGYNWithoutLaborDelivery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OBGYNWITHOUTLABORDELIVERY$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "OBGYNWithoutLaborDelivery" element
             */
            public boolean isSetOBGYNWithoutLaborDelivery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OBGYNWITHOUTLABORDELIVERY$2) != 0;
                }
            }
            
            /**
             * Sets the "OBGYNWithoutLaborDelivery" element
             */
            public void setOBGYNWithoutLaborDelivery(boolean obgynWithoutLaborDelivery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBGYNWITHOUTLABORDELIVERY$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBGYNWITHOUTLABORDELIVERY$2);
                    }
                    target.setBooleanValue(obgynWithoutLaborDelivery);
                }
            }
            
            /**
             * Sets (as xml) the "OBGYNWithoutLaborDelivery" element
             */
            public void xsetOBGYNWithoutLaborDelivery(org.apache.xmlbeans.XmlBoolean obgynWithoutLaborDelivery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OBGYNWITHOUTLABORDELIVERY$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OBGYNWITHOUTLABORDELIVERY$2);
                    }
                    target.set(obgynWithoutLaborDelivery);
                }
            }
            
            /**
             * Unsets the "OBGYNWithoutLaborDelivery" element
             */
            public void unsetOBGYNWithoutLaborDelivery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OBGYNWITHOUTLABORDELIVERY$2, 0);
                }
            }
        }
    }
    /**
     * An XML PsychiatricIndicator(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class PsychiatricIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public PsychiatricIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PSYCHIATRIC$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Psychiatric");
        private static final javax.xml.namespace.QName PSYCHIATRICSUBTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "PsychiatricSubType");
        
        
        /**
         * Gets the "Psychiatric" element
         */
        public boolean getPsychiatric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHIATRIC$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Psychiatric" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetPsychiatric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PSYCHIATRIC$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Psychiatric" element
         */
        public boolean isSetPsychiatric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PSYCHIATRIC$0) != 0;
            }
        }
        
        /**
         * Sets the "Psychiatric" element
         */
        public void setPsychiatric(boolean psychiatric)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHIATRIC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PSYCHIATRIC$0);
                }
                target.setBooleanValue(psychiatric);
            }
        }
        
        /**
         * Sets (as xml) the "Psychiatric" element
         */
        public void xsetPsychiatric(org.apache.xmlbeans.XmlBoolean psychiatric)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PSYCHIATRIC$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PSYCHIATRIC$0);
                }
                target.set(psychiatric);
            }
        }
        
        /**
         * Unsets the "Psychiatric" element
         */
        public void unsetPsychiatric()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PSYCHIATRIC$0, 0);
            }
        }
        
        /**
         * Gets the "PsychiatricSubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType getPsychiatricSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType)get_store().find_element_user(PSYCHIATRICSUBTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "PsychiatricSubType" element
         */
        public boolean isSetPsychiatricSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PSYCHIATRICSUBTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "PsychiatricSubType" element
         */
        public void setPsychiatricSubType(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType psychiatricSubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType)get_store().find_element_user(PSYCHIATRICSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType)get_store().add_element_user(PSYCHIATRICSUBTYPE$2);
                }
                target.set(psychiatricSubType);
            }
        }
        
        /**
         * Appends and returns a new empty "PsychiatricSubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType addNewPsychiatricSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType)get_store().add_element_user(PSYCHIATRICSUBTYPE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "PsychiatricSubType" element
         */
        public void unsetPsychiatricSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PSYCHIATRICSUBTYPE$2, 0);
            }
        }
        /**
         * An XML PsychiatricSubType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is a complex type.
         */
        public static class PsychiatricSubTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.PsychiatricIndicator.PsychiatricSubType
        {
            private static final long serialVersionUID = 1L;
            
            public PsychiatricSubTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PSYCHIATRICADULTGENERAL$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "PsychiatricAdultGeneral");
            private static final javax.xml.namespace.QName PSYCHIATRICPEDIATRIC$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "PsychiatricPediatric");
            
            
            /**
             * Gets the "PsychiatricAdultGeneral" element
             */
            public boolean getPsychiatricAdultGeneral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHIATRICADULTGENERAL$0, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "PsychiatricAdultGeneral" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetPsychiatricAdultGeneral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PSYCHIATRICADULTGENERAL$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "PsychiatricAdultGeneral" element
             */
            public boolean isSetPsychiatricAdultGeneral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PSYCHIATRICADULTGENERAL$0) != 0;
                }
            }
            
            /**
             * Sets the "PsychiatricAdultGeneral" element
             */
            public void setPsychiatricAdultGeneral(boolean psychiatricAdultGeneral)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHIATRICADULTGENERAL$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PSYCHIATRICADULTGENERAL$0);
                    }
                    target.setBooleanValue(psychiatricAdultGeneral);
                }
            }
            
            /**
             * Sets (as xml) the "PsychiatricAdultGeneral" element
             */
            public void xsetPsychiatricAdultGeneral(org.apache.xmlbeans.XmlBoolean psychiatricAdultGeneral)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PSYCHIATRICADULTGENERAL$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PSYCHIATRICADULTGENERAL$0);
                    }
                    target.set(psychiatricAdultGeneral);
                }
            }
            
            /**
             * Unsets the "PsychiatricAdultGeneral" element
             */
            public void unsetPsychiatricAdultGeneral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PSYCHIATRICADULTGENERAL$0, 0);
                }
            }
            
            /**
             * Gets the "PsychiatricPediatric" element
             */
            public boolean getPsychiatricPediatric()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHIATRICPEDIATRIC$2, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "PsychiatricPediatric" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetPsychiatricPediatric()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PSYCHIATRICPEDIATRIC$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "PsychiatricPediatric" element
             */
            public boolean isSetPsychiatricPediatric()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PSYCHIATRICPEDIATRIC$2) != 0;
                }
            }
            
            /**
             * Sets the "PsychiatricPediatric" element
             */
            public void setPsychiatricPediatric(boolean psychiatricPediatric)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PSYCHIATRICPEDIATRIC$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PSYCHIATRICPEDIATRIC$2);
                    }
                    target.setBooleanValue(psychiatricPediatric);
                }
            }
            
            /**
             * Sets (as xml) the "PsychiatricPediatric" element
             */
            public void xsetPsychiatricPediatric(org.apache.xmlbeans.XmlBoolean psychiatricPediatric)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PSYCHIATRICPEDIATRIC$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PSYCHIATRICPEDIATRIC$2);
                    }
                    target.set(psychiatricPediatric);
                }
            }
            
            /**
             * Unsets the "PsychiatricPediatric" element
             */
            public void unsetPsychiatricPediatric()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PSYCHIATRICPEDIATRIC$2, 0);
                }
            }
        }
    }
    /**
     * An XML SurgeryIndicator(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class SurgeryIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public SurgeryIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SURGERY$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Surgery");
        private static final javax.xml.namespace.QName SURGERYSUBTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "SurgerySubType");
        
        
        /**
         * Gets the "Surgery" element
         */
        public boolean getSurgery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURGERY$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Surgery" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetSurgery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SURGERY$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "Surgery" element
         */
        public boolean isSetSurgery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SURGERY$0) != 0;
            }
        }
        
        /**
         * Sets the "Surgery" element
         */
        public void setSurgery(boolean surgery)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURGERY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SURGERY$0);
                }
                target.setBooleanValue(surgery);
            }
        }
        
        /**
         * Sets (as xml) the "Surgery" element
         */
        public void xsetSurgery(org.apache.xmlbeans.XmlBoolean surgery)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SURGERY$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SURGERY$0);
                }
                target.set(surgery);
            }
        }
        
        /**
         * Unsets the "Surgery" element
         */
        public void unsetSurgery()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SURGERY$0, 0);
            }
        }
        
        /**
         * Gets the "SurgerySubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType getSurgerySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType)get_store().find_element_user(SURGERYSUBTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SurgerySubType" element
         */
        public boolean isSetSurgerySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SURGERYSUBTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "SurgerySubType" element
         */
        public void setSurgerySubType(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType surgerySubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType)get_store().find_element_user(SURGERYSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType)get_store().add_element_user(SURGERYSUBTYPE$2);
                }
                target.set(surgerySubType);
            }
        }
        
        /**
         * Appends and returns a new empty "SurgerySubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType addNewSurgerySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType)get_store().add_element_user(SURGERYSUBTYPE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "SurgerySubType" element
         */
        public void unsetSurgerySubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SURGERYSUBTYPE$2, 0);
            }
        }
        /**
         * An XML SurgerySubType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is a complex type.
         */
        public static class SurgerySubTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.SurgeryIndicator.SurgerySubType
        {
            private static final long serialVersionUID = 1L;
            
            public SurgerySubTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName GENERAL$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "General");
            private static final javax.xml.namespace.QName ADULTGENERALSURGERY$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "AdultGeneralSurgery");
            private static final javax.xml.namespace.QName PEDIATRICS$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Pediatrics");
            private static final javax.xml.namespace.QName ORTHOPEDICS$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Orthopedics");
            private static final javax.xml.namespace.QName NEUROSURGERY$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Neurosurgery");
            private static final javax.xml.namespace.QName FACIAL$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Facial");
            private static final javax.xml.namespace.QName CARDIOTHORACIC$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CardioThoracic");
            private static final javax.xml.namespace.QName HAND$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Hand");
            private static final javax.xml.namespace.QName REIMPLANTATION$16 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Reimplantation");
            private static final javax.xml.namespace.QName SPINAL$18 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Spinal");
            private static final javax.xml.namespace.QName VASCULAR$20 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Vascular");
            private static final javax.xml.namespace.QName ANESTHESIA$22 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Anesthesia");
            
            
            /**
             * Gets the "General" element
             */
            public boolean getGeneral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERAL$0, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "General" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetGeneral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GENERAL$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "General" element
             */
            public boolean isSetGeneral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GENERAL$0) != 0;
                }
            }
            
            /**
             * Sets the "General" element
             */
            public void setGeneral(boolean general)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERAL$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERAL$0);
                    }
                    target.setBooleanValue(general);
                }
            }
            
            /**
             * Sets (as xml) the "General" element
             */
            public void xsetGeneral(org.apache.xmlbeans.XmlBoolean general)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GENERAL$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(GENERAL$0);
                    }
                    target.set(general);
                }
            }
            
            /**
             * Unsets the "General" element
             */
            public void unsetGeneral()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GENERAL$0, 0);
                }
            }
            
            /**
             * Gets the "AdultGeneralSurgery" element
             */
            public boolean getAdultGeneralSurgery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADULTGENERALSURGERY$2, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "AdultGeneralSurgery" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetAdultGeneralSurgery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ADULTGENERALSURGERY$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "AdultGeneralSurgery" element
             */
            public boolean isSetAdultGeneralSurgery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ADULTGENERALSURGERY$2) != 0;
                }
            }
            
            /**
             * Sets the "AdultGeneralSurgery" element
             */
            public void setAdultGeneralSurgery(boolean adultGeneralSurgery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADULTGENERALSURGERY$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADULTGENERALSURGERY$2);
                    }
                    target.setBooleanValue(adultGeneralSurgery);
                }
            }
            
            /**
             * Sets (as xml) the "AdultGeneralSurgery" element
             */
            public void xsetAdultGeneralSurgery(org.apache.xmlbeans.XmlBoolean adultGeneralSurgery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ADULTGENERALSURGERY$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ADULTGENERALSURGERY$2);
                    }
                    target.set(adultGeneralSurgery);
                }
            }
            
            /**
             * Unsets the "AdultGeneralSurgery" element
             */
            public void unsetAdultGeneralSurgery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ADULTGENERALSURGERY$2, 0);
                }
            }
            
            /**
             * Gets the "Pediatrics" element
             */
            public boolean getPediatrics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PEDIATRICS$4, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Pediatrics" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetPediatrics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PEDIATRICS$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Pediatrics" element
             */
            public boolean isSetPediatrics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PEDIATRICS$4) != 0;
                }
            }
            
            /**
             * Sets the "Pediatrics" element
             */
            public void setPediatrics(boolean pediatrics)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PEDIATRICS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PEDIATRICS$4);
                    }
                    target.setBooleanValue(pediatrics);
                }
            }
            
            /**
             * Sets (as xml) the "Pediatrics" element
             */
            public void xsetPediatrics(org.apache.xmlbeans.XmlBoolean pediatrics)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PEDIATRICS$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PEDIATRICS$4);
                    }
                    target.set(pediatrics);
                }
            }
            
            /**
             * Unsets the "Pediatrics" element
             */
            public void unsetPediatrics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PEDIATRICS$4, 0);
                }
            }
            
            /**
             * Gets the "Orthopedics" element
             */
            public boolean getOrthopedics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORTHOPEDICS$6, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Orthopedics" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetOrthopedics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORTHOPEDICS$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Orthopedics" element
             */
            public boolean isSetOrthopedics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORTHOPEDICS$6) != 0;
                }
            }
            
            /**
             * Sets the "Orthopedics" element
             */
            public void setOrthopedics(boolean orthopedics)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORTHOPEDICS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORTHOPEDICS$6);
                    }
                    target.setBooleanValue(orthopedics);
                }
            }
            
            /**
             * Sets (as xml) the "Orthopedics" element
             */
            public void xsetOrthopedics(org.apache.xmlbeans.XmlBoolean orthopedics)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORTHOPEDICS$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORTHOPEDICS$6);
                    }
                    target.set(orthopedics);
                }
            }
            
            /**
             * Unsets the "Orthopedics" element
             */
            public void unsetOrthopedics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORTHOPEDICS$6, 0);
                }
            }
            
            /**
             * Gets the "Neurosurgery" element
             */
            public boolean getNeurosurgery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUROSURGERY$8, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Neurosurgery" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetNeurosurgery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NEUROSURGERY$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Neurosurgery" element
             */
            public boolean isSetNeurosurgery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NEUROSURGERY$8) != 0;
                }
            }
            
            /**
             * Sets the "Neurosurgery" element
             */
            public void setNeurosurgery(boolean neurosurgery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEUROSURGERY$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEUROSURGERY$8);
                    }
                    target.setBooleanValue(neurosurgery);
                }
            }
            
            /**
             * Sets (as xml) the "Neurosurgery" element
             */
            public void xsetNeurosurgery(org.apache.xmlbeans.XmlBoolean neurosurgery)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NEUROSURGERY$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NEUROSURGERY$8);
                    }
                    target.set(neurosurgery);
                }
            }
            
            /**
             * Unsets the "Neurosurgery" element
             */
            public void unsetNeurosurgery()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NEUROSURGERY$8, 0);
                }
            }
            
            /**
             * Gets the "Facial" element
             */
            public boolean getFacial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACIAL$10, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Facial" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetFacial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FACIAL$10, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Facial" element
             */
            public boolean isSetFacial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FACIAL$10) != 0;
                }
            }
            
            /**
             * Sets the "Facial" element
             */
            public void setFacial(boolean facial)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACIAL$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACIAL$10);
                    }
                    target.setBooleanValue(facial);
                }
            }
            
            /**
             * Sets (as xml) the "Facial" element
             */
            public void xsetFacial(org.apache.xmlbeans.XmlBoolean facial)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FACIAL$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FACIAL$10);
                    }
                    target.set(facial);
                }
            }
            
            /**
             * Unsets the "Facial" element
             */
            public void unsetFacial()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FACIAL$10, 0);
                }
            }
            
            /**
             * Gets the "CardioThoracic" element
             */
            public boolean getCardioThoracic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDIOTHORACIC$12, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "CardioThoracic" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetCardioThoracic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CARDIOTHORACIC$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "CardioThoracic" element
             */
            public boolean isSetCardioThoracic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CARDIOTHORACIC$12) != 0;
                }
            }
            
            /**
             * Sets the "CardioThoracic" element
             */
            public void setCardioThoracic(boolean cardioThoracic)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CARDIOTHORACIC$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CARDIOTHORACIC$12);
                    }
                    target.setBooleanValue(cardioThoracic);
                }
            }
            
            /**
             * Sets (as xml) the "CardioThoracic" element
             */
            public void xsetCardioThoracic(org.apache.xmlbeans.XmlBoolean cardioThoracic)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CARDIOTHORACIC$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CARDIOTHORACIC$12);
                    }
                    target.set(cardioThoracic);
                }
            }
            
            /**
             * Unsets the "CardioThoracic" element
             */
            public void unsetCardioThoracic()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CARDIOTHORACIC$12, 0);
                }
            }
            
            /**
             * Gets the "Hand" element
             */
            public boolean getHand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HAND$14, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Hand" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetHand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HAND$14, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Hand" element
             */
            public boolean isSetHand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(HAND$14) != 0;
                }
            }
            
            /**
             * Sets the "Hand" element
             */
            public void setHand(boolean hand)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HAND$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HAND$14);
                    }
                    target.setBooleanValue(hand);
                }
            }
            
            /**
             * Sets (as xml) the "Hand" element
             */
            public void xsetHand(org.apache.xmlbeans.XmlBoolean hand)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HAND$14, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HAND$14);
                    }
                    target.set(hand);
                }
            }
            
            /**
             * Unsets the "Hand" element
             */
            public void unsetHand()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(HAND$14, 0);
                }
            }
            
            /**
             * Gets the "Reimplantation" element
             */
            public boolean getReimplantation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REIMPLANTATION$16, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Reimplantation" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetReimplantation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REIMPLANTATION$16, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Reimplantation" element
             */
            public boolean isSetReimplantation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REIMPLANTATION$16) != 0;
                }
            }
            
            /**
             * Sets the "Reimplantation" element
             */
            public void setReimplantation(boolean reimplantation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REIMPLANTATION$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REIMPLANTATION$16);
                    }
                    target.setBooleanValue(reimplantation);
                }
            }
            
            /**
             * Sets (as xml) the "Reimplantation" element
             */
            public void xsetReimplantation(org.apache.xmlbeans.XmlBoolean reimplantation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REIMPLANTATION$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REIMPLANTATION$16);
                    }
                    target.set(reimplantation);
                }
            }
            
            /**
             * Unsets the "Reimplantation" element
             */
            public void unsetReimplantation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REIMPLANTATION$16, 0);
                }
            }
            
            /**
             * Gets the "Spinal" element
             */
            public boolean getSpinal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPINAL$18, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Spinal" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetSpinal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SPINAL$18, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Spinal" element
             */
            public boolean isSetSpinal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SPINAL$18) != 0;
                }
            }
            
            /**
             * Sets the "Spinal" element
             */
            public void setSpinal(boolean spinal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPINAL$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPINAL$18);
                    }
                    target.setBooleanValue(spinal);
                }
            }
            
            /**
             * Sets (as xml) the "Spinal" element
             */
            public void xsetSpinal(org.apache.xmlbeans.XmlBoolean spinal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SPINAL$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SPINAL$18);
                    }
                    target.set(spinal);
                }
            }
            
            /**
             * Unsets the "Spinal" element
             */
            public void unsetSpinal()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SPINAL$18, 0);
                }
            }
            
            /**
             * Gets the "Vascular" element
             */
            public boolean getVascular()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VASCULAR$20, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Vascular" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetVascular()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VASCULAR$20, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Vascular" element
             */
            public boolean isSetVascular()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(VASCULAR$20) != 0;
                }
            }
            
            /**
             * Sets the "Vascular" element
             */
            public void setVascular(boolean vascular)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VASCULAR$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VASCULAR$20);
                    }
                    target.setBooleanValue(vascular);
                }
            }
            
            /**
             * Sets (as xml) the "Vascular" element
             */
            public void xsetVascular(org.apache.xmlbeans.XmlBoolean vascular)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(VASCULAR$20, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(VASCULAR$20);
                    }
                    target.set(vascular);
                }
            }
            
            /**
             * Unsets the "Vascular" element
             */
            public void unsetVascular()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(VASCULAR$20, 0);
                }
            }
            
            /**
             * Gets the "Anesthesia" element
             */
            public boolean getAnesthesia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANESTHESIA$22, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "Anesthesia" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetAnesthesia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ANESTHESIA$22, 0);
                    return target;
                }
            }
            
            /**
             * True if has "Anesthesia" element
             */
            public boolean isSetAnesthesia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ANESTHESIA$22) != 0;
                }
            }
            
            /**
             * Sets the "Anesthesia" element
             */
            public void setAnesthesia(boolean anesthesia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANESTHESIA$22, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANESTHESIA$22);
                    }
                    target.setBooleanValue(anesthesia);
                }
            }
            
            /**
             * Sets (as xml) the "Anesthesia" element
             */
            public void xsetAnesthesia(org.apache.xmlbeans.XmlBoolean anesthesia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ANESTHESIA$22, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ANESTHESIA$22);
                    }
                    target.set(anesthesia);
                }
            }
            
            /**
             * Unsets the "Anesthesia" element
             */
            public void unsetAnesthesia()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ANESTHESIA$22, 0);
                }
            }
        }
    }
    /**
     * An XML TransportServicesIndicator(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class TransportServicesIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public TransportServicesIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TRANSPORTSERVICES$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TransportServices");
        private static final javax.xml.namespace.QName TRANSPORTSERVICESSUBTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TransportServicesSubType");
        
        
        /**
         * Gets the "TransportServices" element
         */
        public boolean getTransportServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTSERVICES$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "TransportServices" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetTransportServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRANSPORTSERVICES$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "TransportServices" element
         */
        public boolean isSetTransportServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSPORTSERVICES$0) != 0;
            }
        }
        
        /**
         * Sets the "TransportServices" element
         */
        public void setTransportServices(boolean transportServices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSPORTSERVICES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSPORTSERVICES$0);
                }
                target.setBooleanValue(transportServices);
            }
        }
        
        /**
         * Sets (as xml) the "TransportServices" element
         */
        public void xsetTransportServices(org.apache.xmlbeans.XmlBoolean transportServices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRANSPORTSERVICES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TRANSPORTSERVICES$0);
                }
                target.set(transportServices);
            }
        }
        
        /**
         * Unsets the "TransportServices" element
         */
        public void unsetTransportServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSPORTSERVICES$0, 0);
            }
        }
        
        /**
         * Gets the "TransportServicesSubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType getTransportServicesSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType)get_store().find_element_user(TRANSPORTSERVICESSUBTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "TransportServicesSubType" element
         */
        public boolean isSetTransportServicesSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRANSPORTSERVICESSUBTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "TransportServicesSubType" element
         */
        public void setTransportServicesSubType(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType transportServicesSubType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType)get_store().find_element_user(TRANSPORTSERVICESSUBTYPE$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType)get_store().add_element_user(TRANSPORTSERVICESSUBTYPE$2);
                }
                target.set(transportServicesSubType);
            }
        }
        
        /**
         * Appends and returns a new empty "TransportServicesSubType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType addNewTransportServicesSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType)get_store().add_element_user(TRANSPORTSERVICESSUBTYPE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "TransportServicesSubType" element
         */
        public void unsetTransportServicesSubType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRANSPORTSERVICESSUBTYPE$2, 0);
            }
        }
        /**
         * An XML TransportServicesSubType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is a complex type.
         */
        public static class TransportServicesSubTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TransportServicesIndicator.TransportServicesSubType
        {
            private static final long serialVersionUID = 1L;
            
            public TransportServicesSubTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName AMBULANCESERVICES$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "AmbulanceServices");
            private static final javax.xml.namespace.QName AIRTRANSPORTSERVICES$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "AirTransportServices");
            
            
            /**
             * Gets the "AmbulanceServices" element
             */
            public boolean getAmbulanceServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMBULANCESERVICES$0, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "AmbulanceServices" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetAmbulanceServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AMBULANCESERVICES$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "AmbulanceServices" element
             */
            public boolean isSetAmbulanceServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AMBULANCESERVICES$0) != 0;
                }
            }
            
            /**
             * Sets the "AmbulanceServices" element
             */
            public void setAmbulanceServices(boolean ambulanceServices)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AMBULANCESERVICES$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AMBULANCESERVICES$0);
                    }
                    target.setBooleanValue(ambulanceServices);
                }
            }
            
            /**
             * Sets (as xml) the "AmbulanceServices" element
             */
            public void xsetAmbulanceServices(org.apache.xmlbeans.XmlBoolean ambulanceServices)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AMBULANCESERVICES$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AMBULANCESERVICES$0);
                    }
                    target.set(ambulanceServices);
                }
            }
            
            /**
             * Unsets the "AmbulanceServices" element
             */
            public void unsetAmbulanceServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AMBULANCESERVICES$0, 0);
                }
            }
            
            /**
             * Gets the "AirTransportServices" element
             */
            public boolean getAirTransportServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRTRANSPORTSERVICES$2, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "AirTransportServices" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetAirTransportServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AIRTRANSPORTSERVICES$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "AirTransportServices" element
             */
            public boolean isSetAirTransportServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(AIRTRANSPORTSERVICES$2) != 0;
                }
            }
            
            /**
             * Sets the "AirTransportServices" element
             */
            public void setAirTransportServices(boolean airTransportServices)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRTRANSPORTSERVICES$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRTRANSPORTSERVICES$2);
                    }
                    target.setBooleanValue(airTransportServices);
                }
            }
            
            /**
             * Sets (as xml) the "AirTransportServices" element
             */
            public void xsetAirTransportServices(org.apache.xmlbeans.XmlBoolean airTransportServices)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AIRTRANSPORTSERVICES$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AIRTRANSPORTSERVICES$2);
                    }
                    target.set(airTransportServices);
                }
            }
            
            /**
             * Unsets the "AirTransportServices" element
             */
            public void unsetAirTransportServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(AIRTRANSPORTSERVICES$2, 0);
                }
            }
        }
    }
    /**
     * An XML TraumaCenterServicesIndicator(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class TraumaCenterServicesIndicatorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator
    {
        private static final long serialVersionUID = 1L;
        
        public TraumaCenterServicesIndicatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TRAUMACENTERSERVICES$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TraumaCenterServices");
        private static final javax.xml.namespace.QName TRAUMACENTERSERVICESLEVEL$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "TraumaCenterServicesLevel");
        
        
        /**
         * Gets the "TraumaCenterServices" element
         */
        public boolean getTraumaCenterServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAUMACENTERSERVICES$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "TraumaCenterServices" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetTraumaCenterServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRAUMACENTERSERVICES$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "TraumaCenterServices" element
         */
        public boolean isSetTraumaCenterServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRAUMACENTERSERVICES$0) != 0;
            }
        }
        
        /**
         * Sets the "TraumaCenterServices" element
         */
        public void setTraumaCenterServices(boolean traumaCenterServices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAUMACENTERSERVICES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAUMACENTERSERVICES$0);
                }
                target.setBooleanValue(traumaCenterServices);
            }
        }
        
        /**
         * Sets (as xml) the "TraumaCenterServices" element
         */
        public void xsetTraumaCenterServices(org.apache.xmlbeans.XmlBoolean traumaCenterServices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRAUMACENTERSERVICES$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TRAUMACENTERSERVICES$0);
                }
                target.set(traumaCenterServices);
            }
        }
        
        /**
         * Unsets the "TraumaCenterServices" element
         */
        public void unsetTraumaCenterServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRAUMACENTERSERVICES$0, 0);
            }
        }
        
        /**
         * Gets the "TraumaCenterServicesLevel" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel.Enum getTraumaCenterServicesLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAUMACENTERSERVICESLEVEL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "TraumaCenterServicesLevel" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel xgetTraumaCenterServicesLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel)get_store().find_element_user(TRAUMACENTERSERVICESLEVEL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "TraumaCenterServicesLevel" element
         */
        public boolean isSetTraumaCenterServicesLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRAUMACENTERSERVICESLEVEL$2) != 0;
            }
        }
        
        /**
         * Sets the "TraumaCenterServicesLevel" element
         */
        public void setTraumaCenterServicesLevel(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel.Enum traumaCenterServicesLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAUMACENTERSERVICESLEVEL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAUMACENTERSERVICESLEVEL$2);
                }
                target.setEnumValue(traumaCenterServicesLevel);
            }
        }
        
        /**
         * Sets (as xml) the "TraumaCenterServicesLevel" element
         */
        public void xsetTraumaCenterServicesLevel(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel traumaCenterServicesLevel)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel)get_store().find_element_user(TRAUMACENTERSERVICESLEVEL$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel)get_store().add_element_user(TRAUMACENTERSERVICESLEVEL$2);
                }
                target.set(traumaCenterServicesLevel);
            }
        }
        
        /**
         * Unsets the "TraumaCenterServicesLevel" element
         */
        public void unsetTraumaCenterServicesLevel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRAUMACENTERSERVICESLEVEL$2, 0);
            }
        }
        /**
         * An XML TraumaCenterServicesLevel(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus$TraumaCenterServicesIndicator$TraumaCenterServicesLevel.
         */
        public static class TraumaCenterServicesLevelImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus.TraumaCenterServicesIndicator.TraumaCenterServicesLevel
        {
            private static final long serialVersionUID = 1L;
            
            public TraumaCenterServicesLevelImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TraumaCenterServicesLevelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
