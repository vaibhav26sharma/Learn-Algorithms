package sorting;

/Users/macbookair/.ssh/id_ed25519

public class BubbleSort<T extends Comparable<T>> implements Sort<T> {
    /**
     * @param data - array to be sorted
     * @return the sorted array
     */
    @Override
    public T[] sort(T[] data) {
        // Sort the array using bubble sort. The idea behind
        // bubble sort is to look for adjacent indexes which
        // are out of place and interchange their elements
        // until the entire array is sorted.

        //The algorithm needs one whole pass without any swap to know it is sorted.
        if (data == null) {
            throw new IndexOutOfBoundsException("Cannot sort the empty array.");
        }
        boolean sorted = false;

        do {
            sorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                //If element@i is greater and element@i+1, then swap
                if (data[i].compareTo(data[i + 1]) > 0) {
                    swap(data, i + 1, i);
                    sorted = false;
                }
            }

        }
        while (!sorted);

        return data;
    }

    private void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
