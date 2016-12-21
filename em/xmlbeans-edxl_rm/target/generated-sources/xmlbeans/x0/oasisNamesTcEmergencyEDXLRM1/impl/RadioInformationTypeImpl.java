/*
 * XML Type:  RadioInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML RadioInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class RadioInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.RadioInformationType
{
    private static final long serialVersionUID = 1L;
    
    public RadioInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RADIOTYPE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "RadioType");
    private static final javax.xml.namespace.QName RADIOCHANNEL$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "RadioChannel");
    
    
    /**
     * Gets the "RadioType" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getRadioType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(RADIOTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RadioType" element
     */
    public void setRadioType(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType radioType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(RADIOTYPE$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(RADIOTYPE$0);
            }
            target.set(radioType);
        }
    }
    
    /**
     * Appends and returns a new empty "RadioType" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewRadioType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(RADIOTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "RadioChannel" element
     */
    public java.lang.String getRadioChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIOCHANNEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RadioChannel" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.RadioChannelType xgetRadioChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.RadioChannelType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.RadioChannelType)get_store().find_element_user(RADIOCHANNEL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RadioChannel" element
     */
    public void setRadioChannel(java.lang.String radioChannel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RADIOCHANNEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RADIOCHANNEL$2);
            }
            target.setStringValue(radioChannel);
        }
    }
    
    /**
     * Sets (as xml) the "RadioChannel" element
     */
    public void xsetRadioChannel(x0.oasisNamesTcEmergencyEDXLRM1.RadioChannelType radioChannel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.RadioChannelType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.RadioChannelType)get_store().find_element_user(RADIOCHANNEL$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.RadioChannelType)get_store().add_element_user(RADIOCHANNEL$2);
            }
            target.set(radioChannel);
        }
    }
}
