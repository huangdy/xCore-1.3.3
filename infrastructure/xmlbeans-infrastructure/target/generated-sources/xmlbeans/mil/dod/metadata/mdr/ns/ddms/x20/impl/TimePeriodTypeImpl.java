/*
 * XML Type:  TimePeriodType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML TimePeriodType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class TimePeriodTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.TimePeriodType
{
    private static final long serialVersionUID = 1L;
    
    public TimePeriodTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "name");
    private static final javax.xml.namespace.QName START$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "start");
    private static final javax.xml.namespace.QName END$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "end");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "start" element
     */
    public java.lang.Object getStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "start" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType xgetStart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType)get_store().find_element_user(START$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "start" element
     */
    public void setStart(java.lang.Object start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$2);
            }
            target.setObjectValue(start);
        }
    }
    
    /**
     * Sets (as xml) the "start" element
     */
    public void xsetStart(mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType start)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType)get_store().find_element_user(START$2, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType)get_store().add_element_user(START$2);
            }
            target.set(start);
        }
    }
    
    /**
     * Gets the "end" element
     */
    public java.lang.Object getEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "end" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType xgetEnd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType)get_store().find_element_user(END$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "end" element
     */
    public void setEnd(java.lang.Object end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(END$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(END$4);
            }
            target.setObjectValue(end);
        }
    }
    
    /**
     * Sets (as xml) the "end" element
     */
    public void xsetEnd(mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType end)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType)get_store().find_element_user(END$4, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType)get_store().add_element_user(END$4);
            }
            target.set(end);
        }
    }
}
