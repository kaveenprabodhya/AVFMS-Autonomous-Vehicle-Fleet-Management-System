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

}
