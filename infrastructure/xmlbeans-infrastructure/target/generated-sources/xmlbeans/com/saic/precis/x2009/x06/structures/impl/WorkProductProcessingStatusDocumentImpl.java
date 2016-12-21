/*
 * An XML document type.
 * Localname: WorkProductProcessingStatus
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.precis.x2009.x06.structures.WorkProductProcessingStatusDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.structures.impl;
/**
 * A document containing one WorkProductProcessingStatus(@http://www.saic.com/precis/2009/06/structures) element.
 *
 * This is a complex type.
 */
public class WorkProductProcessingStatusDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.structures.WorkProductProcessingStatusDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductProcessingStatusDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTPROCESSINGSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductProcessingStatus");
    
    
    /**
     * Gets the "WorkProductProcessingStatus" element
     */
    public com.saic.precis.x2009.x06.base.ProcessingStatusType getWorkProductProcessingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
            target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().find_element_user(WORKPRODUCTPROCESSINGSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductProcessingStatus" element
     */
    public void setWorkProductProcessingStatus(com.saic.precis.x2009.x06.base.ProcessingStatusType workProductProcessingStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
            target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().find_element_user(WORKPRODUCTPROCESSINGSTATUS$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().add_element_user(WORKPRODUCTPROCESSINGSTATUS$0);
            }
            target.set(workProductProcessingStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductProcessingStatus" element
     */
    public com.saic.precis.x2009.x06.base.ProcessingStatusType addNewWorkProductProcessingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
            target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().add_element_user(WORKPRODUCTPROCESSINGSTATUS$0);
            return target;
        }
    }
}
