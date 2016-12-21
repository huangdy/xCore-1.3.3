/*
 * XML Type:  ICSFormDocumentType
 * Namespace: http://uicds.org/ICSFormCommon
 * Java type: org.uicds.icsFormCommon.ICSFormDocumentType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsFormCommon.impl;
/**
 * An XML ICSFormDocumentType(@http://uicds.org/ICSFormCommon).
 *
 * This is a complex type.
 */
public class ICSFormDocumentTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsFormCommon.ICSFormDocumentType
{
    private static final long serialVersionUID = 1L;
    
    public ICSFormDocumentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTID$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "IncidentID");
    private static final javax.xml.namespace.QName ICSFORMNUMBER$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "ICSFormNumber");
    private static final javax.xml.namespace.QName DOCUMENTFILENAME$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "DocumentFileName");
    private static final javax.xml.namespace.QName DOCUMENTDESCRIPTIONTEXT$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "DocumentDescriptionText");
    private static final javax.xml.namespace.QName DOCUMENTBINARY$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "DocumentBinary");
    private static final javax.xml.namespace.QName DOCUMENTSOURCE$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "DocumentSource");
    private static final javax.xml.namespace.QName DOCUMENTCREATIONDATE$12 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "DocumentCreationDate");
    private static final javax.xml.namespace.QName DOCUMENTLASTMODIFIEDDATE$14 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "DocumentLastModifiedDate");
    private static final javax.xml.namespace.QName DOCUMENTEFFECTIVEDATE$16 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "DocumentEffectiveDate");
    private static final javax.xml.namespace.QName DOCUMENTEXPIRATIONDATE$18 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSFormCommon", "DocumentExpirationDate");
    
    
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
     * Gets the "ICSFormNumber" element
     */
    public java.lang.String getICSFormNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICSFORMNUMBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ICSFormNumber" element
     */
    public org.apache.xmlbeans.XmlString xgetICSFormNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICSFORMNUMBER$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ICSFormNumber" element
     */
    public void setICSFormNumber(java.lang.String icsFormNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICSFORMNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICSFORMNUMBER$2);
            }
            target.setStringValue(icsFormNumber);
        }
    }
    
    /**
     * Sets (as xml) the "ICSFormNumber" element
     */
    public void xsetICSFormNumber(org.apache.xmlbeans.XmlString icsFormNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ICSFORMNUMBER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ICSFORMNUMBER$2);
            }
            target.set(icsFormNumber);
        }
    }
    
    /**
     * Gets the "DocumentFileName" element
     */
    public java.lang.String getDocumentFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTFILENAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentFileName" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentFileName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTFILENAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentFileName" element
     */
    public void setDocumentFileName(java.lang.String documentFileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTFILENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTFILENAME$4);
            }
            target.setStringValue(documentFileName);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentFileName" element
     */
    public void xsetDocumentFileName(org.apache.xmlbeans.XmlString documentFileName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTFILENAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTFILENAME$4);
            }
            target.set(documentFileName);
        }
    }
    
    /**
     * Gets the "DocumentDescriptionText" element
     */
    public java.lang.String getDocumentDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTDESCRIPTIONTEXT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentDescriptionText" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTDESCRIPTIONTEXT$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentDescriptionText" element
     */
    public void setDocumentDescriptionText(java.lang.String documentDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTDESCRIPTIONTEXT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTDESCRIPTIONTEXT$6);
            }
            target.setStringValue(documentDescriptionText);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentDescriptionText" element
     */
    public void xsetDocumentDescriptionText(org.apache.xmlbeans.XmlString documentDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTDESCRIPTIONTEXT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTDESCRIPTIONTEXT$6);
            }
            target.set(documentDescriptionText);
        }
    }
    
    /**
     * Gets the "DocumentBinary" element
     */
    public byte[] getDocumentBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTBINARY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentBinary" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetDocumentBinary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DOCUMENTBINARY$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentBinary" element
     */
    public void setDocumentBinary(byte[] documentBinary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTBINARY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTBINARY$8);
            }
            target.setByteArrayValue(documentBinary);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentBinary" element
     */
    public void xsetDocumentBinary(org.apache.xmlbeans.XmlBase64Binary documentBinary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DOCUMENTBINARY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(DOCUMENTBINARY$8);
            }
            target.set(documentBinary);
        }
    }
    
    /**
     * Gets the "DocumentSource" element
     */
    public java.lang.String getDocumentSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTSOURCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentSource" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTSOURCE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentSource" element
     */
    public void setDocumentSource(java.lang.String documentSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTSOURCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTSOURCE$10);
            }
            target.setStringValue(documentSource);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentSource" element
     */
    public void xsetDocumentSource(org.apache.xmlbeans.XmlString documentSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTSOURCE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTSOURCE$10);
            }
            target.set(documentSource);
        }
    }
    
    /**
     * Gets the "DocumentCreationDate" element
     */
    public java.lang.String getDocumentCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTCREATIONDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentCreationDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentCreationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTCREATIONDATE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentCreationDate" element
     */
    public void setDocumentCreationDate(java.lang.String documentCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTCREATIONDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTCREATIONDATE$12);
            }
            target.setStringValue(documentCreationDate);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentCreationDate" element
     */
    public void xsetDocumentCreationDate(org.apache.xmlbeans.XmlString documentCreationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTCREATIONDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTCREATIONDATE$12);
            }
            target.set(documentCreationDate);
        }
    }
    
    /**
     * Gets the "DocumentLastModifiedDate" element
     */
    public java.lang.String getDocumentLastModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTLASTMODIFIEDDATE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DocumentLastModifiedDate" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentLastModifiedDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTLASTMODIFIEDDATE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DocumentLastModifiedDate" element
     */
    public void setDocumentLastModifiedDate(java.lang.String documentLastModifiedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTLASTMODIFIEDDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTLASTMODIFIEDDATE$14);
            }
            target.setStringValue(documentLastModifiedDate);
        }
    }
    
    /**
     * Sets (as xml) the "DocumentLastModifiedDate" element
     */
    public void xsetDocumentLastModifiedDate(org.apache.xmlbeans.XmlString documentLastModifiedDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTLASTMODIFIEDDATE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTLASTMODIFIEDDATE$14);
            }
            target.set(documentLastModifiedDate);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTEFFECTIVEDATE$16, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTEFFECTIVEDATE$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTEFFECTIVEDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTEFFECTIVEDATE$16);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTEFFECTIVEDATE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTEFFECTIVEDATE$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTEXPIRATIONDATE$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTEXPIRATIONDATE$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTEXPIRATIONDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTEXPIRATIONDATE$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTEXPIRATIONDATE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTEXPIRATIONDATE$18);
            }
            target.set(documentExpirationDate);
        }
    }
}
