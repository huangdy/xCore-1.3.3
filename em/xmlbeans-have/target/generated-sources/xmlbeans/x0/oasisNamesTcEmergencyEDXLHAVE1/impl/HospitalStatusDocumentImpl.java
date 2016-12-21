/*
 * An XML document type.
 * Localname: HospitalStatus
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * A document containing one HospitalStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0) element.
 *
 * This is a complex type.
 */
public class HospitalStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public HospitalStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HOSPITALSTATUS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "HospitalStatus");
    
    
    /**
     * Gets the "HospitalStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus getHospitalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus)get_store().find_element_user(HOSPITALSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "HospitalStatus" element
     */
    public void setHospitalStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus hospitalStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus)get_store().find_element_user(HOSPITALSTATUS$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus)get_store().add_element_user(HOSPITALSTATUS$0);
            }
            target.set(hospitalStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "HospitalStatus" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus addNewHospitalStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus)get_store().add_element_user(HOSPITALSTATUS$0);
            return target;
        }
    }
    /**
     * An XML HospitalStatus(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class HospitalStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus
    {
        private static final long serialVersionUID = 1L;
        
        public HospitalStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOSPITAL$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Hospital");
        
        
        /**
         * Gets array of all "Hospital" elements
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital[] getHospitalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HOSPITAL$0, targetList);
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital[] result = new x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Hospital" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital getHospitalArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital)get_store().find_element_user(HOSPITAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Hospital" element
         */
        public int sizeOfHospitalArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOSPITAL$0);
            }
        }
        
        /**
         * Sets array of all "Hospital" element
         */
        public void setHospitalArray(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital[] hospitalArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hospitalArray, HOSPITAL$0);
            }
        }
        
        /**
         * Sets ith "Hospital" element
         */
        public void setHospitalArray(int i, x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital hospital)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital)get_store().find_element_user(HOSPITAL$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hospital);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Hospital" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital insertNewHospital(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital)get_store().insert_element_user(HOSPITAL$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Hospital" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital addNewHospital()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital)get_store().add_element_user(HOSPITAL$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Hospital" element
         */
        public void removeHospital(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOSPITAL$0, i);
            }
        }
        /**
         * An XML Hospital(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
         *
         * This is a complex type.
         */
        public static class HospitalImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalStatusDocument.HospitalStatus.Hospital
        {
            private static final long serialVersionUID = 1L;
            
            public HospitalImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ORGANIZATION$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Organization");
            private static final javax.xml.namespace.QName EMERGENCYDEPARTMENTSTATUS$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "EmergencyDepartmentStatus");
            private static final javax.xml.namespace.QName HOSPITALBEDCAPACITYSTATUS$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "HospitalBedCapacityStatus");
            private static final javax.xml.namespace.QName SERVICECOVERAGESTATUS$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "ServiceCoverageStatus");
            private static final javax.xml.namespace.QName HOSPITALFACILITYSTATUS$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "HospitalFacilityStatus");
            private static final javax.xml.namespace.QName HOSPITALRESOURCESSTATUS$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "HospitalResourcesStatus");
            private static final javax.xml.namespace.QName LASTUPDATETIME$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "LastUpdateTime");
            
            
            /**
             * Gets the "Organization" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization getOrganization()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization)get_store().find_element_user(ORGANIZATION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Organization" element
             */
            public void setOrganization(x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization organization)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization)get_store().find_element_user(ORGANIZATION$0, 0);
                    if (target == null)
                    {
                      target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization)get_store().add_element_user(ORGANIZATION$0);
                    }
                    target.set(organization);
                }
            }
            
            /**
             * Appends and returns a new empty "Organization" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization addNewOrganization()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization)get_store().add_element_user(ORGANIZATION$0);
                    return target;
                }
            }
            
            /**
             * Gets the "EmergencyDepartmentStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus getEmergencyDepartmentStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus)get_store().find_element_user(EMERGENCYDEPARTMENTSTATUS$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "EmergencyDepartmentStatus" element
             */
            public boolean isSetEmergencyDepartmentStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EMERGENCYDEPARTMENTSTATUS$2) != 0;
                }
            }
            
            /**
             * Sets the "EmergencyDepartmentStatus" element
             */
            public void setEmergencyDepartmentStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus emergencyDepartmentStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus)get_store().find_element_user(EMERGENCYDEPARTMENTSTATUS$2, 0);
                    if (target == null)
                    {
                      target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus)get_store().add_element_user(EMERGENCYDEPARTMENTSTATUS$2);
                    }
                    target.set(emergencyDepartmentStatus);
                }
            }
            
            /**
             * Appends and returns a new empty "EmergencyDepartmentStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus addNewEmergencyDepartmentStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.EmergencyDepartmentStatus)get_store().add_element_user(EMERGENCYDEPARTMENTSTATUS$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "EmergencyDepartmentStatus" element
             */
            public void unsetEmergencyDepartmentStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EMERGENCYDEPARTMENTSTATUS$2, 0);
                }
            }
            
            /**
             * Gets the "HospitalBedCapacityStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus getHospitalBedCapacityStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus)get_store().find_element_user(HOSPITALBEDCAPACITYSTATUS$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "HospitalBedCapacityStatus" element
             */
            public boolean isSetHospitalBedCapacityStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(HOSPITALBEDCAPACITYSTATUS$4) != 0;
                }
            }
            
            /**
             * Sets the "HospitalBedCapacityStatus" element
             */
            public void setHospitalBedCapacityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus hospitalBedCapacityStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus)get_store().find_element_user(HOSPITALBEDCAPACITYSTATUS$4, 0);
                    if (target == null)
                    {
                      target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus)get_store().add_element_user(HOSPITALBEDCAPACITYSTATUS$4);
                    }
                    target.set(hospitalBedCapacityStatus);
                }
            }
            
            /**
             * Appends and returns a new empty "HospitalBedCapacityStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus addNewHospitalBedCapacityStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalBedCapacityStatus)get_store().add_element_user(HOSPITALBEDCAPACITYSTATUS$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "HospitalBedCapacityStatus" element
             */
            public void unsetHospitalBedCapacityStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(HOSPITALBEDCAPACITYSTATUS$4, 0);
                }
            }
            
            /**
             * Gets the "ServiceCoverageStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus getServiceCoverageStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus)get_store().find_element_user(SERVICECOVERAGESTATUS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "ServiceCoverageStatus" element
             */
            public boolean isSetServiceCoverageStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SERVICECOVERAGESTATUS$6) != 0;
                }
            }
            
            /**
             * Sets the "ServiceCoverageStatus" element
             */
            public void setServiceCoverageStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus serviceCoverageStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus)get_store().find_element_user(SERVICECOVERAGESTATUS$6, 0);
                    if (target == null)
                    {
                      target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus)get_store().add_element_user(SERVICECOVERAGESTATUS$6);
                    }
                    target.set(serviceCoverageStatus);
                }
            }
            
            /**
             * Appends and returns a new empty "ServiceCoverageStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus addNewServiceCoverageStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.ServiceCoverageStatus)get_store().add_element_user(SERVICECOVERAGESTATUS$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "ServiceCoverageStatus" element
             */
            public void unsetServiceCoverageStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SERVICECOVERAGESTATUS$6, 0);
                }
            }
            
            /**
             * Gets the "HospitalFacilityStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus getHospitalFacilityStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus)get_store().find_element_user(HOSPITALFACILITYSTATUS$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "HospitalFacilityStatus" element
             */
            public boolean isSetHospitalFacilityStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(HOSPITALFACILITYSTATUS$8) != 0;
                }
            }
            
            /**
             * Sets the "HospitalFacilityStatus" element
             */
            public void setHospitalFacilityStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus hospitalFacilityStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus)get_store().find_element_user(HOSPITALFACILITYSTATUS$8, 0);
                    if (target == null)
                    {
                      target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus)get_store().add_element_user(HOSPITALFACILITYSTATUS$8);
                    }
                    target.set(hospitalFacilityStatus);
                }
            }
            
            /**
             * Appends and returns a new empty "HospitalFacilityStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus addNewHospitalFacilityStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalFacilityStatus)get_store().add_element_user(HOSPITALFACILITYSTATUS$8);
                    return target;
                }
            }
            
            /**
             * Unsets the "HospitalFacilityStatus" element
             */
            public void unsetHospitalFacilityStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(HOSPITALFACILITYSTATUS$8, 0);
                }
            }
            
            /**
             * Gets the "HospitalResourcesStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus getHospitalResourcesStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus)get_store().find_element_user(HOSPITALRESOURCESSTATUS$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "HospitalResourcesStatus" element
             */
            public boolean isSetHospitalResourcesStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(HOSPITALRESOURCESSTATUS$10) != 0;
                }
            }
            
            /**
             * Sets the "HospitalResourcesStatus" element
             */
            public void setHospitalResourcesStatus(x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus hospitalResourcesStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus)get_store().find_element_user(HOSPITALRESOURCESSTATUS$10, 0);
                    if (target == null)
                    {
                      target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus)get_store().add_element_user(HOSPITALRESOURCESSTATUS$10);
                    }
                    target.set(hospitalResourcesStatus);
                }
            }
            
            /**
             * Appends and returns a new empty "HospitalResourcesStatus" element
             */
            public x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus addNewHospitalResourcesStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.HospitalResourcesStatus)get_store().add_element_user(HOSPITALRESOURCESSTATUS$10);
                    return target;
                }
            }
            
            /**
             * Unsets the "HospitalResourcesStatus" element
             */
            public void unsetHospitalResourcesStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(HOSPITALRESOURCESSTATUS$10, 0);
                }
            }
            
            /**
             * Gets the "LastUpdateTime" element
             */
            public java.util.Calendar getLastUpdateTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATETIME$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "LastUpdateTime" element
             */
            public org.apache.xmlbeans.XmlDateTime xgetLastUpdateTime()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATETIME$12, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "LastUpdateTime" element
             */
            public void setLastUpdateTime(java.util.Calendar lastUpdateTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTUPDATETIME$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTUPDATETIME$12);
                    }
                    target.setCalendarValue(lastUpdateTime);
                }
            }
            
            /**
             * Sets (as xml) the "LastUpdateTime" element
             */
            public void xsetLastUpdateTime(org.apache.xmlbeans.XmlDateTime lastUpdateTime)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTUPDATETIME$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTUPDATETIME$12);
                    }
                    target.set(lastUpdateTime);
                }
            }
        }
    }
}
