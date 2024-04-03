package org.example.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 3, 1};
//        mergeSort(array);
//        System.out.println(Arrays.toString(array));
    }

//    public static void mergeSort(int[] array) {
//        int[] aux = new int[array.length];
//        sort(0, array.length - 1);
//    }

//    public static void sort(int low, int high) {
//        if (high <= low)
//            return;
//        int mid = (high + low) / 2;
//        sort(low, mid);
//        sort(mid + 1, high);
//        merge(low, mid, high);
//    }

//    public static void merge(int low, int mid, int high) {
//        int[] array = Main.array; // Replace "Main" with the name of your class
//        int[] aux = Main.aux; // Replace "Main" with the name of your class
//
//        if (array[mid] <= array[mid + 1])
//            return;
//        int i = low;
//        int j = mid + 1;
//        System.arraycopy(array, low, aux, low, high - low + 1);
//        for (int k = low; k <= high; k++) {
//            if (i > mid)
//                array[k] = aux[j++];
//            else if (j > high)
//                array[k] = aux[i++];
//            else if (aux[j] < aux[i])
//                array[k] = aux[j++];
//            else
//                array[k] = aux[i++];
//        }
//    }
}

