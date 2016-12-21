/*
 * XML Type:  ResponseInformationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML ResponseInformationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class ResponseInformationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType
{
    private static final long serialVersionUID = 1L;
    
    public ResponseInformationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRECEDINGRESOURCEINFOELEMENTID$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "PrecedingResourceInfoElementID");
    private static final javax.xml.namespace.QName RESPONSETYPE$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "ResponseType");
    private static final javax.xml.namespace.QName REASONCODE$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "ReasonCode");
    private static final javax.xml.namespace.QName RESPONSEREASON$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "ResponseReason");
    
    
    /**
     * Gets the "PrecedingResourceInfoElementID" element
     */
    public java.lang.String getPrecedingResourceInfoElementID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECEDINGRESOURCEINFOELEMENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrecedingResourceInfoElementID" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType xgetPrecedingResourceInfoElementID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType)get_store().find_element_user(PRECEDINGRESOURCEINFOELEMENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PrecedingResourceInfoElementID" element
     */
    public void setPrecedingResourceInfoElementID(java.lang.String precedingResourceInfoElementID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECEDINGRESOURCEINFOELEMENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECEDINGRESOURCEINFOELEMENTID$0);
            }
            target.setStringValue(precedingResourceInfoElementID);
        }
    }
    
    /**
     * Sets (as xml) the "PrecedingResourceInfoElementID" element
     */
    public void xsetPrecedingResourceInfoElementID(x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType precedingResourceInfoElementID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType)get_store().find_element_user(PRECEDINGRESOURCEINFOELEMENTID$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType)get_store().add_element_user(PRECEDINGRESOURCEINFOELEMENTID$0);
            }
            target.set(precedingResourceInfoElementID);
        }
    }
    
    /**
     * Gets the "ResponseType" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType.Enum getResponseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSETYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResponseType" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType xgetResponseType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType)get_store().find_element_user(RESPONSETYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResponseType" element
     */
    public void setResponseType(x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType.Enum responseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSETYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSETYPE$2);
            }
            target.setEnumValue(responseType);
        }
    }
    
    /**
     * Sets (as xml) the "ResponseType" element
     */
    public void xsetResponseType(x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType responseType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType)get_store().find_element_user(RESPONSETYPE$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseTypeType)get_store().add_element_user(RESPONSETYPE$2);
            }
            target.set(responseType);
        }
    }
    
    /**
     * Gets the "ReasonCode" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(REASONCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ReasonCode" element
     */
    public boolean isSetReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REASONCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "ReasonCode" element
     */
    public void setReasonCode(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType reasonCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(REASONCODE$4, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(REASONCODE$4);
            }
            target.set(reasonCode);
        }
    }
    
    /**
     * Appends and returns a new empty "ReasonCode" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(REASONCODE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ReasonCode" element
     */
    public void unsetReasonCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REASONCODE$4, 0);
        }
    }
    
    /**
     * Gets the "ResponseReason" element
     */
    public java.lang.String getResponseReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEREASON$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResponseReason" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.ResponseReasonType xgetResponseReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ResponseReasonType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseReasonType)get_store().find_element_user(RESPONSEREASON$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ResponseReason" element
     */
    public boolean isSetResponseReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONSEREASON$6) != 0;
        }
    }
    
    /**
     * Sets the "ResponseReason" element
     */
    public void setResponseReason(java.lang.String responseReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSEREASON$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSEREASON$6);
            }
            target.setStringValue(responseReason);
        }
    }
    
    /**
     * Sets (as xml) the "ResponseReason" element
     */
    public void xsetResponseReason(x0.oasisNamesTcEmergencyEDXLRM1.ResponseReasonType responseReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.ResponseReasonType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseReasonType)get_store().find_element_user(RESPONSEREASON$6, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseReasonType)get_store().add_element_user(RESPONSEREASON$6);
            }
            target.set(responseReason);
        }
    }
    
    /**
     * Unsets the "ResponseReason" element
     */
    public void unsetResponseReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONSEREASON$6, 0);
        }
    }
}
