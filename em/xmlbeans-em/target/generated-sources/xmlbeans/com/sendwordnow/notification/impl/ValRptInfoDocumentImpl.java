/*
 * An XML document type.
 * Localname: ValRptInfo
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.ValRptInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * A document containing one ValRptInfo(@http://www.sendwordnow.com/notification) element.
 *
 * This is a complex type.
 */
public class ValRptInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.ValRptInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValRptInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALRPTINFO$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "ValRptInfo");
    
    
    /**
     * Gets the "ValRptInfo" element
     */
    public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo getValRptInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo target = null;
            target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo)get_store().find_element_user(VALRPTINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ValRptInfo" element
     */
    public void setValRptInfo(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo valRptInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo target = null;
            target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo)get_store().find_element_user(VALRPTINFO$0, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo)get_store().add_element_user(VALRPTINFO$0);
            }
            target.set(valRptInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "ValRptInfo" element
     */
    public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo addNewValRptInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo target = null;
            target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo)get_store().add_element_user(VALRPTINFO$0);
            return target;
        }
    }
    /**
     * An XML ValRptInfo(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class ValRptInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo
    {
        private static final long serialVersionUID = 1L;
        
        public ValRptInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOTIFICATIONHASERRORS$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "notificationHasErrors");
        private static final javax.xml.namespace.QName NOTIFICATIONHASWARNINGS$2 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "notificationHasWarnings");
        private static final javax.xml.namespace.QName DETAILS$4 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "details");
        
        
        /**
         * Gets the "notificationHasErrors" element
         */
        public boolean getNotificationHasErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONHASERRORS$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "notificationHasErrors" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetNotificationHasErrors()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NOTIFICATIONHASERRORS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "notificationHasErrors" element
         */
        public void setNotificationHasErrors(boolean notificationHasErrors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONHASERRORS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONHASERRORS$0);
                }
                target.setBooleanValue(notificationHasErrors);
            }
        }
        
        /**
         * Sets (as xml) the "notificationHasErrors" element
         */
        public void xsetNotificationHasErrors(org.apache.xmlbeans.XmlBoolean notificationHasErrors)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NOTIFICATIONHASERRORS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NOTIFICATIONHASERRORS$0);
                }
                target.set(notificationHasErrors);
            }
        }
        
        /**
         * Gets the "notificationHasWarnings" element
         */
        public boolean getNotificationHasWarnings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONHASWARNINGS$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "notificationHasWarnings" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetNotificationHasWarnings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NOTIFICATIONHASWARNINGS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "notificationHasWarnings" element
         */
        public void setNotificationHasWarnings(boolean notificationHasWarnings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTIFICATIONHASWARNINGS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTIFICATIONHASWARNINGS$2);
                }
                target.setBooleanValue(notificationHasWarnings);
            }
        }
        
        /**
         * Sets (as xml) the "notificationHasWarnings" element
         */
        public void xsetNotificationHasWarnings(org.apache.xmlbeans.XmlBoolean notificationHasWarnings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(NOTIFICATIONHASWARNINGS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(NOTIFICATIONHASWARNINGS$2);
                }
                target.set(notificationHasWarnings);
            }
        }
        
        /**
         * Gets the "details" element
         */
        public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details getDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details target = null;
                target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details)get_store().find_element_user(DETAILS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "details" element
         */
        public void setDetails(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details details)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details target = null;
                target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details)get_store().find_element_user(DETAILS$4, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details)get_store().add_element_user(DETAILS$4);
                }
                target.set(details);
            }
        }
        
        /**
         * Appends and returns a new empty "details" element
         */
        public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details addNewDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details target = null;
                target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details)get_store().add_element_user(DETAILS$4);
                return target;
            }
        }
        /**
         * An XML details(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public static class DetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details
        {
            private static final long serialVersionUID = 1L;
            
            public DetailsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName VALRPTDETAILINFO$0 = 
                new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "valRptDetailInfo");
            
            
            /**
             * Gets array of all "valRptDetailInfo" elements
             */
            public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo[] getValRptDetailInfoArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(VALRPTDETAILINFO$0, targetList);
                    com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo[] result = new com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "valRptDetailInfo" element
             */
            public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo getValRptDetailInfoArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo target = null;
                    target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo)get_store().find_element_user(VALRPTDETAILINFO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "valRptDetailInfo" element
             */
            public int sizeOfValRptDetailInfoArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(VALRPTDETAILINFO$0);
                }
            }
            
            /**
             * Sets array of all "valRptDetailInfo" element
             */
            public void setValRptDetailInfoArray(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo[] valRptDetailInfoArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(valRptDetailInfoArray, VALRPTDETAILINFO$0);
                }
            }
            
            /**
             * Sets ith "valRptDetailInfo" element
             */
            public void setValRptDetailInfoArray(int i, com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo valRptDetailInfo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo target = null;
                    target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo)get_store().find_element_user(VALRPTDETAILINFO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(valRptDetailInfo);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "valRptDetailInfo" element
             */
            public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo insertNewValRptDetailInfo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo target = null;
                    target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo)get_store().insert_element_user(VALRPTDETAILINFO$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "valRptDetailInfo" element
             */
            public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo addNewValRptDetailInfo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo target = null;
                    target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo)get_store().add_element_user(VALRPTDETAILINFO$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "valRptDetailInfo" element
             */
            public void removeValRptDetailInfo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(VALRPTDETAILINFO$0, i);
                }
            }
            /**
             * An XML valRptDetailInfo(@http://www.sendwordnow.com/notification).
             *
             * This is a complex type.
             */
            public static class ValRptDetailInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo
            {
                private static final long serialVersionUID = 1L;
                
                public ValRptDetailInfoImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DESCRIPTION$0 = 
                    new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "description");
                private static final javax.xml.namespace.QName CODE$2 = 
                    new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "code");
                private static final javax.xml.namespace.QName TYPE$4 = 
                    new javax.xml.namespace.QName("", "type");
                
                
                /**
                 * Gets the "description" element
                 */
                public java.lang.String getDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "description" element
                 */
                public org.apache.xmlbeans.XmlString xgetDescription()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "description" element
                 */
                public void setDescription(java.lang.String description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$0);
                      }
                      target.setStringValue(description);
                    }
                }
                
                /**
                 * Sets (as xml) the "description" element
                 */
                public void xsetDescription(org.apache.xmlbeans.XmlString description)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$0);
                      }
                      target.set(description);
                    }
                }
                
                /**
                 * Gets the "code" element
                 */
                public java.lang.String getCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "code" element
                 */
                public org.apache.xmlbeans.XmlString xgetCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "code" element
                 */
                public boolean isSetCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CODE$2) != 0;
                    }
                }
                
                /**
                 * Sets the "code" element
                 */
                public void setCode(java.lang.String code)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
                      }
                      target.setStringValue(code);
                    }
                }
                
                /**
                 * Sets (as xml) the "code" element
                 */
                public void xsetCode(org.apache.xmlbeans.XmlString code)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$2);
                      }
                      target.set(code);
                    }
                }
                
                /**
                 * Unsets the "code" element
                 */
                public void unsetCode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CODE$2, 0);
                    }
                }
                
                /**
                 * Gets the "type" attribute
                 */
                public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type.Enum getType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                public com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type target = null;
                      target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type)get_store().find_attribute_user(TYPE$4);
                      return target;
                    }
                }
                
                /**
                 * Sets the "type" attribute
                 */
                public void setType(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type.Enum type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                      }
                      target.setEnumValue(type);
                    }
                }
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                public void xsetType(com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type target = null;
                      target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type)get_store().find_attribute_user(TYPE$4);
                      if (target == null)
                      {
                        target = (com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type)get_store().add_attribute_user(TYPE$4);
                      }
                      target.set(type);
                    }
                }
                /**
                 * An XML type(@).
                 *
                 * This is an atomic type that is a restriction of com.sendwordnow.notification.ValRptInfoDocument$ValRptInfo$Details$ValRptDetailInfo$Type.
                 */
                public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.sendwordnow.notification.ValRptInfoDocument.ValRptInfo.Details.ValRptDetailInfo.Type
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TypeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
        }
    }
}
