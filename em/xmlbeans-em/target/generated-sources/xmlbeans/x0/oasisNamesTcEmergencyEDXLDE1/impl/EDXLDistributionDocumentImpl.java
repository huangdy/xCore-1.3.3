/*
 * An XML document type.
 * Localname: EDXLDistribution
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1.impl;
/**
 * A document containing one EDXLDistribution(@urn:oasis:names:tc:emergency:EDXL:DE:1.0) element.
 *
 * This is a complex type.
 */
public class EDXLDistributionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EDXLDistributionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDXLDISTRIBUTION$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "EDXLDistribution");
    
    
    /**
     * Gets the "EDXLDistribution" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution getEDXLDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EDXLDistribution" element
     */
    public void setEDXLDistribution(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution edxlDistribution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().find_element_user(EDXLDISTRIBUTION$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().add_element_user(EDXLDISTRIBUTION$0);
            }
            target.set(edxlDistribution);
        }
    }
    
    /**
     * Appends and returns a new empty "EDXLDistribution" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution addNewEDXLDistribution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution)get_store().add_element_user(EDXLDISTRIBUTION$0);
            return target;
        }
    }
    /**
     * An XML EDXLDistribution(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
     *
     * This is a complex type.
     */
    public static class EDXLDistributionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution
    {
        private static final long serialVersionUID = 1L;
        
        public EDXLDistributionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISTRIBUTIONID$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "distributionID");
        private static final javax.xml.namespace.QName SENDERID$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "senderID");
        private static final javax.xml.namespace.QName DATETIMESENT$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "dateTimeSent");
        private static final javax.xml.namespace.QName DISTRIBUTIONSTATUS$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "distributionStatus");
        private static final javax.xml.namespace.QName DISTRIBUTIONTYPE$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "distributionType");
        private static final javax.xml.namespace.QName COMBINEDCONFIDENTIALITY$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "combinedConfidentiality");
        private static final javax.xml.namespace.QName LANGUAGE$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "language");
        private static final javax.xml.namespace.QName SENDERROLE$14 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "senderRole");
        private static final javax.xml.namespace.QName RECIPIENTROLE$16 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "recipientRole");
        private static final javax.xml.namespace.QName KEYWORD$18 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "keyword");
        private static final javax.xml.namespace.QName DISTRIBUTIONREFERENCE$20 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "distributionReference");
        private static final javax.xml.namespace.QName EXPLICITADDRESS$22 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "explicitAddress");
        private static final javax.xml.namespace.QName TARGETAREA$24 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "targetArea");
        private static final javax.xml.namespace.QName CONTENTOBJECT$26 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "contentObject");
        
        
        /**
         * Gets the "distributionID" element
         */
        public java.lang.String getDistributionID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTRIBUTIONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "distributionID" element
         */
        public org.apache.xmlbeans.XmlString xgetDistributionID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTRIBUTIONID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "distributionID" element
         */
        public void setDistributionID(java.lang.String distributionID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTRIBUTIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTRIBUTIONID$0);
                }
                target.setStringValue(distributionID);
            }
        }
        
        /**
         * Sets (as xml) the "distributionID" element
         */
        public void xsetDistributionID(org.apache.xmlbeans.XmlString distributionID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTRIBUTIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTRIBUTIONID$0);
                }
                target.set(distributionID);
            }
        }
        
        /**
         * Gets the "senderID" element
         */
        public java.lang.String getSenderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "senderID" element
         */
        public org.apache.xmlbeans.XmlString xgetSenderID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "senderID" element
         */
        public void setSenderID(java.lang.String senderID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDERID$2);
                }
                target.setStringValue(senderID);
            }
        }
        
        /**
         * Sets (as xml) the "senderID" element
         */
        public void xsetSenderID(org.apache.xmlbeans.XmlString senderID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDERID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDERID$2);
                }
                target.set(senderID);
            }
        }
        
        /**
         * Gets the "dateTimeSent" element
         */
        public java.util.Calendar getDateTimeSent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMESENT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "dateTimeSent" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetDateTimeSent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMESENT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "dateTimeSent" element
         */
        public void setDateTimeSent(java.util.Calendar dateTimeSent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMESENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIMESENT$4);
                }
                target.setCalendarValue(dateTimeSent);
            }
        }
        
        /**
         * Sets (as xml) the "dateTimeSent" element
         */
        public void xsetDateTimeSent(org.apache.xmlbeans.XmlDateTime dateTimeSent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMESENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATETIMESENT$4);
                }
                target.set(dateTimeSent);
            }
        }
        
        /**
         * Gets the "distributionStatus" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.StatusValues.Enum getDistributionStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTRIBUTIONSTATUS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0.oasisNamesTcEmergencyEDXLDE1.StatusValues.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "distributionStatus" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.StatusValues xgetDistributionStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.StatusValues target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.StatusValues)get_store().find_element_user(DISTRIBUTIONSTATUS$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "distributionStatus" element
         */
        public void setDistributionStatus(x0.oasisNamesTcEmergencyEDXLDE1.StatusValues.Enum distributionStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTRIBUTIONSTATUS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTRIBUTIONSTATUS$6);
                }
                target.setEnumValue(distributionStatus);
            }
        }
        
        /**
         * Sets (as xml) the "distributionStatus" element
         */
        public void xsetDistributionStatus(x0.oasisNamesTcEmergencyEDXLDE1.StatusValues distributionStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.StatusValues target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.StatusValues)get_store().find_element_user(DISTRIBUTIONSTATUS$6, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLDE1.StatusValues)get_store().add_element_user(DISTRIBUTIONSTATUS$6);
                }
                target.set(distributionStatus);
            }
        }
        
        /**
         * Gets the "distributionType" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.TypeValues.Enum getDistributionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTRIBUTIONTYPE$8, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0.oasisNamesTcEmergencyEDXLDE1.TypeValues.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "distributionType" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.TypeValues xgetDistributionType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.TypeValues target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.TypeValues)get_store().find_element_user(DISTRIBUTIONTYPE$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "distributionType" element
         */
        public void setDistributionType(x0.oasisNamesTcEmergencyEDXLDE1.TypeValues.Enum distributionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTRIBUTIONTYPE$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTRIBUTIONTYPE$8);
                }
                target.setEnumValue(distributionType);
            }
        }
        
        /**
         * Sets (as xml) the "distributionType" element
         */
        public void xsetDistributionType(x0.oasisNamesTcEmergencyEDXLDE1.TypeValues distributionType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.TypeValues target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.TypeValues)get_store().find_element_user(DISTRIBUTIONTYPE$8, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLDE1.TypeValues)get_store().add_element_user(DISTRIBUTIONTYPE$8);
                }
                target.set(distributionType);
            }
        }
        
        /**
         * Gets the "combinedConfidentiality" element
         */
        public java.lang.String getCombinedConfidentiality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMBINEDCONFIDENTIALITY$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "combinedConfidentiality" element
         */
        public org.apache.xmlbeans.XmlString xgetCombinedConfidentiality()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMBINEDCONFIDENTIALITY$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "combinedConfidentiality" element
         */
        public void setCombinedConfidentiality(java.lang.String combinedConfidentiality)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMBINEDCONFIDENTIALITY$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMBINEDCONFIDENTIALITY$10);
                }
                target.setStringValue(combinedConfidentiality);
            }
        }
        
        /**
         * Sets (as xml) the "combinedConfidentiality" element
         */
        public void xsetCombinedConfidentiality(org.apache.xmlbeans.XmlString combinedConfidentiality)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMBINEDCONFIDENTIALITY$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMBINEDCONFIDENTIALITY$10);
                }
                target.set(combinedConfidentiality);
            }
        }
        
        /**
         * Gets the "language" element
         */
        public java.lang.String getLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "language" element
         */
        public org.apache.xmlbeans.XmlString xgetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$12, 0);
                return target;
            }
        }
        
        /**
         * True if has "language" element
         */
        public boolean isSetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LANGUAGE$12) != 0;
            }
        }
        
        /**
         * Sets the "language" element
         */
        public void setLanguage(java.lang.String language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LANGUAGE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LANGUAGE$12);
                }
                target.setStringValue(language);
            }
        }
        
        /**
         * Sets (as xml) the "language" element
         */
        public void xsetLanguage(org.apache.xmlbeans.XmlString language)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LANGUAGE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LANGUAGE$12);
                }
                target.set(language);
            }
        }
        
        /**
         * Unsets the "language" element
         */
        public void unsetLanguage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LANGUAGE$12, 0);
            }
        }
        
        /**
         * Gets array of all "senderRole" elements
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] getSenderRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SENDERROLE$14, targetList);
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "senderRole" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType getSenderRoleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(SENDERROLE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "senderRole" element
         */
        public int sizeOfSenderRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENDERROLE$14);
            }
        }
        
        /**
         * Sets array of all "senderRole" element
         */
        public void setSenderRoleArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] senderRoleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(senderRoleArray, SENDERROLE$14);
            }
        }
        
        /**
         * Sets ith "senderRole" element
         */
        public void setSenderRoleArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueListType senderRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(SENDERROLE$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(senderRole);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "senderRole" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType insertNewSenderRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().insert_element_user(SENDERROLE$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "senderRole" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType addNewSenderRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().add_element_user(SENDERROLE$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "senderRole" element
         */
        public void removeSenderRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENDERROLE$14, i);
            }
        }
        
        /**
         * Gets array of all "recipientRole" elements
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] getRecipientRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RECIPIENTROLE$16, targetList);
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recipientRole" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType getRecipientRoleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(RECIPIENTROLE$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recipientRole" element
         */
        public int sizeOfRecipientRoleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECIPIENTROLE$16);
            }
        }
        
        /**
         * Sets array of all "recipientRole" element
         */
        public void setRecipientRoleArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] recipientRoleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(recipientRoleArray, RECIPIENTROLE$16);
            }
        }
        
        /**
         * Sets ith "recipientRole" element
         */
        public void setRecipientRoleArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueListType recipientRole)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(RECIPIENTROLE$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(recipientRole);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recipientRole" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType insertNewRecipientRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().insert_element_user(RECIPIENTROLE$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recipientRole" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType addNewRecipientRole()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().add_element_user(RECIPIENTROLE$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "recipientRole" element
         */
        public void removeRecipientRole(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECIPIENTROLE$16, i);
            }
        }
        
        /**
         * Gets array of all "keyword" elements
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] getKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(KEYWORD$18, targetList);
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "keyword" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType getKeywordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(KEYWORD$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "keyword" element
         */
        public int sizeOfKeywordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(KEYWORD$18);
            }
        }
        
        /**
         * Sets array of all "keyword" element
         */
        public void setKeywordArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueListType[] keywordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(keywordArray, KEYWORD$18);
            }
        }
        
        /**
         * Sets ith "keyword" element
         */
        public void setKeywordArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueListType keyword)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().find_element_user(KEYWORD$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(keyword);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "keyword" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType insertNewKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().insert_element_user(KEYWORD$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "keyword" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueListType addNewKeyword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueListType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueListType)get_store().add_element_user(KEYWORD$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "keyword" element
         */
        public void removeKeyword(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(KEYWORD$18, i);
            }
        }
        
        /**
         * Gets array of all "distributionReference" elements
         */
        public java.lang.String[] getDistributionReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DISTRIBUTIONREFERENCE$20, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "distributionReference" element
         */
        public java.lang.String getDistributionReferenceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTRIBUTIONREFERENCE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "distributionReference" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetDistributionReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DISTRIBUTIONREFERENCE$20, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "distributionReference" element
         */
        public org.apache.xmlbeans.XmlString xgetDistributionReferenceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTRIBUTIONREFERENCE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "distributionReference" element
         */
        public int sizeOfDistributionReferenceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISTRIBUTIONREFERENCE$20);
            }
        }
        
        /**
         * Sets array of all "distributionReference" element
         */
        public void setDistributionReferenceArray(java.lang.String[] distributionReferenceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(distributionReferenceArray, DISTRIBUTIONREFERENCE$20);
            }
        }
        
        /**
         * Sets ith "distributionReference" element
         */
        public void setDistributionReferenceArray(int i, java.lang.String distributionReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISTRIBUTIONREFERENCE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(distributionReference);
            }
        }
        
        /**
         * Sets (as xml) array of all "distributionReference" element
         */
        public void xsetDistributionReferenceArray(org.apache.xmlbeans.XmlString[]distributionReferenceArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(distributionReferenceArray, DISTRIBUTIONREFERENCE$20);
            }
        }
        
        /**
         * Sets (as xml) ith "distributionReference" element
         */
        public void xsetDistributionReferenceArray(int i, org.apache.xmlbeans.XmlString distributionReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DISTRIBUTIONREFERENCE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(distributionReference);
            }
        }
        
        /**
         * Inserts the value as the ith "distributionReference" element
         */
        public void insertDistributionReference(int i, java.lang.String distributionReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DISTRIBUTIONREFERENCE$20, i);
                target.setStringValue(distributionReference);
            }
        }
        
        /**
         * Appends the value as the last "distributionReference" element
         */
        public void addDistributionReference(java.lang.String distributionReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISTRIBUTIONREFERENCE$20);
                target.setStringValue(distributionReference);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "distributionReference" element
         */
        public org.apache.xmlbeans.XmlString insertNewDistributionReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DISTRIBUTIONREFERENCE$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "distributionReference" element
         */
        public org.apache.xmlbeans.XmlString addNewDistributionReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DISTRIBUTIONREFERENCE$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "distributionReference" element
         */
        public void removeDistributionReference(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISTRIBUTIONREFERENCE$20, i);
            }
        }
        
        /**
         * Gets array of all "explicitAddress" elements
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType[] getExplicitAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(EXPLICITADDRESS$22, targetList);
                x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "explicitAddress" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType getExplicitAddressArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType)get_store().find_element_user(EXPLICITADDRESS$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "explicitAddress" element
         */
        public int sizeOfExplicitAddressArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXPLICITADDRESS$22);
            }
        }
        
        /**
         * Sets array of all "explicitAddress" element
         */
        public void setExplicitAddressArray(x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType[] explicitAddressArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(explicitAddressArray, EXPLICITADDRESS$22);
            }
        }
        
        /**
         * Sets ith "explicitAddress" element
         */
        public void setExplicitAddressArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType explicitAddress)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType)get_store().find_element_user(EXPLICITADDRESS$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(explicitAddress);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "explicitAddress" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType insertNewExplicitAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType)get_store().insert_element_user(EXPLICITADDRESS$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "explicitAddress" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType addNewExplicitAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType)get_store().add_element_user(EXPLICITADDRESS$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "explicitAddress" element
         */
        public void removeExplicitAddress(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXPLICITADDRESS$22, i);
            }
        }
        
        /**
         * Gets array of all "targetArea" elements
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType[] getTargetAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TARGETAREA$24, targetList);
                x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "targetArea" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType getTargetAreaArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType)get_store().find_element_user(TARGETAREA$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "targetArea" element
         */
        public int sizeOfTargetAreaArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TARGETAREA$24);
            }
        }
        
        /**
         * Sets array of all "targetArea" element
         */
        public void setTargetAreaArray(x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType[] targetAreaArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(targetAreaArray, TARGETAREA$24);
            }
        }
        
        /**
         * Sets ith "targetArea" element
         */
        public void setTargetAreaArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType targetArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType)get_store().find_element_user(TARGETAREA$24, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(targetArea);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "targetArea" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType insertNewTargetArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType)get_store().insert_element_user(TARGETAREA$24, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "targetArea" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType addNewTargetArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType)get_store().add_element_user(TARGETAREA$24);
                return target;
            }
        }
        
        /**
         * Removes the ith "targetArea" element
         */
        public void removeTargetArea(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TARGETAREA$24, i);
            }
        }
        
        /**
         * Gets array of all "contentObject" elements
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType[] getContentObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTENTOBJECT$26, targetList);
                x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "contentObject" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType getContentObjectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType)get_store().find_element_user(CONTENTOBJECT$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "contentObject" element
         */
        public int sizeOfContentObjectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTENTOBJECT$26);
            }
        }
        
        /**
         * Sets array of all "contentObject" element
         */
        public void setContentObjectArray(x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType[] contentObjectArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contentObjectArray, CONTENTOBJECT$26);
            }
        }
        
        /**
         * Sets ith "contentObject" element
         */
        public void setContentObjectArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType contentObject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType)get_store().find_element_user(CONTENTOBJECT$26, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contentObject);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contentObject" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType insertNewContentObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType)get_store().insert_element_user(CONTENTOBJECT$26, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contentObject" element
         */
        public x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType addNewContentObject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType)get_store().add_element_user(CONTENTOBJECT$26);
                return target;
            }
        }
        
        /**
         * Removes the ith "contentObject" element
         */
        public void removeContentObject(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTENTOBJECT$26, i);
            }
        }
    }
}
