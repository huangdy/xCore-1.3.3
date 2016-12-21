/*
 * An XML document type.
 * Localname: StringList
 * Namespace: http://uicds.org/UICDSCommon
 * Java type: org.uicds.uicdsCommon.StringListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.uicdsCommon.impl;
/**
 * A document containing one StringList(@http://uicds.org/UICDSCommon) element.
 *
 * This is a complex type.
 */
public class StringListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.uicdsCommon.StringListDocument
{
    private static final long serialVersionUID = 1L;
    
    public StringListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/UICDSCommon", "StringList");
    
    
    /**
     * Gets the "StringList" element
     */
    public org.uicds.uicdsCommon.StringListType getStringList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.uicdsCommon.StringListType target = null;
            target = (org.uicds.uicdsCommon.StringListType)get_store().find_element_user(STRINGLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StringList" element
     */
    public void setStringList(org.uicds.uicdsCommon.StringListType stringList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.uicdsCommon.StringListType target = null;
            target = (org.uicds.uicdsCommon.StringListType)get_store().find_element_user(STRINGLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.uicdsCommon.StringListType)get_store().add_element_user(STRINGLIST$0);
            }
            target.set(stringList);
        }
    }
    
    /**
     * Appends and returns a new empty "StringList" element
     */
    public org.uicds.uicdsCommon.StringListType addNewStringList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.uicdsCommon.StringListType target = null;
            target = (org.uicds.uicdsCommon.StringListType)get_store().add_element_user(STRINGLIST$0);
            return target;
        }
    }
}
