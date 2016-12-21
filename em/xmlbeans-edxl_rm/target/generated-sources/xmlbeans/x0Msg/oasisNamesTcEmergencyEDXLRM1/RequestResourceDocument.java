/*
 * An XML document type.
 * Localname: RequestResource
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg
 * Java type: x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument
 *
 * Automatically generated - do not modify.
 */
package x0Msg.oasisNamesTcEmergencyEDXLRM1;


/**
 * A document containing one RequestResource(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg) element.
 *
 * This is a complex type.
 */
public interface RequestResourceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestResourceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("requestresourcefb74doctype");
    
    /**
     * Gets the "RequestResource" element
     */
    x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource getRequestResource();
    
    /**
     * Sets the "RequestResource" element
     */
    void setRequestResource(x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource requestResource);
    
    /**
     * Appends and returns a new empty "RequestResource" element
     */
    x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource addNewRequestResource();
    
    /**
     * An XML RequestResource(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
     *
     * This is a complex type.
     */
    public interface RequestResource extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestResource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("requestresource964belemtype");
        
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
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType.Enum getMessageContentType();
        
        /**
         * Gets (as xml) the "MessageContentType" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType xgetMessageContentType();
        
        /**
         * Sets the "MessageContentType" element
         */
        void setMessageContentType(x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType.Enum messageContentType);
        
        /**
         * Sets (as xml) the "MessageContentType" element
         */
        void xsetMessageContentType(x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType messageContentType);
        
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
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding[] getFundingArray();
        
        /**
         * Gets ith "Funding" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding getFundingArray(int i);
        
        /**
         * Returns number of "Funding" element
         */
        int sizeOfFundingArray();
        
        /**
         * Sets array of all "Funding" element
         */
        void setFundingArray(x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding[] fundingArray);
        
        /**
         * Sets ith "Funding" element
         */
        void setFundingArray(int i, x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding funding);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Funding" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding insertNewFunding(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Funding" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding addNewFunding();
        
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
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation[] getResourceInformationArray();
        
        /**
         * Gets ith "ResourceInformation" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation getResourceInformationArray(int i);
        
        /**
         * Returns number of "ResourceInformation" element
         */
        int sizeOfResourceInformationArray();
        
        /**
         * Sets array of all "ResourceInformation" element
         */
        void setResourceInformationArray(x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation[] resourceInformationArray);
        
        /**
         * Sets ith "ResourceInformation" element
         */
        void setResourceInformationArray(int i, x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation resourceInformation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ResourceInformation" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation insertNewResourceInformation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ResourceInformation" element
         */
        x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation addNewResourceInformation();
        
        /**
         * Removes the ith "ResourceInformation" element
         */
        void removeResourceInformation(int i);
        
        /**
         * An XML MessageContentType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
         *
         * This is an atomic type that is a restriction of x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument$RequestResource$MessageContentType.
         */
        public interface MessageContentType extends x0.oasisNamesTcEmergencyEDXLRM1.MessageContentTypeType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageContentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("messagecontenttype87c3elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum REQUEST_RESOURCE = Enum.forString("RequestResource");
            
            static final int INT_REQUEST_RESOURCE = Enum.INT_REQUEST_RESOURCE;
            
            /**
             * Enumeration value class for x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument$RequestResource$MessageContentType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_REQUEST_RESOURCE
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
                
                static final int INT_REQUEST_RESOURCE = 1;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("RequestResource", INT_REQUEST_RESOURCE),
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
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType newValue(java.lang.Object obj) {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType) type.newValue( obj ); }
                
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType newInstance() {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.MessageContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Funding(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
         *
         * This is a complex type.
         */
        public interface Funding extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Funding.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("fundingc222elemtype");
            
            /**
             * Gets the "FundCode" element
             */
            java.lang.String getFundCode();
            
            /**
             * Gets (as xml) the "FundCode" element
             */
            x0.oasisNamesTcEmergencyEDXLRM1.FundCodeType xgetFundCode();
            
            /**
             * True if has "FundCode" element
             */
            boolean isSetFundCode();
            
            /**
             * Sets the "FundCode" element
             */
            void setFundCode(java.lang.String fundCode);
            
            /**
             * Sets (as xml) the "FundCode" element
             */
            void xsetFundCode(x0.oasisNamesTcEmergencyEDXLRM1.FundCodeType fundCode);
            
            /**
             * Unsets the "FundCode" element
             */
            void unsetFundCode();
            
            /**
             * Gets the "FundingInfo" element
             */
            java.lang.String getFundingInfo();
            
            /**
             * Gets (as xml) the "FundingInfo" element
             */
            x0.oasisNamesTcEmergencyEDXLRM1.FundingInfoType xgetFundingInfo();
            
            /**
             * True if has "FundingInfo" element
             */
            boolean isSetFundingInfo();
            
            /**
             * Sets the "FundingInfo" element
             */
            void setFundingInfo(java.lang.String fundingInfo);
            
            /**
             * Sets (as xml) the "FundingInfo" element
             */
            void xsetFundingInfo(x0.oasisNamesTcEmergencyEDXLRM1.FundingInfoType fundingInfo);
            
            /**
             * Unsets the "FundingInfo" element
             */
            void unsetFundingInfo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding newInstance() {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.Funding) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceInformation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("resourceinformation5f01elemtype");
            
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
             * Gets the "Resource" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.Resource getResource();
            
            /**
             * Sets the "Resource" element
             */
            void setResource(x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.Resource resource);
            
            /**
             * Appends and returns a new empty "Resource" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.Resource addNewResource();
            
            /**
             * Gets the "AssignmentInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.AssignmentInformation getAssignmentInformation();
            
            /**
             * True if has "AssignmentInformation" element
             */
            boolean isSetAssignmentInformation();
            
            /**
             * Sets the "AssignmentInformation" element
             */
            void setAssignmentInformation(x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.AssignmentInformation assignmentInformation);
            
            /**
             * Appends and returns a new empty "AssignmentInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.AssignmentInformation addNewAssignmentInformation();
            
            /**
             * Unsets the "AssignmentInformation" element
             */
            void unsetAssignmentInformation();
            
            /**
             * Gets array of all "ScheduleInformation" elements
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation[] getScheduleInformationArray();
            
            /**
             * Gets ith "ScheduleInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation getScheduleInformationArray(int i);
            
            /**
             * Returns number of "ScheduleInformation" element
             */
            int sizeOfScheduleInformationArray();
            
            /**
             * Sets array of all "ScheduleInformation" element
             */
            void setScheduleInformationArray(x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation[] scheduleInformationArray);
            
            /**
             * Sets ith "ScheduleInformation" element
             */
            void setScheduleInformationArray(int i, x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation scheduleInformation);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ScheduleInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation insertNewScheduleInformation(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ScheduleInformation" element
             */
            x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation addNewScheduleInformation();
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resource.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("resourcea6f7elemtype");
                
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
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.Resource newInstance() {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.Resource newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.Resource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssignmentInformation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("assignmentinformation4a36elemtype");
                
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
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.AssignmentInformation newInstance() {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.AssignmentInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.AssignmentInformation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.AssignmentInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScheduleInformation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("scheduleinformation8d80elemtype");
                
                /**
                 * Gets the "ScheduleType" element
                 */
                x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum getScheduleType();
                
                /**
                 * Gets (as xml) the "ScheduleType" element
                 */
                x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation.ScheduleType xgetScheduleType();
                
                /**
                 * Sets the "ScheduleType" element
                 */
                void setScheduleType(x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum scheduleType);
                
                /**
                 * Sets (as xml) the "ScheduleType" element
                 */
                void xsetScheduleType(x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation.ScheduleType scheduleType);
                
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
                 * An XML ScheduleType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg).
                 *
                 * This is an atomic type that is a restriction of x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument$RequestResource$ResourceInformation$ScheduleInformation$ScheduleType.
                 */
                public interface ScheduleType extends x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScheduleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("scheduletype4973elemtype");
                    
                    static final x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum REQUESTED_ARRIVAL = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.REQUESTED_ARRIVAL;
                    static final x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum REQUESTED_DEPARTURE = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.REQUESTED_DEPARTURE;
                    static final x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum ESTIMATED_RETURN_DEPARTURE = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.ESTIMATED_RETURN_DEPARTURE;
                    static final x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum ESTIMATED_RETURN_ARRIVAL = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.ESTIMATED_RETURN_ARRIVAL;
                    static final x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum REPORT_TO = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.REPORT_TO;
                    static final x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.Enum ROUTE = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.ROUTE;
                    
                    static final int INT_REQUESTED_ARRIVAL = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.INT_REQUESTED_ARRIVAL;
                    static final int INT_REQUESTED_DEPARTURE = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.INT_REQUESTED_DEPARTURE;
                    static final int INT_ESTIMATED_RETURN_DEPARTURE = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.INT_ESTIMATED_RETURN_DEPARTURE;
                    static final int INT_ESTIMATED_RETURN_ARRIVAL = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.INT_ESTIMATED_RETURN_ARRIVAL;
                    static final int INT_REPORT_TO = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.INT_REPORT_TO;
                    static final int INT_ROUTE = x0.oasisNamesTcEmergencyEDXLRM1.ScheduleTypeType.INT_ROUTE;
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation.ScheduleType newValue(java.lang.Object obj) {
                        return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation.ScheduleType) type.newValue( obj ); }
                      
                      public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation.ScheduleType newInstance() {
                        return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation.ScheduleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation.ScheduleType newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation.ScheduleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation newInstance() {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation.ScheduleInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation newInstance() {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource.ResourceInformation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource newInstance() {
              return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument newInstance() {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
