/*
 * XML Type:  BoundingBoxType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.BoundingBoxType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML BoundingBoxType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class BoundingBoxTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.BoundingBoxType
{
    private static final long serialVersionUID = 1L;
    
    public BoundingBoxTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SRS$0 = 
        new javax.xml.namespace.QName("", "SRS");
    private static final javax.xml.namespace.QName MINX$2 = 
        new javax.xml.namespace.QName("", "minx");
    private static final javax.xml.namespace.QName MINY$4 = 
        new javax.xml.namespace.QName("", "miny");
    private static final javax.xml.namespace.QName MAXX$6 = 
        new javax.xml.namespace.QName("", "maxx");
    private static final javax.xml.namespace.QName MAXY$8 = 
        new javax.xml.namespace.QName("", "maxy");
    
    
    /**
     * Gets the "SRS" attribute
     */
    public java.lang.String getSRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRS$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SRS" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRS$0);
            return target;
        }
    }
    
    /**
     * Sets the "SRS" attribute
     */
    public void setSRS(java.lang.String srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRS$0);
            }
            target.setStringValue(srs);
        }
    }
    
    /**
     * Sets (as xml) the "SRS" attribute
     */
    public void xsetSRS(org.apache.xmlbeans.XmlString srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SRS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SRS$0);
            }
            target.set(srs);
        }
    }
    
    /**
     * Gets the "minx" attribute
     */
    public java.math.BigDecimal getMinx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINX$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "minx" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetMinx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MINX$2);
            return target;
        }
    }
    
    /**
     * Sets the "minx" attribute
     */
    public void setMinx(java.math.BigDecimal minx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINX$2);
            }
            target.setBigDecimalValue(minx);
        }
    }
    
    /**
     * Sets (as xml) the "minx" attribute
     */
    public void xsetMinx(org.apache.xmlbeans.XmlDecimal minx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MINX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(MINX$2);
            }
            target.set(minx);
        }
    }
    
    /**
     * Gets the "miny" attribute
     */
    public java.math.BigDecimal getMiny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINY$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "miny" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetMiny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MINY$4);
            return target;
        }
    }
    
    /**
     * Sets the "miny" attribute
     */
    public void setMiny(java.math.BigDecimal miny)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MINY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MINY$4);
            }
            target.setBigDecimalValue(miny);
        }
    }
    
    /**
     * Sets (as xml) the "miny" attribute
     */
    public void xsetMiny(org.apache.xmlbeans.XmlDecimal miny)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MINY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(MINY$4);
            }
            target.set(miny);
        }
    }
    
    /**
     * Gets the "maxx" attribute
     */
    public java.math.BigDecimal getMaxx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXX$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxx" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetMaxx()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MAXX$6);
            return target;
        }
    }
    
    /**
     * Sets the "maxx" attribute
     */
    public void setMaxx(java.math.BigDecimal maxx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXX$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXX$6);
            }
            target.setBigDecimalValue(maxx);
        }
    }
    
    /**
     * Sets (as xml) the "maxx" attribute
     */
    public void xsetMaxx(org.apache.xmlbeans.XmlDecimal maxx)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MAXX$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(MAXX$6);
            }
            target.set(maxx);
        }
    }
    
    /**
     * Gets the "maxy" attribute
     */
    public java.math.BigDecimal getMaxy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXY$8);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "maxy" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetMaxy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MAXY$8);
            return target;
        }
    }
    
    /**
     * Sets the "maxy" attribute
     */
    public void setMaxy(java.math.BigDecimal maxy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MAXY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MAXY$8);
            }
            target.setBigDecimalValue(maxy);
        }
    }
    
    /**
     * Sets (as xml) the "maxy" attribute
     */
    public void xsetMaxy(org.apache.xmlbeans.XmlDecimal maxy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(MAXY$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(MAXY$8);
            }
            target.set(maxy);
        }
    }
}
