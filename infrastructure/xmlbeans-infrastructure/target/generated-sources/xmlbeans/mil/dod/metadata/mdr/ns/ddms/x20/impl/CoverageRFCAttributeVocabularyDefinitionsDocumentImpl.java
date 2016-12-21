/*
 * An XML document type.
 * Localname: CoverageRFCAttributeVocabularyDefinitions
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.CoverageRFCAttributeVocabularyDefinitionsDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one CoverageRFCAttributeVocabularyDefinitions(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class CoverageRFCAttributeVocabularyDefinitionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.CoverageRFCAttributeVocabularyDefinitionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoverageRFCAttributeVocabularyDefinitionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COVERAGERFCATTRIBUTEVOCABULARYDEFINITIONS$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "CoverageRFCAttributeVocabularyDefinitions");
    
    
    /**
     * Gets the "CoverageRFCAttributeVocabularyDefinitions" element
     */
    public org.apache.xmlbeans.XmlObject getCoverageRFCAttributeVocabularyDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(COVERAGERFCATTRIBUTEVOCABULARYDEFINITIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CoverageRFCAttributeVocabularyDefinitions" element
     */
    public void setCoverageRFCAttributeVocabularyDefinitions(org.apache.xmlbeans.XmlObject coverageRFCAttributeVocabularyDefinitions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(COVERAGERFCATTRIBUTEVOCABULARYDEFINITIONS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(COVERAGERFCATTRIBUTEVOCABULARYDEFINITIONS$0);
            }
            target.set(coverageRFCAttributeVocabularyDefinitions);
        }
    }
    
    /**
     * Appends and returns a new empty "CoverageRFCAttributeVocabularyDefinitions" element
     */
    public org.apache.xmlbeans.XmlObject addNewCoverageRFCAttributeVocabularyDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(COVERAGERFCATTRIBUTEVOCABULARYDEFINITIONS$0);
            return target;
        }
    }
}
