/**
 * 
 */
package com.saic.uicds.core;

import org.uicds.alertService.CreateAlertRequestDocument;
import org.uicds.alertService.CreateAlertResponseDocument;

/**
 * @author roger
 *
 */
public class UicdsAlert {

    private CoreServiceTemplate coreServiceTemplate;

    private CreateAlertRequestDocument alert;
    
	public void setCoreServiceTemplate(CoreServiceTemplate coreServiceTemplate) {
		this.coreServiceTemplate = coreServiceTemplate;
	}

	public void setAlert(CreateAlertRequestDocument alert) {
		this.alert = alert;
	}
	
	public void createAlertOnCore(CreateAlertRequestDocument alert) {
		this.alert = alert;
		
		CreateAlertResponseDocument response = (CreateAlertResponseDocument) coreServiceTemplate
        .marshalSendAndReceive(alert);
	}
}
