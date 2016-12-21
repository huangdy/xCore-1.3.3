/*
 * An XML document type.
 * Localname: EchoRequest
 * Namespace: http://www.example.com/echo/schemas
 * Java type: com.example.echo.schemas.EchoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.example.echo.schemas.impl;
/**
 * A document containing one EchoRequest(@http://www.example.com/echo/schemas) element.
 *
 * This is a complex type.
 */
public class EchoRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.example.echo.schemas.EchoRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public EchoRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ECHOREQUEST$0 = 
        new javax.xml.namespace.QName("http://www.example.com/echo/schemas", "EchoRequest");
    
    
    /**
     * Gets the "EchoRequest" element
     */
    public com.example.echo.schemas.EchoRequestDocument.EchoRequest getEchoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.example.echo.schemas.EchoRequestDocument.EchoRequest target = null;
            target = (com.example.echo.schemas.EchoRequestDocument.EchoRequest)get_store().find_element_user(ECHOREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EchoRequest" element
     */
    public void setEchoRequest(com.example.echo.schemas.EchoRequestDocument.EchoRequest echoRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.example.echo.schemas.EchoRequestDocument.EchoRequest target = null;
            target = (com.example.echo.schemas.EchoRequestDocument.EchoRequest)get_store().find_element_user(ECHOREQUEST$0, 0);
            if (target == null)
            {
                target = (com.example.echo.schemas.EchoRequestDocument.EchoRequest)get_store().add_element_user(ECHOREQUEST$0);
            }
            target.set(echoRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "EchoRequest" element
     */
    public com.example.echo.schemas.EchoRequestDocument.EchoRequest addNewEchoRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.example.echo.schemas.EchoRequestDocument.EchoRequest target = null;
            target = (com.example.echo.schemas.EchoRequestDocument.EchoRequest)get_store().add_element_user(ECHOREQUEST$0);
            return target;
        }
    }
    /**
     * An XML EchoRequest(@http://www.example.com/echo/schemas).
     *
     * This is a complex type.
     */
    public static class EchoRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.example.echo.schemas.EchoRequestDocument.EchoRequest
    {
        private static final long serialVersionUID = 1L;
        
        public EchoRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ECHO$0 = 
            new javax.xml.namespace.QName("http://www.example.com/echo/schemas", "Echo");
        
        
        /**
         * Gets the "Echo" element
         */
        public com.example.echo.schemas.EchoType getEcho()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.example.echo.schemas.EchoType target = null;
                target = (com.example.echo.schemas.EchoType)get_store().find_element_user(ECHO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Echo" element
         */
        public void setEcho(com.example.echo.schemas.EchoType echo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.example.echo.schemas.EchoType target = null;
                target = (com.example.echo.schemas.EchoType)get_store().find_element_user(ECHO$0, 0);
                if (target == null)
                {
                    target = (com.example.echo.schemas.EchoType)get_store().add_element_user(ECHO$0);
                }
                target.set(echo);
            }
        }
        
        /**
         * Appends and returns a new empty "Echo" element
         */
        public com.example.echo.schemas.EchoType addNewEcho()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.example.echo.schemas.EchoType target = null;
                target = (com.example.echo.schemas.EchoType)get_store().add_element_user(ECHO$0);
                return target;
            }
        }
    }
}
