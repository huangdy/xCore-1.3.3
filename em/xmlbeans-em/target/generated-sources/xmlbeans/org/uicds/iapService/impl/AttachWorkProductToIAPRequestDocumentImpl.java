/*
 * An XML document type.
 * Localname: AttachWorkProductToIAPRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.AttachWorkProductToIAPRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one AttachWorkProductToIAPRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class AttachWorkProductToIAPRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.AttachWorkProductToIAPRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachWorkProductToIAPRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHWORKPRODUCTTOIAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "AttachWorkProductToIAPRequest");
    
    
    /**
     * Gets the "AttachWorkProductToIAPRequest" element
     */
    public org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest getAttachWorkProductToIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest target = null;
            target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest)get_store().find_element_user(ATTACHWORKPRODUCTTOIAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachWorkProductToIAPRequest" element
     */
    public void setAttachWorkProductToIAPRequest(org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest attachWorkProductToIAPRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest target = null;
            target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest)get_store().find_element_user(ATTACHWORKPRODUCTTOIAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest)get_store().add_element_user(ATTACHWORKPRODUCTTOIAPREQUEST$0);
            }
            target.set(attachWorkProductToIAPRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachWorkProductToIAPRequest" element
     */
    public org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest addNewAttachWorkProductToIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest target = null;
            target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest)get_store().add_element_user(ATTACHWORKPRODUCTTOIAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML AttachWorkProductToIAPRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class AttachWorkProductToIAPRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest
    {
        private static final long serialVersionUID = 1L;
        
        public AttachWorkProductToIAPRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IAP$0 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "IAP");
        private static final javax.xml.namespace.QName WORKPRODUCTLIST$2 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "WorkProductList");
        
        
        /**
         * Gets the "IAP" element
         */
        public org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP getIAP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP target = null;
                target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP)get_store().find_element_user(IAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "IAP" element
         */
        public void setIAP(org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP iap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP target = null;
                target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP)get_store().find_element_user(IAP$0, 0);
                if (target == null)
                {
                    target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP)get_store().add_element_user(IAP$0);
                }
                target.set(iap);
            }
        }
        
        /**
         * Appends and returns a new empty "IAP" element
         */
        public org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP addNewIAP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP target = null;
                target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP)get_store().add_element_user(IAP$0);
                return target;
            }
        }
        
        /**
         * Gets the "WorkProductList" element
         */
        public org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList getWorkProductList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList target = null;
                target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList)get_store().find_element_user(WORKPRODUCTLIST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductList" element
         */
        public void setWorkProductList(org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList workProductList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList target = null;
                target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList)get_store().find_element_user(WORKPRODUCTLIST$2, 0);
                if (target == null)
                {
                    target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList)get_store().add_element_user(WORKPRODUCTLIST$2);
                }
                target.set(workProductList);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductList" element
         */
        public org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList addNewWorkProductList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList target = null;
                target = (org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList)get_store().add_element_user(WORKPRODUCTLIST$2);
                return target;
            }
        }
        /**
         * An XML IAP(@http://uicds.org/IAPService).
         *
         * This is a complex type.
         */
        public static class IAPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.IAP
        {
            private static final long serialVersionUID = 1L;
            
            public IAPImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
                new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
            
            
            /**
             * Gets the "WorkProductIdentification" element
             */
            public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.saic.precis.x2009.x06.base.IdentificationType target = null;
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "WorkProductIdentification" element
             */
            public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.saic.precis.x2009.x06.base.IdentificationType target = null;
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                    if (target == null)
                    {
                      target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                    }
                    target.set(workProductIdentification);
                }
            }
            
            /**
             * Appends and returns a new empty "WorkProductIdentification" element
             */
            public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.saic.precis.x2009.x06.base.IdentificationType target = null;
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                    return target;
                }
            }
        }
        /**
         * An XML WorkProductList(@http://uicds.org/IAPService).
         *
         * This is a complex type.
         */
        public static class WorkProductListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.AttachWorkProductToIAPRequestDocument.AttachWorkProductToIAPRequest.WorkProductList
        {
            private static final long serialVersionUID = 1L;
            
            public WorkProductListImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
                new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
            
            
            /**
             * Gets array of all "WorkProductIdentification" elements
             */
            public com.saic.precis.x2009.x06.base.IdentificationType[] getWorkProductIdentificationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(WORKPRODUCTIDENTIFICATION$0, targetList);
                    com.saic.precis.x2009.x06.base.IdentificationType[] result = new com.saic.precis.x2009.x06.base.IdentificationType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "WorkProductIdentification" element
             */
            public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentificationArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.saic.precis.x2009.x06.base.IdentificationType target = null;
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "WorkProductIdentification" element
             */
            public int sizeOfWorkProductIdentificationArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(WORKPRODUCTIDENTIFICATION$0);
                }
            }
            
            /**
             * Sets array of all "WorkProductIdentification" element
             */
            public void setWorkProductIdentificationArray(com.saic.precis.x2009.x06.base.IdentificationType[] workProductIdentificationArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(workProductIdentificationArray, WORKPRODUCTIDENTIFICATION$0);
                }
            }
            
            /**
             * Sets ith "WorkProductIdentification" element
             */
            public void setWorkProductIdentificationArray(int i, com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.saic.precis.x2009.x06.base.IdentificationType target = null;
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(workProductIdentification);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "WorkProductIdentification" element
             */
            public com.saic.precis.x2009.x06.base.IdentificationType insertNewWorkProductIdentification(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.saic.precis.x2009.x06.base.IdentificationType target = null;
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().insert_element_user(WORKPRODUCTIDENTIFICATION$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "WorkProductIdentification" element
             */
            public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.saic.precis.x2009.x06.base.IdentificationType target = null;
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "WorkProductIdentification" element
             */
            public void removeWorkProductIdentification(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(WORKPRODUCTIDENTIFICATION$0, i);
                }
            }
        }
    }
}
