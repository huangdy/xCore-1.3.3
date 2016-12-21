/*
 * An XML document type.
 * Localname: ThingAbstract
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.ThingAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one ThingAbstract(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class ThingAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.ThingAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public ThingAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName THINGABSTRACT$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAbstract");
    private static final org.apache.xmlbeans.QNameSet THINGABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AgentAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Event"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Collection"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ThingAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Entity"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Person"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Location"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Organization"),
    });
    
    
    /**
     * Gets the "ThingAbstract" element
     */
    public gov.ucore.ucore.x20.ThingType getThingAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingType target = null;
            target = (gov.ucore.ucore.x20.ThingType)get_store().find_element_user(THINGABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ThingAbstract" element
     */
    public void setThingAbstract(gov.ucore.ucore.x20.ThingType thingAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingType target = null;
            target = (gov.ucore.ucore.x20.ThingType)get_store().find_element_user(THINGABSTRACT$1, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ThingType)get_store().add_element_user(THINGABSTRACT$0);
            }
            target.set(thingAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "ThingAbstract" element
     */
    public gov.ucore.ucore.x20.ThingType addNewThingAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ThingType target = null;
            target = (gov.ucore.ucore.x20.ThingType)get_store().add_element_user(THINGABSTRACT$0);
            return target;
        }
    }
}
