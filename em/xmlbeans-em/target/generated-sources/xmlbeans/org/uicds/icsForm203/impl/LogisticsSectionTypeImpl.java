/*
 * XML Type:  LogisticsSectionType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.LogisticsSectionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203.impl;
/**
 * An XML LogisticsSectionType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public class LogisticsSectionTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm203.LogisticsSectionType
{
    private static final long serialVersionUID = 1L;
    
    public LogisticsSectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHIEF$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Chief");
    private static final javax.xml.namespace.QName DEPUTY$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Deputy");
    private static final javax.xml.namespace.QName SUPPORTBRANCH$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "SupportBranch");
    private static final javax.xml.namespace.QName SERVICEBRANCH$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "ServiceBranch");
    
    
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
     * Gets the "SupportBranch" element
     */
    public org.uicds.icsForm203.LogisticsSectionType.SupportBranch getSupportBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.LogisticsSectionType.SupportBranch target = null;
            target = (org.uicds.icsForm203.LogisticsSectionType.SupportBranch)get_store().find_element_user(SUPPORTBRANCH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SupportBranch" element
     */
    public void setSupportBranch(org.uicds.icsForm203.LogisticsSectionType.SupportBranch supportBranch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.LogisticsSectionType.SupportBranch target = null;
            target = (org.uicds.icsForm203.LogisticsSectionType.SupportBranch)get_store().find_element_user(SUPPORTBRANCH$4, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm203.LogisticsSectionType.SupportBranch)get_store().add_element_user(SUPPORTBRANCH$4);
            }
            target.set(supportBranch);
        }
    }
    
    /**
     * Appends and returns a new empty "SupportBranch" element
     */
    public org.uicds.icsForm203.LogisticsSectionType.SupportBranch addNewSupportBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.LogisticsSectionType.SupportBranch target = null;
            target = (org.uicds.icsForm203.LogisticsSectionType.SupportBranch)get_store().add_element_user(SUPPORTBRANCH$4);
            return target;
        }
    }
    
    /**
     * Gets the "ServiceBranch" element
     */
    public org.uicds.icsForm203.LogisticsSectionType.ServiceBranch getServiceBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.LogisticsSectionType.ServiceBranch target = null;
            target = (org.uicds.icsForm203.LogisticsSectionType.ServiceBranch)get_store().find_element_user(SERVICEBRANCH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ServiceBranch" element
     */
    public void setServiceBranch(org.uicds.icsForm203.LogisticsSectionType.ServiceBranch serviceBranch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.LogisticsSectionType.ServiceBranch target = null;
            target = (org.uicds.icsForm203.LogisticsSectionType.ServiceBranch)get_store().find_element_user(SERVICEBRANCH$6, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm203.LogisticsSectionType.ServiceBranch)get_store().add_element_user(SERVICEBRANCH$6);
            }
            target.set(serviceBranch);
        }
    }
    
    /**
     * Appends and returns a new empty "ServiceBranch" element
     */
    public org.uicds.icsForm203.LogisticsSectionType.ServiceBranch addNewServiceBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.LogisticsSectionType.ServiceBranch target = null;
            target = (org.uicds.icsForm203.LogisticsSectionType.ServiceBranch)get_store().add_element_user(SERVICEBRANCH$6);
            return target;
        }
    }
    /**
     * An XML SupportBranch(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public static class SupportBranchImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm203.LogisticsSectionType.SupportBranch
    {
        private static final long serialVersionUID = 1L;
        
        public SupportBranchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIRECTOR$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Director");
        private static final javax.xml.namespace.QName SUPPLYUNIT$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "SupplyUnit");
        private static final javax.xml.namespace.QName FACILITIESUNIT$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "FacilitiesUnit");
        private static final javax.xml.namespace.QName GROUNDSUPPORTUNIT$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "GroundSupportUnit");
        
        
        /**
         * Gets the "Director" element
         */
        public java.lang.String getDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Director" element
         */
        public org.apache.xmlbeans.XmlString xgetDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Director" element
         */
        public void setDirector(java.lang.String director)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTOR$0);
                }
                target.setStringValue(director);
            }
        }
        
        /**
         * Sets (as xml) the "Director" element
         */
        public void xsetDirector(org.apache.xmlbeans.XmlString director)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTOR$0);
                }
                target.set(director);
            }
        }
        
        /**
         * Gets the "SupplyUnit" element
         */
        public java.lang.String getSupplyUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYUNIT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SupplyUnit" element
         */
        public org.apache.xmlbeans.XmlString xgetSupplyUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYUNIT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SupplyUnit" element
         */
        public void setSupplyUnit(java.lang.String supplyUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPLYUNIT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPLYUNIT$2);
                }
                target.setStringValue(supplyUnit);
            }
        }
        
        /**
         * Sets (as xml) the "SupplyUnit" element
         */
        public void xsetSupplyUnit(org.apache.xmlbeans.XmlString supplyUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUPPLYUNIT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUPPLYUNIT$2);
                }
                target.set(supplyUnit);
            }
        }
        
        /**
         * Gets the "FacilitiesUnit" element
         */
        public java.lang.String getFacilitiesUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITIESUNIT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FacilitiesUnit" element
         */
        public org.apache.xmlbeans.XmlString xgetFacilitiesUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FACILITIESUNIT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FacilitiesUnit" element
         */
        public void setFacilitiesUnit(java.lang.String facilitiesUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITIESUNIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACILITIESUNIT$4);
                }
                target.setStringValue(facilitiesUnit);
            }
        }
        
        /**
         * Sets (as xml) the "FacilitiesUnit" element
         */
        public void xsetFacilitiesUnit(org.apache.xmlbeans.XmlString facilitiesUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FACILITIESUNIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FACILITIESUNIT$4);
                }
                target.set(facilitiesUnit);
            }
        }
        
        /**
         * Gets the "GroundSupportUnit" element
         */
        public java.lang.String getGroundSupportUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDSUPPORTUNIT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GroundSupportUnit" element
         */
        public org.apache.xmlbeans.XmlString xgetGroundSupportUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDSUPPORTUNIT$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GroundSupportUnit" element
         */
        public void setGroundSupportUnit(java.lang.String groundSupportUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUNDSUPPORTUNIT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUNDSUPPORTUNIT$6);
                }
                target.setStringValue(groundSupportUnit);
            }
        }
        
        /**
         * Sets (as xml) the "GroundSupportUnit" element
         */
        public void xsetGroundSupportUnit(org.apache.xmlbeans.XmlString groundSupportUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUNDSUPPORTUNIT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUNDSUPPORTUNIT$6);
                }
                target.set(groundSupportUnit);
            }
        }
    }
    /**
     * An XML ServiceBranch(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public static class ServiceBranchImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm203.LogisticsSectionType.ServiceBranch
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceBranchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DIRECTOR$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Director");
        private static final javax.xml.namespace.QName COMMUNICATIONSUNIT$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "CommunicationsUnit");
        private static final javax.xml.namespace.QName MEDICALUNIT$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "MedicalUnit");
        private static final javax.xml.namespace.QName FOODUNIT$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "FoodUnit");
        
        
        /**
         * Gets the "Director" element
         */
        public java.lang.String getDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Director" element
         */
        public org.apache.xmlbeans.XmlString xgetDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Director" element
         */
        public void setDirector(java.lang.String director)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTOR$0);
                }
                target.setStringValue(director);
            }
        }
        
        /**
         * Sets (as xml) the "Director" element
         */
        public void xsetDirector(org.apache.xmlbeans.XmlString director)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIRECTOR$0);
                }
                target.set(director);
            }
        }
        
        /**
         * Gets the "CommunicationsUnit" element
         */
        public java.lang.String getCommunicationsUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNICATIONSUNIT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CommunicationsUnit" element
         */
        public org.apache.xmlbeans.XmlString xgetCommunicationsUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNICATIONSUNIT$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CommunicationsUnit" element
         */
        public void setCommunicationsUnit(java.lang.String communicationsUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNICATIONSUNIT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNICATIONSUNIT$2);
                }
                target.setStringValue(communicationsUnit);
            }
        }
        
        /**
         * Sets (as xml) the "CommunicationsUnit" element
         */
        public void xsetCommunicationsUnit(org.apache.xmlbeans.XmlString communicationsUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMUNICATIONSUNIT$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMUNICATIONSUNIT$2);
                }
                target.set(communicationsUnit);
            }
        }
        
        /**
         * Gets the "MedicalUnit" element
         */
        public java.lang.String getMedicalUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALUNIT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MedicalUnit" element
         */
        public org.apache.xmlbeans.XmlString xgetMedicalUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICALUNIT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MedicalUnit" element
         */
        public void setMedicalUnit(java.lang.String medicalUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALUNIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDICALUNIT$4);
                }
                target.setStringValue(medicalUnit);
            }
        }
        
        /**
         * Sets (as xml) the "MedicalUnit" element
         */
        public void xsetMedicalUnit(org.apache.xmlbeans.XmlString medicalUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICALUNIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDICALUNIT$4);
                }
                target.set(medicalUnit);
            }
        }
        
        /**
         * Gets the "FoodUnit" element
         */
        public java.lang.String getFoodUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOODUNIT$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FoodUnit" element
         */
        public org.apache.xmlbeans.XmlString xgetFoodUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FOODUNIT$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FoodUnit" element
         */
        public void setFoodUnit(java.lang.String foodUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOODUNIT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOODUNIT$6);
                }
                target.setStringValue(foodUnit);
            }
        }
        
        /**
         * Sets (as xml) the "FoodUnit" element
         */
        public void xsetFoodUnit(org.apache.xmlbeans.XmlString foodUnit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FOODUNIT$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FOODUNIT$6);
                }
                target.set(foodUnit);
            }
        }
    }
}
