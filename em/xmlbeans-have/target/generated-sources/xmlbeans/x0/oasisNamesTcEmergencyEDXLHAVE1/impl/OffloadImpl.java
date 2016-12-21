/*
 * XML Type:  Offload
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.Offload
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML Offload(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public class OffloadImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.Offload
{
    private static final long serialVersionUID = 1L;
    
    public OffloadImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMSOFFLOADSTATUS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EMSOffloadStatus");
    private static final javax.xml.namespace.QName EMSOFFLOADMINUTES$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EMSOffloadMinutes");
    
    
    /**
     * Gets the "EMSOffloadStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus.Enum getEMSOffloadStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMSOFFLOADSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EMSOffloadStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus xgetEMSOffloadStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus)get_store().find_element_user(EMSOFFLOADSTATUS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "EMSOffloadStatus" element
     */
    public boolean isSetEMSOffloadStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMSOFFLOADSTATUS$0) != 0;
        }
    }
    
    /**
     * Sets the "EMSOffloadStatus" element
     */
    public void setEMSOffloadStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus.Enum emsOffloadStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMSOFFLOADSTATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMSOFFLOADSTATUS$0);
            }
            target.setEnumValue(emsOffloadStatus);
        }
    }
    
    /**
     * Sets (as xml) the "EMSOffloadStatus" element
     */
    public void xsetEMSOffloadStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus emsOffloadStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus)get_store().find_element_user(EMSOFFLOADSTATUS$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus)get_store().add_element_user(EMSOFFLOADSTATUS$0);
            }
            target.set(emsOffloadStatus);
        }
    }
    
    /**
     * Unsets the "EMSOffloadStatus" element
     */
    public void unsetEMSOffloadStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMSOFFLOADSTATUS$0, 0);
        }
    }
    
    /**
     * Gets the "EMSOffloadMinutes" element
     */
    public java.math.BigInteger getEMSOffloadMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMSOFFLOADMINUTES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "EMSOffloadMinutes" element
     */
    public org.apache.xmlbeans.XmlInteger xgetEMSOffloadMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EMSOFFLOADMINUTES$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "EMSOffloadMinutes" element
     */
    public boolean isSetEMSOffloadMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMSOFFLOADMINUTES$2) != 0;
        }
    }
    
    /**
     * Sets the "EMSOffloadMinutes" element
     */
    public void setEMSOffloadMinutes(java.math.BigInteger emsOffloadMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMSOFFLOADMINUTES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMSOFFLOADMINUTES$2);
            }
            target.setBigIntegerValue(emsOffloadMinutes);
        }
    }
    
    /**
     * Sets (as xml) the "EMSOffloadMinutes" element
     */
    public void xsetEMSOffloadMinutes(org.apache.xmlbeans.XmlInteger emsOffloadMinutes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(EMSOFFLOADMINUTES$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(EMSOFFLOADMINUTES$2);
            }
            target.set(emsOffloadMinutes);
        }
    }
    
    /**
     * Unsets the "EMSOffloadMinutes" element
     */
    public void unsetEMSOffloadMinutes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMSOFFLOADMINUTES$2, 0);
        }
    }
    /**
     * An XML EMSOffloadStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.Offload$EMSOffloadStatus.
     */
    public static class EMSOffloadStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.Offload.EMSOffloadStatus
    {
        private static final long serialVersionUID = 1L;
        
        public EMSOffloadStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected EMSOffloadStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
