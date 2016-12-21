/*
 * XML Type:  FundingType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.FundingType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML FundingType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class FundingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.FundingType
{
    private static final long serialVersionUID = 1L;
    
    public FundingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FUNDCODE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "FundCode");
    private static final javax.xml.namespace.QName FUNDINGINFO$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "FundingInfo");
    
    
    /**
     * Gets the "FundCode" element
     */
    public java.lang.String getFundCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNDCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FundCode" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.FundCodeType xgetFundCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.FundCodeType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.FundCodeType)get_store().find_element_user(FUNDCODE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "FundCode" element
     */
    public boolean isSetFundCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNDCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "FundCode" element
     */
    public void setFundCode(java.lang.String fundCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNDCODE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FUNDCODE$0);
            }
            target.setStringValue(fundCode);
        }
    }
    
    /**
     * Sets (as xml) the "FundCode" element
     */
    public void xsetFundCode(x0.oasisNamesTcEmergencyEDXLRM1.FundCodeType fundCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.FundCodeType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.FundCodeType)get_store().find_element_user(FUNDCODE$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.FundCodeType)get_store().add_element_user(FUNDCODE$0);
            }
            target.set(fundCode);
        }
    }
    
    /**
     * Unsets the "FundCode" element
     */
    public void unsetFundCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNDCODE$0, 0);
        }
    }
    
    /**
     * Gets the "FundingInfo" element
     */
    public java.lang.String getFundingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNDINGINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FundingInfo" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.FundingInfoType xgetFundingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.FundingInfoType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.FundingInfoType)get_store().find_element_user(FUNDINGINFO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "FundingInfo" element
     */
    public boolean isSetFundingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNDINGINFO$2) != 0;
        }
    }
    
    /**
     * Sets the "FundingInfo" element
     */
    public void setFundingInfo(java.lang.String fundingInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNDINGINFO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FUNDINGINFO$2);
            }
            target.setStringValue(fundingInfo);
        }
    }
    
    /**
     * Sets (as xml) the "FundingInfo" element
     */
    public void xsetFundingInfo(x0.oasisNamesTcEmergencyEDXLRM1.FundingInfoType fundingInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.FundingInfoType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.FundingInfoType)get_store().find_element_user(FUNDINGINFO$2, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.FundingInfoType)get_store().add_element_user(FUNDINGINFO$2);
            }
            target.set(fundingInfo);
        }
    }
    
    /**
     * Unsets the "FundingInfo" element
     */
    public void unsetFundingInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNDINGINFO$2, 0);
        }
    }
}
