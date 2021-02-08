package ru.ssau.tk.andreyauf.ooppractika;

public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
    }

}
