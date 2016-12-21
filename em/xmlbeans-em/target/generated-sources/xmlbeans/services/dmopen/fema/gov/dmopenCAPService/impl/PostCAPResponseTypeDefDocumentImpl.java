/*
 * An XML document type.
 * Localname: postCAPResponseTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_CAPService/
 * Java type: services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenCAPService.impl;
/**
 * A document containing one postCAPResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/) element.
 *
 * This is a complex type.
 */
public class PostCAPResponseTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostCAPResponseTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTCAPRESPONSETYPEDEF$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_CAPService/", "postCAPResponseTypeDef");
    
    
    /**
     * Gets the "postCAPResponseTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef getPostCAPResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef)get_store().find_element_user(POSTCAPRESPONSETYPEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "postCAPResponseTypeDef" element
     */
    public void setPostCAPResponseTypeDef(services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef postCAPResponseTypeDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef)get_store().find_element_user(POSTCAPRESPONSETYPEDEF$0, 0);
            if (target == null)
            {
                target = (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef)get_store().add_element_user(POSTCAPRESPONSETYPEDEF$0);
            }
            target.set(postCAPResponseTypeDef);
        }
    }
    
    /**
     * Appends and returns a new empty "postCAPResponseTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef addNewPostCAPResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef)get_store().add_element_user(POSTCAPRESPONSETYPEDEF$0);
            return target;
        }
    }
    /**
     * An XML postCAPResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/).
     *
     * This is a complex type.
     */
    public static class PostCAPResponseTypeDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef
    {
        private static final long serialVersionUID = 1L;
        
        public PostCAPResponseTypeDefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POSTCAPRETURN$0 = 
            new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_CAPService/", "postCAPReturn");
        
        
        /**
         * Gets the "postCAPReturn" element
         */
        public java.lang.String getPostCAPReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCAPRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postCAPReturn" element
         */
        public org.apache.xmlbeans.XmlString xgetPostCAPReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCAPRETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "postCAPReturn" element
         */
        public void setPostCAPReturn(java.lang.String postCAPReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCAPRETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCAPRETURN$0);
                }
                target.setStringValue(postCAPReturn);
            }
        }
        
        /**
         * Sets (as xml) the "postCAPReturn" element
         */
        public void xsetPostCAPReturn(org.apache.xmlbeans.XmlString postCAPReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCAPRETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTCAPRETURN$0);
                }
                target.set(postCAPReturn);
            }
        }
    }
}
