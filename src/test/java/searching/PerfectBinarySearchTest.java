package searching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PerfectBinarySearchTest {

    private final PerfectBinarySearch<Integer> perfectBinarySearch = new PerfectBinarySearch<>();

    @Test
    void search() {
        assertEquals(-1, perfectBinarySearch.search(null, 4));
        Integer[] data = {4, -3, 2, 1, 7, 5, 6, 9, 8, -2, -4, 12, -3};
        Arrays.sort(data);
        assertEquals(-1, perfectBinarySearch.search(data, -12));
    }
}