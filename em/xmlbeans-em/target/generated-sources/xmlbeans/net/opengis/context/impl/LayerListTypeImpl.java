/*
 * XML Type:  LayerListType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.LayerListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML LayerListType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class LayerListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.LayerListType
{
    private static final long serialVersionUID = 1L;
    
    public LayerListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LAYER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Layer");
    
    
    /**
     * Gets array of all "Layer" elements
     */
    public net.opengis.context.LayerType[] getLayerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LAYER$0, targetList);
            net.opengis.context.LayerType[] result = new net.opengis.context.LayerType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Layer" element
     */
    public net.opengis.context.LayerType getLayerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerType target = null;
            target = (net.opengis.context.LayerType)get_store().find_element_user(LAYER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Layer" element
     */
    public int sizeOfLayerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LAYER$0);
        }
    }
    
    /**
     * Sets array of all "Layer" element
     */
    public void setLayerArray(net.opengis.context.LayerType[] layerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(layerArray, LAYER$0);
        }
    }
    
    /**
     * Sets ith "Layer" element
     */
    public void setLayerArray(int i, net.opengis.context.LayerType layer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerType target = null;
            target = (net.opengis.context.LayerType)get_store().find_element_user(LAYER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(layer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Layer" element
     */
    public net.opengis.context.LayerType insertNewLayer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerType target = null;
            target = (net.opengis.context.LayerType)get_store().insert_element_user(LAYER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Layer" element
     */
    public net.opengis.context.LayerType addNewLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerType target = null;
            target = (net.opengis.context.LayerType)get_store().add_element_user(LAYER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Layer" element
     */
    public void removeLayer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LAYER$0, i);
        }
    }
}
