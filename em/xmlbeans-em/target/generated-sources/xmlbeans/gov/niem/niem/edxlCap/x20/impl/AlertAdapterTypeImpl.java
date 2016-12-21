/*
 * XML Type:  AlertAdapterType
 * Namespace: http://niem.gov/niem/edxl-cap/2.0
 * Java type: gov.niem.niem.edxlCap.x20.AlertAdapterType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.edxlCap.x20.impl;
/**
 * An XML AlertAdapterType(@http://niem.gov/niem/edxl-cap/2.0).
 *
 * This is a complex type.
 */
public class AlertAdapterTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.edxlCap.x20.AlertAdapterType
{
    private static final long serialVersionUID = 1L;
    
    public AlertAdapterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALERT$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "alert");
    
    
    /**
     * Gets array of all "alert" elements
     */
    public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[] getAlertArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALERT$0, targetList);
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[] result = new x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "alert" element
     */
    public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert getAlertArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
            target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "alert" element
     */
    public int sizeOfAlertArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALERT$0);
        }
    }
    
    /**
     * Sets array of all "alert" element
     */
    public void setAlertArray(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert[] alertArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alertArray, ALERT$0);
        }
    }
    
    /**
     * Sets ith "alert" element
     */
    public void setAlertArray(int i, x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert alert)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
            target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alert);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alert" element
     */
    public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert insertNewAlert(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
            target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().insert_element_user(ALERT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alert" element
     */
    public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert addNewAlert()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
            target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().add_element_user(ALERT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "alert" element
     */
    public void removeAlert(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALERT$0, i);
        }
    }
}
