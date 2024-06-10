package com.avmfs.Services.Model;

import java.util.Date;

public class Schedule extends BaseEntity {
    private long vehicleID;
    private Date maintenanceDate;
    private String details;

    public Schedule() {
    }

    public Schedule(long id, long vehicleID, Date maintenanceDate, String details) {
        super(id);
        this.vehicleID = vehicleID;
        this.maintenanceDate = maintenanceDate;
        this.details = details;
    }

    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
