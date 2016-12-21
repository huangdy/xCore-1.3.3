/*
 * An XML document type.
 * Localname: ICSForm
 * Namespace: http://uicds.org/ICSForm
 * Java type: org.uicds.icsForm.ICSFormDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm.impl;
/**
 * A document containing one ICSForm(@http://uicds.org/ICSForm) element.
 *
 * This is a complex type.
 */
public class ICSFormDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm.ICSFormDocument
{
    private static final long serialVersionUID = 1L;
    
    public ICSFormDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORM$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm", "ICSForm");
    
    
    /**
     * Gets the "ICSForm" element
     */
    public org.uicds.icsForm.ICSFormType getICSForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm.ICSFormType target = null;
            target = (org.uicds.icsForm.ICSFormType)get_store().find_element_user(ICSFORM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSForm" element
     */
    public void setICSForm(org.uicds.icsForm.ICSFormType icsForm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm.ICSFormType target = null;
            target = (org.uicds.icsForm.ICSFormType)get_store().find_element_user(ICSFORM$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm.ICSFormType)get_store().add_element_user(ICSFORM$0);
            }
            target.set(icsForm);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSForm" element
     */
    public org.uicds.icsForm.ICSFormType addNewICSForm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm.ICSFormType target = null;
            target = (org.uicds.icsForm.ICSFormType)get_store().add_element_user(ICSFORM$0);
            return target;
        }
    }
}
