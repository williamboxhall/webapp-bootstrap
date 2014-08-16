package org.example.application;

public class Location {
    private String address;
    private String gps;

    public Location(String address, String gps) {
        this.address = address;
        this.gps = gps;
    }

    public Location() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }
}
