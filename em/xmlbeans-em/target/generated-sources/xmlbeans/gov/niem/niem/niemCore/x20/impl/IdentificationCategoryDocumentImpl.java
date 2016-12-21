/*
 * An XML document type.
 * Localname: IdentificationCategory
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IdentificationCategoryDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one IdentificationCategory(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class IdentificationCategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.IdentificationCategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentificationCategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONCATEGORY$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationCategory");
    private static final org.apache.xmlbeans.QNameSet IDENTIFICATIONCATEGORY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationCategoryText"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationCategory"),
    });
    
    
    /**
     * Gets the "IdentificationCategory" element
     */
    public org.apache.xmlbeans.XmlObject getIdentificationCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFICATIONCATEGORY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentificationCategory" element
     */
    public void setIdentificationCategory(org.apache.xmlbeans.XmlObject identificationCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFICATIONCATEGORY$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFICATIONCATEGORY$0);
            }
            target.set(identificationCategory);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentificationCategory" element
     */
    public org.apache.xmlbeans.XmlObject addNewIdentificationCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFICATIONCATEGORY$0);
            return target;
        }
    }
}
