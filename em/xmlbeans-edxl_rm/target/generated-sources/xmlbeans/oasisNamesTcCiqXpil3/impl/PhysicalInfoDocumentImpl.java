/*
 * An XML document type.
 * Localname: PhysicalInfo
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.PhysicalInfoDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3.impl;
/**
 * A document containing one PhysicalInfo(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public class PhysicalInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.PhysicalInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public PhysicalInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHYSICALINFO$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "PhysicalInfo");
    
    
    /**
     * Gets the "PhysicalInfo" element
     */
    public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo getPhysicalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo target = null;
            target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo)get_store().find_element_user(PHYSICALINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PhysicalInfo" element
     */
    public void setPhysicalInfo(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo physicalInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo target = null;
            target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo)get_store().find_element_user(PHYSICALINFO$0, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo)get_store().add_element_user(PHYSICALINFO$0);
            }
            target.set(physicalInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "PhysicalInfo" element
     */
    public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo addNewPhysicalInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo target = null;
            target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo)get_store().add_element_user(PHYSICALINFO$0);
            return target;
        }
    }
    /**
     * An XML PhysicalInfo(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public static class PhysicalInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo
    {
        private static final long serialVersionUID = 1L;
        
        public PhysicalInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FREETEXTLINE$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "FreeTextLine");
        private static final javax.xml.namespace.QName FEATURE$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Feature");
        private static final javax.xml.namespace.QName BODYMARK$4 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "BodyMark");
        private static final javax.xml.namespace.QName DISABILITY$6 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Disability");
        private static final javax.xml.namespace.QName ALLERGY$8 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Allergy");
        private static final javax.xml.namespace.QName HEALTHCONDITION$10 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "HealthCondition");
        private static final javax.xml.namespace.QName BLOODGROUP$12 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "BloodGroup");
        private static final javax.xml.namespace.QName DATAQUALITYTYPE$14 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
        private static final javax.xml.namespace.QName VALIDFROM$16 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
        private static final javax.xml.namespace.QName VALIDTO$18 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
        
        
        /**
         * Gets array of all "FreeTextLine" elements
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine[] getFreeTextLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FREETEXTLINE$0, targetList);
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine[] result = new oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "FreeTextLine" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine getFreeTextLineArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine)get_store().find_element_user(FREETEXTLINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "FreeTextLine" element
         */
        public int sizeOfFreeTextLineArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FREETEXTLINE$0);
            }
        }
        
        /**
         * Sets array of all "FreeTextLine" element
         */
        public void setFreeTextLineArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine[] freeTextLineArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(freeTextLineArray, FREETEXTLINE$0);
            }
        }
        
        /**
         * Sets ith "FreeTextLine" element
         */
        public void setFreeTextLineArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine freeTextLine)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine)get_store().find_element_user(FREETEXTLINE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(freeTextLine);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "FreeTextLine" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine insertNewFreeTextLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine)get_store().insert_element_user(FREETEXTLINE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "FreeTextLine" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine addNewFreeTextLine()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine)get_store().add_element_user(FREETEXTLINE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "FreeTextLine" element
         */
        public void removeFreeTextLine(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FREETEXTLINE$0, i);
            }
        }
        
        /**
         * Gets array of all "Feature" elements
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature[] getFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FEATURE$2, targetList);
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature[] result = new oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Feature" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature getFeatureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature)get_store().find_element_user(FEATURE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Feature" element
         */
        public int sizeOfFeatureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FEATURE$2);
            }
        }
        
        /**
         * Sets array of all "Feature" element
         */
        public void setFeatureArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature[] featureArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(featureArray, FEATURE$2);
            }
        }
        
        /**
         * Sets ith "Feature" element
         */
        public void setFeatureArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature feature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature)get_store().find_element_user(FEATURE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(feature);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Feature" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature insertNewFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature)get_store().insert_element_user(FEATURE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Feature" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature addNewFeature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature)get_store().add_element_user(FEATURE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "Feature" element
         */
        public void removeFeature(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FEATURE$2, i);
            }
        }
        
        /**
         * Gets array of all "BodyMark" elements
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark[] getBodyMarkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BODYMARK$4, targetList);
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark[] result = new oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BodyMark" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark getBodyMarkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark)get_store().find_element_user(BODYMARK$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BodyMark" element
         */
        public int sizeOfBodyMarkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BODYMARK$4);
            }
        }
        
        /**
         * Sets array of all "BodyMark" element
         */
        public void setBodyMarkArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark[] bodyMarkArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(bodyMarkArray, BODYMARK$4);
            }
        }
        
        /**
         * Sets ith "BodyMark" element
         */
        public void setBodyMarkArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark bodyMark)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark)get_store().find_element_user(BODYMARK$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(bodyMark);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BodyMark" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark insertNewBodyMark(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark)get_store().insert_element_user(BODYMARK$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BodyMark" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark addNewBodyMark()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark)get_store().add_element_user(BODYMARK$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "BodyMark" element
         */
        public void removeBodyMark(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BODYMARK$4, i);
            }
        }
        
        /**
         * Gets array of all "Disability" elements
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability[] getDisabilityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DISABILITY$6, targetList);
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability[] result = new oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Disability" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability getDisabilityArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability)get_store().find_element_user(DISABILITY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Disability" element
         */
        public int sizeOfDisabilityArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISABILITY$6);
            }
        }
        
        /**
         * Sets array of all "Disability" element
         */
        public void setDisabilityArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability[] disabilityArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(disabilityArray, DISABILITY$6);
            }
        }
        
        /**
         * Sets ith "Disability" element
         */
        public void setDisabilityArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability disability)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability)get_store().find_element_user(DISABILITY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(disability);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Disability" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability insertNewDisability(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability)get_store().insert_element_user(DISABILITY$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Disability" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability addNewDisability()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability)get_store().add_element_user(DISABILITY$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "Disability" element
         */
        public void removeDisability(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISABILITY$6, i);
            }
        }
        
        /**
         * Gets array of all "Allergy" elements
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy[] getAllergyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ALLERGY$8, targetList);
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy[] result = new oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Allergy" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy getAllergyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy)get_store().find_element_user(ALLERGY$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Allergy" element
         */
        public int sizeOfAllergyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ALLERGY$8);
            }
        }
        
        /**
         * Sets array of all "Allergy" element
         */
        public void setAllergyArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy[] allergyArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(allergyArray, ALLERGY$8);
            }
        }
        
        /**
         * Sets ith "Allergy" element
         */
        public void setAllergyArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy allergy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy)get_store().find_element_user(ALLERGY$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(allergy);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Allergy" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy insertNewAllergy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy)get_store().insert_element_user(ALLERGY$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Allergy" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy addNewAllergy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy)get_store().add_element_user(ALLERGY$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "Allergy" element
         */
        public void removeAllergy(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ALLERGY$8, i);
            }
        }
        
        /**
         * Gets array of all "HealthCondition" elements
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition[] getHealthConditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(HEALTHCONDITION$10, targetList);
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition[] result = new oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "HealthCondition" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition getHealthConditionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition)get_store().find_element_user(HEALTHCONDITION$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "HealthCondition" element
         */
        public int sizeOfHealthConditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEALTHCONDITION$10);
            }
        }
        
        /**
         * Sets array of all "HealthCondition" element
         */
        public void setHealthConditionArray(oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition[] healthConditionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(healthConditionArray, HEALTHCONDITION$10);
            }
        }
        
        /**
         * Sets ith "HealthCondition" element
         */
        public void setHealthConditionArray(int i, oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition healthCondition)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition)get_store().find_element_user(HEALTHCONDITION$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(healthCondition);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "HealthCondition" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition insertNewHealthCondition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition)get_store().insert_element_user(HEALTHCONDITION$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "HealthCondition" element
         */
        public oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition addNewHealthCondition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition target = null;
                target = (oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition)get_store().add_element_user(HEALTHCONDITION$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "HealthCondition" element
         */
        public void removeHealthCondition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEALTHCONDITION$10, i);
            }
        }
        
        /**
         * Gets the "BloodGroup" attribute
         */
        public oasisNamesTcCiqXpil3.BloodGroupList.Enum getBloodGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOODGROUP$12);
                if (target == null)
                {
                    return null;
                }
                return (oasisNamesTcCiqXpil3.BloodGroupList.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "BloodGroup" attribute
         */
        public oasisNamesTcCiqXpil3.BloodGroupList xgetBloodGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.BloodGroupList target = null;
                target = (oasisNamesTcCiqXpil3.BloodGroupList)get_store().find_attribute_user(BLOODGROUP$12);
                return target;
            }
        }
        
        /**
         * True if has "BloodGroup" attribute
         */
        public boolean isSetBloodGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(BLOODGROUP$12) != null;
            }
        }
        
        /**
         * Sets the "BloodGroup" attribute
         */
        public void setBloodGroup(oasisNamesTcCiqXpil3.BloodGroupList.Enum bloodGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BLOODGROUP$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BLOODGROUP$12);
                }
                target.setEnumValue(bloodGroup);
            }
        }
        
        /**
         * Sets (as xml) the "BloodGroup" attribute
         */
        public void xsetBloodGroup(oasisNamesTcCiqXpil3.BloodGroupList bloodGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                oasisNamesTcCiqXpil3.BloodGroupList target = null;
                target = (oasisNamesTcCiqXpil3.BloodGroupList)get_store().find_attribute_user(BLOODGROUP$12);
                if (target == null)
                {
                    target = (oasisNamesTcCiqXpil3.BloodGroupList)get_store().add_attribute_user(BLOODGROUP$12);
                }
                target.set(bloodGroup);
            }
        }
        
        /**
         * Unsets the "BloodGroup" attribute
         */
        public void unsetBloodGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(BLOODGROUP$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$14);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$14);
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
                return get_store().find_attribute_user(DATAQUALITYTYPE$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$14);
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
                target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$14);
                if (target == null)
                {
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$14);
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
                get_store().remove_attribute(DATAQUALITYTYPE$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$16);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$16);
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
                return get_store().find_attribute_user(VALIDFROM$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$16);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$16);
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
                get_store().remove_attribute(VALIDFROM$16);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$18);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$18);
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
                return get_store().find_attribute_user(VALIDTO$18) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$18);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$18);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$18);
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
                get_store().remove_attribute(VALIDTO$18);
            }
        }
        /**
         * An XML FreeTextLine(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$FreeTextLine.
         */
        public static class FreeTextLineImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.FreeTextLine
        {
            private static final long serialVersionUID = 1L;
            
            public FreeTextLineImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected FreeTextLineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "Type" attribute
             */
            public java.lang.String getType()
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
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.PhysicalInfoFreeTextTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.PhysicalInfoFreeTextTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.PhysicalInfoFreeTextTypeList)get_store().find_attribute_user(TYPE$0);
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
            public void setType(java.lang.String type)
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
                    target.setStringValue(type);
                }
            }
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            public void xsetType(oasisNamesTcCiqXpil3.PhysicalInfoFreeTextTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.PhysicalInfoFreeTextTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.PhysicalInfoFreeTextTypeList)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.PhysicalInfoFreeTextTypeList)get_store().add_attribute_user(TYPE$0);
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
            
            /**
             * Gets the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$2);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$2);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
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
                    return get_store().find_attribute_user(VALIDFROM$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$4);
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
                    get_store().remove_attribute(VALIDFROM$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
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
                    return get_store().find_attribute_user(VALIDTO$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$6);
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
                    get_store().remove_attribute(VALIDTO$6);
                }
            }
        }
        /**
         * An XML Feature(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$Feature.
         */
        public static class FeatureImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Feature
        {
            private static final long serialVersionUID = 1L;
            
            public FeatureImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected FeatureImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Type");
            private static final javax.xml.namespace.QName UNITTYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "UnitType");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.FeatureTypeList.Enum getType()
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
                    return (oasisNamesTcCiqXpil3.FeatureTypeList.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            public oasisNamesTcCiqXpil3.FeatureTypeList xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.FeatureTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.FeatureTypeList)get_store().find_attribute_user(TYPE$0);
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
            public void setType(oasisNamesTcCiqXpil3.FeatureTypeList.Enum type)
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
            public void xsetType(oasisNamesTcCiqXpil3.FeatureTypeList type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.FeatureTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.FeatureTypeList)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.FeatureTypeList)get_store().add_attribute_user(TYPE$0);
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
            
            /**
             * Gets the "UnitType" attribute
             */
            public java.lang.String getUnitType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITTYPE$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "UnitType" attribute
             */
            public oasisNamesTcCiqXpil3.UnitTypeList xgetUnitType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.UnitTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.UnitTypeList)get_store().find_attribute_user(UNITTYPE$2);
                    return target;
                }
            }
            
            /**
             * True if has "UnitType" attribute
             */
            public boolean isSetUnitType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(UNITTYPE$2) != null;
                }
            }
            
            /**
             * Sets the "UnitType" attribute
             */
            public void setUnitType(java.lang.String unitType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITTYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNITTYPE$2);
                    }
                    target.setStringValue(unitType);
                }
            }
            
            /**
             * Sets (as xml) the "UnitType" attribute
             */
            public void xsetUnitType(oasisNamesTcCiqXpil3.UnitTypeList unitType)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.UnitTypeList target = null;
                    target = (oasisNamesTcCiqXpil3.UnitTypeList)get_store().find_attribute_user(UNITTYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.UnitTypeList)get_store().add_attribute_user(UNITTYPE$2);
                    }
                    target.set(unitType);
                }
            }
            
            /**
             * Unsets the "UnitType" attribute
             */
            public void unsetUnitType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(UNITTYPE$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$4);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$4);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
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
                    return get_store().find_attribute_user(VALIDFROM$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$6);
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
                    get_store().remove_attribute(VALIDFROM$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
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
                    return get_store().find_attribute_user(VALIDTO$8) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$8);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$8);
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
                    get_store().remove_attribute(VALIDTO$8);
                }
            }
        }
        /**
         * An XML BodyMark(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$BodyMark.
         */
        public static class BodyMarkImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.BodyMark
        {
            private static final long serialVersionUID = 1L;
            
            public BodyMarkImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected BodyMarkImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName PART$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Part");
            private static final javax.xml.namespace.QName LOCATION$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Location");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$8 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "Part" attribute
             */
            public java.lang.String getPart()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PART$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Part" attribute
             */
            public oasisNamesTcCiqXpil3.BodyMarkPartList xgetPart()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.BodyMarkPartList target = null;
                    target = (oasisNamesTcCiqXpil3.BodyMarkPartList)get_store().find_attribute_user(PART$0);
                    return target;
                }
            }
            
            /**
             * True if has "Part" attribute
             */
            public boolean isSetPart()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(PART$0) != null;
                }
            }
            
            /**
             * Sets the "Part" attribute
             */
            public void setPart(java.lang.String part)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PART$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PART$0);
                    }
                    target.setStringValue(part);
                }
            }
            
            /**
             * Sets (as xml) the "Part" attribute
             */
            public void xsetPart(oasisNamesTcCiqXpil3.BodyMarkPartList part)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.BodyMarkPartList target = null;
                    target = (oasisNamesTcCiqXpil3.BodyMarkPartList)get_store().find_attribute_user(PART$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.BodyMarkPartList)get_store().add_attribute_user(PART$0);
                    }
                    target.set(part);
                }
            }
            
            /**
             * Unsets the "Part" attribute
             */
            public void unsetPart()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(PART$0);
                }
            }
            
            /**
             * Gets the "Location" attribute
             */
            public java.lang.String getLocation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Location" attribute
             */
            public oasisNamesTcCiqXpil3.BodyMarkPartLocationList xgetLocation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.BodyMarkPartLocationList target = null;
                    target = (oasisNamesTcCiqXpil3.BodyMarkPartLocationList)get_store().find_attribute_user(LOCATION$2);
                    return target;
                }
            }
            
            /**
             * True if has "Location" attribute
             */
            public boolean isSetLocation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LOCATION$2) != null;
                }
            }
            
            /**
             * Sets the "Location" attribute
             */
            public void setLocation(java.lang.String location)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATION$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATION$2);
                    }
                    target.setStringValue(location);
                }
            }
            
            /**
             * Sets (as xml) the "Location" attribute
             */
            public void xsetLocation(oasisNamesTcCiqXpil3.BodyMarkPartLocationList location)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.BodyMarkPartLocationList target = null;
                    target = (oasisNamesTcCiqXpil3.BodyMarkPartLocationList)get_store().find_attribute_user(LOCATION$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.BodyMarkPartLocationList)get_store().add_attribute_user(LOCATION$2);
                    }
                    target.set(location);
                }
            }
            
            /**
             * Unsets the "Location" attribute
             */
            public void unsetLocation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LOCATION$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$4);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$4);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$4);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
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
                    return get_store().find_attribute_user(VALIDFROM$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$6);
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
                    get_store().remove_attribute(VALIDFROM$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
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
                    return get_store().find_attribute_user(VALIDTO$8) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$8);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$8);
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
                    get_store().remove_attribute(VALIDTO$8);
                }
            }
        }
        /**
         * An XML Disability(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$Disability.
         */
        public static class DisabilityImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Disability
        {
            private static final long serialVersionUID = 1L;
            
            public DisabilityImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected DisabilityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName CAUSE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xpil:3", "Cause");
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$6 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "Cause" attribute
             */
            public java.lang.String getCause()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAUSE$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Cause" attribute
             */
            public oasisNamesTcCiqXpil3.DisabilityCauseList xgetCause()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DisabilityCauseList target = null;
                    target = (oasisNamesTcCiqXpil3.DisabilityCauseList)get_store().find_attribute_user(CAUSE$0);
                    return target;
                }
            }
            
            /**
             * True if has "Cause" attribute
             */
            public boolean isSetCause()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(CAUSE$0) != null;
                }
            }
            
            /**
             * Sets the "Cause" attribute
             */
            public void setCause(java.lang.String cause)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAUSE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAUSE$0);
                    }
                    target.setStringValue(cause);
                }
            }
            
            /**
             * Sets (as xml) the "Cause" attribute
             */
            public void xsetCause(oasisNamesTcCiqXpil3.DisabilityCauseList cause)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    oasisNamesTcCiqXpil3.DisabilityCauseList target = null;
                    target = (oasisNamesTcCiqXpil3.DisabilityCauseList)get_store().find_attribute_user(CAUSE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqXpil3.DisabilityCauseList)get_store().add_attribute_user(CAUSE$0);
                    }
                    target.set(cause);
                }
            }
            
            /**
             * Unsets the "Cause" attribute
             */
            public void unsetCause()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(CAUSE$0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$2);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$2);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$2);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
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
                    return get_store().find_attribute_user(VALIDFROM$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$4);
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
                    get_store().remove_attribute(VALIDFROM$4);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
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
                    return get_store().find_attribute_user(VALIDTO$6) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$6);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$6);
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
                    get_store().remove_attribute(VALIDTO$6);
                }
            }
        }
        /**
         * An XML Allergy(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$Allergy.
         */
        public static class AllergyImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.Allergy
        {
            private static final long serialVersionUID = 1L;
            
            public AllergyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected AllergyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$0);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$0);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$0) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$0);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$0);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$2);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$2);
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
                    return get_store().find_attribute_user(VALIDFROM$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$2);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$2);
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
                    get_store().remove_attribute(VALIDFROM$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$4);
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
                    return get_store().find_attribute_user(VALIDTO$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$4);
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
                    get_store().remove_attribute(VALIDTO$4);
                }
            }
        }
        /**
         * An XML HealthCondition(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.PhysicalInfoDocument$PhysicalInfo$HealthCondition.
         */
        public static class HealthConditionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXpil3.PhysicalInfoDocument.PhysicalInfo.HealthCondition
        {
            private static final long serialVersionUID = 1L;
            
            public HealthConditionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, true);
            }
            
            protected HealthConditionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
            
            private static final javax.xml.namespace.QName DATAQUALITYTYPE$0 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "DataQualityType");
            private static final javax.xml.namespace.QName VALIDFROM$2 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidFrom");
            private static final javax.xml.namespace.QName VALIDTO$4 = 
                new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "ValidTo");
            
            
            /**
             * Gets the "DataQualityType" attribute
             */
            public oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$0);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$0);
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
                    return get_store().find_attribute_user(DATAQUALITYTYPE$0) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATAQUALITYTYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATAQUALITYTYPE$0);
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
                    target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().find_attribute_user(DATAQUALITYTYPE$0);
                    if (target == null)
                    {
                      target = (oasisNamesTcCiqCt3.DataQualityTypeList)get_store().add_attribute_user(DATAQUALITYTYPE$0);
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
                    get_store().remove_attribute(DATAQUALITYTYPE$0);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$2);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$2);
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
                    return get_store().find_attribute_user(VALIDFROM$2) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDFROM$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDFROM$2);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDFROM$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDFROM$2);
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
                    get_store().remove_attribute(VALIDFROM$2);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$4);
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
                    return get_store().find_attribute_user(VALIDTO$4) != null;
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTO$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTO$4);
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
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_attribute_user(VALIDTO$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_attribute_user(VALIDTO$4);
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
                    get_store().remove_attribute(VALIDTO$4);
                }
            }
        }
    }
}
