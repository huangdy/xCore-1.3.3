/**
 * 
 */
package com.saic.uicds.core;

import org.uicds.mapService.SubmitMapRequestDocument;
import org.uicds.mapService.SubmitMapResponseDocument;
import org.uicds.mapService.UpdateMapRequestDocument;
import org.uicds.mapService.UpdateMapResponseDocument;

/**
 * @author roger
 * 
 */
public class UicdsMap {

    private CoreServiceTemplate coreServiceTemplate;

    UicdsWorkProduct map;
    String incidentID;

    public void setCoreServiceTemplate(CoreServiceTemplate coreServiceTemplate) {
        this.coreServiceTemplate = coreServiceTemplate;
    }

    public void set(UicdsWorkProduct m) {
        map = m;
    }

    public void updateMap() {
        UpdateMapRequestDocument request = UpdateMapRequestDocument.Factory.newInstance();
//        request.addNewUpdateMapRequest().setMap(map.getContent());
//        request.getUpdateMapRequest().setIncidentId(incidentID);
//        request.getUpdateMapRequest().setMapId(map.getId());

        System.out.println(request);

        UpdateMapResponseDocument response = (UpdateMapResponseDocument) coreServiceTemplate.marshalSendAndReceive(request);
    }
}
