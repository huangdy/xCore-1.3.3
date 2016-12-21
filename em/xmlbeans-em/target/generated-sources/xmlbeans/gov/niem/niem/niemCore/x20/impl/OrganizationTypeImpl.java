/*
 * XML Type:  OrganizationType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.OrganizationType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML OrganizationType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class OrganizationTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.OrganizationType
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONABBREVIATIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationAbbreviationText");
    private static final javax.xml.namespace.QName ORGANIZATIONACTIVITYTEXT$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationActivityText");
    private static final javax.xml.namespace.QName ORGANIZATIONDESCRIPTIONTEXT$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationDescriptionText");
    private static final javax.xml.namespace.QName ORGANIZATIONEMERGENCYCONTACTINFORMATION$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationEmergencyContactInformation");
    private static final javax.xml.namespace.QName ORGANIZATIONIDENTIFICATION$8 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationIdentification");
    private static final javax.xml.namespace.QName ORGANIZATIONLOCATION$10 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationLocation");
    private static final javax.xml.namespace.QName ORGANIZATIONNAME$12 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationName");
    private static final javax.xml.namespace.QName ORGANIZATIONPARENT$14 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationParent");
    private static final javax.xml.namespace.QName ORGANIZATIONPRIMARYCONTACTINFORMATION$16 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationPrimaryContactInformation");
    private static final javax.xml.namespace.QName ORGANIZATIONPRINCIPALOFFICIAL$18 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationPrincipalOfficial");
    private static final javax.xml.namespace.QName ORGANIZATIONSTATUS$20 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationStatus");
    private static final javax.xml.namespace.QName ORGANIZATIONSUBUNIT$22 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationSubUnit");
    private static final javax.xml.namespace.QName ORGANIZATIONSUBUNITNAME$24 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationSubUnitName");
    private static final javax.xml.namespace.QName ORGANIZATIONTAXIDENTIFICATION$26 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "OrganizationTaxIdentification");
    
    
    /**
     * Gets array of all "OrganizationAbbreviationText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getOrganizationAbbreviationTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONABBREVIATIONTEXT$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationAbbreviationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getOrganizationAbbreviationTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONABBREVIATIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationAbbreviationText" element
     */
    public boolean isNilOrganizationAbbreviationTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONABBREVIATIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationAbbreviationText" element
     */
    public int sizeOfOrganizationAbbreviationTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONABBREVIATIONTEXT$0);
        }
    }
    
    /**
     * Sets array of all "OrganizationAbbreviationText" element
     */
    public void setOrganizationAbbreviationTextArray(gov.niem.niem.niemCore.x20.TextType[] organizationAbbreviationTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationAbbreviationTextArray, ORGANIZATIONABBREVIATIONTEXT$0);
        }
    }
    
    /**
     * Sets ith "OrganizationAbbreviationText" element
     */
    public void setOrganizationAbbreviationTextArray(int i, gov.niem.niem.niemCore.x20.TextType organizationAbbreviationText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONABBREVIATIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationAbbreviationText);
        }
    }
    
    /**
     * Nils the ith "OrganizationAbbreviationText" element
     */
    public void setNilOrganizationAbbreviationTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONABBREVIATIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationAbbreviationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewOrganizationAbbreviationText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ORGANIZATIONABBREVIATIONTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationAbbreviationText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewOrganizationAbbreviationText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONABBREVIATIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationAbbreviationText" element
     */
    public void removeOrganizationAbbreviationText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONABBREVIATIONTEXT$0, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationActivityText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getOrganizationActivityTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONACTIVITYTEXT$2, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationActivityText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getOrganizationActivityTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONACTIVITYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationActivityText" element
     */
    public boolean isNilOrganizationActivityTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONACTIVITYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationActivityText" element
     */
    public int sizeOfOrganizationActivityTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONACTIVITYTEXT$2);
        }
    }
    
    /**
     * Sets array of all "OrganizationActivityText" element
     */
    public void setOrganizationActivityTextArray(gov.niem.niem.niemCore.x20.TextType[] organizationActivityTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationActivityTextArray, ORGANIZATIONACTIVITYTEXT$2);
        }
    }
    
    /**
     * Sets ith "OrganizationActivityText" element
     */
    public void setOrganizationActivityTextArray(int i, gov.niem.niem.niemCore.x20.TextType organizationActivityText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONACTIVITYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationActivityText);
        }
    }
    
    /**
     * Nils the ith "OrganizationActivityText" element
     */
    public void setNilOrganizationActivityTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONACTIVITYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationActivityText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewOrganizationActivityText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ORGANIZATIONACTIVITYTEXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationActivityText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewOrganizationActivityText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONACTIVITYTEXT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationActivityText" element
     */
    public void removeOrganizationActivityText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONACTIVITYTEXT$2, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getOrganizationDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONDESCRIPTIONTEXT$4, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getOrganizationDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationDescriptionText" element
     */
    public boolean isNilOrganizationDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationDescriptionText" element
     */
    public int sizeOfOrganizationDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONDESCRIPTIONTEXT$4);
        }
    }
    
    /**
     * Sets array of all "OrganizationDescriptionText" element
     */
    public void setOrganizationDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] organizationDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationDescriptionTextArray, ORGANIZATIONDESCRIPTIONTEXT$4);
        }
    }
    
    /**
     * Sets ith "OrganizationDescriptionText" element
     */
    public void setOrganizationDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType organizationDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationDescriptionText);
        }
    }
    
    /**
     * Nils the ith "OrganizationDescriptionText" element
     */
    public void setNilOrganizationDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewOrganizationDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ORGANIZATIONDESCRIPTIONTEXT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewOrganizationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONDESCRIPTIONTEXT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationDescriptionText" element
     */
    public void removeOrganizationDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONDESCRIPTIONTEXT$4, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationEmergencyContactInformation" elements
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType[] getOrganizationEmergencyContactInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONEMERGENCYCONTACTINFORMATION$6, targetList);
            gov.niem.niem.niemCore.x20.ContactInformationType[] result = new gov.niem.niem.niemCore.x20.ContactInformationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationEmergencyContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType getOrganizationEmergencyContactInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationEmergencyContactInformation" element
     */
    public boolean isNilOrganizationEmergencyContactInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationEmergencyContactInformation" element
     */
    public int sizeOfOrganizationEmergencyContactInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONEMERGENCYCONTACTINFORMATION$6);
        }
    }
    
    /**
     * Sets array of all "OrganizationEmergencyContactInformation" element
     */
    public void setOrganizationEmergencyContactInformationArray(gov.niem.niem.niemCore.x20.ContactInformationType[] organizationEmergencyContactInformationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationEmergencyContactInformationArray, ORGANIZATIONEMERGENCYCONTACTINFORMATION$6);
        }
    }
    
    /**
     * Sets ith "OrganizationEmergencyContactInformation" element
     */
    public void setOrganizationEmergencyContactInformationArray(int i, gov.niem.niem.niemCore.x20.ContactInformationType organizationEmergencyContactInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationEmergencyContactInformation);
        }
    }
    
    /**
     * Nils the ith "OrganizationEmergencyContactInformation" element
     */
    public void setNilOrganizationEmergencyContactInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationEmergencyContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType insertNewOrganizationEmergencyContactInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().insert_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationEmergencyContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType addNewOrganizationEmergencyContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().add_element_user(ORGANIZATIONEMERGENCYCONTACTINFORMATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationEmergencyContactInformation" element
     */
    public void removeOrganizationEmergencyContactInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONEMERGENCYCONTACTINFORMATION$6, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationIdentification" elements
     */
    public gov.niem.niem.niemCore.x20.IdentificationType[] getOrganizationIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONIDENTIFICATION$8, targetList);
            gov.niem.niem.niemCore.x20.IdentificationType[] result = new gov.niem.niem.niemCore.x20.IdentificationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType getOrganizationIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONIDENTIFICATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationIdentification" element
     */
    public boolean isNilOrganizationIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONIDENTIFICATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationIdentification" element
     */
    public int sizeOfOrganizationIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONIDENTIFICATION$8);
        }
    }
    
    /**
     * Sets array of all "OrganizationIdentification" element
     */
    public void setOrganizationIdentificationArray(gov.niem.niem.niemCore.x20.IdentificationType[] organizationIdentificationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationIdentificationArray, ORGANIZATIONIDENTIFICATION$8);
        }
    }
    
    /**
     * Sets ith "OrganizationIdentification" element
     */
    public void setOrganizationIdentificationArray(int i, gov.niem.niem.niemCore.x20.IdentificationType organizationIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONIDENTIFICATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationIdentification);
        }
    }
    
    /**
     * Nils the ith "OrganizationIdentification" element
     */
    public void setNilOrganizationIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONIDENTIFICATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType insertNewOrganizationIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().insert_element_user(ORGANIZATIONIDENTIFICATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType addNewOrganizationIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ORGANIZATIONIDENTIFICATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationIdentification" element
     */
    public void removeOrganizationIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONIDENTIFICATION$8, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationLocation" elements
     */
    public gov.niem.niem.niemCore.x20.LocationType[] getOrganizationLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONLOCATION$10, targetList);
            gov.niem.niem.niemCore.x20.LocationType[] result = new gov.niem.niem.niemCore.x20.LocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationLocation" element
     */
    public gov.niem.niem.niemCore.x20.LocationType getOrganizationLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(ORGANIZATIONLOCATION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationLocation" element
     */
    public boolean isNilOrganizationLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(ORGANIZATIONLOCATION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationLocation" element
     */
    public int sizeOfOrganizationLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONLOCATION$10);
        }
    }
    
    /**
     * Sets array of all "OrganizationLocation" element
     */
    public void setOrganizationLocationArray(gov.niem.niem.niemCore.x20.LocationType[] organizationLocationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationLocationArray, ORGANIZATIONLOCATION$10);
        }
    }
    
    /**
     * Sets ith "OrganizationLocation" element
     */
    public void setOrganizationLocationArray(int i, gov.niem.niem.niemCore.x20.LocationType organizationLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(ORGANIZATIONLOCATION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationLocation);
        }
    }
    
    /**
     * Nils the ith "OrganizationLocation" element
     */
    public void setNilOrganizationLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(ORGANIZATIONLOCATION$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationLocation" element
     */
    public gov.niem.niem.niemCore.x20.LocationType insertNewOrganizationLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().insert_element_user(ORGANIZATIONLOCATION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationLocation" element
     */
    public gov.niem.niem.niemCore.x20.LocationType addNewOrganizationLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().add_element_user(ORGANIZATIONLOCATION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationLocation" element
     */
    public void removeOrganizationLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONLOCATION$10, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationName" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getOrganizationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONNAME$12, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationName" element
     */
    public gov.niem.niem.niemCore.x20.TextType getOrganizationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationName" element
     */
    public boolean isNilOrganizationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationName" element
     */
    public int sizeOfOrganizationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONNAME$12);
        }
    }
    
    /**
     * Sets array of all "OrganizationName" element
     */
    public void setOrganizationNameArray(gov.niem.niem.niemCore.x20.TextType[] organizationNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationNameArray, ORGANIZATIONNAME$12);
        }
    }
    
    /**
     * Sets ith "OrganizationName" element
     */
    public void setOrganizationNameArray(int i, gov.niem.niem.niemCore.x20.TextType organizationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationName);
        }
    }
    
    /**
     * Nils the ith "OrganizationName" element
     */
    public void setNilOrganizationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationName" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewOrganizationName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ORGANIZATIONNAME$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationName" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewOrganizationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONNAME$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationName" element
     */
    public void removeOrganizationName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONNAME$12, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationParent" elements
     */
    public org.apache.xmlbeans.XmlObject[] getOrganizationParentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONPARENT$14, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationParent" element
     */
    public org.apache.xmlbeans.XmlObject getOrganizationParentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ORGANIZATIONPARENT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "OrganizationParent" element
     */
    public int sizeOfOrganizationParentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONPARENT$14);
        }
    }
    
    /**
     * Sets array of all "OrganizationParent" element
     */
    public void setOrganizationParentArray(org.apache.xmlbeans.XmlObject[] organizationParentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationParentArray, ORGANIZATIONPARENT$14);
        }
    }
    
    /**
     * Sets ith "OrganizationParent" element
     */
    public void setOrganizationParentArray(int i, org.apache.xmlbeans.XmlObject organizationParent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ORGANIZATIONPARENT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationParent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationParent" element
     */
    public org.apache.xmlbeans.XmlObject insertNewOrganizationParent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ORGANIZATIONPARENT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationParent" element
     */
    public org.apache.xmlbeans.XmlObject addNewOrganizationParent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ORGANIZATIONPARENT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationParent" element
     */
    public void removeOrganizationParent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONPARENT$14, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationPrimaryContactInformation" elements
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType[] getOrganizationPrimaryContactInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONPRIMARYCONTACTINFORMATION$16, targetList);
            gov.niem.niem.niemCore.x20.ContactInformationType[] result = new gov.niem.niem.niemCore.x20.ContactInformationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationPrimaryContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType getOrganizationPrimaryContactInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationPrimaryContactInformation" element
     */
    public boolean isNilOrganizationPrimaryContactInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationPrimaryContactInformation" element
     */
    public int sizeOfOrganizationPrimaryContactInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONPRIMARYCONTACTINFORMATION$16);
        }
    }
    
    /**
     * Sets array of all "OrganizationPrimaryContactInformation" element
     */
    public void setOrganizationPrimaryContactInformationArray(gov.niem.niem.niemCore.x20.ContactInformationType[] organizationPrimaryContactInformationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationPrimaryContactInformationArray, ORGANIZATIONPRIMARYCONTACTINFORMATION$16);
        }
    }
    
    /**
     * Sets ith "OrganizationPrimaryContactInformation" element
     */
    public void setOrganizationPrimaryContactInformationArray(int i, gov.niem.niem.niemCore.x20.ContactInformationType organizationPrimaryContactInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationPrimaryContactInformation);
        }
    }
    
    /**
     * Nils the ith "OrganizationPrimaryContactInformation" element
     */
    public void setNilOrganizationPrimaryContactInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationPrimaryContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType insertNewOrganizationPrimaryContactInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().insert_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationPrimaryContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType addNewOrganizationPrimaryContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().add_element_user(ORGANIZATIONPRIMARYCONTACTINFORMATION$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationPrimaryContactInformation" element
     */
    public void removeOrganizationPrimaryContactInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONPRIMARYCONTACTINFORMATION$16, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationPrincipalOfficial" elements
     */
    public gov.niem.niem.niemCore.x20.PersonType[] getOrganizationPrincipalOfficialArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONPRINCIPALOFFICIAL$18, targetList);
            gov.niem.niem.niemCore.x20.PersonType[] result = new gov.niem.niem.niemCore.x20.PersonType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationPrincipalOfficial" element
     */
    public gov.niem.niem.niemCore.x20.PersonType getOrganizationPrincipalOfficialArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().find_element_user(ORGANIZATIONPRINCIPALOFFICIAL$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationPrincipalOfficial" element
     */
    public boolean isNilOrganizationPrincipalOfficialArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().find_element_user(ORGANIZATIONPRINCIPALOFFICIAL$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationPrincipalOfficial" element
     */
    public int sizeOfOrganizationPrincipalOfficialArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONPRINCIPALOFFICIAL$18);
        }
    }
    
    /**
     * Sets array of all "OrganizationPrincipalOfficial" element
     */
    public void setOrganizationPrincipalOfficialArray(gov.niem.niem.niemCore.x20.PersonType[] organizationPrincipalOfficialArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationPrincipalOfficialArray, ORGANIZATIONPRINCIPALOFFICIAL$18);
        }
    }
    
    /**
     * Sets ith "OrganizationPrincipalOfficial" element
     */
    public void setOrganizationPrincipalOfficialArray(int i, gov.niem.niem.niemCore.x20.PersonType organizationPrincipalOfficial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().find_element_user(ORGANIZATIONPRINCIPALOFFICIAL$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationPrincipalOfficial);
        }
    }
    
    /**
     * Nils the ith "OrganizationPrincipalOfficial" element
     */
    public void setNilOrganizationPrincipalOfficialArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().find_element_user(ORGANIZATIONPRINCIPALOFFICIAL$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationPrincipalOfficial" element
     */
    public gov.niem.niem.niemCore.x20.PersonType insertNewOrganizationPrincipalOfficial(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().insert_element_user(ORGANIZATIONPRINCIPALOFFICIAL$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationPrincipalOfficial" element
     */
    public gov.niem.niem.niemCore.x20.PersonType addNewOrganizationPrincipalOfficial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonType)get_store().add_element_user(ORGANIZATIONPRINCIPALOFFICIAL$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationPrincipalOfficial" element
     */
    public void removeOrganizationPrincipalOfficial(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONPRINCIPALOFFICIAL$18, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationStatus" elements
     */
    public gov.niem.niem.niemCore.x20.StatusType[] getOrganizationStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONSTATUS$20, targetList);
            gov.niem.niem.niemCore.x20.StatusType[] result = new gov.niem.niem.niemCore.x20.StatusType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType getOrganizationStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ORGANIZATIONSTATUS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationStatus" element
     */
    public boolean isNilOrganizationStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ORGANIZATIONSTATUS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationStatus" element
     */
    public int sizeOfOrganizationStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONSTATUS$20);
        }
    }
    
    /**
     * Sets array of all "OrganizationStatus" element
     */
    public void setOrganizationStatusArray(gov.niem.niem.niemCore.x20.StatusType[] organizationStatusArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationStatusArray, ORGANIZATIONSTATUS$20);
        }
    }
    
    /**
     * Sets ith "OrganizationStatus" element
     */
    public void setOrganizationStatusArray(int i, gov.niem.niem.niemCore.x20.StatusType organizationStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ORGANIZATIONSTATUS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationStatus);
        }
    }
    
    /**
     * Nils the ith "OrganizationStatus" element
     */
    public void setNilOrganizationStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ORGANIZATIONSTATUS$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType insertNewOrganizationStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().insert_element_user(ORGANIZATIONSTATUS$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType addNewOrganizationStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().add_element_user(ORGANIZATIONSTATUS$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationStatus" element
     */
    public void removeOrganizationStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONSTATUS$20, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationSubUnit" elements
     */
    public gov.niem.niem.niemCore.x20.OrganizationType[] getOrganizationSubUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONSUBUNIT$22, targetList);
            gov.niem.niem.niemCore.x20.OrganizationType[] result = new gov.niem.niem.niemCore.x20.OrganizationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationSubUnit" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType getOrganizationSubUnitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(ORGANIZATIONSUBUNIT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationSubUnit" element
     */
    public boolean isNilOrganizationSubUnitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(ORGANIZATIONSUBUNIT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationSubUnit" element
     */
    public int sizeOfOrganizationSubUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONSUBUNIT$22);
        }
    }
    
    /**
     * Sets array of all "OrganizationSubUnit" element
     */
    public void setOrganizationSubUnitArray(gov.niem.niem.niemCore.x20.OrganizationType[] organizationSubUnitArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationSubUnitArray, ORGANIZATIONSUBUNIT$22);
        }
    }
    
    /**
     * Sets ith "OrganizationSubUnit" element
     */
    public void setOrganizationSubUnitArray(int i, gov.niem.niem.niemCore.x20.OrganizationType organizationSubUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(ORGANIZATIONSUBUNIT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationSubUnit);
        }
    }
    
    /**
     * Nils the ith "OrganizationSubUnit" element
     */
    public void setNilOrganizationSubUnitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().find_element_user(ORGANIZATIONSUBUNIT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationSubUnit" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType insertNewOrganizationSubUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().insert_element_user(ORGANIZATIONSUBUNIT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationSubUnit" element
     */
    public gov.niem.niem.niemCore.x20.OrganizationType addNewOrganizationSubUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.OrganizationType target = null;
            target = (gov.niem.niem.niemCore.x20.OrganizationType)get_store().add_element_user(ORGANIZATIONSUBUNIT$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationSubUnit" element
     */
    public void removeOrganizationSubUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONSUBUNIT$22, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationSubUnitName" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getOrganizationSubUnitNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONSUBUNITNAME$24, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationSubUnitName" element
     */
    public gov.niem.niem.niemCore.x20.TextType getOrganizationSubUnitNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONSUBUNITNAME$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationSubUnitName" element
     */
    public boolean isNilOrganizationSubUnitNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONSUBUNITNAME$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationSubUnitName" element
     */
    public int sizeOfOrganizationSubUnitNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONSUBUNITNAME$24);
        }
    }
    
    /**
     * Sets array of all "OrganizationSubUnitName" element
     */
    public void setOrganizationSubUnitNameArray(gov.niem.niem.niemCore.x20.TextType[] organizationSubUnitNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationSubUnitNameArray, ORGANIZATIONSUBUNITNAME$24);
        }
    }
    
    /**
     * Sets ith "OrganizationSubUnitName" element
     */
    public void setOrganizationSubUnitNameArray(int i, gov.niem.niem.niemCore.x20.TextType organizationSubUnitName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONSUBUNITNAME$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationSubUnitName);
        }
    }
    
    /**
     * Nils the ith "OrganizationSubUnitName" element
     */
    public void setNilOrganizationSubUnitNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ORGANIZATIONSUBUNITNAME$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationSubUnitName" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewOrganizationSubUnitName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ORGANIZATIONSUBUNITNAME$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationSubUnitName" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewOrganizationSubUnitName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ORGANIZATIONSUBUNITNAME$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationSubUnitName" element
     */
    public void removeOrganizationSubUnitName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONSUBUNITNAME$24, i);
        }
    }
    
    /**
     * Gets array of all "OrganizationTaxIdentification" elements
     */
    public gov.niem.niem.niemCore.x20.IdentificationType[] getOrganizationTaxIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ORGANIZATIONTAXIDENTIFICATION$26, targetList);
            gov.niem.niem.niemCore.x20.IdentificationType[] result = new gov.niem.niem.niemCore.x20.IdentificationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "OrganizationTaxIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType getOrganizationTaxIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONTAXIDENTIFICATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "OrganizationTaxIdentification" element
     */
    public boolean isNilOrganizationTaxIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONTAXIDENTIFICATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "OrganizationTaxIdentification" element
     */
    public int sizeOfOrganizationTaxIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATIONTAXIDENTIFICATION$26);
        }
    }
    
    /**
     * Sets array of all "OrganizationTaxIdentification" element
     */
    public void setOrganizationTaxIdentificationArray(gov.niem.niem.niemCore.x20.IdentificationType[] organizationTaxIdentificationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(organizationTaxIdentificationArray, ORGANIZATIONTAXIDENTIFICATION$26);
        }
    }
    
    /**
     * Sets ith "OrganizationTaxIdentification" element
     */
    public void setOrganizationTaxIdentificationArray(int i, gov.niem.niem.niemCore.x20.IdentificationType organizationTaxIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONTAXIDENTIFICATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(organizationTaxIdentification);
        }
    }
    
    /**
     * Nils the ith "OrganizationTaxIdentification" element
     */
    public void setNilOrganizationTaxIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ORGANIZATIONTAXIDENTIFICATION$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "OrganizationTaxIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType insertNewOrganizationTaxIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().insert_element_user(ORGANIZATIONTAXIDENTIFICATION$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "OrganizationTaxIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType addNewOrganizationTaxIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ORGANIZATIONTAXIDENTIFICATION$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "OrganizationTaxIdentification" element
     */
    public void removeOrganizationTaxIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATIONTAXIDENTIFICATION$26, i);
        }
    }
}
