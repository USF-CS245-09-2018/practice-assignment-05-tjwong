public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }

    public void quickSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }
        int pivot = arr[(low+high)/2];
        int mid = partition(arr, low, high, pivot);
        quickSort(arr, low, mid -1);
        quickSort(arr, mid, high);
    }

    public int partition(int[] arr, int low, int high, int pivot){
        while(low <= high) {
            while(arr[low] < pivot){
                low++;
            }
            while(arr[high] > pivot){
                high--;
            }
            if(low <= high){
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    public void swap(int[] arr, int lower, int upper){
        int temp = arr[lower];
        arr[lower] = arr[upper];
        arr[upper] = temp;
    }
}