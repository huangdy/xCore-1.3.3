package com.saic.uicds.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.xmlbeans.XmlException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution;

import org.uicds.alertService.CreateAlertRequestDocument;
import org.uicds.incident.IncidentDocument;
import org.uicds.incident.UICDSIncidentType;
import org.uicds.incidentManagementService.IncidentInfoType;
import org.uicds.incidentManagementService.IncidentListType;
import org.uicds.profileService.CreateProfileRequestDocument;
import org.uicds.profileService.ProfileType;
import org.uicds.taskingService.CreateTaskListRequestDocument;

public class PerfModelData {

    private int numberOfReps = 10;
    private String INCIDENT_FILE = "src/test/resources/workproduct/IncidentSample.xml";
    private String ALERT_FILE = "src/test/resources/workproduct/CreateAlert.xml";
    private String TASKLIST_FILE = "src/test/resources/workproduct/CreateTaskList.xml";
    private String PROFILE_FILE = "src/test/resources/workproduct/IncidentCommander.xml";

    private UicdsProfile uicdsProfile;
    private UicdsIncident uicdsIncident;
    private UicdsAlert uicdsAlert;
    private UicdsTaskList uicdsTaskList;
    private UicdsMap uicdsMap;

    public void setUicdsProfile(UicdsProfile uicdsProfile) {
        this.uicdsProfile = uicdsProfile;
    }

    public void setUicdsIncident(UicdsIncident uicdsIncident) {
        this.uicdsIncident = uicdsIncident;
    }

    public void setUicdsAlert(UicdsAlert uicdsAlert) {
        this.uicdsAlert = uicdsAlert;
    }

    public void setUicdsTaskList(UicdsTaskList uicdsTaskList) {
        this.uicdsTaskList = uicdsTaskList;
    }

    public void setUicdsMap(UicdsMap m) {
        uicdsMap = m;
    }

    public void setNumberOfReps(int num) {
        numberOfReps = num;
    }

    public void run() {
        // Get the first profile and use it
        // TODO create a profile if one doesn't exist
        ProfileType profile = uicdsProfile.getFirstProfile();
        if (profile == null) {
            uicdsProfile.createProfile(getProfile());
        }

        // Get or create a new incident to test with
//        ArrayList<IncidentInfoType> incidentList = uicdsProfile.getIncidentList();
//        if (incidentList != null && incidentList.size() > 0) {
////            uicdsIncident.createFromWorkProduct(incidentList.get(0).getWorkProductId());
//        } else {
//            EDXLDistribution incidentDocument = getIncidentSample();
//            if (incidentDocument == null) {
//                System.exit(0);
//            }
//            uicdsIncident.setIncidentDocument(incidentDocument);
//            uicdsIncident.createOnCore();
//        }
        // Create a new incident
        IncidentDocument incidentDoc = getIncidentSample();
        uicdsIncident.setIncidentDocument(incidentDoc.getIncident());
        uicdsIncident.createOnCore();

        // Update the incident document
        for (int i = 0; i < numberOfReps; i++) {
            uicdsIncident.updateIncident();
        }

        // Submit some alerts
        CreateAlertRequestDocument alert = getAlertSample();
        for (int i = 0; i < numberOfReps; i++) {
            uicdsAlert.createAlertOnCore(alert);
        }
        uicdsIncident.updateAllWorkProducts();

        // Update some tasking work products
        System.out.println("TASK");
        CreateTaskListRequestDocument taskListRequest = getTaskingSample();
        taskListRequest.getCreateTaskListRequest().setIncidentId(uicdsIncident.getIncidentId());
        taskListRequest.getCreateTaskListRequest().setEntityID(profile.getRef().getId());
        uicdsTaskList.createTaskList(taskListRequest);
        for (int i = 0; i < numberOfReps; i++) {
            uicdsTaskList.updateTaskList();
        }
        uicdsIncident.updateAllWorkProducts();

        // Get the default Map
        HashMap<String, UicdsWorkProduct> wps = uicdsIncident.getWorkProductMap();
        UicdsWorkProduct map = null;
        for (String wpid : wps.keySet()) {
            UicdsWorkProduct p = wps.get(wpid);
            if (p.type.startsWith("Map")) {
                map = wps.get(wpid);
                break;
            }
        }

        // Update some map products
        if (map != null) {
            map.workProductID = uicdsIncident.getIncidentId();
            uicdsMap.set(map);
            uicdsMap.incidentID = uicdsIncident.getIncidentId();
            for (int i = 0; i < numberOfReps; i++) {
                uicdsMap.updateMap();
            }
        }
    }

    private IncidentDocument getIncidentSample() {
    	try {
    		InputStream in = new FileInputStream(
    				"src/test/resources/workproduct/IncidentSample2.xml");
    		IncidentDocument incidentDoc = IncidentDocument.Factory.parse(in);
    		return incidentDoc;
    	} catch (FileNotFoundException e) {
    		System.err.println("File not found");
    	} catch (XmlException e) {
    		System.err.println("error parsing files");
    	} catch (IOException e) {
    		System.err.println("File not found");
    	}
    	return null;
    }

    private CreateAlertRequestDocument getAlertSample() {
        try {
            InputStream in = new FileInputStream(ALERT_FILE);
            CreateAlertRequestDocument alert = CreateAlertRequestDocument.Factory.parse(in);
            return alert;
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + ALERT_FILE);
        } catch (XmlException e) {
            System.err.println("error parsing files " + ALERT_FILE + " " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File not found " + ALERT_FILE);
        }
        return null;
    }

    private CreateTaskListRequestDocument getTaskingSample() {
        try {
            InputStream in = new FileInputStream(TASKLIST_FILE);
            CreateTaskListRequestDocument taskList = CreateTaskListRequestDocument.Factory.parse(in);
            return taskList;
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + TASKLIST_FILE);
        } catch (XmlException e) {
            System.err.println("error parsing files " + TASKLIST_FILE + " " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File not found " + TASKLIST_FILE);
        }
        return null;
    }

    private CreateProfileRequestDocument getProfile() {
        try {
            InputStream in = new FileInputStream(PROFILE_FILE);
            CreateProfileRequestDocument profile = CreateProfileRequestDocument.Factory.parse(in);
            return profile;
        } catch (FileNotFoundException e) {
            System.err.println("File not found " + PROFILE_FILE);
        } catch (XmlException e) {
            System.err.println("error parsing files " + PROFILE_FILE + " " + e.getMessage());
        } catch (IOException e) {
            System.err.println("File not found " + PROFILE_FILE);
        }
        return null;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "contexts/application.xml" });

        // Get my objects
        PerfModelData perfModelData = (PerfModelData) context.getBean("perfModelData");

        perfModelData.run();
    }

}
