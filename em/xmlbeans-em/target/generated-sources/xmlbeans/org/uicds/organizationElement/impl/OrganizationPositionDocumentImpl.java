/*
 * An XML document type.
 * Localname: OrganizationPosition
 * Namespace: http://uicds.org/OrganizationElement
 * Java type: org.uicds.organizationElement.OrganizationPositionDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.organizationElement.impl;
/**
 * A document containing one OrganizationPosition(@http://uicds.org/OrganizationElement) element.
 *
 * This is a complex type.
 */
public class OrganizationPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.organizationElement.OrganizationPositionDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONPOSITION$0 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "OrganizationPosition");
    
    
    /**
     * Gets the "OrganizationPosition" element
     */
    public org.uicds.organizationElement.OrganizationPositionType getOrganizationPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().find_element_user(ORGANIZATIONPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganizationPosition" element
     */
    public void setOrganizationPosition(org.uicds.organizationElement.OrganizationPositionType organizationPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().find_element_user(ORGANIZATIONPOSITION$0, 0);
            if (target == null)
            {
                target = (org.uicds.organizationElement.OrganizationPositionType)get_store().add_element_user(ORGANIZATIONPOSITION$0);
            }
            target.set(organizationPosition);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationPosition" element
     */
    public org.uicds.organizationElement.OrganizationPositionType addNewOrganizationPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationPositionType target = null;
            target = (org.uicds.organizationElement.OrganizationPositionType)get_store().add_element_user(ORGANIZATIONPOSITION$0);
            return target;
        }
    }
}
