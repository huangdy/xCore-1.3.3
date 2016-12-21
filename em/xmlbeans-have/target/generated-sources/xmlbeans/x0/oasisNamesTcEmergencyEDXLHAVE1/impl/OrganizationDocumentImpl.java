/*
 * An XML document type.
 * Localname: Organization
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * A document containing one Organization(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0) element.
 *
 * This is a complex type.
 */
public class OrganizationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATION$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "Organization");
    
    
    /**
     * Gets the "Organization" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Organization" element
     */
    public void setOrganization(x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization)get_store().add_element_user(ORGANIZATION$0);
            }
            target.set(organization);
        }
    }
    
    /**
     * Appends and returns a new empty "Organization" element
     */
    public x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization target = null;
            target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization)get_store().add_element_user(ORGANIZATION$0);
            return target;
        }
    }
    /**
     * An XML Organization(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public static class OrganizationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization
    {
        private static final long serialVersionUID = 1L;
        
        public OrganizationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORGANIZATIONINFORMATION$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "OrganizationInformation");
        private static final javax.xml.namespace.QName ORGANIZATIONGEOLOCATION$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "OrganizationGeoLocation");
        private static final javax.xml.namespace.QName COMMENTTEXT$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0", "CommentText");
        
        
        /**
         * Gets the "OrganizationInformation" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation getOrganizationInformation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation)get_store().find_element_user(ORGANIZATIONINFORMATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OrganizationInformation" element
         */
        public void setOrganizationInformation(x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation organizationInformation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation)get_store().find_element_user(ORGANIZATIONINFORMATION$0, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation)get_store().add_element_user(ORGANIZATIONINFORMATION$0);
                }
                target.set(organizationInformation);
            }
        }
        
        /**
         * Appends and returns a new empty "OrganizationInformation" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation addNewOrganizationInformation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation)get_store().add_element_user(ORGANIZATIONINFORMATION$0);
                return target;
            }
        }
        
        /**
         * Gets the "OrganizationGeoLocation" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation getOrganizationGeoLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation)get_store().find_element_user(ORGANIZATIONGEOLOCATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "OrganizationGeoLocation" element
         */
        public boolean isSetOrganizationGeoLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORGANIZATIONGEOLOCATION$2) != 0;
            }
        }
        
        /**
         * Sets the "OrganizationGeoLocation" element
         */
        public void setOrganizationGeoLocation(x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation organizationGeoLocation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation)get_store().find_element_user(ORGANIZATIONGEOLOCATION$2, 0);
                if (target == null)
                {
                    target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation)get_store().add_element_user(ORGANIZATIONGEOLOCATION$2);
                }
                target.set(organizationGeoLocation);
            }
        }
        
        /**
         * Appends and returns a new empty "OrganizationGeoLocation" element
         */
        public x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation addNewOrganizationGeoLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation target = null;
                target = (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation)get_store().add_element_user(ORGANIZATIONGEOLOCATION$2);
                return target;
            }
        }
        
        /**
         * Unsets the "OrganizationGeoLocation" element
         */
        public void unsetOrganizationGeoLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORGANIZATIONGEOLOCATION$2, 0);
            }
        }
        
        /**
         * Gets array of all "CommentText" elements
         */
        public java.lang.String[] getCommentTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMMENTTEXT$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "CommentText" element
         */
        public java.lang.String getCommentTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "CommentText" elements
         */
        public org.apache.xmlbeans.XmlString[] xgetCommentTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(COMMENTTEXT$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "CommentText" element
         */
        public org.apache.xmlbeans.XmlString xgetCommentTextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlString)target;
            }
        }
        
        /**
         * Returns number of "CommentText" element
         */
        public int sizeOfCommentTextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(COMMENTTEXT$4);
            }
        }
        
        /**
         * Sets array of all "CommentText" element
         */
        public void setCommentTextArray(java.lang.String[] commentTextArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(commentTextArray, COMMENTTEXT$4);
            }
        }
        
        /**
         * Sets ith "CommentText" element
         */
        public void setCommentTextArray(int i, java.lang.String commentText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENTTEXT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(commentText);
            }
        }
        
        /**
         * Sets (as xml) array of all "CommentText" element
         */
        public void xsetCommentTextArray(org.apache.xmlbeans.XmlString[]commentTextArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(commentTextArray, COMMENTTEXT$4);
            }
        }
        
        /**
         * Sets (as xml) ith "CommentText" element
         */
        public void xsetCommentTextArray(int i, org.apache.xmlbeans.XmlString commentText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENTTEXT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(commentText);
            }
        }
        
        /**
         * Inserts the value as the ith "CommentText" element
         */
        public void insertCommentText(int i, java.lang.String commentText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMMENTTEXT$4, i);
                target.setStringValue(commentText);
            }
        }
        
        /**
         * Appends the value as the last "CommentText" element
         */
        public void addCommentText(java.lang.String commentText)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENTTEXT$4);
                target.setStringValue(commentText);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CommentText" element
         */
        public org.apache.xmlbeans.XmlString insertNewCommentText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COMMENTTEXT$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CommentText" element
         */
        public org.apache.xmlbeans.XmlString addNewCommentText()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENTTEXT$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "CommentText" element
         */
        public void removeCommentText(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(COMMENTTEXT$4, i);
            }
        }
    }
}
