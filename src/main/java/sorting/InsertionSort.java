package sorting;

import java.lang.reflect.Array;

public class InsertionSort<T extends Comparable<T>> implements Sort<T> {
    /**
     * @param data - array to be sorted
     * @return the sorted array
     */
    @Override
    public T[] sort(T[] data) {
        //Special case
        if (data == null || data.length == 0) {
            return (T[]) Array.newInstance(InsertionSort.class, 0);
        }

        //i starts from 1, since we are considering
        //that array is already sorted till A[0]
        for (int i = 1; i < data.length; i++) {
            //This child loop runs from  i till A[1],
            //Compares the jth element with its predecessor
            //and swaps only if jth element is smaller than its predecessor
            //considering it is an ascending sort
            for (int j = i; j > 0 && data[j].compareTo(data[j - 1]) < 0; j--) {
                swap(data, j - 1, j);
            }
        }
        return data;
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
