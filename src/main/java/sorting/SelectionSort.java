package sorting;

public class SelectionSort<T extends Comparable<T>> implements Sort<T> {
    /**
     * @param data - array to be sorted
     * @return the sorted array
     */
    @Override
    public T[] sort(T[] data) {
        if(data == null || data.length ==0) {
            return null;
        }

        int N = data.length;
        for(int i =0;i<N;i++) {
            int swapIndex = i;
            //Find Min in arr[i+1....N]
            for(int j =i+1 ;j<N;j++) {
                //If ele@j < ele@swapIndex, swap them
                if(data[j].compareTo(data[swapIndex]) < 0) {
                    swapIndex = j;
                }
            }
            swap(data , i , swapIndex);
        }
        return data;
    }

    private void swap(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
