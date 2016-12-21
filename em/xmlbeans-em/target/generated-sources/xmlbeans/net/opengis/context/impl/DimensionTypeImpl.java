/*
 * XML Type:  DimensionType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.DimensionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML DimensionType(@http://www.opengis.net/context).
 *
 * This is an atomic type that is a restriction of net.opengis.context.DimensionType.
 */
public class DimensionTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements net.opengis.context.DimensionType
{
    private static final long serialVersionUID = 1L;
    
    public DimensionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected DimensionTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName UNITS$2 = 
        new javax.xml.namespace.QName("", "units");
    private static final javax.xml.namespace.QName UNITSYMBOL$4 = 
        new javax.xml.namespace.QName("", "unitSymbol");
    private static final javax.xml.namespace.QName USERVALUE$6 = 
        new javax.xml.namespace.QName("", "userValue");
    private static final javax.xml.namespace.QName DEFAULT$8 = 
        new javax.xml.namespace.QName("", "default");
    private static final javax.xml.namespace.QName MULTIPLEVALUES$10 = 
        new javax.xml.namespace.QName("", "multipleValues");
    private static final javax.xml.namespace.QName NEARESTVALUE$12 = 
        new javax.xml.namespace.QName("", "nearestValue");
    private static final javax.xml.namespace.QName CURRENT$14 = 
        new javax.xml.namespace.QName("", "current");
    
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "units" attribute
     */
    public java.lang.String getUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITS$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "units" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUnits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNITS$2);
            return target;
        }
    }
    
    /**
     * Sets the "units" attribute
     */
    public void setUnits(java.lang.String units)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNITS$2);
            }
            target.setStringValue(units);
        }
    }
    
    /**
     * Sets (as xml) the "units" attribute
     */
    public void xsetUnits(org.apache.xmlbeans.XmlString units)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNITS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNITS$2);
            }
            target.set(units);
        }
    }
    
    /**
     * Gets the "unitSymbol" attribute
     */
    public java.lang.String getUnitSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITSYMBOL$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "unitSymbol" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUnitSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNITSYMBOL$4);
            return target;
        }
    }
    
    /**
     * Sets the "unitSymbol" attribute
     */
    public void setUnitSymbol(java.lang.String unitSymbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNITSYMBOL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNITSYMBOL$4);
            }
            target.setStringValue(unitSymbol);
        }
    }
    
    /**
     * Sets (as xml) the "unitSymbol" attribute
     */
    public void xsetUnitSymbol(org.apache.xmlbeans.XmlString unitSymbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNITSYMBOL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNITSYMBOL$4);
            }
            target.set(unitSymbol);
        }
    }
    
    /**
     * Gets the "userValue" attribute
     */
    public java.lang.String getUserValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERVALUE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userValue" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUserValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERVALUE$6);
            return target;
        }
    }
    
    /**
     * Sets the "userValue" attribute
     */
    public void setUserValue(java.lang.String userValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERVALUE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERVALUE$6);
            }
            target.setStringValue(userValue);
        }
    }
    
    /**
     * Sets (as xml) the "userValue" attribute
     */
    public void xsetUserValue(org.apache.xmlbeans.XmlString userValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERVALUE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USERVALUE$6);
            }
            target.set(userValue);
        }
    }
    
    /**
     * Gets the "default" attribute
     */
    public java.lang.String getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$8);
            return target;
        }
    }
    
    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULT$8) != null;
        }
    }
    
    /**
     * Sets the "default" attribute
     */
    public void setDefault(java.lang.String xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$8);
            }
            target.setStringValue(xdefault);
        }
    }
    
    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.apache.xmlbeans.XmlString xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DEFAULT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DEFAULT$8);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULT$8);
        }
    }
    
    /**
     * Gets the "multipleValues" attribute
     */
    public boolean getMultipleValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIPLEVALUES$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "multipleValues" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMultipleValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MULTIPLEVALUES$10);
            return target;
        }
    }
    
    /**
     * True if has "multipleValues" attribute
     */
    public boolean isSetMultipleValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MULTIPLEVALUES$10) != null;
        }
    }
    
    /**
     * Sets the "multipleValues" attribute
     */
    public void setMultipleValues(boolean multipleValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MULTIPLEVALUES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MULTIPLEVALUES$10);
            }
            target.setBooleanValue(multipleValues);
        }
    }
    
    /**
     * Sets (as xml) the "multipleValues" attribute
     */
    public void xsetMultipleValues(org.apache.xmlbeans.XmlBoolean multipleValues)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MULTIPLEVALUES$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MULTIPLEVALUES$10);
            }
            target.set(multipleValues);
        }
    }
    
    /**
     * Unsets the "multipleValues" attribute
     */
    public void unsetMultipleValues()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MULTIPLEVALUES$10);
        }
    }
    
    /**
     * Gets the "nearestValue" attribute
     */
    public boolean getNearestValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEARESTVALUE$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "nearestValue" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetNearestValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NEARESTVALUE$12);
            return target;
        }
    }
    
    /**
     * True if has "nearestValue" attribute
     */
    public boolean isSetNearestValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NEARESTVALUE$12) != null;
        }
    }
    
    /**
     * Sets the "nearestValue" attribute
     */
    public void setNearestValue(boolean nearestValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NEARESTVALUE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NEARESTVALUE$12);
            }
            target.setBooleanValue(nearestValue);
        }
    }
    
    /**
     * Sets (as xml) the "nearestValue" attribute
     */
    public void xsetNearestValue(org.apache.xmlbeans.XmlBoolean nearestValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(NEARESTVALUE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(NEARESTVALUE$12);
            }
            target.set(nearestValue);
        }
    }
    
    /**
     * Unsets the "nearestValue" attribute
     */
    public void unsetNearestValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NEARESTVALUE$12);
        }
    }
    
    /**
     * Gets the "current" attribute
     */
    public boolean getCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENT$14);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "current" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURRENT$14);
            return target;
        }
    }
    
    /**
     * True if has "current" attribute
     */
    public boolean isSetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CURRENT$14) != null;
        }
    }
    
    /**
     * Sets the "current" attribute
     */
    public void setCurrent(boolean current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENT$14);
            }
            target.setBooleanValue(current);
        }
    }
    
    /**
     * Sets (as xml) the "current" attribute
     */
    public void xsetCurrent(org.apache.xmlbeans.XmlBoolean current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURRENT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CURRENT$14);
            }
            target.set(current);
        }
    }
    
    /**
     * Unsets the "current" attribute
     */
    public void unsetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CURRENT$14);
        }
    }
}
