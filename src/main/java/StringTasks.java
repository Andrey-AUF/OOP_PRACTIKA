public class StringTasks {
    public void outputSeparately(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }
    }

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
    }
}