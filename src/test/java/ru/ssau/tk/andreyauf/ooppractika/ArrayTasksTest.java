package ru.ssau.tk.andreyauf.ooppractika;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class ArrayTasksTest {
    @Test
    public void testArrayLength() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.arrayLength(8);
        assertEquals(newArray.length, 8);
        int[] othArray = check.arrayLength(12);
        assertEquals(othArray.length, 12);
        assertNotEquals(othArray.length, 5);
    }
    @Test
    public void testGetArithmeticProgression() {
        assertEquals(ArrayTasks.getArithmeticProgression(2, 5, -2), new double[]{5, 3});
        assertEquals(ArrayTasks.getArithmeticProgression(5, -1, 2), new double[]{-1, 1, 3, 5, 7});
        assertEquals(ArrayTasks.getArithmeticProgression(3, 0, 4), new double[]{0, 4, 8});
    }
    @Test
    public void testGenerateOnesArray() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateOnesArray(5);
        assertEquals(newArray[0], 2);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 1);
        assertEquals(newArray[3], 1);
        assertEquals(newArray[4], 2);
    }
    @Test
    public void testGenerateArray() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateArray(5);
        assertEquals(newArray[0], 1);
        assertEquals(newArray[1], 3);
        assertEquals(newArray[2], 5);
        assertEquals(newArray[3], 7);
        assertEquals(newArray[4], 9);
    }
    @Test
    public void testGenerateArrayDecreasingEven() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateArrayDecreasingEven(5);
        assertEquals(newArray[0], 10);
        assertEquals(newArray[1], 8);
        assertEquals(newArray[2], 6);
        assertEquals(newArray[3], 4);
        assertEquals(newArray[4], 2);
    }
    @Test
    public void testGenerateArrayFibonacciNumbers() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateArrayFibonacciNumbers(6);
        assertEquals(newArray[0], 1);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 2);
        assertEquals(newArray[3], 3);
        assertEquals(newArray[4], 5);
        assertEquals(newArray[5], 8);
    }
    @Test
    public void testGenerateArraySqrIndex() {
        ArrayTasks check = new ArrayTasks();
        int[] newArray = check.generateArraySqrIndex(6);
        assertEquals(newArray[0], 0);
        assertEquals(newArray[1], 1);
        assertEquals(newArray[2], 4);
        assertEquals(newArray[3], 9);
        assertEquals(newArray[4], 16);
        assertEquals(newArray[5], 25);
    }
    @Test
    public void testQuadraticSolution() {
        ArrayTasks checkSolution = new ArrayTasks();
        assertEquals(checkSolution.quadraticSolution(2, 4, -16), new double[]{-4, 2}, 0.001);
        assertEquals(checkSolution.quadraticSolution(0, 4, -2), new double[]{0.5}, 0.001);
        assertEquals(checkSolution.quadraticSolution(1, 4, 4), new double[]{-2}, 0.001);
    }
    @Test
    public void testArrayNumbersWithoutDivisorsThree() {
        ArrayTasks checkArray = new ArrayTasks();
        checkArray.arrayNumbersWithoutDivisorsThree(4);
        assertEquals(checkArray.arrayNumbersWithoutDivisorsThree(4), new int[]{1, 2, 4, 5});
        assertEquals(checkArray.arrayNumbersWithoutDivisorsThree(5), new int[]{1, 2, 4, 5, 7});
        assertEquals(checkArray.arrayNumbersWithoutDivisorsThree(10), new int[]{1, 2, 4, 5, 7, 8, 10, 11, 13, 14});
    }

    @Test
    public void testGeometricProgression() {
        ArrayTasks checkProgression = new ArrayTasks();
        assertEquals(checkProgression.geometricProgression(4, 3, 1), new double[]{1, 3, 9, 27}, 0.0001);
        assertEquals(checkProgression.geometricProgression(5, 0.4, -2), new double[]{-2, -0.8, -0.32, -0.128, -0.0512}, 0.0001);
        assertEquals(checkProgression.geometricProgression(3, -2, -0.1), new double[]{-0.1, 0.2, -0.4}, 0.0001);
    }
    @Test
    public void testFindNumberInArray() {
        int[] array = {8, 17, 65, 15, 2};
        assertFalse(ArrayTasks.findNumberInArray(array, 5));
        assertTrue(ArrayTasks.findNumberInArray(array, 65));
        assertFalse(ArrayTasks.findNumberInArray(array, 7));
    }
    @Test
    public void testCheckNull() {
        Integer[] array = new Integer[]{2, 5, 6, null};
        assertTrue(ArrayTasks.checkNull(array));
        Integer[] arrayToo = new Integer[]{3, 2, 1};
        assertFalse(ArrayTasks.checkNull(arrayToo));
        Integer[] arrayNew = new Integer[]{null, 0, 1, null};
        assertTrue(ArrayTasks.checkNull(arrayNew));
    }
    @Test
    public void testChangeSign() {
        int[] array = {6, 6, 6};
        ArrayTasks.changeSign(array);
        assertEquals(array[0], -6);
        assertEquals(array[1], -6);
        assertEquals(array[2], -6);
    }
    @Test
    public void testCountEvenNumbers() {
        ArrayTasks checkNumbers = new ArrayTasks();
        int[] arrayOne = new int[]{1, 2, 3, 4, 5, 6, 10};
        assertEquals(checkNumbers.countEvenNumbers(arrayOne), 4);
        int[] arrayTwo = new int[]{12, 55, 6, 89, 12, 22, 24, 86, 666};
        assertEquals(checkNumbers.countEvenNumbers(arrayTwo), 7);
        int[] arrayThree = new int[]{1, 3, 5, 7, 9, 11, 97, 15, 21, 55, 91};
        assertEquals(checkNumbers.countEvenNumbers(arrayThree), 0);
    }
    @Test
    public void testFindMax() {
        ArrayTasks array = new ArrayTasks();
        int[] checkArray = new int[]{666, 6, 8, 5, 3, 2, 4, 1};
        assertEquals(array.findMax(checkArray), new Integer(666));
        int[] checkTwoArray = new int[]{-0, 0, 1489, 0, 0, 0, 0, 0};
        assertEquals(array.findMax(checkTwoArray), new Integer(1489));
        int[] checkNewArray = new int[]{};
        assertNull(array.findMax(checkNewArray));
    }
    @Test
    public void testSymmetricArray() {
        ArrayTasks checkSymmetric = new ArrayTasks();
        assertEquals(checkSymmetric.symmetricArray(7), new int[]{1, 2, 3, 4, 3, 2, 1});
        assertEquals(checkSymmetric.symmetricArray(6), new int[]{1, 2, 3, 3, 2, 1});
        assertEquals(checkSymmetric.symmetricArray(5), new int[]{1, 2, 3, 2, 1});
    }
    @Test
    public void testSumOfEvenIndex() {
        ArrayTasks checkSum = new ArrayTasks();
        assertEquals(checkSum.sumOfEvenIndex(new int[]{1, 2, 3, 4, 5, 6, 10}), 19);
        assertEquals(checkSum.sumOfEvenIndex(new int[]{5, 5, 5, 5, 5, 5, 5}), 20);
        assertEquals(checkSum.sumOfEvenIndex(new int[]{-1, 2, -3, 4, -5, 6, -10}), -19);
    }

}