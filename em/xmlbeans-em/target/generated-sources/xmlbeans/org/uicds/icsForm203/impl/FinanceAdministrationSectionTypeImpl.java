/*
 * XML Type:  FinanceAdministrationSectionType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.FinanceAdministrationSectionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203.impl;
/**
 * An XML FinanceAdministrationSectionType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public class FinanceAdministrationSectionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm203.FinanceAdministrationSectionType
{
    private static final long serialVersionUID = 1L;
    
    public FinanceAdministrationSectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHIEF$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Chief");
    private static final javax.xml.namespace.QName DEPUTY$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Deputy");
    private static final javax.xml.namespace.QName TIMEUNIT$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "TimeUnit");
    private static final javax.xml.namespace.QName PROCUREMENTUNIT$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "ProcurementUnit");
    private static final javax.xml.namespace.QName COMPENSATIONCLAIMSUNIT$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "CompensationClaimsUnit");
    private static final javax.xml.namespace.QName COSTUNIT$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "CostUnit");
    
    
    /**
     * Gets the "Chief" element
     */
    public java.lang.String getChief()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHIEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Chief" element
     */
    public org.apache.xmlbeans.XmlString xgetChief()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHIEF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Chief" element
     */
    public void setChief(java.lang.String chief)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHIEF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHIEF$0);
            }
            target.setStringValue(chief);
        }
    }
    
    /**
     * Sets (as xml) the "Chief" element
     */
    public void xsetChief(org.apache.xmlbeans.XmlString chief)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHIEF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHIEF$0);
            }
            target.set(chief);
        }
    }
    
    /**
     * Gets the "Deputy" element
     */
    public java.lang.String getDeputy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPUTY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Deputy" element
     */
    public org.apache.xmlbeans.XmlString xgetDeputy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPUTY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Deputy" element
     */
    public void setDeputy(java.lang.String deputy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPUTY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPUTY$2);
            }
            target.setStringValue(deputy);
        }
    }
    
    /**
     * Sets (as xml) the "Deputy" element
     */
    public void xsetDeputy(org.apache.xmlbeans.XmlString deputy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPUTY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPUTY$2);
            }
            target.set(deputy);
        }
    }
    
    /**
     * Gets the "TimeUnit" element
     */
    public java.lang.String getTimeUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEUNIT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TimeUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetTimeUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEUNIT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TimeUnit" element
     */
    public void setTimeUnit(java.lang.String timeUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEUNIT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEUNIT$4);
            }
            target.setStringValue(timeUnit);
        }
    }
    
    /**
     * Sets (as xml) the "TimeUnit" element
     */
    public void xsetTimeUnit(org.apache.xmlbeans.XmlString timeUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TIMEUNIT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TIMEUNIT$4);
            }
            target.set(timeUnit);
        }
    }
    
    /**
     * Gets the "ProcurementUnit" element
     */
    public java.lang.String getProcurementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCUREMENTUNIT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProcurementUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetProcurementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCUREMENTUNIT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProcurementUnit" element
     */
    public void setProcurementUnit(java.lang.String procurementUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCUREMENTUNIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCUREMENTUNIT$6);
            }
            target.setStringValue(procurementUnit);
        }
    }
    
    /**
     * Sets (as xml) the "ProcurementUnit" element
     */
    public void xsetProcurementUnit(org.apache.xmlbeans.XmlString procurementUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROCUREMENTUNIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROCUREMENTUNIT$6);
            }
            target.set(procurementUnit);
        }
    }
    
    /**
     * Gets the "CompensationClaimsUnit" element
     */
    public java.lang.String getCompensationClaimsUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPENSATIONCLAIMSUNIT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompensationClaimsUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetCompensationClaimsUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPENSATIONCLAIMSUNIT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CompensationClaimsUnit" element
     */
    public void setCompensationClaimsUnit(java.lang.String compensationClaimsUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPENSATIONCLAIMSUNIT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPENSATIONCLAIMSUNIT$8);
            }
            target.setStringValue(compensationClaimsUnit);
        }
    }
    
    /**
     * Sets (as xml) the "CompensationClaimsUnit" element
     */
    public void xsetCompensationClaimsUnit(org.apache.xmlbeans.XmlString compensationClaimsUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMPENSATIONCLAIMSUNIT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMPENSATIONCLAIMSUNIT$8);
            }
            target.set(compensationClaimsUnit);
        }
    }
    
    /**
     * Gets the "CostUnit" element
     */
    public java.lang.String getCostUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COSTUNIT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CostUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetCostUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COSTUNIT$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CostUnit" element
     */
    public void setCostUnit(java.lang.String costUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COSTUNIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COSTUNIT$10);
            }
            target.setStringValue(costUnit);
        }
    }
    
    /**
     * Sets (as xml) the "CostUnit" element
     */
    public void xsetCostUnit(org.apache.xmlbeans.XmlString costUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COSTUNIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COSTUNIT$10);
            }
            target.set(costUnit);
        }
    }
}
