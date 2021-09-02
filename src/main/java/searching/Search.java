package searching;

public interface Search<T> {

    /**
     * @param data - array in which search needs to be performed
     * @param key  - key to be searched
     * @return - index of the first occurence of key in data, -1 if not found
     */
    int search(T[] data, T key);
}
