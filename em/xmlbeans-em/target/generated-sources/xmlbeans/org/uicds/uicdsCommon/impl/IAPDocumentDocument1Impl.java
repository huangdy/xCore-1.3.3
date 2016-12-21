/*
 * An XML document type.
 * Localname: IAPDocument
 * Namespace: http://uicds.org/UICDSCommon
 * Java type: org.uicds.uicdsCommon.IAPDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package org.uicds.uicdsCommon.impl;
/**
 * A document containing one IAPDocument(@http://uicds.org/UICDSCommon) element.
 *
 * This is a complex type.
 */
public class IAPDocumentDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.uicdsCommon.IAPDocumentDocument1
{
    private static final long serialVersionUID = 1L;
    
    public IAPDocumentDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IAPDOCUMENT$0 = 
        new javax.xml.namespace.QName("http://uicds.org/UICDSCommon", "IAPDocument");
    
    
    /**
     * Gets the "IAPDocument" element
     */
    public org.uicds.uicdsCommon.DocumentType getIAPDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.uicdsCommon.DocumentType target = null;
            target = (org.uicds.uicdsCommon.DocumentType)get_store().find_element_user(IAPDOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IAPDocument" element
     */
    public void setIAPDocument(org.uicds.uicdsCommon.DocumentType iapDocument)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.uicdsCommon.DocumentType target = null;
            target = (org.uicds.uicdsCommon.DocumentType)get_store().find_element_user(IAPDOCUMENT$0, 0);
            if (target == null)
            {
                target = (org.uicds.uicdsCommon.DocumentType)get_store().add_element_user(IAPDOCUMENT$0);
            }
            target.set(iapDocument);
        }
    }
    
    /**
     * Appends and returns a new empty "IAPDocument" element
     */
    public org.uicds.uicdsCommon.DocumentType addNewIAPDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.uicdsCommon.DocumentType target = null;
            target = (org.uicds.uicdsCommon.DocumentType)get_store().add_element_user(IAPDOCUMENT$0);
            return target;
        }
    }
}
