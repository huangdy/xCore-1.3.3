/*
 * An XML document type.
 * Localname: Documents
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.DocumentsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Documents(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class DocumentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.DocumentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Documents");
    
    
    /**
     * Gets the "Documents" element
     */
    public oasisNamesTcCiqXpil3.DocumentsDocument.Documents getDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.DocumentsDocument.Documents target = null;
            target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents)get_store().find_element_user(DOCUMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Documents" element
     */
    public void setDocuments(oasisNamesTcCiqXpil3.DocumentsDocument.Documents documents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.DocumentsDocument.Documents target = null;
            target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents)get_store().find_element_user(DOCUMENTS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents)get_store().add_element_user(DOCUMENTS$0);
            }
            target.set(documents);
        }
    }
    
    /**
     * Appends and returns a new empty "Documents" element
     */
    public oasisNamesTcCiqXpil3.DocumentsDocument.Documents addNewDocuments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.DocumentsDocument.Documents target = null;
            target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents)get_store().add_element_user(DOCUMENTS$0);
            return target;
        }
    }
    /**
     * An XML Documents(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class DocumentsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.DocumentsDocument.Documents
    {
        private static final long serialVersionUID = 1L;
        
        public DocumentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOCUMENT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Document");
        
        
        /**
         * Gets array of all "Document" elements
         */
        public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document[] getDocumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DOCUMENT$0, targetList);
                oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document[] result = new oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Document" element
         */
        public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document getDocumentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document target = null;
                target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document)get_store().find_element_user(DOCUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Document" element
         */
        public int sizeOfDocumentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DOCUMENT$0);
            }
        }
        
        /**
         * Sets array of all "Document" element
         */
        public void setDocumentArray(oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document[] documentArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(documentArray, DOCUMENT$0);
            }
        }
        
        /**
         * Sets ith "Document" element
         */
        public void setDocumentArray(int i, oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document document)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document target = null;
                target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document)get_store().find_element_user(DOCUMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(document);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Document" element
         */
        public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document insertNewDocument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document target = null;
                target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document)get_store().insert_element_user(DOCUMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Document" element
         */
        public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document addNewDocument()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document target = null;
                target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document)get_store().add_element_user(DOCUMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Document" element
         */
        public void removeDocument(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DOCUMENT$0, i);
            }
        }
        /**
         * An XML Document(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document
        {
            private static final long serialVersionUID = 1L;
            
            public DocumentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DOCUMENTELEMENT$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "DocumentElement");
            private static final javax.xml.namespace.QName NAMEONDOCUMENT$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "NameOnDocument");
            private static final javax.xml.namespace.QName ADDRESSONDOCUMENT$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "AddressOnDocument");
            private static final javax.xml.namespace.QName ISSUERNAME$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "IssuerName");
            private static final javax.xml.namespace.QName TYPE$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName STATUS$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
            private static final javax.xml.namespace.QName DATEVALIDFROM$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
            private static final javax.xml.namespace.QName DATEVALIDTO$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$16 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$18 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$20 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets array of all "DocumentElement" elements
             */
            public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement[] getDocumentElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DOCUMENTELEMENT$0, targetList);
                    oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement[] result = new oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "DocumentElement" element
             */
            public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement getDocumentElementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement target = null;
                    target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement)get_store().find_element_user(DOCUMENTELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "DocumentElement" element
             */
            public int sizeOfDocumentElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DOCUMENTELEMENT$0);
                }
            }
            
            /**
             * Sets array of all "DocumentElement" element
             */
            public void setDocumentElementArray(oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement[] documentElementArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(documentElementArray, DOCUMENTELEMENT$0);
                }
            }
            
            /**
             * Sets ith "DocumentElement" element
             */
            public void setDocumentElementArray(int i, oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement documentElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement target = null;
                    target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement)get_store().find_element_user(DOCUMENTELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(documentElement);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DocumentElement" element
             */
            public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement insertNewDocumentElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement target = null;
                    target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement)get_store().insert_element_user(DOCUMENTELEMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DocumentElement" element
             */
            public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement addNewDocumentElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement target = null;
                    target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement)get_store().add_element_user(DOCUMENTELEMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "DocumentElement" element
             */
            public void removeDocumentElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DOCUMENTELEMENT$0, i);
                }
            }
            
            /**
             * Gets the "NameOnDocument" element
             */
            public oasisNamesTcCiqXnl3.PartyNameType getNameOnDocument()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.PartyNameType target = null;
                    target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().find_element_user(NAMEONDOCUMENT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "NameOnDocument" element
             */
            public boolean isSetNameOnDocument()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NAMEONDOCUMENT$2) != 0;
                }
            }
            
            /**
             * Sets the "NameOnDocument" element
             */
            public void setNameOnDocument(oasisNamesTcCiqXnl3.PartyNameType nameOnDocument)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.PartyNameType target = null;
                    target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().find_element_user(NAMEONDOCUMENT$2, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().add_element_user(NAMEONDOCUMENT$2);
                    }
                    target.set(nameOnDocument);
                }
            }
            
            /**
             * Appends and returns a new empty "NameOnDocument" element
             */
            public oasisNamesTcCiqXnl3.PartyNameType addNewNameOnDocument()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXnl3.PartyNameType target = null;
                    target = (oasisNamesTcCiqXnl3.PartyNameType)get_store().add_element_user(NAMEONDOCUMENT$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "NameOnDocument" element
             */
            public void unsetNameOnDocument()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NAMEONDOCUMENT$2, 0);
                }
            }
            
            /**
             * Gets the "AddressOnDocument" element
             */
            public oasisNamesTcCiqXal3.AddressType getAddressOnDocument()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType target = null;
                    target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESSONDOCUMENT$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "AddressOnDocument" element
             */
            public boolean isSetAddressOnDocument()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ADDRESSONDOCUMENT$4) != 0;
                }
            }
            
            /**
             * Sets the "AddressOnDocument" element
             */
            public void setAddressOnDocument(oasisNamesTcCiqXal3.AddressType addressOnDocument)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType target = null;
                    target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESSONDOCUMENT$4, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(ADDRESSONDOCUMENT$4);
                    }
                    target.set(addressOnDocument);
                }
            }
            
            /**
             * Appends and returns a new empty "AddressOnDocument" element
             */
            public oasisNamesTcCiqXal3.AddressType addNewAddressOnDocument()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXal3.AddressType target = null;
                    target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(ADDRESSONDOCUMENT$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "AddressOnDocument" element
             */
            public void unsetAddressOnDocument()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ADDRESSONDOCUMENT$4, 0);
                }
            }
            
            /**
             * Gets the "IssuerName" element
             */
            public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName getIssuerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName target = null;
                    target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName)get_store().find_element_user(ISSUERNAME$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "IssuerName" element
             */
            public boolean isSetIssuerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ISSUERNAME$6) != 0;
                }
            }
            
            /**
             * Sets the "IssuerName" element
             */
            public void setIssuerName(oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName issuerName)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName target = null;
                    target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName)get_store().find_element_user(ISSUERNAME$6, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName)get_store().add_element_user(ISSUERNAME$6);
                    }
                    target.set(issuerName);
                }
            }
            
            /**
             * Appends and returns a new empty "IssuerName" element
             */
            public oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName addNewIssuerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName target = null;
                    target = (oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName)get_store().add_element_user(ISSUERNAME$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "IssuerName" element
             */
            public void unsetIssuerName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ISSUERNAME$6, 0);
                }
            }
            
            /**
             * Gets the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.DocumentTypeList.Enum getType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqXpil3.DocumentTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.DocumentTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DocumentTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.DocumentTypeList)get_store().find_attribute_user(TYPE$8);
                    return target;
                }
            }
            
            /**
             * True if has "Type" attribute
             */
            public boolean isSetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TYPE$8) != null;
                }
            }
            
            /**
             * Sets the "Type" attribute
             */
            public void setType(oasisNamesTcCiqXpil3.DocumentTypeList.Enum type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
                    }
                    target.setEnumValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXpil3.DocumentTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DocumentTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.DocumentTypeList)get_store().find_attribute_user(TYPE$8);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.DocumentTypeList)get_store().add_attribute_user(TYPE$8);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Unsets the "Type" attribute
             */
            public void unsetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TYPE$8);
                }
            }
            
            /**
             * Gets the "Status" attribute
             */
            public java.lang.String getStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$10);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Status" attribute
             */
            public oasisNamesTcCiqCt3.StatusList xgetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.StatusList target = null;
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$10);
                    return target;
                }
            }
            
            /**
             * True if has "Status" attribute
             */
            public boolean isSetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(STATUS$10) != null;
                }
            }
            
            /**
             * Sets the "Status" attribute
             */
            public void setStatus(java.lang.String status)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$10);
                    }
                    target.setStringValue(status);
                }
            }
            
            /**
             * Sets (as xml) the "Status" attribute
             */
            public void xsetStatus(oasisNamesTcCiqCt3.StatusList status)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.StatusList target = null;
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$10);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$10);
                    }
                    target.set(status);
                }
            }
            
            /**
             * Unsets the "Status" attribute
             */
            public void unsetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(STATUS$10);
                }
            }
            
            /**
             * Gets the "DateValidFrom" attribute
             */
            public java.util.Calendar getDateValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$12);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "DateValidFrom" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetDateValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$12);
                    return target;
                }
            }
            
            /**
             * True if has "DateValidFrom" attribute
             */
            public boolean isSetDateValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DATEVALIDFROM$12) != null;
                }
            }
            
            /**
             * Sets the "DateValidFrom" attribute
             */
            public void setDateValidFrom(java.util.Calendar dateValidFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$12);
                    }
                    target.setCalendarValue(dateValidFrom);
                }
            }
            
            /**
             * Sets (as xml) the "DateValidFrom" attribute
             */
            public void xsetDateValidFrom(org.apache.xmlbeans.XmlDateTime dateValidFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$12);
                    }
                    target.set(dateValidFrom);
                }
            }
            
            /**
             * Unsets the "DateValidFrom" attribute
             */
            public void unsetDateValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DATEVALIDFROM$12);
                }
            }
            
            /**
             * Gets the "DateValidTo" attribute
             */
            public java.util.Calendar getDateValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$14);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "DateValidTo" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetDateValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$14);
                    return target;
                }
            }
            
            /**
             * True if has "DateValidTo" attribute
             */
            public boolean isSetDateValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DATEVALIDTO$14) != null;
                }
            }
            
            /**
             * Sets the "DateValidTo" attribute
             */
            public void setDateValidTo(java.util.Calendar dateValidTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$14);
                    }
                    target.setCalendarValue(dateValidTo);
                }
            }
            
            /**
             * Sets (as xml) the "DateValidTo" attribute
             */
            public void xsetDateValidTo(org.apache.xmlbeans.XmlDateTime dateValidTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$14);
                    }
                    target.set(dateValidTo);
                }
            }
            
            /**
             * Unsets the "DateValidTo" attribute
             */
            public void unsetDateValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DATEVALIDTO$14);
                }
            }
            
            /**
             * Gets the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$16);
                    if (target == null)
                    {
                      return null;
                    }
                    return (oasisNamesTcCiqCt3.DataQualityTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$16);
                    return target;
                }
            }
            
            /**
             * True if has "DataQualityType" attribute
             */
            public boolean isSetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(DATAQUALITYTYPE$16) != null;
                }
            }
            
            /**
             * Sets the "DataQualityType" attribute
             */
            public void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$16);
                    }
                    target.setEnumValue(dataQualityType);
                }
            }
            
            /**
             * Sets (as xml) the "DataQualityType" attribute
             */
            public void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqCt3.DataQualityTypeList target = null;
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$16);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$16);
                    }
                    target.set(dataQualityType);
                }
            }
            
            /**
             * Unsets the "DataQualityType" attribute
             */
            public void unsetDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(DATAQUALITYTYPE$16);
                }
            }
            
            /**
             * Gets the "ValidFrom" attribute
             */
            public java.util.Calendar getValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$18);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValidFrom" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$18);
                    return target;
                }
            }
            
            /**
             * True if has "ValidFrom" attribute
             */
            public boolean isSetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALIDFROM$18) != null;
                }
            }
            
            /**
             * Sets the "ValidFrom" attribute
             */
            public void setValidFrom(java.util.Calendar validFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$18);
                    }
                    target.setCalendarValue(validFrom);
                }
            }
            
            /**
             * Sets (as xml) the "ValidFrom" attribute
             */
            public void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$18);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$18);
                    }
                    target.set(validFrom);
                }
            }
            
            /**
             * Unsets the "ValidFrom" attribute
             */
            public void unsetValidFrom()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALIDFROM$18);
                }
            }
            
            /**
             * Gets the "ValidTo" attribute
             */
            public java.util.Calendar getValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$20);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "ValidTo" attribute
             */
            public org.apache.xmlbeans.XmlDateTime xgetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$20);
                    return target;
                }
            }
            
            /**
             * True if has "ValidTo" attribute
             */
            public boolean isSetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(VALIDTO$20) != null;
                }
            }
            
            /**
             * Sets the "ValidTo" attribute
             */
            public void setValidTo(java.util.Calendar validTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$20);
                    }
                    target.setCalendarValue(validTo);
                }
            }
            
            /**
             * Sets (as xml) the "ValidTo" attribute
             */
            public void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$20);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$20);
                    }
                    target.set(validTo);
                }
            }
            
            /**
             * Unsets the "ValidTo" attribute
             */
            public void unsetValidTo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(VALIDTO$20);
                }
            }
            /**
             * An XML DocumentElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.DocumentsDocument$Documents$Document$DocumentElement.
             */
            public static class DocumentElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.DocumentElement
            {
                private static final long serialVersionUID = 1L;
                
                public DocumentElementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected DocumentElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName TYPE$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
                
                
                /**
                 * Gets the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.DocumentElementList.Enum getType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (oasisNamesTcCiqXpil3.DocumentElementList.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.DocumentElementList xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.DocumentElementList target = null;
                      target = (oasisNamesTcCiqXpil3.DocumentElementList)get_store().find_attribute_user(TYPE$0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Type" attribute
                 */
                public boolean isSetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().find_attribute_user(TYPE$0) != null;
                    }
                }
                
                /**
                 * Sets the "Type" attribute
                 */
                public void setType(oasisNamesTcCiqXpil3.DocumentElementList.Enum type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                      }
                      target.setEnumValue(type);
                    }
                }
                
                /**
                 * Sets (as xml) the "Type" attribute
                 */
                public void xsetType(oasisNamesTcCiqXpil3.DocumentElementList type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.DocumentElementList target = null;
                      target = (oasisNamesTcCiqXpil3.DocumentElementList)get_store().find_attribute_user(TYPE$0);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXpil3.DocumentElementList)get_store().add_attribute_user(TYPE$0);
                      }
                      target.set(type);
                    }
                }
                
                /**
                 * Unsets the "Type" attribute
                 */
                public void unsetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_attribute(TYPE$0);
                    }
                }
            }
            /**
             * An XML IssuerName(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is a complex type.
             */
            public static class IssuerNameImpl extends oasisNamesTcCiqXnl3.impl.OrganisationNameTypeImpl implements oasisNamesTcCiqXpil3.DocumentsDocument.Documents.Document.IssuerName
            {
                private static final long serialVersionUID = 1L;
                
                public IssuerNameImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
        }
    }
}
