/*
 * XML Type:  EnvelopeType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.EnvelopeType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML EnvelopeType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class EnvelopeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.EnvelopeType
{
    private static final long serialVersionUID = 1L;
    
    public EnvelopeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOWERCORNER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "lowerCorner");
    private static final javax.xml.namespace.QName UPPERCORNER$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "upperCorner");
    private static final javax.xml.namespace.QName SRSNAME$4 = 
        new javax.xml.namespace.QName("", "srsName");
    private static final javax.xml.namespace.QName SRSDIMENSION$6 = 
        new javax.xml.namespace.QName("", "srsDimension");
    private static final javax.xml.namespace.QName AXISLABELS$8 = 
        new javax.xml.namespace.QName("", "axisLabels");
    private static final javax.xml.namespace.QName UOMLABELS$10 = 
        new javax.xml.namespace.QName("", "uomLabels");
    
    
    /**
     * Gets the "lowerCorner" element
     */
    public net.opengis.gml.x32.DirectPositionType getLowerCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(LOWERCORNER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "lowerCorner" element
     */
    public void setLowerCorner(net.opengis.gml.x32.DirectPositionType lowerCorner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(LOWERCORNER$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(LOWERCORNER$0);
            }
            target.set(lowerCorner);
        }
    }
    
    /**
     * Appends and returns a new empty "lowerCorner" element
     */
    public net.opengis.gml.x32.DirectPositionType addNewLowerCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(LOWERCORNER$0);
            return target;
        }
    }
    
    /**
     * Gets the "upperCorner" element
     */
    public net.opengis.gml.x32.DirectPositionType getUpperCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(UPPERCORNER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "upperCorner" element
     */
    public void setUpperCorner(net.opengis.gml.x32.DirectPositionType upperCorner)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(UPPERCORNER$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(UPPERCORNER$2);
            }
            target.set(upperCorner);
        }
    }
    
    /**
     * Appends and returns a new empty "upperCorner" element
     */
    public net.opengis.gml.x32.DirectPositionType addNewUpperCorner()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(UPPERCORNER$2);
            return target;
        }
    }
    
    /**
     * Gets the "srsName" attribute
     */
    public java.lang.String getSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "srsName" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "srsName" attribute
     */
    public boolean isSetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRSNAME$4) != null;
        }
    }
    
    /**
     * Sets the "srsName" attribute
     */
    public void setSrsName(java.lang.String srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRSNAME$4);
            }
            target.setStringValue(srsName);
        }
    }
    
    /**
     * Sets (as xml) the "srsName" attribute
     */
    public void xsetSrsName(org.apache.xmlbeans.XmlAnyURI srsName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SRSNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SRSNAME$4);
            }
            target.set(srsName);
        }
    }
    
    /**
     * Unsets the "srsName" attribute
     */
    public void unsetSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRSNAME$4);
        }
    }
    
    /**
     * Gets the "srsDimension" attribute
     */
    public java.math.BigInteger getSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSDIMENSION$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "srsDimension" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SRSDIMENSION$6);
            return target;
        }
    }
    
    /**
     * True if has "srsDimension" attribute
     */
    public boolean isSetSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SRSDIMENSION$6) != null;
        }
    }
    
    /**
     * Sets the "srsDimension" attribute
     */
    public void setSrsDimension(java.math.BigInteger srsDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SRSDIMENSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SRSDIMENSION$6);
            }
            target.setBigIntegerValue(srsDimension);
        }
    }
    
    /**
     * Sets (as xml) the "srsDimension" attribute
     */
    public void xsetSrsDimension(org.apache.xmlbeans.XmlPositiveInteger srsDimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(SRSDIMENSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(SRSDIMENSION$6);
            }
            target.set(srsDimension);
        }
    }
    
    /**
     * Unsets the "srsDimension" attribute
     */
    public void unsetSrsDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SRSDIMENSION$6);
        }
    }
    
    /**
     * Gets the "axisLabels" attribute
     */
    public java.util.List getAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXISLABELS$8);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "axisLabels" attribute
     */
    public net.opengis.gml.x32.NCNameList xgetAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NCNameList target = null;
            target = (net.opengis.gml.x32.NCNameList)get_store().find_attribute_user(AXISLABELS$8);
            return target;
        }
    }
    
    /**
     * True if has "axisLabels" attribute
     */
    public boolean isSetAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AXISLABELS$8) != null;
        }
    }
    
    /**
     * Sets the "axisLabels" attribute
     */
    public void setAxisLabels(java.util.List axisLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXISLABELS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AXISLABELS$8);
            }
            target.setListValue(axisLabels);
        }
    }
    
    /**
     * Sets (as xml) the "axisLabels" attribute
     */
    public void xsetAxisLabels(net.opengis.gml.x32.NCNameList axisLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NCNameList target = null;
            target = (net.opengis.gml.x32.NCNameList)get_store().find_attribute_user(AXISLABELS$8);
            if (target == null)
            {
                target = (net.opengis.gml.x32.NCNameList)get_store().add_attribute_user(AXISLABELS$8);
            }
            target.set(axisLabels);
        }
    }
    
    /**
     * Unsets the "axisLabels" attribute
     */
    public void unsetAxisLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AXISLABELS$8);
        }
    }
    
    /**
     * Gets the "uomLabels" attribute
     */
    public java.util.List getUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOMLABELS$10);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "uomLabels" attribute
     */
    public net.opengis.gml.x32.NCNameList xgetUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NCNameList target = null;
            target = (net.opengis.gml.x32.NCNameList)get_store().find_attribute_user(UOMLABELS$10);
            return target;
        }
    }
    
    /**
     * True if has "uomLabels" attribute
     */
    public boolean isSetUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UOMLABELS$10) != null;
        }
    }
    
    /**
     * Sets the "uomLabels" attribute
     */
    public void setUomLabels(java.util.List uomLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UOMLABELS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UOMLABELS$10);
            }
            target.setListValue(uomLabels);
        }
    }
    
    /**
     * Sets (as xml) the "uomLabels" attribute
     */
    public void xsetUomLabels(net.opengis.gml.x32.NCNameList uomLabels)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.NCNameList target = null;
            target = (net.opengis.gml.x32.NCNameList)get_store().find_attribute_user(UOMLABELS$10);
            if (target == null)
            {
                target = (net.opengis.gml.x32.NCNameList)get_store().add_attribute_user(UOMLABELS$10);
            }
            target.set(uomLabels);
        }
    }
    
    /**
     * Unsets the "uomLabels" attribute
     */
    public void unsetUomLabels()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UOMLABELS$10);
        }
    }
}
