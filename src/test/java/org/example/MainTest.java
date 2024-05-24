package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    // Path 1: Loop executes
    @Test
    void testNonEmptyArray() {
        int[] array = {1, 2, 3, 4, 5};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, array, "Array {1, 2, 3, 4, 5} should be reversed to {5, 4, 3, 2, 1}");
    }

    @Test
    void testArrayWithNegativeValues() {
        int[] array = {-1, -2, -3, -4, -5};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{-5, -4, -3, -2, -1}, array, "Array {-1, -2, -3, -4, -5} should be reversed to {-5, -4, -3, -2, -1}");
    }

    @Test
    void testArrayWithMixedValues() {
        int[] array = {1, -2, 3, -4, 5};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{5, -4, 3, -2, 1}, array, "Array {1, -2, 3, -4, 5} should be reversed to {5, -4, 3, -2, 1}");
    }

    @Test
    void testIdenticalElementsArray() {
        int[] array = {1, 1, 1, 1};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{1, 1, 1, 1}, array, "Array {1, 1, 1, 1} should remain {1, 1, 1, 1} after reverse");
    }

    @Test
    void testArrayWithLargeNumbers() {
        int[] array = {100000, 200000, 300000, 400000, 500000};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{500000, 400000, 300000, 200000, 100000}, array, "Array {100000, 200000, 300000, 400000, 500000} should be reversed to {500000, 400000, 300000, 200000, 100000}");
    }

    // Path 2: Loop does not execute
    @Test
    void testEmptyArray() {
        int[] array = {};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{}, array, "Empty array should remain empty after reverse");
    }

    @Test
    void testSingleElementArray() {
        int[] array = {10};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{10}, array, "Array with single element {10} should remain {10} after reverse");
    }

    @Test
    void testArrayWithZeroes() {
        int[] array = {0, 0, 0, 0, 0};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, array, "Array {0, 0, 0, 0, 0} should remain {0, 0, 0, 0, 0} after reverse");
    }

    // Failing test cases for demonstration
    @Test
    void testNonEmptyArray_Fail() {
        int[] array = {1, 2, 3, 4, 5};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array, "Failing case: Array {1, 2, 3, 4, 5} should be incorrectly reversed to {1, 2, 3, 4, 5}");
    }

    @Test
    void testSingleElementArray_Fail() {
        int[] array = {10};
        Main.reverseArray(array);
        assertArrayEquals(new int[]{20}, array, "Failing case: Array with single element {10} should incorrectly change to {20}");
    }
}
