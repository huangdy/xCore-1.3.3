/*
 * An XML document type.
 * Localname: ResponseToRequestQuote
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg
 * Java type: x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument
 *
 * Automatically generated - do not modify.
 */
package x0Msg.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * A document containing one ResponseToRequestQuote(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg) element.
 *
 * This is a complex type.
 */
public class ResponseToRequestQuoteDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResponseToRequestQuoteDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPONSETOREQUESTQUOTE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ResponseToRequestQuote");
    
    
    /**
     * Gets the "ResponseToRequestQuote" element
     */
    public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote getResponseToRequestQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote target = null;
            target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote)get_store().find_element_user(RESPONSETOREQUESTQUOTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResponseToRequestQuote" element
     */
    public void setResponseToRequestQuote(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote responseToRequestQuote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote target = null;
            target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote)get_store().find_element_user(RESPONSETOREQUESTQUOTE$0, 0);
            if (target == null)
            {
                target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote)get_store().add_element_user(RESPONSETOREQUESTQUOTE$0);
            }
            target.set(responseToRequestQuote);
        }
    }
    
    /**
     * Appends and returns a new empty "ResponseToRequestQuote" element
     */
    public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote addNewResponseToRequestQuote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote target = null;
            target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote)get_store().add_element_user(RESPONSETOREQUESTQUOTE$0);
            return target;
        }
    }
    /**
     * An XML ResponseToRequestQuote(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
     *
     * This is a complex type.
     */
    public static class ResponseToRequestQuoteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote
    {
        private static final long serialVersionUID = 1L;
        
        public ResponseToRequestQuoteImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MESSAGEID$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "MessageID");
        private static final javax.xml.namespace.QName SENTDATETIME$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "SentDateTime");
        private static final javax.xml.namespace.QName MESSAGECONTENTTYPE$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "MessageContentType");
        private static final javax.xml.namespace.QName MESSAGEDESCRIPTION$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "MessageDescription");
        private static final javax.xml.namespace.QName ORIGINATINGMESSAGEID$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "OriginatingMessageID");
        private static final javax.xml.namespace.QName PRECEDINGMESSAGEID$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "PrecedingMessageID");
        private static final javax.xml.namespace.QName INCIDENTINFORMATION$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "IncidentInformation");
        private static final javax.xml.namespace.QName MESSAGERECALL$14 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "MessageRecall");
        private static final javax.xml.namespace.QName FUNDING$16 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Funding");
        private static final javax.xml.namespace.QName CONTACTINFORMATION$18 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ContactInformation");
        private static final javax.xml.namespace.QName RESOURCEINFORMATION$20 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ResourceInformation");
        
        
        /**
         * Gets the "MessageID" element
         */
        public java.lang.String getMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MessageID" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType xgetMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().find_element_user(MESSAGEID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MessageID" element
         */
        public void setMessageID(java.lang.String messageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEID$0);
                }
                target.setStringValue(messageID);
            }
        }
        
        /**
         * Sets (as xml) the "MessageID" element
         */
        public void xsetMessageID(x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType messageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().find_element_user(MESSAGEID$0, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().add_element_user(MESSAGEID$0);
                }
                target.set(messageID);
            }
        }
        
        /**
         * Gets the "SentDateTime" element
         */
        public java.util.Calendar getSentDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTDATETIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "SentDateTime" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType xgetSentDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType)get_store().find_element_user(SENTDATETIME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SentDateTime" element
         */
        public void setSentDateTime(java.util.Calendar sentDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTDATETIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENTDATETIME$2);
                }
                target.setCalendarValue(sentDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "SentDateTime" element
         */
        public void xsetSentDateTime(x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType sentDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType)get_store().find_element_user(SENTDATETIME$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType)get_store().add_element_user(SENTDATETIME$2);
                }
                target.set(sentDateTime);
            }
        }
        
        /**
         * Gets the "MessageContentType" element
         */
        public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType.Enum getMessageContentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGECONTENTTYPE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "MessageContentType" element
         */
        public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType xgetMessageContentType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType target = null;
                target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType)get_store().find_element_user(MESSAGECONTENTTYPE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MessageContentType" element
         */
        public void setMessageContentType(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType.Enum messageContentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGECONTENTTYPE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGECONTENTTYPE$4);
                }
                target.setEnumValue(messageContentType);
            }
        }
        
        /**
         * Sets (as xml) the "MessageContentType" element
         */
        public void xsetMessageContentType(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType messageContentType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType target = null;
                target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType)get_store().find_element_user(MESSAGECONTENTTYPE$4, 0);
                if (target == null)
                {
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType)get_store().add_element_user(MESSAGECONTENTTYPE$4);
                }
                target.set(messageContentType);
            }
        }
        
        /**
         * Gets the "MessageDescription" element
         */
        public java.lang.String getMessageDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDESCRIPTION$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "MessageDescription" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.MessageDescriptionType xgetMessageDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageDescriptionType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageDescriptionType)get_store().find_element_user(MESSAGEDESCRIPTION$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "MessageDescription" element
         */
        public boolean isSetMessageDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGEDESCRIPTION$6) != 0;
            }
        }
        
        /**
         * Sets the "MessageDescription" element
         */
        public void setMessageDescription(java.lang.String messageDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEDESCRIPTION$6);
                }
                target.setStringValue(messageDescription);
            }
        }
        
        /**
         * Sets (as xml) the "MessageDescription" element
         */
        public void xsetMessageDescription(x0.oasisNamesTcEmergencyEDXLRM1.MessageDescriptionType messageDescription)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageDescriptionType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageDescriptionType)get_store().find_element_user(MESSAGEDESCRIPTION$6, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageDescriptionType)get_store().add_element_user(MESSAGEDESCRIPTION$6);
                }
                target.set(messageDescription);
            }
        }
        
        /**
         * Unsets the "MessageDescription" element
         */
        public void unsetMessageDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGEDESCRIPTION$6, 0);
            }
        }
        
        /**
         * Gets the "OriginatingMessageID" element
         */
        public java.lang.String getOriginatingMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGMESSAGEID$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OriginatingMessageID" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType xgetOriginatingMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().find_element_user(ORIGINATINGMESSAGEID$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OriginatingMessageID" element
         */
        public void setOriginatingMessageID(java.lang.String originatingMessageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATINGMESSAGEID$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATINGMESSAGEID$8);
                }
                target.setStringValue(originatingMessageID);
            }
        }
        
        /**
         * Sets (as xml) the "OriginatingMessageID" element
         */
        public void xsetOriginatingMessageID(x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType originatingMessageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().find_element_user(ORIGINATINGMESSAGEID$8, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().add_element_user(ORIGINATINGMESSAGEID$8);
                }
                target.set(originatingMessageID);
            }
        }
        
        /**
         * Gets the "PrecedingMessageID" element
         */
        public java.lang.String getPrecedingMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECEDINGMESSAGEID$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PrecedingMessageID" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType xgetPrecedingMessageID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().find_element_user(PRECEDINGMESSAGEID$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PrecedingMessageID" element
         */
        public void setPrecedingMessageID(java.lang.String precedingMessageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECEDINGMESSAGEID$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECEDINGMESSAGEID$10);
                }
                target.setStringValue(precedingMessageID);
            }
        }
        
        /**
         * Sets (as xml) the "PrecedingMessageID" element
         */
        public void xsetPrecedingMessageID(x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType precedingMessageID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().find_element_user(PRECEDINGMESSAGEID$10, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType)get_store().add_element_user(PRECEDINGMESSAGEID$10);
                }
                target.set(precedingMessageID);
            }
        }
        
        /**
         * Gets array of all "IncidentInformation" elements
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType[] getIncidentInformationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(INCIDENTINFORMATION$12, targetList);
                x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType[] result = new x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "IncidentInformation" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType getIncidentInformationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType)get_store().find_element_user(INCIDENTINFORMATION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "IncidentInformation" element
         */
        public int sizeOfIncidentInformationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTINFORMATION$12);
            }
        }
        
        /**
         * Sets array of all "IncidentInformation" element
         */
        public void setIncidentInformationArray(x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType[] incidentInformationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(incidentInformationArray, INCIDENTINFORMATION$12);
            }
        }
        
        /**
         * Sets ith "IncidentInformation" element
         */
        public void setIncidentInformationArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType incidentInformation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType)get_store().find_element_user(INCIDENTINFORMATION$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(incidentInformation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IncidentInformation" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType insertNewIncidentInformation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType)get_store().insert_element_user(INCIDENTINFORMATION$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IncidentInformation" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType addNewIncidentInformation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType)get_store().add_element_user(INCIDENTINFORMATION$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "IncidentInformation" element
         */
        public void removeIncidentInformation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTINFORMATION$12, i);
            }
        }
        
        /**
         * Gets the "MessageRecall" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType getMessageRecall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType)get_store().find_element_user(MESSAGERECALL$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "MessageRecall" element
         */
        public boolean isSetMessageRecall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MESSAGERECALL$14) != 0;
            }
        }
        
        /**
         * Sets the "MessageRecall" element
         */
        public void setMessageRecall(x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType messageRecall)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType)get_store().find_element_user(MESSAGERECALL$14, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType)get_store().add_element_user(MESSAGERECALL$14);
                }
                target.set(messageRecall);
            }
        }
        
        /**
         * Appends and returns a new empty "MessageRecall" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType addNewMessageRecall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType)get_store().add_element_user(MESSAGERECALL$14);
                return target;
            }
        }
        
        /**
         * Unsets the "MessageRecall" element
         */
        public void unsetMessageRecall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MESSAGERECALL$14, 0);
            }
        }
        
        /**
         * Gets array of all "Funding" elements
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.FundingType[] getFundingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FUNDING$16, targetList);
                x0.oasisNamesTcEmergencyEDXLRM1.FundingType[] result = new x0.oasisNamesTcEmergencyEDXLRM1.FundingType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Funding" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.FundingType getFundingArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.FundingType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.FundingType)get_store().find_element_user(FUNDING$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Funding" element
         */
        public int sizeOfFundingArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FUNDING$16);
            }
        }
        
        /**
         * Sets array of all "Funding" element
         */
        public void setFundingArray(x0.oasisNamesTcEmergencyEDXLRM1.FundingType[] fundingArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fundingArray, FUNDING$16);
            }
        }
        
        /**
         * Sets ith "Funding" element
         */
        public void setFundingArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.FundingType funding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.FundingType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.FundingType)get_store().find_element_user(FUNDING$16, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(funding);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Funding" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.FundingType insertNewFunding(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.FundingType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.FundingType)get_store().insert_element_user(FUNDING$16, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Funding" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.FundingType addNewFunding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.FundingType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.FundingType)get_store().add_element_user(FUNDING$16);
                return target;
            }
        }
        
        /**
         * Removes the ith "Funding" element
         */
        public void removeFunding(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FUNDING$16, i);
            }
        }
        
        /**
         * Gets array of all "ContactInformation" elements
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType[] getContactInformationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACTINFORMATION$18, targetList);
                x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType[] result = new x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ContactInformation" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType getContactInformationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType)get_store().find_element_user(CONTACTINFORMATION$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ContactInformation" element
         */
        public int sizeOfContactInformationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTINFORMATION$18);
            }
        }
        
        /**
         * Sets array of all "ContactInformation" element
         */
        public void setContactInformationArray(x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType[] contactInformationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactInformationArray, CONTACTINFORMATION$18);
            }
        }
        
        /**
         * Sets ith "ContactInformation" element
         */
        public void setContactInformationArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType contactInformation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType)get_store().find_element_user(CONTACTINFORMATION$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contactInformation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ContactInformation" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType insertNewContactInformation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType)get_store().insert_element_user(CONTACTINFORMATION$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ContactInformation" element
         */
        public x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType addNewContactInformation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType target = null;
                target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType)get_store().add_element_user(CONTACTINFORMATION$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "ContactInformation" element
         */
        public void removeContactInformation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTINFORMATION$18, i);
            }
        }
        
        /**
         * Gets array of all "ResourceInformation" elements
         */
        public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation[] getResourceInformationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESOURCEINFORMATION$20, targetList);
                x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation[] result = new x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ResourceInformation" element
         */
        public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation getResourceInformationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation target = null;
                target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation)get_store().find_element_user(RESOURCEINFORMATION$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ResourceInformation" element
         */
        public int sizeOfResourceInformationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEINFORMATION$20);
            }
        }
        
        /**
         * Sets array of all "ResourceInformation" element
         */
        public void setResourceInformationArray(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation[] resourceInformationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resourceInformationArray, RESOURCEINFORMATION$20);
            }
        }
        
        /**
         * Sets ith "ResourceInformation" element
         */
        public void setResourceInformationArray(int i, x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation resourceInformation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation target = null;
                target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation)get_store().find_element_user(RESOURCEINFORMATION$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(resourceInformation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ResourceInformation" element
         */
        public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation insertNewResourceInformation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation target = null;
                target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation)get_store().insert_element_user(RESOURCEINFORMATION$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ResourceInformation" element
         */
        public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation addNewResourceInformation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation target = null;
                target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation)get_store().add_element_user(RESOURCEINFORMATION$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "ResourceInformation" element
         */
        public void removeResourceInformation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEINFORMATION$20, i);
            }
        }
        /**
         * An XML MessageContentType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
         *
         * This is an atomic type that is a restriction of x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument$ResponseToRequestQuote$MessageContentType.
         */
        public static class MessageContentTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.MessageContentType
        {
            private static final long serialVersionUID = 1L;
            
            public MessageContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MessageContentTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML ResourceInformation(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
         *
         * This is a complex type.
         */
        public static class ResourceInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation
        {
            private static final long serialVersionUID = 1L;
            
            public ResourceInformationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RESOURCEINFOELEMENTID$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ResourceInfoElementID");
            private static final javax.xml.namespace.QName RESPONSEINFORMATION$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ResponseInformation");
            private static final javax.xml.namespace.QName RESOURCE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Resource");
            private static final javax.xml.namespace.QName ASSIGNMENTINFORMATION$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "AssignmentInformation");
            private static final javax.xml.namespace.QName SCHEDULEINFORMATION$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ScheduleInformation");
            
            
            /**
             * Gets the "ResourceInfoElementID" element
             */
            public java.lang.String getResourceInfoElementID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEINFOELEMENTID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ResourceInfoElementID" element
             */
            public x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType xgetResourceInfoElementID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType)get_store().find_element_user(RESOURCEINFOELEMENTID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "ResourceInfoElementID" element
             */
            public void setResourceInfoElementID(java.lang.String resourceInfoElementID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEINFOELEMENTID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEINFOELEMENTID$0);
                    }
                    target.setStringValue(resourceInfoElementID);
                }
            }
            
            /**
             * Sets (as xml) the "ResourceInfoElementID" element
             */
            public void xsetResourceInfoElementID(x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType resourceInfoElementID)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType)get_store().find_element_user(RESOURCEINFOELEMENTID$0, 0);
                    if (target == null)
                    {
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType)get_store().add_element_user(RESOURCEINFOELEMENTID$0);
                    }
                    target.set(resourceInfoElementID);
                }
            }
            
            /**
             * Gets the "ResponseInformation" element
             */
            public x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType getResponseInformation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType)get_store().find_element_user(RESPONSEINFORMATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "ResponseInformation" element
             */
            public void setResponseInformation(x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType responseInformation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType)get_store().find_element_user(RESPONSEINFORMATION$2, 0);
                    if (target == null)
                    {
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType)get_store().add_element_user(RESPONSEINFORMATION$2);
                    }
                    target.set(responseInformation);
                }
            }
            
            /**
             * Appends and returns a new empty "ResponseInformation" element
             */
            public x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType addNewResponseInformation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType target = null;
                    target = (x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType)get_store().add_element_user(RESPONSEINFORMATION$2);
                    return target;
                }
            }
            
            /**
             * Gets the "Resource" element
             */
            public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource getResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource)get_store().find_element_user(RESOURCE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Resource" element
             */
            public boolean isSetResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESOURCE$4) != 0;
                }
            }
            
            /**
             * Sets the "Resource" element
             */
            public void setResource(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource resource)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource)get_store().find_element_user(RESOURCE$4, 0);
                    if (target == null)
                    {
                      target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource)get_store().add_element_user(RESOURCE$4);
                    }
                    target.set(resource);
                }
            }
            
            /**
             * Appends and returns a new empty "Resource" element
             */
            public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource addNewResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource)get_store().add_element_user(RESOURCE$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "Resource" element
             */
            public void unsetResource()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESOURCE$4, 0);
                }
            }
            
            /**
             * Gets the "AssignmentInformation" element
             */
            public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation getAssignmentInformation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation)get_store().find_element_user(ASSIGNMENTINFORMATION$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "AssignmentInformation" element
             */
            public boolean isSetAssignmentInformation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ASSIGNMENTINFORMATION$6) != 0;
                }
            }
            
            /**
             * Sets the "AssignmentInformation" element
             */
            public void setAssignmentInformation(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation assignmentInformation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation)get_store().find_element_user(ASSIGNMENTINFORMATION$6, 0);
                    if (target == null)
                    {
                      target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation)get_store().add_element_user(ASSIGNMENTINFORMATION$6);
                    }
                    target.set(assignmentInformation);
                }
            }
            
            /**
             * Appends and returns a new empty "AssignmentInformation" element
             */
            public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation addNewAssignmentInformation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation)get_store().add_element_user(ASSIGNMENTINFORMATION$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "AssignmentInformation" element
             */
            public void unsetAssignmentInformation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ASSIGNMENTINFORMATION$6, 0);
                }
            }
            
            /**
             * Gets array of all "ScheduleInformation" elements
             */
            public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation[] getScheduleInformationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SCHEDULEINFORMATION$8, targetList);
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation[] result = new x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ScheduleInformation" element
             */
            public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation getScheduleInformationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation)get_store().find_element_user(SCHEDULEINFORMATION$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ScheduleInformation" element
             */
            public int sizeOfScheduleInformationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SCHEDULEINFORMATION$8);
                }
            }
            
            /**
             * Sets array of all "ScheduleInformation" element
             */
            public void setScheduleInformationArray(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation[] scheduleInformationArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(scheduleInformationArray, SCHEDULEINFORMATION$8);
                }
            }
            
            /**
             * Sets ith "ScheduleInformation" element
             */
            public void setScheduleInformationArray(int i, x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation scheduleInformation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation)get_store().find_element_user(SCHEDULEINFORMATION$8, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(scheduleInformation);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ScheduleInformation" element
             */
            public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation insertNewScheduleInformation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation)get_store().insert_element_user(SCHEDULEINFORMATION$8, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ScheduleInformation" element
             */
            public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation addNewScheduleInformation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation target = null;
                    target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation)get_store().add_element_user(SCHEDULEINFORMATION$8);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ScheduleInformation" element
             */
            public void removeScheduleInformation(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SCHEDULEINFORMATION$8, i);
                }
            }
            /**
             * An XML Resource(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
             *
             * This is a complex type.
             */
            public static class ResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource
            {
                private static final long serialVersionUID = 1L;
                
                public ResourceImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RESOURCEID$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ResourceID");
                private static final javax.xml.namespace.QName NAME$2 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Name");
                private static final javax.xml.namespace.QName TYPESTRUCTURE$4 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "TypeStructure");
                private static final javax.xml.namespace.QName TYPEINFO$6 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "TypeInfo");
                private static final javax.xml.namespace.QName KEYWORD$8 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Keyword");
                private static final javax.xml.namespace.QName DESCRIPTION$10 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Description");
                private static final javax.xml.namespace.QName CREDENTIALS$12 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Credentials");
                private static final javax.xml.namespace.QName CERTIFICATIONS$14 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Certifications");
                private static final javax.xml.namespace.QName SPECIALREQUIREMENTS$16 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "SpecialRequirements");
                private static final javax.xml.namespace.QName RESPONSIBLEPARTY$18 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ResponsibleParty");
                private static final javax.xml.namespace.QName OWNERSHIPINFORMATION$20 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "OwnershipInformation");
                private static final javax.xml.namespace.QName RESOURCESTATUS$22 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ResourceStatus");
                
                
                /**
                 * Gets the "ResourceID" element
                 */
                public java.lang.String getResourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ResourceID" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ResourceIDType xgetResourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ResourceIDType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceIDType)get_store().find_element_user(RESOURCEID$0, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "ResourceID" element
                 */
                public boolean isSetResourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RESOURCEID$0) != 0;
                    }
                }
                
                /**
                 * Sets the "ResourceID" element
                 */
                public void setResourceID(java.lang.String resourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEID$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEID$0);
                      }
                      target.setStringValue(resourceID);
                    }
                }
                
                /**
                 * Sets (as xml) the "ResourceID" element
                 */
                public void xsetResourceID(x0.oasisNamesTcEmergencyEDXLRM1.ResourceIDType resourceID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ResourceIDType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceIDType)get_store().find_element_user(RESOURCEID$0, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceIDType)get_store().add_element_user(RESOURCEID$0);
                      }
                      target.set(resourceID);
                    }
                }
                
                /**
                 * Unsets the "ResourceID" element
                 */
                public void unsetResourceID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RESOURCEID$0, 0);
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
                public x0.oasisNamesTcEmergencyEDXLRM1.ResourceNameType xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ResourceNameType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceNameType)get_store().find_element_user(NAME$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Name" element
                 */
                public boolean isSetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(NAME$2) != 0;
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
                public void xsetName(x0.oasisNamesTcEmergencyEDXLRM1.ResourceNameType name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ResourceNameType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceNameType)get_store().find_element_user(NAME$2, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.ResourceNameType)get_store().add_element_user(NAME$2);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Unsets the "Name" element
                 */
                public void unsetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(NAME$2, 0);
                    }
                }
                
                /**
                 * Gets the "TypeStructure" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getTypeStructure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(TYPESTRUCTURE$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "TypeStructure" element
                 */
                public boolean isSetTypeStructure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TYPESTRUCTURE$4) != 0;
                    }
                }
                
                /**
                 * Sets the "TypeStructure" element
                 */
                public void setTypeStructure(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType typeStructure)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(TYPESTRUCTURE$4, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(TYPESTRUCTURE$4);
                      }
                      target.set(typeStructure);
                    }
                }
                
                /**
                 * Appends and returns a new empty "TypeStructure" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewTypeStructure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(TYPESTRUCTURE$4);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "TypeStructure" element
                 */
                public void unsetTypeStructure()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TYPESTRUCTURE$4, 0);
                    }
                }
                
                /**
                 * Gets the "TypeInfo" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType getTypeInfo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType)get_store().find_element_user(TYPEINFO$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "TypeInfo" element
                 */
                public boolean isSetTypeInfo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TYPEINFO$6) != 0;
                    }
                }
                
                /**
                 * Sets the "TypeInfo" element
                 */
                public void setTypeInfo(x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType typeInfo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType)get_store().find_element_user(TYPEINFO$6, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType)get_store().add_element_user(TYPEINFO$6);
                      }
                      target.set(typeInfo);
                    }
                }
                
                /**
                 * Appends and returns a new empty "TypeInfo" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType addNewTypeInfo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType)get_store().add_element_user(TYPEINFO$6);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "TypeInfo" element
                 */
                public void unsetTypeInfo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TYPEINFO$6, 0);
                    }
                }
                
                /**
                 * Gets array of all "Keyword" elements
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType[] getKeywordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(KEYWORD$8, targetList);
                      x0.oasisNamesTcEmergencyEDXLRM1.ValueListType[] result = new x0.oasisNamesTcEmergencyEDXLRM1.ValueListType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Keyword" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getKeywordArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(KEYWORD$8, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Keyword" element
                 */
                public int sizeOfKeywordArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(KEYWORD$8);
                    }
                }
                
                /**
                 * Sets array of all "Keyword" element
                 */
                public void setKeywordArray(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType[] keywordArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(keywordArray, KEYWORD$8);
                    }
                }
                
                /**
                 * Sets ith "Keyword" element
                 */
                public void setKeywordArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.ValueListType keyword)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(KEYWORD$8, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(keyword);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType insertNewKeyword(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().insert_element_user(KEYWORD$8, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Keyword" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewKeyword()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(KEYWORD$8);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Keyword" element
                 */
                public void removeKeyword(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(KEYWORD$8, i);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$10, 0);
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
                public x0.oasisNamesTcEmergencyEDXLRM1.DescriptionType xgetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.DescriptionType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.DescriptionType)get_store().find_element_user(DESCRIPTION$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Description" element
                 */
                public boolean isSetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DESCRIPTION$10) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$10);
                      }
                      target.setStringValue(description);
                    }
                }
                
                /**
                 * Sets (as xml) the "Description" element
                 */
                public void xsetDescription(x0.oasisNamesTcEmergencyEDXLRM1.DescriptionType description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.DescriptionType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.DescriptionType)get_store().find_element_user(DESCRIPTION$10, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.DescriptionType)get_store().add_element_user(DESCRIPTION$10);
                      }
                      target.set(description);
                    }
                }
                
                /**
                 * Unsets the "Description" element
                 */
                public void unsetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DESCRIPTION$10, 0);
                    }
                }
                
                /**
                 * Gets the "Credentials" element
                 */
                public java.lang.String getCredentials()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDENTIALS$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Credentials" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.CredentialsType xgetCredentials()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.CredentialsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.CredentialsType)get_store().find_element_user(CREDENTIALS$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Credentials" element
                 */
                public boolean isSetCredentials()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CREDENTIALS$12) != 0;
                    }
                }
                
                /**
                 * Sets the "Credentials" element
                 */
                public void setCredentials(java.lang.String credentials)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREDENTIALS$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREDENTIALS$12);
                      }
                      target.setStringValue(credentials);
                    }
                }
                
                /**
                 * Sets (as xml) the "Credentials" element
                 */
                public void xsetCredentials(x0.oasisNamesTcEmergencyEDXLRM1.CredentialsType credentials)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.CredentialsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.CredentialsType)get_store().find_element_user(CREDENTIALS$12, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.CredentialsType)get_store().add_element_user(CREDENTIALS$12);
                      }
                      target.set(credentials);
                    }
                }
                
                /**
                 * Unsets the "Credentials" element
                 */
                public void unsetCredentials()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CREDENTIALS$12, 0);
                    }
                }
                
                /**
                 * Gets the "Certifications" element
                 */
                public java.lang.String getCertifications()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CERTIFICATIONS$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Certifications" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.CertificationsType xgetCertifications()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.CertificationsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.CertificationsType)get_store().find_element_user(CERTIFICATIONS$14, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Certifications" element
                 */
                public boolean isSetCertifications()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CERTIFICATIONS$14) != 0;
                    }
                }
                
                /**
                 * Sets the "Certifications" element
                 */
                public void setCertifications(java.lang.String certifications)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CERTIFICATIONS$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CERTIFICATIONS$14);
                      }
                      target.setStringValue(certifications);
                    }
                }
                
                /**
                 * Sets (as xml) the "Certifications" element
                 */
                public void xsetCertifications(x0.oasisNamesTcEmergencyEDXLRM1.CertificationsType certifications)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.CertificationsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.CertificationsType)get_store().find_element_user(CERTIFICATIONS$14, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.CertificationsType)get_store().add_element_user(CERTIFICATIONS$14);
                      }
                      target.set(certifications);
                    }
                }
                
                /**
                 * Unsets the "Certifications" element
                 */
                public void unsetCertifications()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CERTIFICATIONS$14, 0);
                    }
                }
                
                /**
                 * Gets the "SpecialRequirements" element
                 */
                public java.lang.String getSpecialRequirements()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALREQUIREMENTS$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SpecialRequirements" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.SpecialRequirementsType xgetSpecialRequirements()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.SpecialRequirementsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.SpecialRequirementsType)get_store().find_element_user(SPECIALREQUIREMENTS$16, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "SpecialRequirements" element
                 */
                public boolean isSetSpecialRequirements()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SPECIALREQUIREMENTS$16) != 0;
                    }
                }
                
                /**
                 * Sets the "SpecialRequirements" element
                 */
                public void setSpecialRequirements(java.lang.String specialRequirements)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALREQUIREMENTS$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPECIALREQUIREMENTS$16);
                      }
                      target.setStringValue(specialRequirements);
                    }
                }
                
                /**
                 * Sets (as xml) the "SpecialRequirements" element
                 */
                public void xsetSpecialRequirements(x0.oasisNamesTcEmergencyEDXLRM1.SpecialRequirementsType specialRequirements)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.SpecialRequirementsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.SpecialRequirementsType)get_store().find_element_user(SPECIALREQUIREMENTS$16, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.SpecialRequirementsType)get_store().add_element_user(SPECIALREQUIREMENTS$16);
                      }
                      target.set(specialRequirements);
                    }
                }
                
                /**
                 * Unsets the "SpecialRequirements" element
                 */
                public void unsetSpecialRequirements()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SPECIALREQUIREMENTS$16, 0);
                    }
                }
                
                /**
                 * Gets the "ResponsibleParty" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType getResponsibleParty()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType)get_store().find_element_user(RESPONSIBLEPARTY$18, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "ResponsibleParty" element
                 */
                public boolean isSetResponsibleParty()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RESPONSIBLEPARTY$18) != 0;
                    }
                }
                
                /**
                 * Sets the "ResponsibleParty" element
                 */
                public void setResponsibleParty(x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType responsibleParty)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType)get_store().find_element_user(RESPONSIBLEPARTY$18, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType)get_store().add_element_user(RESPONSIBLEPARTY$18);
                      }
                      target.set(responsibleParty);
                    }
                }
                
                /**
                 * Appends and returns a new empty "ResponsibleParty" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType addNewResponsibleParty()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType)get_store().add_element_user(RESPONSIBLEPARTY$18);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "ResponsibleParty" element
                 */
                public void unsetResponsibleParty()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RESPONSIBLEPARTY$18, 0);
                    }
                }
                
                /**
                 * Gets the "OwnershipInformation" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType getOwnershipInformation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType)get_store().find_element_user(OWNERSHIPINFORMATION$20, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "OwnershipInformation" element
                 */
                public boolean isSetOwnershipInformation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(OWNERSHIPINFORMATION$20) != 0;
                    }
                }
                
                /**
                 * Sets the "OwnershipInformation" element
                 */
                public void setOwnershipInformation(x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType ownershipInformation)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType)get_store().find_element_user(OWNERSHIPINFORMATION$20, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType)get_store().add_element_user(OWNERSHIPINFORMATION$20);
                      }
                      target.set(ownershipInformation);
                    }
                }
                
                /**
                 * Appends and returns a new empty "OwnershipInformation" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType addNewOwnershipInformation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType)get_store().add_element_user(OWNERSHIPINFORMATION$20);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "OwnershipInformation" element
                 */
                public void unsetOwnershipInformation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(OWNERSHIPINFORMATION$20, 0);
                    }
                }
                
                /**
                 * Gets the "ResourceStatus" element
                 */
                public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus getResourceStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus target = null;
                      target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus)get_store().find_element_user(RESOURCESTATUS$22, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "ResourceStatus" element
                 */
                public boolean isSetResourceStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RESOURCESTATUS$22) != 0;
                    }
                }
                
                /**
                 * Sets the "ResourceStatus" element
                 */
                public void setResourceStatus(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus resourceStatus)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus target = null;
                      target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus)get_store().find_element_user(RESOURCESTATUS$22, 0);
                      if (target == null)
                      {
                        target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus)get_store().add_element_user(RESOURCESTATUS$22);
                      }
                      target.set(resourceStatus);
                    }
                }
                
                /**
                 * Appends and returns a new empty "ResourceStatus" element
                 */
                public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus addNewResourceStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus target = null;
                      target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus)get_store().add_element_user(RESOURCESTATUS$22);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "ResourceStatus" element
                 */
                public void unsetResourceStatus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RESOURCESTATUS$22, 0);
                    }
                }
                /**
                 * An XML ResourceStatus(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
                 *
                 * This is a complex type.
                 */
                public static class ResourceStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.Resource.ResourceStatus
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ResourceStatusImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName INVENTORYREFRESHDATETIME$0 = 
                      new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "InventoryRefreshDateTime");
                    private static final javax.xml.namespace.QName DEPLOYMENTSTATUS$2 = 
                      new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "DeploymentStatus");
                    private static final javax.xml.namespace.QName AVAILABILITY$4 = 
                      new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Availability");
                    
                    
                    /**
                     * Gets the "InventoryRefreshDateTime" element
                     */
                    public java.util.Calendar getInventoryRefreshDateTime()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVENTORYREFRESHDATETIME$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "InventoryRefreshDateTime" element
                     */
                    public x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType xgetInventoryRefreshDateTime()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType target = null;
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType)get_store().find_element_user(INVENTORYREFRESHDATETIME$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "InventoryRefreshDateTime" element
                     */
                    public boolean isSetInventoryRefreshDateTime()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(INVENTORYREFRESHDATETIME$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "InventoryRefreshDateTime" element
                     */
                    public void setInventoryRefreshDateTime(java.util.Calendar inventoryRefreshDateTime)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVENTORYREFRESHDATETIME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVENTORYREFRESHDATETIME$0);
                        }
                        target.setCalendarValue(inventoryRefreshDateTime);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "InventoryRefreshDateTime" element
                     */
                    public void xsetInventoryRefreshDateTime(x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType inventoryRefreshDateTime)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType target = null;
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType)get_store().find_element_user(INVENTORYREFRESHDATETIME$0, 0);
                        if (target == null)
                        {
                          target = (x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType)get_store().add_element_user(INVENTORYREFRESHDATETIME$0);
                        }
                        target.set(inventoryRefreshDateTime);
                      }
                    }
                    
                    /**
                     * Unsets the "InventoryRefreshDateTime" element
                     */
                    public void unsetInventoryRefreshDateTime()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(INVENTORYREFRESHDATETIME$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "DeploymentStatus" element
                     */
                    public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getDeploymentStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(DEPLOYMENTSTATUS$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "DeploymentStatus" element
                     */
                    public boolean isSetDeploymentStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(DEPLOYMENTSTATUS$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "DeploymentStatus" element
                     */
                    public void setDeploymentStatus(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType deploymentStatus)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().find_element_user(DEPLOYMENTSTATUS$2, 0);
                        if (target == null)
                        {
                          target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(DEPLOYMENTSTATUS$2);
                        }
                        target.set(deploymentStatus);
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty "DeploymentStatus" element
                     */
                    public x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewDeploymentStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0.oasisNamesTcEmergencyEDXLRM1.ValueListType target = null;
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.ValueListType)get_store().add_element_user(DEPLOYMENTSTATUS$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "DeploymentStatus" element
                     */
                    public void unsetDeploymentStatus()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(DEPLOYMENTSTATUS$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "Availability" element
                     */
                    public java.lang.String getAvailability()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABILITY$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Availability" element
                     */
                    public x0.oasisNamesTcEmergencyEDXLRM1.AvailabilityType xgetAvailability()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0.oasisNamesTcEmergencyEDXLRM1.AvailabilityType target = null;
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.AvailabilityType)get_store().find_element_user(AVAILABILITY$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Availability" element
                     */
                    public boolean isSetAvailability()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(AVAILABILITY$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Availability" element
                     */
                    public void setAvailability(java.lang.String availability)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABILITY$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVAILABILITY$4);
                        }
                        target.setStringValue(availability);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Availability" element
                     */
                    public void xsetAvailability(x0.oasisNamesTcEmergencyEDXLRM1.AvailabilityType availability)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        x0.oasisNamesTcEmergencyEDXLRM1.AvailabilityType target = null;
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.AvailabilityType)get_store().find_element_user(AVAILABILITY$4, 0);
                        if (target == null)
                        {
                          target = (x0.oasisNamesTcEmergencyEDXLRM1.AvailabilityType)get_store().add_element_user(AVAILABILITY$4);
                        }
                        target.set(availability);
                      }
                    }
                    
                    /**
                     * Unsets the "Availability" element
                     */
                    public void unsetAvailability()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(AVAILABILITY$4, 0);
                      }
                    }
                }
            }
            /**
             * An XML AssignmentInformation(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
             *
             * This is a complex type.
             */
            public static class AssignmentInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.AssignmentInformation
            {
                private static final long serialVersionUID = 1L;
                
                public AssignmentInformationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName QUANTITY$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Quantity");
                private static final javax.xml.namespace.QName RESTRICTIONS$2 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Restrictions");
                private static final javax.xml.namespace.QName ANTICIPATEDFUNCTION$4 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "AnticipatedFunction");
                private static final javax.xml.namespace.QName PRICEQUOTE$6 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "PriceQuote");
                private static final javax.xml.namespace.QName ASSIGNMENTINSTRUCTIONS$8 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "AssignmentInstructions");
                
                
                /**
                 * Gets the "Quantity" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.QuantityType getQuantity()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.QuantityType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType)get_store().find_element_user(QUANTITY$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "Quantity" element
                 */
                public boolean isSetQuantity()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(QUANTITY$0) != 0;
                    }
                }
                
                /**
                 * Sets the "Quantity" element
                 */
                public void setQuantity(x0.oasisNamesTcEmergencyEDXLRM1.QuantityType quantity)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.QuantityType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType)get_store().find_element_user(QUANTITY$0, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType)get_store().add_element_user(QUANTITY$0);
                      }
                      target.set(quantity);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Quantity" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.QuantityType addNewQuantity()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.QuantityType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.QuantityType)get_store().add_element_user(QUANTITY$0);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "Quantity" element
                 */
                public void unsetQuantity()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(QUANTITY$0, 0);
                    }
                }
                
                /**
                 * Gets the "Restrictions" element
                 */
                public java.lang.String getRestrictions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICTIONS$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Restrictions" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.RestrictionsType xgetRestrictions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.RestrictionsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.RestrictionsType)get_store().find_element_user(RESTRICTIONS$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Restrictions" element
                 */
                public boolean isSetRestrictions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RESTRICTIONS$2) != 0;
                    }
                }
                
                /**
                 * Sets the "Restrictions" element
                 */
                public void setRestrictions(java.lang.String restrictions)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESTRICTIONS$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESTRICTIONS$2);
                      }
                      target.setStringValue(restrictions);
                    }
                }
                
                /**
                 * Sets (as xml) the "Restrictions" element
                 */
                public void xsetRestrictions(x0.oasisNamesTcEmergencyEDXLRM1.RestrictionsType restrictions)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.RestrictionsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.RestrictionsType)get_store().find_element_user(RESTRICTIONS$2, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.RestrictionsType)get_store().add_element_user(RESTRICTIONS$2);
                      }
                      target.set(restrictions);
                    }
                }
                
                /**
                 * Unsets the "Restrictions" element
                 */
                public void unsetRestrictions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RESTRICTIONS$2, 0);
                    }
                }
                
                /**
                 * Gets the "AnticipatedFunction" element
                 */
                public java.lang.String getAnticipatedFunction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTICIPATEDFUNCTION$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "AnticipatedFunction" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.AnticipatedFunctionType xgetAnticipatedFunction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.AnticipatedFunctionType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.AnticipatedFunctionType)get_store().find_element_user(ANTICIPATEDFUNCTION$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "AnticipatedFunction" element
                 */
                public boolean isSetAnticipatedFunction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(ANTICIPATEDFUNCTION$4) != 0;
                    }
                }
                
                /**
                 * Sets the "AnticipatedFunction" element
                 */
                public void setAnticipatedFunction(java.lang.String anticipatedFunction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANTICIPATEDFUNCTION$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANTICIPATEDFUNCTION$4);
                      }
                      target.setStringValue(anticipatedFunction);
                    }
                }
                
                /**
                 * Sets (as xml) the "AnticipatedFunction" element
                 */
                public void xsetAnticipatedFunction(x0.oasisNamesTcEmergencyEDXLRM1.AnticipatedFunctionType anticipatedFunction)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.AnticipatedFunctionType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.AnticipatedFunctionType)get_store().find_element_user(ANTICIPATEDFUNCTION$4, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.AnticipatedFunctionType)get_store().add_element_user(ANTICIPATEDFUNCTION$4);
                      }
                      target.set(anticipatedFunction);
                    }
                }
                
                /**
                 * Unsets the "AnticipatedFunction" element
                 */
                public void unsetAnticipatedFunction()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(ANTICIPATEDFUNCTION$4, 0);
                    }
                }
                
                /**
                 * Gets the "PriceQuote" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType getPriceQuote()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType)get_store().find_element_user(PRICEQUOTE$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "PriceQuote" element
                 */
                public void setPriceQuote(x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType priceQuote)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType)get_store().find_element_user(PRICEQUOTE$6, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType)get_store().add_element_user(PRICEQUOTE$6);
                      }
                      target.set(priceQuote);
                    }
                }
                
                /**
                 * Appends and returns a new empty "PriceQuote" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType addNewPriceQuote()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType)get_store().add_element_user(PRICEQUOTE$6);
                      return target;
                    }
                }
                
                /**
                 * Gets the "AssignmentInstructions" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType getAssignmentInstructions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType)get_store().find_element_user(ASSIGNMENTINSTRUCTIONS$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "AssignmentInstructions" element
                 */
                public boolean isSetAssignmentInstructions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(ASSIGNMENTINSTRUCTIONS$8) != 0;
                    }
                }
                
                /**
                 * Sets the "AssignmentInstructions" element
                 */
                public void setAssignmentInstructions(x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType assignmentInstructions)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType)get_store().find_element_user(ASSIGNMENTINSTRUCTIONS$8, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType)get_store().add_element_user(ASSIGNMENTINSTRUCTIONS$8);
                      }
                      target.set(assignmentInstructions);
                    }
                }
                
                /**
                 * Appends and returns a new empty "AssignmentInstructions" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType addNewAssignmentInstructions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType)get_store().add_element_user(ASSIGNMENTINSTRUCTIONS$8);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "AssignmentInstructions" element
                 */
                public void unsetAssignmentInstructions()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(ASSIGNMENTINSTRUCTIONS$8, 0);
                    }
                }
            }
            /**
             * An XML ScheduleInformation(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
             *
             * This is a complex type.
             */
            public static class ScheduleInformationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation
            {
                private static final long serialVersionUID = 1L;
                
                public ScheduleInformationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName SCHEDULETYPE$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "ScheduleType");
                private static final javax.xml.namespace.QName DATETIME$2 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "DateTime");
                private static final javax.xml.namespace.QName LOCATION$4 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "Location");
                
                
                /**
                 * Gets the "ScheduleType" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum getScheduleType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULETYPE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ScheduleType" element
                 */
                public x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation.ScheduleType xgetScheduleType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation.ScheduleType target = null;
                      target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation.ScheduleType)get_store().find_element_user(SCHEDULETYPE$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "ScheduleType" element
                 */
                public void setScheduleType(x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum scheduleType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULETYPE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULETYPE$0);
                      }
                      target.setEnumValue(scheduleType);
                    }
                }
                
                /**
                 * Sets (as xml) the "ScheduleType" element
                 */
                public void xsetScheduleType(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation.ScheduleType scheduleType)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation.ScheduleType target = null;
                      target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation.ScheduleType)get_store().find_element_user(SCHEDULETYPE$0, 0);
                      if (target == null)
                      {
                        target = (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation.ScheduleType)get_store().add_element_user(SCHEDULETYPE$0);
                      }
                      target.set(scheduleType);
                    }
                }
                
                /**
                 * Gets the "DateTime" element
                 */
                public java.util.Calendar getDateTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "DateTime" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType xgetDateTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType)get_store().find_element_user(DATETIME$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "DateTime" element
                 */
                public boolean isSetDateTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DATETIME$2) != 0;
                    }
                }
                
                /**
                 * Sets the "DateTime" element
                 */
                public void setDateTime(java.util.Calendar dateTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIME$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIME$2);
                      }
                      target.setCalendarValue(dateTime);
                    }
                }
                
                /**
                 * Sets (as xml) the "DateTime" element
                 */
                public void xsetDateTime(x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType dateTime)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType)get_store().find_element_user(DATETIME$2, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType)get_store().add_element_user(DATETIME$2);
                      }
                      target.set(dateTime);
                    }
                }
                
                /**
                 * Unsets the "DateTime" element
                 */
                public void unsetDateTime()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DATETIME$2, 0);
                    }
                }
                
                /**
                 * Gets the "Location" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.LocationType getLocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.LocationType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationType)get_store().find_element_user(LOCATION$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "Location" element
                 */
                public boolean isSetLocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(LOCATION$4) != 0;
                    }
                }
                
                /**
                 * Sets the "Location" element
                 */
                public void setLocation(x0.oasisNamesTcEmergencyEDXLRM1.LocationType location)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.LocationType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationType)get_store().find_element_user(LOCATION$4, 0);
                      if (target == null)
                      {
                        target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationType)get_store().add_element_user(LOCATION$4);
                      }
                      target.set(location);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Location" element
                 */
                public x0.oasisNamesTcEmergencyEDXLRM1.LocationType addNewLocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      x0.oasisNamesTcEmergencyEDXLRM1.LocationType target = null;
                      target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationType)get_store().add_element_user(LOCATION$4);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "Location" element
                 */
                public void unsetLocation()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(LOCATION$4, 0);
                    }
                }
                /**
                 * An XML ScheduleType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
                 *
                 * This is an atomic type that is a restriction of x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument$ResponseToRequestQuote$ResourceInformation$ScheduleInformation$ScheduleType.
                 */
                public static class ScheduleTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestQuoteDocument.ResponseToRequestQuote.ResourceInformation.ScheduleInformation.ScheduleType
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ScheduleTypeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected ScheduleTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
        }
    }
}
