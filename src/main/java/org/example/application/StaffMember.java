package org.example.application;

public class StaffMember {
    private String firstName;
    private String role;
    private String age;

    public StaffMember(String firstName, String role, String age) {
        this.firstName = firstName;
        this.role = role;
        this.age = age;
    }

    public StaffMember() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
