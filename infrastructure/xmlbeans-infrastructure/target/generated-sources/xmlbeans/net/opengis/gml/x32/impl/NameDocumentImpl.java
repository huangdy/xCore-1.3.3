/*
 * An XML document type.
 * Localname: name
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.NameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one name(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class NameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.NameDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "name");
    
    
    /**
     * Gets the "name" element
     */
    public net.opengis.gml.x32.CodeType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(net.opengis.gml.x32.CodeType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public net.opengis.gml.x32.CodeType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeType target = null;
            target = (net.opengis.gml.x32.CodeType)get_store().add_element_user(NAME$0);
            return target;
        }
    }
}
