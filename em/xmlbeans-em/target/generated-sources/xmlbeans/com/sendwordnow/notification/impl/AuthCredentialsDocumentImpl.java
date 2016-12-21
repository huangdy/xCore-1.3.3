/*
 * An XML document type.
 * Localname: AuthCredentials
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.AuthCredentialsDocument
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * A document containing one AuthCredentials(@http://www.sendwordnow.com/notification) element.
 *
 * This is a complex type.
 */
public class AuthCredentialsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.AuthCredentialsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AuthCredentialsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUTHCREDENTIALS$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "AuthCredentials");
    
    
    /**
     * Gets the "AuthCredentials" element
     */
    public com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials getAuthCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials target = null;
            target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials)get_store().find_element_user(AUTHCREDENTIALS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AuthCredentials" element
     */
    public void setAuthCredentials(com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials authCredentials)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials target = null;
            target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials)get_store().find_element_user(AUTHCREDENTIALS$0, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials)get_store().add_element_user(AUTHCREDENTIALS$0);
            }
            target.set(authCredentials);
        }
    }
    
    /**
     * Appends and returns a new empty "AuthCredentials" element
     */
    public com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials addNewAuthCredentials()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials target = null;
            target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials)get_store().add_element_user(AUTHCREDENTIALS$0);
            return target;
        }
    }
    /**
     * An XML AuthCredentials(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class AuthCredentialsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials
    {
        private static final long serialVersionUID = 1L;
        
        public AuthCredentialsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName USERNAME$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "username");
        private static final javax.xml.namespace.QName PASSWORD$2 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "password");
        
        
        /**
         * Gets the "username" element
         */
        public java.lang.String getUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "username" element
         */
        public com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Username xgetUsername()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Username target = null;
                target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Username)get_store().find_element_user(USERNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "username" element
         */
        public void setUsername(java.lang.String username)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERNAME$0);
                }
                target.setStringValue(username);
            }
        }
        
        /**
         * Sets (as xml) the "username" element
         */
        public void xsetUsername(com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Username username)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Username target = null;
                target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Username)get_store().find_element_user(USERNAME$0, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Username)get_store().add_element_user(USERNAME$0);
                }
                target.set(username);
            }
        }
        
        /**
         * Gets the "password" element
         */
        public java.lang.String getPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "password" element
         */
        public com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Password xgetPassword()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Password target = null;
                target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Password)get_store().find_element_user(PASSWORD$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "password" element
         */
        public void setPassword(java.lang.String password)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PASSWORD$2);
                }
                target.setStringValue(password);
            }
        }
        
        /**
         * Sets (as xml) the "password" element
         */
        public void xsetPassword(com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Password password)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Password target = null;
                target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Password)get_store().find_element_user(PASSWORD$2, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Password)get_store().add_element_user(PASSWORD$2);
                }
                target.set(password);
            }
        }
        /**
         * An XML username(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.AuthCredentialsDocument$AuthCredentials$Username.
         */
        public static class UsernameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Username
        {
            private static final long serialVersionUID = 1L;
            
            public UsernameImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UsernameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML password(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.AuthCredentialsDocument$AuthCredentials$Password.
         */
        public static class PasswordImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sendwordnow.notification.AuthCredentialsDocument.AuthCredentials.Password
        {
            private static final long serialVersionUID = 1L;
            
            public PasswordImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected PasswordImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
