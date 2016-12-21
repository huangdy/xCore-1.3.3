/*
 * An XML attribute type.
 * Localname: ownerProducer
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.OwnerProducerAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one ownerProducer(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class OwnerProducerAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.OwnerProducerAttribute
{
    private static final long serialVersionUID = 1L;
    
    public OwnerProducerAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OWNERPRODUCER$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "ownerProducer");
    
    
    /**
     * Gets the "ownerProducer" attribute
     */
    public java.util.List getOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERPRODUCER$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "ownerProducer" attribute
     */
    public usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer xgetOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer target = null;
            target = (usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer)get_store().find_attribute_user(OWNERPRODUCER$0);
            return target;
        }
    }
    
    /**
     * True if has "ownerProducer" attribute
     */
    public boolean isSetOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OWNERPRODUCER$0) != null;
        }
    }
    
    /**
     * Sets the "ownerProducer" attribute
     */
    public void setOwnerProducer(java.util.List ownerProducer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERPRODUCER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNERPRODUCER$0);
            }
            target.setListValue(ownerProducer);
        }
    }
    
    /**
     * Sets (as xml) the "ownerProducer" attribute
     */
    public void xsetOwnerProducer(usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer ownerProducer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer target = null;
            target = (usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer)get_store().find_attribute_user(OWNERPRODUCER$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer)get_store().add_attribute_user(OWNERPRODUCER$0);
            }
            target.set(ownerProducer);
        }
    }
    
    /**
     * Unsets the "ownerProducer" attribute
     */
    public void unsetOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OWNERPRODUCER$0);
        }
    }
    /**
     * An XML ownerProducer(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class OwnerProducerImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer
    {
        private static final long serialVersionUID = 1L;
        
        public OwnerProducerImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected OwnerProducerImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
