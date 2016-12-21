/*
 * XML Type:  StyleListType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.StyleListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML StyleListType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class StyleListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.StyleListType
{
    private static final long serialVersionUID = 1L;
    
    public StyleListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Style");
    
    
    /**
     * Gets array of all "Style" elements
     */
    public net.opengis.context.StyleType[] getStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STYLE$0, targetList);
            net.opengis.context.StyleType[] result = new net.opengis.context.StyleType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Style" element
     */
    public net.opengis.context.StyleType getStyleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.StyleType target = null;
            target = (net.opengis.context.StyleType)get_store().find_element_user(STYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Style" element
     */
    public int sizeOfStyleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLE$0);
        }
    }
    
    /**
     * Sets array of all "Style" element
     */
    public void setStyleArray(net.opengis.context.StyleType[] styleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(styleArray, STYLE$0);
        }
    }
    
    /**
     * Sets ith "Style" element
     */
    public void setStyleArray(int i, net.opengis.context.StyleType style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.StyleType target = null;
            target = (net.opengis.context.StyleType)get_store().find_element_user(STYLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(style);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Style" element
     */
    public net.opengis.context.StyleType insertNewStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.StyleType target = null;
            target = (net.opengis.context.StyleType)get_store().insert_element_user(STYLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Style" element
     */
    public net.opengis.context.StyleType addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.StyleType target = null;
            target = (net.opengis.context.StyleType)get_store().add_element_user(STYLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Style" element
     */
    public void removeStyle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLE$0, i);
        }
    }
}
