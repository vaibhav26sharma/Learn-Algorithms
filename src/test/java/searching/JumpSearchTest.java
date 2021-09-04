package searching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JumpSearchTest {

    private final JumpSearch<Integer> testJumpSearch = new JumpSearch<>();

    @Test
    void search() {
        assertEquals(-1, testJumpSearch.search(null, 4));
        Integer[] data = {4, -3, 2, 1, 7, 5, 6, 9, 8, -2, -4, 12, -3};
        Arrays.sort(data);
        assertEquals(-1, testJumpSearch.search(data, -12));
        assertEquals(6, testJumpSearch.search(data, 4));
        assertEquals(12, testJumpSearch.search(data, 12));
        data = new Integer[]{};
        assertEquals(-1, testJumpSearch.search(data, 4));
    }
}