/*
 * An XML document type.
 * Localname: DestroyResponse
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one DestroyResponse(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class DestroyResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public DestroyResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESTROYRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "DestroyResponse");
    
    
    /**
     * Gets the "DestroyResponse" element
     */
    public org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse getDestroyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse)get_store().find_element_user(DESTROYRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DestroyResponse" element
     */
    public void setDestroyResponse(org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse destroyResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse)get_store().find_element_user(DESTROYRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse)get_store().add_element_user(DESTROYRESPONSE$0);
            }
            target.set(destroyResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "DestroyResponse" element
     */
    public org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse addNewDestroyResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse)get_store().add_element_user(DESTROYRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML DestroyResponse(@http://docs.oasis-open.org/wsrf/rl-2).
     *
     * This is a complex type.
     */
    public static class DestroyResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.DestroyResponseDocument.DestroyResponse
    {
        private static final long serialVersionUID = 1L;
        
        public DestroyResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
