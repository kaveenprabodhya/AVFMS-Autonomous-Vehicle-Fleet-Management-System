package com.avmfs.Utility;

public class LocationType<X, Y> {
    public final X x;
    public final Y y;

    LocationType(X x, Y y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "LocationType{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
