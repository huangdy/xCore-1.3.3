/*
 * An XML document type.
 * Localname: virtualCoverage
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one virtualCoverage(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class VirtualCoverageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public VirtualCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIRTUALCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "virtualCoverage");
    
    
    /**
     * Gets the "virtualCoverage" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType getVirtualCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType)get_store().find_element_user(VIRTUALCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "virtualCoverage" element
     */
    public void setVirtualCoverage(mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType virtualCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType)get_store().find_element_user(VIRTUALCOVERAGE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType)get_store().add_element_user(VIRTUALCOVERAGE$0);
            }
            target.set(virtualCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "virtualCoverage" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType addNewVirtualCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType)get_store().add_element_user(VIRTUALCOVERAGE$0);
            return target;
        }
    }
}