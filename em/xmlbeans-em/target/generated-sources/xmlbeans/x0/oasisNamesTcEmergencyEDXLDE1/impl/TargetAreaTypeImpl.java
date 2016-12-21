/*
 * XML Type:  targetAreaType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1.impl;
/**
 * An XML targetAreaType(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
 *
 * This is a complex type.
 */
public class TargetAreaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLDE1.TargetAreaType
{
    private static final long serialVersionUID = 1L;
    
    public TargetAreaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCLE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "circle");
    private static final javax.xml.namespace.QName POLYGON$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "polygon");
    private static final javax.xml.namespace.QName COUNTRY$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "country");
    private static final javax.xml.namespace.QName SUBDIVISION$6 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "subdivision");
    private static final javax.xml.namespace.QName LOCCODEUN$8 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "locCodeUN");
    
    
    /**
     * Gets array of all "circle" elements
     */
    public java.lang.String[] getCircleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CIRCLE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "circle" element
     */
    public java.lang.String getCircleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIRCLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "circle" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCircleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CIRCLE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "circle" element
     */
    public org.apache.xmlbeans.XmlString xgetCircleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIRCLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "circle" element
     */
    public int sizeOfCircleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIRCLE$0);
        }
    }
    
    /**
     * Sets array of all "circle" element
     */
    public void setCircleArray(java.lang.String[] circleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(circleArray, CIRCLE$0);
        }
    }
    
    /**
     * Sets ith "circle" element
     */
    public void setCircleArray(int i, java.lang.String circle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CIRCLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(circle);
        }
    }
    
    /**
     * Sets (as xml) array of all "circle" element
     */
    public void xsetCircleArray(org.apache.xmlbeans.XmlString[]circleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(circleArray, CIRCLE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "circle" element
     */
    public void xsetCircleArray(int i, org.apache.xmlbeans.XmlString circle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CIRCLE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(circle);
        }
    }
    
    /**
     * Inserts the value as the ith "circle" element
     */
    public void insertCircle(int i, java.lang.String circle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CIRCLE$0, i);
            target.setStringValue(circle);
        }
    }
    
    /**
     * Appends the value as the last "circle" element
     */
    public void addCircle(java.lang.String circle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CIRCLE$0);
            target.setStringValue(circle);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "circle" element
     */
    public org.apache.xmlbeans.XmlString insertNewCircle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CIRCLE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "circle" element
     */
    public org.apache.xmlbeans.XmlString addNewCircle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CIRCLE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "circle" element
     */
    public void removeCircle(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIRCLE$0, i);
        }
    }
    
    /**
     * Gets array of all "polygon" elements
     */
    public java.lang.String[] getPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POLYGON$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "polygon" element
     */
    public java.lang.String getPolygonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYGON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "polygon" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POLYGON$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "polygon" element
     */
    public org.apache.xmlbeans.XmlString xgetPolygonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLYGON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "polygon" element
     */
    public int sizeOfPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGON$2);
        }
    }
    
    /**
     * Sets array of all "polygon" element
     */
    public void setPolygonArray(java.lang.String[] polygonArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(polygonArray, POLYGON$2);
        }
    }
    
    /**
     * Sets ith "polygon" element
     */
    public void setPolygonArray(int i, java.lang.String polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POLYGON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(polygon);
        }
    }
    
    /**
     * Sets (as xml) array of all "polygon" element
     */
    public void xsetPolygonArray(org.apache.xmlbeans.XmlString[]polygonArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(polygonArray, POLYGON$2);
        }
    }
    
    /**
     * Sets (as xml) ith "polygon" element
     */
    public void xsetPolygonArray(int i, org.apache.xmlbeans.XmlString polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POLYGON$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(polygon);
        }
    }
    
    /**
     * Inserts the value as the ith "polygon" element
     */
    public void insertPolygon(int i, java.lang.String polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(POLYGON$2, i);
            target.setStringValue(polygon);
        }
    }
    
    /**
     * Appends the value as the last "polygon" element
     */
    public void addPolygon(java.lang.String polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POLYGON$2);
            target.setStringValue(polygon);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "polygon" element
     */
    public org.apache.xmlbeans.XmlString insertNewPolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(POLYGON$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "polygon" element
     */
    public org.apache.xmlbeans.XmlString addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POLYGON$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "polygon" element
     */
    public void removePolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGON$2, i);
        }
    }
    
    /**
     * Gets array of all "country" elements
     */
    public java.lang.String[] getCountryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COUNTRY$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "country" element
     */
    public java.lang.String getCountryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "country" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetCountryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COUNTRY$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "country" element
     */
    public int sizeOfCountryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$4);
        }
    }
    
    /**
     * Sets array of all "country" element
     */
    public void setCountryArray(java.lang.String[] countryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countryArray, COUNTRY$4);
        }
    }
    
    /**
     * Sets ith "country" element
     */
    public void setCountryArray(int i, java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) array of all "country" element
     */
    public void xsetCountryArray(org.apache.xmlbeans.XmlString[]countryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countryArray, COUNTRY$4);
        }
    }
    
    /**
     * Sets (as xml) ith "country" element
     */
    public void xsetCountryArray(int i, org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(country);
        }
    }
    
    /**
     * Inserts the value as the ith "country" element
     */
    public void insertCountry(int i, java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COUNTRY$4, i);
            target.setStringValue(country);
        }
    }
    
    /**
     * Appends the value as the last "country" element
     */
    public void addCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$4);
            target.setStringValue(country);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "country" element
     */
    public org.apache.xmlbeans.XmlString insertNewCountry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COUNTRY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "country" element
     */
    public org.apache.xmlbeans.XmlString addNewCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "country" element
     */
    public void removeCountry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$4, i);
        }
    }
    
    /**
     * Gets array of all "subdivision" elements
     */
    public java.lang.String[] getSubdivisionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBDIVISION$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "subdivision" element
     */
    public java.lang.String getSubdivisionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBDIVISION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "subdivision" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetSubdivisionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBDIVISION$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "subdivision" element
     */
    public org.apache.xmlbeans.XmlString xgetSubdivisionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBDIVISION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "subdivision" element
     */
    public int sizeOfSubdivisionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBDIVISION$6);
        }
    }
    
    /**
     * Sets array of all "subdivision" element
     */
    public void setSubdivisionArray(java.lang.String[] subdivisionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subdivisionArray, SUBDIVISION$6);
        }
    }
    
    /**
     * Sets ith "subdivision" element
     */
    public void setSubdivisionArray(int i, java.lang.String subdivision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBDIVISION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(subdivision);
        }
    }
    
    /**
     * Sets (as xml) array of all "subdivision" element
     */
    public void xsetSubdivisionArray(org.apache.xmlbeans.XmlString[]subdivisionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subdivisionArray, SUBDIVISION$6);
        }
    }
    
    /**
     * Sets (as xml) ith "subdivision" element
     */
    public void xsetSubdivisionArray(int i, org.apache.xmlbeans.XmlString subdivision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBDIVISION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subdivision);
        }
    }
    
    /**
     * Inserts the value as the ith "subdivision" element
     */
    public void insertSubdivision(int i, java.lang.String subdivision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUBDIVISION$6, i);
            target.setStringValue(subdivision);
        }
    }
    
    /**
     * Appends the value as the last "subdivision" element
     */
    public void addSubdivision(java.lang.String subdivision)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBDIVISION$6);
            target.setStringValue(subdivision);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subdivision" element
     */
    public org.apache.xmlbeans.XmlString insertNewSubdivision(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SUBDIVISION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subdivision" element
     */
    public org.apache.xmlbeans.XmlString addNewSubdivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBDIVISION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "subdivision" element
     */
    public void removeSubdivision(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBDIVISION$6, i);
        }
    }
    
    /**
     * Gets array of all "locCodeUN" elements
     */
    public java.lang.String[] getLocCodeUNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCCODEUN$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "locCodeUN" element
     */
    public java.lang.String getLocCodeUNArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCCODEUN$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "locCodeUN" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetLocCodeUNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCCODEUN$8, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "locCodeUN" element
     */
    public org.apache.xmlbeans.XmlString xgetLocCodeUNArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCCODEUN$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "locCodeUN" element
     */
    public int sizeOfLocCodeUNArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCCODEUN$8);
        }
    }
    
    /**
     * Sets array of all "locCodeUN" element
     */
    public void setLocCodeUNArray(java.lang.String[] locCodeUNArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locCodeUNArray, LOCCODEUN$8);
        }
    }
    
    /**
     * Sets ith "locCodeUN" element
     */
    public void setLocCodeUNArray(int i, java.lang.String locCodeUN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCCODEUN$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(locCodeUN);
        }
    }
    
    /**
     * Sets (as xml) array of all "locCodeUN" element
     */
    public void xsetLocCodeUNArray(org.apache.xmlbeans.XmlString[]locCodeUNArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locCodeUNArray, LOCCODEUN$8);
        }
    }
    
    /**
     * Sets (as xml) ith "locCodeUN" element
     */
    public void xsetLocCodeUNArray(int i, org.apache.xmlbeans.XmlString locCodeUN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCCODEUN$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locCodeUN);
        }
    }
    
    /**
     * Inserts the value as the ith "locCodeUN" element
     */
    public void insertLocCodeUN(int i, java.lang.String locCodeUN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LOCCODEUN$8, i);
            target.setStringValue(locCodeUN);
        }
    }
    
    /**
     * Appends the value as the last "locCodeUN" element
     */
    public void addLocCodeUN(java.lang.String locCodeUN)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCCODEUN$8);
            target.setStringValue(locCodeUN);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "locCodeUN" element
     */
    public org.apache.xmlbeans.XmlString insertNewLocCodeUN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LOCCODEUN$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "locCodeUN" element
     */
    public org.apache.xmlbeans.XmlString addNewLocCodeUN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCCODEUN$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "locCodeUN" element
     */
    public void removeLocCodeUN(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCCODEUN$8, i);
        }
    }
}
