package com.avmfs.Utility;

import java.time.LocalDateTime;

public class FleetingStatus {
    private Location<Double, Double> location;
    private LocalDateTime timestamp;
    private String status;
    private Severity severity;

    public FleetingStatus() {
    }

    public FleetingStatus(Location<Double, Double> location, LocalDateTime timestamp, String status, Severity severity) {
        this.location = location;
        this.timestamp = timestamp;
        this.status = status;
        this.severity = severity;
    }

    public Location<Double, Double> getLocation() {
        return location;
    }

    public void setLocation(Location<Double, Double> location) {
        this.location = location;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }
}
