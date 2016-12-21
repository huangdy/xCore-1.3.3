/*
 * An XML document type.
 * Localname: Events
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.EventsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one Events(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface EventsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("events4796doctype");
    
    /**
     * Gets the "Events" element
     */
    oasisNamesTcCiqXpil3.EventsDocument.Events getEvents();
    
    /**
     * Sets the "Events" element
     */
    void setEvents(oasisNamesTcCiqXpil3.EventsDocument.Events events);
    
    /**
     * Appends and returns a new empty "Events" element
     */
    oasisNamesTcCiqXpil3.EventsDocument.Events addNewEvents();
    
    /**
     * An XML Events(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface Events extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Events.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("events4e21elemtype");
        
        /**
         * Gets array of all "Event" elements
         */
        oasisNamesTcCiqXpil3.EventsDocument.Events.Event[] getEventArray();
        
        /**
         * Gets ith "Event" element
         */
        oasisNamesTcCiqXpil3.EventsDocument.Events.Event getEventArray(int i);
        
        /**
         * Returns number of "Event" element
         */
        int sizeOfEventArray();
        
        /**
         * Sets array of all "Event" element
         */
        void setEventArray(oasisNamesTcCiqXpil3.EventsDocument.Events.Event[] eventArray);
        
        /**
         * Sets ith "Event" element
         */
        void setEventArray(int i, oasisNamesTcCiqXpil3.EventsDocument.Events.Event event);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Event" element
         */
        oasisNamesTcCiqXpil3.EventsDocument.Events.Event insertNewEvent(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Event" element
         */
        oasisNamesTcCiqXpil3.EventsDocument.Events.Event addNewEvent();
        
        /**
         * Removes the ith "Event" element
         */
        void removeEvent(int i);
        
        /**
         * An XML Event(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.EventsDocument$Events$Event.
         */
        public interface Event extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Event.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("eventc307elemtype");
            
            /**
             * Gets the "Type" attribute
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.EventTypeList xgetType();
            
            /**
             * True if has "Type" attribute
             */
            boolean isSetType();
            
            /**
             * Sets the "Type" attribute
             */
            void setType(java.lang.String type);
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            void xsetType(oasisNamesTcCiqXpil3.EventTypeList type);
            
            /**
             * Unsets the "Type" attribute
             */
            void unsetType();
            
            /**
             * Gets the "DateValidFrom" attribute
             */
            java.util.Calendar getDateValidFrom();
            
            /**
             * Gets (as xml) the "DateValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetDateValidFrom();
            
            /**
             * True if has "DateValidFrom" attribute
             */
            boolean isSetDateValidFrom();
            
            /**
             * Sets the "DateValidFrom" attribute
             */
            void setDateValidFrom(java.util.Calendar dateValidFrom);
            
            /**
             * Sets (as xml) the "DateValidFrom" attribute
             */
            void xsetDateValidFrom(org.apache.xmlbeans.XmlDateTime dateValidFrom);
            
            /**
             * Unsets the "DateValidFrom" attribute
             */
            void unsetDateValidFrom();
            
            /**
             * Gets the "DateValidTo" attribute
             */
            java.util.Calendar getDateValidTo();
            
            /**
             * Gets (as xml) the "DateValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetDateValidTo();
            
            /**
             * True if has "DateValidTo" attribute
             */
            boolean isSetDateValidTo();
            
            /**
             * Sets the "DateValidTo" attribute
             */
            void setDateValidTo(java.util.Calendar dateValidTo);
            
            /**
             * Sets (as xml) the "DateValidTo" attribute
             */
            void xsetDateValidTo(org.apache.xmlbeans.XmlDateTime dateValidTo);
            
            /**
             * Unsets the "DateValidTo" attribute
             */
            void unsetDateValidTo();
            
            /**
             * Gets the "Date" attribute
             */
            java.util.Calendar getDate();
            
            /**
             * Gets (as xml) the "Date" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetDate();
            
            /**
             * True if has "Date" attribute
             */
            boolean isSetDate();
            
            /**
             * Sets the "Date" attribute
             */
            void setDate(java.util.Calendar date);
            
            /**
             * Sets (as xml) the "Date" attribute
             */
            void xsetDate(org.apache.xmlbeans.XmlDateTime date);
            
            /**
             * Unsets the "Date" attribute
             */
            void unsetDate();
            
            /**
             * Gets the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
            
            /**
             * True if has "DataQualityType" attribute
             */
            boolean isSetDataQualityType();
            
            /**
             * Sets the "DataQualityType" attribute
             */
            void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            void unsetDataQualityType();
            
            /**
             * Gets the "ValidFrom" attribute
             */
            java.util.Calendar getValidFrom();
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidFrom();
            
            /**
             * True if has "ValidFrom" attribute
             */
            boolean isSetValidFrom();
            
            /**
             * Sets the "ValidFrom" attribute
             */
            void setValidFrom(java.util.Calendar validFrom);
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            void unsetValidFrom();
            
            /**
             * Gets the "ValidTo" attribute
             */
            java.util.Calendar getValidTo();
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetValidTo();
            
            /**
             * True if has "ValidTo" attribute
             */
            boolean isSetValidTo();
            
            /**
             * Sets the "ValidTo" attribute
             */
            void setValidTo(java.util.Calendar validTo);
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
            
            /**
             * Unsets the "ValidTo" attribute
             */
            void unsetValidTo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.EventsDocument.Events.Event newInstance() {
                  return (oasisNamesTcCiqXpil3.EventsDocument.Events.Event) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.EventsDocument.Events.Event newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.EventsDocument.Events.Event) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.EventsDocument.Events newInstance() {
              return (oasisNamesTcCiqXpil3.EventsDocument.Events) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.EventsDocument.Events newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.EventsDocument.Events) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.EventsDocument newInstance() {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.EventsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.EventsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.EventsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.EventsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
