package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    private final QuickSort<Integer> testQuickSort = new QuickSort<>();

    @Test
    void testSort() {
        Integer[] data = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] expected = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, testQuickSort.sort(data));
        
        data = null;
        assertNull(testQuickSort.sort(data));
    }
}