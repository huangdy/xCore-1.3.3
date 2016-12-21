/*
 * An XML attribute type.
 * Localname: classification
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.ClassificationAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one classification(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class ClassificationAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.ClassificationAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ClassificationAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSIFICATION$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classification");
    
    
    /**
     * Gets the "classification" attribute
     */
    public usGovIcIsmV2.ClassificationType.Enum getClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATION$0);
            if (target == null)
            {
                return null;
            }
            return (usGovIcIsmV2.ClassificationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classification" attribute
     */
    public usGovIcIsmV2.ClassificationType xgetClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassificationType target = null;
            target = (usGovIcIsmV2.ClassificationType)get_store().find_attribute_user(CLASSIFICATION$0);
            return target;
        }
    }
    
    /**
     * True if has "classification" attribute
     */
    public boolean isSetClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSIFICATION$0) != null;
        }
    }
    
    /**
     * Sets the "classification" attribute
     */
    public void setClassification(usGovIcIsmV2.ClassificationType.Enum classification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFICATION$0);
            }
            target.setEnumValue(classification);
        }
    }
    
    /**
     * Sets (as xml) the "classification" attribute
     */
    public void xsetClassification(usGovIcIsmV2.ClassificationType classification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassificationType target = null;
            target = (usGovIcIsmV2.ClassificationType)get_store().find_attribute_user(CLASSIFICATION$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.ClassificationType)get_store().add_attribute_user(CLASSIFICATION$0);
            }
            target.set(classification);
        }
    }
    
    /**
     * Unsets the "classification" attribute
     */
    public void unsetClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSIFICATION$0);
        }
    }
}
