/*
 * An XML document type.
 * Localname: EchoResponse
 * Namespace: http://www.example.com/echo/schemas
 * Java type: com.example.echo.schemas.EchoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package com.example.echo.schemas.impl;
/**
 * A document containing one EchoResponse(@http://www.example.com/echo/schemas) element.
 *
 * This is a complex type.
 */
public class EchoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.example.echo.schemas.EchoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EchoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ECHORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.example.com/echo/schemas", "EchoResponse");
    
    
    /**
     * Gets the "EchoResponse" element
     */
    public com.example.echo.schemas.EchoResponseDocument.EchoResponse getEchoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.example.echo.schemas.EchoResponseDocument.EchoResponse target = null;
            target = (com.example.echo.schemas.EchoResponseDocument.EchoResponse)get_store().find_element_user(ECHORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EchoResponse" element
     */
    public void setEchoResponse(com.example.echo.schemas.EchoResponseDocument.EchoResponse echoResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.example.echo.schemas.EchoResponseDocument.EchoResponse target = null;
            target = (com.example.echo.schemas.EchoResponseDocument.EchoResponse)get_store().find_element_user(ECHORESPONSE$0, 0);
            if (target == null)
            {
                target = (com.example.echo.schemas.EchoResponseDocument.EchoResponse)get_store().add_element_user(ECHORESPONSE$0);
            }
            target.set(echoResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "EchoResponse" element
     */
    public com.example.echo.schemas.EchoResponseDocument.EchoResponse addNewEchoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.example.echo.schemas.EchoResponseDocument.EchoResponse target = null;
            target = (com.example.echo.schemas.EchoResponseDocument.EchoResponse)get_store().add_element_user(ECHORESPONSE$0);
            return target;
        }
    }
    /**
     * An XML EchoResponse(@http://www.example.com/echo/schemas).
     *
     * This is a complex type.
     */
    public static class EchoResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.example.echo.schemas.EchoResponseDocument.EchoResponse
    {
        private static final long serialVersionUID = 1L;
        
        public EchoResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ECHORESPONSE$0 = 
            new javax.xml.namespace.QName("http://www.example.com/echo/schemas", "EchoResponse");
        
        
        /**
         * Gets the "EchoResponse" element
         */
        public com.example.echo.schemas.ReturnType getEchoResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.example.echo.schemas.ReturnType target = null;
                target = (com.example.echo.schemas.ReturnType)get_store().find_element_user(ECHORESPONSE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "EchoResponse" element
         */
        public void setEchoResponse(com.example.echo.schemas.ReturnType echoResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.example.echo.schemas.ReturnType target = null;
                target = (com.example.echo.schemas.ReturnType)get_store().find_element_user(ECHORESPONSE$0, 0);
                if (target == null)
                {
                    target = (com.example.echo.schemas.ReturnType)get_store().add_element_user(ECHORESPONSE$0);
                }
                target.set(echoResponse);
            }
        }
        
        /**
         * Appends and returns a new empty "EchoResponse" element
         */
        public com.example.echo.schemas.ReturnType addNewEchoResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.example.echo.schemas.ReturnType target = null;
                target = (com.example.echo.schemas.ReturnType)get_store().add_element_user(ECHORESPONSE$0);
                return target;
            }
        }
    }
}
