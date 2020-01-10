package com.mycompany.ex_13_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex_13_5 {

    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Cats", "dogs", "pets", "parrot", "crocodile"));
        ArrayList<String> newList2 = addStars(list);
        System.out.println(Arrays.toString(newList2.toArray()));
    }

    public static ArrayList<String> addStars(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i += 2) {
            list.add(i + 1, "*");
        }
        return list;
    }
}
