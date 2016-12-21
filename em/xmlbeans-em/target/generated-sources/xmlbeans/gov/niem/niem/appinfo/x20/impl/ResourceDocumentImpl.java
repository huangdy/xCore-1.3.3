/*
 * An XML document type.
 * Localname: Resource
 * Namespace: http://niem.gov/niem/appinfo/2.0
 * Java type: gov.niem.niem.appinfo.x20.ResourceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.appinfo.x20.impl;
/**
 * A document containing one Resource(@http://niem.gov/niem/appinfo/2.0) element.
 *
 * This is a complex type.
 */
public class ResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.appinfo.x20.ResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/appinfo/2.0", "Resource");
    
    
    /**
     * Gets the "Resource" element
     */
    public gov.niem.niem.appinfo.x20.ResourceDocument.Resource getResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.appinfo.x20.ResourceDocument.Resource target = null;
            target = (gov.niem.niem.appinfo.x20.ResourceDocument.Resource)get_store().find_element_user(RESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Resource" element
     */
    public void setResource(gov.niem.niem.appinfo.x20.ResourceDocument.Resource resource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.appinfo.x20.ResourceDocument.Resource target = null;
            target = (gov.niem.niem.appinfo.x20.ResourceDocument.Resource)get_store().find_element_user(RESOURCE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.appinfo.x20.ResourceDocument.Resource)get_store().add_element_user(RESOURCE$0);
            }
            target.set(resource);
        }
    }
    
    /**
     * Appends and returns a new empty "Resource" element
     */
    public gov.niem.niem.appinfo.x20.ResourceDocument.Resource addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.appinfo.x20.ResourceDocument.Resource target = null;
            target = (gov.niem.niem.appinfo.x20.ResourceDocument.Resource)get_store().add_element_user(RESOURCE$0);
            return target;
        }
    }
    /**
     * An XML Resource(@http://niem.gov/niem/appinfo/2.0).
     *
     * This is a complex type.
     */
    public static class ResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.appinfo.x20.ResourceDocument.Resource
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://niem.gov/niem/appinfo/2.0", "name");
        
        
        /**
         * Gets the "name" attribute
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" attribute
         */
        public org.apache.xmlbeans.XmlNCName xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$0);
                return target;
            }
        }
        
        /**
         * Sets the "name" attribute
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" attribute
         */
        public void xsetName(org.apache.xmlbeans.XmlNCName name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNCName target = null;
                target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$0);
                }
                target.set(name);
            }
        }
    }
}
