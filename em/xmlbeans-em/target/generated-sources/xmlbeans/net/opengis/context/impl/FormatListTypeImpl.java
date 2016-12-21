/*
 * XML Type:  FormatListType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.FormatListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML FormatListType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class FormatListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.FormatListType
{
    private static final long serialVersionUID = 1L;
    
    public FormatListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Format");
    
    
    /**
     * Gets array of all "Format" elements
     */
    public net.opengis.context.FormatType[] getFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FORMAT$0, targetList);
            net.opengis.context.FormatType[] result = new net.opengis.context.FormatType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Format" element
     */
    public net.opengis.context.FormatType getFormatArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.FormatType target = null;
            target = (net.opengis.context.FormatType)get_store().find_element_user(FORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Format" element
     */
    public int sizeOfFormatArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMAT$0);
        }
    }
    
    /**
     * Sets array of all "Format" element
     */
    public void setFormatArray(net.opengis.context.FormatType[] formatArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(formatArray, FORMAT$0);
        }
    }
    
    /**
     * Sets ith "Format" element
     */
    public void setFormatArray(int i, net.opengis.context.FormatType format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.FormatType target = null;
            target = (net.opengis.context.FormatType)get_store().find_element_user(FORMAT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(format);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Format" element
     */
    public net.opengis.context.FormatType insertNewFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.FormatType target = null;
            target = (net.opengis.context.FormatType)get_store().insert_element_user(FORMAT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Format" element
     */
    public net.opengis.context.FormatType addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.FormatType target = null;
            target = (net.opengis.context.FormatType)get_store().add_element_user(FORMAT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Format" element
     */
    public void removeFormat(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMAT$0, i);
        }
    }
}
