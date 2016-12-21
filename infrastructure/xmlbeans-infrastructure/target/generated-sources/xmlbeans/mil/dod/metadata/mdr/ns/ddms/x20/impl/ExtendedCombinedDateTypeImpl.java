/*
 * XML Type:  ExtendedCombinedDateType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML ExtendedCombinedDateType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDateTime
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlGYear
 *     mil.dod.metadata.mdr.ns.ddms.x20.DateValueExtensionType
 */
public class ExtendedCombinedDateTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements mil.dod.metadata.mdr.ns.ddms.x20.ExtendedCombinedDateType, mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType, mil.dod.metadata.mdr.ns.ddms.x20.DateValueExtensionType
{
    private static final long serialVersionUID = 1L;
    
    public ExtendedCombinedDateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ExtendedCombinedDateTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
