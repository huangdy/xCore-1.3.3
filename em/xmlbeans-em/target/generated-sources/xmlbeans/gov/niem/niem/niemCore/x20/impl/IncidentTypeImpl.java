/*
 * XML Type:  IncidentType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IncidentType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML IncidentType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class IncidentTypeImpl extends gov.niem.niem.niemCore.x20.impl.ActivityTypeImpl implements gov.niem.niem.niemCore.x20.IncidentType
{
    private static final long serialVersionUID = 1L;
    
    public IncidentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTLOCATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IncidentLocation");
    private static final javax.xml.namespace.QName INCIDENTEVENT$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IncidentEvent");
    private static final javax.xml.namespace.QName INCIDENTJURISDICTIONALORGANIZATION$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IncidentJurisdictionalOrganization");
    private static final javax.xml.namespace.QName INCIDENTOBSERVATIONTEXT$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IncidentObservationText");
    
    
    /**
     * Gets array of all "IncidentLocation" elements
     */
    public gov.niem.niem.niemCore.x20.LocationType[] getIncidentLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCIDENTLOCATION$0, targetList);
            gov.niem.niem.niemCore.x20.LocationType[] result = new gov.niem.niem.niemCore.x20.LocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IncidentLocation" element
     */
    public gov.niem.niem.niemCore.x20.LocationType getIncidentLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(INCIDENTLOCATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "IncidentLocation" element
     */
    public boolean isNilIncidentLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(INCIDENTLOCATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "IncidentLocation" element
     */
    public int sizeOfIncidentLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTLOCATION$0);
        }
    }
    
    /**
     * Sets array of all "IncidentLocation" element
     */
    public void setIncidentLocationArray(gov.niem.niem.niemCore.x20.LocationType[] incidentLocationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(incidentLocationArray, INCIDENTLOCATION$0);
        }
    }
    
    /**
     * Sets ith "IncidentLocation" element
     */
    public void setIncidentLocationArray(int i, gov.niem.niem.niemCore.x20.LocationType incidentLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(INCIDENTLOCATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(incidentLocation);
        }
    }
    
    /**
     * Nils the ith "IncidentLocation" element
     */
    public void setNilIncidentLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(INCIDENTLOCATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncidentLocation" element
     */
    public gov.niem.niem.niemCore.x20.LocationType insertNewIncidentLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().insert_element_user(INCIDENTLOCATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncidentLocation" element
     */
    public gov.niem.niem.niemCore.x20.LocationType addNewIncidentLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().add_element_user(INCIDENTLOCATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "IncidentLocation" element
     */
    public void removeIncidentLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTLOCATION$0, i);
        }
    }
    
    /**
     * Gets array of all "IncidentEvent" elements
     */
    public gov.niem.niem.niemCore.x20.ActivityType[] getIncidentEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCIDENTEVENT$2, targetList);
            gov.niem.niem.niemCore.x20.ActivityType[] result = new gov.niem.niem.niemCore.x20.ActivityType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IncidentEvent" element
     */
    public gov.niem.niem.niemCore.x20.ActivityType getIncidentEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().find_element_user(INCIDENTEVENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "IncidentEvent" element
     */
    public boolean isNilIncidentEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().find_element_user(INCIDENTEVENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "IncidentEvent" element
     */
    public int sizeOfIncidentEventArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTEVENT$2);
        }
    }
    
    /**
     * Sets array of all "IncidentEvent" element
     */
    public void setIncidentEventArray(gov.niem.niem.niemCore.x20.ActivityType[] incidentEventArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(incidentEventArray, INCIDENTEVENT$2);
        }
    }
    
    /**
     * Sets ith "IncidentEvent" element
     */
    public void setIncidentEventArray(int i, gov.niem.niem.niemCore.x20.ActivityType incidentEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().find_element_user(INCIDENTEVENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(incidentEvent);
        }
    }
    
    /**
     * Nils the ith "IncidentEvent" element
     */
    public void setNilIncidentEventArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().find_element_user(INCIDENTEVENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncidentEvent" element
     */
    public gov.niem.niem.niemCore.x20.ActivityType insertNewIncidentEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().insert_element_user(INCIDENTEVENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncidentEvent" element
     */
    public gov.niem.niem.niemCore.x20.ActivityType addNewIncidentEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ActivityType target = null;
            target = (gov.niem.niem.niemCore.x20.ActivityType)get_store().add_element_user(INCIDENTEVENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "IncidentEvent" element
     */
    public void removeIncidentEvent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTEVENT$2, i);
        }
    }
    
    /**
     * Gets array of all "IncidentJurisdictionalOrganization" elements
     */
    public gov.niem.niem.niemCore.x20.OrganizationType[] getIncidentJurisdictionalOrganizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCIDENTJURISDICTIONALORGANIZATION$4, targetList);
            gov.niem.niem.niemCore.x20.OrganizationType[] result = new gov.niem.niem.niemCore.x20.OrganizationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IncidentJurisdictionalOrganization" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType getIncidentJurisdictionalOrganizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(INCIDENTJURISDICTIONALORGANIZATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "IncidentJurisdictionalOrganization" element
     */
    public boolean isNilIncidentJurisdictionalOrganizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(INCIDENTJURISDICTIONALORGANIZATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "IncidentJurisdictionalOrganization" element
     */
    public int sizeOfIncidentJurisdictionalOrganizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTJURISDICTIONALORGANIZATION$4);
        }
    }
    
    /**
     * Sets array of all "IncidentJurisdictionalOrganization" element
     */
    public void setIncidentJurisdictionalOrganizationArray(gov.niem.niem.niemCore.x20.OrganizationType[] incidentJurisdictionalOrganizationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(incidentJurisdictionalOrganizationArray, INCIDENTJURISDICTIONALORGANIZATION$4);
        }
    }
    
    /**
     * Sets ith "IncidentJurisdictionalOrganization" element
     */
    public void setIncidentJurisdictionalOrganizationArray(int i, gov.niem.niem.niemCore.x20.OrganizationType incidentJurisdictionalOrganization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(INCIDENTJURISDICTIONALORGANIZATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(incidentJurisdictionalOrganization);
        }
    }
    
    /**
     * Nils the ith "IncidentJurisdictionalOrganization" element
     */
    public void setNilIncidentJurisdictionalOrganizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(INCIDENTJURISDICTIONALORGANIZATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncidentJurisdictionalOrganization" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType insertNewIncidentJurisdictionalOrganization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().insert_element_user(INCIDENTJURISDICTIONALORGANIZATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncidentJurisdictionalOrganization" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType addNewIncidentJurisdictionalOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().add_element_user(INCIDENTJURISDICTIONALORGANIZATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "IncidentJurisdictionalOrganization" element
     */
    public void removeIncidentJurisdictionalOrganization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTJURISDICTIONALORGANIZATION$4, i);
        }
    }
    
    /**
     * Gets array of all "IncidentObservationText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getIncidentObservationTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCIDENTOBSERVATIONTEXT$6, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IncidentObservationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getIncidentObservationTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INCIDENTOBSERVATIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "IncidentObservationText" element
     */
    public boolean isNilIncidentObservationTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INCIDENTOBSERVATIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "IncidentObservationText" element
     */
    public int sizeOfIncidentObservationTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTOBSERVATIONTEXT$6);
        }
    }
    
    /**
     * Sets array of all "IncidentObservationText" element
     */
    public void setIncidentObservationTextArray(gov.niem.niem.niemCore.x20.TextType[] incidentObservationTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(incidentObservationTextArray, INCIDENTOBSERVATIONTEXT$6);
        }
    }
    
    /**
     * Sets ith "IncidentObservationText" element
     */
    public void setIncidentObservationTextArray(int i, gov.niem.niem.niemCore.x20.TextType incidentObservationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INCIDENTOBSERVATIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(incidentObservationText);
        }
    }
    
    /**
     * Nils the ith "IncidentObservationText" element
     */
    public void setNilIncidentObservationTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(INCIDENTOBSERVATIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncidentObservationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewIncidentObservationText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(INCIDENTOBSERVATIONTEXT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncidentObservationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewIncidentObservationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(INCIDENTOBSERVATIONTEXT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "IncidentObservationText" element
     */
    public void removeIncidentObservationText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTOBSERVATIONTEXT$6, i);
        }
    }
}
