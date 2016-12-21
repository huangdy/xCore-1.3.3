/*
 * An XML document type.
 * Localname: GeographicDatumCode
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.GeographicDatumCodeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one GeographicDatumCode(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class GeographicDatumCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.GeographicDatumCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeographicDatumCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICDATUMCODE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "GeographicDatumCode");
    
    
    /**
     * Gets the "GeographicDatumCode" element
     */
    public gov.niem.niem.nga.x20.DatumCodeType getGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().find_element_user(GEOGRAPHICDATUMCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "GeographicDatumCode" element
     */
    public boolean isNilGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().find_element_user(GEOGRAPHICDATUMCODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "GeographicDatumCode" element
     */
    public void setGeographicDatumCode(gov.niem.niem.nga.x20.DatumCodeType geographicDatumCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().find_element_user(GEOGRAPHICDATUMCODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().add_element_user(GEOGRAPHICDATUMCODE$0);
            }
            target.set(geographicDatumCode);
        }
    }
    
    /**
     * Appends and returns a new empty "GeographicDatumCode" element
     */
    public gov.niem.niem.nga.x20.DatumCodeType addNewGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().add_element_user(GEOGRAPHICDATUMCODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "GeographicDatumCode" element
     */
    public void setNilGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().find_element_user(GEOGRAPHICDATUMCODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().add_element_user(GEOGRAPHICDATUMCODE$0);
            }
            target.setNil();
        }
    }
}
