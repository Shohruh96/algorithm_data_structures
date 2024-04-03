package org.example;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {

    public static void bubbleSort(List<Integer> list){
        for (int wall=list.size()-1; wall<list.size(); wall--){
            for (int i = 0; i < wall; i++) {
                if (list.get(i) > list.get(i+1)){
                    if (list.get(i) == list.get(i+1)) return;
                    int n = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, n);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("welcome this my bubble sort algorithm");
        List<Integer> list = new ArrayList<>();
        list.add(24);
        list.add(12);
        list.add(7);
        list.add(15);
        System.out.println("befor sorted: " + list);
        Lesson1.bubbleSort(list);
        System.out.println("after sorted: " + list);

    }
}
