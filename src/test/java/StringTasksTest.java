import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringTasksTest {

    public static StringTasks check = new StringTasks();

    @Test
    public void testisPalindrome() {
        assertTrue(check.isPalindrome("111"));
        assertTrue(check.isPalindrome("gg"));
        assertTrue(check.isPalindrome("lol"));
        assertFalse(check.isPalindrome("abc"));
        assertFalse(check.isPalindrome("578"));
        assertFalse(check.isPalindrome("Aaa"));
    }

    @Test
    public void testIsSameRegister() {
        assertFalse(check.isSameRegister("111", "111"));
        assertFalse(check.isSameRegister("", "aaa"));
        assertTrue(check.isSameRegister("AaA", "aaA"));
        assertTrue(check.isSameRegister("Aaa", "aaa"));
        assertTrue(check.isSameRegister("bbb", "BBB"));
        assertFalse(check.isSameRegister("AAA", "aa"));
        assertFalse(check.isSameRegister("", ""));
    }
}