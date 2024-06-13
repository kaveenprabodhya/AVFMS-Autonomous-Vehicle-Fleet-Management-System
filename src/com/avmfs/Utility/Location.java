package com.avmfs.Utility;

public class Location<X, Y> {
    private final X x;
    private final Y y;

    Location(X x, Y y){
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
