/*
 * XML Type:  PlanningSectionType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.PlanningSectionType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203.impl;
/**
 * An XML PlanningSectionType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public class PlanningSectionTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm203.PlanningSectionType
{
    private static final long serialVersionUID = 1L;
    
    public PlanningSectionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHIEF$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Chief");
    private static final javax.xml.namespace.QName DEPUTY$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Deputy");
    private static final javax.xml.namespace.QName RESOURCESUNIT$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "ResourcesUnit");
    private static final javax.xml.namespace.QName SITUATIONUNIT$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "SituationUnit");
    private static final javax.xml.namespace.QName DOCUMENTATIONUNIT$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "DocumentationUnit");
    private static final javax.xml.namespace.QName DEMOBILIZATIONUNIT$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "DemobilizationUnit");
    private static final javax.xml.namespace.QName TECHNICALSPECIALISTS$12 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "TechnicalSpecialists");
    
    
    /**
     * Gets the "Chief" element
     */
    public java.lang.String getChief()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHIEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Chief" element
     */
    public org.apache.xmlbeans.XmlString xgetChief()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHIEF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Chief" element
     */
    public void setChief(java.lang.String chief)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHIEF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHIEF$0);
            }
            target.setStringValue(chief);
        }
    }
    
    /**
     * Sets (as xml) the "Chief" element
     */
    public void xsetChief(org.apache.xmlbeans.XmlString chief)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHIEF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHIEF$0);
            }
            target.set(chief);
        }
    }
    
    /**
     * Gets the "Deputy" element
     */
    public java.lang.String getDeputy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPUTY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Deputy" element
     */
    public org.apache.xmlbeans.XmlString xgetDeputy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPUTY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Deputy" element
     */
    public void setDeputy(java.lang.String deputy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPUTY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPUTY$2);
            }
            target.setStringValue(deputy);
        }
    }
    
    /**
     * Sets (as xml) the "Deputy" element
     */
    public void xsetDeputy(org.apache.xmlbeans.XmlString deputy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPUTY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPUTY$2);
            }
            target.set(deputy);
        }
    }
    
    /**
     * Gets the "ResourcesUnit" element
     */
    public java.lang.String getResourcesUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESUNIT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourcesUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetResourcesUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCESUNIT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResourcesUnit" element
     */
    public void setResourcesUnit(java.lang.String resourcesUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESUNIT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCESUNIT$4);
            }
            target.setStringValue(resourcesUnit);
        }
    }
    
    /**
     * Sets (as xml) the "ResourcesUnit" element
     */
    public void xsetResourcesUnit(org.apache.xmlbeans.XmlString resourcesUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCESUNIT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOURCESUNIT$4);
            }
            target.set(resourcesUnit);
        }
    }
    
    /**
     * Gets the "SituationUnit" element
     */
    public java.lang.String getSituationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITUATIONUNIT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SituationUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetSituationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITUATIONUNIT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SituationUnit" element
     */
    public void setSituationUnit(java.lang.String situationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITUATIONUNIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITUATIONUNIT$6);
            }
            target.setStringValue(situationUnit);
        }
    }
    
    /**
     * Sets (as xml) the "SituationUnit" element
     */
    public void xsetSituationUnit(org.apache.xmlbeans.XmlString situationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITUATIONUNIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITUATIONUNIT$6);
            }
            target.set(situationUnit);
        }
    }
    
    /**
     * Gets the "DocumentationUnit" element
     */
    public java.lang.String getDocumentationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTATIONUNIT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentationUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTATIONUNIT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentationUnit" element
     */
    public void setDocumentationUnit(java.lang.String documentationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTATIONUNIT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTATIONUNIT$8);
            }
            target.setStringValue(documentationUnit);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentationUnit" element
     */
    public void xsetDocumentationUnit(org.apache.xmlbeans.XmlString documentationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTATIONUNIT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTATIONUNIT$8);
            }
            target.set(documentationUnit);
        }
    }
    
    /**
     * Gets the "DemobilizationUnit" element
     */
    public java.lang.String getDemobilizationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEMOBILIZATIONUNIT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DemobilizationUnit" element
     */
    public org.apache.xmlbeans.XmlString xgetDemobilizationUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEMOBILIZATIONUNIT$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DemobilizationUnit" element
     */
    public void setDemobilizationUnit(java.lang.String demobilizationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEMOBILIZATIONUNIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEMOBILIZATIONUNIT$10);
            }
            target.setStringValue(demobilizationUnit);
        }
    }
    
    /**
     * Sets (as xml) the "DemobilizationUnit" element
     */
    public void xsetDemobilizationUnit(org.apache.xmlbeans.XmlString demobilizationUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEMOBILIZATIONUNIT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEMOBILIZATIONUNIT$10);
            }
            target.set(demobilizationUnit);
        }
    }
    
    /**
     * Gets the "TechnicalSpecialists" element
     */
    public java.lang.String getTechnicalSpecialists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHNICALSPECIALISTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TechnicalSpecialists" element
     */
    public org.apache.xmlbeans.XmlString xgetTechnicalSpecialists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TECHNICALSPECIALISTS$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TechnicalSpecialists" element
     */
    public void setTechnicalSpecialists(java.lang.String technicalSpecialists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TECHNICALSPECIALISTS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TECHNICALSPECIALISTS$12);
            }
            target.setStringValue(technicalSpecialists);
        }
    }
    
    /**
     * Sets (as xml) the "TechnicalSpecialists" element
     */
    public void xsetTechnicalSpecialists(org.apache.xmlbeans.XmlString technicalSpecialists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TECHNICALSPECIALISTS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TECHNICALSPECIALISTS$12);
            }
            target.set(technicalSpecialists);
        }
    }
}
