package org.example.application;

import java.util.List;

public class Bakery {
    private final String name;
    private final Location location;
    private final List<Integer> staff;

    public Bakery(String name, Location location, List<Integer> staff) {
        this.name = name;
        this.location = location;
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public List<Integer> getStaff() {
        return staff;
    }
}
