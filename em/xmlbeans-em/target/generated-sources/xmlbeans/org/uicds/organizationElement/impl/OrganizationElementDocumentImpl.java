/*
 * An XML document type.
 * Localname: OrganizationElement
 * Namespace: http://uicds.org/OrganizationElement
 * Java type: org.uicds.organizationElement.OrganizationElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.organizationElement.impl;
/**
 * A document containing one OrganizationElement(@http://uicds.org/OrganizationElement) element.
 *
 * This is a complex type.
 */
public class OrganizationElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.organizationElement.OrganizationElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONELEMENT$0 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "OrganizationElement");
    
    
    /**
     * Gets the "OrganizationElement" element
     */
    public org.uicds.organizationElement.OrganizationElementType getOrganizationElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationElementType target = null;
            target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(ORGANIZATIONELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OrganizationElement" element
     */
    public void setOrganizationElement(org.uicds.organizationElement.OrganizationElementType organizationElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationElementType target = null;
            target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(ORGANIZATIONELEMENT$0, 0);
            if (target == null)
            {
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().add_element_user(ORGANIZATIONELEMENT$0);
            }
            target.set(organizationElement);
        }
    }
    
    /**
     * Appends and returns a new empty "OrganizationElement" element
     */
    public org.uicds.organizationElement.OrganizationElementType addNewOrganizationElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.organizationElement.OrganizationElementType target = null;
            target = (org.uicds.organizationElement.OrganizationElementType)get_store().add_element_user(ORGANIZATIONELEMENT$0);
            return target;
        }
    }
}
