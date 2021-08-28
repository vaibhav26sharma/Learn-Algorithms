package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    private final Sort<Integer> testInsertionSort = new InsertionSort<>();

    @Test
    void testInsertionSort() {
        Integer[] data = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] expected = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, testInsertionSort.sort(data));

        data = new Integer[]{};
        assertNull(testInsertionSort.sort(data));

        assertNull(testInsertionSort.sort(null));
    }
}