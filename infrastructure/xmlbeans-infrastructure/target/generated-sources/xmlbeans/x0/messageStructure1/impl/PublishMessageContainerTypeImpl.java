/*
 * XML Type:  PublishMessageContainerType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PublishMessageContainerType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML PublishMessageContainerType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class PublishMessageContainerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PublishMessageContainerType
{
    private static final long serialVersionUID = 1L;
    
    public PublishMessageContainerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHMESSAGE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessage");
    
    
    /**
     * Gets array of all "PublishMessage" elements
     */
    public x0.messageStructure1.PublishMessageType[] getPublishMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PUBLISHMESSAGE$0, targetList);
            x0.messageStructure1.PublishMessageType[] result = new x0.messageStructure1.PublishMessageType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PublishMessage" element
     */
    public x0.messageStructure1.PublishMessageType getPublishMessageArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageType target = null;
            target = (x0.messageStructure1.PublishMessageType)get_store().find_element_user(PUBLISHMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PublishMessage" element
     */
    public int sizeOfPublishMessageArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLISHMESSAGE$0);
        }
    }
    
    /**
     * Sets array of all "PublishMessage" element
     */
    public void setPublishMessageArray(x0.messageStructure1.PublishMessageType[] publishMessageArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(publishMessageArray, PUBLISHMESSAGE$0);
        }
    }
    
    /**
     * Sets ith "PublishMessage" element
     */
    public void setPublishMessageArray(int i, x0.messageStructure1.PublishMessageType publishMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageType target = null;
            target = (x0.messageStructure1.PublishMessageType)get_store().find_element_user(PUBLISHMESSAGE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(publishMessage);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PublishMessage" element
     */
    public x0.messageStructure1.PublishMessageType insertNewPublishMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageType target = null;
            target = (x0.messageStructure1.PublishMessageType)get_store().insert_element_user(PUBLISHMESSAGE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PublishMessage" element
     */
    public x0.messageStructure1.PublishMessageType addNewPublishMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageType target = null;
            target = (x0.messageStructure1.PublishMessageType)get_store().add_element_user(PUBLISHMESSAGE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PublishMessage" element
     */
    public void removePublishMessage(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLISHMESSAGE$0, i);
        }
    }
}
