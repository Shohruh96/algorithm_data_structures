package org.example;

import org.example.src.Sorting;
import org.example.src.TreeSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Sorting sorting = new Sorting();
        int[] nums = {21, 211, 32, 90, 32, 2};

        System.out.println("--------------------BUBBLE SORT--------------------");
        sorting.BubbleSort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------SELECTION SORT--------------------");
        sorting.SelectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}