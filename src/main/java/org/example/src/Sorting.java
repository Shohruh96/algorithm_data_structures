package org.example.src;

import java.util.Arrays;



public class Sorting {

    public static void BubbleSort(int[] array) {
        for (int partIndex = array.length-1; partIndex > 0; partIndex--) {
            for (int i = 0; i < partIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }
 
    public static void SelectionSort(int[] array) {
        for (int partIndex = array.length-1; partIndex > 0; partIndex--) {
            int largestAt = 0;
            for (int i = 1; i <= partIndex; i++) {
                if (array[i] > array[largestAt]) {
                    largestAt = i;
                }
            }
            swap(array, largestAt, partIndex);
        }
    }

    public static void InsertionSort(int[] array) {
        for (int partIndex = 1; partIndex < array.length; partIndex++) {
            int curUnsorted = array[partIndex];
            int i = 0;
            for (i = partIndex; ((i > 0) && (array[i - 1] > curUnsorted)); i--) {
                array[i] = array[i - 1];
            }
            array[i] = curUnsorted;
        }
    }

    public static void shellSort(int[] array) {
        int gap = 1;
        while (gap < array.length / 3)
            gap = 3 * gap + 1;
        while (gap >= 1) {
            for (int i = gap; i < array.length; i++) {
                for (int j = i; j >= gap && array[j] < array[j - gap]; j -= gap) {
                    swap(array, j, j - gap);
                }
            }
            gap /= 3;
        }
    }



//    public static void mergeSort(int[] array) {
//        int[] aux = new int[array.length];
//        sort(0, array.length - 1);
//
//        void sort(int low, int high) {
//            if (high <= low)
//                return;
//
//            int mid = (high + low) / 2;
//            sort(low, mid);
//            sort(mid + 1, high);
//            merge(low, mid, high);
//        }
//
//        void merge(int low, int mid, int high) {
//            if (array[mid] <= array[mid + 1])
//                return;
//
//            int i = low;
//            int j = mid + 1;
//
//            System.arraycopy(array, low, aux, low, high - low + 1);
//
//            for (int k = low; k <= high; k++) {
//                if (i > mid)
//                    array[k] = aux[j++];
//                else if (j > high)
//                    array[k] = aux[i++];
//                else if (aux[j] < aux[i])
//                    array[k] = aux[j++];
//                else
//                    array[k] = aux[i++];
//            }
//        }
//    }


    private static void swap(int[] array, int i, int j){
        if (i == j)  return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
