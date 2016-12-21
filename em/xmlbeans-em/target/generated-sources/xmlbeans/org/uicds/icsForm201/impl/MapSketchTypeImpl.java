/*
 * XML Type:  MapSketchType
 * Namespace: http://uicds.org/ICSForm201
 * Java type: org.uicds.icsForm201.MapSketchType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm201.impl;
/**
 * An XML MapSketchType(@http://uicds.org/ICSForm201).
 *
 * This is a complex type.
 */
public class MapSketchTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm201.MapSketchType
{
    private static final long serialVersionUID = 1L;
    
    public MapSketchTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPSKETCH$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "MapSketch");
    private static final javax.xml.namespace.QName PREPAREDBY$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "PreparedBy");
    private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$4 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
    
    
    /**
     * Gets the "MapSketch" element
     */
    public byte getMapSketch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPSKETCH$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getByteValue();
        }
    }
    
    /**
     * Gets (as xml) the "MapSketch" element
     */
    public org.apache.xmlbeans.XmlByte xgetMapSketch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(MAPSKETCH$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MapSketch" element
     */
    public void setMapSketch(byte mapSketch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAPSKETCH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAPSKETCH$0);
            }
            target.setByteValue(mapSketch);
        }
    }
    
    /**
     * Sets (as xml) the "MapSketch" element
     */
    public void xsetMapSketch(org.apache.xmlbeans.XmlByte mapSketch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlByte target = null;
            target = (org.apache.xmlbeans.XmlByte)get_store().find_element_user(MAPSKETCH$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlByte)get_store().add_element_user(MAPSKETCH$0);
            }
            target.set(mapSketch);
        }
    }
    
    /**
     * Gets the "PreparedBy" element
     */
    public java.lang.String getPreparedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreparedBy" element
     */
    public org.apache.xmlbeans.XmlString xgetPreparedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PreparedBy" element
     */
    public void setPreparedBy(java.lang.String preparedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAREDBY$2);
            }
            target.setStringValue(preparedBy);
        }
    }
    
    /**
     * Sets (as xml) the "PreparedBy" element
     */
    public void xsetPreparedBy(org.apache.xmlbeans.XmlString preparedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREPAREDBY$2);
            }
            target.set(preparedBy);
        }
    }
    
    /**
     * Gets the "WorkProductIdentification" element
     */
    public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductIdentification" element
     */
    public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$4, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$4);
            }
            target.set(workProductIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductIdentification" element
     */
    public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$4);
            return target;
        }
    }
}
