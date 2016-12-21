/*
 * An XML document type.
 * Localname: OrganizationName
 * Namespace: http://uicds.org/OrganizationElement
 * Java type: org.uicds.organizationElement.OrganizationNameDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.organizationElement.impl;
/**
 * A document containing one OrganizationName(@http://uicds.org/OrganizationElement) element.
 *
 * This is a complex type.
 */
public class OrganizationNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.organizationElement.OrganizationNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONNAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "OrganizationName");
    
    
    /**
     * Gets the "OrganizationName" element
     */
    public org.uicds.organizationElement.OrganizationNameType.Enum getOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.uicds.organizationElement.OrganizationNameType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizationName" element
     */
    public org.uicds.organizationElement.OrganizationNameType xgetOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationNameType target = null;
            target = (org.uicds.organizationElement.OrganizationNameType)get_store().find_element_user(ORGANIZATIONNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganizationName" element
     */
    public void setOrganizationName(org.uicds.organizationElement.OrganizationNameType.Enum organizationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONNAME$0);
            }
            target.setEnumValue(organizationName);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizationName" element
     */
    public void xsetOrganizationName(org.uicds.organizationElement.OrganizationNameType organizationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationNameType target = null;
            target = (org.uicds.organizationElement.OrganizationNameType)get_store().find_element_user(ORGANIZATIONNAME$0, 0);
            if (target == null)
            {
                target = (org.uicds.organizationElement.OrganizationNameType)get_store().add_element_user(ORGANIZATIONNAME$0);
            }
            target.set(organizationName);
        }
    }
}
