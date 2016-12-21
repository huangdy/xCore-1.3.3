/*
 * An XML document type.
 * Localname: What
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.WhatDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one What(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class WhatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.WhatDocument
{
    private static final long serialVersionUID = 1L;
    
    public WhatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WHAT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "What");
    
    
    /**
     * Gets the "What" element
     */
    public gov.ucore.ucore.x20.WhatType getWhat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.WhatType target = null;
            target = (gov.ucore.ucore.x20.WhatType)get_store().find_element_user(WHAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "What" element
     */
    public void setWhat(gov.ucore.ucore.x20.WhatType what)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.WhatType target = null;
            target = (gov.ucore.ucore.x20.WhatType)get_store().find_element_user(WHAT$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.WhatType)get_store().add_element_user(WHAT$0);
            }
            target.set(what);
        }
    }
    
    /**
     * Appends and returns a new empty "What" element
     */
    public gov.ucore.ucore.x20.WhatType addNewWhat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.WhatType target = null;
            target = (gov.ucore.ucore.x20.WhatType)get_store().add_element_user(WHAT$0);
            return target;
        }
    }
}
