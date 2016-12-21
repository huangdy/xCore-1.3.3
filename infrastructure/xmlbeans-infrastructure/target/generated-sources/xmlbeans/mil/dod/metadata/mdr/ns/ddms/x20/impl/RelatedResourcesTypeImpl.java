/*
 * XML Type:  RelatedResourcesType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML RelatedResourcesType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class RelatedResourcesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType
{
    private static final long serialVersionUID = 1L;
    
    public RelatedResourcesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDRESOURCE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "RelatedResource");
    private static final javax.xml.namespace.QName RELATIONSHIP$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "relationship");
    private static final javax.xml.namespace.QName DIRECTION$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "direction");
    private static final javax.xml.namespace.QName CLASSIFICATION$6 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classification");
    private static final javax.xml.namespace.QName OWNERPRODUCER$8 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "ownerProducer");
    private static final javax.xml.namespace.QName SCICONTROLS$10 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "SCIcontrols");
    private static final javax.xml.namespace.QName SARIDENTIFIER$12 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "SARIdentifier");
    private static final javax.xml.namespace.QName DISSEMINATIONCONTROLS$14 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "disseminationControls");
    private static final javax.xml.namespace.QName FGISOURCEOPEN$16 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "FGIsourceOpen");
    private static final javax.xml.namespace.QName FGISOURCEPROTECTED$18 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "FGIsourceProtected");
    private static final javax.xml.namespace.QName RELEASABLETO$20 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "releasableTo");
    private static final javax.xml.namespace.QName NONICMARKINGS$22 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "nonICmarkings");
    private static final javax.xml.namespace.QName CLASSIFIEDBY$24 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classifiedBy");
    private static final javax.xml.namespace.QName DERIVATIVELYCLASSIFIEDBY$26 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "derivativelyClassifiedBy");
    private static final javax.xml.namespace.QName CLASSIFICATIONREASON$28 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "classificationReason");
    private static final javax.xml.namespace.QName DERIVEDFROM$30 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "derivedFrom");
    private static final javax.xml.namespace.QName DECLASSDATE$32 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassDate");
    private static final javax.xml.namespace.QName DECLASSEVENT$34 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassEvent");
    private static final javax.xml.namespace.QName DECLASSEXCEPTION$36 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassException");
    private static final javax.xml.namespace.QName TYPEOFEXEMPTEDSOURCE$38 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "typeOfExemptedSource");
    private static final javax.xml.namespace.QName DATEOFEXEMPTEDSOURCE$40 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "dateOfExemptedSource");
    private static final javax.xml.namespace.QName DECLASSMANUALREVIEW$42 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassManualReview");
    
    
    /**
     * Gets array of all "RelatedResource" elements
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource[] getRelatedResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDRESOURCE$0, targetList);
            mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource[] result = new mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelatedResource" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource getRelatedResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource)get_store().find_element_user(RELATEDRESOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RelatedResource" element
     */
    public int sizeOfRelatedResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDRESOURCE$0);
        }
    }
    
    /**
     * Sets array of all "RelatedResource" element
     */
    public void setRelatedResourceArray(mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource[] relatedResourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relatedResourceArray, RELATEDRESOURCE$0);
        }
    }
    
    /**
     * Sets ith "RelatedResource" element
     */
    public void setRelatedResourceArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource relatedResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource)get_store().find_element_user(RELATEDRESOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relatedResource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelatedResource" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource insertNewRelatedResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource)get_store().insert_element_user(RELATEDRESOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelatedResource" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource addNewRelatedResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource)get_store().add_element_user(RELATEDRESOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelatedResource" element
     */
    public void removeRelatedResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDRESOURCE$0, i);
        }
    }
    
    /**
     * Gets the "relationship" attribute
     */
    public java.lang.String getRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIP$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relationship" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(RELATIONSHIP$2);
            return target;
        }
    }
    
    /**
     * Sets the "relationship" attribute
     */
    public void setRelationship(java.lang.String relationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIONSHIP$2);
            }
            target.setStringValue(relationship);
        }
    }
    
    /**
     * Sets (as xml) the "relationship" attribute
     */
    public void xsetRelationship(org.apache.xmlbeans.XmlAnyURI relationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(RELATIONSHIP$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(RELATIONSHIP$2);
            }
            target.set(relationship);
        }
    }
    
    /**
     * Gets the "direction" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction.Enum getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DIRECTION$4);
            }
            if (target == null)
            {
                return null;
            }
            return (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "direction" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction xgetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction)get_store().find_attribute_user(DIRECTION$4);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction)get_default_attribute_value(DIRECTION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "direction" attribute
     */
    public boolean isSetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRECTION$4) != null;
        }
    }
    
    /**
     * Sets the "direction" attribute
     */
    public void setDirection(mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction.Enum direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTION$4);
            }
            target.setEnumValue(direction);
        }
    }
    
    /**
     * Sets (as xml) the "direction" attribute
     */
    public void xsetDirection(mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction)get_store().find_attribute_user(DIRECTION$4);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction)get_store().add_attribute_user(DIRECTION$4);
            }
            target.set(direction);
        }
    }
    
    /**
     * Unsets the "direction" attribute
     */
    public void unsetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRECTION$4);
        }
    }
    
    /**
     * Gets the "classification" attribute
     */
    public usGovIcIsmV2.ClassificationType.Enum getClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATION$6);
            if (target == null)
            {
                return null;
            }
            return (usGovIcIsmV2.ClassificationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classification" attribute
     */
    public usGovIcIsmV2.ClassificationType xgetClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassificationType target = null;
            target = (usGovIcIsmV2.ClassificationType)get_store().find_attribute_user(CLASSIFICATION$6);
            return target;
        }
    }
    
    /**
     * True if has "classification" attribute
     */
    public boolean isSetClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSIFICATION$6) != null;
        }
    }
    
    /**
     * Sets the "classification" attribute
     */
    public void setClassification(usGovIcIsmV2.ClassificationType.Enum classification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFICATION$6);
            }
            target.setEnumValue(classification);
        }
    }
    
    /**
     * Sets (as xml) the "classification" attribute
     */
    public void xsetClassification(usGovIcIsmV2.ClassificationType classification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassificationType target = null;
            target = (usGovIcIsmV2.ClassificationType)get_store().find_attribute_user(CLASSIFICATION$6);
            if (target == null)
            {
                target = (usGovIcIsmV2.ClassificationType)get_store().add_attribute_user(CLASSIFICATION$6);
            }
            target.set(classification);
        }
    }
    
    /**
     * Unsets the "classification" attribute
     */
    public void unsetClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSIFICATION$6);
        }
    }
    
    /**
     * Gets the "ownerProducer" attribute
     */
    public java.util.List getOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERPRODUCER$8);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "ownerProducer" attribute
     */
    public usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer xgetOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer target = null;
            target = (usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer)get_store().find_attribute_user(OWNERPRODUCER$8);
            return target;
        }
    }
    
    /**
     * True if has "ownerProducer" attribute
     */
    public boolean isSetOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OWNERPRODUCER$8) != null;
        }
    }
    
    /**
     * Sets the "ownerProducer" attribute
     */
    public void setOwnerProducer(java.util.List ownerProducer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OWNERPRODUCER$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OWNERPRODUCER$8);
            }
            target.setListValue(ownerProducer);
        }
    }
    
    /**
     * Sets (as xml) the "ownerProducer" attribute
     */
    public void xsetOwnerProducer(usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer ownerProducer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer target = null;
            target = (usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer)get_store().find_attribute_user(OWNERPRODUCER$8);
            if (target == null)
            {
                target = (usGovIcIsmV2.OwnerProducerAttribute.OwnerProducer)get_store().add_attribute_user(OWNERPRODUCER$8);
            }
            target.set(ownerProducer);
        }
    }
    
    /**
     * Unsets the "ownerProducer" attribute
     */
    public void unsetOwnerProducer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OWNERPRODUCER$8);
        }
    }
    
    /**
     * Gets the "SCIcontrols" attribute
     */
    public java.util.List getSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCICONTROLS$10);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "SCIcontrols" attribute
     */
    public usGovIcIsmV2.SCIcontrolsAttribute.SCIcontrols xgetSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.SCIcontrolsAttribute.SCIcontrols target = null;
            target = (usGovIcIsmV2.SCIcontrolsAttribute.SCIcontrols)get_store().find_attribute_user(SCICONTROLS$10);
            return target;
        }
    }
    
    /**
     * True if has "SCIcontrols" attribute
     */
    public boolean isSetSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCICONTROLS$10) != null;
        }
    }
    
    /**
     * Sets the "SCIcontrols" attribute
     */
    public void setSCIcontrols(java.util.List scIcontrols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCICONTROLS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCICONTROLS$10);
            }
            target.setListValue(scIcontrols);
        }
    }
    
    /**
     * Sets (as xml) the "SCIcontrols" attribute
     */
    public void xsetSCIcontrols(usGovIcIsmV2.SCIcontrolsAttribute.SCIcontrols scIcontrols)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.SCIcontrolsAttribute.SCIcontrols target = null;
            target = (usGovIcIsmV2.SCIcontrolsAttribute.SCIcontrols)get_store().find_attribute_user(SCICONTROLS$10);
            if (target == null)
            {
                target = (usGovIcIsmV2.SCIcontrolsAttribute.SCIcontrols)get_store().add_attribute_user(SCICONTROLS$10);
            }
            target.set(scIcontrols);
        }
    }
    
    /**
     * Unsets the "SCIcontrols" attribute
     */
    public void unsetSCIcontrols()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCICONTROLS$10);
        }
    }
    
    /**
     * Gets the "SARIdentifier" attribute
     */
    public java.util.List getSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SARIDENTIFIER$12);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "SARIdentifier" attribute
     */
    public usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier xgetSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier target = null;
            target = (usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier)get_store().find_attribute_user(SARIDENTIFIER$12);
            return target;
        }
    }
    
    /**
     * True if has "SARIdentifier" attribute
     */
    public boolean isSetSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SARIDENTIFIER$12) != null;
        }
    }
    
    /**
     * Sets the "SARIdentifier" attribute
     */
    public void setSARIdentifier(java.util.List sarIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SARIDENTIFIER$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SARIDENTIFIER$12);
            }
            target.setListValue(sarIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "SARIdentifier" attribute
     */
    public void xsetSARIdentifier(usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier sarIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier target = null;
            target = (usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier)get_store().find_attribute_user(SARIDENTIFIER$12);
            if (target == null)
            {
                target = (usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier)get_store().add_attribute_user(SARIDENTIFIER$12);
            }
            target.set(sarIdentifier);
        }
    }
    
    /**
     * Unsets the "SARIdentifier" attribute
     */
    public void unsetSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SARIDENTIFIER$12);
        }
    }
    
    /**
     * Gets the "disseminationControls" attribute
     */
    public java.util.List getDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISSEMINATIONCONTROLS$14);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "disseminationControls" attribute
     */
    public usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls xgetDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls target = null;
            target = (usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls)get_store().find_attribute_user(DISSEMINATIONCONTROLS$14);
            return target;
        }
    }
    
    /**
     * True if has "disseminationControls" attribute
     */
    public boolean isSetDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISSEMINATIONCONTROLS$14) != null;
        }
    }
    
    /**
     * Sets the "disseminationControls" attribute
     */
    public void setDisseminationControls(java.util.List disseminationControls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISSEMINATIONCONTROLS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISSEMINATIONCONTROLS$14);
            }
            target.setListValue(disseminationControls);
        }
    }
    
    /**
     * Sets (as xml) the "disseminationControls" attribute
     */
    public void xsetDisseminationControls(usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls disseminationControls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls target = null;
            target = (usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls)get_store().find_attribute_user(DISSEMINATIONCONTROLS$14);
            if (target == null)
            {
                target = (usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls)get_store().add_attribute_user(DISSEMINATIONCONTROLS$14);
            }
            target.set(disseminationControls);
        }
    }
    
    /**
     * Unsets the "disseminationControls" attribute
     */
    public void unsetDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISSEMINATIONCONTROLS$14);
        }
    }
    
    /**
     * Gets the "FGIsourceOpen" attribute
     */
    public java.util.List getFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEOPEN$16);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "FGIsourceOpen" attribute
     */
    public usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen xgetFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen target = null;
            target = (usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen)get_store().find_attribute_user(FGISOURCEOPEN$16);
            return target;
        }
    }
    
    /**
     * True if has "FGIsourceOpen" attribute
     */
    public boolean isSetFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FGISOURCEOPEN$16) != null;
        }
    }
    
    /**
     * Sets the "FGIsourceOpen" attribute
     */
    public void setFGIsourceOpen(java.util.List fgIsourceOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEOPEN$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FGISOURCEOPEN$16);
            }
            target.setListValue(fgIsourceOpen);
        }
    }
    
    /**
     * Sets (as xml) the "FGIsourceOpen" attribute
     */
    public void xsetFGIsourceOpen(usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen fgIsourceOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen target = null;
            target = (usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen)get_store().find_attribute_user(FGISOURCEOPEN$16);
            if (target == null)
            {
                target = (usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen)get_store().add_attribute_user(FGISOURCEOPEN$16);
            }
            target.set(fgIsourceOpen);
        }
    }
    
    /**
     * Unsets the "FGIsourceOpen" attribute
     */
    public void unsetFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FGISOURCEOPEN$16);
        }
    }
    
    /**
     * Gets the "FGIsourceProtected" attribute
     */
    public java.util.List getFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEPROTECTED$18);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "FGIsourceProtected" attribute
     */
    public usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected xgetFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected target = null;
            target = (usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected)get_store().find_attribute_user(FGISOURCEPROTECTED$18);
            return target;
        }
    }
    
    /**
     * True if has "FGIsourceProtected" attribute
     */
    public boolean isSetFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FGISOURCEPROTECTED$18) != null;
        }
    }
    
    /**
     * Sets the "FGIsourceProtected" attribute
     */
    public void setFGIsourceProtected(java.util.List fgIsourceProtected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEPROTECTED$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FGISOURCEPROTECTED$18);
            }
            target.setListValue(fgIsourceProtected);
        }
    }
    
    /**
     * Sets (as xml) the "FGIsourceProtected" attribute
     */
    public void xsetFGIsourceProtected(usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected fgIsourceProtected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected target = null;
            target = (usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected)get_store().find_attribute_user(FGISOURCEPROTECTED$18);
            if (target == null)
            {
                target = (usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected)get_store().add_attribute_user(FGISOURCEPROTECTED$18);
            }
            target.set(fgIsourceProtected);
        }
    }
    
    /**
     * Unsets the "FGIsourceProtected" attribute
     */
    public void unsetFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FGISOURCEPROTECTED$18);
        }
    }
    
    /**
     * Gets the "releasableTo" attribute
     */
    public java.util.List getReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELEASABLETO$20);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "releasableTo" attribute
     */
    public usGovIcIsmV2.ReleasableToAttribute.ReleasableTo xgetReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ReleasableToAttribute.ReleasableTo target = null;
            target = (usGovIcIsmV2.ReleasableToAttribute.ReleasableTo)get_store().find_attribute_user(RELEASABLETO$20);
            return target;
        }
    }
    
    /**
     * True if has "releasableTo" attribute
     */
    public boolean isSetReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELEASABLETO$20) != null;
        }
    }
    
    /**
     * Sets the "releasableTo" attribute
     */
    public void setReleasableTo(java.util.List releasableTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELEASABLETO$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELEASABLETO$20);
            }
            target.setListValue(releasableTo);
        }
    }
    
    /**
     * Sets (as xml) the "releasableTo" attribute
     */
    public void xsetReleasableTo(usGovIcIsmV2.ReleasableToAttribute.ReleasableTo releasableTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ReleasableToAttribute.ReleasableTo target = null;
            target = (usGovIcIsmV2.ReleasableToAttribute.ReleasableTo)get_store().find_attribute_user(RELEASABLETO$20);
            if (target == null)
            {
                target = (usGovIcIsmV2.ReleasableToAttribute.ReleasableTo)get_store().add_attribute_user(RELEASABLETO$20);
            }
            target.set(releasableTo);
        }
    }
    
    /**
     * Unsets the "releasableTo" attribute
     */
    public void unsetReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELEASABLETO$20);
        }
    }
    
    /**
     * Gets the "nonICmarkings" attribute
     */
    public java.util.List getNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONICMARKINGS$22);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "nonICmarkings" attribute
     */
    public usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings xgetNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings target = null;
            target = (usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings)get_store().find_attribute_user(NONICMARKINGS$22);
            return target;
        }
    }
    
    /**
     * True if has "nonICmarkings" attribute
     */
    public boolean isSetNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NONICMARKINGS$22) != null;
        }
    }
    
    /**
     * Sets the "nonICmarkings" attribute
     */
    public void setNonICmarkings(java.util.List nonICmarkings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONICMARKINGS$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NONICMARKINGS$22);
            }
            target.setListValue(nonICmarkings);
        }
    }
    
    /**
     * Sets (as xml) the "nonICmarkings" attribute
     */
    public void xsetNonICmarkings(usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings nonICmarkings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings target = null;
            target = (usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings)get_store().find_attribute_user(NONICMARKINGS$22);
            if (target == null)
            {
                target = (usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings)get_store().add_attribute_user(NONICMARKINGS$22);
            }
            target.set(nonICmarkings);
        }
    }
    
    /**
     * Unsets the "nonICmarkings" attribute
     */
    public void unsetNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NONICMARKINGS$22);
        }
    }
    
    /**
     * Gets the "classifiedBy" attribute
     */
    public java.lang.String getClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFIEDBY$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classifiedBy" attribute
     */
    public usGovIcIsmV2.ClassifiedByAttribute.ClassifiedBy xgetClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassifiedByAttribute.ClassifiedBy target = null;
            target = (usGovIcIsmV2.ClassifiedByAttribute.ClassifiedBy)get_store().find_attribute_user(CLASSIFIEDBY$24);
            return target;
        }
    }
    
    /**
     * True if has "classifiedBy" attribute
     */
    public boolean isSetClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSIFIEDBY$24) != null;
        }
    }
    
    /**
     * Sets the "classifiedBy" attribute
     */
    public void setClassifiedBy(java.lang.String classifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFIEDBY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFIEDBY$24);
            }
            target.setStringValue(classifiedBy);
        }
    }
    
    /**
     * Sets (as xml) the "classifiedBy" attribute
     */
    public void xsetClassifiedBy(usGovIcIsmV2.ClassifiedByAttribute.ClassifiedBy classifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassifiedByAttribute.ClassifiedBy target = null;
            target = (usGovIcIsmV2.ClassifiedByAttribute.ClassifiedBy)get_store().find_attribute_user(CLASSIFIEDBY$24);
            if (target == null)
            {
                target = (usGovIcIsmV2.ClassifiedByAttribute.ClassifiedBy)get_store().add_attribute_user(CLASSIFIEDBY$24);
            }
            target.set(classifiedBy);
        }
    }
    
    /**
     * Unsets the "classifiedBy" attribute
     */
    public void unsetClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSIFIEDBY$24);
        }
    }
    
    /**
     * Gets the "derivativelyClassifiedBy" attribute
     */
    public java.lang.String getDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "derivativelyClassifiedBy" attribute
     */
    public usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy xgetDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy target = null;
            target = (usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$26);
            return target;
        }
    }
    
    /**
     * True if has "derivativelyClassifiedBy" attribute
     */
    public boolean isSetDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$26) != null;
        }
    }
    
    /**
     * Sets the "derivativelyClassifiedBy" attribute
     */
    public void setDerivativelyClassifiedBy(java.lang.String derivativelyClassifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DERIVATIVELYCLASSIFIEDBY$26);
            }
            target.setStringValue(derivativelyClassifiedBy);
        }
    }
    
    /**
     * Sets (as xml) the "derivativelyClassifiedBy" attribute
     */
    public void xsetDerivativelyClassifiedBy(usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy derivativelyClassifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy target = null;
            target = (usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy)get_store().find_attribute_user(DERIVATIVELYCLASSIFIEDBY$26);
            if (target == null)
            {
                target = (usGovIcIsmV2.DerivativelyClassifiedByAttribute.DerivativelyClassifiedBy)get_store().add_attribute_user(DERIVATIVELYCLASSIFIEDBY$26);
            }
            target.set(derivativelyClassifiedBy);
        }
    }
    
    /**
     * Unsets the "derivativelyClassifiedBy" attribute
     */
    public void unsetDerivativelyClassifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DERIVATIVELYCLASSIFIEDBY$26);
        }
    }
    
    /**
     * Gets the "classificationReason" attribute
     */
    public java.lang.String getClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATIONREASON$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classificationReason" attribute
     */
    public usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason xgetClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason target = null;
            target = (usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason)get_store().find_attribute_user(CLASSIFICATIONREASON$28);
            return target;
        }
    }
    
    /**
     * True if has "classificationReason" attribute
     */
    public boolean isSetClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSIFICATIONREASON$28) != null;
        }
    }
    
    /**
     * Sets the "classificationReason" attribute
     */
    public void setClassificationReason(java.lang.String classificationReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSIFICATIONREASON$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSIFICATIONREASON$28);
            }
            target.setStringValue(classificationReason);
        }
    }
    
    /**
     * Sets (as xml) the "classificationReason" attribute
     */
    public void xsetClassificationReason(usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason classificationReason)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason target = null;
            target = (usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason)get_store().find_attribute_user(CLASSIFICATIONREASON$28);
            if (target == null)
            {
                target = (usGovIcIsmV2.ClassificationReasonAttribute.ClassificationReason)get_store().add_attribute_user(CLASSIFICATIONREASON$28);
            }
            target.set(classificationReason);
        }
    }
    
    /**
     * Unsets the "classificationReason" attribute
     */
    public void unsetClassificationReason()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSIFICATIONREASON$28);
        }
    }
    
    /**
     * Gets the "derivedFrom" attribute
     */
    public java.lang.String getDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVEDFROM$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "derivedFrom" attribute
     */
    public usGovIcIsmV2.DerivedFromAttribute.DerivedFrom xgetDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DerivedFromAttribute.DerivedFrom target = null;
            target = (usGovIcIsmV2.DerivedFromAttribute.DerivedFrom)get_store().find_attribute_user(DERIVEDFROM$30);
            return target;
        }
    }
    
    /**
     * True if has "derivedFrom" attribute
     */
    public boolean isSetDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DERIVEDFROM$30) != null;
        }
    }
    
    /**
     * Sets the "derivedFrom" attribute
     */
    public void setDerivedFrom(java.lang.String derivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVEDFROM$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DERIVEDFROM$30);
            }
            target.setStringValue(derivedFrom);
        }
    }
    
    /**
     * Sets (as xml) the "derivedFrom" attribute
     */
    public void xsetDerivedFrom(usGovIcIsmV2.DerivedFromAttribute.DerivedFrom derivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DerivedFromAttribute.DerivedFrom target = null;
            target = (usGovIcIsmV2.DerivedFromAttribute.DerivedFrom)get_store().find_attribute_user(DERIVEDFROM$30);
            if (target == null)
            {
                target = (usGovIcIsmV2.DerivedFromAttribute.DerivedFrom)get_store().add_attribute_user(DERIVEDFROM$30);
            }
            target.set(derivedFrom);
        }
    }
    
    /**
     * Unsets the "derivedFrom" attribute
     */
    public void unsetDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DERIVEDFROM$30);
        }
    }
    
    /**
     * Gets the "declassDate" attribute
     */
    public java.util.Calendar getDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSDATE$32);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassDate" attribute
     */
    public usGovIcIsmV2.DeclassDateAttribute.DeclassDate xgetDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassDateAttribute.DeclassDate target = null;
            target = (usGovIcIsmV2.DeclassDateAttribute.DeclassDate)get_store().find_attribute_user(DECLASSDATE$32);
            return target;
        }
    }
    
    /**
     * True if has "declassDate" attribute
     */
    public boolean isSetDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSDATE$32) != null;
        }
    }
    
    /**
     * Sets the "declassDate" attribute
     */
    public void setDeclassDate(java.util.Calendar declassDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSDATE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSDATE$32);
            }
            target.setCalendarValue(declassDate);
        }
    }
    
    /**
     * Sets (as xml) the "declassDate" attribute
     */
    public void xsetDeclassDate(usGovIcIsmV2.DeclassDateAttribute.DeclassDate declassDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassDateAttribute.DeclassDate target = null;
            target = (usGovIcIsmV2.DeclassDateAttribute.DeclassDate)get_store().find_attribute_user(DECLASSDATE$32);
            if (target == null)
            {
                target = (usGovIcIsmV2.DeclassDateAttribute.DeclassDate)get_store().add_attribute_user(DECLASSDATE$32);
            }
            target.set(declassDate);
        }
    }
    
    /**
     * Unsets the "declassDate" attribute
     */
    public void unsetDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSDATE$32);
        }
    }
    
    /**
     * Gets the "declassEvent" attribute
     */
    public java.lang.String getDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEVENT$34);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassEvent" attribute
     */
    public usGovIcIsmV2.DeclassEventAttribute.DeclassEvent xgetDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassEventAttribute.DeclassEvent target = null;
            target = (usGovIcIsmV2.DeclassEventAttribute.DeclassEvent)get_store().find_attribute_user(DECLASSEVENT$34);
            return target;
        }
    }
    
    /**
     * True if has "declassEvent" attribute
     */
    public boolean isSetDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSEVENT$34) != null;
        }
    }
    
    /**
     * Sets the "declassEvent" attribute
     */
    public void setDeclassEvent(java.lang.String declassEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEVENT$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSEVENT$34);
            }
            target.setStringValue(declassEvent);
        }
    }
    
    /**
     * Sets (as xml) the "declassEvent" attribute
     */
    public void xsetDeclassEvent(usGovIcIsmV2.DeclassEventAttribute.DeclassEvent declassEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassEventAttribute.DeclassEvent target = null;
            target = (usGovIcIsmV2.DeclassEventAttribute.DeclassEvent)get_store().find_attribute_user(DECLASSEVENT$34);
            if (target == null)
            {
                target = (usGovIcIsmV2.DeclassEventAttribute.DeclassEvent)get_store().add_attribute_user(DECLASSEVENT$34);
            }
            target.set(declassEvent);
        }
    }
    
    /**
     * Unsets the "declassEvent" attribute
     */
    public void unsetDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSEVENT$34);
        }
    }
    
    /**
     * Gets the "declassException" attribute
     */
    public java.util.List getDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEXCEPTION$36);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassException" attribute
     */
    public usGovIcIsmV2.DeclassExceptionAttribute.DeclassException xgetDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassExceptionAttribute.DeclassException target = null;
            target = (usGovIcIsmV2.DeclassExceptionAttribute.DeclassException)get_store().find_attribute_user(DECLASSEXCEPTION$36);
            return target;
        }
    }
    
    /**
     * True if has "declassException" attribute
     */
    public boolean isSetDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSEXCEPTION$36) != null;
        }
    }
    
    /**
     * Sets the "declassException" attribute
     */
    public void setDeclassException(java.util.List declassException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEXCEPTION$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSEXCEPTION$36);
            }
            target.setListValue(declassException);
        }
    }
    
    /**
     * Sets (as xml) the "declassException" attribute
     */
    public void xsetDeclassException(usGovIcIsmV2.DeclassExceptionAttribute.DeclassException declassException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassExceptionAttribute.DeclassException target = null;
            target = (usGovIcIsmV2.DeclassExceptionAttribute.DeclassException)get_store().find_attribute_user(DECLASSEXCEPTION$36);
            if (target == null)
            {
                target = (usGovIcIsmV2.DeclassExceptionAttribute.DeclassException)get_store().add_attribute_user(DECLASSEXCEPTION$36);
            }
            target.set(declassException);
        }
    }
    
    /**
     * Unsets the "declassException" attribute
     */
    public void unsetDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSEXCEPTION$36);
        }
    }
    
    /**
     * Gets the "typeOfExemptedSource" attribute
     */
    public java.util.List getTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$38);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeOfExemptedSource" attribute
     */
    public usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource xgetTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource target = null;
            target = (usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$38);
            return target;
        }
    }
    
    /**
     * True if has "typeOfExemptedSource" attribute
     */
    public boolean isSetTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$38) != null;
        }
    }
    
    /**
     * Sets the "typeOfExemptedSource" attribute
     */
    public void setTypeOfExemptedSource(java.util.List typeOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEOFEXEMPTEDSOURCE$38);
            }
            target.setListValue(typeOfExemptedSource);
        }
    }
    
    /**
     * Sets (as xml) the "typeOfExemptedSource" attribute
     */
    public void xsetTypeOfExemptedSource(usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource typeOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource target = null;
            target = (usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$38);
            if (target == null)
            {
                target = (usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource)get_store().add_attribute_user(TYPEOFEXEMPTEDSOURCE$38);
            }
            target.set(typeOfExemptedSource);
        }
    }
    
    /**
     * Unsets the "typeOfExemptedSource" attribute
     */
    public void unsetTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPEOFEXEMPTEDSOURCE$38);
        }
    }
    
    /**
     * Gets the "dateOfExemptedSource" attribute
     */
    public java.util.Calendar getDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$40);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateOfExemptedSource" attribute
     */
    public usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource xgetDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource target = null;
            target = (usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$40);
            return target;
        }
    }
    
    /**
     * True if has "dateOfExemptedSource" attribute
     */
    public boolean isSetDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$40) != null;
        }
    }
    
    /**
     * Sets the "dateOfExemptedSource" attribute
     */
    public void setDateOfExemptedSource(java.util.Calendar dateOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEOFEXEMPTEDSOURCE$40);
            }
            target.setCalendarValue(dateOfExemptedSource);
        }
    }
    
    /**
     * Sets (as xml) the "dateOfExemptedSource" attribute
     */
    public void xsetDateOfExemptedSource(usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource dateOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource target = null;
            target = (usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$40);
            if (target == null)
            {
                target = (usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource)get_store().add_attribute_user(DATEOFEXEMPTEDSOURCE$40);
            }
            target.set(dateOfExemptedSource);
        }
    }
    
    /**
     * Unsets the "dateOfExemptedSource" attribute
     */
    public void unsetDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATEOFEXEMPTEDSOURCE$40);
        }
    }
    
    /**
     * Gets the "declassManualReview" attribute
     */
    public boolean getDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSMANUALREVIEW$42);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassManualReview" attribute
     */
    public usGovIcIsmV2.DeclassManualReviewAttribute.DeclassManualReview xgetDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassManualReviewAttribute.DeclassManualReview target = null;
            target = (usGovIcIsmV2.DeclassManualReviewAttribute.DeclassManualReview)get_store().find_attribute_user(DECLASSMANUALREVIEW$42);
            return target;
        }
    }
    
    /**
     * True if has "declassManualReview" attribute
     */
    public boolean isSetDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSMANUALREVIEW$42) != null;
        }
    }
    
    /**
     * Sets the "declassManualReview" attribute
     */
    public void setDeclassManualReview(boolean declassManualReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSMANUALREVIEW$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSMANUALREVIEW$42);
            }
            target.setBooleanValue(declassManualReview);
        }
    }
    
    /**
     * Sets (as xml) the "declassManualReview" attribute
     */
    public void xsetDeclassManualReview(usGovIcIsmV2.DeclassManualReviewAttribute.DeclassManualReview declassManualReview)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassManualReviewAttribute.DeclassManualReview target = null;
            target = (usGovIcIsmV2.DeclassManualReviewAttribute.DeclassManualReview)get_store().find_attribute_user(DECLASSMANUALREVIEW$42);
            if (target == null)
            {
                target = (usGovIcIsmV2.DeclassManualReviewAttribute.DeclassManualReview)get_store().add_attribute_user(DECLASSMANUALREVIEW$42);
            }
            target.set(declassManualReview);
        }
    }
    
    /**
     * Unsets the "declassManualReview" attribute
     */
    public void unsetDeclassManualReview()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSMANUALREVIEW$42);
        }
    }
    /**
     * An XML RelatedResource(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
     *
     * This is a complex type.
     */
    public static class RelatedResourceImpl extends mil.dod.metadata.mdr.ns.ddms.x20.impl.CompoundResourceIdentifierTypeImpl implements mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedResourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINK$0 = 
            new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "link");
        
        
        /**
         * Gets array of all "link" elements
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link[] getLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LINK$0, targetList);
                mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link[] result = new mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "link" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link getLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link)get_store().find_element_user(LINK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "link" element
         */
        public int sizeOfLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINK$0);
            }
        }
        
        /**
         * Sets array of all "link" element
         */
        public void setLinkArray(mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link[] linkArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(linkArray, LINK$0);
            }
        }
        
        /**
         * Sets ith "link" element
         */
        public void setLinkArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link link)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link)get_store().find_element_user(LINK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(link);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "link" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link insertNewLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link)get_store().insert_element_user(LINK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "link" element
         */
        public mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link addNewLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link target = null;
                target = (mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link)get_store().add_element_user(LINK$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "link" element
         */
        public void removeLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINK$0, i);
            }
        }
        /**
         * An XML link(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
         *
         * This is a complex type.
         */
        public static class LinkImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.RelatedResource.Link
        {
            private static final long serialVersionUID = 1L;
            
            public LinkImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TYPE$0 = 
                new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "type");
            private static final javax.xml.namespace.QName HREF$2 = 
                new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "href");
            private static final javax.xml.namespace.QName ROLE$4 = 
                new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "role");
            private static final javax.xml.namespace.QName TITLE$6 = 
                new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
            private static final javax.xml.namespace.QName LABEL$8 = 
                new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "label");
            
            
            /**
             * Gets the "type" attribute
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
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "type" attribute
             */
            public org.apache.xmlbeans.XmlString xgetType()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(TYPE$0);
                    }
                    return target;
                }
            }
            
            /**
             * True if has "type" attribute
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
             * Sets the "type" attribute
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
             * Sets (as xml) the "type" attribute
             */
            public void xsetType(org.apache.xmlbeans.XmlString type)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
                    }
                    target.set(type);
                }
            }
            
            /**
             * Unsets the "type" attribute
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
             * Gets the "href" attribute
             */
            public java.lang.String getHref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$2);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "href" attribute
             */
            public org.apache.xmlbeans.XmlAnyURI xgetHref()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$2);
                    return target;
                }
            }
            
            /**
             * Sets the "href" attribute
             */
            public void setHref(java.lang.String href)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$2);
                    }
                    target.setStringValue(href);
                }
            }
            
            /**
             * Sets (as xml) the "href" attribute
             */
            public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$2);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$2);
                    }
                    target.set(href);
                }
            }
            
            /**
             * Gets the "role" attribute
             */
            public java.lang.String getRole()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "role" attribute
             */
            public org.apache.xmlbeans.XmlAnyURI xgetRole()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ROLE$4);
                    return target;
                }
            }
            
            /**
             * True if has "role" attribute
             */
            public boolean isSetRole()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(ROLE$4) != null;
                }
            }
            
            /**
             * Sets the "role" attribute
             */
            public void setRole(java.lang.String role)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROLE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROLE$4);
                    }
                    target.setStringValue(role);
                }
            }
            
            /**
             * Sets (as xml) the "role" attribute
             */
            public void xsetRole(org.apache.xmlbeans.XmlAnyURI role)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ROLE$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ROLE$4);
                    }
                    target.set(role);
                }
            }
            
            /**
             * Unsets the "role" attribute
             */
            public void unsetRole()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(ROLE$4);
                }
            }
            
            /**
             * Gets the "title" attribute
             */
            public java.lang.String getTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "title" attribute
             */
            public org.apache.xmlbeans.XmlString xgetTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
                    return target;
                }
            }
            
            /**
             * True if has "title" attribute
             */
            public boolean isSetTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(TITLE$6) != null;
                }
            }
            
            /**
             * Sets the "title" attribute
             */
            public void setTitle(java.lang.String title)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$6);
                    }
                    target.setStringValue(title);
                }
            }
            
            /**
             * Sets (as xml) the "title" attribute
             */
            public void xsetTitle(org.apache.xmlbeans.XmlString title)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$6);
                    }
                    target.set(title);
                }
            }
            
            /**
             * Unsets the "title" attribute
             */
            public void unsetTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(TITLE$6);
                }
            }
            
            /**
             * Gets the "label" attribute
             */
            public java.lang.String getLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "label" attribute
             */
            public org.apache.xmlbeans.XmlString xgetLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
                    return target;
                }
            }
            
            /**
             * True if has "label" attribute
             */
            public boolean isSetLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().find_attribute_user(LABEL$8) != null;
                }
            }
            
            /**
             * Sets the "label" attribute
             */
            public void setLabel(java.lang.String label)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$8);
                    }
                    target.setStringValue(label);
                }
            }
            
            /**
             * Sets (as xml) the "label" attribute
             */
            public void xsetLabel(org.apache.xmlbeans.XmlString label)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$8);
                    }
                    target.set(label);
                }
            }
            
            /**
             * Unsets the "label" attribute
             */
            public void unsetLabel()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_attribute(LABEL$8);
                }
            }
        }
    }
    /**
     * An XML direction(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
     *
     * This is an atomic type that is a restriction of mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType$Direction.
     */
    public static class DirectionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements mil.dod.metadata.mdr.ns.ddms.x20.RelatedResourcesType.Direction
    {
        private static final long serialVersionUID = 1L;
        
        public DirectionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DirectionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
