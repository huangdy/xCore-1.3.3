/**
 * 
 */
package com.saic.uicds.core;

import org.uicds.taskingService.CreateTaskListRequestDocument;
import org.uicds.taskingService.CreateTaskListResponseDocument;
import org.uicds.taskingService.UpdateTaskListRequestDocument;
import org.uicds.taskingService.UpdateTaskListResponseDocument;
import org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest;
import org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.ProcessingStateType;
import com.saic.precis.x2009.x06.base.ProcessingStatusType;
import com.saic.precis.x2009.x06.base.ProcessingStateType.Enum;

/**
 * @author roger
 * 
 */
public class UicdsTaskList {

    private CoreServiceTemplate coreServiceTemplate;

    private CreateTaskListRequest taskList;
    private IdentificationType workProductId;

    public void setCoreServiceTemplate(CoreServiceTemplate coreServiceTemplate) {
        this.coreServiceTemplate = coreServiceTemplate;
    }

    public void createTaskList(CreateTaskListRequestDocument taskListRequest) {
        taskList = taskListRequest.getCreateTaskListRequest();
        
        CreateTaskListResponseDocument response = (CreateTaskListResponseDocument) coreServiceTemplate.marshalSendAndReceive(taskListRequest);

        Enum status = response.getCreateTaskListResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus().getStatus();
        
        if (status == ProcessingStateType.ACCEPTED) {
        	// Save WorkProductIdentification for updating.
        	workProductId = response.getCreateTaskListResponse().getWorkProductPublicationResponse().getWorkProductSummary().getWorkProductIdentification();
        }

    }

    public void updateTaskList() {
//        UpdateTaskListRequestDocument request = UpdateTaskListRequestDocument.Factory.newInstance();
//        request.setUpdateTaskListRequest(taskListUpdate);
//
//        UpdateTaskListResponseDocument response = (UpdateTaskListResponseDocument) coreServiceTemplate.marshalSendAndReceive(request);
        // System.out.println(response);

    }
}
