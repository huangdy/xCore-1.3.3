/**
 * 
 */
package com.saic.uicds.core.em.service;

import java.util.Calendar;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.springframework.transaction.annotation.Transactional;
import org.uicds.taskingService.TaskListType;
import org.uicds.taskingService.TaskType;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

/**
 * @author ron
 * 
 */
public class TaskingServiceTest extends AbstractXmldbJpaTests {

    Logger log = LoggerFactory.getLogger(TaskingServiceTest.class);

    @Autowired
    TaskingService taskingService;

    public void setTaskingService(TaskingService p) {
        taskingService = p;
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }

    @Test
    @Transactional
    public void testTaskingServiceCRUD() {
        IdentificationType workProductIdentification = IdentificationType.Factory.newInstance();

        WorkProduct workProduct = null;

        String entityId = "entityId";
        String incidentId = "incidentId";

        try {
            assertNotNull(taskingService);

            TaskListType taskList = TaskListType.Factory.newInstance();
            TaskType task1 = taskList.addNewTask();
            task1.setTaskID("taskId1");
            task1.setDescription("Description1");
            task1.setPriority(1);
            Calendar dueDateCalendar = Calendar.getInstance();
            task1.setDueDate(dueDateCalendar);
            Calendar assignedToCalendar = Calendar.getInstance();
            task1.addNewAssignedTo().setAssigned(assignedToCalendar);
            Calendar assignedByCalendar = Calendar.getInstance();
            task1.addNewAssignedBy().setAssigned(assignedByCalendar);
            XmlObject xmlObjectArray[] = new XmlObject[1];
            xmlObjectArray[0] = XmlObject.Factory.newInstance();
            XmlCursor cursor = xmlObjectArray[0].newCursor();
            cursor.toNextToken();
            cursor.beginElement("bookstore", "namespace");
            cursor.beginElement("book");
            cursor.insertElementWithText("id", "1");
            cursor.insertElementWithText("author", "author1");
            cursor.insertElementWithText("title", "title1");
            cursor.toNextToken();
            cursor.beginElement("book");
            cursor.insertElementWithText("id", "2");
            cursor.insertElementWithText("author", "author2");
            cursor.insertElementWithText("title", "title2");
            cursor.toNextToken();
            task1.addNewStatus().setStatusArray(xmlObjectArray);

            /*
             * RFR: uncomment when tasking service is working again workProductSummary =
             * taskingService.createTaskList(entityId, incidentId, taskList);
             * assertNotNull(workProductSummary);
             * System.out.println(workProductSummary.getWorkProductIdentification
             * ().getIdentifier().getStringValue());
             * 
             * TaskListType taskList2 = TaskListType.Factory.newInstance(); TaskType task2 =
             * taskList.addNewTask(); task2.setTaskID("taskId2");
             * task2.setDescription("Description2");
             * 
             * 
             * workProductIdentification.setChecksum(workProductSummary.getWorkProductIdentification(
             * ).getChecksum());
             * workProductIdentification.setIdentifier(workProductSummary.getWorkProductIdentification
             * ().getIdentifier());
             * workProductIdentification.setType(workProductSummary.getWorkProductIdentification
             * ().getType());
             * workProductIdentification.setVersion(workProductSummary.getWorkProductIdentification
             * ().getVersion()); workProductSummary = taskingService.updateTaskList(entityId,
             * incidentId, taskList2, workProductIdentification); assertNotNull(workProductSummary);
             * 
             * 
             * workProductIdentification.setChecksum(workProductSummary.getWorkProductIdentification(
             * ).getChecksum());
             * workProductIdentification.setIdentifier(workProductSummary.getWorkProductIdentification
             * ().getIdentifier());
             * workProductIdentification.setType(workProductSummary.getWorkProductIdentification
             * ().getType());
             * workProductIdentification.setVersion(workProductSummary.getWorkProductIdentification
             * ().getVersion()); workProduct = taskingService.getTaskList(entityId, incidentId,
             * workProductIdentification); assertNotNull(workProduct);
             * System.out.println("taskingService workProduct=" + workProduct.toString());
             * 
             * 
             * workProductIdentification.setChecksum(workProductSummary.getWorkProductIdentification(
             * ).getChecksum());
             * workProductIdentification.setIdentifier(workProductSummary.getWorkProductIdentification
             * ().getIdentifier());
             * workProductIdentification.setType(workProductSummary.getWorkProductIdentification
             * ().getType());
             * workProductIdentification.setVersion(workProductSummary.getWorkProductIdentification
             * ().getVersion()); workProductSummary = taskingService.deleteTaskList(entityId,
             * incidentId, workProductIdentification); assertNotNull(workProductSummary);
             */

        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
