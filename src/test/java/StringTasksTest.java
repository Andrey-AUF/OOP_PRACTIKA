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

    @Test
    public void testFindSubstringInString() {
        assertEquals(StringTasks.findSubstringInString("abcabcabc", "ca"), 2);
        assertEquals(StringTasks.findSubstringInString("opopo", "o"), 0);
        assertEquals(StringTasks.findSubstringInString("mouse", "e"), 4);
        assertEquals(StringTasks.findSubstringInString("Ggot", "g"), 1);
        assertEquals(StringTasks.findSubstringInString("darkness", "b"), -1);
    }

    @Test
    public void testFindSubstringInSecondHalfString() {
        assertEquals(StringTasks.findSubstringInSecondHalfString("better", "ter"), 3);
        assertEquals(StringTasks.findSubstringInSecondHalfString("seven", "en"), 3);
        assertEquals(StringTasks.findSubstringInSecondHalfString("late", "te"), 2);
        assertEquals(StringTasks.findSubstringInSecondHalfString("real", "bbb"), -1);
        assertEquals(StringTasks.findSubstringInSecondHalfString("", "a"), -1);
    }

    @Test
    public void testLastInFirstLineOfFirstLine() {
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("abcabcabcabc", "ab"), 6);
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("love", ""), 2);
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("integer", "a"), -1);
        assertEquals(StringTasks.lastInFirstLineOfFirstLine("9798676", "9"), 2);
    }

    @Test
    public void testCountStrings() {
        assertEquals(StringTasks.countStrings(new String[]{"mother", "cat", "black", "pay pal", "respect"}, "p", "l"), 1);
        assertEquals(StringTasks.countStrings(new String[]{"mother", "cat", "black", "back", "respect", "among"}, "b", "k"), 2);
        assertEquals(StringTasks.countStrings(new String[]{"mother", "cat", "black", "pay", "respect", "among"}, "p", "p"), 0);
    }

    @Test
    public void testNewCountOfStrings() {
        assertEquals(StringTasks.newCountOfStrings(new String[]{"    mother", "cat    ", "black   ", "pay pal", "respect", "among"}, "p", "l"), 1);
        assertEquals(StringTasks.newCountOfStrings(new String[]{"mother", "cat", "black", "  back   ", "respect    ", "among   "}, "b", "k"), 2);
        assertEquals(StringTasks.newCountOfStrings(new String[]{"mother  ", "cat  ", " black", "    pay", "respect", "among"}, "p", "p"), 0);
    }

    @Test
    public void testNewString() {
        assertEquals(StringTasks.newString("opopopopo", "opo", "po"), "popppo");
        assertEquals(StringTasks.newString("корона", "ор", "к"), "ккона");
        assertEquals(StringTasks.newString("command", "mm", "nn"), "connand");
    }

    @Test
    public void testGetSubstringInString() {
        assertEquals(StringTasks.getSubstringInString("String tasks tests", 1, 1), "");
        assertEquals(StringTasks.getSubstringInString("String tasks tests", 5, 7), "g ");
        assertEquals(StringTasks.getSubstringInString("String tasks tests", -10, 3), "Str");
        assertEquals(StringTasks.getSubstringInString("String tasks tests", 0, 1), "S");
        assertEquals(StringTasks.getSubstringInString("String tasks tests", 10, 20), "ks tests");
    }
    @Test
    public void testConcatenateStrings() {
        assertEquals(StringTasks.concatenateStrings(new String[]{"hello", "how", "are", "you"}), "hello, how, are, you");
        assertEquals(StringTasks.concatenateStrings(new String[]{"better", "late", "then","never", "but", "better","never", "late"}), "better, late, then, never, but, better, never, late");
    }
}