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


}
