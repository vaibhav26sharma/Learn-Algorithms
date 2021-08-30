package sorting;

public class QuickSort<T extends Comparable<T>> implements Sort<T> {
    /**
     * @param data - array to be sorted
     * @return the sorted array
     */
    @Override
    public T[] sort(T[] data) {
        return quickSort(data);
    }

    private T[] quickSort(T[] arr) {
        if (arr == null) {
            return null;
        }
        return quickSort(arr, 0, arr.length-1);
    }
    private T[] quickSort(T[] arr, int lo, int high) {

        //If lo is greater than high, then indexes are not correct
        if (lo < high) {
            //Partition the array to left and right based on the pivot point
            int splitPoint = partition(arr, lo, high);
            //Recursively quicksort left part of pivot
            quickSort(arr,lo, splitPoint);
            //Recursively quicksort right part of pivot
            quickSort(arr,splitPoint+1,high);
        }
        return arr;
    }

    private int partition(T[] arr, int lo, int high) {
        int i = lo - 1;
        int j = high + 1;
        T pivot = arr[lo];

        //Keep on swapping i and j's until
        //i passes j or i becomes greater than j
        while (i < j) {
            //Keep on increasing i unless we found an element > pivot on the left side
            do {
                i++;
            }
            while (arr[i].compareTo(pivot) < 0);

            //Keep on decreasing j unless we find an element < pivot on the right side
            do {
                j--;
            } while (arr[j].compareTo(pivot) > 0);

            //When both above loops find respective elements
            //i.e. ele > pivot on left side
            //and ele < pivot on right side,
            //swap them, only if i < j i.e. only if indexes are valid
            if (i < j) {
                swap(arr, i, j);
            }
        }
        //if i > j i.e. parent while loop has terminated or i has surpassed j,
        //and hence that position of j is split point or pivot's position
        return j;
    }

    private void swap(T[] arr, int i , int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
