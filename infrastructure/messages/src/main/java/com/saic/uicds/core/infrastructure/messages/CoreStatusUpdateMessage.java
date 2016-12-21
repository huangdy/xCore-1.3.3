package com.saic.uicds.core.infrastructure.messages;

public class CoreStatusUpdateMessage {
    String coreName;
    String coreStatus;
    String coreLatitude;
    String coreLongitude;

    public String getCoreName() {
        return coreName;
    }

    public void setCoreName(String coreName) {
        this.coreName = coreName;
    }

    public String getCoreStatus() {
        return coreStatus;
    }

    public void setCoreStatus(String coreStatus) {
        this.coreStatus = coreStatus;
    }

    public String getCoreLatitude() {
        return coreLatitude;
    }

    public void setCoreLatitude(String coreLatitude) {
        this.coreLatitude = coreLatitude;
    }

    public String getCoreLongitude() {
        return coreLongitude;
    }

    public void setCoreLongitude(String coreLongitude) {
        this.coreLongitude = coreLongitude;
    }
    
    
//    public CoreStatusUpdateMessage(String coreName, String coreStatus) {
//        setCoreName(coreName);
//        setCoreStatus(coreStatus);
//        setCoreLatitude("");
//        setCoreLongitude("");
//    }
    
    public CoreStatusUpdateMessage(String coreName, String coreStatus, String latitude, String longitude) {
        setCoreName(coreName);
        setCoreStatus(coreStatus);
        setCoreLatitude(latitude);
        setCoreLongitude(longitude);
    } 
    
}
