/*
 * An XML document type.
 * Localname: ICSForm210
 * Namespace: http://uicds.org/ICSForm210
 * Java type: org.uicds.icsForm210.ICSForm210Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm210.impl;
/**
 * A document containing one ICSForm210(@http://uicds.org/ICSForm210) element.
 *
 * This is a complex type.
 */
public class ICSForm210DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm210.ICSForm210Document
{
    private static final long serialVersionUID = 1L;
    
    public ICSForm210DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORM210$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "ICSForm210");
    
    
    /**
     * Gets the "ICSForm210" element
     */
    public org.uicds.icsForm210.ICSForm210Document.ICSForm210 getICSForm210()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm210.ICSForm210Document.ICSForm210 target = null;
            target = (org.uicds.icsForm210.ICSForm210Document.ICSForm210)get_store().find_element_user(ICSFORM210$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSForm210" element
     */
    public void setICSForm210(org.uicds.icsForm210.ICSForm210Document.ICSForm210 icsForm210)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm210.ICSForm210Document.ICSForm210 target = null;
            target = (org.uicds.icsForm210.ICSForm210Document.ICSForm210)get_store().find_element_user(ICSFORM210$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm210.ICSForm210Document.ICSForm210)get_store().add_element_user(ICSFORM210$0);
            }
            target.set(icsForm210);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSForm210" element
     */
    public org.uicds.icsForm210.ICSForm210Document.ICSForm210 addNewICSForm210()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm210.ICSForm210Document.ICSForm210 target = null;
            target = (org.uicds.icsForm210.ICSForm210Document.ICSForm210)get_store().add_element_user(ICSFORM210$0);
            return target;
        }
    }
    /**
     * An XML ICSForm210(@http://uicds.org/ICSForm210).
     *
     * This is a complex type.
     */
    public static class ICSForm210Impl extends org.uicds.icsFormCommon.impl.ICSFormDocumentTypeImpl implements org.uicds.icsForm210.ICSForm210Document.ICSForm210
    {
        private static final long serialVersionUID = 1L;
        
        public ICSForm210Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESIGNATORNAMEIDNO$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "DesignatorNameIDNo");
        private static final javax.xml.namespace.QName ASSIGNED$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "Assigned");
        private static final javax.xml.namespace.QName AVAILABLE$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "Available");
        private static final javax.xml.namespace.QName OSREST$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "OSRest");
        private static final javax.xml.namespace.QName OSMECHANICAL$8 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "OSMechanical");
        private static final javax.xml.namespace.QName OSMANNING$10 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "OSManning");
        private static final javax.xml.namespace.QName ETR$12 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "ETR");
        private static final javax.xml.namespace.QName FROMDIVISIONGROUP$14 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "FromDivisionGroup");
        private static final javax.xml.namespace.QName FROMSTAGINGAREA$16 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "FromStagingArea");
        private static final javax.xml.namespace.QName FROMBASEICP$18 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "FromBaseICP");
        private static final javax.xml.namespace.QName FROMENROUTE$20 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "FromEnroute");
        private static final javax.xml.namespace.QName FROMHOMEAGENCY$22 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "FromHomeAgency");
        private static final javax.xml.namespace.QName MESSAGES$24 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "Messages");
        private static final javax.xml.namespace.QName TIME$26 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "Time");
        private static final javax.xml.namespace.QName PROCESS$28 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm210", "Process");
        
        
        /**
         * Gets the "DesignatorNameIDNo" element
         */
        public java.lang.String getDesignatorNameIDNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESIGNATORNAMEIDNO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DesignatorNameIDNo" element
         */
        public org.apache.xmlbeans.XmlString xgetDesignatorNameIDNo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESIGNATORNAMEIDNO$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DesignatorNameIDNo" element
         */
        public void setDesignatorNameIDNo(java.lang.String designatorNameIDNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESIGNATORNAMEIDNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESIGNATORNAMEIDNO$0);
                }
                target.setStringValue(designatorNameIDNo);
            }
        }
        
        /**
         * Sets (as xml) the "DesignatorNameIDNo" element
         */
        public void xsetDesignatorNameIDNo(org.apache.xmlbeans.XmlString designatorNameIDNo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESIGNATORNAMEIDNO$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESIGNATORNAMEIDNO$0);
                }
                target.set(designatorNameIDNo);
            }
        }
        
        /**
         * Gets the "Assigned" element
         */
        public boolean getAssigned()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNED$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Assigned" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetAssigned()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ASSIGNED$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Assigned" element
         */
        public void setAssigned(boolean assigned)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNED$2);
                }
                target.setBooleanValue(assigned);
            }
        }
        
        /**
         * Sets (as xml) the "Assigned" element
         */
        public void xsetAssigned(org.apache.xmlbeans.XmlBoolean assigned)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ASSIGNED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ASSIGNED$2);
                }
                target.set(assigned);
            }
        }
        
        /**
         * Gets the "Available" element
         */
        public boolean getAvailable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLE$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Available" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetAvailable()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AVAILABLE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Available" element
         */
        public void setAvailable(boolean available)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVAILABLE$4);
                }
                target.setBooleanValue(available);
            }
        }
        
        /**
         * Sets (as xml) the "Available" element
         */
        public void xsetAvailable(org.apache.xmlbeans.XmlBoolean available)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AVAILABLE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AVAILABLE$4);
                }
                target.set(available);
            }
        }
        
        /**
         * Gets the "OSRest" element
         */
        public boolean getOSRest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSREST$6, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "OSRest" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetOSRest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OSREST$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OSRest" element
         */
        public void setOSRest(boolean osRest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSREST$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OSREST$6);
                }
                target.setBooleanValue(osRest);
            }
        }
        
        /**
         * Sets (as xml) the "OSRest" element
         */
        public void xsetOSRest(org.apache.xmlbeans.XmlBoolean osRest)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OSREST$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OSREST$6);
                }
                target.set(osRest);
            }
        }
        
        /**
         * Gets the "OSMechanical" element
         */
        public boolean getOSMechanical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSMECHANICAL$8, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "OSMechanical" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetOSMechanical()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OSMECHANICAL$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OSMechanical" element
         */
        public void setOSMechanical(boolean osMechanical)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSMECHANICAL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OSMECHANICAL$8);
                }
                target.setBooleanValue(osMechanical);
            }
        }
        
        /**
         * Sets (as xml) the "OSMechanical" element
         */
        public void xsetOSMechanical(org.apache.xmlbeans.XmlBoolean osMechanical)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OSMECHANICAL$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OSMECHANICAL$8);
                }
                target.set(osMechanical);
            }
        }
        
        /**
         * Gets the "OSManning" element
         */
        public boolean getOSManning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSMANNING$10, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "OSManning" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetOSManning()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OSMANNING$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OSManning" element
         */
        public void setOSManning(boolean osManning)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OSMANNING$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OSMANNING$10);
                }
                target.setBooleanValue(osManning);
            }
        }
        
        /**
         * Sets (as xml) the "OSManning" element
         */
        public void xsetOSManning(org.apache.xmlbeans.XmlBoolean osManning)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(OSMANNING$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(OSMANNING$10);
                }
                target.set(osManning);
            }
        }
        
        /**
         * Gets the "ETR" element
         */
        public boolean getETR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETR$12, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "ETR" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetETR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ETR$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ETR" element
         */
        public void setETR(boolean etr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETR$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ETR$12);
                }
                target.setBooleanValue(etr);
            }
        }
        
        /**
         * Sets (as xml) the "ETR" element
         */
        public void xsetETR(org.apache.xmlbeans.XmlBoolean etr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ETR$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ETR$12);
                }
                target.set(etr);
            }
        }
        
        /**
         * Gets the "FromDivisionGroup" element
         */
        public java.lang.String getFromDivisionGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDIVISIONGROUP$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FromDivisionGroup" element
         */
        public org.apache.xmlbeans.XmlString xgetFromDivisionGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMDIVISIONGROUP$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FromDivisionGroup" element
         */
        public void setFromDivisionGroup(java.lang.String fromDivisionGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMDIVISIONGROUP$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMDIVISIONGROUP$14);
                }
                target.setStringValue(fromDivisionGroup);
            }
        }
        
        /**
         * Sets (as xml) the "FromDivisionGroup" element
         */
        public void xsetFromDivisionGroup(org.apache.xmlbeans.XmlString fromDivisionGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMDIVISIONGROUP$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMDIVISIONGROUP$14);
                }
                target.set(fromDivisionGroup);
            }
        }
        
        /**
         * Gets the "FromStagingArea" element
         */
        public java.lang.String getFromStagingArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMSTAGINGAREA$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FromStagingArea" element
         */
        public org.apache.xmlbeans.XmlString xgetFromStagingArea()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMSTAGINGAREA$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FromStagingArea" element
         */
        public void setFromStagingArea(java.lang.String fromStagingArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMSTAGINGAREA$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMSTAGINGAREA$16);
                }
                target.setStringValue(fromStagingArea);
            }
        }
        
        /**
         * Sets (as xml) the "FromStagingArea" element
         */
        public void xsetFromStagingArea(org.apache.xmlbeans.XmlString fromStagingArea)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMSTAGINGAREA$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMSTAGINGAREA$16);
                }
                target.set(fromStagingArea);
            }
        }
        
        /**
         * Gets the "FromBaseICP" element
         */
        public java.lang.String getFromBaseICP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMBASEICP$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FromBaseICP" element
         */
        public org.apache.xmlbeans.XmlString xgetFromBaseICP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMBASEICP$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FromBaseICP" element
         */
        public void setFromBaseICP(java.lang.String fromBaseICP)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMBASEICP$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMBASEICP$18);
                }
                target.setStringValue(fromBaseICP);
            }
        }
        
        /**
         * Sets (as xml) the "FromBaseICP" element
         */
        public void xsetFromBaseICP(org.apache.xmlbeans.XmlString fromBaseICP)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMBASEICP$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMBASEICP$18);
                }
                target.set(fromBaseICP);
            }
        }
        
        /**
         * Gets the "FromEnroute" element
         */
        public java.lang.String getFromEnroute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMENROUTE$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FromEnroute" element
         */
        public org.apache.xmlbeans.XmlString xgetFromEnroute()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMENROUTE$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FromEnroute" element
         */
        public void setFromEnroute(java.lang.String fromEnroute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMENROUTE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMENROUTE$20);
                }
                target.setStringValue(fromEnroute);
            }
        }
        
        /**
         * Sets (as xml) the "FromEnroute" element
         */
        public void xsetFromEnroute(org.apache.xmlbeans.XmlString fromEnroute)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMENROUTE$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMENROUTE$20);
                }
                target.set(fromEnroute);
            }
        }
        
        /**
         * Gets the "FromHomeAgency" element
         */
        public java.lang.String getFromHomeAgency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMHOMEAGENCY$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FromHomeAgency" element
         */
        public org.apache.xmlbeans.XmlString xgetFromHomeAgency()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMHOMEAGENCY$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FromHomeAgency" element
         */
        public void setFromHomeAgency(java.lang.String fromHomeAgency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMHOMEAGENCY$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMHOMEAGENCY$22);
                }
                target.setStringValue(fromHomeAgency);
            }
        }
        
        /**
         * Sets (as xml) the "FromHomeAgency" element
         */
        public void xsetFromHomeAgency(org.apache.xmlbeans.XmlString fromHomeAgency)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMHOMEAGENCY$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMHOMEAGENCY$22);
                }
                target.set(fromHomeAgency);
            }
        }
        
        /**
         * Gets the "Messages" element
         */
        public java.lang.String getMessages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGES$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Messages" element
         */
        public org.apache.xmlbeans.XmlString xgetMessages()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGES$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Messages" element
         */
        public void setMessages(java.lang.String messages)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGES$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGES$24);
                }
                target.setStringValue(messages);
            }
        }
        
        /**
         * Sets (as xml) the "Messages" element
         */
        public void xsetMessages(org.apache.xmlbeans.XmlString messages)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGES$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGES$24);
                }
                target.set(messages);
            }
        }
        
        /**
         * Gets the "Time" element
         */
        public java.util.Calendar getTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "Time" element
         */
        public org.apache.xmlbeans.XmlTime xgetTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIME$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Time" element
         */
        public void setTime(java.util.Calendar time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIME$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIME$26);
                }
                target.setCalendarValue(time);
            }
        }
        
        /**
         * Sets (as xml) the "Time" element
         */
        public void xsetTime(org.apache.xmlbeans.XmlTime time)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIME$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(TIME$26);
                }
                target.set(time);
            }
        }
        
        /**
         * Gets the "Process" element
         */
        public boolean getProcess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESS$28, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Process" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetProcess()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROCESS$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Process" element
         */
        public void setProcess(boolean process)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROCESS$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROCESS$28);
                }
                target.setBooleanValue(process);
            }
        }
        
        /**
         * Sets (as xml) the "Process" element
         */
        public void xsetProcess(org.apache.xmlbeans.XmlBoolean process)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PROCESS$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PROCESS$28);
                }
                target.set(process);
            }
        }
    }
}
