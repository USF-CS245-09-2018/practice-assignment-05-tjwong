import java.util.*;

public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        if (arr.length > 1) {
            int[] left = leftArray(arr);
            int[] right = rightArray(arr);

            sort(left);
            sort(right);
            merge(arr, left, right);
        }
    }

    public int[] leftArray(int[] arr) {
        return Arrays.copyOfRange(arr, 0, arr.length / 2);
    }

    public int[] rightArray(int[] arr) {
        return Arrays.copyOfRange(arr, arr.length / 2, arr.length);
    }

    public void merge(int[] arr, int[] left, int[] right) {
        int low = 0;
        int upper = 0;
        int index = 0;

        while (low < left.length && upper < right.length) {
            if(left[low] <= right[upper]){
                arr[index] = left[low];
                low++;
            } else {
                arr[index] = right[upper];
                upper++;
            }
            index++;
        }
    }
}
