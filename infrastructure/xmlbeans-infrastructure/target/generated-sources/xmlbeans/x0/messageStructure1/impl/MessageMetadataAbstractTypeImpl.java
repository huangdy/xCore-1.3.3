/*
 * XML Type:  MessageMetadataAbstractType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.MessageMetadataAbstractType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML MessageMetadataAbstractType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class MessageMetadataAbstractTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.MessageMetadataAbstractType
{
    private static final long serialVersionUID = 1L;
    
    public MessageMetadataAbstractTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULEXFRAMEWORK$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXFramework");
    private static final javax.xml.namespace.QName ULEXIMPLEMENTATION$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementation");
    private static final javax.xml.namespace.QName MESSAGEDATETIME$4 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "MessageDateTime");
    private static final javax.xml.namespace.QName MESSAGESEQUENCENUMBER$6 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "MessageSequenceNumber");
    private static final javax.xml.namespace.QName DATASENSITIVITYABSTRACT$8 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataSensitivityAbstract");
    private static final org.apache.xmlbeans.QNameSet DATASENSITIVITYABSTRACT$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "MessageClassification"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataSensitivityAbstract"),
    });
    
    
    /**
     * Gets the "ULEXFramework" element
     */
    public java.lang.String getULEXFramework()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXFRAMEWORK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ULEXFramework" element
     */
    public org.apache.xmlbeans.XmlString xgetULEXFramework()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXFRAMEWORK$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ULEXFramework" element
     */
    public void setULEXFramework(java.lang.String ulexFramework)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ULEXFRAMEWORK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ULEXFRAMEWORK$0);
            }
            target.setStringValue(ulexFramework);
        }
    }
    
    /**
     * Sets (as xml) the "ULEXFramework" element
     */
    public void xsetULEXFramework(org.apache.xmlbeans.XmlString ulexFramework)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ULEXFRAMEWORK$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ULEXFRAMEWORK$0);
            }
            target.set(ulexFramework);
        }
    }
    
    /**
     * Gets the "ULEXImplementation" element
     */
    public x0.messageStructure1.ULEXImplementationType getULEXImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.ULEXImplementationType target = null;
            target = (x0.messageStructure1.ULEXImplementationType)get_store().find_element_user(ULEXIMPLEMENTATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ULEXImplementation" element
     */
    public void setULEXImplementation(x0.messageStructure1.ULEXImplementationType ulexImplementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.ULEXImplementationType target = null;
            target = (x0.messageStructure1.ULEXImplementationType)get_store().find_element_user(ULEXIMPLEMENTATION$2, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.ULEXImplementationType)get_store().add_element_user(ULEXIMPLEMENTATION$2);
            }
            target.set(ulexImplementation);
        }
    }
    
    /**
     * Appends and returns a new empty "ULEXImplementation" element
     */
    public x0.messageStructure1.ULEXImplementationType addNewULEXImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.ULEXImplementationType target = null;
            target = (x0.messageStructure1.ULEXImplementationType)get_store().add_element_user(ULEXIMPLEMENTATION$2);
            return target;
        }
    }
    
    /**
     * Gets the "MessageDateTime" element
     */
    public java.util.Calendar getMessageDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDATETIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessageDateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetMessageDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MESSAGEDATETIME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MessageDateTime" element
     */
    public void setMessageDateTime(java.util.Calendar messageDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDATETIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEDATETIME$4);
            }
            target.setCalendarValue(messageDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "MessageDateTime" element
     */
    public void xsetMessageDateTime(org.apache.xmlbeans.XmlDateTime messageDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MESSAGEDATETIME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MESSAGEDATETIME$4);
            }
            target.set(messageDateTime);
        }
    }
    
    /**
     * Gets the "MessageSequenceNumber" element
     */
    public java.math.BigInteger getMessageSequenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGESEQUENCENUMBER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessageSequenceNumber" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMessageSequenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MESSAGESEQUENCENUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MessageSequenceNumber" element
     */
    public void setMessageSequenceNumber(java.math.BigInteger messageSequenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGESEQUENCENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGESEQUENCENUMBER$6);
            }
            target.setBigIntegerValue(messageSequenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "MessageSequenceNumber" element
     */
    public void xsetMessageSequenceNumber(org.apache.xmlbeans.XmlNonNegativeInteger messageSequenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MESSAGESEQUENCENUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(MESSAGESEQUENCENUMBER$6);
            }
            target.set(messageSequenceNumber);
        }
    }
    
    /**
     * Gets the "DataSensitivityAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getDataSensitivityAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATASENSITIVITYABSTRACT$9, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataSensitivityAbstract" element
     */
    public boolean isSetDataSensitivityAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASENSITIVITYABSTRACT$9) != 0;
        }
    }
    
    /**
     * Sets the "DataSensitivityAbstract" element
     */
    public void setDataSensitivityAbstract(org.apache.xmlbeans.XmlObject dataSensitivityAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(DATASENSITIVITYABSTRACT$9, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATASENSITIVITYABSTRACT$8);
            }
            target.set(dataSensitivityAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSensitivityAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewDataSensitivityAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(DATASENSITIVITYABSTRACT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "DataSensitivityAbstract" element
     */
    public void unsetDataSensitivityAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASENSITIVITYABSTRACT$9, 0);
        }
    }
}
