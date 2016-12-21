/*
 * XML Type:  HospitalsType
 * Namespace: http://uicds.org/ICSForm206
 * Java type: org.uicds.icsForm206.HospitalsType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm206.impl;
/**
 * An XML HospitalsType(@http://uicds.org/ICSForm206).
 *
 * This is a complex type.
 */
public class HospitalsTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm206.HospitalsType
{
    private static final long serialVersionUID = 1L;
    
    public HospitalsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "Name");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "Address");
    private static final javax.xml.namespace.QName TRAVELTIMEAIR$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "TravelTimeAir");
    private static final javax.xml.namespace.QName TRAVELTIMEGROUND$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "TravelTimeGround");
    private static final javax.xml.namespace.QName PHONE$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "Phone");
    private static final javax.xml.namespace.QName HELIPAD$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "Helipad");
    private static final javax.xml.namespace.QName BURNCENTER$12 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "BurnCenter");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Address" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$2);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "Address" element
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$2);
            }
            target.set(address);
        }
    }
    
    /**
     * Gets the "TravelTimeAir" element
     */
    public java.util.Calendar getTravelTimeAir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAVELTIMEAIR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "TravelTimeAir" element
     */
    public org.apache.xmlbeans.XmlTime xgetTravelTimeAir()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TRAVELTIMEAIR$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TravelTimeAir" element
     */
    public void setTravelTimeAir(java.util.Calendar travelTimeAir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAVELTIMEAIR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAVELTIMEAIR$4);
            }
            target.setCalendarValue(travelTimeAir);
        }
    }
    
    /**
     * Sets (as xml) the "TravelTimeAir" element
     */
    public void xsetTravelTimeAir(org.apache.xmlbeans.XmlTime travelTimeAir)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TRAVELTIMEAIR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(TRAVELTIMEAIR$4);
            }
            target.set(travelTimeAir);
        }
    }
    
    /**
     * Gets the "TravelTimeGround" element
     */
    public java.util.Calendar getTravelTimeGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAVELTIMEGROUND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "TravelTimeGround" element
     */
    public org.apache.xmlbeans.XmlTime xgetTravelTimeGround()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TRAVELTIMEGROUND$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TravelTimeGround" element
     */
    public void setTravelTimeGround(java.util.Calendar travelTimeGround)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAVELTIMEGROUND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAVELTIMEGROUND$6);
            }
            target.setCalendarValue(travelTimeGround);
        }
    }
    
    /**
     * Sets (as xml) the "TravelTimeGround" element
     */
    public void xsetTravelTimeGround(org.apache.xmlbeans.XmlTime travelTimeGround)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TRAVELTIMEGROUND$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(TRAVELTIMEGROUND$6);
            }
            target.set(travelTimeGround);
        }
    }
    
    /**
     * Gets the "Phone" element
     */
    public java.lang.String getPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Phone" element
     */
    public org.apache.xmlbeans.XmlString xgetPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Phone" element
     */
    public void setPhone(java.lang.String phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$8);
            }
            target.setStringValue(phone);
        }
    }
    
    /**
     * Sets (as xml) the "Phone" element
     */
    public void xsetPhone(org.apache.xmlbeans.XmlString phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$8);
            }
            target.set(phone);
        }
    }
    
    /**
     * Gets the "Helipad" element
     */
    public boolean getHelipad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELIPAD$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Helipad" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHelipad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HELIPAD$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Helipad" element
     */
    public void setHelipad(boolean helipad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELIPAD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HELIPAD$10);
            }
            target.setBooleanValue(helipad);
        }
    }
    
    /**
     * Sets (as xml) the "Helipad" element
     */
    public void xsetHelipad(org.apache.xmlbeans.XmlBoolean helipad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HELIPAD$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HELIPAD$10);
            }
            target.set(helipad);
        }
    }
    
    /**
     * Gets the "BurnCenter" element
     */
    public boolean getBurnCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BURNCENTER$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "BurnCenter" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBurnCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BURNCENTER$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BurnCenter" element
     */
    public void setBurnCenter(boolean burnCenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BURNCENTER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BURNCENTER$12);
            }
            target.setBooleanValue(burnCenter);
        }
    }
    
    /**
     * Sets (as xml) the "BurnCenter" element
     */
    public void xsetBurnCenter(org.apache.xmlbeans.XmlBoolean burnCenter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BURNCENTER$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BURNCENTER$12);
            }
            target.set(burnCenter);
        }
    }
}
