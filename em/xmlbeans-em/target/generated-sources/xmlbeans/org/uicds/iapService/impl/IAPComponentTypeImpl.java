/*
 * XML Type:  IAPComponentType
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.IAPComponentType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * An XML IAPComponentType(@http://uicds.org/IAPService).
 *
 * This is a complex type.
 */
public class IAPComponentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.IAPComponentType
{
    private static final long serialVersionUID = 1L;
    
    public IAPComponentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENTIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "ComponentIdentifier");
    private static final javax.xml.namespace.QName COMPLETIONTASKIDENTIFICATION$2 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "CompletionTaskIdentification");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "Description");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "Status");
    
    
    /**
     * Gets the "ComponentIdentifier" element
     */
    public org.uicds.iapService.IAPComponentType.ComponentIdentifier getComponentIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType.ComponentIdentifier target = null;
            target = (org.uicds.iapService.IAPComponentType.ComponentIdentifier)get_store().find_element_user(COMPONENTIDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ComponentIdentifier" element
     */
    public void setComponentIdentifier(org.uicds.iapService.IAPComponentType.ComponentIdentifier componentIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType.ComponentIdentifier target = null;
            target = (org.uicds.iapService.IAPComponentType.ComponentIdentifier)get_store().find_element_user(COMPONENTIDENTIFIER$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.IAPComponentType.ComponentIdentifier)get_store().add_element_user(COMPONENTIDENTIFIER$0);
            }
            target.set(componentIdentifier);
        }
    }
    
    /**
     * Appends and returns a new empty "ComponentIdentifier" element
     */
    public org.uicds.iapService.IAPComponentType.ComponentIdentifier addNewComponentIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType.ComponentIdentifier target = null;
            target = (org.uicds.iapService.IAPComponentType.ComponentIdentifier)get_store().add_element_user(COMPONENTIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Gets the "CompletionTaskIdentification" element
     */
    public org.uicds.iapService.IAPComponentType.CompletionTaskIdentification getCompletionTaskIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType.CompletionTaskIdentification target = null;
            target = (org.uicds.iapService.IAPComponentType.CompletionTaskIdentification)get_store().find_element_user(COMPLETIONTASKIDENTIFICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompletionTaskIdentification" element
     */
    public void setCompletionTaskIdentification(org.uicds.iapService.IAPComponentType.CompletionTaskIdentification completionTaskIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType.CompletionTaskIdentification target = null;
            target = (org.uicds.iapService.IAPComponentType.CompletionTaskIdentification)get_store().find_element_user(COMPLETIONTASKIDENTIFICATION$2, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.IAPComponentType.CompletionTaskIdentification)get_store().add_element_user(COMPLETIONTASKIDENTIFICATION$2);
            }
            target.set(completionTaskIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "CompletionTaskIdentification" element
     */
    public org.uicds.iapService.IAPComponentType.CompletionTaskIdentification addNewCompletionTaskIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType.CompletionTaskIdentification target = null;
            target = (org.uicds.iapService.IAPComponentType.CompletionTaskIdentification)get_store().add_element_user(COMPLETIONTASKIDENTIFICATION$2);
            return target;
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "Status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$6);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$6);
            }
            target.set(status);
        }
    }
    /**
     * An XML ComponentIdentifier(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class ComponentIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.IAPComponentType.ComponentIdentifier
    {
        private static final long serialVersionUID = 1L;
        
        public ComponentIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
    }
    /**
     * An XML CompletionTaskIdentification(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class CompletionTaskIdentificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.IAPComponentType.CompletionTaskIdentification
    {
        private static final long serialVersionUID = 1L;
        
        public CompletionTaskIdentificationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
    }
}
