package ru.ssau.tk.andreyauf.ooppractika;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;

    public Person(String myFirstName, String myLastName){
        firstName = myFirstName;
        lastName = myLastName;
    }

    public Person(){
        firstName = "Andrey";
        lastName = "Penskiy";

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
