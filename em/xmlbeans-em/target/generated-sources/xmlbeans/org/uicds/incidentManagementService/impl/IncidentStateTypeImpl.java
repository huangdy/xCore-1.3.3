/*
 * XML Type:  IncidentStateType
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.IncidentStateType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * An XML IncidentStateType(@http://uicds.org/IncidentManagementService).
 *
 * This is a complex type.
 */
public class IncidentStateTypeImpl extends gov.niem.niem.structures.x20.impl.MetadataTypeImpl implements org.uicds.incidentManagementService.IncidentStateType
{
    private static final long serialVersionUID = 1L;
    
    public IncidentStateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "state");
    
    
    /**
     * Gets the "state" element
     */
    public org.uicds.incidentManagementService.IncidentStateType.State.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.uicds.incidentManagementService.IncidentStateType.State.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "state" element
     */
    public org.uicds.incidentManagementService.IncidentStateType.State xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentStateType.State target = null;
            target = (org.uicds.incidentManagementService.IncidentStateType.State)get_store().find_element_user(STATE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "state" element
     */
    public void setState(org.uicds.incidentManagementService.IncidentStateType.State.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$0);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "state" element
     */
    public void xsetState(org.uicds.incidentManagementService.IncidentStateType.State state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentStateType.State target = null;
            target = (org.uicds.incidentManagementService.IncidentStateType.State)get_store().find_element_user(STATE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.IncidentStateType.State)get_store().add_element_user(STATE$0);
            }
            target.set(state);
        }
    }
    /**
     * An XML state(@http://uicds.org/IncidentManagementService).
     *
     * This is an atomic type that is a restriction of org.uicds.incidentManagementService.IncidentStateType$State.
     */
    public static class StateImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.uicds.incidentManagementService.IncidentStateType.State
    {
        private static final long serialVersionUID = 1L;
        
        public StateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
