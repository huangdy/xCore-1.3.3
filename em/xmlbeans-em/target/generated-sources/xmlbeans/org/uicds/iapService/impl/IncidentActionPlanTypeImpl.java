/*
 * XML Type:  IncidentActionPlanType
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.IncidentActionPlanType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * An XML IncidentActionPlanType(@http://uicds.org/IAPService).
 *
 * This is a complex type.
 */
public class IncidentActionPlanTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.iapService.IncidentActionPlanType
{
    private static final long serialVersionUID = 1L;
    
    public IncidentActionPlanTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTID$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "IncidentID");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "Name");
    private static final javax.xml.namespace.QName DESCRIPTIONTEXT$4 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "DescriptionText");
    private static final javax.xml.namespace.QName DOCUMENTEFFECTIVEDATE$6 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "DocumentEffectiveDate");
    private static final javax.xml.namespace.QName DOCUMENTEXPIRATIONDATE$8 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "DocumentExpirationDate");
    private static final javax.xml.namespace.QName COMPONENTS$10 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "Components");
    
    
    /**
     * Gets the "IncidentID" element
     */
    public java.lang.String getIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentID" element
     */
    public org.apache.xmlbeans.XmlString xgetIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentID" element
     */
    public void setIncidentID(java.lang.String incidentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$0);
            }
            target.setStringValue(incidentID);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentID" element
     */
    public void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$0);
            }
            target.set(incidentID);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "DescriptionText" element
     */
    public java.lang.String getDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DescriptionText" element
     */
    public org.apache.xmlbeans.XmlString xgetDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONTEXT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DescriptionText" element
     */
    public void setDescriptionText(java.lang.String descriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTIONTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTIONTEXT$4);
            }
            target.setStringValue(descriptionText);
        }
    }
    
    /**
     * Sets (as xml) the "DescriptionText" element
     */
    public void xsetDescriptionText(org.apache.xmlbeans.XmlString descriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTIONTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTIONTEXT$4);
            }
            target.set(descriptionText);
        }
    }
    
    /**
     * Gets the "DocumentEffectiveDate" element
     */
    public java.lang.String getDocumentEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTEFFECTIVEDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentEffectiveDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTEFFECTIVEDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentEffectiveDate" element
     */
    public void setDocumentEffectiveDate(java.lang.String documentEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTEFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTEFFECTIVEDATE$6);
            }
            target.setStringValue(documentEffectiveDate);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentEffectiveDate" element
     */
    public void xsetDocumentEffectiveDate(org.apache.xmlbeans.XmlString documentEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTEFFECTIVEDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTEFFECTIVEDATE$6);
            }
            target.set(documentEffectiveDate);
        }
    }
    
    /**
     * Gets the "DocumentExpirationDate" element
     */
    public java.lang.String getDocumentExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTEXPIRATIONDATE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentExpirationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTEXPIRATIONDATE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentExpirationDate" element
     */
    public void setDocumentExpirationDate(java.lang.String documentExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTEXPIRATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTEXPIRATIONDATE$8);
            }
            target.setStringValue(documentExpirationDate);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentExpirationDate" element
     */
    public void xsetDocumentExpirationDate(org.apache.xmlbeans.XmlString documentExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTEXPIRATIONDATE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTEXPIRATIONDATE$8);
            }
            target.set(documentExpirationDate);
        }
    }
    
    /**
     * Gets the "Components" element
     */
    public org.uicds.iapService.IAPComponentListType getComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentListType target = null;
            target = (org.uicds.iapService.IAPComponentListType)get_store().find_element_user(COMPONENTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Components" element
     */
    public void setComponents(org.uicds.iapService.IAPComponentListType components)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentListType target = null;
            target = (org.uicds.iapService.IAPComponentListType)get_store().find_element_user(COMPONENTS$10, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.IAPComponentListType)get_store().add_element_user(COMPONENTS$10);
            }
            target.set(components);
        }
    }
    
    /**
     * Appends and returns a new empty "Components" element
     */
    public org.uicds.iapService.IAPComponentListType addNewComponents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentListType target = null;
            target = (org.uicds.iapService.IAPComponentListType)get_store().add_element_user(COMPONENTS$10);
            return target;
        }
    }
}
