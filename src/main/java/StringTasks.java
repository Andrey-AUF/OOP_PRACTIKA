import ru.ssau.tk.andreyauf.ooppractika.Person;
import ru.ssau.tk.andreyauf.ooppractika.Point;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
public class StringTasks {

    public void getArrayOfBytes(String str) {
        byte[] bytesValue = str.getBytes();
        for (int bytes : bytesValue) {
            System.out.println(bytes);
        }
    }

    public void sameStrings() {
        String s1 = "A";
        String s2 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }

    public static StringTasks check = new StringTasks();

    public static void main(String[] args) {
        check.getArrayOfBytes("пинг");
        System.out.println("");
        check.getArrayOfBytes("ping");
        check.sameStrings();
        System.out.println(check.isPalindrome("222"));
        System.out.println(check.isSameRegister("aaa", "Aaa"));
        System.out.println(getStringOfNumbers(10000));
        Charset charset = Charset.defaultCharset();
        System.out.println(charset);
        System.out.println(changeCharsetToString("Василий Иванович", StandardCharsets.UTF_8, StandardCharsets.UTF_16));         //вызов 3.24
        System.out.println(changeCharsetToString("Василий Иванович", StandardCharsets.UTF_8, StandardCharsets.US_ASCII));
        System.out.println(changeCharsetToString("Василий Иванович", StandardCharsets.UTF_8, StandardCharsets.UTF_16LE));
        System.out.println(changeCharsetToString("Василий Иванович", StandardCharsets.UTF_8, StandardCharsets.ISO_8859_1));
        Matrix matrix = new Matrix(2, 2);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(1, 0, -3);
        matrix.setAt(1, 1, -4);
        StringTasks.getDescription(matrix);
        StringTasks.getDescription(new Person("Andrey", "Penskiy", 159753963));
        StringTasks.getDescription(new Point(6, 6, 6));
    }

    public boolean isSameRegister(String strFirst, String strSecond) {
        return strFirst.equalsIgnoreCase(strSecond) && !strFirst.equals(strSecond);
    }

    public boolean isPalindrome(String str) {
        String palindrome = new StringBuilder(str).reverse().toString();
        return str.equals(palindrome);

    }

    public static int findSubstringInString(String str, String subStr) {
        return str.indexOf(subStr);
    }

    public static int findSubstringInSecondHalfString(String str, String substring) {
        return str.indexOf(substring, str.length() / 2);
    }

    public static int lastInFirstLineOfFirstLine(String str, String subStr) {
        return str.lastIndexOf(subStr, str.length() / 2);
    }

    static int countStrings(String[] array, String prefix, String postfix) {
        int count = 0;
        for (String string : array) {
            if (string.startsWith(prefix) && string.endsWith(postfix)) {
                count++;
            }
        }
        return count;
    }

    static int newCountOfStrings(String[] array, String prefix, String postfix) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        for (String str : array) {
            if (str.startsWith(prefix) && str.endsWith(postfix)) {
                number++;
            }
        }
        return number;
    }

    public static String newString(String strFirst, String strSecond, String strThird) {
        for (int i = 0; i < 100 && strFirst.contains(strSecond); i++) {
            strFirst = strFirst.replaceAll(strSecond, strThird);
        }
        return strFirst;
    }

    public static String getSubstringInString(String str, int from, int to) {
        if (from < 0) {
            from = 0;
        }
        if (to > str.length()) {
            to = str.length();
        }
        if (from == to) {
            return "";
        }
        return str.substring(from, to);
    }

    public static String concatenateStrings(String[] arrayStr) {
        return String.join(", ", arrayStr);
    }

    public static String getNewString(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                strBuilder.replace(i, i + 1, i + "");
            }
        }
        strBuilder.reverse();
        return strBuilder.toString();
    }

    public static String getStringOfNumbers(int number) {
        StringBuilder stringNumbers = new StringBuilder();
        for (int i = 0; i < number; i++) {
            stringNumbers.append(i);
        }
        return stringNumbers.toString();

    }
    public static String changeCharsetToString(String str, Charset charsetFirst, Charset charsetSecond) {
        return new String(str.getBytes(charsetFirst), charsetSecond);
    }
    public static void getDescription(Object obj) {
        System.out.println("Описание объекта: " + obj);
    }
}
