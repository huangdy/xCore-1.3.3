/*
 * An XML document type.
 * Localname: CurrentTime
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one CurrentTime(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class CurrentTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrentTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENTTIME$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "CurrentTime");
    
    
    /**
     * Gets the "CurrentTime" element
     */
    public org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime getCurrentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().find_element_user(CURRENTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CurrentTime" element
     */
    public void setCurrentTime(org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime currentTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().find_element_user(CURRENTTIME$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().add_element_user(CURRENTTIME$0);
            }
            target.set(currentTime);
        }
    }
    
    /**
     * Appends and returns a new empty "CurrentTime" element
     */
    public org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime addNewCurrentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().add_element_user(CURRENTTIME$0);
            return target;
        }
    }
    /**
     * An XML CurrentTime(@http://docs.oasis-open.org/wsrf/rl-2).
     *
     * This is an atomic type that is a restriction of org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument$CurrentTime.
     */
    public static class CurrentTimeImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime
    {
        private static final long serialVersionUID = 1L;
        
        public CurrentTimeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected CurrentTimeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
