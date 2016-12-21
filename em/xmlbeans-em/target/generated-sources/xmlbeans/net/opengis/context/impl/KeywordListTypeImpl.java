/*
 * XML Type:  KeywordListType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.KeywordListType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML KeywordListType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class KeywordListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.KeywordListType
{
    private static final long serialVersionUID = 1L;
    
    public KeywordListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYWORD$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Keyword");
    
    
    /**
     * Gets array of all "Keyword" elements
     */
    public java.lang.String[] getKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYWORD$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Keyword" element
     */
    public java.lang.String getKeywordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Keyword" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYWORD$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Keyword" element
     */
    public org.apache.xmlbeans.XmlString xgetKeywordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "Keyword" element
     */
    public int sizeOfKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORD$0);
        }
    }
    
    /**
     * Sets array of all "Keyword" element
     */
    public void setKeywordArray(java.lang.String[] keywordArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$0);
        }
    }
    
    /**
     * Sets ith "Keyword" element
     */
    public void setKeywordArray(int i, java.lang.String keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEYWORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(keyword);
        }
    }
    
    /**
     * Sets (as xml) array of all "Keyword" element
     */
    public void xsetKeywordArray(org.apache.xmlbeans.XmlString[]keywordArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Keyword" element
     */
    public void xsetKeywordArray(int i, org.apache.xmlbeans.XmlString keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEYWORD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyword);
        }
    }
    
    /**
     * Inserts the value as the ith "Keyword" element
     */
    public void insertKeyword(int i, java.lang.String keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(KEYWORD$0, i);
            target.setStringValue(keyword);
        }
    }
    
    /**
     * Appends the value as the last "Keyword" element
     */
    public void addKeyword(java.lang.String keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEYWORD$0);
            target.setStringValue(keyword);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
     */
    public org.apache.xmlbeans.XmlString insertNewKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(KEYWORD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Keyword" element
     */
    public org.apache.xmlbeans.XmlString addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEYWORD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Keyword" element
     */
    public void removeKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORD$0, i);
        }
    }
}
