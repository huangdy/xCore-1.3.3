/*
 * An XML document type.
 * Localname: keyword
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.KeywordDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one keyword(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class KeywordDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.KeywordDocument
{
    private static final long serialVersionUID = 1L;
    
    public KeywordDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYWORD$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "keyword");
    
    
    /**
     * Gets the "keyword" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType getKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType)get_store().find_element_user(KEYWORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "keyword" element
     */
    public void setKeyword(mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType)get_store().find_element_user(KEYWORD$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType)get_store().add_element_user(KEYWORD$0);
            }
            target.set(keyword);
        }
    }
    
    /**
     * Appends and returns a new empty "keyword" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType)get_store().add_element_user(KEYWORD$0);
            return target;
        }
    }
}
