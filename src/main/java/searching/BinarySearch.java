package searching;

public class BinarySearch<T extends Comparable<T>> implements Search<T> {

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
        return binarySearch(data, key, 0, data.length - 1);
    }

    private int binarySearch(T[] data, T toSearch, int left, int right) {
        if (left <= right) {
            //Find midpoint of the array, to break if from
            int mid = left + (right - left) / 2;

            //if element is present at the mid itself
            if (data[mid].compareTo(toSearch) == 0) {
                return mid;
            }

            //If middle element is greater than element to be searched,
            //run binary search on  left array i.e. array from left to mid index
            if (data[mid].compareTo(toSearch) > 0) {
                return binarySearch(data, toSearch, left, mid - 1);
            }

            //If middle element is smaller than element to be searched,
            //run binary search on  right array i.e. array from mid to right index
            if (data[mid].compareTo(toSearch) < 0) {
                return binarySearch(data, toSearch, mid + 1, right);
            }
        }
        // We reach here when element is not present
        // in array
        return -1;
    }
}
