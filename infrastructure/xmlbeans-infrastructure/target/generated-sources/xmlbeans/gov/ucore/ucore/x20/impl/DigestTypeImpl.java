/*
 * XML Type:  DigestType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.DigestType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML DigestType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class DigestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.DigestType
{
    private static final long serialVersionUID = 1L;
    
    public DigestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIGESTMETADATA$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DigestMetadata");
    private static final javax.xml.namespace.QName THINGABSTRACT$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAbstract");
    private static final org.apache.xmlbeans.QNameSet THINGABSTRACT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Event"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Collection"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Entity"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Person"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Location"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Organization"),
    });
    private static final javax.xml.namespace.QName RELATIONSHIPABSTRACT$4 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "RelationshipAbstract");
    private static final org.apache.xmlbeans.QNameSet RELATIONSHIPABSTRACT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SubordinateTo"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Controls"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "WorksAt"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "DistinctFrom"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "EmployedBy"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "HasFamilialRelationTo"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "HasOriginOf"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AffiliatedWith"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "OccursAt"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CauseOf"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "InvolvedIn"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SameAs"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LocatedAt"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "RelationshipAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "HasDestinationOf"),
    });
    private static final javax.xml.namespace.QName THINGATTACHMENTLINKASSOCIATION$6 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAttachmentLinkAssociation");
    private static final javax.xml.namespace.QName SAMEASPAYLOADASSOCIATION$8 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsPayloadAssociation");
    
    
    /**
     * Gets the "DigestMetadata" element
     */
    public gov.ucore.ucore.x20.DigestMetadataType getDigestMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.DigestMetadataType target = null;
            target = (gov.ucore.ucore.x20.DigestMetadataType)get_store().find_element_user(DIGESTMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DigestMetadata" element
     */
    public boolean isSetDigestMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIGESTMETADATA$0) != 0;
        }
    }
    
    /**
     * Sets the "DigestMetadata" element
     */
    public void setDigestMetadata(gov.ucore.ucore.x20.DigestMetadataType digestMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.DigestMetadataType target = null;
            target = (gov.ucore.ucore.x20.DigestMetadataType)get_store().find_element_user(DIGESTMETADATA$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.DigestMetadataType)get_store().add_element_user(DIGESTMETADATA$0);
            }
            target.set(digestMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "DigestMetadata" element
     */
    public gov.ucore.ucore.x20.DigestMetadataType addNewDigestMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.DigestMetadataType target = null;
            target = (gov.ucore.ucore.x20.DigestMetadataType)get_store().add_element_user(DIGESTMETADATA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DigestMetadata" element
     */
    public void unsetDigestMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIGESTMETADATA$0, 0);
        }
    }
    
    /**
     * Gets array of all "ThingAbstract" elements
     */
    public gov.ucore.ucore.x20.ThingType[] getThingAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(THINGABSTRACT$3, targetList);
            gov.ucore.ucore.x20.ThingType[] result = new gov.ucore.ucore.x20.ThingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ThingAbstract" element
     */
    public gov.ucore.ucore.x20.ThingType getThingAbstractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingType target = null;
            target = (gov.ucore.ucore.x20.ThingType)get_store().find_element_user(THINGABSTRACT$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ThingAbstract" element
     */
    public int sizeOfThingAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THINGABSTRACT$3);
        }
    }
    
    /**
     * Sets array of all "ThingAbstract" element
     */
    public void setThingAbstractArray(gov.ucore.ucore.x20.ThingType[] thingAbstractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(thingAbstractArray, THINGABSTRACT$2, THINGABSTRACT$3);
        }
    }
    
    /**
     * Sets ith "ThingAbstract" element
     */
    public void setThingAbstractArray(int i, gov.ucore.ucore.x20.ThingType thingAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingType target = null;
            target = (gov.ucore.ucore.x20.ThingType)get_store().find_element_user(THINGABSTRACT$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(thingAbstract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ThingAbstract" element
     */
    public gov.ucore.ucore.x20.ThingType insertNewThingAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingType target = null;
            target = (gov.ucore.ucore.x20.ThingType)get_store().insert_element_user(THINGABSTRACT$3, THINGABSTRACT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ThingAbstract" element
     */
    public gov.ucore.ucore.x20.ThingType addNewThingAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingType target = null;
            target = (gov.ucore.ucore.x20.ThingType)get_store().add_element_user(THINGABSTRACT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ThingAbstract" element
     */
    public void removeThingAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THINGABSTRACT$3, i);
        }
    }
    
    /**
     * Gets array of all "RelationshipAbstract" elements
     */
    public gov.ucore.ucore.x20.RelationshipType[] getRelationshipAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIONSHIPABSTRACT$5, targetList);
            gov.ucore.ucore.x20.RelationshipType[] result = new gov.ucore.ucore.x20.RelationshipType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelationshipAbstract" element
     */
    public gov.ucore.ucore.x20.RelationshipType getRelationshipAbstractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.RelationshipType target = null;
            target = (gov.ucore.ucore.x20.RelationshipType)get_store().find_element_user(RELATIONSHIPABSTRACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RelationshipAbstract" element
     */
    public int sizeOfRelationshipAbstractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPABSTRACT$5);
        }
    }
    
    /**
     * Sets array of all "RelationshipAbstract" element
     */
    public void setRelationshipAbstractArray(gov.ucore.ucore.x20.RelationshipType[] relationshipAbstractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relationshipAbstractArray, RELATIONSHIPABSTRACT$4, RELATIONSHIPABSTRACT$5);
        }
    }
    
    /**
     * Sets ith "RelationshipAbstract" element
     */
    public void setRelationshipAbstractArray(int i, gov.ucore.ucore.x20.RelationshipType relationshipAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.RelationshipType target = null;
            target = (gov.ucore.ucore.x20.RelationshipType)get_store().find_element_user(RELATIONSHIPABSTRACT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relationshipAbstract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelationshipAbstract" element
     */
    public gov.ucore.ucore.x20.RelationshipType insertNewRelationshipAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.RelationshipType target = null;
            target = (gov.ucore.ucore.x20.RelationshipType)get_store().insert_element_user(RELATIONSHIPABSTRACT$5, RELATIONSHIPABSTRACT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelationshipAbstract" element
     */
    public gov.ucore.ucore.x20.RelationshipType addNewRelationshipAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.RelationshipType target = null;
            target = (gov.ucore.ucore.x20.RelationshipType)get_store().add_element_user(RELATIONSHIPABSTRACT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelationshipAbstract" element
     */
    public void removeRelationshipAbstract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPABSTRACT$5, i);
        }
    }
    
    /**
     * Gets array of all "ThingAttachmentLinkAssociation" elements
     */
    public gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType[] getThingAttachmentLinkAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(THINGATTACHMENTLINKASSOCIATION$6, targetList);
            gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType[] result = new gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ThingAttachmentLinkAssociation" element
     */
    public gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType getThingAttachmentLinkAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType target = null;
            target = (gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType)get_store().find_element_user(THINGATTACHMENTLINKASSOCIATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ThingAttachmentLinkAssociation" element
     */
    public int sizeOfThingAttachmentLinkAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THINGATTACHMENTLINKASSOCIATION$6);
        }
    }
    
    /**
     * Sets array of all "ThingAttachmentLinkAssociation" element
     */
    public void setThingAttachmentLinkAssociationArray(gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType[] thingAttachmentLinkAssociationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(thingAttachmentLinkAssociationArray, THINGATTACHMENTLINKASSOCIATION$6);
        }
    }
    
    /**
     * Sets ith "ThingAttachmentLinkAssociation" element
     */
    public void setThingAttachmentLinkAssociationArray(int i, gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType thingAttachmentLinkAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType target = null;
            target = (gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType)get_store().find_element_user(THINGATTACHMENTLINKASSOCIATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(thingAttachmentLinkAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ThingAttachmentLinkAssociation" element
     */
    public gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType insertNewThingAttachmentLinkAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType target = null;
            target = (gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType)get_store().insert_element_user(THINGATTACHMENTLINKASSOCIATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ThingAttachmentLinkAssociation" element
     */
    public gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType addNewThingAttachmentLinkAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType target = null;
            target = (gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType)get_store().add_element_user(THINGATTACHMENTLINKASSOCIATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ThingAttachmentLinkAssociation" element
     */
    public void removeThingAttachmentLinkAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THINGATTACHMENTLINKASSOCIATION$6, i);
        }
    }
    
    /**
     * Gets array of all "SameAsPayloadAssociation" elements
     */
    public x0.messageLibrary1.SameAsPayloadAssociationType[] getSameAsPayloadAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SAMEASPAYLOADASSOCIATION$8, targetList);
            x0.messageLibrary1.SameAsPayloadAssociationType[] result = new x0.messageLibrary1.SameAsPayloadAssociationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SameAsPayloadAssociation" element
     */
    public x0.messageLibrary1.SameAsPayloadAssociationType getSameAsPayloadAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.SameAsPayloadAssociationType target = null;
            target = (x0.messageLibrary1.SameAsPayloadAssociationType)get_store().find_element_user(SAMEASPAYLOADASSOCIATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SameAsPayloadAssociation" element
     */
    public int sizeOfSameAsPayloadAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SAMEASPAYLOADASSOCIATION$8);
        }
    }
    
    /**
     * Sets array of all "SameAsPayloadAssociation" element
     */
    public void setSameAsPayloadAssociationArray(x0.messageLibrary1.SameAsPayloadAssociationType[] sameAsPayloadAssociationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sameAsPayloadAssociationArray, SAMEASPAYLOADASSOCIATION$8);
        }
    }
    
    /**
     * Sets ith "SameAsPayloadAssociation" element
     */
    public void setSameAsPayloadAssociationArray(int i, x0.messageLibrary1.SameAsPayloadAssociationType sameAsPayloadAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.SameAsPayloadAssociationType target = null;
            target = (x0.messageLibrary1.SameAsPayloadAssociationType)get_store().find_element_user(SAMEASPAYLOADASSOCIATION$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sameAsPayloadAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SameAsPayloadAssociation" element
     */
    public x0.messageLibrary1.SameAsPayloadAssociationType insertNewSameAsPayloadAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.SameAsPayloadAssociationType target = null;
            target = (x0.messageLibrary1.SameAsPayloadAssociationType)get_store().insert_element_user(SAMEASPAYLOADASSOCIATION$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SameAsPayloadAssociation" element
     */
    public x0.messageLibrary1.SameAsPayloadAssociationType addNewSameAsPayloadAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.SameAsPayloadAssociationType target = null;
            target = (x0.messageLibrary1.SameAsPayloadAssociationType)get_store().add_element_user(SAMEASPAYLOADASSOCIATION$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "SameAsPayloadAssociation" element
     */
    public void removeSameAsPayloadAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SAMEASPAYLOADASSOCIATION$8, i);
        }
    }
}
