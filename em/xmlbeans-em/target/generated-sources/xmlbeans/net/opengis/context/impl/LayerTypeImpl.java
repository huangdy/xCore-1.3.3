/*
 * XML Type:  LayerType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.LayerType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML LayerType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class LayerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.LayerType
{
    private static final long serialVersionUID = 1L;
    
    public LayerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Server");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Name");
    private static final javax.xml.namespace.QName TITLE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Title");
    private static final javax.xml.namespace.QName ABSTRACT$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Abstract");
    private static final javax.xml.namespace.QName DATAURL$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "DataURL");
    private static final javax.xml.namespace.QName METADATAURL$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "MetadataURL");
    private static final javax.xml.namespace.QName SRS$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "SRS");
    private static final javax.xml.namespace.QName FORMATLIST$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "FormatList");
    private static final javax.xml.namespace.QName STYLELIST$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "StyleList");
    private static final javax.xml.namespace.QName DIMENSIONLIST$18 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "DimensionList");
    private static final javax.xml.namespace.QName EXTENSION$20 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Extension");
    private static final javax.xml.namespace.QName QUERYABLE$22 = 
        new javax.xml.namespace.QName("", "queryable");
    private static final javax.xml.namespace.QName HIDDEN$24 = 
        new javax.xml.namespace.QName("", "hidden");
    
    
    /**
     * Gets the "Server" element
     */
    public net.opengis.context.ServerType getServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ServerType target = null;
            target = (net.opengis.context.ServerType)get_store().find_element_user(SERVER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Server" element
     */
    public void setServer(net.opengis.context.ServerType server)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ServerType target = null;
            target = (net.opengis.context.ServerType)get_store().find_element_user(SERVER$0, 0);
            if (target == null)
            {
                target = (net.opengis.context.ServerType)get_store().add_element_user(SERVER$0);
            }
            target.set(server);
        }
    }
    
    /**
     * Appends and returns a new empty "Server" element
     */
    public net.opengis.context.ServerType addNewServer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ServerType target = null;
            target = (net.opengis.context.ServerType)get_store().add_element_user(SERVER$0);
            return target;
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
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
     * Gets the "Abstract" element
     */
    public java.lang.String getAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$6, 0);
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
            return get_store().count_elements(ABSTRACT$6) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABSTRACT$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ABSTRACT$6);
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
            get_store().remove_element(ABSTRACT$6, 0);
        }
    }
    
    /**
     * Gets the "DataURL" element
     */
    public net.opengis.context.URLType getDataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(DATAURL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DataURL" element
     */
    public boolean isSetDataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAURL$8) != 0;
        }
    }
    
    /**
     * Sets the "DataURL" element
     */
    public void setDataURL(net.opengis.context.URLType dataURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(DATAURL$8, 0);
            if (target == null)
            {
                target = (net.opengis.context.URLType)get_store().add_element_user(DATAURL$8);
            }
            target.set(dataURL);
        }
    }
    
    /**
     * Appends and returns a new empty "DataURL" element
     */
    public net.opengis.context.URLType addNewDataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().add_element_user(DATAURL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "DataURL" element
     */
    public void unsetDataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAURL$8, 0);
        }
    }
    
    /**
     * Gets the "MetadataURL" element
     */
    public net.opengis.context.URLType getMetadataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(METADATAURL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MetadataURL" element
     */
    public boolean isSetMetadataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATAURL$10) != 0;
        }
    }
    
    /**
     * Sets the "MetadataURL" element
     */
    public void setMetadataURL(net.opengis.context.URLType metadataURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(METADATAURL$10, 0);
            if (target == null)
            {
                target = (net.opengis.context.URLType)get_store().add_element_user(METADATAURL$10);
            }
            target.set(metadataURL);
        }
    }
    
    /**
     * Appends and returns a new empty "MetadataURL" element
     */
    public net.opengis.context.URLType addNewMetadataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().add_element_user(METADATAURL$10);
            return target;
        }
    }
    
    /**
     * Unsets the "MetadataURL" element
     */
    public void unsetMetadataURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATAURL$10, 0);
        }
    }
    
    /**
     * Gets array of all "SRS" elements
     */
    public java.lang.String[] getSRSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SRS$12, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "SRS" element
     */
    public java.lang.String getSRSArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "SRS" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetSRSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SRS$12, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "SRS" element
     */
    public org.apache.xmlbeans.XmlString xgetSRSArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "SRS" element
     */
    public int sizeOfSRSArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SRS$12);
        }
    }
    
    /**
     * Sets array of all "SRS" element
     */
    public void setSRSArray(java.lang.String[] srsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(srsArray, SRS$12);
        }
    }
    
    /**
     * Sets ith "SRS" element
     */
    public void setSRSArray(int i, java.lang.String srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SRS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(srs);
        }
    }
    
    /**
     * Sets (as xml) array of all "SRS" element
     */
    public void xsetSRSArray(org.apache.xmlbeans.XmlString[]srsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(srsArray, SRS$12);
        }
    }
    
    /**
     * Sets (as xml) ith "SRS" element
     */
    public void xsetSRSArray(int i, org.apache.xmlbeans.XmlString srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SRS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(srs);
        }
    }
    
    /**
     * Inserts the value as the ith "SRS" element
     */
    public void insertSRS(int i, java.lang.String srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SRS$12, i);
            target.setStringValue(srs);
        }
    }
    
    /**
     * Appends the value as the last "SRS" element
     */
    public void addSRS(java.lang.String srs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SRS$12);
            target.setStringValue(srs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SRS" element
     */
    public org.apache.xmlbeans.XmlString insertNewSRS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(SRS$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SRS" element
     */
    public org.apache.xmlbeans.XmlString addNewSRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SRS$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "SRS" element
     */
    public void removeSRS(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SRS$12, i);
        }
    }
    
    /**
     * Gets the "FormatList" element
     */
    public net.opengis.context.FormatListType getFormatList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.FormatListType target = null;
            target = (net.opengis.context.FormatListType)get_store().find_element_user(FORMATLIST$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FormatList" element
     */
    public boolean isSetFormatList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATLIST$14) != 0;
        }
    }
    
    /**
     * Sets the "FormatList" element
     */
    public void setFormatList(net.opengis.context.FormatListType formatList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.FormatListType target = null;
            target = (net.opengis.context.FormatListType)get_store().find_element_user(FORMATLIST$14, 0);
            if (target == null)
            {
                target = (net.opengis.context.FormatListType)get_store().add_element_user(FORMATLIST$14);
            }
            target.set(formatList);
        }
    }
    
    /**
     * Appends and returns a new empty "FormatList" element
     */
    public net.opengis.context.FormatListType addNewFormatList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.FormatListType target = null;
            target = (net.opengis.context.FormatListType)get_store().add_element_user(FORMATLIST$14);
            return target;
        }
    }
    
    /**
     * Unsets the "FormatList" element
     */
    public void unsetFormatList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATLIST$14, 0);
        }
    }
    
    /**
     * Gets the "StyleList" element
     */
    public net.opengis.context.StyleListType getStyleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.StyleListType target = null;
            target = (net.opengis.context.StyleListType)get_store().find_element_user(STYLELIST$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StyleList" element
     */
    public boolean isSetStyleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLELIST$16) != 0;
        }
    }
    
    /**
     * Sets the "StyleList" element
     */
    public void setStyleList(net.opengis.context.StyleListType styleList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.StyleListType target = null;
            target = (net.opengis.context.StyleListType)get_store().find_element_user(STYLELIST$16, 0);
            if (target == null)
            {
                target = (net.opengis.context.StyleListType)get_store().add_element_user(STYLELIST$16);
            }
            target.set(styleList);
        }
    }
    
    /**
     * Appends and returns a new empty "StyleList" element
     */
    public net.opengis.context.StyleListType addNewStyleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.StyleListType target = null;
            target = (net.opengis.context.StyleListType)get_store().add_element_user(STYLELIST$16);
            return target;
        }
    }
    
    /**
     * Unsets the "StyleList" element
     */
    public void unsetStyleList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLELIST$16, 0);
        }
    }
    
    /**
     * Gets the "DimensionList" element
     */
    public net.opengis.context.DimensionListType getDimensionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.DimensionListType target = null;
            target = (net.opengis.context.DimensionListType)get_store().find_element_user(DIMENSIONLIST$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DimensionList" element
     */
    public boolean isSetDimensionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIMENSIONLIST$18) != 0;
        }
    }
    
    /**
     * Sets the "DimensionList" element
     */
    public void setDimensionList(net.opengis.context.DimensionListType dimensionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.DimensionListType target = null;
            target = (net.opengis.context.DimensionListType)get_store().find_element_user(DIMENSIONLIST$18, 0);
            if (target == null)
            {
                target = (net.opengis.context.DimensionListType)get_store().add_element_user(DIMENSIONLIST$18);
            }
            target.set(dimensionList);
        }
    }
    
    /**
     * Appends and returns a new empty "DimensionList" element
     */
    public net.opengis.context.DimensionListType addNewDimensionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.DimensionListType target = null;
            target = (net.opengis.context.DimensionListType)get_store().add_element_user(DIMENSIONLIST$18);
            return target;
        }
    }
    
    /**
     * Unsets the "DimensionList" element
     */
    public void unsetDimensionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIMENSIONLIST$18, 0);
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
            target = (net.opengis.context.ExtensionType)get_store().find_element_user(EXTENSION$20, 0);
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
            return get_store().count_elements(EXTENSION$20) != 0;
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
            target = (net.opengis.context.ExtensionType)get_store().find_element_user(EXTENSION$20, 0);
            if (target == null)
            {
                target = (net.opengis.context.ExtensionType)get_store().add_element_user(EXTENSION$20);
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
            target = (net.opengis.context.ExtensionType)get_store().add_element_user(EXTENSION$20);
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
            get_store().remove_element(EXTENSION$20, 0);
        }
    }
    
    /**
     * Gets the "queryable" attribute
     */
    public boolean getQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYABLE$22);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "queryable" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetQueryable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(QUERYABLE$22);
            return target;
        }
    }
    
    /**
     * Sets the "queryable" attribute
     */
    public void setQueryable(boolean queryable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUERYABLE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUERYABLE$22);
            }
            target.setBooleanValue(queryable);
        }
    }
    
    /**
     * Sets (as xml) the "queryable" attribute
     */
    public void xsetQueryable(org.apache.xmlbeans.XmlBoolean queryable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(QUERYABLE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(QUERYABLE$22);
            }
            target.set(queryable);
        }
    }
    
    /**
     * Gets the "hidden" attribute
     */
    public boolean getHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$24);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "hidden" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetHidden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$24);
            return target;
        }
    }
    
    /**
     * Sets the "hidden" attribute
     */
    public void setHidden(boolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HIDDEN$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HIDDEN$24);
            }
            target.setBooleanValue(hidden);
        }
    }
    
    /**
     * Sets (as xml) the "hidden" attribute
     */
    public void xsetHidden(org.apache.xmlbeans.XmlBoolean hidden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(HIDDEN$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(HIDDEN$24);
            }
            target.set(hidden);
        }
    }
}
