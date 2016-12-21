/*
 * XML Type:  PlaceType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.PlaceType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML PlaceType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class PlaceTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.PlaceType
{
    private static final long serialVersionUID = 1L;
    
    public PlaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICIDENTIFIER$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "geographicIdentifier");
    private static final javax.xml.namespace.QName BOUNDINGBOX$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "boundingBox");
    private static final javax.xml.namespace.QName BOUNDINGGEOMETRY$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "boundingGeometry");
    private static final javax.xml.namespace.QName POSTALADDRESS$6 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "postalAddress");
    private static final javax.xml.namespace.QName VERTICALEXTENT$8 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "verticalExtent");
    
    
    /**
     * Gets array of all "geographicIdentifier" elements
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier[] getGeographicIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOGRAPHICIDENTIFIER$0, targetList);
            mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier[] result = new mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "geographicIdentifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier getGeographicIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier)get_store().find_element_user(GEOGRAPHICIDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "geographicIdentifier" element
     */
    public int sizeOfGeographicIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOGRAPHICIDENTIFIER$0);
        }
    }
    
    /**
     * Sets array of all "geographicIdentifier" element
     */
    public void setGeographicIdentifierArray(mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier[] geographicIdentifierArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geographicIdentifierArray, GEOGRAPHICIDENTIFIER$0);
        }
    }
    
    /**
     * Sets ith "geographicIdentifier" element
     */
    public void setGeographicIdentifierArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier geographicIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier)get_store().find_element_user(GEOGRAPHICIDENTIFIER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geographicIdentifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "geographicIdentifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier insertNewGeographicIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier)get_store().insert_element_user(GEOGRAPHICIDENTIFIER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "geographicIdentifier" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier addNewGeographicIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier)get_store().add_element_user(GEOGRAPHICIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "geographicIdentifier" element
     */
    public void removeGeographicIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOGRAPHICIDENTIFIER$0, i);
        }
    }
    
    /**
     * Gets array of all "boundingBox" elements
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType[] getBoundingBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOUNDINGBOX$2, targetList);
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType[] result = new mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "boundingBox" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType getBoundingBoxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().find_element_user(BOUNDINGBOX$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "boundingBox" element
     */
    public int sizeOfBoundingBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDINGBOX$2);
        }
    }
    
    /**
     * Sets array of all "boundingBox" element
     */
    public void setBoundingBoxArray(mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType[] boundingBoxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(boundingBoxArray, BOUNDINGBOX$2);
        }
    }
    
    /**
     * Sets ith "boundingBox" element
     */
    public void setBoundingBoxArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType boundingBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().find_element_user(BOUNDINGBOX$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(boundingBox);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "boundingBox" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType insertNewBoundingBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().insert_element_user(BOUNDINGBOX$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "boundingBox" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType addNewBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().add_element_user(BOUNDINGBOX$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "boundingBox" element
     */
    public void removeBoundingBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDINGBOX$2, i);
        }
    }
    
    /**
     * Gets array of all "boundingGeometry" elements
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType[] getBoundingGeometryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BOUNDINGGEOMETRY$4, targetList);
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType[] result = new mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "boundingGeometry" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType getBoundingGeometryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType)get_store().find_element_user(BOUNDINGGEOMETRY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "boundingGeometry" element
     */
    public int sizeOfBoundingGeometryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOUNDINGGEOMETRY$4);
        }
    }
    
    /**
     * Sets array of all "boundingGeometry" element
     */
    public void setBoundingGeometryArray(mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType[] boundingGeometryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(boundingGeometryArray, BOUNDINGGEOMETRY$4);
        }
    }
    
    /**
     * Sets ith "boundingGeometry" element
     */
    public void setBoundingGeometryArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType boundingGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType)get_store().find_element_user(BOUNDINGGEOMETRY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(boundingGeometry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "boundingGeometry" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType insertNewBoundingGeometry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType)get_store().insert_element_user(BOUNDINGGEOMETRY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "boundingGeometry" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType addNewBoundingGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType)get_store().add_element_user(BOUNDINGGEOMETRY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "boundingGeometry" element
     */
    public void removeBoundingGeometry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOUNDINGGEOMETRY$4, i);
        }
    }
    
    /**
     * Gets array of all "postalAddress" elements
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress[] getPostalAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POSTALADDRESS$6, targetList);
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress[] result = new mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "postalAddress" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress getPostalAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().find_element_user(POSTALADDRESS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "postalAddress" element
     */
    public int sizeOfPostalAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTALADDRESS$6);
        }
    }
    
    /**
     * Sets array of all "postalAddress" element
     */
    public void setPostalAddressArray(mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress[] postalAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(postalAddressArray, POSTALADDRESS$6);
        }
    }
    
    /**
     * Sets ith "postalAddress" element
     */
    public void setPostalAddressArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress postalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().find_element_user(POSTALADDRESS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(postalAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "postalAddress" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress insertNewPostalAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().insert_element_user(POSTALADDRESS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "postalAddress" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress addNewPostalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress)get_store().add_element_user(POSTALADDRESS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "postalAddress" element
     */
    public void removePostalAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTALADDRESS$6, i);
        }
    }
    
    /**
     * Gets array of all "verticalExtent" elements
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType[] getVerticalExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VERTICALEXTENT$8, targetList);
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType[] result = new mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "verticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType getVerticalExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType)get_store().find_element_user(VERTICALEXTENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "verticalExtent" element
     */
    public int sizeOfVerticalExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERTICALEXTENT$8);
        }
    }
    
    /**
     * Sets array of all "verticalExtent" element
     */
    public void setVerticalExtentArray(mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType[] verticalExtentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(verticalExtentArray, VERTICALEXTENT$8);
        }
    }
    
    /**
     * Sets ith "verticalExtent" element
     */
    public void setVerticalExtentArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType verticalExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType)get_store().find_element_user(VERTICALEXTENT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(verticalExtent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "verticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType insertNewVerticalExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType)get_store().insert_element_user(VERTICALEXTENT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "verticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType addNewVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType)get_store().add_element_user(VERTICALEXTENT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "verticalExtent" element
     */
    public void removeVerticalExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERTICALEXTENT$8, i);
        }
    }
}
