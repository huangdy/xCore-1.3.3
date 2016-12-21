/*
 * An XML document type.
 * Localname: Destroy
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.DestroyDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one Destroy(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class DestroyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.DestroyDocument
{
    private static final long serialVersionUID = 1L;
    
    public DestroyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESTROY$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "Destroy");
    
    
    /**
     * Gets the "Destroy" element
     */
    public org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy getDestroy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy)get_store().find_element_user(DESTROY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Destroy" element
     */
    public void setDestroy(org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy destroy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy)get_store().find_element_user(DESTROY$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy)get_store().add_element_user(DESTROY$0);
            }
            target.set(destroy);
        }
    }
    
    /**
     * Appends and returns a new empty "Destroy" element
     */
    public org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy addNewDestroy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy)get_store().add_element_user(DESTROY$0);
            return target;
        }
    }
    /**
     * An XML Destroy(@http://docs.oasis-open.org/wsrf/rl-2).
     *
     * This is a complex type.
     */
    public static class DestroyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.DestroyDocument.Destroy
    {
        private static final long serialVersionUID = 1L;
        
        public DestroyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
