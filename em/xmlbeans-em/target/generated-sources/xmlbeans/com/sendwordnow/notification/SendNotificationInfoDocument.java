/*
 * An XML document type.
 * Localname: SendNotificationInfo
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.SendNotificationInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification;


/**
 * A document containing one SendNotificationInfo(@http://www.sendwordnow.com/notification) element.
 *
 * This is a complex type.
 */
public interface SendNotificationInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendNotificationInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("sendnotificationinfo7b26doctype");
    
    /**
     * Gets the "SendNotificationInfo" element
     */
    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo getSendNotificationInfo();
    
    /**
     * Sets the "SendNotificationInfo" element
     */
    void setSendNotificationInfo(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo sendNotificationInfo);
    
    /**
     * Appends and returns a new empty "SendNotificationInfo" element
     */
    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo addNewSendNotificationInfo();
    
    /**
     * An XML SendNotificationInfo(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public interface SendNotificationInfo extends com.sendwordnow.notification.SendNotificationInfoBase
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SendNotificationInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("sendnotificationinfoe2e9elemtype");
        
        /**
         * Gets the "moreInfoText" element
         */
        java.lang.String getMoreInfoText();
        
        /**
         * Gets (as xml) the "moreInfoText" element
         */
        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText xgetMoreInfoText();
        
        /**
         * True if has "moreInfoText" element
         */
        boolean isSetMoreInfoText();
        
        /**
         * Sets the "moreInfoText" element
         */
        void setMoreInfoText(java.lang.String moreInfoText);
        
        /**
         * Sets (as xml) the "moreInfoText" element
         */
        void xsetMoreInfoText(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText moreInfoText);
        
        /**
         * Unsets the "moreInfoText" element
         */
        void unsetMoreInfoText();
        
        /**
         * Gets the "moreInfoURL" element
         */
        java.lang.String getMoreInfoURL();
        
        /**
         * Gets (as xml) the "moreInfoURL" element
         */
        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL xgetMoreInfoURL();
        
        /**
         * True if has "moreInfoURL" element
         */
        boolean isSetMoreInfoURL();
        
        /**
         * Sets the "moreInfoURL" element
         */
        void setMoreInfoURL(java.lang.String moreInfoURL);
        
        /**
         * Sets (as xml) the "moreInfoURL" element
         */
        void xsetMoreInfoURL(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL moreInfoURL);
        
        /**
         * Unsets the "moreInfoURL" element
         */
        void unsetMoreInfoURL();
        
        /**
         * Gets the "soundName" element
         */
        java.lang.String getSoundName();
        
        /**
         * Gets (as xml) the "soundName" element
         */
        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName xgetSoundName();
        
        /**
         * True if has "soundName" element
         */
        boolean isSetSoundName();
        
        /**
         * Sets the "soundName" element
         */
        void setSoundName(java.lang.String soundName);
        
        /**
         * Sets (as xml) the "soundName" element
         */
        void xsetSoundName(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName soundName);
        
        /**
         * Unsets the "soundName" element
         */
        void unsetSoundName();
        
        /**
         * Gets array of all "gwbText" elements
         */
        java.lang.String[] getGwbTextArray();
        
        /**
         * Gets ith "gwbText" element
         */
        java.lang.String getGwbTextArray(int i);
        
        /**
         * Gets (as xml) array of all "gwbText" elements
         */
        org.apache.xmlbeans.XmlString[] xgetGwbTextArray();
        
        /**
         * Gets (as xml) ith "gwbText" element
         */
        org.apache.xmlbeans.XmlString xgetGwbTextArray(int i);
        
        /**
         * Returns number of "gwbText" element
         */
        int sizeOfGwbTextArray();
        
        /**
         * Sets array of all "gwbText" element
         */
        void setGwbTextArray(java.lang.String[] gwbTextArray);
        
        /**
         * Sets ith "gwbText" element
         */
        void setGwbTextArray(int i, java.lang.String gwbText);
        
        /**
         * Sets (as xml) array of all "gwbText" element
         */
        void xsetGwbTextArray(org.apache.xmlbeans.XmlString[] gwbTextArray);
        
        /**
         * Sets (as xml) ith "gwbText" element
         */
        void xsetGwbTextArray(int i, org.apache.xmlbeans.XmlString gwbText);
        
        /**
         * Inserts the value as the ith "gwbText" element
         */
        void insertGwbText(int i, java.lang.String gwbText);
        
        /**
         * Appends the value as the last "gwbText" element
         */
        void addGwbText(java.lang.String gwbText);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gwbText" element
         */
        org.apache.xmlbeans.XmlString insertNewGwbText(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gwbText" element
         */
        org.apache.xmlbeans.XmlString addNewGwbText();
        
        /**
         * Removes the ith "gwbText" element
         */
        void removeGwbText(int i);
        
        /**
         * Gets the "rcpts" element
         */
        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts getRcpts();
        
        /**
         * Sets the "rcpts" element
         */
        void setRcpts(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts rcpts);
        
        /**
         * Appends and returns a new empty "rcpts" element
         */
        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts addNewRcpts();
        
        /**
         * An XML moreInfoText(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoDocument$SendNotificationInfo$MoreInfoText.
         */
        public interface MoreInfoText extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MoreInfoText.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("moreinfotexta7f5elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText newValue(java.lang.Object obj) {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText) type.newValue( obj ); }
                
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText newInstance() {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML moreInfoURL(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoDocument$SendNotificationInfo$MoreInfoURL.
         */
        public interface MoreInfoURL extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MoreInfoURL.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("moreinfourl7221elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL newValue(java.lang.Object obj) {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL) type.newValue( obj ); }
                
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL newInstance() {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML soundName(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoDocument$SendNotificationInfo$SoundName.
         */
        public interface SoundName extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoundName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("soundname4d0felemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName newValue(java.lang.Object obj) {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName) type.newValue( obj ); }
                
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName newInstance() {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML rcpts(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public interface Rcpts extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rcpts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("rcpts30f3elemtype");
            
            /**
             * Gets array of all "rcpt" elements
             */
            com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt[] getRcptArray();
            
            /**
             * Gets ith "rcpt" element
             */
            com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt getRcptArray(int i);
            
            /**
             * Returns number of "rcpt" element
             */
            int sizeOfRcptArray();
            
            /**
             * Sets array of all "rcpt" element
             */
            void setRcptArray(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt[] rcptArray);
            
            /**
             * Sets ith "rcpt" element
             */
            void setRcptArray(int i, com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt rcpt);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "rcpt" element
             */
            com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt insertNewRcpt(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "rcpt" element
             */
            com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt addNewRcpt();
            
            /**
             * Removes the ith "rcpt" element
             */
            void removeRcpt(int i);
            
            /**
             * An XML rcpt(@http://www.sendwordnow.com/notification).
             *
             * This is a complex type.
             */
            public interface Rcpt extends com.sendwordnow.notification.RcptInfoBase
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Rcpt.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("rcpte5c4elemtype");
                
                /**
                 * Gets the "contactPnts" element
                 */
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts getContactPnts();
                
                /**
                 * Sets the "contactPnts" element
                 */
                void setContactPnts(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts contactPnts);
                
                /**
                 * Appends and returns a new empty "contactPnts" element
                 */
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts addNewContactPnts();
                
                /**
                 * An XML contactPnts(@http://www.sendwordnow.com/notification).
                 *
                 * This is a complex type.
                 */
                public interface ContactPnts extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactPnts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("contactpntsedbbelemtype");
                    
                    /**
                     * Gets array of all "contactPntInfo" elements
                     */
                    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo[] getContactPntInfoArray();
                    
                    /**
                     * Gets ith "contactPntInfo" element
                     */
                    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo getContactPntInfoArray(int i);
                    
                    /**
                     * Returns number of "contactPntInfo" element
                     */
                    int sizeOfContactPntInfoArray();
                    
                    /**
                     * Sets array of all "contactPntInfo" element
                     */
                    void setContactPntInfoArray(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo[] contactPntInfoArray);
                    
                    /**
                     * Sets ith "contactPntInfo" element
                     */
                    void setContactPntInfoArray(int i, com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo contactPntInfo);
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "contactPntInfo" element
                     */
                    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo insertNewContactPntInfo(int i);
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "contactPntInfo" element
                     */
                    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo addNewContactPntInfo();
                    
                    /**
                     * Removes the ith "contactPntInfo" element
                     */
                    void removeContactPntInfo(int i);
                    
                    /**
                     * An XML contactPntInfo(@http://www.sendwordnow.com/notification).
                     *
                     * This is a complex type.
                     */
                    public interface ContactPntInfo extends com.sendwordnow.notification.ContactPnt
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactPntInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("contactpntinfoe35belemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo newInstance() {
                          return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts newInstance() {
                        return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt newInstance() {
                      return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts newInstance() {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo newInstance() {
              return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sendwordnow.notification.SendNotificationInfoDocument newInstance() {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sendwordnow.notification.SendNotificationInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sendwordnow.notification.SendNotificationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
