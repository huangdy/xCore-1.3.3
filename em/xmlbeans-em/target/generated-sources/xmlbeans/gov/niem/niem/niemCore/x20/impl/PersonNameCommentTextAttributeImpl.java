/*
 * An XML attribute type.
 * Localname: personNameCommentText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonNameCommentTextAttribute
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one personNameCommentText(@http://niem.gov/niem/niem-core/2.0) attribute.
 *
 * This is a complex type.
 */
public class PersonNameCommentTextAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.PersonNameCommentTextAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PersonNameCommentTextAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONNAMECOMMENTTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "personNameCommentText");
    
    
    /**
     * Gets the "personNameCommentText" attribute
     */
    public java.lang.String getPersonNameCommentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "personNameCommentText" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPersonNameCommentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$0);
            return target;
        }
    }
    
    /**
     * True if has "personNameCommentText" attribute
     */
    public boolean isSetPersonNameCommentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$0) != null;
        }
    }
    
    /**
     * Sets the "personNameCommentText" attribute
     */
    public void setPersonNameCommentText(java.lang.String personNameCommentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSONNAMECOMMENTTEXT$0);
            }
            target.setStringValue(personNameCommentText);
        }
    }
    
    /**
     * Sets (as xml) the "personNameCommentText" attribute
     */
    public void xsetPersonNameCommentText(org.apache.xmlbeans.XmlString personNameCommentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PERSONNAMECOMMENTTEXT$0);
            }
            target.set(personNameCommentText);
        }
    }
    
    /**
     * Unsets the "personNameCommentText" attribute
     */
    public void unsetPersonNameCommentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERSONNAMECOMMENTTEXT$0);
        }
    }
}
