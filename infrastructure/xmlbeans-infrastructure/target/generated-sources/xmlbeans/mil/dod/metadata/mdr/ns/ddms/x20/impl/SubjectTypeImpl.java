/*
 * XML Type:  SubjectType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.SubjectType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML SubjectType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class SubjectTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.SubjectType
{
    private static final long serialVersionUID = 1L;
    
    public SubjectTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "category");
    private static final javax.xml.namespace.QName KEYWORD$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "keyword");
    
    
    /**
     * Gets array of all "category" elements
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$0, targetList);
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType[] result = new mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "category" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$0);
        }
    }
    
    /**
     * Sets array of all "category" element
     */
    public void setCategoryArray(mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$0);
        }
    }
    
    /**
     * Sets ith "category" element
     */
    public void setCategoryArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType)get_store().insert_element_user(CATEGORY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundCategoryIdentifierType)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$0, i);
        }
    }
    
    /**
     * Gets array of all "keyword" elements
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType[] getKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYWORD$2, targetList);
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType[] result = new mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "keyword" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType getKeywordArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType)get_store().find_element_user(KEYWORD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "keyword" element
     */
    public int sizeOfKeywordArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORD$2);
        }
    }
    
    /**
     * Sets array of all "keyword" element
     */
    public void setKeywordArray(mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType[] keywordArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keywordArray, KEYWORD$2);
        }
    }
    
    /**
     * Sets ith "keyword" element
     */
    public void setKeywordArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType keyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType)get_store().find_element_user(KEYWORD$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyword);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyword" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType insertNewKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType)get_store().insert_element_user(KEYWORD$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keyword" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType addNewKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundKeywordIdentifierType)get_store().add_element_user(KEYWORD$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "keyword" element
     */
    public void removeKeyword(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORD$2, i);
        }
    }
}
