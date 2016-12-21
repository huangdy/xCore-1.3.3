/*
 * An XML document type.
 * Localname: ICSForm206
 * Namespace: http://uicds.org/ICSForm206
 * Java type: org.uicds.icsForm206.ICSForm206Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm206.impl;
/**
 * A document containing one ICSForm206(@http://uicds.org/ICSForm206) element.
 *
 * This is a complex type.
 */
public class ICSForm206DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm206.ICSForm206Document
{
    private static final long serialVersionUID = 1L;
    
    public ICSForm206DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORM206$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "ICSForm206");
    
    
    /**
     * Gets the "ICSForm206" element
     */
    public org.uicds.icsForm206.ICSForm206Document.ICSForm206 getICSForm206()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm206.ICSForm206Document.ICSForm206 target = null;
            target = (org.uicds.icsForm206.ICSForm206Document.ICSForm206)get_store().find_element_user(ICSFORM206$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSForm206" element
     */
    public void setICSForm206(org.uicds.icsForm206.ICSForm206Document.ICSForm206 icsForm206)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm206.ICSForm206Document.ICSForm206 target = null;
            target = (org.uicds.icsForm206.ICSForm206Document.ICSForm206)get_store().find_element_user(ICSFORM206$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm206.ICSForm206Document.ICSForm206)get_store().add_element_user(ICSFORM206$0);
            }
            target.set(icsForm206);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSForm206" element
     */
    public org.uicds.icsForm206.ICSForm206Document.ICSForm206 addNewICSForm206()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm206.ICSForm206Document.ICSForm206 target = null;
            target = (org.uicds.icsForm206.ICSForm206Document.ICSForm206)get_store().add_element_user(ICSFORM206$0);
            return target;
        }
    }
    /**
     * An XML ICSForm206(@http://uicds.org/ICSForm206).
     *
     * This is a complex type.
     */
    public static class ICSForm206Impl extends org.uicds.icsFormCommon.impl.ICSFormDocumentTypeImpl implements org.uicds.icsForm206.ICSForm206Document.ICSForm206
    {
        private static final long serialVersionUID = 1L;
        
        public ICSForm206Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTNAME$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "IncidentName");
        private static final javax.xml.namespace.QName DATEPREPARED$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "DatePrepared");
        private static final javax.xml.namespace.QName TIMEPREPARED$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "TimePrepared");
        private static final javax.xml.namespace.QName OPERATIONALPERIOD$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "OperationalPeriod");
        private static final javax.xml.namespace.QName INCIDENTMEDICALAIDSTATION$8 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "IncidentMedicalAidStation");
        private static final javax.xml.namespace.QName AMBULANCESERVICES$10 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "AmbulanceServices");
        private static final javax.xml.namespace.QName INCIDENTAMBULANCES$12 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "IncidentAmbulances");
        private static final javax.xml.namespace.QName HOSPITALS$14 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "Hospitals");
        private static final javax.xml.namespace.QName MEDICALEMERGENCYPROCEDURES$16 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "MedicalEmergencyProcedures");
        private static final javax.xml.namespace.QName PREPAREDBY$18 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "PreparedBy");
        private static final javax.xml.namespace.QName REVIEWEDBY$20 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "ReviewedBy");
        
        
        /**
         * Gets the "IncidentName" element
         */
        public java.lang.String getIncidentName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IncidentName" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "IncidentName" element
         */
        public void setIncidentName(java.lang.String incidentName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTNAME$0);
                }
                target.setStringValue(incidentName);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentName" element
         */
        public void xsetIncidentName(org.apache.xmlbeans.XmlString incidentName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTNAME$0);
                }
                target.set(incidentName);
            }
        }
        
        /**
         * Gets the "DatePrepared" element
         */
        public java.util.Calendar getDatePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEPREPARED$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DatePrepared" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetDatePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEPREPARED$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DatePrepared" element
         */
        public void setDatePrepared(java.util.Calendar datePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEPREPARED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEPREPARED$2);
                }
                target.setCalendarValue(datePrepared);
            }
        }
        
        /**
         * Sets (as xml) the "DatePrepared" element
         */
        public void xsetDatePrepared(org.apache.xmlbeans.XmlDateTime datePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEPREPARED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATEPREPARED$2);
                }
                target.set(datePrepared);
            }
        }
        
        /**
         * Gets the "TimePrepared" element
         */
        public java.util.Calendar getTimePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEPREPARED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "TimePrepared" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetTimePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMEPREPARED$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TimePrepared" element
         */
        public void setTimePrepared(java.util.Calendar timePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEPREPARED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEPREPARED$4);
                }
                target.setCalendarValue(timePrepared);
            }
        }
        
        /**
         * Sets (as xml) the "TimePrepared" element
         */
        public void xsetTimePrepared(org.apache.xmlbeans.XmlDateTime timePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMEPREPARED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMEPREPARED$4);
                }
                target.set(timePrepared);
            }
        }
        
        /**
         * Gets the "OperationalPeriod" element
         */
        public java.util.Calendar getOperationalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIOD$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperationalPeriod" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetOperationalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OPERATIONALPERIOD$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OperationalPeriod" element
         */
        public void setOperationalPeriod(java.util.Calendar operationalPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIOD$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONALPERIOD$6);
                }
                target.setCalendarValue(operationalPeriod);
            }
        }
        
        /**
         * Sets (as xml) the "OperationalPeriod" element
         */
        public void xsetOperationalPeriod(org.apache.xmlbeans.XmlDateTime operationalPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OPERATIONALPERIOD$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(OPERATIONALPERIOD$6);
                }
                target.set(operationalPeriod);
            }
        }
        
        /**
         * Gets the "IncidentMedicalAidStation" element
         */
        public org.uicds.icsForm206.IncidentMedicalAidStationType getIncidentMedicalAidStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.IncidentMedicalAidStationType target = null;
                target = (org.uicds.icsForm206.IncidentMedicalAidStationType)get_store().find_element_user(INCIDENTMEDICALAIDSTATION$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "IncidentMedicalAidStation" element
         */
        public void setIncidentMedicalAidStation(org.uicds.icsForm206.IncidentMedicalAidStationType incidentMedicalAidStation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.IncidentMedicalAidStationType target = null;
                target = (org.uicds.icsForm206.IncidentMedicalAidStationType)get_store().find_element_user(INCIDENTMEDICALAIDSTATION$8, 0);
                if (target == null)
                {
                    target = (org.uicds.icsForm206.IncidentMedicalAidStationType)get_store().add_element_user(INCIDENTMEDICALAIDSTATION$8);
                }
                target.set(incidentMedicalAidStation);
            }
        }
        
        /**
         * Appends and returns a new empty "IncidentMedicalAidStation" element
         */
        public org.uicds.icsForm206.IncidentMedicalAidStationType addNewIncidentMedicalAidStation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.IncidentMedicalAidStationType target = null;
                target = (org.uicds.icsForm206.IncidentMedicalAidStationType)get_store().add_element_user(INCIDENTMEDICALAIDSTATION$8);
                return target;
            }
        }
        
        /**
         * Gets array of all "AmbulanceServices" elements
         */
        public org.uicds.icsForm206.AmbulanceServicesType[] getAmbulanceServicesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AMBULANCESERVICES$10, targetList);
                org.uicds.icsForm206.AmbulanceServicesType[] result = new org.uicds.icsForm206.AmbulanceServicesType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AmbulanceServices" element
         */
        public org.uicds.icsForm206.AmbulanceServicesType getAmbulanceServicesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.AmbulanceServicesType target = null;
                target = (org.uicds.icsForm206.AmbulanceServicesType)get_store().find_element_user(AMBULANCESERVICES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AmbulanceServices" element
         */
        public int sizeOfAmbulanceServicesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AMBULANCESERVICES$10);
            }
        }
        
        /**
         * Sets array of all "AmbulanceServices" element
         */
        public void setAmbulanceServicesArray(org.uicds.icsForm206.AmbulanceServicesType[] ambulanceServicesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(ambulanceServicesArray, AMBULANCESERVICES$10);
            }
        }
        
        /**
         * Sets ith "AmbulanceServices" element
         */
        public void setAmbulanceServicesArray(int i, org.uicds.icsForm206.AmbulanceServicesType ambulanceServices)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.AmbulanceServicesType target = null;
                target = (org.uicds.icsForm206.AmbulanceServicesType)get_store().find_element_user(AMBULANCESERVICES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(ambulanceServices);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AmbulanceServices" element
         */
        public org.uicds.icsForm206.AmbulanceServicesType insertNewAmbulanceServices(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.AmbulanceServicesType target = null;
                target = (org.uicds.icsForm206.AmbulanceServicesType)get_store().insert_element_user(AMBULANCESERVICES$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AmbulanceServices" element
         */
        public org.uicds.icsForm206.AmbulanceServicesType addNewAmbulanceServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.AmbulanceServicesType target = null;
                target = (org.uicds.icsForm206.AmbulanceServicesType)get_store().add_element_user(AMBULANCESERVICES$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "AmbulanceServices" element
         */
        public void removeAmbulanceServices(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AMBULANCESERVICES$10, i);
            }
        }
        
        /**
         * Gets array of all "IncidentAmbulances" elements
         */
        public org.uicds.icsForm206.IncidentAmbulancesType[] getIncidentAmbulancesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCIDENTAMBULANCES$12, targetList);
                org.uicds.icsForm206.IncidentAmbulancesType[] result = new org.uicds.icsForm206.IncidentAmbulancesType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "IncidentAmbulances" element
         */
        public org.uicds.icsForm206.IncidentAmbulancesType getIncidentAmbulancesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.IncidentAmbulancesType target = null;
                target = (org.uicds.icsForm206.IncidentAmbulancesType)get_store().find_element_user(INCIDENTAMBULANCES$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "IncidentAmbulances" element
         */
        public int sizeOfIncidentAmbulancesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTAMBULANCES$12);
            }
        }
        
        /**
         * Sets array of all "IncidentAmbulances" element
         */
        public void setIncidentAmbulancesArray(org.uicds.icsForm206.IncidentAmbulancesType[] incidentAmbulancesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(incidentAmbulancesArray, INCIDENTAMBULANCES$12);
            }
        }
        
        /**
         * Sets ith "IncidentAmbulances" element
         */
        public void setIncidentAmbulancesArray(int i, org.uicds.icsForm206.IncidentAmbulancesType incidentAmbulances)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.IncidentAmbulancesType target = null;
                target = (org.uicds.icsForm206.IncidentAmbulancesType)get_store().find_element_user(INCIDENTAMBULANCES$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(incidentAmbulances);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IncidentAmbulances" element
         */
        public org.uicds.icsForm206.IncidentAmbulancesType insertNewIncidentAmbulances(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.IncidentAmbulancesType target = null;
                target = (org.uicds.icsForm206.IncidentAmbulancesType)get_store().insert_element_user(INCIDENTAMBULANCES$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IncidentAmbulances" element
         */
        public org.uicds.icsForm206.IncidentAmbulancesType addNewIncidentAmbulances()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.IncidentAmbulancesType target = null;
                target = (org.uicds.icsForm206.IncidentAmbulancesType)get_store().add_element_user(INCIDENTAMBULANCES$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "IncidentAmbulances" element
         */
        public void removeIncidentAmbulances(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTAMBULANCES$12, i);
            }
        }
        
        /**
         * Gets array of all "Hospitals" elements
         */
        public org.uicds.icsForm206.HospitalsType[] getHospitalsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HOSPITALS$14, targetList);
                org.uicds.icsForm206.HospitalsType[] result = new org.uicds.icsForm206.HospitalsType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Hospitals" element
         */
        public org.uicds.icsForm206.HospitalsType getHospitalsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.HospitalsType target = null;
                target = (org.uicds.icsForm206.HospitalsType)get_store().find_element_user(HOSPITALS$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Hospitals" element
         */
        public int sizeOfHospitalsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HOSPITALS$14);
            }
        }
        
        /**
         * Sets array of all "Hospitals" element
         */
        public void setHospitalsArray(org.uicds.icsForm206.HospitalsType[] hospitalsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(hospitalsArray, HOSPITALS$14);
            }
        }
        
        /**
         * Sets ith "Hospitals" element
         */
        public void setHospitalsArray(int i, org.uicds.icsForm206.HospitalsType hospitals)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.HospitalsType target = null;
                target = (org.uicds.icsForm206.HospitalsType)get_store().find_element_user(HOSPITALS$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(hospitals);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Hospitals" element
         */
        public org.uicds.icsForm206.HospitalsType insertNewHospitals(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.HospitalsType target = null;
                target = (org.uicds.icsForm206.HospitalsType)get_store().insert_element_user(HOSPITALS$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Hospitals" element
         */
        public org.uicds.icsForm206.HospitalsType addNewHospitals()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm206.HospitalsType target = null;
                target = (org.uicds.icsForm206.HospitalsType)get_store().add_element_user(HOSPITALS$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "Hospitals" element
         */
        public void removeHospitals(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HOSPITALS$14, i);
            }
        }
        
        /**
         * Gets the "MedicalEmergencyProcedures" element
         */
        public java.lang.String getMedicalEmergencyProcedures()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALEMERGENCYPROCEDURES$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MedicalEmergencyProcedures" element
         */
        public org.apache.xmlbeans.XmlString xgetMedicalEmergencyProcedures()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICALEMERGENCYPROCEDURES$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MedicalEmergencyProcedures" element
         */
        public void setMedicalEmergencyProcedures(java.lang.String medicalEmergencyProcedures)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALEMERGENCYPROCEDURES$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDICALEMERGENCYPROCEDURES$16);
                }
                target.setStringValue(medicalEmergencyProcedures);
            }
        }
        
        /**
         * Sets (as xml) the "MedicalEmergencyProcedures" element
         */
        public void xsetMedicalEmergencyProcedures(org.apache.xmlbeans.XmlString medicalEmergencyProcedures)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICALEMERGENCYPROCEDURES$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDICALEMERGENCYPROCEDURES$16);
                }
                target.set(medicalEmergencyProcedures);
            }
        }
        
        /**
         * Gets the "PreparedBy" element
         */
        public java.lang.String getPreparedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PreparedBy" element
         */
        public org.apache.xmlbeans.XmlString xgetPreparedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PreparedBy" element
         */
        public void setPreparedBy(java.lang.String preparedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAREDBY$18);
                }
                target.setStringValue(preparedBy);
            }
        }
        
        /**
         * Sets (as xml) the "PreparedBy" element
         */
        public void xsetPreparedBy(org.apache.xmlbeans.XmlString preparedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREPAREDBY$18);
                }
                target.set(preparedBy);
            }
        }
        
        /**
         * Gets the "ReviewedBy" element
         */
        public java.lang.String getReviewedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVIEWEDBY$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ReviewedBy" element
         */
        public org.apache.xmlbeans.XmlString xgetReviewedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVIEWEDBY$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ReviewedBy" element
         */
        public void setReviewedBy(java.lang.String reviewedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REVIEWEDBY$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REVIEWEDBY$20);
                }
                target.setStringValue(reviewedBy);
            }
        }
        
        /**
         * Sets (as xml) the "ReviewedBy" element
         */
        public void xsetReviewedBy(org.apache.xmlbeans.XmlString reviewedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REVIEWEDBY$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REVIEWEDBY$20);
                }
                target.set(reviewedBy);
            }
        }
    }
}
