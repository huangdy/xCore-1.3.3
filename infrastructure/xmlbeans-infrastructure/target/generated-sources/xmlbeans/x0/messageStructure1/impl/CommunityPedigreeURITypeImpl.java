/*
 * XML Type:  CommunityPedigreeURIType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.CommunityPedigreeURIType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML CommunityPedigreeURIType(@ulex:message:structure:1.0).
 *
 * This is an atomic type that is a restriction of x0.messageStructure1.CommunityPedigreeURIType.
 */
public class CommunityPedigreeURITypeImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements x0.messageStructure1.CommunityPedigreeURIType
{
    private static final long serialVersionUID = 1L;
    
    public CommunityPedigreeURITypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected CommunityPedigreeURITypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName PEDIGREENUMBER$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "pedigreeNumber");
    
    
    /**
     * Gets the "pedigreeNumber" attribute
     */
    public java.math.BigInteger getPedigreeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEDIGREENUMBER$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "pedigreeNumber" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetPedigreeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PEDIGREENUMBER$0);
            return target;
        }
    }
    
    /**
     * Sets the "pedigreeNumber" attribute
     */
    public void setPedigreeNumber(java.math.BigInteger pedigreeNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEDIGREENUMBER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEDIGREENUMBER$0);
            }
            target.setBigIntegerValue(pedigreeNumber);
        }
    }
    
    /**
     * Sets (as xml) the "pedigreeNumber" attribute
     */
    public void xsetPedigreeNumber(org.apache.xmlbeans.XmlInteger pedigreeNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PEDIGREENUMBER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PEDIGREENUMBER$0);
            }
            target.set(pedigreeNumber);
        }
    }
}
