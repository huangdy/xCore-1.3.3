/*
 * XML Type:  VerticalExtentType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML VerticalExtentType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class VerticalExtentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType
{
    private static final long serialVersionUID = 1L;
    
    public VerticalExtentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINVERTICALEXTENT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "MinVerticalExtent");
    private static final javax.xml.namespace.QName MAXVERTICALEXTENT$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "MaxVerticalExtent");
    private static final javax.xml.namespace.QName UNITOFMEASURE$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "unitOfMeasure");
    private static final javax.xml.namespace.QName DATUM$6 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "datum");
    
    
    /**
     * Gets the "MinVerticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType getMinVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().find_element_user(MINVERTICALEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MinVerticalExtent" element
     */
    public void setMinVerticalExtent(mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType minVerticalExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().find_element_user(MINVERTICALEXTENT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().add_element_user(MINVERTICALEXTENT$0);
            }
            target.set(minVerticalExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "MinVerticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType addNewMinVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().add_element_user(MINVERTICALEXTENT$0);
            return target;
        }
    }
    
    /**
     * Gets the "MaxVerticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType getMaxVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().find_element_user(MAXVERTICALEXTENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MaxVerticalExtent" element
     */
    public void setMaxVerticalExtent(mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType maxVerticalExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().find_element_user(MAXVERTICALEXTENT$2, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().add_element_user(MAXVERTICALEXTENT$2);
            }
            target.set(maxVerticalExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "MaxVerticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType addNewMaxVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().add_element_user(MAXVERTICALEXTENT$2);
            return target;
        }
    }
    
    /**
     * Gets the "unitOfMeasure" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType.Enum getUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITOFMEASURE$4);
            if (target == null)
            {
                return null;
            }
            return (mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "unitOfMeasure" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType xgetUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType)get_store().find_attribute_user(UNITOFMEASURE$4);
            return target;
        }
    }
    
    /**
     * Sets the "unitOfMeasure" attribute
     */
    public void setUnitOfMeasure(mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType.Enum unitOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITOFMEASURE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNITOFMEASURE$4);
            }
            target.setEnumValue(unitOfMeasure);
        }
    }
    
    /**
     * Sets (as xml) the "unitOfMeasure" attribute
     */
    public void xsetUnitOfMeasure(mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType unitOfMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType)get_store().find_attribute_user(UNITOFMEASURE$4);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType)get_store().add_attribute_user(UNITOFMEASURE$4);
            }
            target.set(unitOfMeasure);
        }
    }
    
    /**
     * Gets the "datum" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType.Enum getDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUM$6);
            if (target == null)
            {
                return null;
            }
            return (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "datum" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType xgetDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType)get_store().find_attribute_user(DATUM$6);
            return target;
        }
    }
    
    /**
     * Sets the "datum" attribute
     */
    public void setDatum(mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType.Enum datum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUM$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATUM$6);
            }
            target.setEnumValue(datum);
        }
    }
    
    /**
     * Sets (as xml) the "datum" attribute
     */
    public void xsetDatum(mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType datum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType)get_store().find_attribute_user(DATUM$6);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType)get_store().add_attribute_user(DATUM$6);
            }
            target.set(datum);
        }
    }
}
