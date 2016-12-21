/*
 * XML Type:  HospitalFacilityStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML HospitalFacilityStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public class HospitalFacilityStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus
{
    private static final long serialVersionUID = 1L;
    
    public HospitalFacilityStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSPITALEOCSTATUS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "HospitalEOCStatus");
    private static final javax.xml.namespace.QName HOSPITALEOCPLAN$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "HospitalEOCPlan");
    private static final javax.xml.namespace.QName CLINICALSTATUS$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "ClinicalStatus");
    private static final javax.xml.namespace.QName DECONCAPACITY$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "DeconCapacity");
    private static final javax.xml.namespace.QName MORGUECAPACITY$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "MorgueCapacity");
    private static final javax.xml.namespace.QName FACILITYSTATUS$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "FacilityStatus");
    private static final javax.xml.namespace.QName SECURITYSTATUS$12 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "SecurityStatus");
    private static final javax.xml.namespace.QName ACTIVITY24HR$14 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Activity24Hr");
    private static final javax.xml.namespace.QName COMMENTTEXT$16 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CommentText");
    
    
    /**
     * Gets the "HospitalEOCStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus.Enum getHospitalEOCStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSPITALEOCSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HospitalEOCStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus xgetHospitalEOCStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus)get_store().find_element_user(HOSPITALEOCSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "HospitalEOCStatus" element
     */
    public boolean isSetHospitalEOCStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOSPITALEOCSTATUS$0) != 0;
        }
    }
    
    /**
     * Sets the "HospitalEOCStatus" element
     */
    public void setHospitalEOCStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus.Enum hospitalEOCStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSPITALEOCSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOSPITALEOCSTATUS$0);
            }
            target.setEnumValue(hospitalEOCStatus);
        }
    }
    
    /**
     * Sets (as xml) the "HospitalEOCStatus" element
     */
    public void xsetHospitalEOCStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus hospitalEOCStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus)get_store().find_element_user(HOSPITALEOCSTATUS$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus)get_store().add_element_user(HOSPITALEOCSTATUS$0);
            }
            target.set(hospitalEOCStatus);
        }
    }
    
    /**
     * Unsets the "HospitalEOCStatus" element
     */
    public void unsetHospitalEOCStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOSPITALEOCSTATUS$0, 0);
        }
    }
    
    /**
     * Gets the "HospitalEOCPlan" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan.Enum getHospitalEOCPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSPITALEOCPLAN$2, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HospitalEOCPlan" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan xgetHospitalEOCPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan)get_store().find_element_user(HOSPITALEOCPLAN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "HospitalEOCPlan" element
     */
    public boolean isSetHospitalEOCPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOSPITALEOCPLAN$2) != 0;
        }
    }
    
    /**
     * Sets the "HospitalEOCPlan" element
     */
    public void setHospitalEOCPlan(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan.Enum hospitalEOCPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSPITALEOCPLAN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOSPITALEOCPLAN$2);
            }
            target.setEnumValue(hospitalEOCPlan);
        }
    }
    
    /**
     * Sets (as xml) the "HospitalEOCPlan" element
     */
    public void xsetHospitalEOCPlan(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan hospitalEOCPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan)get_store().find_element_user(HOSPITALEOCPLAN$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan)get_store().add_element_user(HOSPITALEOCPLAN$2);
            }
            target.set(hospitalEOCPlan);
        }
    }
    
    /**
     * Unsets the "HospitalEOCPlan" element
     */
    public void unsetHospitalEOCPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOSPITALEOCPLAN$2, 0);
        }
    }
    
    /**
     * Gets the "ClinicalStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus.Enum getClinicalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICALSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClinicalStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus xgetClinicalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus)get_store().find_element_user(CLINICALSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ClinicalStatus" element
     */
    public boolean isSetClinicalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalStatus" element
     */
    public void setClinicalStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus.Enum clinicalStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICALSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLINICALSTATUS$4);
            }
            target.setEnumValue(clinicalStatus);
        }
    }
    
    /**
     * Sets (as xml) the "ClinicalStatus" element
     */
    public void xsetClinicalStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus clinicalStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus)get_store().find_element_user(CLINICALSTATUS$4, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus)get_store().add_element_user(CLINICALSTATUS$4);
            }
            target.set(clinicalStatus);
        }
    }
    
    /**
     * Unsets the "ClinicalStatus" element
     */
    public void unsetClinicalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALSTATUS$4, 0);
        }
    }
    
    /**
     * Gets the "DeconCapacity" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity getDeconCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity)get_store().find_element_user(DECONCAPACITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DeconCapacity" element
     */
    public boolean isSetDeconCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DECONCAPACITY$6) != 0;
        }
    }
    
    /**
     * Sets the "DeconCapacity" element
     */
    public void setDeconCapacity(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity deconCapacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity)get_store().find_element_user(DECONCAPACITY$6, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity)get_store().add_element_user(DECONCAPACITY$6);
            }
            target.set(deconCapacity);
        }
    }
    
    /**
     * Appends and returns a new empty "DeconCapacity" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity addNewDeconCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity)get_store().add_element_user(DECONCAPACITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "DeconCapacity" element
     */
    public void unsetDeconCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DECONCAPACITY$6, 0);
        }
    }
    
    /**
     * Gets the "MorgueCapacity" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity getMorgueCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity)get_store().find_element_user(MORGUECAPACITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MorgueCapacity" element
     */
    public boolean isSetMorgueCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MORGUECAPACITY$8) != 0;
        }
    }
    
    /**
     * Sets the "MorgueCapacity" element
     */
    public void setMorgueCapacity(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity morgueCapacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity)get_store().find_element_user(MORGUECAPACITY$8, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity)get_store().add_element_user(MORGUECAPACITY$8);
            }
            target.set(morgueCapacity);
        }
    }
    
    /**
     * Appends and returns a new empty "MorgueCapacity" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity addNewMorgueCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity)get_store().add_element_user(MORGUECAPACITY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "MorgueCapacity" element
     */
    public void unsetMorgueCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MORGUECAPACITY$8, 0);
        }
    }
    
    /**
     * Gets the "FacilityStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus.Enum getFacilityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITYSTATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FacilityStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus xgetFacilityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus)get_store().find_element_user(FACILITYSTATUS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "FacilityStatus" element
     */
    public boolean isSetFacilityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FACILITYSTATUS$10) != 0;
        }
    }
    
    /**
     * Sets the "FacilityStatus" element
     */
    public void setFacilityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus.Enum facilityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITYSTATUS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACILITYSTATUS$10);
            }
            target.setEnumValue(facilityStatus);
        }
    }
    
    /**
     * Sets (as xml) the "FacilityStatus" element
     */
    public void xsetFacilityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus facilityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus)get_store().find_element_user(FACILITYSTATUS$10, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus)get_store().add_element_user(FACILITYSTATUS$10);
            }
            target.set(facilityStatus);
        }
    }
    
    /**
     * Unsets the "FacilityStatus" element
     */
    public void unsetFacilityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FACILITYSTATUS$10, 0);
        }
    }
    
    /**
     * Gets the "SecurityStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus.Enum getSecurityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYSTATUS$12, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SecurityStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus xgetSecurityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus)get_store().find_element_user(SECURITYSTATUS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "SecurityStatus" element
     */
    public boolean isSetSecurityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SECURITYSTATUS$12) != 0;
        }
    }
    
    /**
     * Sets the "SecurityStatus" element
     */
    public void setSecurityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus.Enum securityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECURITYSTATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECURITYSTATUS$12);
            }
            target.setEnumValue(securityStatus);
        }
    }
    
    /**
     * Sets (as xml) the "SecurityStatus" element
     */
    public void xsetSecurityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus securityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus)get_store().find_element_user(SECURITYSTATUS$12, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus)get_store().add_element_user(SECURITYSTATUS$12);
            }
            target.set(securityStatus);
        }
    }
    
    /**
     * Unsets the "SecurityStatus" element
     */
    public void unsetSecurityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SECURITYSTATUS$12, 0);
        }
    }
    
    /**
     * Gets the "Activity24Hr" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr getActivity24Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr)get_store().find_element_user(ACTIVITY24HR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Activity24Hr" element
     */
    public boolean isSetActivity24Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITY24HR$14) != 0;
        }
    }
    
    /**
     * Sets the "Activity24Hr" element
     */
    public void setActivity24Hr(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr activity24Hr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr)get_store().find_element_user(ACTIVITY24HR$14, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr)get_store().add_element_user(ACTIVITY24HR$14);
            }
            target.set(activity24Hr);
        }
    }
    
    /**
     * Appends and returns a new empty "Activity24Hr" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr addNewActivity24Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr)get_store().add_element_user(ACTIVITY24HR$14);
            return target;
        }
    }
    
    /**
     * Unsets the "Activity24Hr" element
     */
    public void unsetActivity24Hr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITY24HR$14, 0);
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
            get_store().find_all_element_users(COMMENTTEXT$16, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$16, i);
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
            get_store().find_all_element_users(COMMENTTEXT$16, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$16, i);
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
            return get_store().count_elements(COMMENTTEXT$16);
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
            arraySetterHelper(commentTextArray, COMMENTTEXT$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$16, i);
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
            arraySetterHelper(commentTextArray, COMMENTTEXT$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$16, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMMENTTEXT$16, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTTEXT$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COMMENTTEXT$16, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTTEXT$16);
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
            get_store().remove_element(COMMENTTEXT$16, i);
        }
    }
    /**
     * An XML HospitalEOCStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus$HospitalEOCStatus.
     */
    public static class HospitalEOCStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCStatus
    {
        private static final long serialVersionUID = 1L;
        
        public HospitalEOCStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected HospitalEOCStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML HospitalEOCPlan(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus$HospitalEOCPlan.
     */
    public static class HospitalEOCPlanImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.HospitalEOCPlan
    {
        private static final long serialVersionUID = 1L;
        
        public HospitalEOCPlanImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected HospitalEOCPlanImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML ClinicalStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus$ClinicalStatus.
     */
    public static class ClinicalStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.ClinicalStatus
    {
        private static final long serialVersionUID = 1L;
        
        public ClinicalStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ClinicalStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML DeconCapacity(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class DeconCapacityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity
    {
        private static final long serialVersionUID = 1L;
        
        public DeconCapacityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DECONCAPACITYSTATUS$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "DeconCapacityStatus");
        private static final javax.xml.namespace.QName AMBULATORYPATIENTSDECONCAPACITY$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "AmbulatoryPatientsDeconCapacity");
        private static final javax.xml.namespace.QName NONAMBULATORYPATIENTSDECONCAPACITY$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "NonAmbulatoryPatientsDeconCapacity");
        
        
        /**
         * Gets the "DeconCapacityStatus" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus.Enum getDeconCapacityStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECONCAPACITYSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "DeconCapacityStatus" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus xgetDeconCapacityStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus)get_store().find_element_user(DECONCAPACITYSTATUS$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "DeconCapacityStatus" element
         */
        public boolean isSetDeconCapacityStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DECONCAPACITYSTATUS$0) != 0;
            }
        }
        
        /**
         * Sets the "DeconCapacityStatus" element
         */
        public void setDeconCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus.Enum deconCapacityStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECONCAPACITYSTATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECONCAPACITYSTATUS$0);
                }
                target.setEnumValue(deconCapacityStatus);
            }
        }
        
        /**
         * Sets (as xml) the "DeconCapacityStatus" element
         */
        public void xsetDeconCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus deconCapacityStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus)get_store().find_element_user(DECONCAPACITYSTATUS$0, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus)get_store().add_element_user(DECONCAPACITYSTATUS$0);
                }
                target.set(deconCapacityStatus);
            }
        }
        
        /**
         * Unsets the "DeconCapacityStatus" element
         */
        public void unsetDeconCapacityStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DECONCAPACITYSTATUS$0, 0);
            }
        }
        
        /**
         * Gets the "AmbulatoryPatientsDeconCapacity" element
         */
        public org.apache.xmlbeans.XmlObject getAmbulatoryPatientsDeconCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(AMBULATORYPATIENTSDECONCAPACITY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "AmbulatoryPatientsDeconCapacity" element
         */
        public boolean isSetAmbulatoryPatientsDeconCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AMBULATORYPATIENTSDECONCAPACITY$2) != 0;
            }
        }
        
        /**
         * Sets the "AmbulatoryPatientsDeconCapacity" element
         */
        public void setAmbulatoryPatientsDeconCapacity(org.apache.xmlbeans.XmlObject ambulatoryPatientsDeconCapacity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(AMBULATORYPATIENTSDECONCAPACITY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(AMBULATORYPATIENTSDECONCAPACITY$2);
                }
                target.set(ambulatoryPatientsDeconCapacity);
            }
        }
        
        /**
         * Appends and returns a new empty "AmbulatoryPatientsDeconCapacity" element
         */
        public org.apache.xmlbeans.XmlObject addNewAmbulatoryPatientsDeconCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(AMBULATORYPATIENTSDECONCAPACITY$2);
                return target;
            }
        }
        
        /**
         * Unsets the "AmbulatoryPatientsDeconCapacity" element
         */
        public void unsetAmbulatoryPatientsDeconCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AMBULATORYPATIENTSDECONCAPACITY$2, 0);
            }
        }
        
        /**
         * Gets the "NonAmbulatoryPatientsDeconCapacity" element
         */
        public org.apache.xmlbeans.XmlObject getNonAmbulatoryPatientsDeconCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NONAMBULATORYPATIENTSDECONCAPACITY$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "NonAmbulatoryPatientsDeconCapacity" element
         */
        public boolean isSetNonAmbulatoryPatientsDeconCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NONAMBULATORYPATIENTSDECONCAPACITY$4) != 0;
            }
        }
        
        /**
         * Sets the "NonAmbulatoryPatientsDeconCapacity" element
         */
        public void setNonAmbulatoryPatientsDeconCapacity(org.apache.xmlbeans.XmlObject nonAmbulatoryPatientsDeconCapacity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NONAMBULATORYPATIENTSDECONCAPACITY$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NONAMBULATORYPATIENTSDECONCAPACITY$4);
                }
                target.set(nonAmbulatoryPatientsDeconCapacity);
            }
        }
        
        /**
         * Appends and returns a new empty "NonAmbulatoryPatientsDeconCapacity" element
         */
        public org.apache.xmlbeans.XmlObject addNewNonAmbulatoryPatientsDeconCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NONAMBULATORYPATIENTSDECONCAPACITY$4);
                return target;
            }
        }
        
        /**
         * Unsets the "NonAmbulatoryPatientsDeconCapacity" element
         */
        public void unsetNonAmbulatoryPatientsDeconCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NONAMBULATORYPATIENTSDECONCAPACITY$4, 0);
            }
        }
        /**
         * An XML DeconCapacityStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus$DeconCapacity$DeconCapacityStatus.
         */
        public static class DeconCapacityStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.DeconCapacity.DeconCapacityStatus
        {
            private static final long serialVersionUID = 1L;
            
            public DeconCapacityStatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected DeconCapacityStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML MorgueCapacity(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class MorgueCapacityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity
    {
        private static final long serialVersionUID = 1L;
        
        public MorgueCapacityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MORGUECAPACITYSTATUS$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "MorgueCapacityStatus");
        private static final javax.xml.namespace.QName MORGUECAPACITYUNITS$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "MorgueCapacityUnits");
        
        
        /**
         * Gets the "MorgueCapacityStatus" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus.Enum getMorgueCapacityStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORGUECAPACITYSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "MorgueCapacityStatus" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus xgetMorgueCapacityStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus)get_store().find_element_user(MORGUECAPACITYSTATUS$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "MorgueCapacityStatus" element
         */
        public boolean isSetMorgueCapacityStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MORGUECAPACITYSTATUS$0) != 0;
            }
        }
        
        /**
         * Sets the "MorgueCapacityStatus" element
         */
        public void setMorgueCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus.Enum morgueCapacityStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORGUECAPACITYSTATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MORGUECAPACITYSTATUS$0);
                }
                target.setEnumValue(morgueCapacityStatus);
            }
        }
        
        /**
         * Sets (as xml) the "MorgueCapacityStatus" element
         */
        public void xsetMorgueCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus morgueCapacityStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus)get_store().find_element_user(MORGUECAPACITYSTATUS$0, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus)get_store().add_element_user(MORGUECAPACITYSTATUS$0);
                }
                target.set(morgueCapacityStatus);
            }
        }
        
        /**
         * Unsets the "MorgueCapacityStatus" element
         */
        public void unsetMorgueCapacityStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MORGUECAPACITYSTATUS$0, 0);
            }
        }
        
        /**
         * Gets the "MorgueCapacityUnits" element
         */
        public java.math.BigInteger getMorgueCapacityUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORGUECAPACITYUNITS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "MorgueCapacityUnits" element
         */
        public org.apache.xmlbeans.XmlInteger xgetMorgueCapacityUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MORGUECAPACITYUNITS$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "MorgueCapacityUnits" element
         */
        public boolean isSetMorgueCapacityUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MORGUECAPACITYUNITS$2) != 0;
            }
        }
        
        /**
         * Sets the "MorgueCapacityUnits" element
         */
        public void setMorgueCapacityUnits(java.math.BigInteger morgueCapacityUnits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MORGUECAPACITYUNITS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MORGUECAPACITYUNITS$2);
                }
                target.setBigIntegerValue(morgueCapacityUnits);
            }
        }
        
        /**
         * Sets (as xml) the "MorgueCapacityUnits" element
         */
        public void xsetMorgueCapacityUnits(org.apache.xmlbeans.XmlInteger morgueCapacityUnits)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInteger target = null;
                target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(MORGUECAPACITYUNITS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(MORGUECAPACITYUNITS$2);
                }
                target.set(morgueCapacityUnits);
            }
        }
        
        /**
         * Unsets the "MorgueCapacityUnits" element
         */
        public void unsetMorgueCapacityUnits()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MORGUECAPACITYUNITS$2, 0);
            }
        }
        /**
         * An XML MorgueCapacityStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus$MorgueCapacity$MorgueCapacityStatus.
         */
        public static class MorgueCapacityStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.MorgueCapacity.MorgueCapacityStatus
        {
            private static final long serialVersionUID = 1L;
            
            public MorgueCapacityStatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MorgueCapacityStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML FacilityStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus$FacilityStatus.
     */
    public static class FacilityStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.FacilityStatus
    {
        private static final long serialVersionUID = 1L;
        
        public FacilityStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FacilityStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML SecurityStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus$SecurityStatus.
     */
    public static class SecurityStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.SecurityStatus
    {
        private static final long serialVersionUID = 1L;
        
        public SecurityStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SecurityStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML Activity24Hr(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class Activity24HrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus.Activity24Hr
    {
        private static final long serialVersionUID = 1L;
        
        public Activity24HrImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ADMISSIONS$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Admissions");
        private static final javax.xml.namespace.QName DISCHARGES$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Discharges");
        private static final javax.xml.namespace.QName DEATHS$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Deaths");
        
        
        /**
         * Gets the "Admissions" element
         */
        public org.apache.xmlbeans.XmlObject getAdmissions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADMISSIONS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Admissions" element
         */
        public boolean isSetAdmissions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ADMISSIONS$0) != 0;
            }
        }
        
        /**
         * Sets the "Admissions" element
         */
        public void setAdmissions(org.apache.xmlbeans.XmlObject admissions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADMISSIONS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ADMISSIONS$0);
                }
                target.set(admissions);
            }
        }
        
        /**
         * Appends and returns a new empty "Admissions" element
         */
        public org.apache.xmlbeans.XmlObject addNewAdmissions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ADMISSIONS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Admissions" element
         */
        public void unsetAdmissions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ADMISSIONS$0, 0);
            }
        }
        
        /**
         * Gets the "Discharges" element
         */
        public org.apache.xmlbeans.XmlObject getDischarges()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DISCHARGES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Discharges" element
         */
        public boolean isSetDischarges()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISCHARGES$2) != 0;
            }
        }
        
        /**
         * Sets the "Discharges" element
         */
        public void setDischarges(org.apache.xmlbeans.XmlObject discharges)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DISCHARGES$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DISCHARGES$2);
                }
                target.set(discharges);
            }
        }
        
        /**
         * Appends and returns a new empty "Discharges" element
         */
        public org.apache.xmlbeans.XmlObject addNewDischarges()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DISCHARGES$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Discharges" element
         */
        public void unsetDischarges()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISCHARGES$2, 0);
            }
        }
        
        /**
         * Gets the "Deaths" element
         */
        public org.apache.xmlbeans.XmlObject getDeaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DEATHS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Deaths" element
         */
        public boolean isSetDeaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DEATHS$4) != 0;
            }
        }
        
        /**
         * Sets the "Deaths" element
         */
        public void setDeaths(org.apache.xmlbeans.XmlObject deaths)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DEATHS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DEATHS$4);
                }
                target.set(deaths);
            }
        }
        
        /**
         * Appends and returns a new empty "Deaths" element
         */
        public org.apache.xmlbeans.XmlObject addNewDeaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DEATHS$4);
                return target;
            }
        }
        
        /**
         * Unsets the "Deaths" element
         */
        public void unsetDeaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DEATHS$4, 0);
            }
        }
    }
}
