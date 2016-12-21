/*
 * XML Type:  OperationsSectionType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.OperationsSectionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203.impl;
/**
 * An XML OperationsSectionType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public class OperationsSectionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm203.OperationsSectionType
{
    private static final long serialVersionUID = 1L;
    
    public OperationsSectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHIEF$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Chief");
    private static final javax.xml.namespace.QName DEPUTY$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Deputy");
    private static final javax.xml.namespace.QName BRANCHIDIVISIONGROUP$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "BranchIDivisionGroup");
    private static final javax.xml.namespace.QName BRANCHIIDIVISIONGROUP$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "BranchIIDivisionGroup");
    private static final javax.xml.namespace.QName BRANCHIIIDIVISIONGROUP$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "BranchIIIDivisionGroup");
    private static final javax.xml.namespace.QName AIROPERATIONSBRANCH$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "AirOperationsBranch");
    
    
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
     * Gets the "BranchIDivisionGroup" element
     */
    public org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup getBranchIDivisionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup)get_store().find_element_user(BRANCHIDIVISIONGROUP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BranchIDivisionGroup" element
     */
    public void setBranchIDivisionGroup(org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup branchIDivisionGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup)get_store().find_element_user(BRANCHIDIVISIONGROUP$4, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup)get_store().add_element_user(BRANCHIDIVISIONGROUP$4);
            }
            target.set(branchIDivisionGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "BranchIDivisionGroup" element
     */
    public org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup addNewBranchIDivisionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup)get_store().add_element_user(BRANCHIDIVISIONGROUP$4);
            return target;
        }
    }
    
    /**
     * Gets the "BranchIIDivisionGroup" element
     */
    public org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup getBranchIIDivisionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup)get_store().find_element_user(BRANCHIIDIVISIONGROUP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BranchIIDivisionGroup" element
     */
    public void setBranchIIDivisionGroup(org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup branchIIDivisionGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup)get_store().find_element_user(BRANCHIIDIVISIONGROUP$6, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup)get_store().add_element_user(BRANCHIIDIVISIONGROUP$6);
            }
            target.set(branchIIDivisionGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "BranchIIDivisionGroup" element
     */
    public org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup addNewBranchIIDivisionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup)get_store().add_element_user(BRANCHIIDIVISIONGROUP$6);
            return target;
        }
    }
    
    /**
     * Gets the "BranchIIIDivisionGroup" element
     */
    public org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup getBranchIIIDivisionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup)get_store().find_element_user(BRANCHIIIDIVISIONGROUP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BranchIIIDivisionGroup" element
     */
    public void setBranchIIIDivisionGroup(org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup branchIIIDivisionGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup)get_store().find_element_user(BRANCHIIIDIVISIONGROUP$8, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup)get_store().add_element_user(BRANCHIIIDIVISIONGROUP$8);
            }
            target.set(branchIIIDivisionGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "BranchIIIDivisionGroup" element
     */
    public org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup addNewBranchIIIDivisionGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup)get_store().add_element_user(BRANCHIIIDIVISIONGROUP$8);
            return target;
        }
    }
    
    /**
     * Gets the "AirOperationsBranch" element
     */
    public org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch getAirOperationsBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch)get_store().find_element_user(AIROPERATIONSBRANCH$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AirOperationsBranch" element
     */
    public void setAirOperationsBranch(org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch airOperationsBranch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch)get_store().find_element_user(AIROPERATIONSBRANCH$10, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch)get_store().add_element_user(AIROPERATIONSBRANCH$10);
            }
            target.set(airOperationsBranch);
        }
    }
    
    /**
     * Appends and returns a new empty "AirOperationsBranch" element
     */
    public org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch addNewAirOperationsBranch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch target = null;
            target = (org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch)get_store().add_element_user(AIROPERATIONSBRANCH$10);
            return target;
        }
    }
    /**
     * An XML BranchIDivisionGroup(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public static class BranchIDivisionGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm203.OperationsSectionType.BranchIDivisionGroup
    {
        private static final long serialVersionUID = 1L;
        
        public BranchIDivisionGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BRANCHDIRECTOR$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "BranchDirector");
        private static final javax.xml.namespace.QName DEPUTY$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Deputy");
        private static final javax.xml.namespace.QName DIVISIONGROUP$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "DivisionGroup");
        
        
        /**
         * Gets the "BranchDirector" element
         */
        public java.lang.String getBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BranchDirector" element
         */
        public org.apache.xmlbeans.XmlString xgetBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BranchDirector" element
         */
        public void setBranchDirector(java.lang.String branchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANCHDIRECTOR$0);
                }
                target.setStringValue(branchDirector);
            }
        }
        
        /**
         * Sets (as xml) the "BranchDirector" element
         */
        public void xsetBranchDirector(org.apache.xmlbeans.XmlString branchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANCHDIRECTOR$0);
                }
                target.set(branchDirector);
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
         * Gets array of all "DivisionGroup" elements
         */
        public org.uicds.icsForm203.DivisionGroupType[] getDivisionGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIVISIONGROUP$4, targetList);
                org.uicds.icsForm203.DivisionGroupType[] result = new org.uicds.icsForm203.DivisionGroupType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DivisionGroup" element
         */
        public org.uicds.icsForm203.DivisionGroupType getDivisionGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().find_element_user(DIVISIONGROUP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DivisionGroup" element
         */
        public int sizeOfDivisionGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIVISIONGROUP$4);
            }
        }
        
        /**
         * Sets array of all "DivisionGroup" element
         */
        public void setDivisionGroupArray(org.uicds.icsForm203.DivisionGroupType[] divisionGroupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(divisionGroupArray, DIVISIONGROUP$4);
            }
        }
        
        /**
         * Sets ith "DivisionGroup" element
         */
        public void setDivisionGroupArray(int i, org.uicds.icsForm203.DivisionGroupType divisionGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().find_element_user(DIVISIONGROUP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(divisionGroup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DivisionGroup" element
         */
        public org.uicds.icsForm203.DivisionGroupType insertNewDivisionGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().insert_element_user(DIVISIONGROUP$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DivisionGroup" element
         */
        public org.uicds.icsForm203.DivisionGroupType addNewDivisionGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().add_element_user(DIVISIONGROUP$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "DivisionGroup" element
         */
        public void removeDivisionGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIVISIONGROUP$4, i);
            }
        }
    }
    /**
     * An XML BranchIIDivisionGroup(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public static class BranchIIDivisionGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm203.OperationsSectionType.BranchIIDivisionGroup
    {
        private static final long serialVersionUID = 1L;
        
        public BranchIIDivisionGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BRANCHDIRECTOR$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "BranchDirector");
        private static final javax.xml.namespace.QName DEPUTY$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Deputy");
        private static final javax.xml.namespace.QName DIVISIONGROUP$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "DivisionGroup");
        
        
        /**
         * Gets the "BranchDirector" element
         */
        public java.lang.String getBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BranchDirector" element
         */
        public org.apache.xmlbeans.XmlString xgetBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BranchDirector" element
         */
        public void setBranchDirector(java.lang.String branchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANCHDIRECTOR$0);
                }
                target.setStringValue(branchDirector);
            }
        }
        
        /**
         * Sets (as xml) the "BranchDirector" element
         */
        public void xsetBranchDirector(org.apache.xmlbeans.XmlString branchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANCHDIRECTOR$0);
                }
                target.set(branchDirector);
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
         * Gets array of all "DivisionGroup" elements
         */
        public org.uicds.icsForm203.DivisionGroupType[] getDivisionGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIVISIONGROUP$4, targetList);
                org.uicds.icsForm203.DivisionGroupType[] result = new org.uicds.icsForm203.DivisionGroupType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DivisionGroup" element
         */
        public org.uicds.icsForm203.DivisionGroupType getDivisionGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().find_element_user(DIVISIONGROUP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DivisionGroup" element
         */
        public int sizeOfDivisionGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIVISIONGROUP$4);
            }
        }
        
        /**
         * Sets array of all "DivisionGroup" element
         */
        public void setDivisionGroupArray(org.uicds.icsForm203.DivisionGroupType[] divisionGroupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(divisionGroupArray, DIVISIONGROUP$4);
            }
        }
        
        /**
         * Sets ith "DivisionGroup" element
         */
        public void setDivisionGroupArray(int i, org.uicds.icsForm203.DivisionGroupType divisionGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().find_element_user(DIVISIONGROUP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(divisionGroup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DivisionGroup" element
         */
        public org.uicds.icsForm203.DivisionGroupType insertNewDivisionGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().insert_element_user(DIVISIONGROUP$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DivisionGroup" element
         */
        public org.uicds.icsForm203.DivisionGroupType addNewDivisionGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().add_element_user(DIVISIONGROUP$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "DivisionGroup" element
         */
        public void removeDivisionGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIVISIONGROUP$4, i);
            }
        }
    }
    /**
     * An XML BranchIIIDivisionGroup(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public static class BranchIIIDivisionGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm203.OperationsSectionType.BranchIIIDivisionGroup
    {
        private static final long serialVersionUID = 1L;
        
        public BranchIIIDivisionGroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BRANCHDIRECTOR$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "BranchDirector");
        private static final javax.xml.namespace.QName DEPUTY$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Deputy");
        private static final javax.xml.namespace.QName DIVISIONGROUP$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "DivisionGroup");
        
        
        /**
         * Gets the "BranchDirector" element
         */
        public java.lang.String getBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BranchDirector" element
         */
        public org.apache.xmlbeans.XmlString xgetBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BranchDirector" element
         */
        public void setBranchDirector(java.lang.String branchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANCHDIRECTOR$0);
                }
                target.setStringValue(branchDirector);
            }
        }
        
        /**
         * Sets (as xml) the "BranchDirector" element
         */
        public void xsetBranchDirector(org.apache.xmlbeans.XmlString branchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANCHDIRECTOR$0);
                }
                target.set(branchDirector);
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
         * Gets array of all "DivisionGroup" elements
         */
        public org.uicds.icsForm203.DivisionGroupType[] getDivisionGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DIVISIONGROUP$4, targetList);
                org.uicds.icsForm203.DivisionGroupType[] result = new org.uicds.icsForm203.DivisionGroupType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DivisionGroup" element
         */
        public org.uicds.icsForm203.DivisionGroupType getDivisionGroupArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().find_element_user(DIVISIONGROUP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DivisionGroup" element
         */
        public int sizeOfDivisionGroupArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DIVISIONGROUP$4);
            }
        }
        
        /**
         * Sets array of all "DivisionGroup" element
         */
        public void setDivisionGroupArray(org.uicds.icsForm203.DivisionGroupType[] divisionGroupArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(divisionGroupArray, DIVISIONGROUP$4);
            }
        }
        
        /**
         * Sets ith "DivisionGroup" element
         */
        public void setDivisionGroupArray(int i, org.uicds.icsForm203.DivisionGroupType divisionGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().find_element_user(DIVISIONGROUP$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(divisionGroup);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DivisionGroup" element
         */
        public org.uicds.icsForm203.DivisionGroupType insertNewDivisionGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().insert_element_user(DIVISIONGROUP$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DivisionGroup" element
         */
        public org.uicds.icsForm203.DivisionGroupType addNewDivisionGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.DivisionGroupType target = null;
                target = (org.uicds.icsForm203.DivisionGroupType)get_store().add_element_user(DIVISIONGROUP$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "DivisionGroup" element
         */
        public void removeDivisionGroup(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DIVISIONGROUP$4, i);
            }
        }
    }
    /**
     * An XML AirOperationsBranch(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public static class AirOperationsBranchImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm203.OperationsSectionType.AirOperationsBranch
    {
        private static final long serialVersionUID = 1L;
        
        public AirOperationsBranchImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AIROPERATIONSBRANCHDIRECTOR$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "AirOperationsBranchDirector");
        private static final javax.xml.namespace.QName AIRTACTICALGROUPSUP$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "AirTacticalGroupSup");
        private static final javax.xml.namespace.QName AIRSUPPORTGROUPSUP$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "AirSupportGroupSup");
        private static final javax.xml.namespace.QName HELICOPTERCOORDINATOR$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "HelicopterCoordinator");
        private static final javax.xml.namespace.QName AIRTANKERFIXEDWINGCRD$8 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "AirTankerFixedWingCrd");
        
        
        /**
         * Gets the "AirOperationsBranchDirector" element
         */
        public java.lang.String getAirOperationsBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIROPERATIONSBRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AirOperationsBranchDirector" element
         */
        public org.apache.xmlbeans.XmlString xgetAirOperationsBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIROPERATIONSBRANCHDIRECTOR$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AirOperationsBranchDirector" element
         */
        public void setAirOperationsBranchDirector(java.lang.String airOperationsBranchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIROPERATIONSBRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIROPERATIONSBRANCHDIRECTOR$0);
                }
                target.setStringValue(airOperationsBranchDirector);
            }
        }
        
        /**
         * Sets (as xml) the "AirOperationsBranchDirector" element
         */
        public void xsetAirOperationsBranchDirector(org.apache.xmlbeans.XmlString airOperationsBranchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIROPERATIONSBRANCHDIRECTOR$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AIROPERATIONSBRANCHDIRECTOR$0);
                }
                target.set(airOperationsBranchDirector);
            }
        }
        
        /**
         * Gets the "AirTacticalGroupSup" element
         */
        public java.lang.String getAirTacticalGroupSup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRTACTICALGROUPSUP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AirTacticalGroupSup" element
         */
        public org.apache.xmlbeans.XmlString xgetAirTacticalGroupSup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRTACTICALGROUPSUP$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AirTacticalGroupSup" element
         */
        public void setAirTacticalGroupSup(java.lang.String airTacticalGroupSup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRTACTICALGROUPSUP$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRTACTICALGROUPSUP$2);
                }
                target.setStringValue(airTacticalGroupSup);
            }
        }
        
        /**
         * Sets (as xml) the "AirTacticalGroupSup" element
         */
        public void xsetAirTacticalGroupSup(org.apache.xmlbeans.XmlString airTacticalGroupSup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRTACTICALGROUPSUP$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AIRTACTICALGROUPSUP$2);
                }
                target.set(airTacticalGroupSup);
            }
        }
        
        /**
         * Gets the "AirSupportGroupSup" element
         */
        public java.lang.String getAirSupportGroupSup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRSUPPORTGROUPSUP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AirSupportGroupSup" element
         */
        public org.apache.xmlbeans.XmlString xgetAirSupportGroupSup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRSUPPORTGROUPSUP$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AirSupportGroupSup" element
         */
        public void setAirSupportGroupSup(java.lang.String airSupportGroupSup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRSUPPORTGROUPSUP$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRSUPPORTGROUPSUP$4);
                }
                target.setStringValue(airSupportGroupSup);
            }
        }
        
        /**
         * Sets (as xml) the "AirSupportGroupSup" element
         */
        public void xsetAirSupportGroupSup(org.apache.xmlbeans.XmlString airSupportGroupSup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRSUPPORTGROUPSUP$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AIRSUPPORTGROUPSUP$4);
                }
                target.set(airSupportGroupSup);
            }
        }
        
        /**
         * Gets the "HelicopterCoordinator" element
         */
        public java.lang.String getHelicopterCoordinator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELICOPTERCOORDINATOR$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "HelicopterCoordinator" element
         */
        public org.apache.xmlbeans.XmlString xgetHelicopterCoordinator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HELICOPTERCOORDINATOR$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "HelicopterCoordinator" element
         */
        public void setHelicopterCoordinator(java.lang.String helicopterCoordinator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELICOPTERCOORDINATOR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HELICOPTERCOORDINATOR$6);
                }
                target.setStringValue(helicopterCoordinator);
            }
        }
        
        /**
         * Sets (as xml) the "HelicopterCoordinator" element
         */
        public void xsetHelicopterCoordinator(org.apache.xmlbeans.XmlString helicopterCoordinator)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HELICOPTERCOORDINATOR$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HELICOPTERCOORDINATOR$6);
                }
                target.set(helicopterCoordinator);
            }
        }
        
        /**
         * Gets the "AirTankerFixedWingCrd" element
         */
        public java.lang.String getAirTankerFixedWingCrd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRTANKERFIXEDWINGCRD$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AirTankerFixedWingCrd" element
         */
        public org.apache.xmlbeans.XmlString xgetAirTankerFixedWingCrd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRTANKERFIXEDWINGCRD$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AirTankerFixedWingCrd" element
         */
        public void setAirTankerFixedWingCrd(java.lang.String airTankerFixedWingCrd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRTANKERFIXEDWINGCRD$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRTANKERFIXEDWINGCRD$8);
                }
                target.setStringValue(airTankerFixedWingCrd);
            }
        }
        
        /**
         * Sets (as xml) the "AirTankerFixedWingCrd" element
         */
        public void xsetAirTankerFixedWingCrd(org.apache.xmlbeans.XmlString airTankerFixedWingCrd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRTANKERFIXEDWINGCRD$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AIRTANKERFIXEDWINGCRD$8);
                }
                target.set(airTankerFixedWingCrd);
            }
        }
    }
}
