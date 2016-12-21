/*
 * An XML document type.
 * Localname: SendNotificationInfo
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.SendNotificationInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * A document containing one SendNotificationInfo(@http://www.sendwordnow.com/notification) element.
 *
 * This is a complex type.
 */
public class SendNotificationInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.SendNotificationInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public SendNotificationInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDNOTIFICATIONINFO$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "SendNotificationInfo");
    
    
    /**
     * Gets the "SendNotificationInfo" element
     */
    public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo getSendNotificationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo)get_store().find_element_user(SENDNOTIFICATIONINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SendNotificationInfo" element
     */
    public void setSendNotificationInfo(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo sendNotificationInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo)get_store().find_element_user(SENDNOTIFICATIONINFO$0, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo)get_store().add_element_user(SENDNOTIFICATIONINFO$0);
            }
            target.set(sendNotificationInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "SendNotificationInfo" element
     */
    public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo addNewSendNotificationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo)get_store().add_element_user(SENDNOTIFICATIONINFO$0);
            return target;
        }
    }
    /**
     * An XML SendNotificationInfo(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class SendNotificationInfoImpl extends com.sendwordnow.notification.impl.SendNotificationInfoBaseImpl implements com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo
    {
        private static final long serialVersionUID = 1L;
        
        public SendNotificationInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MOREINFOTEXT$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "moreInfoText");
        private static final javax.xml.namespace.QName MOREINFOURL$2 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "moreInfoURL");
        private static final javax.xml.namespace.QName SOUNDNAME$4 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "soundName");
        private static final javax.xml.namespace.QName GWBTEXT$6 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "gwbText");
        private static final javax.xml.namespace.QName RCPTS$8 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "rcpts");
        
        
        /**
         * Gets the "moreInfoText" element
         */
        public java.lang.String getMoreInfoText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOREINFOTEXT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "moreInfoText" element
         */
        public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText xgetMoreInfoText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText)get_store().find_element_user(MOREINFOTEXT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "moreInfoText" element
         */
        public boolean isSetMoreInfoText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOREINFOTEXT$0) != 0;
            }
        }
        
        /**
         * Sets the "moreInfoText" element
         */
        public void setMoreInfoText(java.lang.String moreInfoText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOREINFOTEXT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOREINFOTEXT$0);
                }
                target.setStringValue(moreInfoText);
            }
        }
        
        /**
         * Sets (as xml) the "moreInfoText" element
         */
        public void xsetMoreInfoText(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText moreInfoText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText)get_store().find_element_user(MOREINFOTEXT$0, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText)get_store().add_element_user(MOREINFOTEXT$0);
                }
                target.set(moreInfoText);
            }
        }
        
        /**
         * Unsets the "moreInfoText" element
         */
        public void unsetMoreInfoText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOREINFOTEXT$0, 0);
            }
        }
        
        /**
         * Gets the "moreInfoURL" element
         */
        public java.lang.String getMoreInfoURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOREINFOURL$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "moreInfoURL" element
         */
        public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL xgetMoreInfoURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL)get_store().find_element_user(MOREINFOURL$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "moreInfoURL" element
         */
        public boolean isSetMoreInfoURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MOREINFOURL$2) != 0;
            }
        }
        
        /**
         * Sets the "moreInfoURL" element
         */
        public void setMoreInfoURL(java.lang.String moreInfoURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOREINFOURL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOREINFOURL$2);
                }
                target.setStringValue(moreInfoURL);
            }
        }
        
        /**
         * Sets (as xml) the "moreInfoURL" element
         */
        public void xsetMoreInfoURL(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL moreInfoURL)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL)get_store().find_element_user(MOREINFOURL$2, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL)get_store().add_element_user(MOREINFOURL$2);
                }
                target.set(moreInfoURL);
            }
        }
        
        /**
         * Unsets the "moreInfoURL" element
         */
        public void unsetMoreInfoURL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MOREINFOURL$2, 0);
            }
        }
        
        /**
         * Gets the "soundName" element
         */
        public java.lang.String getSoundName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUNDNAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "soundName" element
         */
        public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName xgetSoundName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName)get_store().find_element_user(SOUNDNAME$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "soundName" element
         */
        public boolean isSetSoundName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOUNDNAME$4) != 0;
            }
        }
        
        /**
         * Sets the "soundName" element
         */
        public void setSoundName(java.lang.String soundName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUNDNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOUNDNAME$4);
                }
                target.setStringValue(soundName);
            }
        }
        
        /**
         * Sets (as xml) the "soundName" element
         */
        public void xsetSoundName(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName soundName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName)get_store().find_element_user(SOUNDNAME$4, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName)get_store().add_element_user(SOUNDNAME$4);
                }
                target.set(soundName);
            }
        }
        
        /**
         * Unsets the "soundName" element
         */
        public void unsetSoundName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOUNDNAME$4, 0);
            }
        }
        
        /**
         * Gets array of all "gwbText" elements
         */
        public java.lang.String[] getGwbTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GWBTEXT$6, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "gwbText" element
         */
        public java.lang.String getGwbTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBTEXT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "gwbText" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetGwbTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GWBTEXT$6, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "gwbText" element
         */
        public org.apache.xmlbeans.XmlString xgetGwbTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GWBTEXT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "gwbText" element
         */
        public int sizeOfGwbTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GWBTEXT$6);
            }
        }
        
        /**
         * Sets array of all "gwbText" element
         */
        public void setGwbTextArray(java.lang.String[] gwbTextArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gwbTextArray, GWBTEXT$6);
            }
        }
        
        /**
         * Sets ith "gwbText" element
         */
        public void setGwbTextArray(int i, java.lang.String gwbText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBTEXT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(gwbText);
            }
        }
        
        /**
         * Sets (as xml) array of all "gwbText" element
         */
        public void xsetGwbTextArray(org.apache.xmlbeans.XmlString[]gwbTextArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gwbTextArray, GWBTEXT$6);
            }
        }
        
        /**
         * Sets (as xml) ith "gwbText" element
         */
        public void xsetGwbTextArray(int i, org.apache.xmlbeans.XmlString gwbText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GWBTEXT$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gwbText);
            }
        }
        
        /**
         * Inserts the value as the ith "gwbText" element
         */
        public void insertGwbText(int i, java.lang.String gwbText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(GWBTEXT$6, i);
                target.setStringValue(gwbText);
            }
        }
        
        /**
         * Appends the value as the last "gwbText" element
         */
        public void addGwbText(java.lang.String gwbText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GWBTEXT$6);
                target.setStringValue(gwbText);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gwbText" element
         */
        public org.apache.xmlbeans.XmlString insertNewGwbText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(GWBTEXT$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gwbText" element
         */
        public org.apache.xmlbeans.XmlString addNewGwbText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GWBTEXT$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "gwbText" element
         */
        public void removeGwbText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GWBTEXT$6, i);
            }
        }
        
        /**
         * Gets the "rcpts" element
         */
        public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts getRcpts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts)get_store().find_element_user(RCPTS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "rcpts" element
         */
        public void setRcpts(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts rcpts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts)get_store().find_element_user(RCPTS$8, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts)get_store().add_element_user(RCPTS$8);
                }
                target.set(rcpts);
            }
        }
        
        /**
         * Appends and returns a new empty "rcpts" element
         */
        public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts addNewRcpts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts)get_store().add_element_user(RCPTS$8);
                return target;
            }
        }
        /**
         * An XML moreInfoText(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoDocument$SendNotificationInfo$MoreInfoText.
         */
        public static class MoreInfoTextImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoText
        {
            private static final long serialVersionUID = 1L;
            
            public MoreInfoTextImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MoreInfoTextImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML moreInfoURL(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoDocument$SendNotificationInfo$MoreInfoURL.
         */
        public static class MoreInfoURLImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.MoreInfoURL
        {
            private static final long serialVersionUID = 1L;
            
            public MoreInfoURLImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MoreInfoURLImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML soundName(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoDocument$SendNotificationInfo$SoundName.
         */
        public static class SoundNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.SoundName
        {
            private static final long serialVersionUID = 1L;
            
            public SoundNameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SoundNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML rcpts(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public static class RcptsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts
        {
            private static final long serialVersionUID = 1L;
            
            public RcptsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RCPT$0 = 
                new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "rcpt");
            
            
            /**
             * Gets array of all "rcpt" elements
             */
            public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt[] getRcptArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RCPT$0, targetList);
                    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt[] result = new com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "rcpt" element
             */
            public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt getRcptArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt target = null;
                    target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt)get_store().find_element_user(RCPT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "rcpt" element
             */
            public int sizeOfRcptArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RCPT$0);
                }
            }
            
            /**
             * Sets array of all "rcpt" element
             */
            public void setRcptArray(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt[] rcptArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(rcptArray, RCPT$0);
                }
            }
            
            /**
             * Sets ith "rcpt" element
             */
            public void setRcptArray(int i, com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt rcpt)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt target = null;
                    target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt)get_store().find_element_user(RCPT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(rcpt);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "rcpt" element
             */
            public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt insertNewRcpt(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt target = null;
                    target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt)get_store().insert_element_user(RCPT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "rcpt" element
             */
            public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt addNewRcpt()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt target = null;
                    target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt)get_store().add_element_user(RCPT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "rcpt" element
             */
            public void removeRcpt(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RCPT$0, i);
                }
            }
            /**
             * An XML rcpt(@http://www.sendwordnow.com/notification).
             *
             * This is a complex type.
             */
            public static class RcptImpl extends com.sendwordnow.notification.impl.RcptInfoBaseImpl implements com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt
            {
                private static final long serialVersionUID = 1L;
                
                public RcptImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CONTACTPNTS$0 = 
                    new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "contactPnts");
                
                
                /**
                 * Gets the "contactPnts" element
                 */
                public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts getContactPnts()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts target = null;
                      target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts)get_store().find_element_user(CONTACTPNTS$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "contactPnts" element
                 */
                public void setContactPnts(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts contactPnts)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts target = null;
                      target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts)get_store().find_element_user(CONTACTPNTS$0, 0);
                      if (target == null)
                      {
                        target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts)get_store().add_element_user(CONTACTPNTS$0);
                      }
                      target.set(contactPnts);
                    }
                }
                
                /**
                 * Appends and returns a new empty "contactPnts" element
                 */
                public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts addNewContactPnts()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts target = null;
                      target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts)get_store().add_element_user(CONTACTPNTS$0);
                      return target;
                    }
                }
                /**
                 * An XML contactPnts(@http://www.sendwordnow.com/notification).
                 *
                 * This is a complex type.
                 */
                public static class ContactPntsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ContactPntsImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName CONTACTPNTINFO$0 = 
                      new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "contactPntInfo");
                    
                    
                    /**
                     * Gets array of all "contactPntInfo" elements
                     */
                    public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo[] getContactPntInfoArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        java.util.List targetList = new java.util.ArrayList();
                        get_store().find_all_element_users(CONTACTPNTINFO$0, targetList);
                        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo[] result = new com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo[targetList.size()];
                        targetList.toArray(result);
                        return result;
                      }
                    }
                    
                    /**
                     * Gets ith "contactPntInfo" element
                     */
                    public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo getContactPntInfoArray(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo target = null;
                        target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo)get_store().find_element_user(CONTACTPNTINFO$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Returns number of "contactPntInfo" element
                     */
                    public int sizeOfContactPntInfoArray()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(CONTACTPNTINFO$0);
                      }
                    }
                    
                    /**
                     * Sets array of all "contactPntInfo" element
                     */
                    public void setContactPntInfoArray(com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo[] contactPntInfoArray)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        arraySetterHelper(contactPntInfoArray, CONTACTPNTINFO$0);
                      }
                    }
                    
                    /**
                     * Sets ith "contactPntInfo" element
                     */
                    public void setContactPntInfoArray(int i, com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo contactPntInfo)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo target = null;
                        target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo)get_store().find_element_user(CONTACTPNTINFO$0, i);
                        if (target == null)
                        {
                          throw new IndexOutOfBoundsException();
                        }
                        target.set(contactPntInfo);
                      }
                    }
                    
                    /**
                     * Inserts and returns a new empty value (as xml) as the ith "contactPntInfo" element
                     */
                    public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo insertNewContactPntInfo(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo target = null;
                        target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo)get_store().insert_element_user(CONTACTPNTINFO$0, i);
                        return target;
                      }
                    }
                    
                    /**
                     * Appends and returns a new empty value (as xml) as the last "contactPntInfo" element
                     */
                    public com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo addNewContactPntInfo()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo target = null;
                        target = (com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo)get_store().add_element_user(CONTACTPNTINFO$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Removes the ith "contactPntInfo" element
                     */
                    public void removeContactPntInfo(int i)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(CONTACTPNTINFO$0, i);
                      }
                    }
                    /**
                     * An XML contactPntInfo(@http://www.sendwordnow.com/notification).
                     *
                     * This is a complex type.
                     */
                    public static class ContactPntInfoImpl extends com.sendwordnow.notification.impl.ContactPntImpl implements com.sendwordnow.notification.SendNotificationInfoDocument.SendNotificationInfo.Rcpts.Rcpt.ContactPnts.ContactPntInfo
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public ContactPntInfoImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      
                    }
                }
            }
        }
    }
}
