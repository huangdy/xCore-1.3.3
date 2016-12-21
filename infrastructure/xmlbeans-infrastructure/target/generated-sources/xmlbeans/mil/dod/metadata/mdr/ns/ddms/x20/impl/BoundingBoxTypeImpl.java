/*
 * XML Type:  BoundingBoxType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML BoundingBoxType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class BoundingBoxTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType
{
    private static final long serialVersionUID = 1L;
    
    public BoundingBoxTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WESTBL$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "WestBL");
    private static final javax.xml.namespace.QName EASTBL$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "EastBL");
    private static final javax.xml.namespace.QName SOUTHBL$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "SouthBL");
    private static final javax.xml.namespace.QName NORTHBL$6 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "NorthBL");
    
    
    /**
     * Gets the "WestBL" element
     */
    public double getWestBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WESTBL$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "WestBL" element
     */
    public org.apache.xmlbeans.XmlDouble xgetWestBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(WESTBL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WestBL" element
     */
    public void setWestBL(double westBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WESTBL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WESTBL$0);
            }
            target.setDoubleValue(westBL);
        }
    }
    
    /**
     * Sets (as xml) the "WestBL" element
     */
    public void xsetWestBL(org.apache.xmlbeans.XmlDouble westBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(WESTBL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(WESTBL$0);
            }
            target.set(westBL);
        }
    }
    
    /**
     * Gets the "EastBL" element
     */
    public double getEastBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EASTBL$2, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "EastBL" element
     */
    public org.apache.xmlbeans.XmlDouble xgetEastBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EASTBL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "EastBL" element
     */
    public void setEastBL(double eastBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EASTBL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EASTBL$2);
            }
            target.setDoubleValue(eastBL);
        }
    }
    
    /**
     * Sets (as xml) the "EastBL" element
     */
    public void xsetEastBL(org.apache.xmlbeans.XmlDouble eastBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(EASTBL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(EASTBL$2);
            }
            target.set(eastBL);
        }
    }
    
    /**
     * Gets the "SouthBL" element
     */
    public double getSouthBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUTHBL$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "SouthBL" element
     */
    public org.apache.xmlbeans.XmlDouble xgetSouthBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SOUTHBL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SouthBL" element
     */
    public void setSouthBL(double southBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOUTHBL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOUTHBL$4);
            }
            target.setDoubleValue(southBL);
        }
    }
    
    /**
     * Sets (as xml) the "SouthBL" element
     */
    public void xsetSouthBL(org.apache.xmlbeans.XmlDouble southBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(SOUTHBL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(SOUTHBL$4);
            }
            target.set(southBL);
        }
    }
    
    /**
     * Gets the "NorthBL" element
     */
    public double getNorthBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHBL$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "NorthBL" element
     */
    public org.apache.xmlbeans.XmlDouble xgetNorthBL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NORTHBL$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NorthBL" element
     */
    public void setNorthBL(double northBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NORTHBL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NORTHBL$6);
            }
            target.setDoubleValue(northBL);
        }
    }
    
    /**
     * Sets (as xml) the "NorthBL" element
     */
    public void xsetNorthBL(org.apache.xmlbeans.XmlDouble northBL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(NORTHBL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(NORTHBL$6);
            }
            target.set(northBL);
        }
    }
}
