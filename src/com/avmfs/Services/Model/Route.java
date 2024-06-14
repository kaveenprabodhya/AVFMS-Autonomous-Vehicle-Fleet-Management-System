package com.avmfs.Services.Model;

import java.util.Date;

public class Route extends BaseEntity {
    private String origin;
    private String destination;
    private long distance;
    private Date estimatedTime;

    public Route() {
    }

    public Route(long id, String origin, String destination, long distance, Date estimatedTime) {
        super(id);
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public Date getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Date estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id='" + this.getId() + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", distance=" + distance +
                ", estimatedTime=" + estimatedTime +
                '}';
    }
}
