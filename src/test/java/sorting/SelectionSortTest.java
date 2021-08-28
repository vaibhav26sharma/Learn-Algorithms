package sorting;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    private final Sort<Integer> testSelectionSort = new SelectionSort<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void testSort() {
        Integer[] data = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] expected = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, testSelectionSort.sort(data));

        data = new Integer[]{};
        assertNull(testSelectionSort.sort(data));
    }
}