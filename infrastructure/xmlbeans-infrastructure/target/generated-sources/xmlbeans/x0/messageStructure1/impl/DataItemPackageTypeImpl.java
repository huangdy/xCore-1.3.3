/*
 * XML Type:  DataItemPackageType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataItemPackageType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML DataItemPackageType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class DataItemPackageTypeImpl extends x0.messageStructure1.impl.PackageAbstractTypeImpl implements x0.messageStructure1.DataItemPackageType
{
    private static final long serialVersionUID = 1L;
    
    public DataItemPackageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERINGINSTRUCTIONS$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "RenderingInstructions");
    private static final javax.xml.namespace.QName NARRATIVEABSTRACT$2 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "NarrativeAbstract");
    private static final org.apache.xmlbeans.QNameSet NARRATIVEABSTRACT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Narrative"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "NarrativeAbstract"),
    });
    
    
    /**
     * Gets array of all "RenderingInstructions" elements
     */
    public x0.messageStructure1.RenderingInstructionsType[] getRenderingInstructionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RENDERINGINSTRUCTIONS$0, targetList);
            x0.messageStructure1.RenderingInstructionsType[] result = new x0.messageStructure1.RenderingInstructionsType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RenderingInstructions" element
     */
    public x0.messageStructure1.RenderingInstructionsType getRenderingInstructionsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingInstructionsType target = null;
            target = (x0.messageStructure1.RenderingInstructionsType)get_store().find_element_user(RENDERINGINSTRUCTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RenderingInstructions" element
     */
    public int sizeOfRenderingInstructionsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERINGINSTRUCTIONS$0);
        }
    }
    
    /**
     * Sets array of all "RenderingInstructions" element
     */
    public void setRenderingInstructionsArray(x0.messageStructure1.RenderingInstructionsType[] renderingInstructionsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(renderingInstructionsArray, RENDERINGINSTRUCTIONS$0);
        }
    }
    
    /**
     * Sets ith "RenderingInstructions" element
     */
    public void setRenderingInstructionsArray(int i, x0.messageStructure1.RenderingInstructionsType renderingInstructions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingInstructionsType target = null;
            target = (x0.messageStructure1.RenderingInstructionsType)get_store().find_element_user(RENDERINGINSTRUCTIONS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(renderingInstructions);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RenderingInstructions" element
     */
    public x0.messageStructure1.RenderingInstructionsType insertNewRenderingInstructions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingInstructionsType target = null;
            target = (x0.messageStructure1.RenderingInstructionsType)get_store().insert_element_user(RENDERINGINSTRUCTIONS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RenderingInstructions" element
     */
    public x0.messageStructure1.RenderingInstructionsType addNewRenderingInstructions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.RenderingInstructionsType target = null;
            target = (x0.messageStructure1.RenderingInstructionsType)get_store().add_element_user(RENDERINGINSTRUCTIONS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RenderingInstructions" element
     */
    public void removeRenderingInstructions(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERINGINSTRUCTIONS$0, i);
        }
    }
    
    /**
     * Gets the "NarrativeAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getNarrativeAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NARRATIVEABSTRACT$3, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NarrativeAbstract" element
     */
    public boolean isSetNarrativeAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NARRATIVEABSTRACT$3) != 0;
        }
    }
    
    /**
     * Sets the "NarrativeAbstract" element
     */
    public void setNarrativeAbstract(org.apache.xmlbeans.XmlObject narrativeAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(NARRATIVEABSTRACT$3, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NARRATIVEABSTRACT$2);
            }
            target.set(narrativeAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "NarrativeAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewNarrativeAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(NARRATIVEABSTRACT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "NarrativeAbstract" element
     */
    public void unsetNarrativeAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NARRATIVEABSTRACT$3, 0);
        }
    }
}
