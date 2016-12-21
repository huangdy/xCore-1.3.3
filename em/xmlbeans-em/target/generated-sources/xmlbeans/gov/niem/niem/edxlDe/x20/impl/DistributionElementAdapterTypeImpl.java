/*
 * XML Type:  DistributionElementAdapterType
 * Namespace: http://niem.gov/niem/edxl-de/2.0
 * Java type: gov.niem.niem.edxlDe.x20.DistributionElementAdapterType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.edxlDe.x20.impl;
/**
 * An XML DistributionElementAdapterType(@http://niem.gov/niem/edxl-de/2.0).
 *
 * This is a complex type.
 */
public class DistributionElementAdapterTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.edxlDe.x20.DistributionElementAdapterType
{
    private static final long serialVersionUID = 1L;
    
    public DistributionElementAdapterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDXLDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "EDXLDistribution");
    
    
    /**
     * Gets array of all "EDXLDistribution" elements
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[] getEDXLDistributionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EDXLDISTRIBUTION$0, targetList);
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[] result = new x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "EDXLDistribution" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution getEDXLDistributionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "EDXLDistribution" element
     */
    public int sizeOfEDXLDistributionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EDXLDISTRIBUTION$0);
        }
    }
    
    /**
     * Sets array of all "EDXLDistribution" element
     */
    public void setEDXLDistributionArray(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[] edxlDistributionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(edxlDistributionArray, EDXLDISTRIBUTION$0);
        }
    }
    
    /**
     * Sets ith "EDXLDistribution" element
     */
    public void setEDXLDistributionArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution edxlDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(edxlDistribution);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EDXLDistribution" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution insertNewEDXLDistribution(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().insert_element_user(EDXLDISTRIBUTION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EDXLDistribution" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution addNewEDXLDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().add_element_user(EDXLDISTRIBUTION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "EDXLDistribution" element
     */
    public void removeEDXLDistribution(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EDXLDISTRIBUTION$0, i);
        }
    }
}
