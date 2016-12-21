/*
 * XML Type:  VerticalDistanceType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML VerticalDistanceType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is an atomic type that is a restriction of mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType.
 */
public class VerticalDistanceTypeImpl extends org.apache.xmlbeans.impl.values.JavaDoubleHolderEx implements mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType
{
    private static final long serialVersionUID = 1L;
    
    public VerticalDistanceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected VerticalDistanceTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName UNITOFMEASURE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "unitOfMeasure");
    private static final javax.xml.namespace.QName DATUM$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "datum");
    
    
    /**
     * Gets the "unitOfMeasure" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType.Enum getUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITOFMEASURE$0);
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
            target = (mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType)get_store().find_attribute_user(UNITOFMEASURE$0);
            return target;
        }
    }
    
    /**
     * True if has "unitOfMeasure" attribute
     */
    public boolean isSetUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNITOFMEASURE$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITOFMEASURE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNITOFMEASURE$0);
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
            target = (mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType)get_store().find_attribute_user(UNITOFMEASURE$0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.LengthMeasureType)get_store().add_attribute_user(UNITOFMEASURE$0);
            }
            target.set(unitOfMeasure);
        }
    }
    
    /**
     * Unsets the "unitOfMeasure" attribute
     */
    public void unsetUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNITOFMEASURE$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUM$2);
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
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType)get_store().find_attribute_user(DATUM$2);
            return target;
        }
    }
    
    /**
     * True if has "datum" attribute
     */
    public boolean isSetDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATUM$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATUM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATUM$2);
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
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType)get_store().find_attribute_user(DATUM$2);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDatumType)get_store().add_attribute_user(DATUM$2);
            }
            target.set(datum);
        }
    }
    
    /**
     * Unsets the "datum" attribute
     */
    public void unsetDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATUM$2);
        }
    }
}
