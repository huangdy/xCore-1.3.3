/*
 * An XML document type.
 * Localname: DestroyPullPointResponse
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one DestroyPullPointResponse(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class DestroyPullPointResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DestroyPullPointResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESTROYPULLPOINTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "DestroyPullPointResponse");
    
    
    /**
     * Gets the "DestroyPullPointResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse getDestroyPullPointResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse)get_store().find_element_user(DESTROYPULLPOINTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DestroyPullPointResponse" element
     */
    public void setDestroyPullPointResponse(org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse destroyPullPointResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse)get_store().find_element_user(DESTROYPULLPOINTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse)get_store().add_element_user(DESTROYPULLPOINTRESPONSE$0);
            }
            target.set(destroyPullPointResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DestroyPullPointResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse addNewDestroyPullPointResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse)get_store().add_element_user(DESTROYPULLPOINTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DestroyPullPointResponse(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class DestroyPullPointResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.DestroyPullPointResponseDocument.DestroyPullPointResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DestroyPullPointResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
