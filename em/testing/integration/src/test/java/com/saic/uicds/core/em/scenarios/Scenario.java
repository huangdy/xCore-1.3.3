package com.saic.uicds.core.em.scenarios;

import java.io.File;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.uicds.incident.IncidentDocument;

import x1.oasisNamesTcEmergencyCap1.AlertDocument;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;

import com.saic.uicds.core.em.service.AlertService;
import com.saic.uicds.core.em.service.IncidentManagementService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;

public abstract class Scenario {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    IncidentManagementService ims;

    @Autowired
    AlertService alertService;

    Logger logger = LoggerFactory.getLogger(getClass());

    public ProductPublicationStatus createIncident(File incidentDocument) throws Exception {
        logger.debug("Creating incident from file:" + incidentDocument);
        IncidentDocument incidentDoc = IncidentDocument.Factory.parse(incidentDocument);
        ProductPublicationStatus status = ims.createIncident(incidentDoc.getIncident());
        return status;
    }

    public ProductPublicationStatus createIncident(IncidentDocument incidentDoc) throws Exception {
        ProductPublicationStatus status = ims.createIncident(incidentDoc.getIncident());
        return status;
    }

    public ProductPublicationStatus createIncident(AlertDocument alertDoc) throws Exception {
        ProductPublicationStatus status = ims.createIncidentFromCap(alertDoc.getAlert());
        return status;
    }

    public ProductPublicationStatus createAlert(String incidentId, File alertDocument)
        throws Exception {
        logger.debug("Creating alert from file:" + alertDocument);
        AlertDocument alertDoc = AlertDocument.Factory.parse(alertDocument);
        Alert alert = alertDoc.getAlert();
        ProductPublicationStatus status = alertService.createAlert(incidentId, alert);
        return status;
    }

    public abstract void initialize() throws Exception;

}
