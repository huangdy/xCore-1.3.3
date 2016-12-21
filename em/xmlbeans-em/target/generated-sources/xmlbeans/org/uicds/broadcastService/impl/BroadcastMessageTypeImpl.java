/*
 * XML Type:  BroadcastMessageType
 * Namespace: http://uicds.org/BroadcastService
 * Java type: org.uicds.broadcastService.BroadcastMessageType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.broadcastService.impl;
/**
 * An XML BroadcastMessageType(@http://uicds.org/BroadcastService).
 *
 * This is a complex type.
 */
public class BroadcastMessageTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.broadcastService.BroadcastMessageType
{
    private static final long serialVersionUID = 1L;
    
    public BroadcastMessageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDXLDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "EDXLDistribution");
    
    
    /**
     * Gets the "EDXLDistribution" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution getEDXLDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EDXLDistribution" element
     */
    public void setEDXLDistribution(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution edxlDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().add_element_user(EDXLDISTRIBUTION$0);
            }
            target.set(edxlDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "EDXLDistribution" element
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
}
