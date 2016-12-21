/*
 * An XML document type.
 * Localname: doPublish
 * Namespace: ulex:message:pd:1.0
 * Java type: x0.messagePd1.DoPublishDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messagePd1.impl;
/**
 * A document containing one doPublish(@ulex:message:pd:1.0) element.
 *
 * This is a complex type.
 */
public class DoPublishDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messagePd1.DoPublishDocument
{
    private static final long serialVersionUID = 1L;
    
    public DoPublishDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOPUBLISH$0 = 
        new javax.xml.namespace.QName("ulex:message:pd:1.0", "doPublish");
    
    
    /**
     * Gets the "doPublish" element
     */
    public x0.messagePd1.DoPublishType getDoPublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messagePd1.DoPublishType target = null;
            target = (x0.messagePd1.DoPublishType)get_store().find_element_user(DOPUBLISH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "doPublish" element
     */
    public void setDoPublish(x0.messagePd1.DoPublishType doPublish)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messagePd1.DoPublishType target = null;
            target = (x0.messagePd1.DoPublishType)get_store().find_element_user(DOPUBLISH$0, 0);
            if (target == null)
            {
                target = (x0.messagePd1.DoPublishType)get_store().add_element_user(DOPUBLISH$0);
            }
            target.set(doPublish);
        }
    }
    
    /**
     * Appends and returns a new empty "doPublish" element
     */
    public x0.messagePd1.DoPublishType addNewDoPublish()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messagePd1.DoPublishType target = null;
            target = (x0.messagePd1.DoPublishType)get_store().add_element_user(DOPUBLISH$0);
            return target;
        }
    }
}
