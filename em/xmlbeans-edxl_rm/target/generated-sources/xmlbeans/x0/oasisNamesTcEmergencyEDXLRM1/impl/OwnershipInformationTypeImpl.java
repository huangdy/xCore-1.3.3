/*
 * XML Type:  OwnershipInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML OwnershipInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class OwnershipInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType
{
    private static final long serialVersionUID = 1L;
    
    public OwnershipInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNER$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "Owner");
    private static final javax.xml.namespace.QName OWNINGJURISDICTION$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "OwningJurisdiction");
    private static final javax.xml.namespace.QName HOMEDISPATCH$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "HomeDispatch");
    private static final javax.xml.namespace.QName HOMEUNIT$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "HomeUnit");
    
    
    /**
     * Gets the "Owner" element
     */
    public java.lang.String getOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Owner" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.OwnerType xgetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.OwnerType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.OwnerType)get_store().find_element_user(OWNER$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Owner" element
     */
    public boolean isSetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNER$0) != 0;
        }
    }
    
    /**
     * Sets the "Owner" element
     */
    public void setOwner(java.lang.String owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNER$0);
            }
            target.setStringValue(owner);
        }
    }
    
    /**
     * Sets (as xml) the "Owner" element
     */
    public void xsetOwner(x0.oasisNamesTcEmergencyEDXLRM1.OwnerType owner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.OwnerType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.OwnerType)get_store().find_element_user(OWNER$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.OwnerType)get_store().add_element_user(OWNER$0);
            }
            target.set(owner);
        }
    }
    
    /**
     * Unsets the "Owner" element
     */
    public void unsetOwner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNER$0, 0);
        }
    }
    
    /**
     * Gets the "OwningJurisdiction" element
     */
    public java.lang.String getOwningJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNINGJURISDICTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OwningJurisdiction" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.OwningJurisdictionType xgetOwningJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.OwningJurisdictionType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.OwningJurisdictionType)get_store().find_element_user(OWNINGJURISDICTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "OwningJurisdiction" element
     */
    public boolean isSetOwningJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OWNINGJURISDICTION$2) != 0;
        }
    }
    
    /**
     * Sets the "OwningJurisdiction" element
     */
    public void setOwningJurisdiction(java.lang.String owningJurisdiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OWNINGJURISDICTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OWNINGJURISDICTION$2);
            }
            target.setStringValue(owningJurisdiction);
        }
    }
    
    /**
     * Sets (as xml) the "OwningJurisdiction" element
     */
    public void xsetOwningJurisdiction(x0.oasisNamesTcEmergencyEDXLRM1.OwningJurisdictionType owningJurisdiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.OwningJurisdictionType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.OwningJurisdictionType)get_store().find_element_user(OWNINGJURISDICTION$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.OwningJurisdictionType)get_store().add_element_user(OWNINGJURISDICTION$2);
            }
            target.set(owningJurisdiction);
        }
    }
    
    /**
     * Unsets the "OwningJurisdiction" element
     */
    public void unsetOwningJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OWNINGJURISDICTION$2, 0);
        }
    }
    
    /**
     * Gets the "HomeDispatch" element
     */
    public java.lang.String getHomeDispatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEDISPATCH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HomeDispatch" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.HomeDispatchType xgetHomeDispatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.HomeDispatchType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.HomeDispatchType)get_store().find_element_user(HOMEDISPATCH$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "HomeDispatch" element
     */
    public boolean isSetHomeDispatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOMEDISPATCH$4) != 0;
        }
    }
    
    /**
     * Sets the "HomeDispatch" element
     */
    public void setHomeDispatch(java.lang.String homeDispatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEDISPATCH$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOMEDISPATCH$4);
            }
            target.setStringValue(homeDispatch);
        }
    }
    
    /**
     * Sets (as xml) the "HomeDispatch" element
     */
    public void xsetHomeDispatch(x0.oasisNamesTcEmergencyEDXLRM1.HomeDispatchType homeDispatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.HomeDispatchType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.HomeDispatchType)get_store().find_element_user(HOMEDISPATCH$4, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.HomeDispatchType)get_store().add_element_user(HOMEDISPATCH$4);
            }
            target.set(homeDispatch);
        }
    }
    
    /**
     * Unsets the "HomeDispatch" element
     */
    public void unsetHomeDispatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOMEDISPATCH$4, 0);
        }
    }
    
    /**
     * Gets the "HomeUnit" element
     */
    public java.lang.String getHomeUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEUNIT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HomeUnit" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.HomeUnitType xgetHomeUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.HomeUnitType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.HomeUnitType)get_store().find_element_user(HOMEUNIT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "HomeUnit" element
     */
    public boolean isSetHomeUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOMEUNIT$6) != 0;
        }
    }
    
    /**
     * Sets the "HomeUnit" element
     */
    public void setHomeUnit(java.lang.String homeUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEUNIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOMEUNIT$6);
            }
            target.setStringValue(homeUnit);
        }
    }
    
    /**
     * Sets (as xml) the "HomeUnit" element
     */
    public void xsetHomeUnit(x0.oasisNamesTcEmergencyEDXLRM1.HomeUnitType homeUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.HomeUnitType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.HomeUnitType)get_store().find_element_user(HOMEUNIT$6, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.HomeUnitType)get_store().add_element_user(HOMEUNIT$6);
            }
            target.set(homeUnit);
        }
    }
    
    /**
     * Unsets the "HomeUnit" element
     */
    public void unsetHomeUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOMEUNIT$6, 0);
        }
    }
}
