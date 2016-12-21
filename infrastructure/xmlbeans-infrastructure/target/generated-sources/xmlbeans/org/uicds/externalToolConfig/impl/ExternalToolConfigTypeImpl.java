/*
 * XML Type:  ExternalToolConfigType
 * Namespace: http://uicds.org/ExternalToolConfig
 * Java type: org.uicds.externalToolConfig.ExternalToolConfigType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.externalToolConfig.impl;
/**
 * An XML ExternalToolConfigType(@http://uicds.org/ExternalToolConfig).
 *
 * This is a complex type.
 */
public class ExternalToolConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.externalToolConfig.ExternalToolConfigType
{
    private static final long serialVersionUID = 1L;
    
    public ExternalToolConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URN$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalToolConfig", "URN");
    private static final javax.xml.namespace.QName TOOLNAME$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalToolConfig", "toolName");
    private static final javax.xml.namespace.QName CORENAME$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalToolConfig", "coreName");
    private static final javax.xml.namespace.QName PUBLISHEDPRODUCTS$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalToolConfig", "publishedProducts");
    private static final javax.xml.namespace.QName SUBSCRIBEDPRODUCTS$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalToolConfig", "subscribedProducts");
    
    
    /**
     * Gets the "URN" element
     */
    public java.lang.String getURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URN" element
     */
    public org.apache.xmlbeans.XmlString xgetURN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "URN" element
     */
    public void setURN(java.lang.String urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URN$0);
            }
            target.setStringValue(urn);
        }
    }
    
    /**
     * Sets (as xml) the "URN" element
     */
    public void xsetURN(org.apache.xmlbeans.XmlString urn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URN$0);
            }
            target.set(urn);
        }
    }
    
    /**
     * Gets the "toolName" element
     */
    public java.lang.String getToolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOLNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "toolName" element
     */
    public org.apache.xmlbeans.XmlString xgetToolName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOLNAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "toolName" element
     */
    public void setToolName(java.lang.String toolName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOOLNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOOLNAME$2);
            }
            target.setStringValue(toolName);
        }
    }
    
    /**
     * Sets (as xml) the "toolName" element
     */
    public void xsetToolName(org.apache.xmlbeans.XmlString toolName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOOLNAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOOLNAME$2);
            }
            target.set(toolName);
        }
    }
    
    /**
     * Gets the "coreName" element
     */
    public java.lang.String getCoreName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "coreName" element
     */
    public org.apache.xmlbeans.XmlString xgetCoreName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "coreName" element
     */
    public void setCoreName(java.lang.String coreName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORENAME$4);
            }
            target.setStringValue(coreName);
        }
    }
    
    /**
     * Sets (as xml) the "coreName" element
     */
    public void xsetCoreName(org.apache.xmlbeans.XmlString coreName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORENAME$4);
            }
            target.set(coreName);
        }
    }
    
    /**
     * Gets the "publishedProducts" element
     */
    public org.uicds.directoryServiceData.WorkProductTypeListType getPublishedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryServiceData.WorkProductTypeListType target = null;
            target = (org.uicds.directoryServiceData.WorkProductTypeListType)get_store().find_element_user(PUBLISHEDPRODUCTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "publishedProducts" element
     */
    public void setPublishedProducts(org.uicds.directoryServiceData.WorkProductTypeListType publishedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryServiceData.WorkProductTypeListType target = null;
            target = (org.uicds.directoryServiceData.WorkProductTypeListType)get_store().find_element_user(PUBLISHEDPRODUCTS$6, 0);
            if (target == null)
            {
                target = (org.uicds.directoryServiceData.WorkProductTypeListType)get_store().add_element_user(PUBLISHEDPRODUCTS$6);
            }
            target.set(publishedProducts);
        }
    }
    
    /**
     * Appends and returns a new empty "publishedProducts" element
     */
    public org.uicds.directoryServiceData.WorkProductTypeListType addNewPublishedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryServiceData.WorkProductTypeListType target = null;
            target = (org.uicds.directoryServiceData.WorkProductTypeListType)get_store().add_element_user(PUBLISHEDPRODUCTS$6);
            return target;
        }
    }
    
    /**
     * Gets the "subscribedProducts" element
     */
    public org.uicds.directoryServiceData.WorkProductTypeListType getSubscribedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryServiceData.WorkProductTypeListType target = null;
            target = (org.uicds.directoryServiceData.WorkProductTypeListType)get_store().find_element_user(SUBSCRIBEDPRODUCTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subscribedProducts" element
     */
    public void setSubscribedProducts(org.uicds.directoryServiceData.WorkProductTypeListType subscribedProducts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryServiceData.WorkProductTypeListType target = null;
            target = (org.uicds.directoryServiceData.WorkProductTypeListType)get_store().find_element_user(SUBSCRIBEDPRODUCTS$8, 0);
            if (target == null)
            {
                target = (org.uicds.directoryServiceData.WorkProductTypeListType)get_store().add_element_user(SUBSCRIBEDPRODUCTS$8);
            }
            target.set(subscribedProducts);
        }
    }
    
    /**
     * Appends and returns a new empty "subscribedProducts" element
     */
    public org.uicds.directoryServiceData.WorkProductTypeListType addNewSubscribedProducts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryServiceData.WorkProductTypeListType target = null;
            target = (org.uicds.directoryServiceData.WorkProductTypeListType)get_store().add_element_user(SUBSCRIBEDPRODUCTS$8);
            return target;
        }
    }
}
