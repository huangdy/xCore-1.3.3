/*
 * XML Type:  PropertiesType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.PropertiesType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * An XML PropertiesType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is a complex type.
 */
public class PropertiesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.PropertiesType
{
    private static final long serialVersionUID = 1L;
    
    public PropertiesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATED$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Created");
    private static final javax.xml.namespace.QName CREATEDBY$2 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "CreatedBy");
    private static final javax.xml.namespace.QName LASTUPDATED$4 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "LastUpdated");
    private static final javax.xml.namespace.QName LASTUPDATEDBY$6 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "LastUpdatedBy");
    private static final javax.xml.namespace.QName KILOBYTES$8 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Kilobytes");
    private static final javax.xml.namespace.QName MIMETYPE$10 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "MimeType");
    private static final javax.xml.namespace.QName ASSOCIATEDGROUPS$12 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "AssociatedGroups");
    
    
    /**
     * Gets the "Created" element
     */
    public com.saic.precis.x2009.x06.base.DateTimeType getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.DateTimeType target = null;
            target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().find_element_user(CREATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Created" element
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATED$0) != 0;
        }
    }
    
    /**
     * Sets the "Created" element
     */
    public void setCreated(com.saic.precis.x2009.x06.base.DateTimeType created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.DateTimeType target = null;
            target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().find_element_user(CREATED$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().add_element_user(CREATED$0);
            }
            target.set(created);
        }
    }
    
    /**
     * Appends and returns a new empty "Created" element
     */
    public com.saic.precis.x2009.x06.base.DateTimeType addNewCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.DateTimeType target = null;
            target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().add_element_user(CREATED$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Created" element
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATED$0, 0);
        }
    }
    
    /**
     * Gets the "CreatedBy" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType getCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(CREATEDBY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CreatedBy" element
     */
    public boolean isSetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$2) != 0;
        }
    }
    
    /**
     * Sets the "CreatedBy" element
     */
    public void setCreatedBy(com.saic.precis.x2009.x06.base.IdentifierType createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(CREATEDBY$2, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(CREATEDBY$2);
            }
            target.set(createdBy);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatedBy" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType addNewCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(CREATEDBY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "CreatedBy" element
     */
    public void unsetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$2, 0);
        }
    }
    
    /**
     * Gets the "LastUpdated" element
     */
    public com.saic.precis.x2009.x06.base.DateTimeType getLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.DateTimeType target = null;
            target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().find_element_user(LASTUPDATED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LastUpdated" element
     */
    public boolean isSetLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTUPDATED$4) != 0;
        }
    }
    
    /**
     * Sets the "LastUpdated" element
     */
    public void setLastUpdated(com.saic.precis.x2009.x06.base.DateTimeType lastUpdated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.DateTimeType target = null;
            target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().find_element_user(LASTUPDATED$4, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().add_element_user(LASTUPDATED$4);
            }
            target.set(lastUpdated);
        }
    }
    
    /**
     * Appends and returns a new empty "LastUpdated" element
     */
    public com.saic.precis.x2009.x06.base.DateTimeType addNewLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.DateTimeType target = null;
            target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().add_element_user(LASTUPDATED$4);
            return target;
        }
    }
    
    /**
     * Unsets the "LastUpdated" element
     */
    public void unsetLastUpdated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTUPDATED$4, 0);
        }
    }
    
    /**
     * Gets the "LastUpdatedBy" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType getLastUpdatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LASTUPDATEDBY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LastUpdatedBy" element
     */
    public boolean isSetLastUpdatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTUPDATEDBY$6) != 0;
        }
    }
    
    /**
     * Sets the "LastUpdatedBy" element
     */
    public void setLastUpdatedBy(com.saic.precis.x2009.x06.base.IdentifierType lastUpdatedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LASTUPDATEDBY$6, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LASTUPDATEDBY$6);
            }
            target.set(lastUpdatedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "LastUpdatedBy" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType addNewLastUpdatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LASTUPDATEDBY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "LastUpdatedBy" element
     */
    public void unsetLastUpdatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTUPDATEDBY$6, 0);
        }
    }
    
    /**
     * Gets the "Kilobytes" element
     */
    public com.saic.precis.x2009.x06.base.IntegerType getKilobytes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IntegerType target = null;
            target = (com.saic.precis.x2009.x06.base.IntegerType)get_store().find_element_user(KILOBYTES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Kilobytes" element
     */
    public boolean isSetKilobytes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KILOBYTES$8) != 0;
        }
    }
    
    /**
     * Sets the "Kilobytes" element
     */
    public void setKilobytes(com.saic.precis.x2009.x06.base.IntegerType kilobytes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IntegerType target = null;
            target = (com.saic.precis.x2009.x06.base.IntegerType)get_store().find_element_user(KILOBYTES$8, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IntegerType)get_store().add_element_user(KILOBYTES$8);
            }
            target.set(kilobytes);
        }
    }
    
    /**
     * Appends and returns a new empty "Kilobytes" element
     */
    public com.saic.precis.x2009.x06.base.IntegerType addNewKilobytes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IntegerType target = null;
            target = (com.saic.precis.x2009.x06.base.IntegerType)get_store().add_element_user(KILOBYTES$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Kilobytes" element
     */
    public void unsetKilobytes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KILOBYTES$8, 0);
        }
    }
    
    /**
     * Gets the "MimeType" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType getMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(MIMETYPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MimeType" element
     */
    public boolean isSetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMETYPE$10) != 0;
        }
    }
    
    /**
     * Sets the "MimeType" element
     */
    public void setMimeType(com.saic.precis.x2009.x06.base.CodespaceValueType mimeType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(MIMETYPE$10, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(MIMETYPE$10);
            }
            target.set(mimeType);
        }
    }
    
    /**
     * Appends and returns a new empty "MimeType" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType addNewMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(MIMETYPE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "MimeType" element
     */
    public void unsetMimeType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMETYPE$10, 0);
        }
    }
    
    /**
     * Gets the "AssociatedGroups" element
     */
    public com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups getAssociatedGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups target = null;
            target = (com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups)get_store().find_element_user(ASSOCIATEDGROUPS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AssociatedGroups" element
     */
    public boolean isSetAssociatedGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSOCIATEDGROUPS$12) != 0;
        }
    }
    
    /**
     * Sets the "AssociatedGroups" element
     */
    public void setAssociatedGroups(com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups associatedGroups)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups target = null;
            target = (com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups)get_store().find_element_user(ASSOCIATEDGROUPS$12, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups)get_store().add_element_user(ASSOCIATEDGROUPS$12);
            }
            target.set(associatedGroups);
        }
    }
    
    /**
     * Appends and returns a new empty "AssociatedGroups" element
     */
    public com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups addNewAssociatedGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups target = null;
            target = (com.saic.precis.x2009.x06.base.AssociatedGroupsDocument.AssociatedGroups)get_store().add_element_user(ASSOCIATEDGROUPS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "AssociatedGroups" element
     */
    public void unsetAssociatedGroups()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSOCIATEDGROUPS$12, 0);
        }
    }
}
