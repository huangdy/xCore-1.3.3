/*
 * XML Type:  ResourceAssignmentType
 * Namespace: http://uicds.org/ICSForm204
 * Java type: org.uicds.icsForm204.ResourceAssignmentType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm204.impl;
/**
 * An XML ResourceAssignmentType(@http://uicds.org/ICSForm204).
 *
 * This is a complex type.
 */
public class ResourceAssignmentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm204.ResourceAssignmentType
{
    private static final long serialVersionUID = 1L;
    
    public ResourceAssignmentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEDESIGNATOR$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm204", "ResourceDesignator");
    private static final javax.xml.namespace.QName EMT$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm204", "EMT");
    private static final javax.xml.namespace.QName LEADER$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm204", "Leader");
    private static final javax.xml.namespace.QName NUMBERPERSONS$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm204", "NumberPersons");
    private static final javax.xml.namespace.QName TRANSNEEDED$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm204", "TransNeeded");
    private static final javax.xml.namespace.QName PICKUPPTTIME$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm204", "PickupPtTime");
    private static final javax.xml.namespace.QName DROPOFFPTTIME$12 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm204", "DropOffPtTime");
    
    
    /**
     * Gets the "ResourceDesignator" element
     */
    public java.lang.String getResourceDesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEDESIGNATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourceDesignator" element
     */
    public org.apache.xmlbeans.XmlString xgetResourceDesignator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEDESIGNATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResourceDesignator" element
     */
    public void setResourceDesignator(java.lang.String resourceDesignator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEDESIGNATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEDESIGNATOR$0);
            }
            target.setStringValue(resourceDesignator);
        }
    }
    
    /**
     * Sets (as xml) the "ResourceDesignator" element
     */
    public void xsetResourceDesignator(org.apache.xmlbeans.XmlString resourceDesignator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEDESIGNATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOURCEDESIGNATOR$0);
            }
            target.set(resourceDesignator);
        }
    }
    
    /**
     * Gets the "EMT" element
     */
    public java.lang.String getEMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EMT" element
     */
    public org.apache.xmlbeans.XmlString xgetEMT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EMT" element
     */
    public void setEMT(java.lang.String emt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMT$2);
            }
            target.setStringValue(emt);
        }
    }
    
    /**
     * Sets (as xml) the "EMT" element
     */
    public void xsetEMT(org.apache.xmlbeans.XmlString emt)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMT$2);
            }
            target.set(emt);
        }
    }
    
    /**
     * Gets the "Leader" element
     */
    public java.lang.String getLeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEADER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Leader" element
     */
    public org.apache.xmlbeans.XmlString xgetLeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEADER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Leader" element
     */
    public void setLeader(java.lang.String leader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEADER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEADER$4);
            }
            target.setStringValue(leader);
        }
    }
    
    /**
     * Sets (as xml) the "Leader" element
     */
    public void xsetLeader(org.apache.xmlbeans.XmlString leader)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEADER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEADER$4);
            }
            target.set(leader);
        }
    }
    
    /**
     * Gets the "NumberPersons" element
     */
    public java.math.BigInteger getNumberPersons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERPERSONS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberPersons" element
     */
    public org.apache.xmlbeans.XmlInteger xgetNumberPersons()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMBERPERSONS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumberPersons" element
     */
    public void setNumberPersons(java.math.BigInteger numberPersons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERPERSONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERPERSONS$6);
            }
            target.setBigIntegerValue(numberPersons);
        }
    }
    
    /**
     * Sets (as xml) the "NumberPersons" element
     */
    public void xsetNumberPersons(org.apache.xmlbeans.XmlInteger numberPersons)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(NUMBERPERSONS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(NUMBERPERSONS$6);
            }
            target.set(numberPersons);
        }
    }
    
    /**
     * Gets the "TransNeeded" element
     */
    public boolean getTransNeeded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSNEEDED$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "TransNeeded" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTransNeeded()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRANSNEEDED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TransNeeded" element
     */
    public void setTransNeeded(boolean transNeeded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRANSNEEDED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRANSNEEDED$8);
            }
            target.setBooleanValue(transNeeded);
        }
    }
    
    /**
     * Sets (as xml) the "TransNeeded" element
     */
    public void xsetTransNeeded(org.apache.xmlbeans.XmlBoolean transNeeded)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRANSNEEDED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TRANSNEEDED$8);
            }
            target.set(transNeeded);
        }
    }
    
    /**
     * Gets the "PickupPtTime" element
     */
    public java.lang.String getPickupPtTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PICKUPPTTIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PickupPtTime" element
     */
    public org.apache.xmlbeans.XmlString xgetPickupPtTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PICKUPPTTIME$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PickupPtTime" element
     */
    public void setPickupPtTime(java.lang.String pickupPtTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PICKUPPTTIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PICKUPPTTIME$10);
            }
            target.setStringValue(pickupPtTime);
        }
    }
    
    /**
     * Sets (as xml) the "PickupPtTime" element
     */
    public void xsetPickupPtTime(org.apache.xmlbeans.XmlString pickupPtTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PICKUPPTTIME$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PICKUPPTTIME$10);
            }
            target.set(pickupPtTime);
        }
    }
    
    /**
     * Gets the "DropOffPtTime" element
     */
    public java.lang.String getDropOffPtTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DROPOFFPTTIME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DropOffPtTime" element
     */
    public org.apache.xmlbeans.XmlString xgetDropOffPtTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DROPOFFPTTIME$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DropOffPtTime" element
     */
    public void setDropOffPtTime(java.lang.String dropOffPtTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DROPOFFPTTIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DROPOFFPTTIME$12);
            }
            target.setStringValue(dropOffPtTime);
        }
    }
    
    /**
     * Sets (as xml) the "DropOffPtTime" element
     */
    public void xsetDropOffPtTime(org.apache.xmlbeans.XmlString dropOffPtTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DROPOFFPTTIME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DROPOFFPTTIME$12);
            }
            target.set(dropOffPtTime);
        }
    }
}
