package org.example.application;

public class Person {
    private final String title;
    private final String firstName;
    private final String lastName;
    private final String role;
    private final int age;

    public Person(String title, String firstName, String lastName, String role, int age) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public int getAge() {
        return age;
    }
}
