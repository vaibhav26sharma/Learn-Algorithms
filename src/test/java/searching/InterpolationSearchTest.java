package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterpolationSearchTest {

    private final Search<Integer> testInterpolationSearch = new InterpolationSearch<>();

    @Test
    void search() {
        assertEquals(-1, testInterpolationSearch.search(null, 4));
        Integer[] data = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        assertEquals(-1, testInterpolationSearch.search(data, 32));
        assertEquals(0, testInterpolationSearch.search(data, 10));
        assertEquals(1, testInterpolationSearch.search(data, 12));
        assertEquals(2, testInterpolationSearch.search(data, 13));
        data = new Integer[]{};
        assertEquals(-1, testInterpolationSearch.search(data, 4));
    }
}