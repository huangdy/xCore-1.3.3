/*
 * XML Type:  IdentificationType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.IdentificationType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * An XML IdentificationType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is a complex type.
 */
public class IdentificationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.IdentificationType
{
    private static final long serialVersionUID = 1L;
    
    public IdentificationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Identifier");
    private static final javax.xml.namespace.QName VERSION$2 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Version");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Type");
    private static final javax.xml.namespace.QName CHECKSUM$6 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Checksum");
    private static final javax.xml.namespace.QName STATE$8 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "State");
    
    
    /**
     * Gets the "Identifier" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Identifier" element
     */
    public void setIdentifier(com.saic.precis.x2009.x06.base.IdentifierType identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
            }
            target.set(identifier);
        }
    }
    
    /**
     * Appends and returns a new empty "Identifier" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "Version" element
     */
    public com.saic.precis.x2009.x06.base.VersionType getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.VersionType target = null;
            target = (com.saic.precis.x2009.x06.base.VersionType)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(com.saic.precis.x2009.x06.base.VersionType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.VersionType target = null;
            target = (com.saic.precis.x2009.x06.base.VersionType)get_store().find_element_user(VERSION$2, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.VersionType)get_store().add_element_user(VERSION$2);
            }
            target.set(version);
        }
    }
    
    /**
     * Appends and returns a new empty "Version" element
     */
    public com.saic.precis.x2009.x06.base.VersionType addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.VersionType target = null;
            target = (com.saic.precis.x2009.x06.base.VersionType)get_store().add_element_user(VERSION$2);
            return target;
        }
    }
    
    /**
     * Gets the "Type" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(com.saic.precis.x2009.x06.base.CodespaceValueType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(TYPE$4, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "Type" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Gets the "Checksum" element
     */
    public com.saic.precis.x2009.x06.base.ChecksumType getChecksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ChecksumType target = null;
            target = (com.saic.precis.x2009.x06.base.ChecksumType)get_store().find_element_user(CHECKSUM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Checksum" element
     */
    public void setChecksum(com.saic.precis.x2009.x06.base.ChecksumType checksum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ChecksumType target = null;
            target = (com.saic.precis.x2009.x06.base.ChecksumType)get_store().find_element_user(CHECKSUM$6, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.ChecksumType)get_store().add_element_user(CHECKSUM$6);
            }
            target.set(checksum);
        }
    }
    
    /**
     * Appends and returns a new empty "Checksum" element
     */
    public com.saic.precis.x2009.x06.base.ChecksumType addNewChecksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ChecksumType target = null;
            target = (com.saic.precis.x2009.x06.base.ChecksumType)get_store().add_element_user(CHECKSUM$6);
            return target;
        }
    }
    
    /**
     * Gets the "State" element
     */
    public com.saic.precis.x2009.x06.base.StateType.Enum getState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.saic.precis.x2009.x06.base.StateType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "State" element
     */
    public com.saic.precis.x2009.x06.base.StateType xgetState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.StateType target = null;
            target = (com.saic.precis.x2009.x06.base.StateType)get_store().find_element_user(STATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "State" element
     */
    public void setState(com.saic.precis.x2009.x06.base.StateType.Enum state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATE$8);
            }
            target.setEnumValue(state);
        }
    }
    
    /**
     * Sets (as xml) the "State" element
     */
    public void xsetState(com.saic.precis.x2009.x06.base.StateType state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.StateType target = null;
            target = (com.saic.precis.x2009.x06.base.StateType)get_store().find_element_user(STATE$8, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.StateType)get_store().add_element_user(STATE$8);
            }
            target.set(state);
        }
    }
}
