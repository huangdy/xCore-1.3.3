/*
 * XML Type:  CheckInInformationType
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.CheckInInformationType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * An XML CheckInInformationType(@http://uicds.org/ICSForm211).
 *
 * This is a complex type.
 */
public class CheckInInformationTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm211.CheckInInformationType
{
    private static final long serialVersionUID = 1L;
    
    public CheckInInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENCY$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Agency");
    private static final javax.xml.namespace.QName SINGLE$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Single");
    private static final javax.xml.namespace.QName KIND$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Kind");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Type");
    private static final javax.xml.namespace.QName IDNAME$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "IDName");
    private static final javax.xml.namespace.QName ORDERREQUESTNUMBER$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "OrderRequestNumber");
    private static final javax.xml.namespace.QName DATETIMECHECKIN$12 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "DateTimeCheckIn");
    private static final javax.xml.namespace.QName LEADERNAME$14 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "LeaderName");
    private static final javax.xml.namespace.QName TOTALNUMBERPERSONNEL$16 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "TotalNumberPersonnel");
    private static final javax.xml.namespace.QName MANIFEST$18 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Manifest");
    private static final javax.xml.namespace.QName CREWWEIGHT$20 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "CrewWeight");
    private static final javax.xml.namespace.QName HOMEBASE$22 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "HomeBase");
    private static final javax.xml.namespace.QName DEPARTUREPOINT$24 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "DeparturePoint");
    private static final javax.xml.namespace.QName METHODOFTRAVEL$26 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "MethodOfTravel");
    private static final javax.xml.namespace.QName INCIDENTASSIGNMENT$28 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "IncidentAssignment");
    private static final javax.xml.namespace.QName OTHERQUALIFICATIONS$30 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "OtherQualifications");
    private static final javax.xml.namespace.QName SENTTORESTAT$32 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "SentToRestat");
    
    
    /**
     * Gets the "Agency" element
     */
    public boolean getAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCY$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Agency" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAgency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AGENCY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Agency" element
     */
    public void setAgency(boolean agency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGENCY$0);
            }
            target.setBooleanValue(agency);
        }
    }
    
    /**
     * Sets (as xml) the "Agency" element
     */
    public void xsetAgency(org.apache.xmlbeans.XmlBoolean agency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AGENCY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AGENCY$0);
            }
            target.set(agency);
        }
    }
    
    /**
     * Gets the "Single" element
     */
    public boolean getSingle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Single" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetSingle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SINGLE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Single" element
     */
    public void setSingle(boolean single)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SINGLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SINGLE$2);
            }
            target.setBooleanValue(single);
        }
    }
    
    /**
     * Sets (as xml) the "Single" element
     */
    public void xsetSingle(org.apache.xmlbeans.XmlBoolean single)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SINGLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SINGLE$2);
            }
            target.set(single);
        }
    }
    
    /**
     * Gets the "Kind" element
     */
    public boolean getKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIND$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Kind" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetKind()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(KIND$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Kind" element
     */
    public void setKind(boolean kind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KIND$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KIND$4);
            }
            target.setBooleanValue(kind);
        }
    }
    
    /**
     * Sets (as xml) the "Kind" element
     */
    public void xsetKind(org.apache.xmlbeans.XmlBoolean kind)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(KIND$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(KIND$4);
            }
            target.set(kind);
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public boolean getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TYPE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(boolean type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$6);
            }
            target.setBooleanValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlBoolean type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TYPE$6);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "IDName" element
     */
    public java.lang.String getIDName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDNAME$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IDName" element
     */
    public org.apache.xmlbeans.XmlString xgetIDName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDNAME$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IDName" element
     */
    public void setIDName(java.lang.String idName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDNAME$8);
            }
            target.setStringValue(idName);
        }
    }
    
    /**
     * Sets (as xml) the "IDName" element
     */
    public void xsetIDName(org.apache.xmlbeans.XmlString idName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDNAME$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDNAME$8);
            }
            target.set(idName);
        }
    }
    
    /**
     * Gets the "OrderRequestNumber" element
     */
    public java.lang.String getOrderRequestNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERREQUESTNUMBER$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrderRequestNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetOrderRequestNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREQUESTNUMBER$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrderRequestNumber" element
     */
    public void setOrderRequestNumber(java.lang.String orderRequestNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORDERREQUESTNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORDERREQUESTNUMBER$10);
            }
            target.setStringValue(orderRequestNumber);
        }
    }
    
    /**
     * Sets (as xml) the "OrderRequestNumber" element
     */
    public void xsetOrderRequestNumber(org.apache.xmlbeans.XmlString orderRequestNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORDERREQUESTNUMBER$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORDERREQUESTNUMBER$10);
            }
            target.set(orderRequestNumber);
        }
    }
    
    /**
     * Gets the "DateTimeCheckIn" element
     */
    public java.util.Calendar getDateTimeCheckIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMECHECKIN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateTimeCheckIn" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateTimeCheckIn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMECHECKIN$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DateTimeCheckIn" element
     */
    public void setDateTimeCheckIn(java.util.Calendar dateTimeCheckIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMECHECKIN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIMECHECKIN$12);
            }
            target.setCalendarValue(dateTimeCheckIn);
        }
    }
    
    /**
     * Sets (as xml) the "DateTimeCheckIn" element
     */
    public void xsetDateTimeCheckIn(org.apache.xmlbeans.XmlDateTime dateTimeCheckIn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMECHECKIN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATETIMECHECKIN$12);
            }
            target.set(dateTimeCheckIn);
        }
    }
    
    /**
     * Gets the "LeaderName" element
     */
    public java.lang.String getLeaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEADERNAME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LeaderName" element
     */
    public org.apache.xmlbeans.XmlString xgetLeaderName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEADERNAME$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LeaderName" element
     */
    public void setLeaderName(java.lang.String leaderName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEADERNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEADERNAME$14);
            }
            target.setStringValue(leaderName);
        }
    }
    
    /**
     * Sets (as xml) the "LeaderName" element
     */
    public void xsetLeaderName(org.apache.xmlbeans.XmlString leaderName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEADERNAME$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEADERNAME$14);
            }
            target.set(leaderName);
        }
    }
    
    /**
     * Gets the "TotalNumberPersonnel" element
     */
    public java.math.BigInteger getTotalNumberPersonnel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALNUMBERPERSONNEL$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalNumberPersonnel" element
     */
    public org.apache.xmlbeans.XmlInteger xgetTotalNumberPersonnel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALNUMBERPERSONNEL$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TotalNumberPersonnel" element
     */
    public void setTotalNumberPersonnel(java.math.BigInteger totalNumberPersonnel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALNUMBERPERSONNEL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALNUMBERPERSONNEL$16);
            }
            target.setBigIntegerValue(totalNumberPersonnel);
        }
    }
    
    /**
     * Sets (as xml) the "TotalNumberPersonnel" element
     */
    public void xsetTotalNumberPersonnel(org.apache.xmlbeans.XmlInteger totalNumberPersonnel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(TOTALNUMBERPERSONNEL$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(TOTALNUMBERPERSONNEL$16);
            }
            target.set(totalNumberPersonnel);
        }
    }
    
    /**
     * Gets the "Manifest" element
     */
    public boolean getManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANIFEST$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Manifest" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MANIFEST$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Manifest" element
     */
    public void setManifest(boolean manifest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANIFEST$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANIFEST$18);
            }
            target.setBooleanValue(manifest);
        }
    }
    
    /**
     * Sets (as xml) the "Manifest" element
     */
    public void xsetManifest(org.apache.xmlbeans.XmlBoolean manifest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MANIFEST$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MANIFEST$18);
            }
            target.set(manifest);
        }
    }
    
    /**
     * Gets the "CrewWeight" element
     */
    public java.lang.String getCrewWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREWWEIGHT$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CrewWeight" element
     */
    public org.apache.xmlbeans.XmlString xgetCrewWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREWWEIGHT$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CrewWeight" element
     */
    public void setCrewWeight(java.lang.String crewWeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREWWEIGHT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREWWEIGHT$20);
            }
            target.setStringValue(crewWeight);
        }
    }
    
    /**
     * Sets (as xml) the "CrewWeight" element
     */
    public void xsetCrewWeight(org.apache.xmlbeans.XmlString crewWeight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREWWEIGHT$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREWWEIGHT$20);
            }
            target.set(crewWeight);
        }
    }
    
    /**
     * Gets the "HomeBase" element
     */
    public java.lang.String getHomeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEBASE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HomeBase" element
     */
    public org.apache.xmlbeans.XmlString xgetHomeBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEBASE$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HomeBase" element
     */
    public void setHomeBase(java.lang.String homeBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOMEBASE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOMEBASE$22);
            }
            target.setStringValue(homeBase);
        }
    }
    
    /**
     * Sets (as xml) the "HomeBase" element
     */
    public void xsetHomeBase(org.apache.xmlbeans.XmlString homeBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOMEBASE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOMEBASE$22);
            }
            target.set(homeBase);
        }
    }
    
    /**
     * Gets the "DeparturePoint" element
     */
    public java.lang.String getDeparturePoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTUREPOINT$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeparturePoint" element
     */
    public org.apache.xmlbeans.XmlString xgetDeparturePoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPARTUREPOINT$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DeparturePoint" element
     */
    public void setDeparturePoint(java.lang.String departurePoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPARTUREPOINT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPARTUREPOINT$24);
            }
            target.setStringValue(departurePoint);
        }
    }
    
    /**
     * Sets (as xml) the "DeparturePoint" element
     */
    public void xsetDeparturePoint(org.apache.xmlbeans.XmlString departurePoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPARTUREPOINT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPARTUREPOINT$24);
            }
            target.set(departurePoint);
        }
    }
    
    /**
     * Gets the "MethodOfTravel" element
     */
    public java.lang.String getMethodOfTravel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METHODOFTRAVEL$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MethodOfTravel" element
     */
    public org.apache.xmlbeans.XmlString xgetMethodOfTravel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METHODOFTRAVEL$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MethodOfTravel" element
     */
    public void setMethodOfTravel(java.lang.String methodOfTravel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METHODOFTRAVEL$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METHODOFTRAVEL$26);
            }
            target.setStringValue(methodOfTravel);
        }
    }
    
    /**
     * Sets (as xml) the "MethodOfTravel" element
     */
    public void xsetMethodOfTravel(org.apache.xmlbeans.XmlString methodOfTravel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METHODOFTRAVEL$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METHODOFTRAVEL$26);
            }
            target.set(methodOfTravel);
        }
    }
    
    /**
     * Gets the "IncidentAssignment" element
     */
    public java.lang.String getIncidentAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTASSIGNMENT$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentAssignment" element
     */
    public org.apache.xmlbeans.XmlString xgetIncidentAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTASSIGNMENT$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentAssignment" element
     */
    public void setIncidentAssignment(java.lang.String incidentAssignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTASSIGNMENT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTASSIGNMENT$28);
            }
            target.setStringValue(incidentAssignment);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentAssignment" element
     */
    public void xsetIncidentAssignment(org.apache.xmlbeans.XmlString incidentAssignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTASSIGNMENT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTASSIGNMENT$28);
            }
            target.set(incidentAssignment);
        }
    }
    
    /**
     * Gets the "OtherQualifications" element
     */
    public java.lang.String getOtherQualifications()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERQUALIFICATIONS$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OtherQualifications" element
     */
    public org.apache.xmlbeans.XmlString xgetOtherQualifications()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHERQUALIFICATIONS$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OtherQualifications" element
     */
    public void setOtherQualifications(java.lang.String otherQualifications)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERQUALIFICATIONS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHERQUALIFICATIONS$30);
            }
            target.setStringValue(otherQualifications);
        }
    }
    
    /**
     * Sets (as xml) the "OtherQualifications" element
     */
    public void xsetOtherQualifications(org.apache.xmlbeans.XmlString otherQualifications)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OTHERQUALIFICATIONS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OTHERQUALIFICATIONS$30);
            }
            target.set(otherQualifications);
        }
    }
    
    /**
     * Gets the "SentToRestat" element
     */
    public java.lang.String getSentToRestat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTORESTAT$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SentToRestat" element
     */
    public org.apache.xmlbeans.XmlString xgetSentToRestat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENTTORESTAT$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SentToRestat" element
     */
    public void setSentToRestat(java.lang.String sentToRestat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTORESTAT$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENTTORESTAT$32);
            }
            target.setStringValue(sentToRestat);
        }
    }
    
    /**
     * Sets (as xml) the "SentToRestat" element
     */
    public void xsetSentToRestat(org.apache.xmlbeans.XmlString sentToRestat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENTTORESTAT$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENTTORESTAT$32);
            }
            target.set(sentToRestat);
        }
    }
}
