/*
 * An XML document type.
 * Localname: posList
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PosListDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one posList(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PosListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.PosListDocument
{
    private static final long serialVersionUID = 1L;
    
    public PosListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "posList");
    
    
    /**
     * Gets the "posList" element
     */
    public net.opengis.gml.x32.DirectPositionListType getPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionListType target = null;
            target = (net.opengis.gml.x32.DirectPositionListType)get_store().find_element_user(POSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "posList" element
     */
    public void setPosList(net.opengis.gml.x32.DirectPositionListType posList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionListType target = null;
            target = (net.opengis.gml.x32.DirectPositionListType)get_store().find_element_user(POSLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DirectPositionListType)get_store().add_element_user(POSLIST$0);
            }
            target.set(posList);
        }
    }
    
    /**
     * Appends and returns a new empty "posList" element
     */
    public net.opengis.gml.x32.DirectPositionListType addNewPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionListType target = null;
            target = (net.opengis.gml.x32.DirectPositionListType)get_store().add_element_user(POSLIST$0);
            return target;
        }
    }
}
