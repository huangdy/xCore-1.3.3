/*
 * XML Type:  AgreementListType
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.AgreementListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * An XML AgreementListType(@http://uicds.org/AgreementService).
 *
 * This is a complex type.
 */
public class AgreementListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.AgreementListType
{
    private static final long serialVersionUID = 1L;
    
    public AgreementListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGREEMENT$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "Agreement");
    
    
    /**
     * Gets array of all "Agreement" elements
     */
    public org.uicds.agreementService.AgreementType[] getAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGREEMENT$0, targetList);
            org.uicds.agreementService.AgreementType[] result = new org.uicds.agreementService.AgreementType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Agreement" element
     */
    public org.uicds.agreementService.AgreementType getAgreementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType target = null;
            target = (org.uicds.agreementService.AgreementType)get_store().find_element_user(AGREEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Agreement" element
     */
    public int sizeOfAgreementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGREEMENT$0);
        }
    }
    
    /**
     * Sets array of all "Agreement" element
     */
    public void setAgreementArray(org.uicds.agreementService.AgreementType[] agreementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(agreementArray, AGREEMENT$0);
        }
    }
    
    /**
     * Sets ith "Agreement" element
     */
    public void setAgreementArray(int i, org.uicds.agreementService.AgreementType agreement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType target = null;
            target = (org.uicds.agreementService.AgreementType)get_store().find_element_user(AGREEMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agreement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Agreement" element
     */
    public org.uicds.agreementService.AgreementType insertNewAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType target = null;
            target = (org.uicds.agreementService.AgreementType)get_store().insert_element_user(AGREEMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Agreement" element
     */
    public org.uicds.agreementService.AgreementType addNewAgreement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementType target = null;
            target = (org.uicds.agreementService.AgreementType)get_store().add_element_user(AGREEMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Agreement" element
     */
    public void removeAgreement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGREEMENT$0, i);
        }
    }
}
