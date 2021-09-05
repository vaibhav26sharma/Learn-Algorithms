package searching;

/**
 * This is a better version of binary search, where instead of searching from middle element,
 * the index of element to start search from is calculated based on if it will be near
 * to low index of high index.
 * <p>
 * This is favorable for Sorted data sets which have uniformly distributed data.
 */
public class InterpolationSearch<T extends Comparable<T>> implements Search<T> {

    /**
     * @param data - array in which search needs to be performed
     * @param key  - key to be searched
     * @return - index of the first occurrence of key in data, -1 if not found
     */
    @Override
    public int search(T[] data, T key) {
        if (data == null || data.length == 0) {
            return -1;
        }

        if (key == null) {
            return -1;
        }
        return interpolationSearch(data, key);
    }

    private int interpolationSearch(T[] arr, T key) {
        int length = arr.length;
        int low = 0;
        int high = length - 1;

        //keep running loop while low and high indexes are valid
        //and if the key to find "key" lies between the low and high elements in the
        //sorted array
        while (low <= high && (key.compareTo(arr[low]) >= 0) && (key.compareTo(arr[high]) <= 0)) {

            //Probe position assuming uniform distribution
            int index = getIndex(arr, key, low, high);

            //If value at interpolated index < key , ignore array to the left of index
            //and search in right array i.e. array right to index, hence low = index+1
            if (arr[index].compareTo(key) < 0) {
                low = index + 1;
            }
            //If value at interpolated index > key , ignore array to the right of index
            //and search in left array i.e. array left to index, hence high = index-1
            else if (arr[index].compareTo(key) > 0) {
                high = index - 1;
            } else {
                //Found key , since arr[index] == key
                return index;
            }
        }
        //Not Found
        return -1;
    }

    private int getIndex(T[] arr, T key, int low, int high) {
        //Converting all values to integer for computation
        int kInt = Integer.parseInt(key.toString());
        int lowInt = Integer.parseInt(arr[low].toString());
        int highInt = Integer.parseInt(arr[high].toString());

        //Find the index using interpolation formula
        return low + ((kInt - lowInt) * (high - low)) / (highInt - lowInt);
    }
}

