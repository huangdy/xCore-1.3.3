/*
 * An XML document type.
 * Localname: Occupations
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.OccupationsDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one Occupations(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class OccupationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.OccupationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public OccupationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OCCUPATIONS$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Occupations");
    
    
    /**
     * Gets the "Occupations" element
     */
    public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations getOccupations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OccupationsDocument.Occupations target = null;
            target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations)get_store().find_element_user(OCCUPATIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Occupations" element
     */
    public void setOccupations(oasisNamesTcCiqXpil3.OccupationsDocument.Occupations occupations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OccupationsDocument.Occupations target = null;
            target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations)get_store().find_element_user(OCCUPATIONS$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations)get_store().add_element_user(OCCUPATIONS$0);
            }
            target.set(occupations);
        }
    }
    
    /**
     * Appends and returns a new empty "Occupations" element
     */
    public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations addNewOccupations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.OccupationsDocument.Occupations target = null;
            target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations)get_store().add_element_user(OCCUPATIONS$0);
            return target;
        }
    }
    /**
     * An XML Occupations(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class OccupationsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.OccupationsDocument.Occupations
    {
        private static final long serialVersionUID = 1L;
        
        public OccupationsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OCCUPATION$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Occupation");
        
        
        /**
         * Gets array of all "Occupation" elements
         */
        public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation[] getOccupationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OCCUPATION$0, targetList);
                oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation[] result = new oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Occupation" element
         */
        public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation getOccupationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation target = null;
                target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation)get_store().find_element_user(OCCUPATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Occupation" element
         */
        public int sizeOfOccupationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OCCUPATION$0);
            }
        }
        
        /**
         * Sets array of all "Occupation" element
         */
        public void setOccupationArray(oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation[] occupationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(occupationArray, OCCUPATION$0);
            }
        }
        
        /**
         * Sets ith "Occupation" element
         */
        public void setOccupationArray(int i, oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation occupation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation target = null;
                target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation)get_store().find_element_user(OCCUPATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(occupation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Occupation" element
         */
        public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation insertNewOccupation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation target = null;
                target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation)get_store().insert_element_user(OCCUPATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Occupation" element
         */
        public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation addNewOccupation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation target = null;
                target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation)get_store().add_element_user(OCCUPATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Occupation" element
         */
        public void removeOccupation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OCCUPATION$0, i);
            }
        }
        /**
         * An XML Occupation(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public static class OccupationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation
        {
            private static final long serialVersionUID = 1L;
            
            public OccupationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName OCCUPATIONELEMENT$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "OccupationElement");
            private static final javax.xml.namespace.QName EMPLOYER$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Employer");
            private static final javax.xml.namespace.QName ISSELFEMPLOYED$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "isSelfEmployed");
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
             * Gets array of all "OccupationElement" elements
             */
            public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement[] getOccupationElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(OCCUPATIONELEMENT$0, targetList);
                    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement[] result = new oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "OccupationElement" element
             */
            public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement getOccupationElementArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement target = null;
                    target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement)get_store().find_element_user(OCCUPATIONELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "OccupationElement" element
             */
            public int sizeOfOccupationElementArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(OCCUPATIONELEMENT$0);
                }
            }
            
            /**
             * Sets array of all "OccupationElement" element
             */
            public void setOccupationElementArray(oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement[] occupationElementArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(occupationElementArray, OCCUPATIONELEMENT$0);
                }
            }
            
            /**
             * Sets ith "OccupationElement" element
             */
            public void setOccupationElementArray(int i, oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement occupationElement)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement target = null;
                    target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement)get_store().find_element_user(OCCUPATIONELEMENT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(occupationElement);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "OccupationElement" element
             */
            public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement insertNewOccupationElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement target = null;
                    target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement)get_store().insert_element_user(OCCUPATIONELEMENT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "OccupationElement" element
             */
            public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement addNewOccupationElement()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement target = null;
                    target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement)get_store().add_element_user(OCCUPATIONELEMENT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "OccupationElement" element
             */
            public void removeOccupationElement(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(OCCUPATIONELEMENT$0, i);
                }
            }
            
            /**
             * Gets the "Employer" element
             */
            public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer getEmployer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer target = null;
                    target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer)get_store().find_element_user(EMPLOYER$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Employer" element
             */
            public boolean isSetEmployer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EMPLOYER$2) != 0;
                }
            }
            
            /**
             * Sets the "Employer" element
             */
            public void setEmployer(oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer employer)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer target = null;
                    target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer)get_store().find_element_user(EMPLOYER$2, 0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer)get_store().add_element_user(EMPLOYER$2);
                    }
                    target.set(employer);
                }
            }
            
            /**
             * Appends and returns a new empty "Employer" element
             */
            public oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer addNewEmployer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer target = null;
                    target = (oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer)get_store().add_element_user(EMPLOYER$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "Employer" element
             */
            public void unsetEmployer()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EMPLOYER$2, 0);
                }
            }
            
            /**
             * Gets the "isSelfEmployed" attribute
             */
            public boolean getIsSelfEmployed()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSELFEMPLOYED$4);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "isSelfEmployed" attribute
             */
            public org.apache.xmlbeans.XmlBoolean xgetIsSelfEmployed()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSELFEMPLOYED$4);
                    return target;
                }
            }
            
            /**
             * True if has "isSelfEmployed" attribute
             */
            public boolean isSetIsSelfEmployed()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ISSELFEMPLOYED$4) != null;
                }
            }
            
            /**
             * Sets the "isSelfEmployed" attribute
             */
            public void setIsSelfEmployed(boolean isSelfEmployed)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISSELFEMPLOYED$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISSELFEMPLOYED$4);
                    }
                    target.setBooleanValue(isSelfEmployed);
                }
            }
            
            /**
             * Sets (as xml) the "isSelfEmployed" attribute
             */
            public void xsetIsSelfEmployed(org.apache.xmlbeans.XmlBoolean isSelfEmployed)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISSELFEMPLOYED$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISSELFEMPLOYED$4);
                    }
                    target.set(isSelfEmployed);
                }
            }
            
            /**
             * Unsets the "isSelfEmployed" attribute
             */
            public void unsetIsSelfEmployed()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ISSELFEMPLOYED$4);
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
             * An XML OccupationElement(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.OccupationsDocument$Occupations$Occupation$OccupationElement.
             */
            public static class OccupationElementImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.OccupationElement
            {
                private static final long serialVersionUID = 1L;
                
                public OccupationElementImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, true);
                }
                
                protected OccupationElementImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
                
                private static final javax.xml.namespace.QName TYPE$0 = 
                    new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
                
                
                /**
                 * Gets the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.OccupationElementList.Enum getType()
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
                      return (oasisNamesTcCiqXpil3.OccupationElementList.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Type" attribute
                 */
                public oasisNamesTcCiqXpil3.OccupationElementList xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.OccupationElementList target = null;
                      target = (oasisNamesTcCiqXpil3.OccupationElementList)get_store().find_attribute_user(TYPE$0);
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
                public void setType(oasisNamesTcCiqXpil3.OccupationElementList.Enum type)
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
                public void xsetType(oasisNamesTcCiqXpil3.OccupationElementList type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      oasisNamesTcCiqXpil3.OccupationElementList target = null;
                      target = (oasisNamesTcCiqXpil3.OccupationElementList)get_store().find_attribute_user(TYPE$0);
                      if (target == null)
                      {
                        target = (oasisNamesTcCiqXpil3.OccupationElementList)get_store().add_attribute_user(TYPE$0);
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
             * An XML Employer(@urn:oasis:names:tc:ciq:xpil:3).
             *
             * This is a complex type.
             */
            public static class EmployerImpl extends oasisNamesTcCiqXnl3.impl.OrganisationNameTypeImpl implements oasisNamesTcCiqXpil3.OccupationsDocument.Occupations.Occupation.Employer
            {
                private static final long serialVersionUID = 1L;
                
                public EmployerImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                
            }
        }
    }
}
