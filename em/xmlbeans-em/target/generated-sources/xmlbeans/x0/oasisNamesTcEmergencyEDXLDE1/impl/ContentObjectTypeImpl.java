/*
 * XML Type:  contentObjectType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1.impl;
/**
 * An XML contentObjectType(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
 *
 * This is a complex type.
 */
public class ContentObjectTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType
{
    private static final long serialVersionUID = 1L;
    
    public ContentObjectTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTDESCRIPTION$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "contentDescription");
    private static final javax.xml.namespace.QName CONTENTKEYWORD$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "contentKeyword");
    private static final javax.xml.namespace.QName INCIDENTID$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "incidentID");
    private static final javax.xml.namespace.QName INCIDENTDESCRIPTION$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "incidentDescription");
    private static final javax.xml.namespace.QName ORIGINATORROLE$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "originatorRole");
    private static final javax.xml.namespace.QName CONSUMERROLE$10 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "consumerRole");
    private static final javax.xml.namespace.QName CONFIDENTIALITY$12 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "confidentiality");
    private static final javax.xml.namespace.QName NONXMLCONTENT$14 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "nonXMLContent");
    private static final javax.xml.namespace.QName XMLCONTENT$16 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "xmlContent");
    
    
    /**
     * Gets the "contentDescription" element
     */
    public java.lang.String getContentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contentDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetContentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "contentDescription" element
     */
    public boolean isSetContentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "contentDescription" element
     */
    public void setContentDescription(java.lang.String contentDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENTDESCRIPTION$0);
            }
            target.setStringValue(contentDescription);
        }
    }
    
    /**
     * Sets (as xml) the "contentDescription" element
     */
    public void xsetContentDescription(org.apache.xmlbeans.XmlString contentDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENTDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENTDESCRIPTION$0);
            }
            target.set(contentDescription);
        }
    }
    
    /**
     * Unsets the "contentDescription" element
     */
    public void unsetContentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTDESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets array of all "contentKeyword" elements
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] getContentKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENTKEYWORD$2, targetList);
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "contentKeyword" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType getContentKeywordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(CONTENTKEYWORD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contentKeyword" element
     */
    public int sizeOfContentKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTKEYWORD$2);
        }
    }
    
    /**
     * Sets array of all "contentKeyword" element
     */
    public void setContentKeywordArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] contentKeywordArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contentKeywordArray, CONTENTKEYWORD$2);
        }
    }
    
    /**
     * Sets ith "contentKeyword" element
     */
    public void setContentKeywordArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueListType contentKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(CONTENTKEYWORD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contentKeyword);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contentKeyword" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType insertNewContentKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().insert_element_user(CONTENTKEYWORD$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contentKeyword" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType addNewContentKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().add_element_user(CONTENTKEYWORD$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "contentKeyword" element
     */
    public void removeContentKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTKEYWORD$2, i);
        }
    }
    
    /**
     * Gets the "incidentID" element
     */
    public java.lang.String getIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "incidentID" element
     */
    public org.apache.xmlbeans.XmlString xgetIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "incidentID" element
     */
    public boolean isSetIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTID$4) != 0;
        }
    }
    
    /**
     * Sets the "incidentID" element
     */
    public void setIncidentID(java.lang.String incidentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$4);
            }
            target.setStringValue(incidentID);
        }
    }
    
    /**
     * Sets (as xml) the "incidentID" element
     */
    public void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$4);
            }
            target.set(incidentID);
        }
    }
    
    /**
     * Unsets the "incidentID" element
     */
    public void unsetIncidentID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTID$4, 0);
        }
    }
    
    /**
     * Gets the "incidentDescription" element
     */
    public java.lang.String getIncidentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTDESCRIPTION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "incidentDescription" element
     */
    public org.apache.xmlbeans.XmlString xgetIncidentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTDESCRIPTION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "incidentDescription" element
     */
    public boolean isSetIncidentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTDESCRIPTION$6) != 0;
        }
    }
    
    /**
     * Sets the "incidentDescription" element
     */
    public void setIncidentDescription(java.lang.String incidentDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTDESCRIPTION$6);
            }
            target.setStringValue(incidentDescription);
        }
    }
    
    /**
     * Sets (as xml) the "incidentDescription" element
     */
    public void xsetIncidentDescription(org.apache.xmlbeans.XmlString incidentDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTDESCRIPTION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTDESCRIPTION$6);
            }
            target.set(incidentDescription);
        }
    }
    
    /**
     * Unsets the "incidentDescription" element
     */
    public void unsetIncidentDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTDESCRIPTION$6, 0);
        }
    }
    
    /**
     * Gets array of all "originatorRole" elements
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] getOriginatorRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORIGINATORROLE$8, targetList);
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "originatorRole" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType getOriginatorRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(ORIGINATORROLE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "originatorRole" element
     */
    public int sizeOfOriginatorRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINATORROLE$8);
        }
    }
    
    /**
     * Sets array of all "originatorRole" element
     */
    public void setOriginatorRoleArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] originatorRoleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(originatorRoleArray, ORIGINATORROLE$8);
        }
    }
    
    /**
     * Sets ith "originatorRole" element
     */
    public void setOriginatorRoleArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueListType originatorRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(ORIGINATORROLE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(originatorRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "originatorRole" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType insertNewOriginatorRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().insert_element_user(ORIGINATORROLE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "originatorRole" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType addNewOriginatorRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().add_element_user(ORIGINATORROLE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "originatorRole" element
     */
    public void removeOriginatorRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINATORROLE$8, i);
        }
    }
    
    /**
     * Gets array of all "consumerRole" elements
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] getConsumerRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONSUMERROLE$10, targetList);
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "consumerRole" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType getConsumerRoleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(CONSUMERROLE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "consumerRole" element
     */
    public int sizeOfConsumerRoleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSUMERROLE$10);
        }
    }
    
    /**
     * Sets array of all "consumerRole" element
     */
    public void setConsumerRoleArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] consumerRoleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(consumerRoleArray, CONSUMERROLE$10);
        }
    }
    
    /**
     * Sets ith "consumerRole" element
     */
    public void setConsumerRoleArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueListType consumerRole)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(CONSUMERROLE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(consumerRole);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "consumerRole" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType insertNewConsumerRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().insert_element_user(CONSUMERROLE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "consumerRole" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType addNewConsumerRole()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().add_element_user(CONSUMERROLE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "consumerRole" element
     */
    public void removeConsumerRole(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSUMERROLE$10, i);
        }
    }
    
    /**
     * Gets the "confidentiality" element
     */
    public java.lang.String getConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIDENTIALITY$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "confidentiality" element
     */
    public org.apache.xmlbeans.XmlString xgetConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIDENTIALITY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "confidentiality" element
     */
    public boolean isSetConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFIDENTIALITY$12) != 0;
        }
    }
    
    /**
     * Sets the "confidentiality" element
     */
    public void setConfidentiality(java.lang.String confidentiality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFIDENTIALITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFIDENTIALITY$12);
            }
            target.setStringValue(confidentiality);
        }
    }
    
    /**
     * Sets (as xml) the "confidentiality" element
     */
    public void xsetConfidentiality(org.apache.xmlbeans.XmlString confidentiality)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFIDENTIALITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFIDENTIALITY$12);
            }
            target.set(confidentiality);
        }
    }
    
    /**
     * Unsets the "confidentiality" element
     */
    public void unsetConfidentiality()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFIDENTIALITY$12, 0);
        }
    }
    
    /**
     * Gets the "nonXMLContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType getNonXMLContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType)get_store().find_element_user(NONXMLCONTENT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "nonXMLContent" element
     */
    public boolean isSetNonXMLContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NONXMLCONTENT$14) != 0;
        }
    }
    
    /**
     * Sets the "nonXMLContent" element
     */
    public void setNonXMLContent(x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType nonXMLContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType)get_store().find_element_user(NONXMLCONTENT$14, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType)get_store().add_element_user(NONXMLCONTENT$14);
            }
            target.set(nonXMLContent);
        }
    }
    
    /**
     * Appends and returns a new empty "nonXMLContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType addNewNonXMLContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType)get_store().add_element_user(NONXMLCONTENT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "nonXMLContent" element
     */
    public void unsetNonXMLContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NONXMLCONTENT$14, 0);
        }
    }
    
    /**
     * Gets the "xmlContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType getXmlContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType)get_store().find_element_user(XMLCONTENT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "xmlContent" element
     */
    public boolean isSetXmlContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(XMLCONTENT$16) != 0;
        }
    }
    
    /**
     * Sets the "xmlContent" element
     */
    public void setXmlContent(x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType xmlContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType)get_store().find_element_user(XMLCONTENT$16, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType)get_store().add_element_user(XMLCONTENT$16);
            }
            target.set(xmlContent);
        }
    }
    
    /**
     * Appends and returns a new empty "xmlContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType addNewXmlContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType)get_store().add_element_user(XMLCONTENT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "xmlContent" element
     */
    public void unsetXmlContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(XMLCONTENT$16, 0);
        }
    }
}
