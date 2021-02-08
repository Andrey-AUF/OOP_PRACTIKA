package Class4;

import ru.ssau.tk.andreyauf.ooppractika.Person;

public class Class4_1 {
    public static String getObjectPerson(Person obj) {
        if (obj.getFirstName() == null || obj.getLastName() == null) {
            throw new NullPointerException();
        }
        return obj.toString();
    }
}
