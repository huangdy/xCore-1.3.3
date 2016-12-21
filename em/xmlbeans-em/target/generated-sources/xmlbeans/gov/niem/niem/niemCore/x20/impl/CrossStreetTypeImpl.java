/*
 * XML Type:  CrossStreetType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CrossStreetType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML CrossStreetType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class CrossStreetTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.CrossStreetType
{
    private static final long serialVersionUID = 1L;
    
    public CrossStreetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CROSSSTREETDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CrossStreetDescriptionText");
    private static final javax.xml.namespace.QName CROSSSTREETRELATIVELOCATION$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CrossStreetRelativeLocation");
    
    
    /**
     * Gets array of all "CrossStreetDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getCrossStreetDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CROSSSTREETDESCRIPTIONTEXT$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CrossStreetDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getCrossStreetDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CROSSSTREETDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CrossStreetDescriptionText" element
     */
    public boolean isNilCrossStreetDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CROSSSTREETDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CrossStreetDescriptionText" element
     */
    public int sizeOfCrossStreetDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CROSSSTREETDESCRIPTIONTEXT$0);
        }
    }
    
    /**
     * Sets array of all "CrossStreetDescriptionText" element
     */
    public void setCrossStreetDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] crossStreetDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(crossStreetDescriptionTextArray, CROSSSTREETDESCRIPTIONTEXT$0);
        }
    }
    
    /**
     * Sets ith "CrossStreetDescriptionText" element
     */
    public void setCrossStreetDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType crossStreetDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CROSSSTREETDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(crossStreetDescriptionText);
        }
    }
    
    /**
     * Nils the ith "CrossStreetDescriptionText" element
     */
    public void setNilCrossStreetDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CROSSSTREETDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CrossStreetDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewCrossStreetDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(CROSSSTREETDESCRIPTIONTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CrossStreetDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewCrossStreetDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CROSSSTREETDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CrossStreetDescriptionText" element
     */
    public void removeCrossStreetDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CROSSSTREETDESCRIPTIONTEXT$0, i);
        }
    }
    
    /**
     * Gets array of all "CrossStreetRelativeLocation" elements
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationType[] getCrossStreetRelativeLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CROSSSTREETRELATIVELOCATION$2, targetList);
            gov.niem.niem.niemCore.x20.RelativeLocationType[] result = new gov.niem.niem.niemCore.x20.RelativeLocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CrossStreetRelativeLocation" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationType getCrossStreetRelativeLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().find_element_user(CROSSSTREETRELATIVELOCATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CrossStreetRelativeLocation" element
     */
    public boolean isNilCrossStreetRelativeLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().find_element_user(CROSSSTREETRELATIVELOCATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CrossStreetRelativeLocation" element
     */
    public int sizeOfCrossStreetRelativeLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CROSSSTREETRELATIVELOCATION$2);
        }
    }
    
    /**
     * Sets array of all "CrossStreetRelativeLocation" element
     */
    public void setCrossStreetRelativeLocationArray(gov.niem.niem.niemCore.x20.RelativeLocationType[] crossStreetRelativeLocationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(crossStreetRelativeLocationArray, CROSSSTREETRELATIVELOCATION$2);
        }
    }
    
    /**
     * Sets ith "CrossStreetRelativeLocation" element
     */
    public void setCrossStreetRelativeLocationArray(int i, gov.niem.niem.niemCore.x20.RelativeLocationType crossStreetRelativeLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().find_element_user(CROSSSTREETRELATIVELOCATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(crossStreetRelativeLocation);
        }
    }
    
    /**
     * Nils the ith "CrossStreetRelativeLocation" element
     */
    public void setNilCrossStreetRelativeLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().find_element_user(CROSSSTREETRELATIVELOCATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CrossStreetRelativeLocation" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationType insertNewCrossStreetRelativeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().insert_element_user(CROSSSTREETRELATIVELOCATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CrossStreetRelativeLocation" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationType addNewCrossStreetRelativeLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationType)get_store().add_element_user(CROSSSTREETRELATIVELOCATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "CrossStreetRelativeLocation" element
     */
    public void removeCrossStreetRelativeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CROSSSTREETRELATIVELOCATION$2, i);
        }
    }
}
