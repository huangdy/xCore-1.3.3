/*
 * An XML document type.
 * Localname: Deprecated
 * Namespace: http://niem.gov/niem/appinfo/2.0
 * Java type: gov.niem.niem.appinfo.x20.DeprecatedDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.appinfo.x20.impl;
/**
 * A document containing one Deprecated(@http://niem.gov/niem/appinfo/2.0) element.
 *
 * This is a complex type.
 */
public class DeprecatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.appinfo.x20.DeprecatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeprecatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEPRECATED$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/appinfo/2.0", "Deprecated");
    
    
    /**
     * Gets the "Deprecated" element
     */
    public gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated getDeprecated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated target = null;
            target = (gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated)get_store().find_element_user(DEPRECATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Deprecated" element
     */
    public void setDeprecated(gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated deprecated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated target = null;
            target = (gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated)get_store().find_element_user(DEPRECATED$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated)get_store().add_element_user(DEPRECATED$0);
            }
            target.set(deprecated);
        }
    }
    
    /**
     * Appends and returns a new empty "Deprecated" element
     */
    public gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated addNewDeprecated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated target = null;
            target = (gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated)get_store().add_element_user(DEPRECATED$0);
            return target;
        }
    }
    /**
     * An XML Deprecated(@http://niem.gov/niem/appinfo/2.0).
     *
     * This is a complex type.
     */
    public static class DeprecatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated
    {
        private static final long serialVersionUID = 1L;
        
        public DeprecatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("http://niem.gov/niem/appinfo/2.0", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public boolean getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated.Value xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated.Value target = null;
                target = (gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated.Value)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(boolean value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                }
                target.setBooleanValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated.Value value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated.Value target = null;
                target = (gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated.Value)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated.Value)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        /**
         * An XML value(@http://niem.gov/niem/appinfo/2.0).
         *
         * This is an atomic type that is a restriction of gov.niem.niem.appinfo.x20.DeprecatedDocument$Deprecated$Value.
         */
        public static class ValueImpl extends org.apache.xmlbeans.impl.values.JavaBooleanHolderEx implements gov.niem.niem.appinfo.x20.DeprecatedDocument.Deprecated.Value
        {
            private static final long serialVersionUID = 1L;
            
            public ValueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
