/*
 * An XML document type.
 * Localname: GetListOfInterestGroupRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.GetListOfInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one GetListOfInterestGroupRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class GetListOfInterestGroupRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetListOfInterestGroupRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfInterestGroupRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFINTERESTGROUPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "GetListOfInterestGroupRequest");
    
    
    /**
     * Gets the "GetListOfInterestGroupRequest" element
     */
    public org.apache.xmlbeans.XmlObject getGetListOfInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(GETLISTOFINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListOfInterestGroupRequest" element
     */
    public void setGetListOfInterestGroupRequest(org.apache.xmlbeans.XmlObject getListOfInterestGroupRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(GETLISTOFINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(GETLISTOFINTERESTGROUPREQUEST$0);
            }
            target.set(getListOfInterestGroupRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetListOfInterestGroupRequest" element
     */
    public org.apache.xmlbeans.XmlObject addNewGetListOfInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(GETLISTOFINTERESTGROUPREQUEST$0);
            return target;
        }
    }
}
