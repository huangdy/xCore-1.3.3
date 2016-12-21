/*
 * An XML document type.
 * Localname: Augmentation
 * Namespace: http://niem.gov/niem/structures/2.0
 * Java type: gov.niem.niem.structures.x20.AugmentationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.structures.x20.impl;
/**
 * A document containing one Augmentation(@http://niem.gov/niem/structures/2.0) element.
 *
 * This is a complex type.
 */
public class AugmentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.structures.x20.AugmentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AugmentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUGMENTATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/structures/2.0", "Augmentation");
    
    
    /**
     * Gets the "Augmentation" element
     */
    public gov.niem.niem.structures.x20.AugmentationType getAugmentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.structures.x20.AugmentationType target = null;
            target = (gov.niem.niem.structures.x20.AugmentationType)get_store().find_element_user(AUGMENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Augmentation" element
     */
    public void setAugmentation(gov.niem.niem.structures.x20.AugmentationType augmentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.structures.x20.AugmentationType target = null;
            target = (gov.niem.niem.structures.x20.AugmentationType)get_store().find_element_user(AUGMENTATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.structures.x20.AugmentationType)get_store().add_element_user(AUGMENTATION$0);
            }
            target.set(augmentation);
        }
    }
    
    /**
     * Appends and returns a new empty "Augmentation" element
     */
    public gov.niem.niem.structures.x20.AugmentationType addNewAugmentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.structures.x20.AugmentationType target = null;
            target = (gov.niem.niem.structures.x20.AugmentationType)get_store().add_element_user(AUGMENTATION$0);
            return target;
        }
    }
}
