/*
 * An XML document type.
 * Localname: DocumentTypeInfo
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.DocumentTypeInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * A document containing one DocumentTypeInfo(@http://uicds.org/ICSForm211) element.
 *
 * This is a complex type.
 */
public class DocumentTypeInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm211.DocumentTypeInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentTypeInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTTYPEINFO$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "DocumentTypeInfo");
    
    
    /**
     * Gets the "DocumentTypeInfo" element
     */
    public org.uicds.icsFormCommon.ICSFormDocumentType getDocumentTypeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsFormCommon.ICSFormDocumentType target = null;
            target = (org.uicds.icsFormCommon.ICSFormDocumentType)get_store().find_element_user(DOCUMENTTYPEINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DocumentTypeInfo" element
     */
    public void setDocumentTypeInfo(org.uicds.icsFormCommon.ICSFormDocumentType documentTypeInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsFormCommon.ICSFormDocumentType target = null;
            target = (org.uicds.icsFormCommon.ICSFormDocumentType)get_store().find_element_user(DOCUMENTTYPEINFO$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsFormCommon.ICSFormDocumentType)get_store().add_element_user(DOCUMENTTYPEINFO$0);
            }
            target.set(documentTypeInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "DocumentTypeInfo" element
     */
    public org.uicds.icsFormCommon.ICSFormDocumentType addNewDocumentTypeInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsFormCommon.ICSFormDocumentType target = null;
            target = (org.uicds.icsFormCommon.ICSFormDocumentType)get_store().add_element_user(DOCUMENTTYPEINFO$0);
            return target;
        }
    }
}
