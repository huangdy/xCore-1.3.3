/*
 * An XML document type.
 * Localname: ThingAttachmentLinkAssociation
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.ThingAttachmentLinkAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one ThingAttachmentLinkAssociation(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class ThingAttachmentLinkAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.ThingAttachmentLinkAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ThingAttachmentLinkAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THINGATTACHMENTLINKASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAttachmentLinkAssociation");
    
    
    /**
     * Gets the "ThingAttachmentLinkAssociation" element
     */
    public gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType getThingAttachmentLinkAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType target = null;
            target = (gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType)get_store().find_element_user(THINGATTACHMENTLINKASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ThingAttachmentLinkAssociation" element
     */
    public void setThingAttachmentLinkAssociation(gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType thingAttachmentLinkAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType target = null;
            target = (gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType)get_store().find_element_user(THINGATTACHMENTLINKASSOCIATION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType)get_store().add_element_user(THINGATTACHMENTLINKASSOCIATION$0);
            }
            target.set(thingAttachmentLinkAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "ThingAttachmentLinkAssociation" element
     */
    public gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType addNewThingAttachmentLinkAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType target = null;
            target = (gov.ucore.ucore.x20.ThingAttachmentLinkAssociationType)get_store().add_element_user(THINGATTACHMENTLINKASSOCIATION$0);
            return target;
        }
    }
}
