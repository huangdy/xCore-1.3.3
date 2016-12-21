/*
 * An XML document type.
 * Localname: NarrativeAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.NarrativeAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one NarrativeAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class NarrativeAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.NarrativeAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public NarrativeAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NARRATIVEABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "NarrativeAbstract");
    private static final org.apache.xmlbeans.QNameSet NARRATIVEABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Narrative"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "NarrativeAbstract"),
    });
    
    
    /**
     * Gets the "NarrativeAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getNarrativeAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NARRATIVEABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NarrativeAbstract" element
     */
    public void setNarrativeAbstract(org.apache.xmlbeans.XmlObject narrativeAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NARRATIVEABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NARRATIVEABSTRACT$0);
            }
            target.set(narrativeAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "NarrativeAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewNarrativeAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NARRATIVEABSTRACT$0);
            return target;
        }
    }
}
