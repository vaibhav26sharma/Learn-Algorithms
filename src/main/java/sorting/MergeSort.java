package sorting;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> implements Sort<T> {
    /**
     * @param data - array to be sorted
     * @return the sorted array
     */
    @Override
    public T[] sort(T[] data) {
        return divide(data);
    }

    private T[] divide(T[] data) {
        //Base case is when array has a single element,
        //it is already sorted
        int n = data.length;
        if (n <= 1) return data;

        //Split the array into two havles and recursively sort them
        T[] left = divide(Arrays.copyOfRange(data, 0, n / 2));
        T[] right = divide(Arrays.copyOfRange(data, n / 2, n));

        //Combine two array into one larger array
        return merge(left, right);
    }

    //Merge two sorted arrays into a larger sorted array
    private T[] merge(T[] left, T[] right) {
        //For managing indexes of left,right and merged array
        int i = 0;
        int l = 0;
        int r = 0;

        int leftSize = left.length;
        int rightSize = right.length;

        T[] mergedArray = (T[]) new Comparable[leftSize + rightSize];


        while (l < leftSize && r < rightSize) {
            //If element in left array is smaller than the one in right,
            //add it to the final array
            if (left[l].compareTo(right[r]) < 0) {
                mergedArray[i] = left[l];
                i++;
                l++;
            } else {
                mergedArray[i] = right[r];
                i++;
                r++;
            }
        }

        //Add remaining elements from left array
        //to merged_array which couldn't be compared.
        //Since index l could not go till left_size,
        //hence we can use it from where it was left
        while (l < leftSize) {
            mergedArray[i] = left[l];
            i++;
            l++;
        }

        //Add remaining elements from right array
        //to merged_array which couldn't be compared.
        //Since index l could not go till right_size,
        //hence we can use it from where it was right
        while (r < rightSize) {
            mergedArray[i] = right[r];
            i++;
            r++;
        }

        return mergedArray;
    }
}
