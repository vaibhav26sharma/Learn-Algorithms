package searching;

public class JumpSearch<T extends Comparable<T>> implements Search<T> {
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
        return jumpSearch(data, key);
    }

    private int jumpSearch(T[] data, T key) {
        //Length of the Array
        int length = data.length;

        //Block size by which we need to jump
        int blockSize = (int) Math.sqrt(length);

        //Start search by adding blockSize once
        int limit = blockSize;

        //Keep on iterating & increasing limit by blockSize until we find a limit index
        //whose value is greater than the key.
        //Once we find that, the element will be in the span of limit-blockSize to limit since
        //it is smaller than the current limit
        //Also, make sure that the limit doesn't exceed the array length
        //Hence taking min(limit+blockSize, data.length - 1)
        while (key.compareTo(data[limit]) > 0 && limit < data.length - 1) {
            limit = Math.min(limit + blockSize, data.length - 1);
        }

        //Once we find the limit where key < data[limit]
        //perform a linear search between
        //limit-blockSize and limit
        for (int i = limit - blockSize; i <= limit; i++) {
            if (data[i] == key) {
                return i;
            }
        }
        //Element not found
        return -1;
    }
}
