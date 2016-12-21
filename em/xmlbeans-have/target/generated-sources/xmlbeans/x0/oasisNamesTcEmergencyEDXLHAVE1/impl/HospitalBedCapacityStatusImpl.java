/*
 * XML Type:  HospitalBedCapacityStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML HospitalBedCapacityStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public class HospitalBedCapacityStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus
{
    private static final long serialVersionUID = 1L;
    
    public HospitalBedCapacityStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BEDCAPACITY$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "BedCapacity");
    
    
    /**
     * Gets array of all "BedCapacity" elements
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity[] getBedCapacityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BEDCAPACITY$0, targetList);
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity[] result = new x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "BedCapacity" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity getBedCapacityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity)get_store().find_element_user(BEDCAPACITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BedCapacity" element
     */
    public int sizeOfBedCapacityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BEDCAPACITY$0);
        }
    }
    
    /**
     * Sets array of all "BedCapacity" element
     */
    public void setBedCapacityArray(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity[] bedCapacityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(bedCapacityArray, BEDCAPACITY$0);
        }
    }
    
    /**
     * Sets ith "BedCapacity" element
     */
    public void setBedCapacityArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity bedCapacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity)get_store().find_element_user(BEDCAPACITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(bedCapacity);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BedCapacity" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity insertNewBedCapacity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity)get_store().insert_element_user(BEDCAPACITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BedCapacity" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity addNewBedCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity)get_store().add_element_user(BEDCAPACITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "BedCapacity" element
     */
    public void removeBedCapacity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BEDCAPACITY$0, i);
        }
    }
    /**
     * An XML BedCapacity(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class BedCapacityImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity
    {
        private static final long serialVersionUID = 1L;
        
        public BedCapacityImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BEDTYPE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "BedType");
        private static final javax.xml.namespace.QName SUBCATEGORYBEDTYPE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "SubCategoryBedType");
        private static final javax.xml.namespace.QName CAPACITY$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Capacity");
        private static final javax.xml.namespace.QName COMMENTTEXT$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CommentText");
        
        
        /**
         * Gets array of all "BedType" elements
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum[] getBedTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BEDTYPE$0, targetList);
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum[] result = new x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                return result;
            }
        }
        
        /**
         * Gets ith "BedType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum getBedTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "BedType" elements
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType[] xgetBedTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BEDTYPE$0, targetList);
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType[] result = new x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "BedType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType xgetBedTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType)get_store().find_element_user(BEDTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType)target;
            }
        }
        
        /**
         * Returns number of "BedType" element
         */
        public int sizeOfBedTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BEDTYPE$0);
            }
        }
        
        /**
         * Sets array of all "BedType" element
         */
        public void setBedTypeArray(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum[] bedTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bedTypeArray, BEDTYPE$0);
            }
        }
        
        /**
         * Sets ith "BedType" element
         */
        public void setBedTypeArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum bedType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BEDTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setEnumValue(bedType);
            }
        }
        
        /**
         * Sets (as xml) array of all "BedType" element
         */
        public void xsetBedTypeArray(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType[]bedTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bedTypeArray, BEDTYPE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "BedType" element
         */
        public void xsetBedTypeArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType bedType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType)get_store().find_element_user(BEDTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bedType);
            }
        }
        
        /**
         * Inserts the value as the ith "BedType" element
         */
        public void insertBedType(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum bedType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BEDTYPE$0, i);
                target.setEnumValue(bedType);
            }
        }
        
        /**
         * Appends the value as the last "BedType" element
         */
        public void addBedType(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType.Enum bedType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BEDTYPE$0);
                target.setEnumValue(bedType);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BedType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType insertNewBedType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType)get_store().insert_element_user(BEDTYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BedType" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType addNewBedType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType)get_store().add_element_user(BEDTYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "BedType" element
         */
        public void removeBedType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BEDTYPE$0, i);
            }
        }
        
        /**
         * Gets array of all "SubCategoryBedType" elements
         */
        public org.apache.xmlbeans.XmlObject[] getSubCategoryBedTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SUBCATEGORYBEDTYPE$2, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SubCategoryBedType" element
         */
        public org.apache.xmlbeans.XmlObject getSubCategoryBedTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SUBCATEGORYBEDTYPE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SubCategoryBedType" element
         */
        public int sizeOfSubCategoryBedTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBCATEGORYBEDTYPE$2);
            }
        }
        
        /**
         * Sets array of all "SubCategoryBedType" element
         */
        public void setSubCategoryBedTypeArray(org.apache.xmlbeans.XmlObject[] subCategoryBedTypeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(subCategoryBedTypeArray, SUBCATEGORYBEDTYPE$2);
            }
        }
        
        /**
         * Sets ith "SubCategoryBedType" element
         */
        public void setSubCategoryBedTypeArray(int i, org.apache.xmlbeans.XmlObject subCategoryBedType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SUBCATEGORYBEDTYPE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(subCategoryBedType);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SubCategoryBedType" element
         */
        public org.apache.xmlbeans.XmlObject insertNewSubCategoryBedType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(SUBCATEGORYBEDTYPE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SubCategoryBedType" element
         */
        public org.apache.xmlbeans.XmlObject addNewSubCategoryBedType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SUBCATEGORYBEDTYPE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "SubCategoryBedType" element
         */
        public void removeSubCategoryBedType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBCATEGORYBEDTYPE$2, i);
            }
        }
        
        /**
         * Gets array of all "Capacity" elements
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity[] getCapacityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CAPACITY$4, targetList);
                x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity[] result = new x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Capacity" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity getCapacityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity)get_store().find_element_user(CAPACITY$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Capacity" element
         */
        public int sizeOfCapacityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CAPACITY$4);
            }
        }
        
        /**
         * Sets array of all "Capacity" element
         */
        public void setCapacityArray(x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity[] capacityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(capacityArray, CAPACITY$4);
            }
        }
        
        /**
         * Sets ith "Capacity" element
         */
        public void setCapacityArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity capacity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity)get_store().find_element_user(CAPACITY$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(capacity);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Capacity" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity insertNewCapacity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity)get_store().insert_element_user(CAPACITY$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Capacity" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity addNewCapacity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Capacity)get_store().add_element_user(CAPACITY$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Capacity" element
         */
        public void removeCapacity(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CAPACITY$4, i);
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
                get_store().find_all_element_users(COMMENTTEXT$6, targetList);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$6, i);
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
                get_store().find_all_element_users(COMMENTTEXT$6, targetList);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$6, i);
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
                return get_store().count_elements(COMMENTTEXT$6);
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
                arraySetterHelper(commentTextArray, COMMENTTEXT$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$6, i);
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
                arraySetterHelper(commentTextArray, COMMENTTEXT$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$6, i);
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
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMMENTTEXT$6, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTTEXT$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COMMENTTEXT$6, i);
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
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTTEXT$6);
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
                get_store().remove_element(COMMENTTEXT$6, i);
            }
        }
        /**
         * An XML BedType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus$BedCapacity$BedType.
         */
        public static class BedTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus.BedCapacity.BedType
        {
            private static final long serialVersionUID = 1L;
            
            public BedTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected BedTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
