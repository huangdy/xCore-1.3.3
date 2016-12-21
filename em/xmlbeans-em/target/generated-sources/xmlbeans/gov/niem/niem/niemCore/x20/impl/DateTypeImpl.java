/*
 * XML Type:  DateType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.DateType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML DateType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class DateTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.DateType
{
    private static final long serialVersionUID = 1L;
    
    public DateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATEREPRESENTATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "DateRepresentation");
    private static final org.apache.xmlbeans.QNameSet DATEREPRESENTATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "DateRepresentation"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "DateTime"),
    });
    
    
    /**
     * Gets array of all "DateRepresentation" elements
     */
    public org.apache.xmlbeans.XmlObject[] getDateRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATEREPRESENTATION$1, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject getDateRepresentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATEREPRESENTATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DateRepresentation" element
     */
    public int sizeOfDateRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATEREPRESENTATION$1);
        }
    }
    
    /**
     * Sets array of all "DateRepresentation" element
     */
    public void setDateRepresentationArray(org.apache.xmlbeans.XmlObject[] dateRepresentationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dateRepresentationArray, DATEREPRESENTATION$0, DATEREPRESENTATION$1);
        }
    }
    
    /**
     * Sets ith "DateRepresentation" element
     */
    public void setDateRepresentationArray(int i, org.apache.xmlbeans.XmlObject dateRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATEREPRESENTATION$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dateRepresentation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject insertNewDateRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(DATEREPRESENTATION$1, DATEREPRESENTATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject addNewDateRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATEREPRESENTATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DateRepresentation" element
     */
    public void removeDateRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATEREPRESENTATION$1, i);
        }
    }
}
