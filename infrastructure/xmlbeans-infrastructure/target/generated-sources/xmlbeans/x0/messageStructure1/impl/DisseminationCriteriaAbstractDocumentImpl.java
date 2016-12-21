/*
 * An XML document type.
 * Localname: DisseminationCriteriaAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DisseminationCriteriaAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DisseminationCriteriaAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DisseminationCriteriaAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DisseminationCriteriaAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisseminationCriteriaAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISSEMINATIONCRITERIAABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DisseminationCriteriaAbstract");
    private static final org.apache.xmlbeans.QNameSet DISSEMINATIONCRITERIAABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DisseminationCriteriaAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DisseminationCriteria"),
    });
    
    
    /**
     * Gets the "DisseminationCriteriaAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDisseminationCriteriaAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DISSEMINATIONCRITERIAABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DisseminationCriteriaAbstract" element
     */
    public void setDisseminationCriteriaAbstract(org.apache.xmlbeans.XmlObject disseminationCriteriaAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DISSEMINATIONCRITERIAABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DISSEMINATIONCRITERIAABSTRACT$0);
            }
            target.set(disseminationCriteriaAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DisseminationCriteriaAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDisseminationCriteriaAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DISSEMINATIONCRITERIAABSTRACT$0);
            return target;
        }
    }
}
