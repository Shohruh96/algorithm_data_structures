package org.example.src.robertSedgewick.sort.bP1_1;

import java.util.Arrays;

public class Test1 {
    public static int maxElement(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max=a[i];
        }
        return max;
    }
    public static int middleElement(int[] a){
        int N = a.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += a[i];
        }
        return sum/N;
    }
    public static int[] copyArray(int[] a){
        int N = a.length;
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }
        return b;
    }
    public static int[] reverse(int[] a){
        int N = a.length;
        for (int i = 0; i < N/2; i++) {
            int x = a[i];
            a[i] = a[N-1-i];
            a[N-1-i] = x;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {11, 3, 20, 3, 5, 8, 2, 5};

        System.out.println(maxElement(arr));
        System.out.println(middleElement(arr));
        System.out.println(Arrays.toString(copyArray(arr)));
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
