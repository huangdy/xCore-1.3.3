/*
 * XML Type:  TaskType
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.TaskType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService;


/**
 * An XML TaskType(@http://uicds.org/TaskingService).
 *
 * This is a complex type.
 */
public interface TaskType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TaskType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("tasktype38edtype");
    
    /**
     * Gets the "taskID" element
     */
    java.lang.String getTaskID();
    
    /**
     * Gets (as xml) the "taskID" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetTaskID();
    
    /**
     * Sets the "taskID" element
     */
    void setTaskID(java.lang.String taskID);
    
    /**
     * Sets (as xml) the "taskID" element
     */
    void xsetTaskID(org.apache.xmlbeans.XmlAnyURI taskID);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Gets the "priority" element
     */
    int getPriority();
    
    /**
     * Gets (as xml) the "priority" element
     */
    org.apache.xmlbeans.XmlInt xgetPriority();
    
    /**
     * Sets the "priority" element
     */
    void setPriority(int priority);
    
    /**
     * Sets (as xml) the "priority" element
     */
    void xsetPriority(org.apache.xmlbeans.XmlInt priority);
    
    /**
     * Gets the "assignedTo" element
     */
    org.uicds.taskingService.TaskType.AssignedTo getAssignedTo();
    
    /**
     * Sets the "assignedTo" element
     */
    void setAssignedTo(org.uicds.taskingService.TaskType.AssignedTo assignedTo);
    
    /**
     * Appends and returns a new empty "assignedTo" element
     */
    org.uicds.taskingService.TaskType.AssignedTo addNewAssignedTo();
    
    /**
     * Gets the "assignedBy" element
     */
    org.uicds.taskingService.TaskType.AssignedBy getAssignedBy();
    
    /**
     * Sets the "assignedBy" element
     */
    void setAssignedBy(org.uicds.taskingService.TaskType.AssignedBy assignedBy);
    
    /**
     * Appends and returns a new empty "assignedBy" element
     */
    org.uicds.taskingService.TaskType.AssignedBy addNewAssignedBy();
    
    /**
     * Gets the "status" element
     */
    org.uicds.taskingService.TaskType.Status getStatus();
    
    /**
     * Sets the "status" element
     */
    void setStatus(org.uicds.taskingService.TaskType.Status status);
    
    /**
     * Appends and returns a new empty "status" element
     */
    org.uicds.taskingService.TaskType.Status addNewStatus();
    
    /**
     * Gets the "dueDate" element
     */
    java.util.Calendar getDueDate();
    
    /**
     * Gets (as xml) the "dueDate" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDueDate();
    
    /**
     * Sets the "dueDate" element
     */
    void setDueDate(java.util.Calendar dueDate);
    
    /**
     * Sets (as xml) the "dueDate" element
     */
    void xsetDueDate(org.apache.xmlbeans.XmlDateTime dueDate);
    
    /**
     * An XML assignedTo(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public interface AssignedTo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssignedTo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("assignedto9048elemtype");
        
        /**
         * Gets the "id" element
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetId();
        
        /**
         * Sets the "id" element
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" element
         */
        void xsetId(org.apache.xmlbeans.XmlAnyURI id);
        
        /**
         * Gets the "assigned" element
         */
        java.util.Calendar getAssigned();
        
        /**
         * Gets (as xml) the "assigned" element
         */
        org.apache.xmlbeans.XmlDateTime xgetAssigned();
        
        /**
         * Sets the "assigned" element
         */
        void setAssigned(java.util.Calendar assigned);
        
        /**
         * Sets (as xml) the "assigned" element
         */
        void xsetAssigned(org.apache.xmlbeans.XmlDateTime assigned);
        
        /**
         * Gets the "accepted" element
         */
        java.util.Calendar getAccepted();
        
        /**
         * Gets (as xml) the "accepted" element
         */
        org.apache.xmlbeans.XmlDateTime xgetAccepted();
        
        /**
         * Sets the "accepted" element
         */
        void setAccepted(java.util.Calendar accepted);
        
        /**
         * Sets (as xml) the "accepted" element
         */
        void xsetAccepted(org.apache.xmlbeans.XmlDateTime accepted);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.taskingService.TaskType.AssignedTo newInstance() {
              return (org.uicds.taskingService.TaskType.AssignedTo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.taskingService.TaskType.AssignedTo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.taskingService.TaskType.AssignedTo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML assignedBy(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public interface AssignedBy extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssignedBy.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("assignedby00ecelemtype");
        
        /**
         * Gets the "id" element
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetId();
        
        /**
         * Sets the "id" element
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" element
         */
        void xsetId(org.apache.xmlbeans.XmlAnyURI id);
        
        /**
         * Gets the "assigned" element
         */
        java.util.Calendar getAssigned();
        
        /**
         * Gets (as xml) the "assigned" element
         */
        org.apache.xmlbeans.XmlDateTime xgetAssigned();
        
        /**
         * Sets the "assigned" element
         */
        void setAssigned(java.util.Calendar assigned);
        
        /**
         * Sets (as xml) the "assigned" element
         */
        void xsetAssigned(org.apache.xmlbeans.XmlDateTime assigned);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.taskingService.TaskType.AssignedBy newInstance() {
              return (org.uicds.taskingService.TaskType.AssignedBy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.taskingService.TaskType.AssignedBy newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.taskingService.TaskType.AssignedBy) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML status(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public interface Status extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Status.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("statuse59felemtype");
        
        /**
         * Gets array of all "Status" elements
         */
        org.apache.xmlbeans.XmlObject[] getStatusArray();
        
        /**
         * Gets ith "Status" element
         */
        org.apache.xmlbeans.XmlObject getStatusArray(int i);
        
        /**
         * Returns number of "Status" element
         */
        int sizeOfStatusArray();
        
        /**
         * Sets array of all "Status" element
         */
        void setStatusArray(org.apache.xmlbeans.XmlObject[] statusArray);
        
        /**
         * Sets ith "Status" element
         */
        void setStatusArray(int i, org.apache.xmlbeans.XmlObject status);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Status" element
         */
        org.apache.xmlbeans.XmlObject insertNewStatus(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Status" element
         */
        org.apache.xmlbeans.XmlObject addNewStatus();
        
        /**
         * Removes the ith "Status" element
         */
        void removeStatus(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.taskingService.TaskType.Status newInstance() {
              return (org.uicds.taskingService.TaskType.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.taskingService.TaskType.Status newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.taskingService.TaskType.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.taskingService.TaskType newInstance() {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.taskingService.TaskType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.taskingService.TaskType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.taskingService.TaskType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.taskingService.TaskType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.taskingService.TaskType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.taskingService.TaskType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.taskingService.TaskType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.taskingService.TaskType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.taskingService.TaskType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.taskingService.TaskType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.taskingService.TaskType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.taskingService.TaskType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.taskingService.TaskType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.taskingService.TaskType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.taskingService.TaskType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.taskingService.TaskType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.taskingService.TaskType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.taskingService.TaskType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
