package org.example.application;

import java.util.List;

public class StaffedBakery {
    private String name;
    private Location location;
    private List<StaffMember> staff;

    public StaffedBakery(String name, Location location, List<StaffMember> staff) {
        this.name = name;
        this.location = location;
        this.staff = staff;
    }

    public StaffedBakery() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public List<StaffMember> getStaff() {
        return staff;
    }

    public void setStaff(List<StaffMember> staff) {
        this.staff = staff;
    }
}
