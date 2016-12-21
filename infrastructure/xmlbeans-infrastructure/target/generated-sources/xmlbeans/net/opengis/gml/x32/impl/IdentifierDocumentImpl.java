/*
 * An XML document type.
 * Localname: identifier
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.IdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one identifier(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class IdentifierDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.IdentifierDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentifierDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "identifier");
    
    
    /**
     * Gets the "identifier" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(net.opengis.gml.x32.CodeWithAuthorityType identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().find_element_user(IDENTIFIER$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(IDENTIFIER$0);
            }
            target.set(identifier);
        }
    }
    
    /**
     * Appends and returns a new empty "identifier" element
     */
    public net.opengis.gml.x32.CodeWithAuthorityType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CodeWithAuthorityType target = null;
            target = (net.opengis.gml.x32.CodeWithAuthorityType)get_store().add_element_user(IDENTIFIER$0);
            return target;
        }
    }
}
