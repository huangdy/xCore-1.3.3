/*
 * An XML document type.
 * Localname: ResponseToRequestInformation
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg
 * Java type: x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument
 *
 * Automatically generated - do not modify.
 */
package x0Msg.oasisNamesTcEmergencyEDXLRM1;


/**
 * A document containing one ResponseToRequestInformation(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg) element.
 *
 * This is a complex type.
 */
public interface ResponseToRequestInformationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseToRequestInformationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("responsetorequestinformation2846doctype");
    
    /**
     * Gets the "ResponseToRequestInformation" element
     */
    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation getResponseToRequestInformation();
    
    /**
     * Sets the "ResponseToRequestInformation" element
     */
    void setResponseToRequestInformation(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation responseToRequestInformation);
    
    /**
     * Appends and returns a new empty "ResponseToRequestInformation" element
     */
    x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation addNewResponseToRequestInformation();
    
    /**
     * An XML ResponseToRequestInformation(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
     *
     * This is a complex type.
     */
    public interface ResponseToRequestInformation extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResponseToRequestInformation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("responsetorequestinformation3c5belemtype");
        
        /**
         * Gets the "MessageID" element
         */
        java.lang.String getMessageID();
        
        /**
         * Gets (as xml) the "MessageID" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType xgetMessageID();
        
        /**
         * Sets the "MessageID" element
         */
        void setMessageID(java.lang.String messageID);
        
        /**
         * Sets (as xml) the "MessageID" element
         */
        void xsetMessageID(x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType messageID);
        
        /**
         * Gets the "SentDateTime" element
         */
        java.util.Calendar getSentDateTime();
        
        /**
         * Gets (as xml) the "SentDateTime" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType xgetSentDateTime();
        
        /**
         * Sets the "SentDateTime" element
         */
        void setSentDateTime(java.util.Calendar sentDateTime);
        
        /**
         * Sets (as xml) the "SentDateTime" element
         */
        void xsetSentDateTime(x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType sentDateTime);
        
        /**
         * Gets the "MessageContentType" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType.Enum getMessageContentType();
        
        /**
         * Gets (as xml) the "MessageContentType" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType xgetMessageContentType();
        
        /**
         * Sets the "MessageContentType" element
         */
        void setMessageContentType(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType.Enum messageContentType);
        
        /**
         * Sets (as xml) the "MessageContentType" element
         */
        void xsetMessageContentType(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType messageContentType);
        
        /**
         * Gets the "MessageDescription" element
         */
        java.lang.String getMessageDescription();
        
        /**
         * Gets (as xml) the "MessageDescription" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.MessageDescriptionType xgetMessageDescription();
        
        /**
         * True if has "MessageDescription" element
         */
        boolean isSetMessageDescription();
        
        /**
         * Sets the "MessageDescription" element
         */
        void setMessageDescription(java.lang.String messageDescription);
        
        /**
         * Sets (as xml) the "MessageDescription" element
         */
        void xsetMessageDescription(x0.oasisNamesTcEmergencyEDXLRM1.MessageDescriptionType messageDescription);
        
        /**
         * Unsets the "MessageDescription" element
         */
        void unsetMessageDescription();
        
        /**
         * Gets the "OriginatingMessageID" element
         */
        java.lang.String getOriginatingMessageID();
        
        /**
         * Gets (as xml) the "OriginatingMessageID" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType xgetOriginatingMessageID();
        
        /**
         * Sets the "OriginatingMessageID" element
         */
        void setOriginatingMessageID(java.lang.String originatingMessageID);
        
        /**
         * Sets (as xml) the "OriginatingMessageID" element
         */
        void xsetOriginatingMessageID(x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType originatingMessageID);
        
        /**
         * Gets the "PrecedingMessageID" element
         */
        java.lang.String getPrecedingMessageID();
        
        /**
         * Gets (as xml) the "PrecedingMessageID" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType xgetPrecedingMessageID();
        
        /**
         * Sets the "PrecedingMessageID" element
         */
        void setPrecedingMessageID(java.lang.String precedingMessageID);
        
        /**
         * Sets (as xml) the "PrecedingMessageID" element
         */
        void xsetPrecedingMessageID(x0.oasisNamesTcEmergencyEDXLRM1.MessageIDType precedingMessageID);
        
        /**
         * Gets array of all "IncidentInformation" elements
         */
        x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType[] getIncidentInformationArray();
        
        /**
         * Gets ith "IncidentInformation" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType getIncidentInformationArray(int i);
        
        /**
         * Returns number of "IncidentInformation" element
         */
        int sizeOfIncidentInformationArray();
        
        /**
         * Sets array of all "IncidentInformation" element
         */
        void setIncidentInformationArray(x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType[] incidentInformationArray);
        
        /**
         * Sets ith "IncidentInformation" element
         */
        void setIncidentInformationArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType incidentInformation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "IncidentInformation" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType insertNewIncidentInformation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "IncidentInformation" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType addNewIncidentInformation();
        
        /**
         * Removes the ith "IncidentInformation" element
         */
        void removeIncidentInformation(int i);
        
        /**
         * Gets the "MessageRecall" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType getMessageRecall();
        
        /**
         * True if has "MessageRecall" element
         */
        boolean isSetMessageRecall();
        
        /**
         * Sets the "MessageRecall" element
         */
        void setMessageRecall(x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType messageRecall);
        
        /**
         * Appends and returns a new empty "MessageRecall" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.MessageRecallType addNewMessageRecall();
        
        /**
         * Unsets the "MessageRecall" element
         */
        void unsetMessageRecall();
        
        /**
         * Gets array of all "Funding" elements
         */
        x0.oasisNamesTcEmergencyEDXLRM1.FundingType[] getFundingArray();
        
        /**
         * Gets ith "Funding" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.FundingType getFundingArray(int i);
        
        /**
         * Returns number of "Funding" element
         */
        int sizeOfFundingArray();
        
        /**
         * Sets array of all "Funding" element
         */
        void setFundingArray(x0.oasisNamesTcEmergencyEDXLRM1.FundingType[] fundingArray);
        
        /**
         * Sets ith "Funding" element
         */
        void setFundingArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.FundingType funding);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Funding" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.FundingType insertNewFunding(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Funding" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.FundingType addNewFunding();
        
        /**
         * Removes the ith "Funding" element
         */
        void removeFunding(int i);
        
        /**
         * Gets array of all "ContactInformation" elements
         */
        x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType[] getContactInformationArray();
        
        /**
         * Gets ith "ContactInformation" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType getContactInformationArray(int i);
        
        /**
         * Returns number of "ContactInformation" element
         */
        int sizeOfContactInformationArray();
        
        /**
         * Sets array of all "ContactInformation" element
         */
        void setContactInformationArray(x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType[] contactInformationArray);
        
        /**
         * Sets ith "ContactInformation" element
         */
        void setContactInformationArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType contactInformation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ContactInformation" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType insertNewContactInformation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ContactInformation" element
         */
        x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType addNewContactInformation();
        
        /**
         * Removes the ith "ContactInformation" element
         */
        void removeContactInformation(int i);
        
        /**
         * Gets array of all "ResourceInformation" elements
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation[] getResourceInformationArray();
        
        /**
         * Gets ith "ResourceInformation" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation getResourceInformationArray(int i);
        
        /**
         * Returns number of "ResourceInformation" element
         */
        int sizeOfResourceInformationArray();
        
        /**
         * Sets array of all "ResourceInformation" element
         */
        void setResourceInformationArray(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation[] resourceInformationArray);
        
        /**
         * Sets ith "ResourceInformation" element
         */
        void setResourceInformationArray(int i, x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation resourceInformation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ResourceInformation" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation insertNewResourceInformation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ResourceInformation" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation addNewResourceInformation();
        
        /**
         * Removes the ith "ResourceInformation" element
         */
        void removeResourceInformation(int i);
        
        /**
         * An XML MessageContentType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
         *
         * This is an atomic type that is a restriction of x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument$ResponseToRequestInformation$MessageContentType.
         */
        public interface MessageContentType extends x0.oasisNamesTcEmergencyEDXLRM1.MessageContentTypeType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageContentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("messagecontenttypec7d3elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum RESPONSE_TO_REQUEST_INFORMATION = Enum.forString("ResponseToRequestInformation");
            
            static final int INT_RESPONSE_TO_REQUEST_INFORMATION = Enum.INT_RESPONSE_TO_REQUEST_INFORMATION;
            
            /**
             * Enumeration value class for x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument$ResponseToRequestInformation$MessageContentType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_RESPONSE_TO_REQUEST_INFORMATION
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_RESPONSE_TO_REQUEST_INFORMATION = 1;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("ResponseToRequestInformation", INT_RESPONSE_TO_REQUEST_INFORMATION),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType newValue(java.lang.Object obj) {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType) type.newValue( obj ); }
                
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType newInstance() {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.MessageContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ResourceInformation(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
         *
         * This is a complex type.
         */
        public interface ResourceInformation extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceInformation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("resourceinformationed91elemtype");
            
            /**
             * Gets the "ResourceInfoElementID" element
             */
            java.lang.String getResourceInfoElementID();
            
            /**
             * Gets (as xml) the "ResourceInfoElementID" element
             */
            x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType xgetResourceInfoElementID();
            
            /**
             * Sets the "ResourceInfoElementID" element
             */
            void setResourceInfoElementID(java.lang.String resourceInfoElementID);
            
            /**
             * Sets (as xml) the "ResourceInfoElementID" element
             */
            void xsetResourceInfoElementID(x0.oasisNamesTcEmergencyEDXLRM1.ResourceInfoElementIDType resourceInfoElementID);
            
            /**
             * Gets the "ResponseInformation" element
             */
            x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType getResponseInformation();
            
            /**
             * True if has "ResponseInformation" element
             */
            boolean isSetResponseInformation();
            
            /**
             * Sets the "ResponseInformation" element
             */
            void setResponseInformation(x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType responseInformation);
            
            /**
             * Appends and returns a new empty "ResponseInformation" element
             */
            x0.oasisNamesTcEmergencyEDXLRM1.ResponseInformationType addNewResponseInformation();
            
            /**
             * Unsets the "ResponseInformation" element
             */
            void unsetResponseInformation();
            
            /**
             * Gets the "Resource" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource getResource();
            
            /**
             * True if has "Resource" element
             */
            boolean isSetResource();
            
            /**
             * Sets the "Resource" element
             */
            void setResource(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource resource);
            
            /**
             * Appends and returns a new empty "Resource" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource addNewResource();
            
            /**
             * Unsets the "Resource" element
             */
            void unsetResource();
            
            /**
             * Gets the "AssignmentInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.AssignmentInformation getAssignmentInformation();
            
            /**
             * True if has "AssignmentInformation" element
             */
            boolean isSetAssignmentInformation();
            
            /**
             * Sets the "AssignmentInformation" element
             */
            void setAssignmentInformation(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.AssignmentInformation assignmentInformation);
            
            /**
             * Appends and returns a new empty "AssignmentInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.AssignmentInformation addNewAssignmentInformation();
            
            /**
             * Unsets the "AssignmentInformation" element
             */
            void unsetAssignmentInformation();
            
            /**
             * Gets array of all "ScheduleInformation" elements
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation[] getScheduleInformationArray();
            
            /**
             * Gets ith "ScheduleInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation getScheduleInformationArray(int i);
            
            /**
             * Returns number of "ScheduleInformation" element
             */
            int sizeOfScheduleInformationArray();
            
            /**
             * Sets array of all "ScheduleInformation" element
             */
            void setScheduleInformationArray(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation[] scheduleInformationArray);
            
            /**
             * Sets ith "ScheduleInformation" element
             */
            void setScheduleInformationArray(int i, x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation scheduleInformation);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ScheduleInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation insertNewScheduleInformation(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ScheduleInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation addNewScheduleInformation();
            
            /**
             * Removes the ith "ScheduleInformation" element
             */
            void removeScheduleInformation(int i);
            
            /**
             * An XML Resource(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
             *
             * This is a complex type.
             */
            public interface Resource extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("resource8e07elemtype");
                
                /**
                 * Gets the "ResourceID" element
                 */
                java.lang.String getResourceID();
                
                /**
                 * Gets (as xml) the "ResourceID" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ResourceIDType xgetResourceID();
                
                /**
                 * True if has "ResourceID" element
                 */
                boolean isSetResourceID();
                
                /**
                 * Sets the "ResourceID" element
                 */
                void setResourceID(java.lang.String resourceID);
                
                /**
                 * Sets (as xml) the "ResourceID" element
                 */
                void xsetResourceID(x0.oasisNamesTcEmergencyEDXLRM1.ResourceIDType resourceID);
                
                /**
                 * Unsets the "ResourceID" element
                 */
                void unsetResourceID();
                
                /**
                 * Gets the "Name" element
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "Name" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ResourceNameType xgetName();
                
                /**
                 * True if has "Name" element
                 */
                boolean isSetName();
                
                /**
                 * Sets the "Name" element
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "Name" element
                 */
                void xsetName(x0.oasisNamesTcEmergencyEDXLRM1.ResourceNameType name);
                
                /**
                 * Unsets the "Name" element
                 */
                void unsetName();
                
                /**
                 * Gets the "TypeStructure" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getTypeStructure();
                
                /**
                 * True if has "TypeStructure" element
                 */
                boolean isSetTypeStructure();
                
                /**
                 * Sets the "TypeStructure" element
                 */
                void setTypeStructure(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType typeStructure);
                
                /**
                 * Appends and returns a new empty "TypeStructure" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewTypeStructure();
                
                /**
                 * Unsets the "TypeStructure" element
                 */
                void unsetTypeStructure();
                
                /**
                 * Gets the "TypeInfo" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType getTypeInfo();
                
                /**
                 * True if has "TypeInfo" element
                 */
                boolean isSetTypeInfo();
                
                /**
                 * Sets the "TypeInfo" element
                 */
                void setTypeInfo(x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType typeInfo);
                
                /**
                 * Appends and returns a new empty "TypeInfo" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.TypeInfoType addNewTypeInfo();
                
                /**
                 * Unsets the "TypeInfo" element
                 */
                void unsetTypeInfo();
                
                /**
                 * Gets array of all "Keyword" elements
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ValueListType[] getKeywordArray();
                
                /**
                 * Gets ith "Keyword" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getKeywordArray(int i);
                
                /**
                 * Returns number of "Keyword" element
                 */
                int sizeOfKeywordArray();
                
                /**
                 * Sets array of all "Keyword" element
                 */
                void setKeywordArray(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType[] keywordArray);
                
                /**
                 * Sets ith "Keyword" element
                 */
                void setKeywordArray(int i, x0.oasisNamesTcEmergencyEDXLRM1.ValueListType keyword);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ValueListType insertNewKeyword(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Keyword" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewKeyword();
                
                /**
                 * Removes the ith "Keyword" element
                 */
                void removeKeyword(int i);
                
                /**
                 * Gets the "Description" element
                 */
                java.lang.String getDescription();
                
                /**
                 * Gets (as xml) the "Description" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.DescriptionType xgetDescription();
                
                /**
                 * True if has "Description" element
                 */
                boolean isSetDescription();
                
                /**
                 * Sets the "Description" element
                 */
                void setDescription(java.lang.String description);
                
                /**
                 * Sets (as xml) the "Description" element
                 */
                void xsetDescription(x0.oasisNamesTcEmergencyEDXLRM1.DescriptionType description);
                
                /**
                 * Unsets the "Description" element
                 */
                void unsetDescription();
                
                /**
                 * Gets the "Credentials" element
                 */
                java.lang.String getCredentials();
                
                /**
                 * Gets (as xml) the "Credentials" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.CredentialsType xgetCredentials();
                
                /**
                 * True if has "Credentials" element
                 */
                boolean isSetCredentials();
                
                /**
                 * Sets the "Credentials" element
                 */
                void setCredentials(java.lang.String credentials);
                
                /**
                 * Sets (as xml) the "Credentials" element
                 */
                void xsetCredentials(x0.oasisNamesTcEmergencyEDXLRM1.CredentialsType credentials);
                
                /**
                 * Unsets the "Credentials" element
                 */
                void unsetCredentials();
                
                /**
                 * Gets the "Certifications" element
                 */
                java.lang.String getCertifications();
                
                /**
                 * Gets (as xml) the "Certifications" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.CertificationsType xgetCertifications();
                
                /**
                 * True if has "Certifications" element
                 */
                boolean isSetCertifications();
                
                /**
                 * Sets the "Certifications" element
                 */
                void setCertifications(java.lang.String certifications);
                
                /**
                 * Sets (as xml) the "Certifications" element
                 */
                void xsetCertifications(x0.oasisNamesTcEmergencyEDXLRM1.CertificationsType certifications);
                
                /**
                 * Unsets the "Certifications" element
                 */
                void unsetCertifications();
                
                /**
                 * Gets the "SpecialRequirements" element
                 */
                java.lang.String getSpecialRequirements();
                
                /**
                 * Gets (as xml) the "SpecialRequirements" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.SpecialRequirementsType xgetSpecialRequirements();
                
                /**
                 * True if has "SpecialRequirements" element
                 */
                boolean isSetSpecialRequirements();
                
                /**
                 * Sets the "SpecialRequirements" element
                 */
                void setSpecialRequirements(java.lang.String specialRequirements);
                
                /**
                 * Sets (as xml) the "SpecialRequirements" element
                 */
                void xsetSpecialRequirements(x0.oasisNamesTcEmergencyEDXLRM1.SpecialRequirementsType specialRequirements);
                
                /**
                 * Unsets the "SpecialRequirements" element
                 */
                void unsetSpecialRequirements();
                
                /**
                 * Gets the "ResponsibleParty" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType getResponsibleParty();
                
                /**
                 * True if has "ResponsibleParty" element
                 */
                boolean isSetResponsibleParty();
                
                /**
                 * Sets the "ResponsibleParty" element
                 */
                void setResponsibleParty(x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType responsibleParty);
                
                /**
                 * Appends and returns a new empty "ResponsibleParty" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ContactInformationType addNewResponsibleParty();
                
                /**
                 * Unsets the "ResponsibleParty" element
                 */
                void unsetResponsibleParty();
                
                /**
                 * Gets the "OwnershipInformation" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType getOwnershipInformation();
                
                /**
                 * True if has "OwnershipInformation" element
                 */
                boolean isSetOwnershipInformation();
                
                /**
                 * Sets the "OwnershipInformation" element
                 */
                void setOwnershipInformation(x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType ownershipInformation);
                
                /**
                 * Appends and returns a new empty "OwnershipInformation" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.OwnershipInformationType addNewOwnershipInformation();
                
                /**
                 * Unsets the "OwnershipInformation" element
                 */
                void unsetOwnershipInformation();
                
                /**
                 * Gets the "ResourceStatus" element
                 */
                x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource.ResourceStatus getResourceStatus();
                
                /**
                 * True if has "ResourceStatus" element
                 */
                boolean isSetResourceStatus();
                
                /**
                 * Sets the "ResourceStatus" element
                 */
                void setResourceStatus(x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource.ResourceStatus resourceStatus);
                
                /**
                 * Appends and returns a new empty "ResourceStatus" element
                 */
                x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource.ResourceStatus addNewResourceStatus();
                
                /**
                 * Unsets the "ResourceStatus" element
                 */
                void unsetResourceStatus();
                
                /**
                 * An XML ResourceStatus(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
                 *
                 * This is a complex type.
                 */
                public interface ResourceStatus extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("resourcestatuscc63elemtype");
                    
                    /**
                     * Gets the "InventoryRefreshDateTime" element
                     */
                    java.util.Calendar getInventoryRefreshDateTime();
                    
                    /**
                     * Gets (as xml) the "InventoryRefreshDateTime" element
                     */
                    x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType xgetInventoryRefreshDateTime();
                    
                    /**
                     * True if has "InventoryRefreshDateTime" element
                     */
                    boolean isSetInventoryRefreshDateTime();
                    
                    /**
                     * Sets the "InventoryRefreshDateTime" element
                     */
                    void setInventoryRefreshDateTime(java.util.Calendar inventoryRefreshDateTime);
                    
                    /**
                     * Sets (as xml) the "InventoryRefreshDateTime" element
                     */
                    void xsetInventoryRefreshDateTime(x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType inventoryRefreshDateTime);
                    
                    /**
                     * Unsets the "InventoryRefreshDateTime" element
                     */
                    void unsetInventoryRefreshDateTime();
                    
                    /**
                     * Gets the "DeploymentStatus" element
                     */
                    x0.oasisNamesTcEmergencyEDXLRM1.ValueListType getDeploymentStatus();
                    
                    /**
                     * True if has "DeploymentStatus" element
                     */
                    boolean isSetDeploymentStatus();
                    
                    /**
                     * Sets the "DeploymentStatus" element
                     */
                    void setDeploymentStatus(x0.oasisNamesTcEmergencyEDXLRM1.ValueListType deploymentStatus);
                    
                    /**
                     * Appends and returns a new empty "DeploymentStatus" element
                     */
                    x0.oasisNamesTcEmergencyEDXLRM1.ValueListType addNewDeploymentStatus();
                    
                    /**
                     * Unsets the "DeploymentStatus" element
                     */
                    void unsetDeploymentStatus();
                    
                    /**
                     * Gets the "Availability" element
                     */
                    java.lang.String getAvailability();
                    
                    /**
                     * Gets (as xml) the "Availability" element
                     */
                    x0.oasisNamesTcEmergencyEDXLRM1.AvailabilityType xgetAvailability();
                    
                    /**
                     * True if has "Availability" element
                     */
                    boolean isSetAvailability();
                    
                    /**
                     * Sets the "Availability" element
                     */
                    void setAvailability(java.lang.String availability);
                    
                    /**
                     * Sets (as xml) the "Availability" element
                     */
                    void xsetAvailability(x0.oasisNamesTcEmergencyEDXLRM1.AvailabilityType availability);
                    
                    /**
                     * Unsets the "Availability" element
                     */
                    void unsetAvailability();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource.ResourceStatus newInstance() {
                        return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource.ResourceStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource.ResourceStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource.ResourceStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource newInstance() {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML AssignmentInformation(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
             *
             * This is a complex type.
             */
            public interface AssignmentInformation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssignmentInformation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("assignmentinformation9086elemtype");
                
                /**
                 * Gets the "Quantity" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.QuantityType getQuantity();
                
                /**
                 * True if has "Quantity" element
                 */
                boolean isSetQuantity();
                
                /**
                 * Sets the "Quantity" element
                 */
                void setQuantity(x0.oasisNamesTcEmergencyEDXLRM1.QuantityType quantity);
                
                /**
                 * Appends and returns a new empty "Quantity" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.QuantityType addNewQuantity();
                
                /**
                 * Unsets the "Quantity" element
                 */
                void unsetQuantity();
                
                /**
                 * Gets the "Restrictions" element
                 */
                java.lang.String getRestrictions();
                
                /**
                 * Gets (as xml) the "Restrictions" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.RestrictionsType xgetRestrictions();
                
                /**
                 * True if has "Restrictions" element
                 */
                boolean isSetRestrictions();
                
                /**
                 * Sets the "Restrictions" element
                 */
                void setRestrictions(java.lang.String restrictions);
                
                /**
                 * Sets (as xml) the "Restrictions" element
                 */
                void xsetRestrictions(x0.oasisNamesTcEmergencyEDXLRM1.RestrictionsType restrictions);
                
                /**
                 * Unsets the "Restrictions" element
                 */
                void unsetRestrictions();
                
                /**
                 * Gets the "AnticipatedFunction" element
                 */
                java.lang.String getAnticipatedFunction();
                
                /**
                 * Gets (as xml) the "AnticipatedFunction" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.AnticipatedFunctionType xgetAnticipatedFunction();
                
                /**
                 * True if has "AnticipatedFunction" element
                 */
                boolean isSetAnticipatedFunction();
                
                /**
                 * Sets the "AnticipatedFunction" element
                 */
                void setAnticipatedFunction(java.lang.String anticipatedFunction);
                
                /**
                 * Sets (as xml) the "AnticipatedFunction" element
                 */
                void xsetAnticipatedFunction(x0.oasisNamesTcEmergencyEDXLRM1.AnticipatedFunctionType anticipatedFunction);
                
                /**
                 * Unsets the "AnticipatedFunction" element
                 */
                void unsetAnticipatedFunction();
                
                /**
                 * Gets the "PriceQuote" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType getPriceQuote();
                
                /**
                 * True if has "PriceQuote" element
                 */
                boolean isSetPriceQuote();
                
                /**
                 * Sets the "PriceQuote" element
                 */
                void setPriceQuote(x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType priceQuote);
                
                /**
                 * Appends and returns a new empty "PriceQuote" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.PriceQuoteType addNewPriceQuote();
                
                /**
                 * Unsets the "PriceQuote" element
                 */
                void unsetPriceQuote();
                
                /**
                 * Gets the "OrderID" element
                 */
                java.lang.String getOrderID();
                
                /**
                 * Gets (as xml) the "OrderID" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.OrderIDType xgetOrderID();
                
                /**
                 * True if has "OrderID" element
                 */
                boolean isSetOrderID();
                
                /**
                 * Sets the "OrderID" element
                 */
                void setOrderID(java.lang.String orderID);
                
                /**
                 * Sets (as xml) the "OrderID" element
                 */
                void xsetOrderID(x0.oasisNamesTcEmergencyEDXLRM1.OrderIDType orderID);
                
                /**
                 * Unsets the "OrderID" element
                 */
                void unsetOrderID();
                
                /**
                 * Gets the "AssignmentInstructions" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType getAssignmentInstructions();
                
                /**
                 * True if has "AssignmentInstructions" element
                 */
                boolean isSetAssignmentInstructions();
                
                /**
                 * Sets the "AssignmentInstructions" element
                 */
                void setAssignmentInstructions(x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType assignmentInstructions);
                
                /**
                 * Appends and returns a new empty "AssignmentInstructions" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.AssignmentInstructionsType addNewAssignmentInstructions();
                
                /**
                 * Unsets the "AssignmentInstructions" element
                 */
                void unsetAssignmentInstructions();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.AssignmentInformation newInstance() {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.AssignmentInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.AssignmentInformation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.AssignmentInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ScheduleInformation(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
             *
             * This is a complex type.
             */
            public interface ScheduleInformation extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScheduleInformation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("scheduleinformationeb50elemtype");
                
                /**
                 * Gets the "ScheduleType" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum getScheduleType();
                
                /**
                 * Gets (as xml) the "ScheduleType" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType xgetScheduleType();
                
                /**
                 * Sets the "ScheduleType" element
                 */
                void setScheduleType(x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum scheduleType);
                
                /**
                 * Sets (as xml) the "ScheduleType" element
                 */
                void xsetScheduleType(x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType scheduleType);
                
                /**
                 * Gets the "DateTime" element
                 */
                java.util.Calendar getDateTime();
                
                /**
                 * Gets (as xml) the "DateTime" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType xgetDateTime();
                
                /**
                 * True if has "DateTime" element
                 */
                boolean isSetDateTime();
                
                /**
                 * Sets the "DateTime" element
                 */
                void setDateTime(java.util.Calendar dateTime);
                
                /**
                 * Sets (as xml) the "DateTime" element
                 */
                void xsetDateTime(x0.oasisNamesTcEmergencyEDXLRM1.DateTimeType dateTime);
                
                /**
                 * Unsets the "DateTime" element
                 */
                void unsetDateTime();
                
                /**
                 * Gets the "Location" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.LocationType getLocation();
                
                /**
                 * True if has "Location" element
                 */
                boolean isSetLocation();
                
                /**
                 * Sets the "Location" element
                 */
                void setLocation(x0.oasisNamesTcEmergencyEDXLRM1.LocationType location);
                
                /**
                 * Appends and returns a new empty "Location" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.LocationType addNewLocation();
                
                /**
                 * Unsets the "Location" element
                 */
                void unsetLocation();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation newInstance() {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation.ScheduleInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation newInstance() {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation.ResourceInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation newInstance() {
              return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument.ResponseToRequestInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument newInstance() {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.ResponseToRequestInformationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}