/*
 * An XML document type.
 * Localname: OrganizatioinType
 * Namespace: http://uicds.org/OrganizationElement
 * Java type: org.uicds.organizationElement.OrganizatioinTypeDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.organizationElement.impl;
/**
 * A document containing one OrganizatioinType(@http://uicds.org/OrganizationElement) element.
 *
 * This is a complex type.
 */
public class OrganizatioinTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.organizationElement.OrganizatioinTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizatioinTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIOINTYPE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "OrganizatioinType");
    
    
    /**
     * Gets the "OrganizatioinType" element
     */
    public org.uicds.organizationElement.OrganizationTypeType.Enum getOrganizatioinType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIOINTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.uicds.organizationElement.OrganizationTypeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizatioinType" element
     */
    public org.uicds.organizationElement.OrganizationTypeType xgetOrganizatioinType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationTypeType target = null;
            target = (org.uicds.organizationElement.OrganizationTypeType)get_store().find_element_user(ORGANIZATIOINTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganizatioinType" element
     */
    public void setOrganizatioinType(org.uicds.organizationElement.OrganizationTypeType.Enum organizatioinType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIOINTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIOINTYPE$0);
            }
            target.setEnumValue(organizatioinType);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizatioinType" element
     */
    public void xsetOrganizatioinType(org.uicds.organizationElement.OrganizationTypeType organizatioinType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationTypeType target = null;
            target = (org.uicds.organizationElement.OrganizationTypeType)get_store().find_element_user(ORGANIZATIOINTYPE$0, 0);
            if (target == null)
            {
                target = (org.uicds.organizationElement.OrganizationTypeType)get_store().add_element_user(ORGANIZATIOINTYPE$0);
            }
            target.set(organizatioinType);
        }
    }
}
