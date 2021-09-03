package searching;

public class PerfectBinarySearch<T extends Comparable<T>> implements Search<T> {

    /**
     * @param data - array in which search needs to be performed
     * @param key  - key to be searched
     * @return - index of the first occurence of key in data, -1 if not found
     */
    @Override
    public int search(T[] data, T key) {
        if (data == null || data.length == 0) {
            return -1;
        }
        return perfectBinarySearch(data, key);
    }

    private int perfectBinarySearch(T[] data, T key) {
        int left = 0;
        int right = data.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            //if mid is the key to be searched
            if (data[mid].compareTo(key) == 0) {
                return mid;
            }
            //if mid is greater than the key,
            //search in left part of the array
            else if (data[mid].compareTo(key) > 0) {
                right = mid - 1;
            }
            //if mid is less than the key,
            //search in the right part of the array
            else {
                left = mid + 1;
            }
        }
        //If element is not found
        return -1;
    }
}
