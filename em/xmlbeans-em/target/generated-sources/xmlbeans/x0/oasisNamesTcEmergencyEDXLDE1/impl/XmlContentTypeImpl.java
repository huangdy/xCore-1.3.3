/*
 * XML Type:  xmlContentType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1.impl;
/**
 * An XML xmlContentType(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
 *
 * This is a complex type.
 */
public class XmlContentTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType
{
    private static final long serialVersionUID = 1L;
    
    public XmlContentTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEYXMLCONTENT$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "keyXMLContent");
    private static final javax.xml.namespace.QName EMBEDDEDXMLCONTENT$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:DE:1.0", "embeddedXMLContent");
    
    
    /**
     * Gets array of all "keyXMLContent" elements
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] getKeyXMLContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(KEYXMLCONTENT$0, targetList);
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "keyXMLContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType getKeyXMLContentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType)get_store().find_element_user(KEYXMLCONTENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "keyXMLContent" element
     */
    public int sizeOfKeyXMLContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYXMLCONTENT$0);
        }
    }
    
    /**
     * Sets array of all "keyXMLContent" element
     */
    public void setKeyXMLContentArray(x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] keyXMLContentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(keyXMLContentArray, KEYXMLCONTENT$0);
        }
    }
    
    /**
     * Sets ith "keyXMLContent" element
     */
    public void setKeyXMLContentArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType keyXMLContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType)get_store().find_element_user(KEYXMLCONTENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(keyXMLContent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyXMLContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType insertNewKeyXMLContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType)get_store().insert_element_user(KEYXMLCONTENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keyXMLContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType addNewKeyXMLContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType)get_store().add_element_user(KEYXMLCONTENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "keyXMLContent" element
     */
    public void removeKeyXMLContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYXMLCONTENT$0, i);
        }
    }
    
    /**
     * Gets array of all "embeddedXMLContent" elements
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] getEmbeddedXMLContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMBEDDEDXMLCONTENT$2, targetList);
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] result = new x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "embeddedXMLContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType getEmbeddedXMLContentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType)get_store().find_element_user(EMBEDDEDXMLCONTENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "embeddedXMLContent" element
     */
    public int sizeOfEmbeddedXMLContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMBEDDEDXMLCONTENT$2);
        }
    }
    
    /**
     * Sets array of all "embeddedXMLContent" element
     */
    public void setEmbeddedXMLContentArray(x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] embeddedXMLContentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(embeddedXMLContentArray, EMBEDDEDXMLCONTENT$2);
        }
    }
    
    /**
     * Sets ith "embeddedXMLContent" element
     */
    public void setEmbeddedXMLContentArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType embeddedXMLContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType)get_store().find_element_user(EMBEDDEDXMLCONTENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(embeddedXMLContent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "embeddedXMLContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType insertNewEmbeddedXMLContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType)get_store().insert_element_user(EMBEDDEDXMLCONTENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "embeddedXMLContent" element
     */
    public x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType addNewEmbeddedXMLContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType)get_store().add_element_user(EMBEDDEDXMLCONTENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "embeddedXMLContent" element
     */
    public void removeEmbeddedXMLContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMBEDDEDXMLCONTENT$2, i);
        }
    }
}
