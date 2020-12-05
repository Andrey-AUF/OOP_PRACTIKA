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
    }