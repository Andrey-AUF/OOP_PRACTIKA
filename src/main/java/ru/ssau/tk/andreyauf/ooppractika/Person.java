package ru.ssau.tk.andreyauf.ooppractika;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String myFirstName, String myLastName){
        firstName = myFirstName;
        lastName = myLastName;
    }


    public void setFirstName(String firstName1) {
        firstName = firstName1;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName1) {
        lastName = lastName1;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? "" : " ") + lastName;
    }

}
