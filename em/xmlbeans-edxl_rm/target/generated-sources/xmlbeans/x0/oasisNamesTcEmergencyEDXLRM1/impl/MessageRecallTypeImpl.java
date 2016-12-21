/*
 * XML Type:  MessageRecallType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML MessageRecallType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class MessageRecallTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType
{
    private static final long serialVersionUID = 1L;
    
    public MessageRecallTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECALLMESSAGEID$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "RecallMessageID");
    private static final javax.xml.namespace.QName RECALLTYPE$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "RecallType");
    
    
    /**
     * Gets the "RecallMessageID" element
     */
    public java.lang.String getRecallMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECALLMESSAGEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecallMessageID" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType xgetRecallMessageID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().find_element_user(RECALLMESSAGEID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RecallMessageID" element
     */
    public void setRecallMessageID(java.lang.String recallMessageID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECALLMESSAGEID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECALLMESSAGEID$0);
            }
            target.setStringValue(recallMessageID);
        }
    }
    
    /**
     * Sets (as xml) the "RecallMessageID" element
     */
    public void xsetRecallMessageID(x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType recallMessageID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().find_element_user(RECALLMESSAGEID$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().add_element_user(RECALLMESSAGEID$0);
            }
            target.set(recallMessageID);
        }
    }
    
    /**
     * Gets the "RecallType" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType.Enum getRecallType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECALLTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RecallType" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType xgetRecallType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType)get_store().find_element_user(RECALLTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RecallType" element
     */
    public void setRecallType(x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType.Enum recallType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECALLTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECALLTYPE$2);
            }
            target.setEnumValue(recallType);
        }
    }
    
    /**
     * Sets (as xml) the "RecallType" element
     */
    public void xsetRecallType(x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType recallType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType)get_store().find_element_user(RECALLTYPE$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.RecallTypeType)get_store().add_element_user(RECALLTYPE$2);
            }
            target.set(recallType);
        }
    }
}
