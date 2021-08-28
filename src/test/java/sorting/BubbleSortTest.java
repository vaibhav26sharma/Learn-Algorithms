package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BubbleSortTest {

    private final Sort<Integer> testBubbleSort = new BubbleSort<>();

    @BeforeEach
    void setUp() {

    }

    @Test
    void sort() {
        Integer[] data = new Integer[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] expected = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertArrayEquals(expected, testBubbleSort.sort(data));
    }
}