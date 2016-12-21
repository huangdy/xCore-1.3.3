/*
 * An XML document type.
 * Localname: Memberships
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.MembershipsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Memberships(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class MembershipsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.MembershipsDocument
{
    private static final long serialVersionUID = 1L;
    
    public MembershipsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEMBERSHIPS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Memberships");
    
    
    /**
     * Gets the "Memberships" element
     */
    public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships getMemberships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships target = null;
            target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships)get_store().find_element_user(MEMBERSHIPS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Memberships" element
     */
    public void setMemberships(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships memberships)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships target = null;
            target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships)get_store().find_element_user(MEMBERSHIPS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships)get_store().add_element_user(MEMBERSHIPS$0);
            }
            target.set(memberships);
        }
    }
    
    /**
     * Appends and returns a new empty "Memberships" element
     */
    public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships addNewMemberships()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.MembershipsDocument.Memberships target = null;
            target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships)get_store().add_element_user(MEMBERSHIPS$0);
            return target;
        }
    }
    /**
     * An XML Memberships(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class MembershipsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.MembershipsDocument.Memberships
    {
        private static final long serialVersionUID = 1L;
        
        public MembershipsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEMBERSHIP$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Membership");
        
        
        /**
         * Gets array of all "Membership" elements
         */
        public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership[] getMembershipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(MEMBERSHIP$0, targetList);
                oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership[] result = new oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Membership" element
         */
        public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership getMembershipArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership target = null;
                target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership)get_store().find_element_user(MEMBERSHIP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Membership" element
         */
        public int sizeOfMembershipArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEMBERSHIP$0);
            }
        }
        
        /**
         * Sets array of all "Membership" element
         */
        public void setMembershipArray(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership[] membershipArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(membershipArray, MEMBERSHIP$0);
            }
        }
        
        /**
         * Sets ith "Membership" element
         */
        public void setMembershipArray(int i, oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership membership)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership target = null;
                target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership)get_store().find_element_user(MEMBERSHIP$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(membership);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Membership" element
         */
        public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership insertNewMembership(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership target = null;
                target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership)get_store().insert_element_user(MEMBERSHIP$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Membership" element
         */
        public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership addNewMembership()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership target = null;
                target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership)get_store().add_element_user(MEMBERSHIP$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Membership" element
         */
        public void removeMembership(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEMBERSHIP$0, i);
            }
        }
        /**
         * An XML Membership(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class MembershipImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership
        {
            private static final long serialVersionUID = 1L;
            
            public MembershipImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName MEMBERSHIPELEMENT$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "MembershipElement");
            private static final javax.xml.namespace.QName ORGANISATION$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Organisation");
            private static final javax.xml.namespace.QName TYPE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName STATUS$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Status");
            private static final javax.xml.namespace.QName DATEVALIDFROM$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidFrom");
            private static final javax.xml.namespace.QName DATEVALIDTO$10 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DateValidTo");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$12 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$14 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$16 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets array of all "MembershipElement" elements
             */
            public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement[] getMembershipElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(MEMBERSHIPELEMENT$0, targetList);
                    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement[] result = new oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "MembershipElement" element
             */
            public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement getMembershipElementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement target = null;
                    target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement)get_store().find_element_user(MEMBERSHIPELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "MembershipElement" element
             */
            public int sizeOfMembershipElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MEMBERSHIPELEMENT$0);
                }
            }
            
            /**
             * Sets array of all "MembershipElement" element
             */
            public void setMembershipElementArray(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement[] membershipElementArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(membershipElementArray, MEMBERSHIPELEMENT$0);
                }
            }
            
            /**
             * Sets ith "MembershipElement" element
             */
            public void setMembershipElementArray(int i, oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement membershipElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement target = null;
                    target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement)get_store().find_element_user(MEMBERSHIPELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(membershipElement);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "MembershipElement" element
             */
            public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement insertNewMembershipElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement target = null;
                    target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement)get_store().insert_element_user(MEMBERSHIPELEMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "MembershipElement" element
             */
            public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement addNewMembershipElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement target = null;
                    target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement)get_store().add_element_user(MEMBERSHIPELEMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "MembershipElement" element
             */
            public void removeMembershipElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MEMBERSHIPELEMENT$0, i);
                }
            }
            
            /**
             * Gets the "Organisation" element
             */
            public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation getOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation target = null;
                    target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation)get_store().find_element_user(ORGANISATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Organisation" element
             */
            public boolean isSetOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ORGANISATION$2) != 0;
                }
            }
            
            /**
             * Sets the "Organisation" element
             */
            public void setOrganisation(oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation organisation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation target = null;
                    target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation)get_store().find_element_user(ORGANISATION$2, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation)get_store().add_element_user(ORGANISATION$2);
                    }
                    target.set(organisation);
                }
            }
            
            /**
             * Appends and returns a new empty "Organisation" element
             */
            public oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation addNewOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation target = null;
                    target = (oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation)get_store().add_element_user(ORGANISATION$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "Organisation" element
             */
            public void unsetOrganisation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ORGANISATION$2, 0);
                }
            }
            
            /**
             * Gets the "Type" attribute
             */
            public java.lang.String getType()
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
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.MembershipTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.MembershipTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.MembershipTypeList)get_store().find_attribute_user(TYPE$4);
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
                    return get_store().find_attribute_user(TYPE$4) != null;
                }
            }
            
            /**
             * Sets the "Type" attribute
             */
            public void setType(java.lang.String type)
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
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXpil3.MembershipTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.MembershipTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.MembershipTypeList)get_store().find_attribute_user(TYPE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.MembershipTypeList)get_store().add_attribute_user(TYPE$4);
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
                    get_store().remove_attribute(TYPE$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$6);
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
                    return get_store().find_attribute_user(STATUS$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$6);
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
                    target = (oasisNamesTcCiqCt3.StatusList)get_store().find_attribute_user(STATUS$6);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.StatusList)get_store().add_attribute_user(STATUS$6);
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
                    get_store().remove_attribute(STATUS$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$8);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$8);
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
                    return get_store().find_attribute_user(DATEVALIDFROM$8) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDFROM$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDFROM$8);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDFROM$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDFROM$8);
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
                    get_store().remove_attribute(DATEVALIDFROM$8);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$10);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$10);
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
                    return get_store().find_attribute_user(DATEVALIDTO$10) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEVALIDTO$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEVALIDTO$10);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(DATEVALIDTO$10);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(DATEVALIDTO$10);
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
                    get_store().remove_attribute(DATEVALIDTO$10);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$12);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$12);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$12) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$12);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$12);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$12);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$12);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$12);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$14);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$14);
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
                    return get_store().find_attribute_user(VALIDFROM$14) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$14);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$14);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$14);
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
                    get_store().remove_attribute(VALIDFROM$14);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$16);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$16);
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
                    return get_store().find_attribute_user(VALIDTO$16) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$16);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$16);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$16);
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
                    get_store().remove_attribute(VALIDTO$16);
                }
            }
            /**
             * An XML MembershipElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.MembershipsDocument$Memberships$Membership$MembershipElement.
             */
            public static class MembershipElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.MembershipElement
            {
                private static final long serialVersionUID = 1L;
                
                public MembershipElementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected MembershipElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName TYPE$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
                
                
                /**
                 * Gets the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.MembershipElementList.Enum getType()
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
                      return (oasisNamesTcCiqXpil3.MembershipElementList.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.MembershipElementList xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.MembershipElementList target = null;
                      target = (oasisNamesTcCiqXpil3.MembershipElementList)get_store().find_attribute_user(TYPE$0);
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
                public void setType(oasisNamesTcCiqXpil3.MembershipElementList.Enum type)
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
                public void xsetType(oasisNamesTcCiqXpil3.MembershipElementList type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.MembershipElementList target = null;
                      target = (oasisNamesTcCiqXpil3.MembershipElementList)get_store().find_attribute_user(TYPE$0);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXpil3.MembershipElementList)get_store().add_attribute_user(TYPE$0);
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
             * An XML Organisation(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is a complex type.
             */
            public static class OrganisationImpl extends oasisNamesTcCiqXnl3.impl.OrganisationNameTypeImpl implements oasisNamesTcCiqXpil3.MembershipsDocument.Memberships.Membership.Organisation
            {
                private static final long serialVersionUID = 1L;
                
                public OrganisationImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
        }
    }
}
