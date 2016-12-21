/*
 * XML Type:  ICSFormType
 * Namespace: http://uicds.org/ICSForm
 * Java type: org.uicds.icsForm.ICSFormType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm.impl;
/**
 * An XML ICSFormType(@http://uicds.org/ICSForm).
 *
 * This is a complex type.
 */
public class ICSFormTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm.ICSFormType
{
    private static final long serialVersionUID = 1L;
    
    public ICSFormTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID2$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm", "id");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm", "Description");
    private static final javax.xml.namespace.QName FORMNUMBER$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm", "FormNumber");
    private static final javax.xml.namespace.QName REQUIRED$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm", "Required");
    private static final javax.xml.namespace.QName ASSIGNEDPROFILEREF$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm", "assignedProfileRef");
    private static final javax.xml.namespace.QName COMPLETED$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm", "completed");
    
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID2$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID2$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId2(java.lang.String id2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID2$0);
            }
            target.setStringValue(id2);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId2(org.apache.xmlbeans.XmlString id2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID2$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID2$0);
            }
            target.set(id2);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "FormNumber" element
     */
    public java.lang.String getFormNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMNUMBER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FormNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetFormNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMNUMBER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FormNumber" element
     */
    public void setFormNumber(java.lang.String formNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMNUMBER$4);
            }
            target.setStringValue(formNumber);
        }
    }
    
    /**
     * Sets (as xml) the "FormNumber" element
     */
    public void xsetFormNumber(org.apache.xmlbeans.XmlString formNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMNUMBER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMNUMBER$4);
            }
            target.set(formNumber);
        }
    }
    
    /**
     * Gets the "Required" element
     */
    public boolean getRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIRED$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Required" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetRequired()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REQUIRED$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Required" element
     */
    public void setRequired(boolean required)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIRED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUIRED$6);
            }
            target.setBooleanValue(required);
        }
    }
    
    /**
     * Sets (as xml) the "Required" element
     */
    public void xsetRequired(org.apache.xmlbeans.XmlBoolean required)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REQUIRED$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REQUIRED$6);
            }
            target.set(required);
        }
    }
    
    /**
     * Gets the "assignedProfileRef" element
     */
    public java.lang.String getAssignedProfileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDPROFILEREF$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "assignedProfileRef" element
     */
    public org.apache.xmlbeans.XmlString xgetAssignedProfileRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDPROFILEREF$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "assignedProfileRef" element
     */
    public void setAssignedProfileRef(java.lang.String assignedProfileRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNEDPROFILEREF$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNEDPROFILEREF$8);
            }
            target.setStringValue(assignedProfileRef);
        }
    }
    
    /**
     * Sets (as xml) the "assignedProfileRef" element
     */
    public void xsetAssignedProfileRef(org.apache.xmlbeans.XmlString assignedProfileRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNEDPROFILEREF$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNEDPROFILEREF$8);
            }
            target.set(assignedProfileRef);
        }
    }
    
    /**
     * Gets the "completed" element
     */
    public boolean getCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETED$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "completed" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompleted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETED$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "completed" element
     */
    public void setCompleted(boolean completed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPLETED$10);
            }
            target.setBooleanValue(completed);
        }
    }
    
    /**
     * Sets (as xml) the "completed" element
     */
    public void xsetCompleted(org.apache.xmlbeans.XmlBoolean completed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMPLETED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COMPLETED$10);
            }
            target.set(completed);
        }
    }
}
