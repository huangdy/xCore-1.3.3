/*
 * XML Type:  AgreementType
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.AgreementType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * An XML AgreementType(@http://uicds.org/AgreementService).
 *
 * This is a complex type.
 */
public class AgreementTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.AgreementType
{
    private static final long serialVersionUID = 1L;
    
    public AgreementTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRINCIPALS$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "Principals");
    private static final javax.xml.namespace.QName SHARERULES$2 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "ShareRules");
    
    
    /**
     * Gets the "Principals" element
     */
    public org.uicds.agreementService.AgreementType.Principals getPrincipals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType.Principals target = null;
            target = (org.uicds.agreementService.AgreementType.Principals)get_store().find_element_user(PRINCIPALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Principals" element
     */
    public void setPrincipals(org.uicds.agreementService.AgreementType.Principals principals)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType.Principals target = null;
            target = (org.uicds.agreementService.AgreementType.Principals)get_store().find_element_user(PRINCIPALS$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.AgreementType.Principals)get_store().add_element_user(PRINCIPALS$0);
            }
            target.set(principals);
        }
    }
    
    /**
     * Appends and returns a new empty "Principals" element
     */
    public org.uicds.agreementService.AgreementType.Principals addNewPrincipals()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType.Principals target = null;
            target = (org.uicds.agreementService.AgreementType.Principals)get_store().add_element_user(PRINCIPALS$0);
            return target;
        }
    }
    
    /**
     * Gets the "ShareRules" element
     */
    public org.uicds.agreementService.AgreementType.ShareRules getShareRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType.ShareRules target = null;
            target = (org.uicds.agreementService.AgreementType.ShareRules)get_store().find_element_user(SHARERULES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "ShareRules" element
     */
    public boolean isNilShareRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType.ShareRules target = null;
            target = (org.uicds.agreementService.AgreementType.ShareRules)get_store().find_element_user(SHARERULES$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "ShareRules" element
     */
    public void setShareRules(org.uicds.agreementService.AgreementType.ShareRules shareRules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType.ShareRules target = null;
            target = (org.uicds.agreementService.AgreementType.ShareRules)get_store().find_element_user(SHARERULES$2, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.AgreementType.ShareRules)get_store().add_element_user(SHARERULES$2);
            }
            target.set(shareRules);
        }
    }
    
    /**
     * Appends and returns a new empty "ShareRules" element
     */
    public org.uicds.agreementService.AgreementType.ShareRules addNewShareRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType.ShareRules target = null;
            target = (org.uicds.agreementService.AgreementType.ShareRules)get_store().add_element_user(SHARERULES$2);
            return target;
        }
    }
    
    /**
     * Nils the "ShareRules" element
     */
    public void setNilShareRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType.ShareRules target = null;
            target = (org.uicds.agreementService.AgreementType.ShareRules)get_store().find_element_user(SHARERULES$2, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.AgreementType.ShareRules)get_store().add_element_user(SHARERULES$2);
            }
            target.setNil();
        }
    }
    /**
     * An XML Principals(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class PrincipalsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.AgreementType.Principals
    {
        private static final long serialVersionUID = 1L;
        
        public PrincipalsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOCALCORE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/AgreementService", "LocalCore");
        private static final javax.xml.namespace.QName REMOTECORE$2 = 
            new javax.xml.namespace.QName("http://uicds.org/AgreementService", "RemoteCore");
        
        
        /**
         * Gets the "LocalCore" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getLocalCore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LOCALCORE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "LocalCore" element
         */
        public void setLocalCore(com.saic.precis.x2009.x06.base.IdentifierType localCore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LOCALCORE$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LOCALCORE$0);
                }
                target.set(localCore);
            }
        }
        
        /**
         * Appends and returns a new empty "LocalCore" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewLocalCore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LOCALCORE$0);
                return target;
            }
        }
        
        /**
         * Gets the "RemoteCore" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getRemoteCore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(REMOTECORE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RemoteCore" element
         */
        public void setRemoteCore(com.saic.precis.x2009.x06.base.IdentifierType remoteCore)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(REMOTECORE$2, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(REMOTECORE$2);
                }
                target.set(remoteCore);
            }
        }
        
        /**
         * Appends and returns a new empty "RemoteCore" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewRemoteCore()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(REMOTECORE$2);
                return target;
            }
        }
    }
    /**
     * An XML ShareRules(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class ShareRulesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.AgreementType.ShareRules
    {
        private static final long serialVersionUID = 1L;
        
        public ShareRulesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SHARERULE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/AgreementService", "ShareRule");
        private static final javax.xml.namespace.QName ENABLED$2 = 
            new javax.xml.namespace.QName("", "enabled");
        
        
        /**
         * Gets array of all "ShareRule" elements
         */
        public org.uicds.agreementService.AgreementType.ShareRules.ShareRule[] getShareRuleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SHARERULE$0, targetList);
                org.uicds.agreementService.AgreementType.ShareRules.ShareRule[] result = new org.uicds.agreementService.AgreementType.ShareRules.ShareRule[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ShareRule" element
         */
        public org.uicds.agreementService.AgreementType.ShareRules.ShareRule getShareRuleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.agreementService.AgreementType.ShareRules.ShareRule target = null;
                target = (org.uicds.agreementService.AgreementType.ShareRules.ShareRule)get_store().find_element_user(SHARERULE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ShareRule" element
         */
        public int sizeOfShareRuleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHARERULE$0);
            }
        }
        
        /**
         * Sets array of all "ShareRule" element
         */
        public void setShareRuleArray(org.uicds.agreementService.AgreementType.ShareRules.ShareRule[] shareRuleArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(shareRuleArray, SHARERULE$0);
            }
        }
        
        /**
         * Sets ith "ShareRule" element
         */
        public void setShareRuleArray(int i, org.uicds.agreementService.AgreementType.ShareRules.ShareRule shareRule)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.agreementService.AgreementType.ShareRules.ShareRule target = null;
                target = (org.uicds.agreementService.AgreementType.ShareRules.ShareRule)get_store().find_element_user(SHARERULE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(shareRule);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ShareRule" element
         */
        public org.uicds.agreementService.AgreementType.ShareRules.ShareRule insertNewShareRule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.agreementService.AgreementType.ShareRules.ShareRule target = null;
                target = (org.uicds.agreementService.AgreementType.ShareRules.ShareRule)get_store().insert_element_user(SHARERULE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ShareRule" element
         */
        public org.uicds.agreementService.AgreementType.ShareRules.ShareRule addNewShareRule()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.agreementService.AgreementType.ShareRules.ShareRule target = null;
                target = (org.uicds.agreementService.AgreementType.ShareRules.ShareRule)get_store().add_element_user(SHARERULE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "ShareRule" element
         */
        public void removeShareRule(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHARERULE$0, i);
            }
        }
        
        /**
         * Gets the "enabled" attribute
         */
        public boolean getEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$2);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "enabled" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetEnabled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLED$2);
                return target;
            }
        }
        
        /**
         * Sets the "enabled" attribute
         */
        public void setEnabled(boolean enabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLED$2);
                }
                target.setBooleanValue(enabled);
            }
        }
        
        /**
         * Sets (as xml) the "enabled" attribute
         */
        public void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLED$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLED$2);
                }
                target.set(enabled);
            }
        }
        /**
         * An XML ShareRule(@http://uicds.org/AgreementService).
         *
         * This is a complex type.
         */
        public static class ShareRuleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.AgreementType.ShareRules.ShareRule
        {
            private static final long serialVersionUID = 1L;
            
            public ShareRuleImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CONDITION$0 = 
                new javax.xml.namespace.QName("http://uicds.org/AgreementService", "Condition");
            private static final javax.xml.namespace.QName WORKPRODUCTS$2 = 
                new javax.xml.namespace.QName("http://uicds.org/AgreementService", "WorkProducts");
            private static final javax.xml.namespace.QName ID$4 = 
                new javax.xml.namespace.QName("", "id");
            private static final javax.xml.namespace.QName ENABLED$6 = 
                new javax.xml.namespace.QName("", "enabled");
            
            
            /**
             * Gets the "Condition" element
             */
            public org.uicds.agreementService.ConditionType getCondition()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.uicds.agreementService.ConditionType target = null;
                    target = (org.uicds.agreementService.ConditionType)get_store().find_element_user(CONDITION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Condition" element
             */
            public void setCondition(org.uicds.agreementService.ConditionType condition)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.uicds.agreementService.ConditionType target = null;
                    target = (org.uicds.agreementService.ConditionType)get_store().find_element_user(CONDITION$0, 0);
                    if (target == null)
                    {
                      target = (org.uicds.agreementService.ConditionType)get_store().add_element_user(CONDITION$0);
                    }
                    target.set(condition);
                }
            }
            
            /**
             * Appends and returns a new empty "Condition" element
             */
            public org.uicds.agreementService.ConditionType addNewCondition()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.uicds.agreementService.ConditionType target = null;
                    target = (org.uicds.agreementService.ConditionType)get_store().add_element_user(CONDITION$0);
                    return target;
                }
            }
            
            /**
             * Gets the "WorkProducts" element
             */
            public org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts getWorkProducts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts target = null;
                    target = (org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts)get_store().find_element_user(WORKPRODUCTS$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "WorkProducts" element
             */
            public boolean isSetWorkProducts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WORKPRODUCTS$2) != 0;
                }
            }
            
            /**
             * Sets the "WorkProducts" element
             */
            public void setWorkProducts(org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts workProducts)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts target = null;
                    target = (org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts)get_store().find_element_user(WORKPRODUCTS$2, 0);
                    if (target == null)
                    {
                      target = (org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts)get_store().add_element_user(WORKPRODUCTS$2);
                    }
                    target.set(workProducts);
                }
            }
            
            /**
             * Appends and returns a new empty "WorkProducts" element
             */
            public org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts addNewWorkProducts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts target = null;
                    target = (org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts)get_store().add_element_user(WORKPRODUCTS$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "WorkProducts" element
             */
            public void unsetWorkProducts()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WORKPRODUCTS$2, 0);
                }
            }
            
            /**
             * Gets the "id" attribute
             */
            public java.lang.String getId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "id" attribute
             */
            public org.apache.xmlbeans.XmlID xgetId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlID target = null;
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
                    return target;
                }
            }
            
            /**
             * Sets the "id" attribute
             */
            public void setId(java.lang.String id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
                    }
                    target.setStringValue(id);
                }
            }
            
            /**
             * Sets (as xml) the "id" attribute
             */
            public void xsetId(org.apache.xmlbeans.XmlID id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlID target = null;
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
                    }
                    target.set(id);
                }
            }
            
            /**
             * Gets the "enabled" attribute
             */
            public boolean getEnabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$6);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "enabled" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetEnabled()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLED$6);
                    return target;
                }
            }
            
            /**
             * Sets the "enabled" attribute
             */
            public void setEnabled(boolean enabled)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENABLED$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENABLED$6);
                    }
                    target.setBooleanValue(enabled);
                }
            }
            
            /**
             * Sets (as xml) the "enabled" attribute
             */
            public void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENABLED$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENABLED$6);
                    }
                    target.set(enabled);
                }
            }
            /**
             * An XML WorkProducts(@http://uicds.org/AgreementService).
             *
             * This is a complex type.
             */
            public static class WorkProductsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.AgreementType.ShareRules.ShareRule.WorkProducts
            {
                private static final long serialVersionUID = 1L;
                
                public WorkProductsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TYPE$0 = 
                    new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Type");
                
                
                /**
                 * Gets array of all "Type" elements
                 */
                public com.saic.precis.x2009.x06.base.CodespaceValueType[] getTypeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(TYPE$0, targetList);
                      com.saic.precis.x2009.x06.base.CodespaceValueType[] result = new com.saic.precis.x2009.x06.base.CodespaceValueType[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "Type" element
                 */
                public com.saic.precis.x2009.x06.base.CodespaceValueType getTypeArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
                      target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(TYPE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "Type" element
                 */
                public int sizeOfTypeArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TYPE$0);
                    }
                }
                
                /**
                 * Sets array of all "Type" element
                 */
                public void setTypeArray(com.saic.precis.x2009.x06.base.CodespaceValueType[] typeArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(typeArray, TYPE$0);
                    }
                }
                
                /**
                 * Sets ith "Type" element
                 */
                public void setTypeArray(int i, com.saic.precis.x2009.x06.base.CodespaceValueType type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
                      target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(TYPE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(type);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "Type" element
                 */
                public com.saic.precis.x2009.x06.base.CodespaceValueType insertNewType(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
                      target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().insert_element_user(TYPE$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "Type" element
                 */
                public com.saic.precis.x2009.x06.base.CodespaceValueType addNewType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
                      target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(TYPE$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "Type" element
                 */
                public void removeType(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TYPE$0, i);
                    }
                }
            }
        }
    }
}
