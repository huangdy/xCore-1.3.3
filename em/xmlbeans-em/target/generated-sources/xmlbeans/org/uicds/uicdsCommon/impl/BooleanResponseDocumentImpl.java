/*
 * An XML document type.
 * Localname: BooleanResponse
 * Namespace: http://uicds.org/UICDSCommon
 * Java type: org.uicds.uicdsCommon.BooleanResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.uicdsCommon.impl;
/**
 * A document containing one BooleanResponse(@http://uicds.org/UICDSCommon) element.
 *
 * This is a complex type.
 */
public class BooleanResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.uicdsCommon.BooleanResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BooleanResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEANRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/UICDSCommon", "BooleanResponse");
    
    
    /**
     * Gets the "BooleanResponse" element
     */
    public boolean getBooleanResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANRESPONSE$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "BooleanResponse" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBooleanResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANRESPONSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BooleanResponse" element
     */
    public void setBooleanResponse(boolean booleanResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANRESPONSE$0);
            }
            target.setBooleanValue(booleanResponse);
        }
    }
    
    /**
     * Sets (as xml) the "BooleanResponse" element
     */
    public void xsetBooleanResponse(org.apache.xmlbeans.XmlBoolean booleanResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEANRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEANRESPONSE$0);
            }
            target.set(booleanResponse);
        }
    }
}
