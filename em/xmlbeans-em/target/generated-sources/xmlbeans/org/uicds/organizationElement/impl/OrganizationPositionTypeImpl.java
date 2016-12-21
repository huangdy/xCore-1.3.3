/*
 * XML Type:  OrganizationPositionType
 * Namespace: http://uicds.org/OrganizationElement
 * Java type: org.uicds.organizationElement.OrganizationPositionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.organizationElement.impl;
/**
 * An XML OrganizationPositionType(@http://uicds.org/OrganizationElement).
 *
 * This is a complex type.
 */
public class OrganizationPositionTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.organizationElement.OrganizationPositionType
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationPositionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROLEPROFILEREF$0 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "RoleProfileRef");
    private static final javax.xml.namespace.QName PERSONPROFILEREF$2 = 
        new javax.xml.namespace.QName("http://uicds.org/OrganizationElement", "PersonProfileRef");
    
    
    /**
     * Gets the "RoleProfileRef" element
     */
    public java.lang.String getRoleProfileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLEPROFILEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RoleProfileRef" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRoleProfileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ROLEPROFILEREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RoleProfileRef" element
     */
    public void setRoleProfileRef(java.lang.String roleProfileRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ROLEPROFILEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ROLEPROFILEREF$0);
            }
            target.setStringValue(roleProfileRef);
        }
    }
    
    /**
     * Sets (as xml) the "RoleProfileRef" element
     */
    public void xsetRoleProfileRef(org.apache.xmlbeans.XmlAnyURI roleProfileRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ROLEPROFILEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ROLEPROFILEREF$0);
            }
            target.set(roleProfileRef);
        }
    }
    
    /**
     * Gets the "PersonProfileRef" element
     */
    public java.lang.String getPersonProfileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONPROFILEREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PersonProfileRef" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetPersonProfileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PERSONPROFILEREF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PersonProfileRef" element
     */
    public void setPersonProfileRef(java.lang.String personProfileRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONPROFILEREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONPROFILEREF$2);
            }
            target.setStringValue(personProfileRef);
        }
    }
    
    /**
     * Sets (as xml) the "PersonProfileRef" element
     */
    public void xsetPersonProfileRef(org.apache.xmlbeans.XmlAnyURI personProfileRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(PERSONPROFILEREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(PERSONPROFILEREF$2);
            }
            target.set(personProfileRef);
        }
    }
}
