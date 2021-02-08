package ru.ssau.tk.andreyauf.ooppractika;

import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
    }

}
