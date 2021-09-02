package searching;

import sorting.Sort;

public class LinearSearch<T extends Comparable<T>> implements Search<T> {
    /**
     * @param data - array to be sorted
     * @return the sorted array
     */
    @Override
    public int search(T[] data, T key) {
        if (data == null || data.length == 0) {
            return -1;
        }

        //Iterate through the array and search for the key
        for (int i = 0; i < data.length; i++) {
            //Check if the current element is equal to the key
            if (data[i].compareTo(key) == 0) {
                return i;
            }
        }
        return -1;
    }
}
