/*
 * XML Type:  TemporalCoverageType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML TemporalCoverageType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class TemporalCoverageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public TemporalCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEPERIOD$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "TimePeriod");
    
    
    /**
     * Gets the "TimePeriod" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType getTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType)get_store().find_element_user(TIMEPERIOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TimePeriod" element
     */
    public void setTimePeriod(mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType timePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType)get_store().find_element_user(TIMEPERIOD$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType)get_store().add_element_user(TIMEPERIOD$0);
            }
            target.set(timePeriod);
        }
    }
    
    /**
     * Appends and returns a new empty "TimePeriod" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType addNewTimePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType)get_store().add_element_user(TIMEPERIOD$0);
            return target;
        }
    }
}
