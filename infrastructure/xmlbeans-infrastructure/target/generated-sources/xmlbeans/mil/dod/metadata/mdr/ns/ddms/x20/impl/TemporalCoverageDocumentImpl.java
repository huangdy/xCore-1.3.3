/*
 * An XML document type.
 * Localname: temporalCoverage
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one temporalCoverage(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class TemporalCoverageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalCoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORALCOVERAGE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "temporalCoverage");
    
    
    /**
     * Gets the "temporalCoverage" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType getTemporalCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType)get_store().find_element_user(TEMPORALCOVERAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "temporalCoverage" element
     */
    public void setTemporalCoverage(mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType temporalCoverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType)get_store().find_element_user(TEMPORALCOVERAGE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType)get_store().add_element_user(TEMPORALCOVERAGE$0);
            }
            target.set(temporalCoverage);
        }
    }
    
    /**
     * Appends and returns a new empty "temporalCoverage" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType addNewTemporalCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.TemporalCoverageType)get_store().add_element_user(TEMPORALCOVERAGE$0);
            return target;
        }
    }
}
