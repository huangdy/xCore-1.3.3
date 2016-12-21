/*
 * XML Type:  GeneralType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.GeneralType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML GeneralType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class GeneralTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.GeneralType
{
    private static final long serialVersionUID = 1L;
    
    public GeneralTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WINDOW$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Window");
    private static final javax.xml.namespace.QName BOUNDINGBOX$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "BoundingBox");
    private static final javax.xml.namespace.QName TITLE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Title");
    private static final javax.xml.namespace.QName KEYWORDLIST$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "KeywordList");
    private static final javax.xml.namespace.QName ABSTRACT$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Abstract");
    private static final javax.xml.namespace.QName LOGOURL$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "LogoURL");
    private static final javax.xml.namespace.QName DESCRIPTIONURL$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "DescriptionURL");
    private static final javax.xml.namespace.QName CONTACTINFORMATION$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "ContactInformation");
    private static final javax.xml.namespace.QName EXTENSION$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Extension");
    
    
    /**
     * Gets the "Window" element
     */
    public net.opengis.context.WindowType getWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.WindowType target = null;
            target = (net.opengis.context.WindowType)get_store().find_element_user(WINDOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Window" element
     */
    public boolean isSetWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WINDOW$0) != 0;
        }
    }
    
    /**
     * Sets the "Window" element
     */
    public void setWindow(net.opengis.context.WindowType window)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.WindowType target = null;
            target = (net.opengis.context.WindowType)get_store().find_element_user(WINDOW$0, 0);
            if (target == null)
            {
                target = (net.opengis.context.WindowType)get_store().add_element_user(WINDOW$0);
            }
            target.set(window);
        }
    }
    
    /**
     * Appends and returns a new empty "Window" element
     */
    public net.opengis.context.WindowType addNewWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.WindowType target = null;
            target = (net.opengis.context.WindowType)get_store().add_element_user(WINDOW$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Window" element
     */
    public void unsetWindow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WINDOW$0, 0);
        }
    }
    
    /**
     * Gets the "BoundingBox" element
     */
    public net.opengis.context.BoundingBoxType getBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.BoundingBoxType target = null;
            target = (net.opengis.context.BoundingBoxType)get_store().find_element_user(BOUNDINGBOX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BoundingBox" element
     */
    public void setBoundingBox(net.opengis.context.BoundingBoxType boundingBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.BoundingBoxType target = null;
            target = (net.opengis.context.BoundingBoxType)get_store().find_element_user(BOUNDINGBOX$2, 0);
            if (target == null)
            {
                target = (net.opengis.context.BoundingBoxType)get_store().add_element_user(BOUNDINGBOX$2);
            }
            target.set(boundingBox);
        }
    }
    
    /**
     * Appends and returns a new empty "BoundingBox" element
     */
    public net.opengis.context.BoundingBoxType addNewBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.BoundingBoxType target = null;
            target = (net.opengis.context.BoundingBoxType)get_store().add_element_user(BOUNDINGBOX$2);
            return target;
        }
    }
    
    /**
     * Gets the "Title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$4);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "Title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$4);
            }
            target.set(title);
        }
    }
    
    /**
     * Gets the "KeywordList" element
     */
    public net.opengis.context.KeywordListType getKeywordList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.KeywordListType target = null;
            target = (net.opengis.context.KeywordListType)get_store().find_element_user(KEYWORDLIST$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "KeywordList" element
     */
    public boolean isSetKeywordList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(KEYWORDLIST$6) != 0;
        }
    }
    
    /**
     * Sets the "KeywordList" element
     */
    public void setKeywordList(net.opengis.context.KeywordListType keywordList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.KeywordListType target = null;
            target = (net.opengis.context.KeywordListType)get_store().find_element_user(KEYWORDLIST$6, 0);
            if (target == null)
            {
                target = (net.opengis.context.KeywordListType)get_store().add_element_user(KEYWORDLIST$6);
            }
            target.set(keywordList);
        }
    }
    
    /**
     * Appends and returns a new empty "KeywordList" element
     */
    public net.opengis.context.KeywordListType addNewKeywordList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.KeywordListType target = null;
            target = (net.opengis.context.KeywordListType)get_store().add_element_user(KEYWORDLIST$6);
            return target;
        }
    }
    
    /**
     * Unsets the "KeywordList" element
     */
    public void unsetKeywordList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(KEYWORDLIST$6, 0);
        }
    }
    
    /**
     * Gets the "Abstract" element
     */
    public java.lang.String getAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Abstract" element
     */
    public org.apache.xmlbeans.XmlString xgetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Abstract" element
     */
    public boolean isSetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACT$8) != 0;
        }
    }
    
    /**
     * Sets the "Abstract" element
     */
    public void setAbstract(java.lang.String xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABSTRACT$8);
            }
            target.setStringValue(xabstract);
        }
    }
    
    /**
     * Sets (as xml) the "Abstract" element
     */
    public void xsetAbstract(org.apache.xmlbeans.XmlString xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ABSTRACT$8);
            }
            target.set(xabstract);
        }
    }
    
    /**
     * Unsets the "Abstract" element
     */
    public void unsetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACT$8, 0);
        }
    }
    
    /**
     * Gets the "LogoURL" element
     */
    public net.opengis.context.URLType getLogoURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(LOGOURL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LogoURL" element
     */
    public boolean isSetLogoURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOGOURL$10) != 0;
        }
    }
    
    /**
     * Sets the "LogoURL" element
     */
    public void setLogoURL(net.opengis.context.URLType logoURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(LOGOURL$10, 0);
            if (target == null)
            {
                target = (net.opengis.context.URLType)get_store().add_element_user(LOGOURL$10);
            }
            target.set(logoURL);
        }
    }
    
    /**
     * Appends and returns a new empty "LogoURL" element
     */
    public net.opengis.context.URLType addNewLogoURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().add_element_user(LOGOURL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "LogoURL" element
     */
    public void unsetLogoURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOGOURL$10, 0);
        }
    }
    
    /**
     * Gets the "DescriptionURL" element
     */
    public net.opengis.context.URLType getDescriptionURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(DESCRIPTIONURL$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DescriptionURL" element
     */
    public boolean isSetDescriptionURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTIONURL$12) != 0;
        }
    }
    
    /**
     * Sets the "DescriptionURL" element
     */
    public void setDescriptionURL(net.opengis.context.URLType descriptionURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(DESCRIPTIONURL$12, 0);
            if (target == null)
            {
                target = (net.opengis.context.URLType)get_store().add_element_user(DESCRIPTIONURL$12);
            }
            target.set(descriptionURL);
        }
    }
    
    /**
     * Appends and returns a new empty "DescriptionURL" element
     */
    public net.opengis.context.URLType addNewDescriptionURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().add_element_user(DESCRIPTIONURL$12);
            return target;
        }
    }
    
    /**
     * Unsets the "DescriptionURL" element
     */
    public void unsetDescriptionURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTIONURL$12, 0);
        }
    }
    
    /**
     * Gets the "ContactInformation" element
     */
    public net.opengis.context.ContactInformationType getContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ContactInformationType target = null;
            target = (net.opengis.context.ContactInformationType)get_store().find_element_user(CONTACTINFORMATION$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContactInformation" element
     */
    public boolean isSetContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTINFORMATION$14) != 0;
        }
    }
    
    /**
     * Sets the "ContactInformation" element
     */
    public void setContactInformation(net.opengis.context.ContactInformationType contactInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ContactInformationType target = null;
            target = (net.opengis.context.ContactInformationType)get_store().find_element_user(CONTACTINFORMATION$14, 0);
            if (target == null)
            {
                target = (net.opengis.context.ContactInformationType)get_store().add_element_user(CONTACTINFORMATION$14);
            }
            target.set(contactInformation);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactInformation" element
     */
    public net.opengis.context.ContactInformationType addNewContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ContactInformationType target = null;
            target = (net.opengis.context.ContactInformationType)get_store().add_element_user(CONTACTINFORMATION$14);
            return target;
        }
    }
    
    /**
     * Unsets the "ContactInformation" element
     */
    public void unsetContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTINFORMATION$14, 0);
        }
    }
    
    /**
     * Gets the "Extension" element
     */
    public net.opengis.context.ExtensionType getExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ExtensionType target = null;
            target = (net.opengis.context.ExtensionType)get_store().find_element_user(EXTENSION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Extension" element
     */
    public boolean isSetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSION$16) != 0;
        }
    }
    
    /**
     * Sets the "Extension" element
     */
    public void setExtension(net.opengis.context.ExtensionType extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ExtensionType target = null;
            target = (net.opengis.context.ExtensionType)get_store().find_element_user(EXTENSION$16, 0);
            if (target == null)
            {
                target = (net.opengis.context.ExtensionType)get_store().add_element_user(EXTENSION$16);
            }
            target.set(extension);
        }
    }
    
    /**
     * Appends and returns a new empty "Extension" element
     */
    public net.opengis.context.ExtensionType addNewExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ExtensionType target = null;
            target = (net.opengis.context.ExtensionType)get_store().add_element_user(EXTENSION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "Extension" element
     */
    public void unsetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSION$16, 0);
        }
    }
}
