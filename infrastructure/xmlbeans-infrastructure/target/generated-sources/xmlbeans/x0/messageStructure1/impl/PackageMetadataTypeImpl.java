/*
 * XML Type:  PackageMetadataType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PackageMetadataType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML PackageMetadataType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class PackageMetadataTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PackageMetadataType
{
    private static final long serialVersionUID = 1L;
    
    public PackageMetadataTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAITEMID$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemID");
    private static final javax.xml.namespace.QName DATAITEMCOMPLETEINDICATOR$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCompleteIndicator");
    private static final javax.xml.namespace.QName DATAITEMCONTACTABSTRACT$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemContactAbstract");
    private static final javax.xml.namespace.QName DATAITEMDATE$6 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemDate");
    private static final javax.xml.namespace.QName DATAITEMREFERENCEID$8 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemReferenceID");
    private static final javax.xml.namespace.QName DATAITEMPUBLISHINSTRUCTION$10 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemPublishInstruction");
    private static final javax.xml.namespace.QName DATAITEMSTATUSABSTRACT$12 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemStatusAbstract");
    private static final org.apache.xmlbeans.QNameSet DATAITEMSTATUSABSTRACT$13 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DataItemStatus"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemStatusAbstract"),
    });
    private static final javax.xml.namespace.QName DATAOWNERMETADATA$14 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadata");
    private static final javax.xml.namespace.QName DISSEMINATIONCRITERIAABSTRACT$16 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DisseminationCriteriaAbstract");
    private static final org.apache.xmlbeans.QNameSet DISSEMINATIONCRITERIAABSTRACT$17 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DisseminationCriteriaAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DisseminationCriteria"),
    });
    private static final javax.xml.namespace.QName DATAITEMCATEGORY$18 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataItemCategory");
    private static final javax.xml.namespace.QName PACKAGEMETADATAEXTENSIONABSTRACT$20 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet PACKAGEMETADATAEXTENSIONABSTRACT$21 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PackageResourceMetadataExtension"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PackageSecurityMetadata"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataDomainAttribute"),
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification"),
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductProperties"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataExtensionAbstract"),
    });
    
    
    /**
     * Gets the "DataItemID" element
     */
    public java.lang.String getDataItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemID" element
     */
    public org.apache.xmlbeans.XmlString xgetDataItemID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataItemID" element
     */
    public void setDataItemID(java.lang.String dataItemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMID$0);
            }
            target.setStringValue(dataItemID);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemID" element
     */
    public void xsetDataItemID(org.apache.xmlbeans.XmlString dataItemID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAITEMID$0);
            }
            target.set(dataItemID);
        }
    }
    
    /**
     * Gets the "DataItemCompleteIndicator" element
     */
    public boolean getDataItemCompleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCOMPLETEINDICATOR$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemCompleteIndicator" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDataItemCompleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DATAITEMCOMPLETEINDICATOR$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataItemCompleteIndicator" element
     */
    public boolean isSetDataItemCompleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAITEMCOMPLETEINDICATOR$2) != 0;
        }
    }
    
    /**
     * Sets the "DataItemCompleteIndicator" element
     */
    public void setDataItemCompleteIndicator(boolean dataItemCompleteIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMCOMPLETEINDICATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMCOMPLETEINDICATOR$2);
            }
            target.setBooleanValue(dataItemCompleteIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemCompleteIndicator" element
     */
    public void xsetDataItemCompleteIndicator(org.apache.xmlbeans.XmlBoolean dataItemCompleteIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DATAITEMCOMPLETEINDICATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DATAITEMCOMPLETEINDICATOR$2);
            }
            target.set(dataItemCompleteIndicator);
        }
    }
    
    /**
     * Unsets the "DataItemCompleteIndicator" element
     */
    public void unsetDataItemCompleteIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAITEMCOMPLETEINDICATOR$2, 0);
        }
    }
    
    /**
     * Gets array of all "DataItemContactAbstract" elements
     */
    public org.apache.xmlbeans.XmlObject[] getDataItemContactAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAITEMCONTACTABSTRACT$4, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataItemContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataItemContactAbstractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAITEMCONTACTABSTRACT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataItemContactAbstract" element
     */
    public int sizeOfDataItemContactAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAITEMCONTACTABSTRACT$4);
        }
    }
    
    /**
     * Sets array of all "DataItemContactAbstract" element
     */
    public void setDataItemContactAbstractArray(org.apache.xmlbeans.XmlObject[] dataItemContactAbstractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataItemContactAbstractArray, DATAITEMCONTACTABSTRACT$4);
        }
    }
    
    /**
     * Sets ith "DataItemContactAbstract" element
     */
    public void setDataItemContactAbstractArray(int i, org.apache.xmlbeans.XmlObject dataItemContactAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAITEMCONTACTABSTRACT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataItemContactAbstract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataItemContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject insertNewDataItemContactAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(DATAITEMCONTACTABSTRACT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataItemContactAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataItemContactAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAITEMCONTACTABSTRACT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataItemContactAbstract" element
     */
    public void removeDataItemContactAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAITEMCONTACTABSTRACT$4, i);
        }
    }
    
    /**
     * Gets the "DataItemDate" element
     */
    public java.util.Calendar getDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMDATE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemDate" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAITEMDATE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DataItemDate" element
     */
    public boolean isNilDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAITEMDATE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DataItemDate" element
     */
    public boolean isSetDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAITEMDATE$6) != 0;
        }
    }
    
    /**
     * Sets the "DataItemDate" element
     */
    public void setDataItemDate(java.util.Calendar dataItemDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMDATE$6);
            }
            target.setCalendarValue(dataItemDate);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemDate" element
     */
    public void xsetDataItemDate(org.apache.xmlbeans.XmlDate dataItemDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAITEMDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATAITEMDATE$6);
            }
            target.set(dataItemDate);
        }
    }
    
    /**
     * Nils the "DataItemDate" element
     */
    public void setNilDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAITEMDATE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATAITEMDATE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DataItemDate" element
     */
    public void unsetDataItemDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAITEMDATE$6, 0);
        }
    }
    
    /**
     * Gets the "DataItemReferenceID" element
     */
    public java.lang.String getDataItemReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMREFERENCEID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemReferenceID" element
     */
    public org.apache.xmlbeans.XmlString xgetDataItemReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMREFERENCEID$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DataItemReferenceID" element
     */
    public boolean isNilDataItemReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMREFERENCEID$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "DataItemReferenceID" element
     */
    public void setDataItemReferenceID(java.lang.String dataItemReferenceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMREFERENCEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMREFERENCEID$8);
            }
            target.setStringValue(dataItemReferenceID);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemReferenceID" element
     */
    public void xsetDataItemReferenceID(org.apache.xmlbeans.XmlString dataItemReferenceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMREFERENCEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAITEMREFERENCEID$8);
            }
            target.set(dataItemReferenceID);
        }
    }
    
    /**
     * Nils the "DataItemReferenceID" element
     */
    public void setNilDataItemReferenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATAITEMREFERENCEID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATAITEMREFERENCEID$8);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "DataItemPublishInstruction" element
     */
    public x0.messageCodes1.DataItemPublishInstructionCodeSimpleType.Enum getDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$10, 0);
            if (target == null)
            {
                return null;
            }
            return (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataItemPublishInstruction" element
     */
    public x0.messageCodes1.DataItemPublishInstructionCodeSimpleType xgetDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.DataItemPublishInstructionCodeSimpleType target = null;
            target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$10, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "DataItemPublishInstruction" element
     */
    public boolean isNilDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.DataItemPublishInstructionCodeSimpleType target = null;
            target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "DataItemPublishInstruction" element
     */
    public boolean isSetDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAITEMPUBLISHINSTRUCTION$10) != 0;
        }
    }
    
    /**
     * Sets the "DataItemPublishInstruction" element
     */
    public void setDataItemPublishInstruction(x0.messageCodes1.DataItemPublishInstructionCodeSimpleType.Enum dataItemPublishInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAITEMPUBLISHINSTRUCTION$10);
            }
            target.setEnumValue(dataItemPublishInstruction);
        }
    }
    
    /**
     * Sets (as xml) the "DataItemPublishInstruction" element
     */
    public void xsetDataItemPublishInstruction(x0.messageCodes1.DataItemPublishInstructionCodeSimpleType dataItemPublishInstruction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.DataItemPublishInstructionCodeSimpleType target = null;
            target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$10, 0);
            if (target == null)
            {
                target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().add_element_user(DATAITEMPUBLISHINSTRUCTION$10);
            }
            target.set(dataItemPublishInstruction);
        }
    }
    
    /**
     * Nils the "DataItemPublishInstruction" element
     */
    public void setNilDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageCodes1.DataItemPublishInstructionCodeSimpleType target = null;
            target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().find_element_user(DATAITEMPUBLISHINSTRUCTION$10, 0);
            if (target == null)
            {
                target = (x0.messageCodes1.DataItemPublishInstructionCodeSimpleType)get_store().add_element_user(DATAITEMPUBLISHINSTRUCTION$10);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "DataItemPublishInstruction" element
     */
    public void unsetDataItemPublishInstruction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAITEMPUBLISHINSTRUCTION$10, 0);
        }
    }
    
    /**
     * Gets the "DataItemStatusAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataItemStatusAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAITEMSTATUSABSTRACT$13, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataItemStatusAbstract" element
     */
    public void setDataItemStatusAbstract(org.apache.xmlbeans.XmlObject dataItemStatusAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATAITEMSTATUSABSTRACT$13, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAITEMSTATUSABSTRACT$12);
            }
            target.set(dataItemStatusAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataItemStatusAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataItemStatusAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATAITEMSTATUSABSTRACT$12);
            return target;
        }
    }
    
    /**
     * Gets the "DataOwnerMetadata" element
     */
    public x0.messageStructure1.DataOwnerMetadataType getDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataOwnerMetadataType target = null;
            target = (x0.messageStructure1.DataOwnerMetadataType)get_store().find_element_user(DATAOWNERMETADATA$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerMetadata" element
     */
    public void setDataOwnerMetadata(x0.messageStructure1.DataOwnerMetadataType dataOwnerMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataOwnerMetadataType target = null;
            target = (x0.messageStructure1.DataOwnerMetadataType)get_store().find_element_user(DATAOWNERMETADATA$14, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DataOwnerMetadataType)get_store().add_element_user(DATAOWNERMETADATA$14);
            }
            target.set(dataOwnerMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerMetadata" element
     */
    public x0.messageStructure1.DataOwnerMetadataType addNewDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataOwnerMetadataType target = null;
            target = (x0.messageStructure1.DataOwnerMetadataType)get_store().add_element_user(DATAOWNERMETADATA$14);
            return target;
        }
    }
    
    /**
     * Gets the "DisseminationCriteriaAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDisseminationCriteriaAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DISSEMINATIONCRITERIAABSTRACT$17, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DisseminationCriteriaAbstract" element
     */
    public void setDisseminationCriteriaAbstract(org.apache.xmlbeans.XmlObject disseminationCriteriaAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DISSEMINATIONCRITERIAABSTRACT$17, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DISSEMINATIONCRITERIAABSTRACT$16);
            }
            target.set(disseminationCriteriaAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DisseminationCriteriaAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDisseminationCriteriaAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DISSEMINATIONCRITERIAABSTRACT$16);
            return target;
        }
    }
    
    /**
     * Gets array of all "DataItemCategory" elements
     */
    public x0.messageStructure1.DataItemCategoryType[] getDataItemCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAITEMCATEGORY$18, targetList);
            x0.messageStructure1.DataItemCategoryType[] result = new x0.messageStructure1.DataItemCategoryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DataItemCategory" element
     */
    public x0.messageStructure1.DataItemCategoryType getDataItemCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemCategoryType target = null;
            target = (x0.messageStructure1.DataItemCategoryType)get_store().find_element_user(DATAITEMCATEGORY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DataItemCategory" element
     */
    public int sizeOfDataItemCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAITEMCATEGORY$18);
        }
    }
    
    /**
     * Sets array of all "DataItemCategory" element
     */
    public void setDataItemCategoryArray(x0.messageStructure1.DataItemCategoryType[] dataItemCategoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataItemCategoryArray, DATAITEMCATEGORY$18);
        }
    }
    
    /**
     * Sets ith "DataItemCategory" element
     */
    public void setDataItemCategoryArray(int i, x0.messageStructure1.DataItemCategoryType dataItemCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemCategoryType target = null;
            target = (x0.messageStructure1.DataItemCategoryType)get_store().find_element_user(DATAITEMCATEGORY$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataItemCategory);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DataItemCategory" element
     */
    public x0.messageStructure1.DataItemCategoryType insertNewDataItemCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemCategoryType target = null;
            target = (x0.messageStructure1.DataItemCategoryType)get_store().insert_element_user(DATAITEMCATEGORY$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DataItemCategory" element
     */
    public x0.messageStructure1.DataItemCategoryType addNewDataItemCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataItemCategoryType target = null;
            target = (x0.messageStructure1.DataItemCategoryType)get_store().add_element_user(DATAITEMCATEGORY$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "DataItemCategory" element
     */
    public void removeDataItemCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAITEMCATEGORY$18, i);
        }
    }
    
    /**
     * Gets array of all "PackageMetadataExtensionAbstract" elements
     */
    public org.apache.xmlbeans.XmlObject[] getPackageMetadataExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PACKAGEMETADATAEXTENSIONABSTRACT$21, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PackageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getPackageMetadataExtensionAbstractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PACKAGEMETADATAEXTENSIONABSTRACT$21, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PackageMetadataExtensionAbstract" element
     */
    public int sizeOfPackageMetadataExtensionAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PACKAGEMETADATAEXTENSIONABSTRACT$21);
        }
    }
    
    /**
     * Sets array of all "PackageMetadataExtensionAbstract" element
     */
    public void setPackageMetadataExtensionAbstractArray(org.apache.xmlbeans.XmlObject[] packageMetadataExtensionAbstractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(packageMetadataExtensionAbstractArray, PACKAGEMETADATAEXTENSIONABSTRACT$20, PACKAGEMETADATAEXTENSIONABSTRACT$21);
        }
    }
    
    /**
     * Sets ith "PackageMetadataExtensionAbstract" element
     */
    public void setPackageMetadataExtensionAbstractArray(int i, org.apache.xmlbeans.XmlObject packageMetadataExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PACKAGEMETADATAEXTENSIONABSTRACT$21, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(packageMetadataExtensionAbstract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PackageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject insertNewPackageMetadataExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(PACKAGEMETADATAEXTENSIONABSTRACT$21, PACKAGEMETADATAEXTENSIONABSTRACT$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PackageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewPackageMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PACKAGEMETADATAEXTENSIONABSTRACT$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "PackageMetadataExtensionAbstract" element
     */
    public void removePackageMetadataExtensionAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PACKAGEMETADATAEXTENSIONABSTRACT$21, i);
        }
    }
}
