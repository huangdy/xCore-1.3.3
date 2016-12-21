/*
 * XML Type:  DimensionListType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.DimensionListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML DimensionListType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class DimensionListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.DimensionListType
{
    private static final long serialVersionUID = 1L;
    
    public DimensionListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIMENSION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Dimension");
    
    
    /**
     * Gets array of all "Dimension" elements
     */
    public net.opengis.context.DimensionType[] getDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIMENSION$0, targetList);
            net.opengis.context.DimensionType[] result = new net.opengis.context.DimensionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Dimension" element
     */
    public net.opengis.context.DimensionType getDimensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.DimensionType target = null;
            target = (net.opengis.context.DimensionType)get_store().find_element_user(DIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Dimension" element
     */
    public int sizeOfDimensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSION$0);
        }
    }
    
    /**
     * Sets array of all "Dimension" element
     */
    public void setDimensionArray(net.opengis.context.DimensionType[] dimensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dimensionArray, DIMENSION$0);
        }
    }
    
    /**
     * Sets ith "Dimension" element
     */
    public void setDimensionArray(int i, net.opengis.context.DimensionType dimension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.DimensionType target = null;
            target = (net.opengis.context.DimensionType)get_store().find_element_user(DIMENSION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dimension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Dimension" element
     */
    public net.opengis.context.DimensionType insertNewDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.DimensionType target = null;
            target = (net.opengis.context.DimensionType)get_store().insert_element_user(DIMENSION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Dimension" element
     */
    public net.opengis.context.DimensionType addNewDimension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.DimensionType target = null;
            target = (net.opengis.context.DimensionType)get_store().add_element_user(DIMENSION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Dimension" element
     */
    public void removeDimension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSION$0, i);
        }
    }
}
