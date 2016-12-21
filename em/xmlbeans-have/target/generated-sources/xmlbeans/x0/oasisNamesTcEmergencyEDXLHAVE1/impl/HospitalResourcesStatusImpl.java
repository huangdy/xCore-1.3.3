/*
 * XML Type:  HospitalResourcesStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML HospitalResourcesStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public class HospitalResourcesStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus
{
    private static final long serialVersionUID = 1L;
    
    public HospitalResourcesStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STAFFING$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Staffing");
    private static final javax.xml.namespace.QName FACILITYOPERATIONS$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "FacilityOperations");
    private static final javax.xml.namespace.QName CLINICALOPERATIONS$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "ClinicalOperations");
    private static final javax.xml.namespace.QName RESOURCESINFORMATIONTEXT$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "ResourcesInformationText");
    private static final javax.xml.namespace.QName COMMENTTEXT$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CommentText");
    
    
    /**
     * Gets the "Staffing" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing.Enum getStaffing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAFFING$0, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Staffing" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing xgetStaffing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing)get_store().find_element_user(STAFFING$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Staffing" element
     */
    public boolean isSetStaffing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STAFFING$0) != 0;
        }
    }
    
    /**
     * Sets the "Staffing" element
     */
    public void setStaffing(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing.Enum staffing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAFFING$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STAFFING$0);
            }
            target.setEnumValue(staffing);
        }
    }
    
    /**
     * Sets (as xml) the "Staffing" element
     */
    public void xsetStaffing(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing staffing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing)get_store().find_element_user(STAFFING$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing)get_store().add_element_user(STAFFING$0);
            }
            target.set(staffing);
        }
    }
    
    /**
     * Unsets the "Staffing" element
     */
    public void unsetStaffing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STAFFING$0, 0);
        }
    }
    
    /**
     * Gets the "FacilityOperations" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations.Enum getFacilityOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITYOPERATIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FacilityOperations" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations xgetFacilityOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations)get_store().find_element_user(FACILITYOPERATIONS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FacilityOperations" element
     */
    public boolean isSetFacilityOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FACILITYOPERATIONS$2) != 0;
        }
    }
    
    /**
     * Sets the "FacilityOperations" element
     */
    public void setFacilityOperations(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations.Enum facilityOperations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FACILITYOPERATIONS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FACILITYOPERATIONS$2);
            }
            target.setEnumValue(facilityOperations);
        }
    }
    
    /**
     * Sets (as xml) the "FacilityOperations" element
     */
    public void xsetFacilityOperations(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations facilityOperations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations)get_store().find_element_user(FACILITYOPERATIONS$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations)get_store().add_element_user(FACILITYOPERATIONS$2);
            }
            target.set(facilityOperations);
        }
    }
    
    /**
     * Unsets the "FacilityOperations" element
     */
    public void unsetFacilityOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FACILITYOPERATIONS$2, 0);
        }
    }
    
    /**
     * Gets the "ClinicalOperations" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations.Enum getClinicalOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICALOPERATIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClinicalOperations" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations xgetClinicalOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations)get_store().find_element_user(CLINICALOPERATIONS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ClinicalOperations" element
     */
    public boolean isSetClinicalOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLINICALOPERATIONS$4) != 0;
        }
    }
    
    /**
     * Sets the "ClinicalOperations" element
     */
    public void setClinicalOperations(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations.Enum clinicalOperations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICALOPERATIONS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLINICALOPERATIONS$4);
            }
            target.setEnumValue(clinicalOperations);
        }
    }
    
    /**
     * Sets (as xml) the "ClinicalOperations" element
     */
    public void xsetClinicalOperations(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations clinicalOperations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations)get_store().find_element_user(CLINICALOPERATIONS$4, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations)get_store().add_element_user(CLINICALOPERATIONS$4);
            }
            target.set(clinicalOperations);
        }
    }
    
    /**
     * Unsets the "ClinicalOperations" element
     */
    public void unsetClinicalOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLINICALOPERATIONS$4, 0);
        }
    }
    
    /**
     * Gets array of all "ResourcesInformationText" elements
     */
    public org.apache.xmlbeans.XmlObject[] getResourcesInformationTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCESINFORMATIONTEXT$6, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ResourcesInformationText" element
     */
    public org.apache.xmlbeans.XmlObject getResourcesInformationTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(RESOURCESINFORMATIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ResourcesInformationText" element
     */
    public int sizeOfResourcesInformationTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCESINFORMATIONTEXT$6);
        }
    }
    
    /**
     * Sets array of all "ResourcesInformationText" element
     */
    public void setResourcesInformationTextArray(org.apache.xmlbeans.XmlObject[] resourcesInformationTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourcesInformationTextArray, RESOURCESINFORMATIONTEXT$6);
        }
    }
    
    /**
     * Sets ith "ResourcesInformationText" element
     */
    public void setResourcesInformationTextArray(int i, org.apache.xmlbeans.XmlObject resourcesInformationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(RESOURCESINFORMATIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourcesInformationText);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourcesInformationText" element
     */
    public org.apache.xmlbeans.XmlObject insertNewResourcesInformationText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(RESOURCESINFORMATIONTEXT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourcesInformationText" element
     */
    public org.apache.xmlbeans.XmlObject addNewResourcesInformationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(RESOURCESINFORMATIONTEXT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ResourcesInformationText" element
     */
    public void removeResourcesInformationText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCESINFORMATIONTEXT$6, i);
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
            get_store().find_all_element_users(COMMENTTEXT$8, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$8, i);
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
            get_store().find_all_element_users(COMMENTTEXT$8, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$8, i);
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
            return get_store().count_elements(COMMENTTEXT$8);
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
            arraySetterHelper(commentTextArray, COMMENTTEXT$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$8, i);
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
            arraySetterHelper(commentTextArray, COMMENTTEXT$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$8, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMMENTTEXT$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTTEXT$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COMMENTTEXT$8, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTTEXT$8);
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
            get_store().remove_element(COMMENTTEXT$8, i);
        }
    }
    /**
     * An XML Staffing(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus$Staffing.
     */
    public static class StaffingImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.Staffing
    {
        private static final long serialVersionUID = 1L;
        
        public StaffingImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StaffingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML FacilityOperations(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus$FacilityOperations.
     */
    public static class FacilityOperationsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.FacilityOperations
    {
        private static final long serialVersionUID = 1L;
        
        public FacilityOperationsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FacilityOperationsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML ClinicalOperations(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus$ClinicalOperations.
     */
    public static class ClinicalOperationsImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus.ClinicalOperations
    {
        private static final long serialVersionUID = 1L;
        
        public ClinicalOperationsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ClinicalOperationsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
