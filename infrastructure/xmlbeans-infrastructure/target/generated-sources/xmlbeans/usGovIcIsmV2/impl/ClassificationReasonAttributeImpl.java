/*
 * An XML attribute type.
 * Localname: classificationReason
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.ClassificationReasonAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one classificationReason(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class ClassificationReasonAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.ClassificationReasonAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ClassificationReasonAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSIFICATIONREASON$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classificationReason");
    
    
    /**
     * Gets the "classificationReason" attribute
     */
    public java.lang.String getClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATIONREASON$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classificationReason" attribute
     */
    public usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason xgetClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason target = null;
            target = (usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason)get_store().find_attribute_user(CLASSIFICATIONREASON$0);
            return target;
        }
    }
    
    /**
     * True if has "classificationReason" attribute
     */
    public boolean isSetClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSIFICATIONREASON$0) != null;
        }
    }
    
    /**
     * Sets the "classificationReason" attribute
     */
    public void setClassificationReason(java.lang.String classificationReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATIONREASON$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFICATIONREASON$0);
            }
            target.setStringValue(classificationReason);
        }
    }
    
    /**
     * Sets (as xml) the "classificationReason" attribute
     */
    public void xsetClassificationReason(usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason classificationReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason target = null;
            target = (usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason)get_store().find_attribute_user(CLASSIFICATIONREASON$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason)get_store().add_attribute_user(CLASSIFICATIONREASON$0);
            }
            target.set(classificationReason);
        }
    }
    
    /**
     * Unsets the "classificationReason" attribute
     */
    public void unsetClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSIFICATIONREASON$0);
        }
    }
    /**
     * An XML classificationReason(@urn:us:gov:ic:ism:v2).
     *
     * This is an atomic type that is a restriction of usGovIcIsmV2.ClassificationReasonAttribute$ClassificationReason.
     */
    public static class ClassificationReasonImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason
    {
        private static final long serialVersionUID = 1L;
        
        public ClassificationReasonImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ClassificationReasonImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
