/*
 * XML Type:  contributorType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.ContributorType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML contributorType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class ContributorTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.ContributorType
{
    private static final long serialVersionUID = 1L;
    
    public ContributorTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATION$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Organization");
    private static final javax.xml.namespace.QName PERSON$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Person");
    private static final javax.xml.namespace.QName SERVICE$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "Service");
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
     * Gets the "Organization" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Organization" element
     */
    public boolean isSetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZATION$0) != 0;
        }
    }
    
    /**
     * Sets the "Organization" element
     */
    public void setOrganization(mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType)get_store().find_element_user(ORGANIZATION$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType)get_store().add_element_user(ORGANIZATION$0);
            }
            target.set(organization);
        }
    }
    
    /**
     * Appends and returns a new empty "Organization" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType addNewOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType)get_store().add_element_user(ORGANIZATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Organization" element
     */
    public void unsetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZATION$0, 0);
        }
    }
    
    /**
     * Gets the "Person" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PersonType getPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PersonType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PersonType)get_store().find_element_user(PERSON$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Person" element
     */
    public boolean isSetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSON$2) != 0;
        }
    }
    
    /**
     * Sets the "Person" element
     */
    public void setPerson(mil.dod.metadata.mdr.ns.ddms.x20.PersonType person)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PersonType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PersonType)get_store().find_element_user(PERSON$2, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PersonType)get_store().add_element_user(PERSON$2);
            }
            target.set(person);
        }
    }
    
    /**
     * Appends and returns a new empty "Person" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PersonType addNewPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PersonType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PersonType)get_store().add_element_user(PERSON$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Person" element
     */
    public void unsetPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSON$2, 0);
        }
    }
    
    /**
     * Gets the "Service" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.ServiceType getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ServiceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ServiceType)get_store().find_element_user(SERVICE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Service" element
     */
    public boolean isSetService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$4) != 0;
        }
    }
    
    /**
     * Sets the "Service" element
     */
    public void setService(mil.dod.metadata.mdr.ns.ddms.x20.ServiceType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ServiceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ServiceType)get_store().find_element_user(SERVICE$4, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.ServiceType)get_store().add_element_user(SERVICE$4);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "Service" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.ServiceType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.ServiceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.ServiceType)get_store().add_element_user(SERVICE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Service" element
     */
    public void unsetService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$4, 0);
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
}
