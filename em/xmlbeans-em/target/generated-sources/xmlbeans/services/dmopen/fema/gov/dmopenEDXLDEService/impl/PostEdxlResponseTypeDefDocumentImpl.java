/*
 * An XML document type.
 * Localname: postEdxlResponseTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/
 * Java type: services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenEDXLDEService.impl;
/**
 * A document containing one postEdxlResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/) element.
 *
 * This is a complex type.
 */
public class PostEdxlResponseTypeDefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostEdxlResponseTypeDefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTEDXLRESPONSETYPEDEF$0 = 
        new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/", "postEdxlResponseTypeDef");
    
    
    /**
     * Gets the "postEdxlResponseTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef getPostEdxlResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef)get_store().find_element_user(POSTEDXLRESPONSETYPEDEF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "postEdxlResponseTypeDef" element
     */
    public void setPostEdxlResponseTypeDef(services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef postEdxlResponseTypeDef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef)get_store().find_element_user(POSTEDXLRESPONSETYPEDEF$0, 0);
            if (target == null)
            {
                target = (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef)get_store().add_element_user(POSTEDXLRESPONSETYPEDEF$0);
            }
            target.set(postEdxlResponseTypeDef);
        }
    }
    
    /**
     * Appends and returns a new empty "postEdxlResponseTypeDef" element
     */
    public services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef addNewPostEdxlResponseTypeDef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef target = null;
            target = (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef)get_store().add_element_user(POSTEDXLRESPONSETYPEDEF$0);
            return target;
        }
    }
    /**
     * An XML postEdxlResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/).
     *
     * This is a complex type.
     */
    public static class PostEdxlResponseTypeDefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef
    {
        private static final long serialVersionUID = 1L;
        
        public PostEdxlResponseTypeDefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName POSTEDXLRETURN$0 = 
            new javax.xml.namespace.QName("http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/", "postEdxlReturn");
        
        
        /**
         * Gets the "postEdxlReturn" element
         */
        public java.lang.String getPostEdxlReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTEDXLRETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "postEdxlReturn" element
         */
        public org.apache.xmlbeans.XmlString xgetPostEdxlReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTEDXLRETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "postEdxlReturn" element
         */
        public void setPostEdxlReturn(java.lang.String postEdxlReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTEDXLRETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTEDXLRETURN$0);
                }
                target.setStringValue(postEdxlReturn);
            }
        }
        
        /**
         * Sets (as xml) the "postEdxlReturn" element
         */
        public void xsetPostEdxlReturn(org.apache.xmlbeans.XmlString postEdxlReturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTEDXLRETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTEDXLRETURN$0);
                }
                target.set(postEdxlReturn);
            }
        }
    }
}
