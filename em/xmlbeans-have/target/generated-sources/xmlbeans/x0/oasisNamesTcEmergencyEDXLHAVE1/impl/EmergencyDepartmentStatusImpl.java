/*
 * XML Type:  EmergencyDepartmentStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML EmergencyDepartmentStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
 *
 * This is a complex type.
 */
public class EmergencyDepartmentStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus
{
    private static final long serialVersionUID = 1L;
    
    public EmergencyDepartmentStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMSTRAFFIC$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EMSTraffic");
    private static final javax.xml.namespace.QName EMSCAPACITY$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EMSCapacity");
    private static final javax.xml.namespace.QName EMSCENSUS$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EMSCensus");
    private static final javax.xml.namespace.QName EMSAMBULANCESTATUS$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EMSAmbulanceStatus");
    private static final javax.xml.namespace.QName EMSAIRTRANSPORTSTATUS$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EMSAirTransportStatus");
    private static final javax.xml.namespace.QName COMMENTTEXT$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CommentText");
    
    
    /**
     * Gets the "EMSTraffic" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic getEMSTraffic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic)get_store().find_element_user(EMSTRAFFIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EMSTraffic" element
     */
    public boolean isSetEMSTraffic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMSTRAFFIC$0) != 0;
        }
    }
    
    /**
     * Sets the "EMSTraffic" element
     */
    public void setEMSTraffic(x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic emsTraffic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic)get_store().find_element_user(EMSTRAFFIC$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic)get_store().add_element_user(EMSTRAFFIC$0);
            }
            target.set(emsTraffic);
        }
    }
    
    /**
     * Appends and returns a new empty "EMSTraffic" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic addNewEMSTraffic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic)get_store().add_element_user(EMSTRAFFIC$0);
            return target;
        }
    }
    
    /**
     * Unsets the "EMSTraffic" element
     */
    public void unsetEMSTraffic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMSTRAFFIC$0, 0);
        }
    }
    
    /**
     * Gets the "EMSCapacity" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount getEMSCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount)get_store().find_element_user(EMSCAPACITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EMSCapacity" element
     */
    public boolean isSetEMSCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMSCAPACITY$2) != 0;
        }
    }
    
    /**
     * Sets the "EMSCapacity" element
     */
    public void setEMSCapacity(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount emsCapacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount)get_store().find_element_user(EMSCAPACITY$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount)get_store().add_element_user(EMSCAPACITY$2);
            }
            target.set(emsCapacity);
        }
    }
    
    /**
     * Appends and returns a new empty "EMSCapacity" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount addNewEMSCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount)get_store().add_element_user(EMSCAPACITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "EMSCapacity" element
     */
    public void unsetEMSCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMSCAPACITY$2, 0);
        }
    }
    
    /**
     * Gets the "EMSCensus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount getEMSCensus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount)get_store().find_element_user(EMSCENSUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EMSCensus" element
     */
    public boolean isSetEMSCensus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMSCENSUS$4) != 0;
        }
    }
    
    /**
     * Sets the "EMSCensus" element
     */
    public void setEMSCensus(x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount emsCensus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount)get_store().find_element_user(EMSCENSUS$4, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount)get_store().add_element_user(EMSCENSUS$4);
            }
            target.set(emsCensus);
        }
    }
    
    /**
     * Appends and returns a new empty "EMSCensus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount addNewEMSCensus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.TriageCount)get_store().add_element_user(EMSCENSUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "EMSCensus" element
     */
    public void unsetEMSCensus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMSCENSUS$4, 0);
        }
    }
    
    /**
     * Gets the "EMSAmbulanceStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.Offload getEMSAmbulanceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Offload target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload)get_store().find_element_user(EMSAMBULANCESTATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EMSAmbulanceStatus" element
     */
    public boolean isSetEMSAmbulanceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMSAMBULANCESTATUS$6) != 0;
        }
    }
    
    /**
     * Sets the "EMSAmbulanceStatus" element
     */
    public void setEMSAmbulanceStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Offload emsAmbulanceStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Offload target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload)get_store().find_element_user(EMSAMBULANCESTATUS$6, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload)get_store().add_element_user(EMSAMBULANCESTATUS$6);
            }
            target.set(emsAmbulanceStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "EMSAmbulanceStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.Offload addNewEMSAmbulanceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Offload target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload)get_store().add_element_user(EMSAMBULANCESTATUS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "EMSAmbulanceStatus" element
     */
    public void unsetEMSAmbulanceStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMSAMBULANCESTATUS$6, 0);
        }
    }
    
    /**
     * Gets the "EMSAirTransportStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.Offload getEMSAirTransportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Offload target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload)get_store().find_element_user(EMSAIRTRANSPORTSTATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "EMSAirTransportStatus" element
     */
    public boolean isSetEMSAirTransportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMSAIRTRANSPORTSTATUS$8) != 0;
        }
    }
    
    /**
     * Sets the "EMSAirTransportStatus" element
     */
    public void setEMSAirTransportStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.Offload emsAirTransportStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Offload target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload)get_store().find_element_user(EMSAIRTRANSPORTSTATUS$8, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload)get_store().add_element_user(EMSAIRTRANSPORTSTATUS$8);
            }
            target.set(emsAirTransportStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "EMSAirTransportStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.Offload addNewEMSAirTransportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.Offload target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.Offload)get_store().add_element_user(EMSAIRTRANSPORTSTATUS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "EMSAirTransportStatus" element
     */
    public void unsetEMSAirTransportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMSAIRTRANSPORTSTATUS$8, 0);
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
            get_store().find_all_element_users(COMMENTTEXT$10, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$10, i);
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
            get_store().find_all_element_users(COMMENTTEXT$10, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$10, i);
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
            return get_store().count_elements(COMMENTTEXT$10);
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
            arraySetterHelper(commentTextArray, COMMENTTEXT$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$10, i);
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
            arraySetterHelper(commentTextArray, COMMENTTEXT$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$10, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMMENTTEXT$10, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTTEXT$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COMMENTTEXT$10, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTTEXT$10);
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
            get_store().remove_element(COMMENTTEXT$10, i);
        }
    }
    /**
     * An XML EMSTraffic(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class EMSTrafficImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic
    {
        private static final long serialVersionUID = 1L;
        
        public EMSTrafficImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EMSTRAFFICSTATUS$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EMSTrafficStatus");
        private static final javax.xml.namespace.QName EMSTRAFFICREASON$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EMSTrafficReason");
        private static final javax.xml.namespace.QName COMMENTTEXT$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CommentText");
        
        
        /**
         * Gets the "EMSTrafficStatus" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus.Enum getEMSTrafficStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMSTRAFFICSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "EMSTrafficStatus" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus xgetEMSTrafficStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus)get_store().find_element_user(EMSTRAFFICSTATUS$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "EMSTrafficStatus" element
         */
        public boolean isSetEMSTrafficStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMSTRAFFICSTATUS$0) != 0;
            }
        }
        
        /**
         * Sets the "EMSTrafficStatus" element
         */
        public void setEMSTrafficStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus.Enum emsTrafficStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMSTRAFFICSTATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMSTRAFFICSTATUS$0);
                }
                target.setEnumValue(emsTrafficStatus);
            }
        }
        
        /**
         * Sets (as xml) the "EMSTrafficStatus" element
         */
        public void xsetEMSTrafficStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus emsTrafficStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus)get_store().find_element_user(EMSTRAFFICSTATUS$0, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus)get_store().add_element_user(EMSTRAFFICSTATUS$0);
                }
                target.set(emsTrafficStatus);
            }
        }
        
        /**
         * Unsets the "EMSTrafficStatus" element
         */
        public void unsetEMSTrafficStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMSTRAFFICSTATUS$0, 0);
            }
        }
        
        /**
         * Gets the "EMSTrafficReason" element
         */
        public java.lang.String getEMSTrafficReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMSTRAFFICREASON$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EMSTrafficReason" element
         */
        public org.apache.xmlbeans.XmlString xgetEMSTrafficReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMSTRAFFICREASON$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "EMSTrafficReason" element
         */
        public boolean isSetEMSTrafficReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMSTRAFFICREASON$2) != 0;
            }
        }
        
        /**
         * Sets the "EMSTrafficReason" element
         */
        public void setEMSTrafficReason(java.lang.String emsTrafficReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMSTRAFFICREASON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMSTRAFFICREASON$2);
                }
                target.setStringValue(emsTrafficReason);
            }
        }
        
        /**
         * Sets (as xml) the "EMSTrafficReason" element
         */
        public void xsetEMSTrafficReason(org.apache.xmlbeans.XmlString emsTrafficReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMSTRAFFICREASON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMSTRAFFICREASON$2);
                }
                target.set(emsTrafficReason);
            }
        }
        
        /**
         * Unsets the "EMSTrafficReason" element
         */
        public void unsetEMSTrafficReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMSTRAFFICREASON$2, 0);
            }
        }
        
        /**
         * Gets the "CommentText" element
         */
        public java.lang.String getCommentText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CommentText" element
         */
        public org.apache.xmlbeans.XmlString xgetCommentText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "CommentText" element
         */
        public boolean isSetCommentText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENTTEXT$4) != 0;
            }
        }
        
        /**
         * Sets the "CommentText" element
         */
        public void setCommentText(java.lang.String commentText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTTEXT$4);
                }
                target.setStringValue(commentText);
            }
        }
        
        /**
         * Sets (as xml) the "CommentText" element
         */
        public void xsetCommentText(org.apache.xmlbeans.XmlString commentText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTTEXT$4);
                }
                target.set(commentText);
            }
        }
        
        /**
         * Unsets the "CommentText" element
         */
        public void unsetCommentText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENTTEXT$4, 0);
            }
        }
        /**
         * An XML EMSTrafficStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is an atomic type that is a restriction of x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus$EMSTraffic$EMSTrafficStatus.
         */
        public static class EMSTrafficStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus.EMSTraffic.EMSTrafficStatus
        {
            private static final long serialVersionUID = 1L;
            
            public EMSTrafficStatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected EMSTrafficStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
